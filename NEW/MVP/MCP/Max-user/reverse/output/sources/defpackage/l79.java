package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class l79 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ o79 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l79(o79 o79Var, Looper looper) {
        super(looper);
        this.c = o79Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.a = this.a && z;
        if (this.b && z2) {
            z3 = true;
        }
        this.b = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        u69 u69Var;
        int iV;
        q4c q4cVar;
        o79 o79Var = this.c;
        z89 z89Var = o79Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        q4c q4cVarI = o79Var.s.i(o79Var.t.G(), o79Var.t.m(), o79Var.s.k);
        o79Var.s = q4cVarI;
        boolean z = this.a;
        boolean z2 = this.b;
        q4c q4cVarS = z89Var.S(q4cVarI);
        fde fdeVar = z89Var.d;
        wg7 wg7VarP = fdeVar.p();
        for (int i = 0; i < wg7VarP.size(); i++) {
            u69 u69Var2 = (u69) wg7VarP.get(i);
            try {
                dy dyVarV = fdeVar.v(u69Var2);
                if (dyVarV != null) {
                    iV = dyVarV.v();
                } else if (!o79Var.h(u69Var2)) {
                    break;
                } else {
                    iV = 0;
                }
                q4c q4cVarT = fdeVar.t(u69Var2);
                if (q4cVarT == null) {
                    fdeVar.s(u69Var2);
                    o3c o3cVarD = rei.d(fdeVar.n(u69Var2), o79Var.t.z());
                    try {
                        t69 t69Var = u69Var2.d;
                        hsi.h(t69Var);
                        if (q4cVarT == null) {
                            u69Var = u69Var2;
                            q4cVar = q4cVarS;
                        } else {
                            u69Var = u69Var2;
                            q4cVar = q4cVarT;
                        }
                        try {
                            t69Var.h(iV, q4cVar, o3cVarD, z, z2);
                        } catch (DeadObjectException unused) {
                            z89Var.d.H(u69Var);
                        } catch (RemoteException e) {
                            e = e;
                            a8i.m("MediaSessionImpl", "Exception in " + u69Var, e);
                        }
                    } catch (DeadObjectException unused2) {
                        u69Var = u69Var2;
                    } catch (RemoteException e2) {
                        e = e2;
                        u69Var = u69Var2;
                    }
                }
            } catch (DeadObjectException unused3) {
                u69Var = u69Var2;
            } catch (RemoteException e3) {
                e = e3;
                u69Var = u69Var2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
