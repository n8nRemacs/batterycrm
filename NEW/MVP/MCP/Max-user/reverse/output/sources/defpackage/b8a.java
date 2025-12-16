package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class b8a implements l7a, wq {
    public static final long S0;
    public static final long T0;
    public static final /* synthetic */ int U0 = 0;
    public Handler A0;
    public final tcf C0;
    public final hbd D0;
    public final tcf E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public final float J0;
    public boolean K0;
    public k09 L0;
    public k09 M0;
    public w19 N0;
    public long O0;
    public float P0;
    public final tcf Q0;
    public final hbd R0;
    public final tw0 X;
    public final o3b Y;
    public final ContextScope Z;
    public final Context a;
    public final lzf b;
    public final iz5 c;
    public final qi9 d;
    public final pb3 o;
    public final k18 s0;
    public final k18 t0;
    public volatile x9f u0;
    public int v0;
    public px8 w0;
    public o7a x0;
    public final CopyOnWriteArraySet y0 = new CopyOnWriteArraySet();
    public final LinkedHashMap z0 = new LinkedHashMap();
    public final gq5 B0 = new gq5(25, this);

    static {
        int i = s65.d;
        y65 y65Var = y65.SECONDS;
        S0 = v9j.h(1, y65Var);
        T0 = v9j.h(3, y65Var);
    }

    public b8a(Context context, age ageVar, lzf lzfVar, iz5 iz5Var, qi9 qi9Var, pb3 pb3Var, tw0 tw0Var, tih tihVar, o3b o3bVar, a84 a84Var, k18 k18Var, k18 k18Var2) {
        this.a = context;
        this.b = lzfVar;
        this.c = iz5Var;
        this.d = qi9Var;
        this.o = pb3Var;
        this.X = tw0Var;
        this.Y = o3bVar;
        this.s0 = k18Var;
        this.t0 = k18Var2;
        this.Z = d7j.a(((q2b) lzfVar).c().getImmediate().plus(zk6.a()).plus(a84Var));
        tcf tcfVarA = ucf.a(-1L);
        this.C0 = tcfVarA;
        this.D0 = new hbd(tcfVarA);
        this.E0 = ucf.a(-1L);
        this.F0 = 1;
        this.J0 = 1.0f;
        this.K0 = true;
        this.O0 = -1L;
        this.P0 = 1.0f;
        tihVar.c(this);
        if (tihVar.d()) {
            f();
        }
        tcf tcfVarA2 = ucf.a(Float.valueOf(0.0f));
        this.Q0 = tcfVarA2;
        this.R0 = new hbd(tcfVarA2);
    }

    public static final k09 a(b8a b8aVar, int i) {
        px8 px8Var;
        if (i == -1 || (px8Var = b8aVar.w0) == null) {
            return null;
        }
        return px8Var.v().m(i, px8Var.a, 0L).c;
    }

    public static final void g(b8a b8aVar) {
        wqi.c("b8a", "afterConnect", new Object[0]);
        b8aVar.v0 = 0;
        svi.e(b8aVar.Z, null, null, new a8a(b8aVar, null), 3);
        if (b8aVar.x0 == null) {
            o7a o7aVar = new o7a(b8aVar);
            px8 px8Var = b8aVar.w0;
            if (px8Var != null) {
                px8Var.b(o7aVar);
            }
            b8aVar.x0 = o7aVar;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "b8a", "notifyListeners: onConnectedToMediaSession", null);
            }
        }
        synchronized (b8aVar.y0) {
            Iterator it = b8aVar.y0.iterator();
            while (it.hasNext()) {
                ((n7a) it.next()).a(b8aVar.j(), b8aVar.k());
            }
        }
    }

    public static k09 h(String str, String str2, l09 l09Var, String str3, String str4, Bundle bundle) {
        a09 a09Var;
        oz8 oz8Var = new oz8();
        uz8 uz8Var = new uz8();
        List list = Collections.EMPTY_LIST;
        zjd zjdVar = zjd.o;
        wz8 wz8Var = new wz8();
        d09 d09Var = d09.d;
        Uri uri = str == null ? null : Uri.parse(str);
        str2.getClass();
        u19 u19Var = new u19();
        u19Var.b = str3;
        u19Var.a = str4;
        u19Var.H = bundle;
        u19Var.G = Integer.valueOf(l09Var.ordinal());
        w19 w19Var = new w19(u19Var);
        hsi.g(uz8Var.b == null || uz8Var.a != null);
        vz8 vz8Var = null;
        if (uri != null) {
            if (uz8Var.a != null) {
                vz8Var = new vz8(uz8Var);
            }
            a09Var = new a09(uri, null, vz8Var, null, list, null, zjdVar, -9223372036854775807L);
        } else {
            a09Var = null;
        }
        return new k09(str2, new sz8(oz8Var), a09Var, new yz8(wz8Var), w19Var, d09Var);
    }

    public final void b(j7a j7aVar) {
        synchronized (this.y0) {
            try {
                p7a p7aVar = new p7a(j7aVar);
                n7a n7aVar = (n7a) this.z0.put(j7aVar, p7aVar);
                if (n7aVar != null) {
                    this.y0.remove(n7aVar);
                }
                this.y0.add(p7aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wq
    public final void c() {
        wqi.c("b8a", "disconnect: ", new Object[0]);
        e();
        this.u0 = svi.e(this.Z, null, null, new r7a(this, null), 3);
    }

    public final void d() {
        wqi.c("b8a", "cancelPositionObserving", new Object[0]);
        Handler handler = this.A0;
        if (handler != null) {
            handler.removeCallbacks(this.B0);
        }
    }

    public final void e() {
        wqi.c("b8a", "cancelScheduledConnectionAction", new Object[0]);
        x9f x9fVar = this.u0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.u0 = null;
    }

    public final void f() {
        e();
        this.u0 = svi.e(this.Z, null, null, new q7a(this, null), 3);
    }

    public final void i(boolean z) {
        wqi.c("b8a", "disconnectNow started", new Object[0]);
        Handler handler = this.A0;
        if (handler != null) {
            handler.removeCallbacks(this.B0);
        }
        this.A0 = null;
        svi.e(this.Z, null, null, new a8a(this, null), 3);
        if (z) {
            e();
        }
    }

    public final long j() {
        String str;
        Long lI;
        k09 k09Var = this.L0;
        if (k09Var == null || (str = k09Var.a) == null || (lI = cnf.i(str)) == null) {
            return -1L;
        }
        return lI.longValue();
    }

    public final l09 k() {
        Object next;
        w19 w19Var;
        Integer num;
        k09 k09Var = this.L0;
        int iIntValue = (k09Var == null || (w19Var = k09Var.d) == null || (num = w19Var.H) == null) ? -1 : num.intValue();
        f2 f2Var = new f2(0, l09.X);
        while (true) {
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((l09) next).ordinal() == iIntValue) {
                break;
            }
        }
        l09 l09Var = (l09) next;
        return l09Var == null ? l09.a : l09Var;
    }

    public final k7a l() {
        w19 w19Var = this.N0;
        Map map = null;
        if (w19Var == null) {
            return null;
        }
        CharSequence charSequence = w19Var.b;
        CharSequence charSequence2 = w19Var.a;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        Bundle bundle = w19Var.I;
        if (bundle != null) {
            Set<String> setKeySet = bundle.keySet();
            int i = to8.i(we3.q(setKeySet, 10));
            if (i < 16) {
                i = 16;
            }
            Map linkedHashMap = new LinkedHashMap(i);
            for (String str : setKeySet) {
                linkedHashMap.put(str, bundle.get(str));
            }
            map = linkedHashMap;
        }
        if (map == null) {
            map = id5.a;
        }
        return new k7a(charSequence, charSequence2, map);
    }

    public final boolean m() {
        return !(this.H0 || this.G0 || ((Number) this.R0.a.getValue()).floatValue() != 1.0f) || this.F0 == 4;
    }

    @Override // defpackage.wq
    public final void n() {
        f();
    }

    public final void o() {
        svi.e(this.Z, null, null, new t7a(this, null), 3);
    }

    public final void p() {
        svi.e(this.Z, null, null, new u7a(this, null), 3);
    }

    public final void q() {
        px8 px8Var = this.w0;
        if (fni.a(px8Var != null ? px8Var.d() : null, this.L0)) {
            this.L0 = null;
        }
        px8 px8Var2 = this.w0;
        if (px8Var2 != null) {
            Integer numValueOf = Integer.valueOf(px8Var2.t());
            Integer num = numValueOf.intValue() >= 0 ? numValueOf : null;
            if (num != null) {
                int iIntValue = num.intValue();
                px8 px8Var3 = this.w0;
                if (px8Var3 != null) {
                    px8Var3.D();
                    ox8 ox8Var = px8Var3.c;
                    if (ox8Var.isConnected()) {
                        ox8Var.I(iIntValue);
                    } else {
                        a8i.l("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
                    }
                }
            }
        }
    }

    public final void r(j7a j7aVar) {
        synchronized (this.y0) {
            n7a n7aVar = (n7a) this.z0.remove(j7aVar);
            if (n7aVar != null) {
                this.y0.remove(n7aVar);
            }
        }
    }

    public final void s() {
        svi.e(this.Z, null, null, new z7a(this, null), 3);
    }

    public final void t() {
        wqi.c("b8a", "tryToStartPositionObserving", new Object[0]);
        d();
        if (this.A0 == null) {
            this.A0 = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.A0;
        if (handler != null) {
            handler.post(this.B0);
        }
    }
}
