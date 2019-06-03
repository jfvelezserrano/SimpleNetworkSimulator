/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Windows;

import app.Elements.HostItem;
import app.Elements.LinkerItem;
import app.Elements.RouterItem;
import app.Elements.SimulatorItem;
import app.Elements.Tupla;
import app.Elements.WorkSpacePanel;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import material.graphs.Edge;
import objects.Host;
import objects.Linker;
import objects.Package;
import simulator.Simulator;
import app.Elements.NodeItem;
import java.awt.Desktop;
import java.net.URI;
import java.util.HashMap;
import objects.Router;

/**
 *
 * @author alber
 */
public class VMain extends javax.swing.JFrame {

    private SimulatorItem si;
    private VConfHost vConfComputer;
    private VConfRouter vConfRouter;
    private VConfLinker vConfLinker;
    private VEnrutamiento vEnrutamiento;
    private String nameFile;
    //private int nComputers = 0;
    //private int nRouters = 0;
    //private int nLinkers = 0;
    private List<Tupla> tuplasPD;
    private HashMap<String, ArrayList<String>> routingTable;
    private boolean anyRandom = false;
    private boolean routing = true;

    /**
     * Creates new form VMain
     */
    public VMain() {
        this.tuplasPD = new ArrayList<>();
        initComponents();
        si = new SimulatorItem();
        Simulator simulator = new Simulator();
        si.setSimulator(simulator);
        si.setWorkSpacePanel(jWorkSpace);
        si.setMenu(jMenuWorkSpace);
        si.setPallette(jAddItems);
        if (si.getWorkSpacePanel().getChildsItems().size() < 2) {
            btnNewLinker.setEnabled(false);
        } else {
            btnNewLinker.setEnabled(false);
        }
        btnStart.setEnabled(false);
        setLocation((getToolkit().getScreenSize().width - this.getWidth()) / 2,
                (getToolkit().getScreenSize().height - this.getHeight()) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMain = new javax.swing.JPanel();
        jScrollPaneWorkSpace = new javax.swing.JScrollPane();
        jWorkSpace = new app.Elements.WorkSpacePanel();
        jMenuWorkSpace = new javax.swing.JToolBar();
        btnNewWorkSpace = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        jAddItems = new javax.swing.JToolBar();
        btnNewComputer = new javax.swing.JButton();
        btnNewLinker = new javax.swing.JButton();
        btnNewRouter = new javax.swing.JButton();
        jtbHelp = new javax.swing.JToolBar();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("app/Windows/Bundle"); // NOI18N
        setTitle(bundle.getString("VMain.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(1276, 792));

        jMain.setMinimumSize(new java.awt.Dimension(1255, 760));
        jMain.setPreferredSize(new java.awt.Dimension(1255, 760));

        jScrollPaneWorkSpace.setAutoscrolls(true);
        jScrollPaneWorkSpace.setMaximumSize(new java.awt.Dimension(1789, 850));

        jWorkSpace.setBackground(new java.awt.Color(255, 255, 255));
        jWorkSpace.setMaximumSize(new java.awt.Dimension(1789, 850));

        javax.swing.GroupLayout jWorkSpaceLayout = new javax.swing.GroupLayout(jWorkSpace);
        jWorkSpace.setLayout(jWorkSpaceLayout);
        jWorkSpaceLayout.setHorizontalGroup(
            jWorkSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1744, Short.MAX_VALUE)
        );
        jWorkSpaceLayout.setVerticalGroup(
            jWorkSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );

        jScrollPaneWorkSpace.setViewportView(jWorkSpace);

        jMenuWorkSpace.setBorder(null);
        jMenuWorkSpace.setFloatable(false);
        jMenuWorkSpace.setRollover(true);
        jMenuWorkSpace.setMargin(new java.awt.Insets(10, 10, 10, 10));

        btnNewWorkSpace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconNew2s.png"))); // NOI18N
        btnNewWorkSpace.setToolTipText(bundle.getString("VMain.btnNewWorkSpace.toolTipText")); // NOI18N
        btnNewWorkSpace.setFocusable(false);
        btnNewWorkSpace.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewWorkSpace.setMargin(new java.awt.Insets(8, 20, 8, 20));
        btnNewWorkSpace.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewWorkSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewWorkSpaceActionPerformed(evt);
            }
        });
        jMenuWorkSpace.add(btnNewWorkSpace);

        btnOpenFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/openIcon2.png"))); // NOI18N
        btnOpenFile.setToolTipText(bundle.getString("VMain.btnOpenFile.toolTipText")); // NOI18N
        btnOpenFile.setFocusable(false);
        btnOpenFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenFile.setMargin(new java.awt.Insets(8, 20, 8, 20));
        btnOpenFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });
        jMenuWorkSpace.add(btnOpenFile);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saveIcon2.png"))); // NOI18N
        btnSave.setToolTipText(bundle.getString("VMain.btnSave.toolTipText")); // NOI18N
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setMargin(new java.awt.Insets(8, 20, 8, 20));
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jMenuWorkSpace.add(btnSave);

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconStart2.png"))); // NOI18N
        btnStart.setToolTipText(bundle.getString("VMain.btnStart.toolTipText")); // NOI18N
        btnStart.setFocusable(false);
        btnStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStart.setMargin(new java.awt.Insets(8, 20, 8, 20));
        btnStart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jMenuWorkSpace.add(btnStart);

        jAddItems.setBorder(null);
        jAddItems.setFloatable(false);
        jAddItems.setRollover(true);

        btnNewComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconNewComputer2.png"))); // NOI18N
        btnNewComputer.setToolTipText(bundle.getString("VMain.btnNewComputer.toolTipText")); // NOI18N
        btnNewComputer.setFocusable(false);
        btnNewComputer.setHideActionText(true);
        btnNewComputer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewComputer.setMargin(new java.awt.Insets(8, 20, 8, 20));
        btnNewComputer.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconNewComputer.png"))); // NOI18N
        btnNewComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewComputerActionPerformed(evt);
            }
        });
        jAddItems.add(btnNewComputer);

        btnNewLinker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newLinkerIcon.png"))); // NOI18N
        btnNewLinker.setToolTipText(bundle.getString("VMain.btnNewLinker.toolTipText")); // NOI18N
        btnNewLinker.setFocusable(false);
        btnNewLinker.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewLinker.setMargin(new java.awt.Insets(8, 20, 8, 20));
        btnNewLinker.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewLinker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLinkerActionPerformed(evt);
            }
        });
        jAddItems.add(btnNewLinker);

        btnNewRouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newRouterIcon2.png"))); // NOI18N
        btnNewRouter.setToolTipText(bundle.getString("VMain.btnNewRouter.toolTipText")); // NOI18N
        btnNewRouter.setFocusable(false);
        btnNewRouter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewRouter.setMargin(new java.awt.Insets(8, 20, 8, 20));
        btnNewRouter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewRouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRouterActionPerformed(evt);
            }
        });
        jAddItems.add(btnNewRouter);

        jtbHelp.setBorder(null);
        jtbHelp.setFloatable(false);
        jtbHelp.setRollover(true);

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/helpIcon.png"))); // NOI18N
        btnHelp.setText(bundle.getString("VMain.btnHelp.text")); // NOI18N
        btnHelp.setToolTipText(bundle.getString("VMain.btnHelp.toolTipText")); // NOI18N
        btnHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHelp.setMargin(new java.awt.Insets(8, 20, 8, 20));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jtbHelp.add(btnHelp);

        javax.swing.GroupLayout jMainLayout = new javax.swing.GroupLayout(jMain);
        jMain.setLayout(jMainLayout);
        jMainLayout.setHorizontalGroup(
            jMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneWorkSpace, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE)
                    .addGroup(jMainLayout.createSequentialGroup()
                        .addComponent(jMenuWorkSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jAddItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtbHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jMainLayout.setVerticalGroup(
            jMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jMenuWorkSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAddItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPaneWorkSpace, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1276, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMain, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewRouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRouterActionPerformed
        this.vConfRouter = new VConfRouter(this);
        this.vConfRouter.setVisible(true);
    }//GEN-LAST:event_btnNewRouterActionPerformed

    private void btnNewComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewComputerActionPerformed
        HostItem ci = new HostItem(si, "");
        this.vConfComputer = new VConfHost(ci, this);
        this.vConfComputer.setVisible(true);
    }//GEN-LAST:event_btnNewComputerActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        this.vEnrutamiento = new VEnrutamiento(this, anyRandom, routing);
        this.vEnrutamiento.setVisible(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnNewLinkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLinkerActionPerformed
        this.vConfLinker = new VConfLinker(this);
        this.vConfLinker.setVisible(true);
    }//GEN-LAST:event_btnNewLinkerActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        JFileChooser jf = new JFileChooser();
        int approve = jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null && approve == JFileChooser.APPROVE_OPTION) {
            jWorkSpace.removeAll();
            jWorkSpace.setChildsItems(new ArrayList<>());
            jWorkSpace.setLinkers(new ArrayList<>());
            nameFile = archivo.getName();
            try {
                //1,2 sin queue
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                int nChilds = Integer.parseInt(br.readLine());
                String prop;
                this.routingTable = new HashMap<>();
                int nHosts = 0;
                int nRouters = 0;
                for (int i = 0; i < nChilds; i++) {
                    line = br.readLine();
                    String tipoItem = line.substring(1, line.length() - 1);
                    tipoItem = tipoItem.trim();
                    prop = br.readLine();
                    int x = Integer.parseInt(prop.substring(0, prop.length() - 1).trim());
                    prop = br.readLine();
                    int y = Integer.parseInt(prop.substring(0, prop.length() - 1).trim());
                    if (tipoItem.equals("ComputerItem")) {
                        String tipoHost = br.readLine();
                        tipoHost = tipoHost.substring(0, tipoHost.length() - 1);
                        if (tipoHost.equals("Computer")) {
                            nHosts++;
                            String name = br.readLine();
                            name = name.substring(0, name.length() - 1).trim();
                            HostItem ci = new HostItem(si, name);
                            //ci.setBounds(x, y, 120, 120);
                            int nPackages = Integer.parseInt(br.readLine());
                            for (int p = 0; p < nPackages; p++) {
                                br.readLine();
                                prop = br.readLine();
                                BigDecimal size = new BigDecimal(prop.substring(0, prop.length() - 1).trim());
                                prop = br.readLine();
                                int id = Integer.parseInt(prop.substring(0, prop.length() - 1).trim());
                                prop = br.readLine();
                                BigDecimal time = new BigDecimal(prop.substring(0, prop.length() - 1).trim());
                                prop = br.readLine();
                                BigDecimal arriveTime = new BigDecimal(prop.substring(0, prop.length() - 1).trim());
                                prop = br.readLine();
                                String tipoDest = prop.substring(0, prop.length() - 1).trim();
                                prop = br.readLine();
                                String nameDest = prop.substring(0, prop.length() - 2).trim();
                                Package pa = new Package(size, id, time, arriveTime);
                                ci.getVertex().getElement().addPackage(pa);
                                this.tuplasPD.add(new Tupla(nameDest, pa));
                            }
                            br.readLine();
                            prop = br.readLine();
                            if (!prop.substring(0, prop.length() - 2).trim().equals("null")) {
                                prop = br.readLine();
                                BigDecimal sizePacakges = new BigDecimal(prop.substring(0, prop.length() - 1).trim());
                                prop = br.readLine();
                                BigDecimal averageTime = new BigDecimal(prop.substring(0, prop.length() - 3).trim());
                                if (ci.getVertex().getElement() instanceof Host) {
                                    Host com = (Host) ci.getVertex().getElement();
                                    com.setRandomSend(sizePacakges, averageTime);
                                    anyRandom = true;
                                }
                            }
                            VMain vMain = this;
                            JPopupMenu popUpMenuHost = new JPopupMenu();
                            JMenuItem miConfigurar = new JMenuItem();
                            miConfigurar.setText("Configurar Host");
                            miConfigurar.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    VConfHost vConfComputer = new VConfHost(ci, vMain);
                                    //vConfComputer.setVisible(true);
                                }
                            });
                            popUpMenuHost.add(miConfigurar);
                            JMenuItem miEliminar = new JMenuItem();
                            miEliminar.setText("Eliminar Host");
                            miEliminar.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    si.getWorkSpacePanel().remove(ci.getLblName());
                                    si.getWorkSpacePanel().remove(ci);
                                    si.getSimulator().getRed().removeHost(ci.getVertex());
                                    si.getWorkSpacePanel().updateUI();
                                    routing = false;
                                    for (LinkerItem li : ci.getLinkers()) {
                                        boolean borrado = si.getWorkSpacePanel().getLinkers().remove(li);
                                        if (borrado) {
                                            si.getWorkSpacePanel().remove(li.getLblName());
                                        }
                                    }
                                    si.getWorkSpacePanel().getChildsItems().remove(ci);
                                    enabledBottons();
                                }
                            });
                            popUpMenuHost.add(miEliminar);
                            ci.setComponentPopupMenu(popUpMenuHost);
                            ci.setBounds(x, y, 120, 120);
                            si.getWorkSpacePanel().add(ci);
                        } else {
                            System.out.println("app.Windows.VMain.btnOpenFileActionPerformed() ERROR COMPUTER");
                        }
                    } else if (tipoItem.equals("RouterItem")) {
                        String tipoHost = br.readLine();
                        tipoHost = tipoHost.substring(0, tipoHost.length() - 1);
                        if (tipoHost.equals("Router")) {
                            nRouters++;
                            String name = br.readLine();
                            name = name.substring(0, name.length() - 1).trim();
                            RouterItem ri = new RouterItem(si, name);
                            //ri.setBounds(x, y, 120, 120);
                            //ROUTING TABLE
                            int nrt = Integer.parseInt(br.readLine().trim());
                            br.readLine();
                            if (nrt > 0) {
                                String nextItem;
                                ArrayList<String> rtElements = new ArrayList<>();
                                for (int rt = 0; rt < nrt * 2; rt++) {
                                    nextItem = br.readLine().split("}")[0];
                                    rtElements.add(nextItem);
                                }
                                this.routingTable.put(name, rtElements);
                            }
                            //prop = br.readLine();
                            int nPackages = Integer.parseInt(br.readLine());
                            for (int p = 0; p < nPackages; p++) {
                                br.readLine();
                                prop = br.readLine();
                                float size = Float.parseFloat(prop.substring(0, prop.length() - 1).trim());
                                prop = br.readLine();
                                int id = Integer.parseInt(prop.substring(0, prop.length() - 1).trim());
                                prop = br.readLine();
                                float time = Float.parseFloat(prop.substring(0, prop.length() - 1).trim());
                                prop = br.readLine();
                                float arriveTime = Float.parseFloat(prop.substring(0, prop.length() - 1).trim());
                                prop = br.readLine();
                                String tipoDest = prop.substring(0, prop.length() - 1).trim();
                                prop = br.readLine();
                                String nameDest = prop.substring(0, prop.length() - 1).trim();
                                //Package package = new Package(size,);
                            }
                            br.readLine();
                            VMain vMain = this;
                            JPopupMenu popUpMenuHost = new JPopupMenu();
                            JMenuItem miConfigurar = new JMenuItem();
                            miConfigurar.setText("Configurar Host");
                            miConfigurar.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    VConfRouter vConfRouter = new VConfRouter(ri, vMain);
                                    vConfRouter.setVisible(true);
                                }
                            });
                            popUpMenuHost.add(miConfigurar);
                            JMenuItem miEliminar = new JMenuItem();
                            miEliminar.setText("Eliminar Host");
                            miEliminar.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    si.getWorkSpacePanel().remove(ri.getLblName());
                                    si.getWorkSpacePanel().remove(ri);
                                    si.getSimulator().getRed().removeHost(ri.getVertex());
                                    si.getWorkSpacePanel().updateUI();
                                    routing = false;
                                    for (LinkerItem li : ri.getLinkers()) {
                                        boolean borrado = si.getWorkSpacePanel().getLinkers().remove(li);
                                        if (borrado) {
                                            si.getWorkSpacePanel().remove(li.getLblName());
                                        }
                                    }
                                    si.getWorkSpacePanel().getChildsItems().remove(ri);
                                    enabledBottons();
                                }
                            });
                            popUpMenuHost.add(miEliminar);
                            ri.setComponentPopupMenu(popUpMenuHost);
                            ri.setBounds(x, y, 120, 120);
                            si.getWorkSpacePanel().add(ri);
                        } else {
                            System.out.println("app.Windows.VMain.btnOpenFileActionPerformed() ERROR ROUTER");
                        }
                    }
                }
                addDestinationsToPackage(tuplasPD);
                String linkers = br.readLine();
                int nLinkers = Integer.parseInt(linkers.substring(2, linkers.length()).trim());
                for (int l = 0; l < nLinkers; l++) {
                    String tipoItem = br.readLine();
                    String linker = br.readLine();
                    prop = br.readLine();
                    String ip = prop.substring(0, prop.length() - 1);
                    prop = br.readLine();
                    BigDecimal speed = new BigDecimal(prop.substring(0, prop.length() - 1));
                    prop = br.readLine();
                    BigDecimal distance = new BigDecimal(prop.substring(0, prop.length() - 2));
                    prop = br.readLine();
                    String h1Name = prop.substring(0, prop.length() - 1);
                    prop = br.readLine();
                    String h2Name = prop.substring(0, prop.length() - 1);
                    NodeItem h1 = this.si.getWorkSpacePanel().findChild(h1Name);
                    NodeItem h2 = this.si.getWorkSpacePanel().findChild(h2Name);
                    LinkerItem li = new LinkerItem(si, h1, h2);
                    Edge<Linker> link = this.si.getSimulator().getRed().connect(h1.getVertex(), h2.getVertex(), ip, speed, distance);
                    li.setLinker(link);
                    li.getLblName().setText(link.getElement().getIp());

                    this.si.getWorkSpacePanel().getLinkers().add(li);
                    h1.getLinkers().add(li);
                    h2.getLinkers().add(li);
                }
                for (String node : this.routingTable.keySet()) {
                    NodeItem ni = this.si.getWorkSpacePanel().findChild(node);
                    if (ni.getVertex().getElement() instanceof Router) {
                        Router r = (Router) ni.getVertex().getElement();
                        ArrayList<String> elements = this.routingTable.get(node);
                        if (elements.size() / 2 != nHosts) {
                            this.routing = false;
                        }
                        for (int e = 0; e < elements.size() / 2; e++) {
                            r.enrutar(this.si.getWorkSpacePanel().findChild(elements.get(e * 2)).getVertex(), this.si.getWorkSpacePanel().findLinker(elements.get(e * 2 + 1)).getLinker());
                        }
                    }
                }
                if (this.routingTable.keySet().size() != nRouters) {
                    this.routing = false;
                }
                enabledBottons();
                //
                //si.getWorkSpacePanel().paint(this.getGraphics());
                si.getWorkSpacePanel().updateUI();
                System.out.println("app.Windows.VMain.btnOpenFileActionPerformed() FINISH");
            } catch (IOException ex) {
                Logger.getLogger(VMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JFileChooser jd = new JFileChooser();
        //jd.showOpenDialog(this);
        //jd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jd.setAcceptAllFileFilterUsed(false);
        jd.setApproveButtonText("Guardar");
        int userSelection = jd.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {

            try {
                FileOutputStream fileOut = new FileOutputStream(jd.getSelectedFile().getAbsolutePath());
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                objectOut.writeObject(si.toString());
                objectOut.close();
                System.out.println("The Object  was succesfully written to a file");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewWorkSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewWorkSpaceActionPerformed
        VMain vMain = new VMain();
        this.setVisible(false);
        vMain.setVisible(true);
    }//GEN-LAST:event_btnNewWorkSpaceActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URI("https://github.com/jfvelezserrano/SimpleNetworkSimulator"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                } else if ("WindowsLookAndFeel".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMain().setVisible(true);
            }
        });
    }

    private void addDestinationsToPackage(List<Tupla> tuplas) {
        for (Tupla t : tuplas) {
            NodeItem hi = this.si.getWorkSpacePanel().findChild(t.getDestHost());
            if (hi != null) {
                t.getP().setDestinationHost(hi.getVertex());
            }
        }
    }

    public void enabledBottons() {
        if (si.getWorkSpacePanel().getChildsItems().size() >= 2) {
            this.getBtnNewLinker().setEnabled(true);
        }
        if (si.getWorkSpacePanel().getChildsItems().size() > 0 && si.getWorkSpacePanel().getLinkers().size() >= si.getWorkSpacePanel().getChildsItems().size() - 1) {
            this.getBtnStart().setEnabled(true);
        } else {
            this.getBtnStart().setEnabled(false);
        }
    }

    public JToolBar getJAddItems() {
        return jAddItems;
    }

    public JToolBar getJMenu() {
        return jMenuWorkSpace;
    }

    public JButton getBtnStart() {
        return btnStart;
    }

    public SimulatorItem getSI() {
        return this.si;
    }

    public JButton getBtnNewLinker() {
        return btnNewLinker;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public boolean isAnyRandom() {
        return anyRandom;
    }

    public void setAnyRandom(boolean anyRandom) {
        this.anyRandom = this.anyRandom || anyRandom;
    }

    public boolean isRouting() {
        return routing;
    }

    public void setRouting(boolean routing) {
        this.routing = routing;
    }

    /*@Override
    public void repaint(){
        jWorkSpace.paint(this.getGraphics());
        super.paint(this.getGraphics());
        
    }
    @Override
    public void paint(Graphics g){
        jWorkSpace.paint(g);   
        super.paint(g);    
    }*/
    @Override
    public void update(Graphics g) {
        super.update(g);
        jWorkSpace.updateUI();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnNewComputer;
    private javax.swing.JButton btnNewLinker;
    private javax.swing.JButton btnNewRouter;
    private javax.swing.JButton btnNewWorkSpace;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStart;
    private javax.swing.JToolBar jAddItems;
    private javax.swing.JPanel jMain;
    private javax.swing.JToolBar jMenuWorkSpace;
    private javax.swing.JScrollPane jScrollPaneWorkSpace;
    private app.Elements.WorkSpacePanel jWorkSpace;
    private javax.swing.JToolBar jtbHelp;
    // End of variables declaration//GEN-END:variables
}
