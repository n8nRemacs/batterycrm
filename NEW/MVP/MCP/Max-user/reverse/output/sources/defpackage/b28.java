package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import java.util.Arrays;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class b28 extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ b28(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                bwf bwfVar = new bwf(k54.Y);
                if (kzf.b != null) {
                    wqi.o("TamContextAndroid", null, "TamContext is already initialized", Arrays.copyOf(new Object[0], 0));
                } else {
                    kzf.b = new kzf(bwfVar);
                    kzf.c.countDown();
                }
                if (kzf.c.getCount() == 0) {
                    return kzf.b;
                }
                throw new IllegalStateException("TamContextAndroid should call `init` before `getInstance`");
            case 1:
                return new c0g((Context) w5Var.c(12), w5Var.d(310), w5Var.d(HttpStatus.SC_GONE), w5Var.d(97), w5Var.d(98), w5Var.d(46), new bwf(new b31(w5Var, 5)));
            case 2:
                return new vj6((ef7) w5Var.c(618), w5Var.d(HttpStatus.SC_FORBIDDEN), w5Var.d(9), w5Var.d(77));
            case 3:
                return new bj7((Context) w5Var.c(12), (a84) w5Var.c(84), (lzf) w5Var.c(8), w5Var.d(10));
            case 4:
                return new e1g(w5Var.d(88));
            case 5:
                w5Var.d(HttpStatus.SC_FORBIDDEN);
                Context context = (Context) w5Var.c(12);
                if (kti.d(80 * vw4.d().getDisplayMetrics().density) <= 0) {
                    TypedValue.applyDimension(1, 80.0f, context.getResources().getDisplayMetrics());
                }
                if (rgf.b == null) {
                    synchronized (rgf.a) {
                        try {
                            if (rgf.b == null) {
                                rgf.b = new rgf();
                            }
                        } finally {
                        }
                    }
                }
                return rgf.b;
            case 6:
                return new g0g(w5Var.d(649), w5Var.d(88), w5Var.d(321), w5Var.d(79), w5Var.d(15), w5Var.d(123));
            case 7:
                return new jzf((Context) w5Var.c(12), new zid(w5Var.d(98)), (j0e) ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).d.getValue(), (fxa) w5Var.c(31), (iya) w5Var.c(431), (ie4) w5Var.c(189), (z7c) w5Var.c(32), (yi5) w5Var.c(9));
            case 8:
                return new u7();
            case 9:
                return new xpc(w5Var.d(249), w5Var.d(83));
            case 10:
                Context context2 = (Context) w5Var.c(12);
                m0g m0gVar = (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN);
                qb5 qb5Var = (qb5) w5Var.c(441);
                return new pb5(context2, m0gVar, qb5Var);
            case 11:
                return new sb5(w5Var.d(210), w5Var.d(97), w5Var.d(98), w5Var.d(HttpStatus.SC_FORBIDDEN), w5Var.d(9), w5Var.d(646));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Context context3 = (Context) w5Var.c(12);
                z7c z7cVar = (z7c) w5Var.c(70);
                u7 u7Var = (u7) w5Var.c(644);
                c7c c7cVar = (c7c) w5Var.c(210);
                ve2 ve2Var = (ve2) w5Var.c(97);
                qv3 qv3Var = (qv3) w5Var.c(98);
                w5Var.getClass();
                return new r1g(context3, z7cVar, u7Var, c7cVar, ve2Var, qv3Var);
            case 13:
                Context context4 = (Context) w5Var.c(12);
                tw0 tw0Var = (tw0) w5Var.c(49);
                bwf bwfVarD = w5Var.d(631);
                w5Var.getClass();
                b8a b8aVar = (b8a) w5Var.c(634);
                w5Var.getClass();
                bwf bwfVarD2 = w5Var.d(9);
                bwf bwfVarD3 = w5Var.d(143);
                w5Var.getClass();
                return new e30(context4, tw0Var, bwfVarD, b8aVar, bwfVarD2, bwfVarD3, w5Var.d(8));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new fi4((Context) w5Var.c(12), w5Var.d(472), w5Var.d(425), w5Var.d(HttpStatus.SC_GONE), w5Var.d(97), w5Var.d(310), w5Var.d(46), new bwf(new b31(w5Var, 7)));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new kw9((Context) w5Var.c(12), w5Var.d(76), w5Var.d(340), w5Var.d(HttpStatus.SC_FAILED_DEPENDENCY), w5Var.d(472), w5Var.d(292), w5Var.d(123), w5Var.d(399), (l4e) w5Var.c(397), w5Var.d(8), w5Var.d(122), w5Var.d(384), w5Var.d(321), w5Var.d(290), w5Var.d(323), w5Var.a(0));
            case 16:
                w5Var.d(97);
                return new b0g();
            case LangUtils.HASH_SEED /* 17 */:
                return new zk5(w5Var.d(249), w5Var.d(652), (Context) w5Var.c(12));
            case 18:
                iz5 iz5Var = (iz5) ((qx5) w5Var.c(137));
                iz5Var.getClass();
                return new a1f(iz5.g(iz5.g(iz5.b(iz5Var.c), "videoCache").getPath(), "exoPlayer"), new v18());
            case 19:
                return new rv5(w5Var.d(88));
            case 20:
                return new mub(w5Var.d(189), w5Var.d(79), (tw0) w5Var.c(49), w5Var.d(32), new bwf(new b31(w5Var, 8)), w5Var.d(98), w5Var.d(89), (yi5) w5Var.c(9));
            case 21:
                return new so3((Context) w5Var.c(12));
            case 22:
                return new d28(w5Var, (Context) w5Var.c(12), ((g4b) w5Var.c(56)).c(), new y6i(21, w5Var), new bwf(new b31(w5Var, 6)));
            case 23:
                sxg sxgVar = (sxg) w5Var.c(61);
                return new v3b(gw0.C(gw0.u(gw0.m(new p23(s8j.a(sxgVar.i), 3)), ((q2b) ((lzf) w5Var.c(8))).c().getImmediate()), d7j.a(eoi.a().plus((a84) w5Var.c(84))), yve.a, kpi.a(sxgVar.g.getInt("app.extra.text.size.mode", 1))));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new vpc(w5Var.d(12));
            case 25:
                return new q85(24);
            case 26:
                return new yd8(w5Var.d(603), w5Var.d(HttpStatus.SC_FORBIDDEN), w5Var.d(359));
            case 27:
                return new f28(w5Var);
            case 28:
                return new vob((Context) w5Var.c(12));
            default:
                Context context5 = (Context) w5Var.c(12);
                c28 c28Var = (c28) w5Var.c(629);
                vob vobVar = (vob) w5Var.c(444);
                return Build.VERSION.SDK_INT >= 29 ? new ae(context5, vobVar, c28Var) : new p28(context5, vobVar, c28Var);
        }
    }
}
