package defpackage;

import java.util.Iterator;
import java.util.Set;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* loaded from: classes2.dex */
public final class eaa extends i3 implements bce, ace {
    public final boolean A0;
    public qu1 B0;
    public final b2h X;
    public Object Y;
    public long Z;
    public final ActLocalMedias c;
    public me8 d;
    public pd8 o;
    public p2h s0;
    public zub t0;
    public final dd u0;
    public final dce v0;
    public final qx5 w0;
    public final ao6 x0;
    public final yi5 y0;
    public final boolean z0;

    public eaa(eba ebaVar, ActLocalMedias actLocalMedias, boolean z, boolean z2, dd ddVar, dce dceVar, iz5 iz5Var, ao6 ao6Var, yi5 yi5Var, b2h b2hVar) {
        super(0, ebaVar);
        this.c = actLocalMedias;
        this.z0 = z;
        this.A0 = z2;
        this.v0 = dceVar;
        this.u0 = ddVar;
        this.w0 = iz5Var;
        this.x0 = ao6Var;
        this.y0 = yi5Var;
        this.X = b2hVar;
        ebaVar.p(this);
        le8 le8Var = new le8();
        le8Var.b = false;
        le8Var.d = z;
        le8Var.e = false;
        le8Var.g = false;
        le8Var.h = false;
        le8Var.i = gsc.X;
        le8Var.k = 0;
        le8Var.n = false;
        if (dceVar.k == 2) {
            le8Var.b = false;
        }
        me8 me8Var = new me8(le8Var);
        this.d = me8Var;
        ebaVar.z(me8Var);
    }

    public final void L0(pd8 pd8Var) {
        wqi.c("eaa", "setLocalMedia: %s", pd8Var.c);
        this.o = pd8Var;
        this.t0 = this.v0.e(pd8Var);
        bwd.b(this.B0);
        bwd.b(null);
        int i = 2;
        int i2 = 1;
        if (pd8Var.b()) {
            P0(new y9a(this, i2));
            wqi.c("eaa", "setupVideoLocalMedia", new Object[0]);
            bwd.b(this.B0);
            if (!((pd8Var instanceof g00) && l8g.c(((g00) pd8Var).t0.s)) && this.A0) {
                P0(new lz1(14));
                wqi.c("eaa", "initVideoLocalMedias", new Object[0]);
                k2f k2fVar = new k2f(new wk3(2, new aaa(this, i2)).m(u0e.a()).i(de.a()), new aaa(this, i), i2);
                gk0 gk0Var = new gk0(9, this);
                qu1 qu1Var = new qu1(pdf.e, 2, pdf.f);
                try {
                    k2fVar.k(new tk3(qu1Var, 7, gk0Var));
                    this.B0 = qu1Var;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    raj.c(th);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } else {
                wqi.c("eaa", "localMedia instanceof EditAttachLocalMedia -> can't edit video -> hide controls", new Object[0]);
                P0(new lz1(13));
            }
        } else if (pd8Var.a != 1 || pd8Var.d()) {
            P0(new lz1(12));
        } else {
            P0(new y9a(this, i));
            P0(new y9a(this, 4));
            P0(new y9a(this, 0));
        }
        P0(new y9a(this, 3));
    }

    public final void M0() {
        pd8 pd8Var = this.o;
        if (pd8Var == null) {
            return;
        }
        boolean zB = pd8Var.b();
        dce dceVar = this.v0;
        if (zB) {
            if (dceVar.j(this.o)) {
                dceVar.r(this.o);
                return;
            } else {
                O0();
                return;
            }
        }
        pd8 pd8Var2 = this.o;
        if (pd8Var2.a != 1) {
            dceVar.r(pd8Var2);
            return;
        }
        if (!dceVar.j(pd8Var2)) {
            dceVar.r(this.o);
            return;
        }
        pd8 pd8Var3 = this.o;
        Set set = dceVar.e;
        fce fceVarH = dceVar.h(pd8Var3);
        if (fceVarH != null) {
            fceVarH.f = false;
        }
        dceVar.n();
        if (fceVarH == null || set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                ((kq6) it.next()).a(fceVarH);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    public final void N0() {
        pd8 pd8Var = this.o;
        zub zubVar = this.t0;
        dce dceVar = this.v0;
        dceVar.a(pd8Var, dceVar.a.size());
        fce fceVarH = dceVar.h(pd8Var);
        if (fceVarH != null) {
            fceVarH.c = zubVar;
        }
        dceVar.b.put(Long.valueOf(pd8Var.b), zubVar);
        dceVar.m(fceVarH);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
    public final void O0() {
        Object next;
        p2h p2hVar = this.s0;
        dce dceVar = this.v0;
        if (p2hVar == null) {
            dceVar.q(this.o, null);
            return;
        }
        ?? r0 = this.Y;
        if (r0 == 0) {
            next = null;
        } else {
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                next = it.next();
                try {
                    if (((isc) next).a == this.s0.a) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            next = null;
        }
        isc iscVar = (isc) next;
        if (iscVar == null || iscVar.f) {
            p2h p2hVar2 = this.s0;
            if (p2hVar2.b == 0.0f && p2hVar2.c == 1.0f && !p2hVar2.d) {
                dceVar.q(this.o, null);
                return;
            }
        }
        dceVar.q(this.o, this.s0);
    }

    public final void P0(dn6 dn6Var) {
        me8 me8Var = this.d;
        le8 le8Var = new le8();
        le8Var.a = me8Var.a;
        le8Var.b = me8Var.b;
        le8Var.c = me8Var.c;
        le8Var.d = me8Var.d;
        le8Var.e = me8Var.o;
        le8Var.f = me8Var.X;
        le8Var.g = me8Var.Y;
        le8Var.h = me8Var.Z;
        le8Var.i = me8Var.s0;
        le8Var.j = me8Var.t0;
        le8Var.k = me8Var.u0;
        le8Var.l = me8Var.v0;
        le8Var.m = me8Var.w0;
        le8Var.n = me8Var.x0;
        le8Var.o = me8Var.y0;
        le8 le8Var2 = (le8) dn6Var.apply(le8Var);
        le8Var2.getClass();
        me8 me8Var2 = new me8(le8Var2);
        if (me8Var2.equals(this.d)) {
            return;
        }
        wqi.c("eaa", "updateViewState: %s", this.d);
        this.d = me8Var2;
        ((eba) ((oaa) this.b)).z(me8Var2);
    }

    @Override // defpackage.ace
    public final void R(fce fceVar) {
        P0(new y9a(this, 0));
        P0(new y9a(this, 4));
    }

    @Override // defpackage.bce
    public final void X(Set set) {
        P0(new y9a(this, 3));
    }
}
