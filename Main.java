import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Toolkit;
import java.awt.MouseInfo;
import java.util.Random;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

@SuppressWarnings("serial")
public class Main extends JPanel {
  private BufferedImage Background, Determination, Bravery, Justice, Kindness, Patience, Integrity, Perserverance,
      Cheater, Imagechange, Start, Start1, Start2, Head, HandR, HandL, ShoulderR, ShoulderL, nothing, attack0, RedDeath,
      BoneWallOfDeath, SafeZone, BoneWall, attack1, RedDeathSafe, BlasterL, Blaster1L, Blaster2L, Blaster3L, Blaster4L,
      BlasterR, Blaster1R, Blaster2R, Blaster3R, Blaster4R, BlasterBeam, BlasterBeamTrue, BoneWallTrue, BoneSlide,
      HeadImage, HandRImage, HandLImage, ShoulderRImage, ShoulderLImage, IntroEyes, IntroEyesImage, HeadImagePhase2,
      HeadImagePhase3, SSD, SSB, SSJ, SSK, SSPA, SSI, SSP, SSDI, SSBI, SSJI, SSKI, SSPAI, SSII, SSPI, MiddleBoneGap,
      SmallBottomOrTopBoneGap, LargeBottomOrTopBoneGap, HorizontalBoneWallImage, VerticalBoneWallImage,
      HorizontalRedDeathImage, VerticalRedDeathImage, HorizontalRedDeath, VerticalRedDeath, YellowEyes, BlueEyes,
      BlueBlasters, BlueBlasters1, BlueBlasters2, BlueBlasters3, BlueBlasters4, OrangeBlasters, OrangeBlasters1,
      OrangeBlasters2, OrangeBlasters3, OrangeBlasters4, BlueDeath, OrangeDeath, BlueDeathImage, OrangeDeathImage,
      RedDeathSlide, RedDeathSlideImage, RedDeathGap, RedDeathGapImage, Bulletshot, BulletImage, DHPI, BHPI, JHPI, KHPI,
      PAHPI, IHPI, PHPI, HeadImagePhase3Flashing, FinalAttack, BlasterDeathFunny, CheaterPolice, CheaterPoliceImage,
      CheaterPoliceImage2, GameOverScreenImage, GameOverOrWonScreen, WonImage;
  public static int skillissue = 0;
  public volatile int hpscore = 1000;
  public static int dogx = 1200;
  public static int score = 0;
  public volatile int stopanimation = 0;
  public static String cheatcode = "";
  public static int soul = 1;
  public volatile int int_random = 69;
  public volatile int ClicksPerSecond = 0;
  public static double mouseX = 0;
  public volatile int BoneZoneNumber = 4;
  public static double mouseY = 0;
  public volatile int BossHP = 500;
  public static int randomX, randomY = 0;
  public static int damagetype = 0;
  public volatile int Bullets = 0;
  public volatile int BulletsCD = 0;
  public static int game = 0;
  public volatile int AutoDodgeCD = 0;
  public volatile int immunity = 0;
  public volatile int antidamage = 1;
  public static int cursorflash = 0;
  public volatile int attackloop = 0;
  public volatile int AutoDodge = 0;
  public volatile int BulletY, BulletX = 0;
  public static int BoneGapY = -34;
  public static int BoneGapY2 = 800;
  public volatile int BoneSpeed = 6;
  public volatile int BoneGapNumber = 3;
  public volatile int upperboundchoice = 2;
  public volatile int[] blueororange = new int[5];
  public volatile int NOA = 3;
  public volatile int BlasterShootSpeed = 600;
  public volatile int AutoDodgeImmunity = 0;
  public volatile int ia = 0;
  // head is 144 x 129 so place it at 528
  // Shoulder is 176 x 124 and 8 pixel gap between head and shoulder 19 y gap
  // hand is 160 x 281 gap x is 29 gap y is -16/108
  public static int headY = 100;
  public static int shoulderY = 119;
  public static int handY = 227;
  public volatile int BoneSurroundRDSpeed = 1800;
  public volatile int debugphase = 0;
  public volatile int playerHP = 8;
  public volatile int playerDamage = 1;
  public volatile int playerBullets = 0;
  public volatile int playerShield = 0;
  public volatile int iframe = 4;
  public static int antidetection = 0;
  public volatile int detection = 0;
  public static int BeamYPosition = 0;
  public static int BlasterPositionRY, BlasterPositionLY = 0;
  public static int BoneSlideY1 = 0;
  public static int BoneSlideY2 = 0;
  public volatile int bonegapspeed = 5;
  public volatile int orangeattack, blueattack = 0;
  public volatile int HBWPX, VBWPY = 0;// Horizontal Bone Wall Position X & Vertical Bone Wall Position Y
  public volatile int RedDeathSpeed = 2000;
  JButton b = new JButton();
  JLabel safezone = new JLabel();
  JLabel BlasterBeamShoot = new JLabel();
  JLabel TopBoneWall = new JLabel();
  JLabel BottomBoneWall = new JLabel();
  JLabel BoneSlide1 = new JLabel();
  JLabel BoneSlide2 = new JLabel();
  JLabel BoneSlide3 = new JLabel();
  JLabel BoneSlide4 = new JLabel();
  JLabel BoneSlide5 = new JLabel();
  JLabel BoneSlide6 = new JLabel();
  JLabel BoneSlide7 = new JLabel();
  JLabel BoneSlide8 = new JLabel();
  JLabel BoneSlide9 = new JLabel();
  JLabel BoneSlide10 = new JLabel();
  JLabel BoneSlide11 = new JLabel();
  JLabel BoneSlide12 = new JLabel();
  JLabel MiddleBoneTop = new JLabel();
  JLabel MiddleBoneBottom = new JLabel();
  JLabel LargeTopBone = new JLabel();
  JLabel LargeBottomBone = new JLabel();
  JLabel SmallTopBone = new JLabel();
  JLabel SmallBottomBone = new JLabel();
  JLabel MiddleBoneTop2 = new JLabel();
  JLabel MiddleBoneBottom2 = new JLabel();
  JLabel LargeTopBone2 = new JLabel();
  JLabel LargeBottomBone2 = new JLabel();
  JLabel SmallTopBone2 = new JLabel();
  JLabel SmallBottomBone2 = new JLabel();
  JLabel HorizontalBoneWall = new JLabel();
  JLabel VerticalBoneWall = new JLabel();
  JLabel IndicatorDeterminationHP = new JLabel();
  JLabel IndicatorBraveryHP = new JLabel();
  JLabel IndicatorJusticeHP = new JLabel();
  JLabel IndicatorKindnessHP = new JLabel();
  JLabel IndicatorPatienceHP = new JLabel();
  JLabel IndicatorIntegrityHP = new JLabel();
  JLabel IndicatorPerserveranceHP = new JLabel();
  JLabel totalscore = new JLabel("Score: " + score);
  JLabel Tutorial = new JLabel("Press 1-7 to select a soul.");
  JLabel Tutorial2 = new JLabel(
      "Tips: Don't move to avoid blue attacks & Move to avoid orange attacks. Press Space to use abilities. Left-click the enemy's head to deal damage.");

  private void game_play() {
    try {
      WonImage = ImageIO.read(new File("WinScreen.png"));
      GameOverScreenImage = ImageIO.read(new File("GameOver.png"));
      CheaterPoliceImage2 = ImageIO.read(new File("CheaterPolice2.png"));
      CheaterPoliceImage = ImageIO.read(new File("CheaterPolice.png"));
      BlasterDeathFunny = ImageIO.read(new File("BlasterDeath.png"));
      HeadImagePhase3Flashing = ImageIO.read(new File("Phase3Flashing.png"));
      DHPI = ImageIO.read(new File("DeterminationSoulHP.png"));
      BHPI = ImageIO.read(new File("BraverySoulHP.png"));
      JHPI = ImageIO.read(new File("JusticeSoulHP.png"));
      KHPI = ImageIO.read(new File("KindnessSoulHP.png"));
      PAHPI = ImageIO.read(new File("PatienceSoulHP.png"));
      IHPI = ImageIO.read(new File("IntegritySoulHP.png"));
      PHPI = ImageIO.read(new File("PerserveranceSoulHP.png"));
      BulletImage = ImageIO.read(new File("JusticeBullet.png"));
      RedDeathSlideImage = ImageIO.read(new File("RedDeathSlide.png"));
      RedDeathGapImage = ImageIO.read(new File("RedDeathGap.png"));
      BlueDeathImage = ImageIO.read(new File("BlueDeath.png"));
      OrangeDeathImage = ImageIO.read(new File("OrangeDeath.png"));
      BlueBlasters1 = ImageIO.read(new File("BlueBlasters1.png"));
      BlueBlasters2 = ImageIO.read(new File("BlueBlasters2.png"));
      BlueBlasters3 = ImageIO.read(new File("BlueBlasters3.png"));
      BlueBlasters4 = ImageIO.read(new File("BlueBlasters4.png"));
      OrangeBlasters1 = ImageIO.read(new File("OrangeBlasters1.png"));
      OrangeBlasters2 = ImageIO.read(new File("OrangeBlasters2.png"));
      OrangeBlasters3 = ImageIO.read(new File("OrangeBlasters3.png"));
      OrangeBlasters4 = ImageIO.read(new File("OrangeBlasters4.png"));
      YellowEyes = ImageIO.read(new File("YellowEyesOnly.png"));
      BlueEyes = ImageIO.read(new File("BlueEyesOnly.png"));
      VerticalRedDeathImage = ImageIO.read(new File("RedDeathVertical.png"));
      HorizontalRedDeathImage = ImageIO.read(new File("RedDeathHorizontal.png"));
      VerticalBoneWallImage = ImageIO.read(new File("BoneWallVertical.png"));
      HorizontalBoneWallImage = ImageIO.read(new File("BoneWallHorizontal.png"));
      LargeBottomOrTopBoneGap = ImageIO.read(new File("LargeBottomOrTopBone.png"));
      SmallBottomOrTopBoneGap = ImageIO.read(new File("SmallBottomOrTopBone.png"));
      MiddleBoneGap = ImageIO.read(new File("MiddleBone.png"));
      HeadImagePhase2 = ImageIO.read(new File("UltraHeadPhase2.png"));
      HeadImagePhase3 = ImageIO.read(new File("UltraHeadPhase3.png"));
      SSDI = ImageIO.read(new File("DeterminationSoul.png"));
      SSBI = ImageIO.read(new File("BraverySoul.png"));
      SSJI = ImageIO.read(new File("JusticeSoul.png"));
      SSKI = ImageIO.read(new File("KindnessSoul.png"));
      SSPAI = ImageIO.read(new File("PatienceSoul.png"));
      SSII = ImageIO.read(new File("IntegritySoul.png"));
      SSPI = ImageIO.read(new File("PerserveranceSoul.png"));
      BoneSlide = ImageIO.read(new File("ThickLongestHorizontalBone.png"));
      BlasterBeam = ImageIO.read(new File("BlasterBeam.png"));
      Blaster1L = ImageIO.read(new File("BigBlaster1L.png"));
      Blaster2L = ImageIO.read(new File("BigBlaster2L.png"));
      Blaster3L = ImageIO.read(new File("BigBlaster3L.png"));
      Blaster4L = ImageIO.read(new File("BigBlaster4L.png"));
      Blaster1R = ImageIO.read(new File("BigBlaster1R.png"));
      Blaster2R = ImageIO.read(new File("BigBlaster2R.png"));
      Blaster3R = ImageIO.read(new File("BigBlaster3R.png"));
      Blaster4R = ImageIO.read(new File("BigBlaster4R.png"));
      IntroEyesImage = ImageIO.read(new File("UltraEyes.png"));
      RedDeathSafe = ImageIO.read(new File("RedDeathSafe.png"));
      BoneWall = ImageIO.read(new File("BoneWall.png"));
      Imagechange = ImageIO.read(new File("Determinationtext.png"));
      RedDeath = ImageIO.read(new File("RedDeath.png"));
      BoneWallOfDeath = ImageIO.read(new File("BoneWallOfDeath.png"));
      SafeZone = ImageIO.read(new File("SafeZone.png"));
      Start2 = ImageIO.read(new File("Start2.png"));
      Start1 = ImageIO.read(new File("Start1.png"));
      HeadImage = ImageIO.read(new File("UltraHead.png"));
      HandRImage = ImageIO.read(new File("UltraHandRight.png"));
      HandLImage = ImageIO.read(new File("UltraHandLeft.png"));
      ShoulderRImage = ImageIO.read(new File("UltraShoulderRight.png"));
      ShoulderLImage = ImageIO.read(new File("UltraShoulderLeft.png"));
      Background = ImageIO.read(new File("Background.jpg"));
      Determination = ImageIO.read(new File("Determinationtext.png"));
      Bravery = ImageIO.read(new File("Braverytext.png"));
      Justice = ImageIO.read(new File("Justicetext.png"));
      Kindness = ImageIO.read(new File("Kindnesstext.png"));
      Patience = ImageIO.read(new File("Patiencetext.png"));
      Integrity = ImageIO.read(new File("Integritytext.png"));
      Perserverance = ImageIO.read(new File("Perserverancetext.png"));
      Cheater = ImageIO.read(new File("Cheatertext.png"));
      if (game == 0) {
        Start = Start1;
      }
    } catch (IOException ex) {
    }
  }

  private void custom_cursor() {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Image img = toolkit.getImage("Determination.png");
    Image Determination = toolkit.getImage("DeterminationSoul.png");
    Image Bravery = toolkit.getImage("BraverySoul.png");
    Image Justice = toolkit.getImage("FlippedJusticeSoul.png");
    Image Kindness = toolkit.getImage("KindnessSoul.png");
    Image Patience = toolkit.getImage("PatienceSoul.png");
    Image Integrity = toolkit.getImage("IntegritySoul.png");
    Image Perserverance = toolkit.getImage("PerserveranceSoul.png");
    Image Cheater = toolkit.getImage("CheaterSoul.png");
    Image AutoDodgeIntegrity = toolkit.getImage("IntegrityDodgeSoul.png");
    if (AutoDodge == 2) {
      img = AutoDodgeIntegrity;
    }
    Image nothing = toolkit.getImage("");
    Point point = new Point(11, 11);
    if (cursorflash == 0) {
      if (soul == 1) {
        img = Determination;
      }
      if (soul == 2) {
        img = Bravery;
      }
      if (soul == 3) {
        img = Justice;
      }
      if (soul == 4) {
        img = Kindness;
      }
      if (soul == 5) {
        img = Patience;
      }
      if (soul == 6) {
        if (game == 1) {
          if (AutoDodge == 1) {
            img = Integrity;
          }
        } else {
          img = Integrity;
        }
      }
      if (soul == 7) {
        img = Perserverance;
      }
      if (soul == 8) {
        img = Cheater;
      }
    }
    if (cursorflash == 1 && AutoDodge == 0) {
      img = nothing;
    }
    Cursor cursor = toolkit.createCustomCursor(img, point, "Cursor");
    setCursor(cursor);
  }

  public Main() {
    addKeyListener(new MyKeyListener());
    addMouseListener(new CustomMouseListener());
    addMouseMotionListener(new MyMouseMotionListener());
    setFocusable(true);
    this.setLayout(null);
  }

  public void button() {
    b.setLayout(null);
    b.setBounds(0, 0, 400, 100);
    b.setBorder(BorderFactory.createEmptyBorder());
    b.setContentAreaFilled(false);
    b.addMouseListener(new CustomMouseListener());
    b.addActionListener(new MyActionListener());
    b.setVisible(true);
    add(b);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);// you should always call the super-method first
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, 1200, 800);
    g.setColor(Color.RED);
    g.drawImage(GameOverOrWonScreen, 0, 0, this);
    g.fillRect(0, 0, (int) (BossHP * 2.4), 20);
    g.drawImage(HandL, 331, handY, this);
    g.drawImage(HandR, 709, handY, this);
    g.drawImage(ShoulderL, 360, shoulderY, this);
    g.drawImage(ShoulderR, 664, shoulderY, this);
    g.drawImage(Head, 528, headY, this);
    g.drawImage(IntroEyes, 562, 161, this);
    g.drawImage(SSD, 590, 185, this);
    g.drawImage(SSB, 478, 105, this);
    g.drawImage(SSJ, 690, 105, this);
    g.drawImage(SSK, 448, 155, this);
    g.drawImage(SSPA, 720, 155, this);
    g.drawImage(SSI, 478, 205, this);
    g.drawImage(SSP, 690, 205, this);
    g.drawImage(attack0, 0, 0, this);
    g.drawImage(attack1, 0, 0, this);
    g.drawImage(BoneWallTrue, 0, 0, this);
    g.drawImage(BoneWallTrue, 0, 460, this);
    g.drawImage(BlasterBeamTrue, 0, BeamYPosition, this);
    g.drawImage(BlasterL, 1082, BlasterPositionLY, this);
    g.drawImage(BlasterR, 0, BlasterPositionRY, this);
    g.drawImage(RedDeathSlide, 0, 0, this);
    g.drawImage(RedDeathGap, 0, 0, this);
    g.drawImage(VerticalRedDeath, 0, VBWPY, this);
    g.drawImage(HorizontalRedDeath, HBWPX, 0, this);
    g.drawImage(BlueDeath, 0, 0, this);
    g.drawImage(OrangeDeath, 0, 0, this);
    g.drawImage(BlueBlasters, 0, 0, this);
    g.drawImage(OrangeBlasters, 0, 0, this);
    g.drawImage(FinalAttack, 0, 0, this);
    g.drawImage(Bulletshot, BulletX, BulletY, this);
    g.drawImage(CheaterPolice, dogx, 70, this);
    g.drawImage(Background, 0, 0, this);
    g.drawImage(Start, 0, 0, this);
    g.drawImage(Imagechange, 794, 100, this);
    g.setColor(Color.WHITE);
    g.drawRect(0, 0, 1199, 778);
  }

  public void attack0() {
    safezone.setIcon(new ImageIcon(SafeZone));
    safezone.setVisible(false);
    safezone.setBounds(randomX, randomY, 100, 100);
    safezone.addMouseListener(new CustomMouseListener());
    add(safezone);
  }

  public void attack1() {
    TopBoneWall.setVisible(false);
    TopBoneWall.setBounds(0, 0, 1200, 340);
    TopBoneWall.addMouseListener(new CustomMouseListener());
    BottomBoneWall.setVisible(false);
    BottomBoneWall.setBounds(0, 460, 1200, 340);
    BottomBoneWall.addMouseListener(new CustomMouseListener());
    BlasterBeamShoot.setVisible(false);
    BlasterBeamShoot.setBounds(0, 0, 1200, 60);
    BlasterBeamShoot.addMouseListener(new CustomMouseListener());
    add(TopBoneWall);
    add(BottomBoneWall);
    add(BlasterBeamShoot);
  }

  public void attack2() {
    BoneSlide1.setIcon(new ImageIcon(BoneSlide));
    BoneSlide2.setIcon(new ImageIcon(BoneSlide));
    BoneSlide3.setIcon(new ImageIcon(BoneSlide));
    BoneSlide4.setIcon(new ImageIcon(BoneSlide));
    BoneSlide5.setIcon(new ImageIcon(BoneSlide));
    BoneSlide6.setIcon(new ImageIcon(BoneSlide));
    BoneSlide7.setIcon(new ImageIcon(BoneSlide));
    BoneSlide8.setIcon(new ImageIcon(BoneSlide));
    BoneSlide9.setIcon(new ImageIcon(BoneSlide));
    BoneSlide10.setIcon(new ImageIcon(BoneSlide));
    BoneSlide11.setIcon(new ImageIcon(BoneSlide));
    BoneSlide12.setIcon(new ImageIcon(BoneSlide));
    BoneSlide1.setVisible(false);
    BoneSlide2.setVisible(false);
    BoneSlide3.setVisible(false);
    BoneSlide4.setVisible(false);
    BoneSlide5.setVisible(false);
    BoneSlide6.setVisible(false);
    BoneSlide7.setVisible(false);
    BoneSlide8.setVisible(false);
    BoneSlide9.setVisible(false);
    BoneSlide10.setVisible(false);
    BoneSlide11.setVisible(false);
    BoneSlide12.setVisible(false);
    BoneSlide1.setBounds(0, 0, 600, 34);
    BoneSlide2.setBounds(0, 0, 600, 34);
    BoneSlide3.setBounds(0, 0, 600, 34);
    BoneSlide4.setBounds(0, 0, 600, 34);
    BoneSlide5.setBounds(0, 0, 600, 34);
    BoneSlide6.setBounds(0, 0, 600, 34);
    BoneSlide7.setBounds(0, 0, 600, 34);
    BoneSlide8.setBounds(0, 0, 600, 34);
    BoneSlide9.setBounds(0, 0, 600, 34);
    BoneSlide10.setBounds(0, 0, 600, 34);
    BoneSlide11.setBounds(0, 0, 600, 34);
    BoneSlide12.setBounds(0, 0, 600, 34);
    BoneSlide1.addMouseListener(new CustomMouseListener());
    BoneSlide2.addMouseListener(new CustomMouseListener());
    BoneSlide3.addMouseListener(new CustomMouseListener());
    BoneSlide4.addMouseListener(new CustomMouseListener());
    BoneSlide5.addMouseListener(new CustomMouseListener());
    BoneSlide6.addMouseListener(new CustomMouseListener());
    BoneSlide7.addMouseListener(new CustomMouseListener());
    BoneSlide8.addMouseListener(new CustomMouseListener());
    BoneSlide9.addMouseListener(new CustomMouseListener());
    BoneSlide10.addMouseListener(new CustomMouseListener());
    BoneSlide11.addMouseListener(new CustomMouseListener());
    BoneSlide12.addMouseListener(new CustomMouseListener());
    add(BoneSlide1);
    add(BoneSlide2);
    add(BoneSlide3);
    add(BoneSlide4);
    add(BoneSlide5);
    add(BoneSlide6);
    add(BoneSlide7);
    add(BoneSlide8);
    add(BoneSlide9);
    add(BoneSlide10);
    add(BoneSlide11);
    add(BoneSlide12);
  }

  public void attack3() {
    MiddleBoneTop.setIcon(new ImageIcon(MiddleBoneGap));
    MiddleBoneBottom.setIcon(new ImageIcon(MiddleBoneGap));
    LargeTopBone.setIcon(new ImageIcon(LargeBottomOrTopBoneGap));
    LargeBottomBone.setIcon(new ImageIcon(LargeBottomOrTopBoneGap));
    SmallTopBone.setIcon(new ImageIcon(SmallBottomOrTopBoneGap));
    SmallBottomBone.setIcon(new ImageIcon(SmallBottomOrTopBoneGap));
    MiddleBoneTop2.setIcon(new ImageIcon(MiddleBoneGap));
    MiddleBoneBottom2.setIcon(new ImageIcon(MiddleBoneGap));
    LargeTopBone2.setIcon(new ImageIcon(LargeBottomOrTopBoneGap));
    LargeBottomBone2.setIcon(new ImageIcon(LargeBottomOrTopBoneGap));
    SmallTopBone2.setIcon(new ImageIcon(SmallBottomOrTopBoneGap));
    SmallBottomBone2.setIcon(new ImageIcon(SmallBottomOrTopBoneGap));
    MiddleBoneTop.setVisible(false);
    MiddleBoneBottom.setVisible(false);
    LargeTopBone.setVisible(false);
    LargeBottomBone.setVisible(false);
    SmallTopBone.setVisible(false);
    SmallBottomBone.setVisible(false);
    MiddleBoneTop2.setVisible(false);
    MiddleBoneBottom2.setVisible(false);
    LargeTopBone2.setVisible(false);
    LargeBottomBone2.setVisible(false);
    SmallTopBone2.setVisible(false);
    SmallBottomBone2.setVisible(false);
    MiddleBoneTop.setBounds(0, 0, 580, 34);
    MiddleBoneBottom.setBounds(0, 0, 580, 34);
    LargeTopBone.setBounds(0, 0, 1080, 34);
    LargeBottomBone.setBounds(0, 0, 1080, 34);
    SmallTopBone.setBounds(0, 0, 80, 34);
    SmallBottomBone.setBounds(0, 0, 80, 34);
    MiddleBoneTop2.setBounds(0, 0, 580, 34);
    MiddleBoneBottom2.setBounds(0, 0, 580, 34);
    LargeTopBone2.setBounds(0, 0, 1080, 34);
    LargeBottomBone2.setBounds(0, 0, 1080, 34);
    SmallTopBone2.setBounds(0, 0, 80, 34);
    SmallBottomBone2.setBounds(0, 0, 80, 34);
    MiddleBoneTop.addMouseListener(new CustomMouseListener());
    MiddleBoneBottom.addMouseListener(new CustomMouseListener());
    LargeTopBone.addMouseListener(new CustomMouseListener());
    LargeBottomBone.addMouseListener(new CustomMouseListener());
    SmallTopBone.addMouseListener(new CustomMouseListener());
    SmallBottomBone.addMouseListener(new CustomMouseListener());
    MiddleBoneTop2.addMouseListener(new CustomMouseListener());
    MiddleBoneBottom2.addMouseListener(new CustomMouseListener());
    LargeTopBone2.addMouseListener(new CustomMouseListener());
    LargeBottomBone2.addMouseListener(new CustomMouseListener());
    SmallTopBone2.addMouseListener(new CustomMouseListener());
    SmallBottomBone2.addMouseListener(new CustomMouseListener());
    add(MiddleBoneTop);
    add(MiddleBoneBottom);
    add(LargeTopBone);
    add(LargeBottomBone);
    add(SmallTopBone);
    add(SmallBottomBone);
    add(MiddleBoneTop2);
    add(MiddleBoneBottom2);
    add(LargeTopBone2);
    add(LargeBottomBone2);
    add(SmallTopBone2);
    add(SmallBottomBone2);
  }

  public void attack4() {
    VerticalBoneWall.setIcon(new ImageIcon(VerticalBoneWallImage));
    HorizontalBoneWall.setIcon(new ImageIcon(HorizontalBoneWallImage));
    VerticalBoneWall.setVisible(false);
    HorizontalBoneWall.setVisible(false);
    VerticalBoneWall.setBounds(0, 0, 1200, 600);
    HorizontalBoneWall.setBounds(0, 0, 1000, 800);
    VerticalBoneWall.addMouseListener(new CustomMouseListener());
    HorizontalBoneWall.addMouseListener(new CustomMouseListener());
    add(VerticalBoneWall);
    add(HorizontalBoneWall);
  }

  public void HPIndicator() {
    IndicatorDeterminationHP.setIcon(new ImageIcon(DHPI));
    IndicatorBraveryHP.setIcon(new ImageIcon(BHPI));
    IndicatorJusticeHP.setIcon(new ImageIcon(JHPI));
    IndicatorKindnessHP.setIcon(new ImageIcon(KHPI));
    IndicatorPatienceHP.setIcon(new ImageIcon(PAHPI));
    IndicatorIntegrityHP.setIcon(new ImageIcon(IHPI));
    IndicatorPerserveranceHP.setIcon(new ImageIcon(PHPI));
    IndicatorDeterminationHP.setVisible(false);
    IndicatorBraveryHP.setVisible(false);
    IndicatorJusticeHP.setVisible(false);
    IndicatorKindnessHP.setVisible(false);
    IndicatorPatienceHP.setVisible(false);
    IndicatorIntegrityHP.setVisible(false);
    IndicatorPerserveranceHP.setVisible(false);
    IndicatorDeterminationHP.setBounds(0, 710, 500, 50);
    IndicatorBraveryHP.setBounds(0, 710, 280, 50);
    IndicatorJusticeHP.setBounds(0, 710, 280, 50);
    IndicatorKindnessHP.setBounds(0, 710, 280, 50);
    IndicatorPatienceHP.setBounds(0, 710, 280, 50);
    IndicatorIntegrityHP.setBounds(0, 710, 280, 50);
    IndicatorPerserveranceHP.setBounds(0, 710, 280, 50);
    add(IndicatorDeterminationHP);
    add(IndicatorBraveryHP);
    add(IndicatorJusticeHP);
    add(IndicatorKindnessHP);
    add(IndicatorPatienceHP);
    add(IndicatorIntegrityHP);
    add(IndicatorPerserveranceHP);
  }

  public void scoreandtext() {

    totalscore.setForeground(Color.WHITE);
    totalscore.setFont(new Font("Serif", Font.PLAIN, 40));
    totalscore.setVisible(false);
    totalscore.setBounds(0, 710, 400, 100);
    Tutorial.setForeground(Color.WHITE);
    Tutorial.setFont(new Font("Serif", Font.PLAIN, 20));
    Tutorial.setVisible(true);
    Tutorial.setBounds(802, 10, 300, 100);
    Tutorial2.setForeground(Color.BLACK);
    Tutorial2.setFont(new Font("Serif", Font.PLAIN, 15));
    Tutorial2.setVisible(true);
    Tutorial2.setBounds(10, 710, 1200, 100);
    add(Tutorial);
    add(Tutorial2);
    add(totalscore);
  }

  public void frame() throws InterruptedException {
    Main keyboardExample = new Main();
    JFrame frame = new JFrame("How To Destroy Your Mouse");
    frame.setSize(1200, 800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(keyboardExample);
    keyboardExample.game_play();
    keyboardExample.button();
    keyboardExample.attack0();
    keyboardExample.attack1();
    keyboardExample.attack2();
    keyboardExample.attack3();
    keyboardExample.attack4();
    keyboardExample.HPIndicator();
    keyboardExample.scoreandtext();
    while (true) {
      keyboardExample.repaint();
      keyboardExample.custom_cursor();
      Thread.sleep(16);
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Main finale = new Main();
    finale.frame();
    new Main();
  }

  public class MyKeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
      if (game == 0) {
        if (skillissue != 1) {
          if (e.getKeyCode() == KeyEvent.VK_1) {
            Imagechange = Determination;
            soul = 1;
          }
          if (e.getKeyCode() == KeyEvent.VK_2) {
            Imagechange = Bravery;
            soul = 2;
          }
          if (e.getKeyCode() == KeyEvent.VK_3) {
            Imagechange = Justice;
            soul = 3;
          }
          if (e.getKeyCode() == KeyEvent.VK_4) {
            Imagechange = Kindness;
            soul = 4;
          }
          if (e.getKeyCode() == KeyEvent.VK_5) {
            Imagechange = Patience;
            soul = 5;
          }
          if (e.getKeyCode() == KeyEvent.VK_6) {
            Imagechange = Integrity;
            soul = 6;
          }
          if (e.getKeyCode() == KeyEvent.VK_7) {
            Imagechange = Perserverance;
            soul = 7;
          }
        }
        if (!cheatcode.equals("BIGSKILLISSUE")) {
          if (e.getKeyCode() == KeyEvent.VK_B) {
            cheatcode = "";
          }
          cheatcode = cheatcode + KeyEvent.getKeyText(e.getKeyCode());
          System.out.println(cheatcode);
        }
        if (cheatcode.equals("BIGSKILLISSUE")) {
          skillissue = 1;
          Imagechange = Cheater;
          soul = 8;
        }
        repaint();
      }
      if (game == 1) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
          if (playerShield == 1) {
            if (AutoDodgeCD == 0) {
              AutoDodge = 2;
            }
          }
          if (playerBullets == 1) {
            if (BulletsCD == 0) {
              Shoot.interrupt();
              Bullets = 2;
            }
          }
        }
      }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
  }

  public class CustomMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
      if (e.getButton() == MouseEvent.BUTTON1) {
        if (game == 1) {
          ClicksPerSecond = ClicksPerSecond + 1;
          System.out.println(ClicksPerSecond);
          if (mouseX >= 528 && mouseX <= 668 && mouseY >= headY && mouseY <= (headY + 150)) {
            BossHP = BossHP - playerDamage;
          }
        }
      }
    }

    @Override

    public void mouseEntered(MouseEvent e) {

      Object source = e.getSource();
      if (game == 0) {
        Start = Start1;
      }
      if (source instanceof JButton) {
        Start = Start2;
        if (game == 1) {
          Start = nothing;
        }
        repaint();
      }
      if (source instanceof JLabel) {
        if (damagetype == 0) {
          detection = 1;
        }
        if (damagetype == 1) {
          antidetection = 1;
        }
      }
    }

    @Override
    public void mouseExited(MouseEvent e) {
      Object source = e.getSource();
      if (source instanceof JLabel) {
        antidetection = 0;
        detection = 0;
      }
      // Mouse is not over component
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

  }

  public class MyMouseMotionListener implements MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      if (orangeattack == 1) {
        Move.interrupt();
      }
      if (blueattack == 1 && soul != 8) {
        detection = 1;
      }
    }
  }

  public class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      IntroNow.start();
    }
  }

  public class SkeletonManAnimation extends Thread {
    @Override
    public void run() {
      for (int i = 0; i < 5;) {
        if (game == 1 || game == 69) {
          try {
            for (int monke = 0; monke < 6; monke++) {
              Thread.sleep(50);
              headY = headY - 2;
              Thread.sleep(50);
              shoulderY = shoulderY - 2;
              Thread.sleep(50);
              handY = handY - 2;
            }
            for (int ian = 0; ian < 6; ian++) {
              Thread.sleep(50);
              headY = headY + 2;
              Thread.sleep(50);
              shoulderY = shoulderY + 2;
              Thread.sleep(50);
              handY = handY + 2;
            }
          } catch (InterruptedException ex) {
          }
        } else {
		try {

		Thread.sleep(50);}
		catch (InterruptedException e) {
    e.printStackTrace(); // or just break the loop
}
	}
      }
    }
  }

  public class RobotAndMouseLocation extends Thread {
    @Override
    public void run() {
      for (int mouselocation = 0; mouselocation < 5;) {
        try {
          mouseX = MouseInfo.getPointerInfo().getLocation().getX();
          mouseY = MouseInfo.getPointerInfo().getLocation().getY();
          Robot r = new Robot();
          r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
          r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        } catch (Exception e) {
        }
	try{
	Thread.sleep(10);
	}
	catch (InterruptedException e) {
    e.printStackTrace(); // or just break the loop
}
      }
    }
  }

  public class SkeletonManAttacks extends Thread {
    @Override
    public void run() {
      for (attackloop = 0; attackloop < 5; attackloop = attackloop) {
        try {
          Random rand = new Random();
          int upperbound = 6;
          int_random = rand.nextInt(upperbound);
          System.out.println("Random integer value from 0 to" + (upperbound - 1) + " : " + int_random);
          if (game == 1) {
            if (int_random == 0) {
              int upperboundpositionX = 1100;
              int upperboundpositionY = 700;
              randomX = rand.nextInt(upperboundpositionX);
              randomY = rand.nextInt(upperboundpositionY);
              safezone.setLocation(randomX, randomY);
              attack0 = RedDeath;
              damagetype = 1;
              safezone.setVisible(true);
              Thread.sleep(BoneSurroundRDSpeed);
              antidamage = 0;
              attack0 = BoneWallOfDeath;
              Thread.sleep(3000);
              antidamage = 1;
              safezone.setVisible(false);
              damagetype = 0;
              attack0 = nothing;
            }
            if (int_random == 1) {
              attack1 = RedDeathSafe;
              Thread.sleep(RedDeathSpeed);
              attack1 = nothing;
              BoneWallTrue = BoneWall;
              TopBoneWall.setVisible(true);
              BottomBoneWall.setVisible(true);
              for (int suffer = 0; suffer < 5; suffer++) {
                int BlasterUpperBound = 2;
                int RandomBlasterPosition = rand.nextInt(BlasterUpperBound);
                if (RandomBlasterPosition == 0) {
                  BlasterPositionRY = 318;
                  BlasterPositionLY = 318;
                  BlasterL = Blaster1L;
                  BlasterR = Blaster1R;
                  Thread.sleep(BlasterShootSpeed);
                  BlasterL = Blaster2L;
                  BlasterR = Blaster2R;
                  Thread.sleep(100);
                  BlasterL = Blaster3L;
                  BlasterR = Blaster3R;
                  Thread.sleep(100);
                  BlasterL = Blaster4L;
                  BlasterR = Blaster4R;
                  BeamYPosition = 340;
                  BlasterBeamShoot.setLocation(0, 340);
                  BlasterBeamTrue = BlasterBeam;
                  BlasterBeamShoot.setVisible(true);
                  Thread.sleep(1250);
                  BlasterBeamTrue = nothing;
                  BlasterBeamShoot.setVisible(false);
                  BlasterL = nothing;
                  BlasterR = nothing;
                }
                if (RandomBlasterPosition == 1) {
                  BlasterPositionRY = 378;
                  BlasterPositionLY = 378;
                  BlasterL = Blaster1L;
                  BlasterR = Blaster1R;
                  Thread.sleep(BlasterShootSpeed);
                  BlasterL = Blaster2L;
                  BlasterR = Blaster2R;
                  Thread.sleep(100);
                  BlasterL = Blaster3L;
                  BlasterR = Blaster3R;
                  Thread.sleep(100);
                  BlasterL = Blaster4L;
                  BlasterR = Blaster4R;
                  BeamYPosition = 400;
                  BlasterBeamShoot.setLocation(0, 400);
                  BlasterBeamTrue = BlasterBeam;
                  BlasterBeamShoot.setVisible(true);
                  Thread.sleep(1250);
                  BlasterBeamTrue = nothing;
                  BlasterBeamShoot.setVisible(false);
                  BlasterL = nothing;
                  BlasterR = nothing;
                }
              }
              BoneWallTrue = nothing;
              TopBoneWall.setVisible(false);
              BottomBoneWall.setVisible(false);
            }
            if (int_random == 2) {
              RedDeathSlide = RedDeathSlideImage;
              Thread.sleep(RedDeathSpeed);
              RedDeathSlide = nothing;
              BoneSlideY1 = -34;
              BoneSlideY2 = 834;
              BoneSlide1.setVisible(true);
              BoneSlide2.setVisible(true);
              BoneSlide3.setVisible(true);
              BoneSlide4.setVisible(true);
              BoneSlide5.setVisible(true);
              BoneSlide6.setVisible(true);
              BoneSlide7.setVisible(true);
              BoneSlide8.setVisible(true);
              BoneSlide9.setVisible(true);
              BoneSlide10.setVisible(true);
              BoneSlide11.setVisible(true);
              BoneSlide12.setVisible(true);
              for (int i = 1834; i > BoneSlideY1;) {
                BoneSlide1.setLocation(0, BoneSlideY1);
                BoneSlide2.setLocation(0, (BoneSlideY1 - 200));
                BoneSlide3.setLocation(0, (BoneSlideY1 - 400));
                BoneSlide4.setLocation(0, (BoneSlideY1 - 600));
                BoneSlide5.setLocation(0, (BoneSlideY1 - 800));
                BoneSlide6.setLocation(0, (BoneSlideY1 - 1000));
                BoneSlide7.setLocation(600, (BoneSlideY2));
                BoneSlide8.setLocation(600, (BoneSlideY2 + 200));
                BoneSlide9.setLocation(600, (BoneSlideY2 + 400));
                BoneSlide10.setLocation(600, (BoneSlideY2 + 600));
                BoneSlide11.setLocation(600, (BoneSlideY2 + 800));
                BoneSlide12.setLocation(600, (BoneSlideY2 + 1000));
                BoneSlideY1 = BoneSlideY1 + 2;
                BoneSlideY2 = BoneSlideY2 - 2;
                Thread.sleep(BoneSpeed);
              }
              BoneSlide1.setVisible(false);
              BoneSlide2.setVisible(false);
              BoneSlide3.setVisible(false);
              BoneSlide4.setVisible(false);
              BoneSlide5.setVisible(false);
              BoneSlide6.setVisible(false);
              BoneSlide7.setVisible(false);
              BoneSlide8.setVisible(false);
              BoneSlide9.setVisible(false);
              BoneSlide10.setVisible(false);
              BoneSlide11.setVisible(false);
              BoneSlide12.setVisible(false);
            }
            if (int_random == 3) {
              int BoneGapChoiceUpperBound = 3;
              RedDeathGap = RedDeathGapImage;
              Thread.sleep(RedDeathSpeed);
              RedDeathGap = nothing;
              for (int dum = 0; dum < BoneGapNumber; dum++) {
                BoneGapY = -34;
                int BoneGapChoice = rand.nextInt(BoneGapChoiceUpperBound);
                if (BoneGapChoice == 0) {
                  MiddleBoneTop.setVisible(true);
                  MiddleBoneBottom.setVisible(true);
                  MiddleBoneTop2.setVisible(true);
                  MiddleBoneBottom2.setVisible(true);
                  for (int i1 = 800; i1 > BoneGapY;) {
                    MiddleBoneTop.setLocation(0, BoneGapY);
                    MiddleBoneBottom.setLocation(620, BoneGapY);
                    MiddleBoneTop2.setLocation(0, BoneGapY2);
                    MiddleBoneBottom2.setLocation(620, BoneGapY2);
                    BoneGapY = BoneGapY + 3;
                    BoneGapY2 = BoneGapY2 - 3;
                    Thread.sleep(bonegapspeed);
                  }
                  MiddleBoneTop.setVisible(false);
                  MiddleBoneBottom.setVisible(false);
                  MiddleBoneTop2.setVisible(false);
                  MiddleBoneBottom2.setVisible(false);
                  BoneGapY = -34;
                  BoneGapY2 = 800;
                }
                if (BoneGapChoice == 1) {
                  SmallTopBone.setVisible(true);
                  LargeBottomBone.setVisible(true);
                  SmallTopBone2.setVisible(true);
                  LargeBottomBone2.setVisible(true);
                  for (int i2 = 800; i2 > BoneGapY;) {
                    SmallTopBone.setLocation(0, BoneGapY);
                    LargeBottomBone.setLocation(120, BoneGapY);
                    SmallTopBone2.setLocation(0, BoneGapY2);
                    LargeBottomBone2.setLocation(120, BoneGapY2);
                    BoneGapY = BoneGapY + 3;
                    BoneGapY2 = BoneGapY2 - 3;
                    Thread.sleep(bonegapspeed);
                  }
                  SmallTopBone.setVisible(false);
                  LargeBottomBone.setVisible(false);
                  SmallTopBone2.setVisible(false);
                  LargeBottomBone2.setVisible(false);
                  BoneGapY = -34;
                  BoneGapY2 = 800;
                }
                if (BoneGapChoice == 2) {
                  LargeTopBone.setVisible(true);
                  SmallBottomBone.setVisible(true);
                  LargeTopBone2.setVisible(true);
                  SmallBottomBone2.setVisible(true);
                  for (int i3 = 800; i3 > BoneGapY;) {
                    LargeTopBone.setLocation(0, BoneGapY);
                    SmallBottomBone.setLocation(1120, BoneGapY);
                    LargeTopBone2.setLocation(0, BoneGapY2);
                    SmallBottomBone2.setLocation(1120, BoneGapY2);
                    BoneGapY = BoneGapY + 3;
                    BoneGapY2 = BoneGapY2 - 3;
                    Thread.sleep(bonegapspeed);
                  }
                  LargeTopBone.setVisible(false);
                  SmallBottomBone.setVisible(false);
                  LargeTopBone2.setVisible(false);
                  SmallBottomBone2.setVisible(false);
                  BoneGapY = -34;
                  BoneGapY2 = 800;
                }
              }
            }
            if (int_random == 4) {
              int BoneZoneUpperBound = 4;
              for (int ibz = 0; ibz < BoneZoneNumber; ibz++) {
                int BoneZoneChoice = rand.nextInt(BoneZoneUpperBound);
                if (BoneZoneChoice == 0) {
                  VBWPY = 0;
                  VerticalRedDeath = VerticalRedDeathImage;
                  Thread.sleep(BoneSurroundRDSpeed);
                  VerticalRedDeath = nothing;
                  VerticalBoneWall.setLocation(0, VBWPY);
                  VerticalBoneWall.setVisible(true);
                  Thread.sleep(1000);
                  VerticalBoneWall.setVisible(false);
                }
                if (BoneZoneChoice == 1) {
                  VBWPY = 200;
                  VerticalRedDeath = VerticalRedDeathImage;
                  Thread.sleep(BoneSurroundRDSpeed);
                  VerticalRedDeath = nothing;
                  VerticalBoneWall.setLocation(0, VBWPY);
                  VerticalBoneWall.setVisible(true);
                  Thread.sleep(1000);
                  VerticalBoneWall.setVisible(false);
                }
                if (BoneZoneChoice == 2) {
                  HBWPX = 0;
                  HorizontalRedDeath = HorizontalRedDeathImage;
                  Thread.sleep(BoneSurroundRDSpeed);
                  HorizontalRedDeath = nothing;
                  HorizontalBoneWall.setLocation(HBWPX, 0);
                  HorizontalBoneWall.setVisible(true);
                  Thread.sleep(1000);
                  HorizontalBoneWall.setVisible(false);
                }
                if (BoneZoneChoice == 3) {
                  HBWPX = 200;
                  HorizontalRedDeath = HorizontalRedDeathImage;
                  Thread.sleep(BoneSurroundRDSpeed);
                  HorizontalRedDeath = nothing;
                  HorizontalBoneWall.setLocation(HBWPX, 0);
                  HorizontalBoneWall.setVisible(true);
                  Thread.sleep(1000);
                  HorizontalBoneWall.setVisible(false);
                }
              }
            }
            if (int_random == 5) {
              for (ia = 0; ia < NOA; ia++) {
                blueororange[ia] = rand.nextInt(upperboundchoice);
              }
              Head = nothing;
              ShoulderR = nothing;
              ShoulderL = nothing;
              HandR = nothing;
              HandL = nothing;
              IntroEyes = IntroEyesImage;
              Thread.sleep(750);
              IntroEyes = nothing;
              Thread.sleep(200);
              for (ia = 0; ia < NOA; ia++) {
                if (blueororange[ia] == 0) {
                  Thread.sleep(125);
                  IntroEyes = BlueEyes;
                  Thread.sleep(250);
                  IntroEyes = nothing;
                }
                if (blueororange[ia] == 1) {
                  Thread.sleep(125);
                  IntroEyes = YellowEyes;
                  Thread.sleep(250);
                  IntroEyes = nothing;
                }
              }
              IntroEyes = nothing;
              ShoulderR = ShoulderRImage;
              ShoulderL = ShoulderLImage;
              HandR = HandRImage;
              HandL = HandLImage;
              if (debugphase == 0) {
                Head = HeadImage;
              }
              if (debugphase == 1) {
                Head = HeadImagePhase2;
              }
              if (debugphase == 2) {
                Head = HeadImagePhase3;
              }
              for (ia = 0; ia < NOA; ia++) {
                Thread.sleep(100);
                if (blueororange[ia] == 0) {
                  BlueBlasters = BlueBlasters1;
                  Thread.sleep(BlasterShootSpeed);
                  BlueBlasters = BlueBlasters2;
                  Thread.sleep(100);
                  BlueBlasters = BlueBlasters3;
                  Thread.sleep(100);
                  BlueBlasters = BlueBlasters4;
                  BlueDeath = BlueDeathImage;
                  blueattack = 1;
                  Thread.sleep(450);
                  BlueBlasters = nothing;
                  BlueDeath = nothing;
                  blueattack = 0;
                  detection = 0;
                }
                if (blueororange[ia] == 1) {
                  OrangeBlasters = OrangeBlasters1;
                  Thread.sleep(BlasterShootSpeed);
                  OrangeBlasters = OrangeBlasters2;
                  Thread.sleep(100);
                  OrangeBlasters = OrangeBlasters3;
                  Thread.sleep(100);
                  OrangeBlasters = OrangeBlasters4;
                  OrangeDeath = OrangeDeathImage;
                  orangeattack = 1;
                  Thread.sleep(450);
                  orangeattack = 0;
                  OrangeBlasters = nothing;
                  OrangeDeath = nothing;
                  Move.interrupt();
                }
              }
            }
            int_random = 69;
            Thread.sleep(1300);
          }
          if (game == 69) {
            FinalAttack = BlasterDeathFunny;
            Thread.sleep(3000);
            stopanimation = 1;
            for (dogx = 1200; dogx > 600;) {
              CheaterPolice = CheaterPoliceImage;
              Thread.sleep(5);
              CheaterPolice = CheaterPoliceImage2;
              Thread.sleep(5);
              dogx = dogx - 5;
            }
            Head = nothing;
            ShoulderR = nothing;
            ShoulderL = nothing;
            HandR = nothing;
            HandL = nothing;
            FinalAttack = nothing;
            game = 2;
            for (dogx = dogx; dogx > -200;) {
              CheaterPolice = CheaterPoliceImage;
              Thread.sleep(5);
              CheaterPolice = CheaterPoliceImage2;
              Thread.sleep(5);
              dogx = dogx - 5;
            }
            game = 2;
            attackloop = 10;
            score = 7500 + (playerHP * hpscore);
            totalscore.setText("Score:" + score);
            GameOverOrWonScreen = WonImage;
            totalscore.setVisible(true);
          }
        } catch (InterruptedException ex) {
        }
      }
    }
  }

  public class HitTaken extends Thread {
    @Override
    public void run() {
      for (int i = 0; i < 5;) {
        if (antidetection == 0 && antidamage == 0 && immunity == 0 && AutoDodgeImmunity == 0) {
          immunity = 1;
          playerHP = playerHP - 1;
          for (int i2 = 0; i2 < iframe; i2++) {
            try {
              cursorflash = 1;
              Thread.sleep(125);
              cursorflash = 0;
              Thread.sleep(125);
            } catch (InterruptedException ex) {
            }
          }
          immunity = 0;
        }

        if (detection == 1 && immunity == 0 && AutoDodgeImmunity == 0) {
          if (orangeattack == 1 || blueattack == 1) {
            detection = 0;
          }
          immunity = 1;
          playerHP = playerHP - 1;
          for (int funnymoment = 0; funnymoment < iframe; funnymoment++) {
            try {
              cursorflash = 1;
              Thread.sleep(125);
              cursorflash = 0;
              Thread.sleep(125);
            } catch (InterruptedException ex) {
            }
          }
          immunity = 0;
        }
        if (playerHP < 0) {
          playerHP = playerHP + 1;
        }
        if (playerHP <= 0 && int_random == 69) {
          Head = nothing;
          ShoulderR = nothing;
          ShoulderL = nothing;
          HandR = nothing;
          HandL = nothing;
          IndicatorDeterminationHP.setVisible(false);
          IndicatorBraveryHP.setVisible(false);
          IndicatorJusticeHP.setVisible(false);
          IndicatorKindnessHP.setVisible(false);
          IndicatorPatienceHP.setVisible(false);
          IndicatorIntegrityHP.setVisible(false);
          IndicatorPerserveranceHP.setVisible(false);
          attackloop = 10;
          game = 2;
          score = 5000 - (BossHP * 10);
          totalscore.setText("Score:" + score);
          totalscore.setVisible(true);
          GameOverOrWonScreen = GameOverScreenImage;
        }
        if (soul == 1) {
          IndicatorDeterminationHP.setSize((playerHP * 22) + 60, 50);
        }
        if (soul == 2) {
          IndicatorBraveryHP.setSize((playerHP * 22) + 60, 50);
        }
        if (soul == 3) {
          IndicatorJusticeHP.setSize((playerHP * 22) + 60, 50);
        }
        if (soul == 4) {
          IndicatorKindnessHP.setSize((playerHP * 22) + 60, 50);
        }
        if (soul == 5) {
          IndicatorPatienceHP.setSize((playerHP * 22) + 60, 50);
        }
        if (soul == 6) {
          IndicatorIntegrityHP.setSize((playerHP * 22) + 60, 50);
        }
        if (soul == 7) {
          IndicatorPerserveranceHP.setSize((playerHP * 22) + 60, 50);
        }
      }
    }
  }

  public class Intro extends Thread {
    @Override

    public void run() {
      try {
        b.setVisible(false);
        Tutorial.setVisible(false);
        Tutorial2.setVisible(false);
        Background = nothing;
        Imagechange = nothing;
        Start = nothing;
        game = 4;
        for (int i = 0; i < 3; i++) {
          cursorflash = 1;
          Thread.sleep(125);
          cursorflash = 0;
          Thread.sleep(125);
        }
        try {
          int x1 = (int) mouseX;
          int y1 = (int) mouseY;
          int x2 = 600;
          int y2 = 700;
          int t = 10;
          int n = 100;
          Robot r = new Robot();
          double dx = (x2 - x1) / ((double) n);
          double dy = (y2 - y1) / ((double) n);
          double dt = t / ((double) n);
          for (int step = 1; step <= n; step++) {
            Thread.sleep((int) dt);
            r.mouseMove((int) (x1 + dx * step), (int) (y1 + dy * step));
          }
        } catch (AWTException e) {
          e.printStackTrace();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        Thread.sleep(2000);

        Thread.sleep(66);
        SSB = SSBI;
        Thread.sleep(66);
        SSB = nothing;
        Thread.sleep(66);
        SSB = SSBI;
        Thread.sleep(66);
        SSB = nothing;
        Thread.sleep(66);
        SSB = SSBI;

        Thread.sleep(66);
        SSJ = SSJI;
        Thread.sleep(66);
        SSJ = nothing;
        Thread.sleep(66);
        SSJ = SSJI;
        Thread.sleep(66);
        SSJ = nothing;
        Thread.sleep(66);
        SSJ = SSJI;

        Thread.sleep(66);
        SSK = SSKI;
        Thread.sleep(66);
        SSK = nothing;
        Thread.sleep(66);
        SSK = SSKI;
        Thread.sleep(66);
        SSK = nothing;
        Thread.sleep(66);
        SSK = SSKI;

        Thread.sleep(66);
        SSPA = SSPAI;
        Thread.sleep(66);
        SSPA = nothing;
        Thread.sleep(66);
        SSPA = SSPAI;
        Thread.sleep(66);
        SSPA = nothing;
        Thread.sleep(66);
        SSPA = SSPAI;

        Thread.sleep(66);
        SSI = SSII;
        Thread.sleep(66);
        SSI = nothing;
        Thread.sleep(66);
        SSI = SSII;
        Thread.sleep(66);
        SSI = nothing;
        Thread.sleep(66);
        SSI = SSII;

        Thread.sleep(66);
        SSP = SSPI;
        Thread.sleep(66);
        SSP = nothing;
        Thread.sleep(66);
        SSP = SSPI;
        Thread.sleep(66);
        SSP = nothing;
        Thread.sleep(66);
        SSP = SSPI;

        Thread.sleep(66);
        SSD = SSDI;
        Thread.sleep(66);
        SSD = nothing;
        Thread.sleep(66);
        SSD = SSDI;
        Thread.sleep(66);
        SSD = nothing;
        Thread.sleep(66);
        SSD = SSDI;

        Thread.sleep(500);
        IntroEyes = IntroEyesImage;
        Thread.sleep(2000);
        SSD = nothing;
        SSB = nothing;
        SSJ = nothing;
        SSK = nothing;
        SSPA = nothing;
        SSI = nothing;
        SSP = nothing;
        IntroEyes = nothing;
        Head = HeadImage;
        ShoulderL = ShoulderLImage;
        ShoulderR = ShoulderRImage;
        HandL = HandLImage;
        HandR = HandRImage;
        Thread.sleep(1000);
        game = 1;
        SkeletonManNow.start();
        TrackingRobotAndMouseLocation.start();
        SkeletonManAttacking.start();
        HitTakenChecker.start();
        StopCheaters.start();
        Abilities.start();
        Move.start();
        BossHPTracker.start();
        Shoot.start();
      } catch (InterruptedException ex) {
      }
    }
  }

  public class AntiCheat extends Thread {
    @Override

    public void run() {
      for (int i = 0; i < 3;) {
        try {
          Thread.sleep(1000);
          if (ClicksPerSecond > 15) {
            System.exit(1);
          }
          ClicksPerSecond = 0;
        } catch (InterruptedException ex) {
        }
      }
    }
  }

  public class PlayerAbilities extends Thread {
    @Override

    public void run() {
      try {
        if (soul == 1) {
          hpscore = 500;
          IndicatorDeterminationHP.setVisible(true);
          playerHP = 16;
        }
        if (soul == 2) {
          IndicatorBraveryHP.setVisible(true);
          playerDamage = 2;
        }
        if (soul == 3) {
          IndicatorJusticeHP.setVisible(true);
          playerBullets = 1;
          for (int i = 0; i < 3;) {
            if (Bullets == 2) {
              BulletsCD = 1;
              Thread.sleep(3000);
              Bullets = 1;
              BulletsCD = 0;
            }
          }
        }
        if (soul == 4) {
          IndicatorKindnessHP.setVisible(true);
          for (int i = 0; i < 3;) {
            if (game == 1) {
              if (playerHP != 8) {
                playerHP = playerHP + 1;
                Thread.sleep(25000);
              }
            }
          }
        }
        if (soul == 5) {
          IndicatorPatienceHP.setVisible(true);
          for (int i = 0; i < 3;) {
            if (game == 1) {
              BossHP = BossHP - 1;
              Thread.sleep(600);
            }
          }
        }
        if (soul == 6) {
          IndicatorIntegrityHP.setVisible(true);
          playerShield = 1;
          AutoDodge = 1;
          for (int i = 0; i < 3;) {
            if (game == 1) {
              if (AutoDodge == 2) {
                AutoDodgeImmunity = 1;
                Thread.sleep(5000);
                AutoDodge = 1;
                AutoDodgeImmunity = 0;
                AutoDodgeCD = 1;
                Thread.sleep(20000);
                AutoDodgeCD = 0;
              }
            }
          }

        }
        if (soul == 7) {
          IndicatorPerserveranceHP.setVisible(true);
          iframe = 12;
        }
        if (soul == 8) {
          hpscore = -75;
          playerHP = 100;
          playerDamage = 40;
          immunity = 1;
        }
      } catch (InterruptedException ex) {
      }
    }
  }

  public class OrangeAttack extends Thread {
    @Override

    public void run() {
      for (int i = 0; i < 1;) {
        if (orangeattack == 1) {
          try {
            Thread.sleep(300);
            detection = 1;
            System.out.println("damaged");
          } catch (InterruptedException e) {
          }
        }
      }
    }
  }

  public class BossHPDamager extends Thread {
    @Override

    public void run() {
      for (int hpchecker = 0; hpchecker < 5;) {
	      try {
	      Thread.sleep(10);
	      }
	      catch (InterruptedException ex) {
          }
        if (BossHP <= 340 && BossHP > 180 && debugphase == 0 && int_random != 5) {
          bonegapspeed = 4;
          Head = HeadImagePhase2;
          BoneZoneNumber = 5;
          BoneSpeed = 5;
          NOA = 4;
          BoneGapNumber = 4;
          BlasterShootSpeed = 650;
          RedDeathSpeed = 1550;
          BoneSurroundRDSpeed = 1300;
          debugphase = 1;
        }
        if (BossHP <= 180 && BossHP > 1 && debugphase == 1 && int_random != 5) {
          bonegapspeed = 3;
          Head = HeadImagePhase3;
          BoneZoneNumber = 6;
          BoneSpeed = 4;
          NOA = 5;
          BoneGapNumber = 5;
          BlasterShootSpeed = 450;
          RedDeathSpeed = 1100;
          BoneSurroundRDSpeed = 800;
          debugphase = 2;
        }
        if (BossHP <= 0 && int_random != 5) {
          if (game != 2) {
            game = 69;
          }
          for (int potassium = 1; potassium > stopanimation;) {
            try {
              Head = HeadImagePhase3Flashing;
              Thread.sleep(100);
              Head = HeadImagePhase3;
              Thread.sleep(100);
            } catch (InterruptedException e) {
            }
          }
        }
      }
    }
  }

  public class ShootingBullets extends Thread {
    @Override
    public void run() {
      for (int bulletchecker = 0; bulletchecker < 5;) {
        try {
          if (Bullets == 2) {
            Bulletshot = BulletImage;
            BulletX = (int) mouseX - 5;
            BulletY = (int) mouseY;
            for (int i = 0; i < 3;) {
              BulletY = BulletY - 2;
              if (BulletX >= 528 && BulletX <= 668 && BulletY >= headY && BulletY <= (headY + 150)) {
                BulletX = 0;
                BulletY = 0;
                Bulletshot = nothing;
                BossHP = BossHP - 8;
              }
              Thread.sleep(1);
            }
          }
        } catch (InterruptedException e) {
        }
      }
    }
  }

  SkeletonManAnimation SkeletonManNow = new SkeletonManAnimation();
  RobotAndMouseLocation TrackingRobotAndMouseLocation = new RobotAndMouseLocation();
  SkeletonManAttacks SkeletonManAttacking = new SkeletonManAttacks();
  HitTaken HitTakenChecker = new HitTaken();
  Intro IntroNow = new Intro();
  OrangeAttack Move = new OrangeAttack();
  PlayerAbilities Abilities = new PlayerAbilities();
  AntiCheat StopCheaters = new AntiCheat();
  BossHPDamager BossHPTracker = new BossHPDamager();
  ShootingBullets Shoot = new ShootingBullets();
}
