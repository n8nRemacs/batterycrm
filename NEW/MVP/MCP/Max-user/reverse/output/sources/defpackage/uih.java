package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.exception.ApiArgumentValidateException;

/* loaded from: classes2.dex */
public final class uih implements iq1 {
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public boolean v0;

    public uih(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11) {
        this.a = k18Var11;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.o = k18Var4;
        this.X = k18Var5;
        this.Y = k18Var6;
        this.Z = k18Var7;
        this.s0 = k18Var8;
        this.t0 = k18Var9;
        this.u0 = k18Var10;
        ((hw1) ((tv1) k18Var10.getValue())).e(this);
    }

    public final void a() {
        py4 py4Var;
        wqi.c("uih", "onAppGoesBackground", new Object[0]);
        this.v0 = false;
        if (((fxa) this.c.getValue()).b()) {
            if (((hw1) ((tv1) this.u0.getValue())).u()) {
                wqi.c("uih", "ignore onAppGoesBackground due to active call", new Object[0]);
                return;
            }
            s0c s0cVar = (s0c) this.d.getValue();
            s0cVar.getClass();
            wqi.c("s0c", "stopInteractivePings", new Object[0]);
            ((hwa) s0cVar.a.getValue()).B(false);
            py4 py4Var2 = s0cVar.f;
            if (py4Var2 != null && !py4Var2.e() && (py4Var = s0cVar.f) != null) {
                py4Var.dispose();
            }
            h8c h8cVar = (h8c) this.o.getValue();
            AtomicBoolean atomicBoolean = h8cVar.u0;
            if (atomicBoolean.get()) {
                h8cVar.f();
                atomicBoolean.set(false);
            }
            h8cVar.t0.O(h8cVar, h8c.v0[0], null);
            ((dkb) this.Y.getValue()).getClass();
            Iterator it = dkb.b.entrySet().iterator();
            while (it.hasNext()) {
                bkb bkbVar = (bkb) ((Map.Entry) it.next()).getValue();
                if (bkbVar.a.isEmpty()) {
                    v08 v08Var = bkbVar.b;
                    if (v08Var != null && !v08Var.e()) {
                        ty4.a(v08Var);
                    }
                    it.remove();
                }
            }
            dkb.c.clear();
            ((u0g) ((o0g) this.Z.getValue())).e(false);
            ((qv5) this.s0.getValue()).b.getClass();
        }
    }

    public final void b(boolean z) {
        int iOrdinal;
        wqi.c("uih", "onAppGoesForeground forceContactSync = %b", Boolean.valueOf(z));
        k18 k18Var = this.a;
        ((w0g) k18Var.getValue()).c(false);
        k18 k18Var2 = this.t0;
        ((ur3) k18Var2.getValue()).invalidate();
        if (!this.v0 && ((hw1) ((tv1) this.u0.getValue())).v()) {
            wqi.c("uih", "ignore onAppGoesForeground due to incoming call.", new Object[0]);
            return;
        }
        this.v0 = true;
        ((u0g) ((o0g) this.Z.getValue())).e(true);
        l5c l5cVar = ((z7c) this.b.getValue()).b;
        l5cVar.getClass();
        if (!l5cVar.j(PmsKey.f107netnewclientenabled, false) && !((ur3) k18Var2.getValue()).a() && k18Var.e()) {
            ((w0g) k18Var.getValue()).f();
        }
        ((s0c) this.d.getValue()).b();
        if (((fxa) this.c.getValue()).b()) {
            h8c h8cVar = (h8c) this.o.getValue();
            h8cVar.u0.set(true);
            if (((fxa) h8cVar.X.getValue()).b()) {
                hwa hwaVar = (hwa) h8cVar.Y.getValue();
                long jW = ((w4e) ((pb3) h8cVar.d.getValue())).w();
                hwaVar.getClass();
                if (!(jW >= 0) && (iOrdinal = hwaVar.s().ordinal()) != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            throw new ApiArgumentValidateException("invalid last sync time");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    wqi.e(hwaVar.a, "invalid last sync time", new ApiArgumentValidateException("invalid last sync time"));
                    hwa.q(hwaVar, new ur0(hwaVar.t().a.k(), null, jW));
                }
            }
            if (z) {
                ((kub) this.X.getValue()).b();
            }
        }
    }

    @Override // defpackage.iq1
    public final void l() {
        if (this.v0) {
            return;
        }
        a();
        wqi.c("uih", "Call was ended. Stop ping activity state.", new Object[0]);
    }

    @Override // defpackage.iq1
    public final void onCallAccepted() {
        if (this.v0) {
            return;
        }
        b(false);
        wqi.c("uih", "Call was accepted. Start ping activity state.", new Object[0]);
    }
}
