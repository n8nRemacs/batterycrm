package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class eya extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ eya(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return (d3b) w5Var.c(656);
            case 1:
                b3b b3bVar = new b3b(w5Var.d(48));
                b3bVar.e = new sya(w5Var);
                return b3bVar;
            case 2:
                return (zh4) w5Var.c(657);
            case 3:
                return new nm8(w5Var.d(3), w5Var.d(7), (lzf) w5Var.c(8));
            case 4:
                return new jrb((nm8) w5Var.c(2), (jx1) w5Var.c(4), w5Var.d(7));
            case 5:
                return new jx1(w5Var.d(3), w5Var.d(7));
            case 6:
                return new vda();
            case 7:
                di8 di8Var = di8.g;
                jqb jqbVar = di8Var.a;
                if (jqbVar.c) {
                    fo4 fo4Var = new fo4();
                    fo4Var.a = jqbVar.c;
                    fo4Var.c = jqbVar.d;
                    fo4Var.o = jqbVar.f;
                    fo4Var.d = jqbVar.e;
                    w8a w8aVar = jqbVar.a;
                    w8a w8aVar2 = (w8a) fo4Var.b;
                    w8aVar2.d();
                    if (!w8aVar.h()) {
                        w8aVar2.e(w8aVar2.b + w8aVar.b);
                        ys.l(w8aVar2.b, 0, w8aVar.b, w8aVar.a, w8aVar2.a);
                        w8aVar2.b += w8aVar.b;
                    }
                    fo4Var.X = jqbVar.b;
                    fo4Var.c = (erb) w5Var.c(7);
                    fo4Var.o = (lzf) w5Var.c(8);
                    fo4Var.d = (yi5) w5Var.c(9);
                    ((w8a) fo4Var.b).b(new dga(20));
                    ((w8a) fo4Var.b).b(new iqb(0, new l25(w5Var.d(0), (erb) w5Var.c(7), 1)));
                    fo4Var.X = new ci8();
                    fo4Var.a = false;
                    di8Var.a = fo4Var.a();
                    di8Var.n();
                } else {
                    String str = di8Var.b;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.X;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str, "Post construct is available only for lazy mode!", null);
                        }
                    }
                }
                return di8Var;
            case 8:
                return new erb(w5Var.d(46), w5Var.d(86), w5Var.d(139), w5Var.d(76), w5Var.d(48), w5Var.d(88));
            case 9:
                bwf bwfVarD = w5Var.d(88);
                w5Var.getClass();
                return new frb(bwfVarD);
            case 10:
                return new qsb((Context) w5Var.c(12), (tzg) w5Var.c(13));
            case 11:
                return new urb((Application) w5Var.c(14));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                w5Var.getClass();
                return new zch(w5Var.d(46), w5Var.d(81), w5Var.d(45), w5Var.d(31));
            case 13:
                return new s3h((Context) w5Var.c(12), w5Var.d(88), (pb3) w5Var.c(46), (hwa) w5Var.c(79), (qx5) w5Var.c(137), (i2h) w5Var.c(132), (lzf) w5Var.c(8), w5Var.d(138), w5Var.d(109), (a84) w5Var.c(84));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new b5c((Application) w5Var.c(14), (yi5) w5Var.c(9), (bl5) w5Var.c(130), w5Var.d(46), (r4c) w5Var.c(134), w5Var.d(48), w5Var.d(76), w5Var.e());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new z2f((Application) w5Var.c(14), (yi5) w5Var.c(9), (bl5) w5Var.c(130), w5Var.d(46), (r4c) w5Var.c(134), w5Var.d(48), w5Var.d(76), w5Var.e());
            case 16:
                return new z2f((Application) w5Var.c(14), (yi5) w5Var.c(9), (bl5) w5Var.c(130), w5Var.d(46), (r4c) w5Var.c(134), w5Var.d(48), w5Var.d(76), w5Var.e());
            case LangUtils.HASH_SEED /* 17 */:
                return new bl5(w5Var.d(131), (Context) w5Var.c(12));
            case 18:
                iz5 iz5Var = (iz5) ((qx5) w5Var.c(137));
                iz5Var.getClass();
                return new b1f(iz5.g(iz5.g(iz5.b(iz5Var.c), "videoCache").getPath(), "exoPlayer"), new w18(104857600L), null, true);
            case 19:
                return new i2h(w5Var.d(48));
            case 20:
                return new r4c((age) w5Var.c(47));
            case 21:
                return new x2h(w5Var.d(8), w5Var.d(84));
            case 22:
                return (rt5) w5Var.c(65);
            case 23:
                return (w4e) w5Var.c(67);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return (pb3) w5Var.c(67);
            case 25:
                return new x70((Context) w5Var.c(12), "auth.prefs", (bx5) w5Var.c(71));
            case 26:
                return new z7c((pe8) w5Var.c(67), (l5c) w5Var.c(63), (sxg) w5Var.c(59), (x70) w5Var.c(69), (gu5) w5Var.c(65));
            case 27:
                return (z7c) w5Var.c(70);
            case 28:
                return new sxg((Context) w5Var.c(12), (bx5) w5Var.c(71));
            default:
                return (sxg) w5Var.c(59);
        }
    }
}
