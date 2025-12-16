package defpackage;

import android.content.Context;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class y5 extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ y5(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new fxa(w5Var.d(32), w5Var.d(33));
            case 1:
                return new exa(w5Var.d(45), w5Var.d(46), w5Var.d(47), w5Var.d(48), w5Var.d(35));
            case 2:
                return new c0b(w5Var.d(45), w5Var.d(46), w5Var.d(31));
            case 3:
                return new w1b(w5Var.d(45));
            case 4:
                return new p8b(w5Var.d(45));
            case 5:
                return new h7b(w5Var.d(45));
            case 6:
                Context context = (Context) w5Var.c(12);
                return new gr9((lzf) w5Var.c(8), (so3) w5Var.c(488), w5Var.d(530), w5Var.d(531), w5Var.d(114), context);
            case 7:
                return new evb(w5Var.d(77), (Context) w5Var.c(12));
            case 8:
                return new vub(w5Var.d(46), w5Var.d(288), w5Var.d(137), w5Var.d(77), w5Var.d(532), (evb) w5Var.c(515));
            case 9:
                return new t0h((Context) w5Var.c(12), w5Var.d(77), w5Var.d(532), (evb) w5Var.c(515));
            case 10:
                Context context2 = (Context) w5Var.c(12);
                bwf bwfVarD = w5Var.d(137);
                bwf bwfVarD2 = w5Var.d(245);
                bwf bwfVarD3 = w5Var.d(91);
                bwf bwfVarD4 = w5Var.d(346);
                bwf bwfVarD5 = w5Var.d(523);
                bwf bwfVarD6 = w5Var.d(533);
                bwf bwfVarD7 = w5Var.d(316);
                bwf bwfVarD8 = w5Var.d(524);
                return new rz(context2, bwfVarD, bwfVarD5, bwfVarD2, bwfVarD3, bwfVarD4, bwfVarD6, w5Var.d(525), bwfVarD7, bwfVarD8, w5Var.d(513), w5Var.d(519), w5Var.d(48), w5Var.d(61), w5Var.d(516), w5Var.d(517), w5Var.d(47), w5Var.d(288));
            case 11:
                return new xh9(w5Var.d(114), w5Var.d(530), w5Var.d(HttpStatus.SC_GONE), w5Var.d(520), (Context) w5Var.c(12));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bwf bwfVarD9 = w5Var.d(HttpStatus.SC_GONE);
                bwf bwfVarD10 = w5Var.d(215);
                bwf bwfVarD11 = w5Var.d(439);
                bwf bwfVarD12 = w5Var.d(123);
                bwf bwfVarD13 = w5Var.d(346);
                bwf bwfVarD14 = w5Var.d(210);
                Context context3 = (Context) w5Var.c(12);
                rz rzVar = (rz) w5Var.c(518);
                xh9 xh9Var = (xh9) w5Var.c(519);
                bwf bwfVarD15 = w5Var.d(61);
                bwf bwfVarD16 = w5Var.d(347);
                bwf bwfVarD17 = w5Var.d(46);
                bwf bwfVarD18 = w5Var.d(8);
                bwf bwfVarD19 = w5Var.d(12);
                bwf bwfVarD20 = w5Var.d(215);
                w5Var.getClass();
                return new o2b(bwfVarD9, bwfVarD10, bwfVarD11, bwfVarD12, bwfVarD13, bwfVarD14, context3, rzVar, xh9Var, new gz(bwfVarD15, bwfVarD16, bwfVarD17, bwfVarD18, bwfVarD19, bwfVarD20, w5Var.d(346), w5Var.d(HttpStatus.SC_GONE), w5Var.d(534)), w5Var.d(150), w5Var.d(532), w5Var.d(109), w5Var.d(527), w5Var.d(48), w5Var.d(534), w5Var.d(535));
            case 13:
                return new h49(w5Var.d(528), w5Var.d(513), w5Var.d(36), w5Var.d(109), w5Var.d(138), w5Var.d(521), w5Var.d(8), w5Var.d(536), w5Var.d(48), w5Var.d(61), w5Var.d(84), (l7a) w5Var.c(37));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return (e5c) w5Var.c(522);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new v40((Context) w5Var.c(12), (l7a) w5Var.c(37), (vpc) w5Var.c(38));
            case 16:
                return new hi0(w5Var.d(10), w5Var.d(123), w5Var.d(HttpStatus.SC_RESET_CONTENT), w5Var.d(8));
            case LangUtils.HASH_SEED /* 17 */:
                return new at1(w5Var.d(8), w5Var.d(123), w5Var.d(46), w5Var.d(150), w5Var.d(110));
            case 18:
                return new cy1((sv1) w5Var.c(30), w5Var.d(46), w5Var.d(40), w5Var.d(81));
            case 19:
                return new mdb(w5Var.d(40));
            case 20:
                u5i u5iVar = new u5i(w5Var.d(46), w5Var.d(47), w5Var.d(HttpStatus.SC_UNAUTHORIZED));
                return new s81(w5Var.d(12), w5Var.d(27), w5Var.d(81), new qs3(u5iVar, u5iVar, u5iVar, w5Var.d(81), w5Var.d(35), w5Var.d(47)).h(), w5Var.d(47), w5Var.d(48), w5Var.d(464), w5Var.d(465));
            case 21:
                p51 p51Var = new p51((ow1) w5Var.c(466), w5Var.d(25), w5Var.d(463));
                bwf bwfVarD21 = w5Var.d(14);
                bwf bwfVarD22 = w5Var.d(26);
                bwf bwfVarD23 = w5Var.d(25);
                bwf bwfVarD24 = w5Var.d(470);
                bwf bwfVarD25 = w5Var.d(18);
                ow1 ow1Var = (ow1) w5Var.c(466);
                bwf bwfVarD26 = w5Var.d(17);
                bwf bwfVarD27 = w5Var.d(461);
                bwf bwfVarD28 = w5Var.d(19);
                bwf bwfVarD29 = w5Var.d(23);
                bwf bwfVarD30 = w5Var.d(460);
                bwf bwfVarD31 = w5Var.d(16);
                bwf bwfVarD32 = w5Var.d(20);
                bwf bwfVarD33 = w5Var.d(24);
                bwf bwfVarD34 = w5Var.d(21);
                bwf bwfVarD35 = w5Var.d(22);
                sv1 sv1Var = (sv1) w5Var.c(30);
                bwf bwfVarD36 = w5Var.d(471);
                bwf bwfVarD37 = w5Var.d(8);
                bwf bwfVarD38 = w5Var.d(81);
                bwf bwfVarD39 = w5Var.d(83);
                bwf bwfVarD40 = w5Var.d(156);
                bwf bwfVarD41 = w5Var.d(10);
                bwf bwfVarD42 = w5Var.d(150);
                bwf bwfVarD43 = w5Var.d(98);
                return new hw1(bwfVarD21, bwfVarD22, bwfVarD23, bwfVarD24, bwfVarD25, bwfVarD26, bwfVarD28, bwfVarD27, bwfVarD34, bwfVarD32, bwfVarD35, bwfVarD29, w5Var.d(467), bwfVarD31, bwfVarD30, w5Var.d(28), bwfVarD33, bwfVarD36, bwfVarD37, bwfVarD38, bwfVarD39, w5Var.d(48), bwfVarD40, bwfVarD41, w5Var.d(468), w5Var.d(469), sv1Var, p51Var, ow1Var, bwfVarD42, bwfVarD43, w5Var.d(79), w5Var.d(4), new bwf(new b31(w5Var, 0)), w5Var.d(76));
            case 22:
                return new md1(w5Var.d(48), w5Var.d(470), w5Var.d(30), w5Var.d(8));
            case 23:
                return new v11(w5Var.d(470), w5Var.d(18), w5Var.d(19), w5Var.d(28), (sv1) w5Var.c(30), w5Var.d(386), (at1) w5Var.c(463), w5Var.d(156), w5Var.d(8));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new a61(w5Var.d(470));
            case 25:
                at1 at1Var = new at1(w5Var.d(8), w5Var.d(123), w5Var.d(46), w5Var.d(150), w5Var.d(110));
                bwf bwfVarD44 = w5Var.d(470);
                tf1 tf1Var = new tf1(w5Var.d(28));
                bwf bwfVarD45 = w5Var.d(25);
                return new dob(bwfVarD44, w5Var.d(28), (sv1) w5Var.c(30), at1Var, tf1Var, bwfVarD45, w5Var.d(386), w5Var.d(8));
            case 26:
                return new ax1();
            case 27:
                return CallServiceImpl.u0;
            case 28:
                return new n64();
            default:
                return new x65((sv1) w5Var.c(30), w5Var.d(8));
        }
    }
}
