package calculadora_Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int zero,um,dois,tres,quatro,cinco,seis,sete,oito,nove;
	private double result;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		buttons();
		
	}
	public void buttons() {
		zero=0;um=1;dois=2;tres=3;quatro=4;cinco=5;seis=6;sete=7;oito=8;nove=9;
		
		JLabel tela = new JLabel(" ");
		tela.setBounds(261, 11, 163, 38);
		contentPane.add(tela);
		
		JButton sete = new JButton("7");
		sete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+String.valueOf(Interface.this.sete));
			}
		});
		sete.setBounds(10, 129, 56, 23);
		contentPane.add(sete);
		
		JButton oito = new JButton("8");
		oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+String.valueOf(Interface.this.oito));
			}
		});
		oito.setBounds(76, 129, 56, 23);
		contentPane.add(oito);
		
		JButton nove = new JButton("9");
		nove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+String.valueOf(Interface.this.nove));
			}
		});
		nove.setBounds(142, 129, 56, 23);
		contentPane.add(nove);
		
		JButton quatro = new JButton("4");
		quatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+String.valueOf(Interface.this.quatro));
			}
		});
		quatro.setBounds(10, 163, 56, 23);
		contentPane.add(quatro);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+String.valueOf(Interface.this.cinco));
			}
		});
		cinco.setBounds(76, 163, 56, 23);
		contentPane.add(cinco);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+String.valueOf(Interface.this.seis));
			}
		});
		seis.setBounds(142, 163, 56, 23);
		contentPane.add(seis);
		
		JButton um = new JButton("1");
		um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+String.valueOf(Interface.this.um));
			}
		});
		um.setBounds(10, 197, 56,23);
		contentPane.add(um);
		
		JButton dois = new JButton("2");
		dois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+String.valueOf(Interface.this.dois));
			}
		});
		dois.setBounds(76, 197, 56, 23);
		contentPane.add(dois);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+String.valueOf(Interface.this.tres));
			}
		});
		tres.setBounds(142, 197, 56, 23);
		contentPane.add(tres);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+String.valueOf(Interface.this.zero));
			}
		});
		zero.setBounds(76, 231, 56, 23);
		contentPane.add(zero);
		
		JButton mais = new JButton("+");
		mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+" + ");
			}
		});
		mais.setBounds(347, 129, 56, 23);
		contentPane.add(mais);
		
		JButton menos = new JButton("-");
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+" - ");
			}
		});
		menos.setBounds(347, 163, 56, 23);
		contentPane.add(menos);
		
		JButton vezes = new JButton("*");
		vezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+" * ");
			}
		});
		vezes.setBounds(347, 197, 56, 23);
		contentPane.add(vezes);
		
		JButton divisao = new JButton("/");
		divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+" / ");
			}
		});
		divisao.setBounds(261, 129, 56, 23);
		contentPane.add(divisao);
		
		JButton quadrado = new JButton("x²");
		quadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText()+"² ");
			}
		});
		quadrado.setBounds(261, 163, 56, 23);
		contentPane.add(quadrado);
		
		JButton raiz = new JButton("√x");
		raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText("√("+tela.getText()+")");
			}
		});
		raiz.setBounds(261, 197, 56, 23);
		contentPane.add(raiz);
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().contains(" + ")) { // Adição
					String texto = tela.getText().trim();
					int index = texto.indexOf(" + ");
					if (index != -1) {
				        double num1 = Double.parseDouble(texto.substring(0, index).trim());
				        double num2 = Double.parseDouble(texto.substring(index + 3).trim());
				        result = soma(num1, num2);
				        tela.setText(String.valueOf(result));
				    } else {
				        System.out.println("Erro: Operador '+' não encontrado.");
				    }
				}else if(tela.getText().contains(" - ")) { // Subtração
					String texto = tela.getText().trim();
					int index = texto.indexOf(" - ");
					if (index != -1) {
				        double num1 = Double.parseDouble(texto.substring(0, index).trim());
				        double num2 = Double.parseDouble(texto.substring(index + 3).trim());
				        result = menos(num1, num2);
				        tela.setText(String.valueOf(result));
				    } else {
				        System.out.println("Erro: Operador '-' não encontrado.");
				    }
				}else if(tela.getText().contains(" * ")) { // Multiplicação
					String texto = tela.getText().trim();
					int index = texto.indexOf(" * ");
					if (index != -1) {
				        double num1 = Double.parseDouble(texto.substring(0, index).trim());
				        double num2 = Double.parseDouble(texto.substring(index + 3).trim());
				        result = vezes(num1, num2);
				        tela.setText(String.valueOf(result));
				    } else {
				        System.out.println("Erro: Operador '*' não encontrado.");
				    }
				}else if(tela.getText().contains(" / ")) { // Divisão
					String texto = tela.getText().trim();
					int index = texto.indexOf(" / ");
					if (index != -1) {
				        double num1 = Double.parseDouble(texto.substring(0, index).trim());
				        double num2 = Double.parseDouble(texto.substring(index + 3).trim());
				        result = divisao(num1, num2);
				        tela.setText(String.valueOf(result));
				    } else {
				        System.out.println("Erro: Operador '/' não encontrado.");
				    }
				}else if(tela.getText().contains("²")) { // Potência
					String texto = tela.getText().trim();
					int index = texto.indexOf("²");
					if (index != -1) {
				        double num1 = Double.parseDouble(texto.substring(0, index).trim());
				        result = quadrado(num1);
				        tela.setText(String.valueOf(result));
				    } else {
				        System.out.println("Erro: Operador '²' não encontrado.");
				    }
				}else if(tela.getText().contains("√(")) { // Raiz
					String texto = tela.getText().trim();
					int index = texto.indexOf("√(")+2;
					int index1 = texto.indexOf(")");
					if (index != -1 && index1 != -1 && index < index1) {
				        double num1 = Double.parseDouble(texto.substring(index, index1).trim());
				        result = raiz(num1);
				        tela.setText(String.valueOf(result));
				    } else {
				        System.out.println("Erro: Operador '√' não encontrado.");
				    }
				}
				
			}
		});
		igual.setBounds(302, 227, 65, 23);
		contentPane.add(igual);
		
		JButton refresh = new JButton("Resetar");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(" ");
			}
		});
		refresh.setBounds(10, 19, 89, 23);
		contentPane.add(refresh);
	}
	public double soma(double num1, double num2) {double resultado = num1+num2; return resultado;}
	public double menos(double num1, double num2) {double resultado = num1-num2; return resultado;}
	public double vezes(double num1, double num2) {double resultado = num1*num2; return resultado;}
	public double divisao(double num1, double num2) {double resultado = num1/num2 ; return resultado;}
	public double quadrado(double num) {double resultado = Math.pow(num, 2); return resultado;}
	public double raiz(double num) {double resultado = Math.sqrt(num); return resultado;}
}
