package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class b4e extends ypd {
    public final /* synthetic */ int b;

    public /* synthetic */ b4e(int i) {
        this.b = i;
    }

    @Override // defpackage.ypd
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new mo3(w5Var.d(49), (lzf) w5Var.c(8));
            case 1:
                bwf bwfVarD = w5Var.d(79);
                bwf bwfVarD2 = w5Var.d(31);
                bwf bwfVarD3 = w5Var.d(32);
                bwf bwfVarD4 = w5Var.d(35);
                bwf bwfVarD5 = w5Var.d(189);
                bwf bwfVarD6 = w5Var.d(49);
                bwf bwfVarD7 = w5Var.d(88);
                bwf bwfVarD8 = w5Var.d(97);
                bwf bwfVarD9 = w5Var.d(143);
                bwf bwfVarD10 = w5Var.d(123);
                bwf bwfVarD11 = w5Var.d(HttpStatus.SC_MULTI_STATUS);
                bwf bwfVarD12 = w5Var.d(186);
                bwf bwfVarD13 = w5Var.d(299);
                bwf bwfVarD14 = w5Var.d(398);
                bwf bwfVarD15 = w5Var.d(399);
                bwf bwfVarD16 = w5Var.d(210);
                bwf bwfVarD17 = w5Var.d(190);
                bwf bwfVarD18 = w5Var.d(318);
                bwf bwfVarD19 = w5Var.d(HttpStatus.SC_BAD_REQUEST);
                bwf bwfVarD20 = w5Var.d(244);
                bwf bwfVarD21 = w5Var.d(257);
                bwf bwfVarD22 = w5Var.d(291);
                bwf bwfVarD23 = w5Var.d(9);
                bwf bwfVarD24 = w5Var.d(241);
                bwf bwfVarD25 = w5Var.d(375);
                bwf bwfVarD26 = w5Var.d(150);
                bwf bwfVarD27 = w5Var.d(8);
                bwf bwfVarD28 = w5Var.d(HttpStatus.SC_UNAUTHORIZED);
                bwf bwfVarD29 = w5Var.d(166);
                bwf bwfVarD30 = w5Var.d(281);
                klc klcVar = (klc) w5Var.c(110);
                bwf bwfVarD31 = w5Var.d(167);
                lzf lzfVar = (lzf) w5Var.c(8);
                a84 a84Var = (a84) w5Var.c(84);
                bwf bwfVarD32 = w5Var.d(79);
                bwf bwfVarD33 = w5Var.d(149);
                fa6 fa6Var = new fa6();
                fa6Var.a = fa6.class.getName();
                fa6Var.b = bwfVarD32;
                fa6Var.c = bwfVarD33;
                fa6Var.d = d7j.a(((q2b) lzfVar).b().plus(a84Var));
                return new yh8(bwfVarD, bwfVarD2, bwfVarD3, bwfVarD4, bwfVarD5, bwfVarD6, bwfVarD7, bwfVarD8, bwfVarD9, bwfVarD10, bwfVarD11, bwfVarD12, bwfVarD13, bwfVarD14, bwfVarD15, bwfVarD16, bwfVarD17, bwfVarD18, bwfVarD19, bwfVarD20, bwfVarD21, bwfVarD22, bwfVarD23, bwfVarD24, bwfVarD25, bwfVarD26, bwfVarD27, bwfVarD28, bwfVarD29, bwfVarD30, bwfVarD31, w5Var.d(122), klcVar, fa6Var, (di8) w5Var.c(6));
            case 2:
                return new mka(w5Var.d(110), w5Var.d(283));
            case 3:
                return new l4e(w5Var);
            case 4:
                return new fyg(w5Var.d(48));
            case 5:
                return new la3(w5Var.d(31), w5Var.d(46), w5Var.d(261), w5Var.d(HttpStatus.SC_PAYMENT_REQUIRED));
            case 6:
                return new pj3((a84) w5Var.c(84), w5Var.d(79), w5Var.d(195), w5Var.d(46), (lzf) w5Var.c(8));
            case 7:
                return (q9b) w5Var.c(193);
            case 8:
                return (OneMeRoomDatabase) ((q9b) w5Var.c(193)).l();
            case 9:
                bwf bwfVarD34 = w5Var.d(138);
                bwf bwfVarD35 = w5Var.d(215);
                bwf bwfVarD36 = w5Var.d(212);
                bwf bwfVarD37 = w5Var.d(109);
                bwf bwfVarD38 = w5Var.d(46);
                bwf bwfVarD39 = w5Var.d(47);
                w5Var.getClass();
                return new nh9(bwfVarD34, bwfVarD35, bwfVarD36, bwfVarD37, bwfVarD38, bwfVarD39);
            case 10:
                return new nt2(w5Var.d(88), w5Var.d(79), w5Var.d(138), w5Var.d(109));
            case 11:
                return new wz2(w5Var.d(88), w5Var.d(79), w5Var.d(109));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new bl9(w5Var.d(252), w5Var.d(138), w5Var.d(109));
            case 13:
                return new os6(w5Var.d(110), w5Var.d(46), w5Var.d(481));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new rhc((tw0) w5Var.c(49), w5Var.d(8));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new r94((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 16:
                return new twb((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case LangUtils.HASH_SEED /* 17 */:
                return new fif(w5Var.d(239), w5Var.d(232), (tef) w5Var.c(231), (lzf) w5Var.c(8));
            case 18:
                return new kif(w5Var.d(239), w5Var.d(232), (lzf) w5Var.c(8));
            case 19:
                return new yb8(w5Var.d(8), w5Var.d(595), (Context) w5Var.c(12));
            case 20:
                return new ef0(w5Var.d(8), w5Var.d(86));
            case 21:
                return new wb8(w5Var.d(8), w5Var.d(595));
            case 22:
                return new lt6(w5Var.d(79), w5Var.d(591));
            case 23:
                return new fu6(w5Var.d(41), w5Var.d(123), w5Var.d(256));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new dlh(w5Var);
            case 25:
                return new q8h(w5Var.d(12), w5Var.d(10), w5Var.d(137));
            case 26:
                return (i5h) w5Var.c(494);
            case 27:
                return new o50(w5Var.d(12), w5Var.d(10), w5Var.d(137));
            case 28:
                return new m88(w5Var.d(124));
            default:
                return new hed();
        }
    }
}
