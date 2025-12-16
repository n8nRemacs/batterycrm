package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u8c implements uqa {
    public final l22 a;
    public final j8a b;
    public z8c c;
    public final bma d;
    public sn6 e;
    public boolean f = false;

    public u8c(l22 l22Var, j8a j8aVar, bma bmaVar) {
        this.a = l22Var;
        this.b = j8aVar;
        this.d = bmaVar;
        synchronized (this) {
            this.c = (z8c) j8aVar.d();
        }
    }

    @Override // defpackage.uqa
    public final void a(Object obj) {
        m22 m22Var = (m22) obj;
        m22 m22Var2 = m22.CLOSING;
        z8c z8cVar = z8c.a;
        if (m22Var == m22Var2 || m22Var == m22.CLOSED || m22Var == m22.RELEASING || m22Var == m22.RELEASED) {
            b(z8cVar);
            if (this.f) {
                this.f = false;
                sn6 sn6Var = this.e;
                if (sn6Var != null) {
                    sn6Var.cancel(false);
                    this.e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((m22Var == m22.OPENING || m22Var == m22.OPEN || m22Var == m22.PENDING_OPEN) && !this.f) {
            b(z8cVar);
            ArrayList arrayList = new ArrayList();
            l22 l22Var = this.a;
            sn6 sn6VarA = sn6.a(ixi.a(new z9a(this, l22Var, arrayList)));
            xu9 xu9Var = new xu9(14, this);
            ex4 ex4VarA = ayi.a();
            sn6VarA.getClass();
            q72 q72VarL = wsf.l(sn6VarA, xu9Var, ex4VarA);
            t12 t12Var = new t12(2, this);
            q72 q72VarL2 = wsf.l(q72VarL, new usd(19, t12Var), ayi.a());
            this.e = q72VarL2;
            wsf.b(q72VarL2, new sa9(this, arrayList, l22Var), ayi.a());
            this.f = true;
        }
    }

    public final void b(z8c z8cVar) {
        synchronized (this) {
            try {
                if (this.c.equals(z8cVar)) {
                    return;
                }
                this.c = z8cVar;
                gri.a("StreamStateObserver", "Update Preview stream state to " + z8cVar);
                this.b.i(z8cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uqa
    public final void onError(Throwable th) {
        sn6 sn6Var = this.e;
        if (sn6Var != null) {
            sn6Var.cancel(false);
            this.e = null;
        }
        b(z8c.a);
    }
}
