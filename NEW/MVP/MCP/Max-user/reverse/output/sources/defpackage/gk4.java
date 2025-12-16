package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class gk4 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 0;
    public final int b;
    public final int c;
    public final Object d;
    public final Object o;

    public gk4(hk4 hk4Var, uo0 uo0Var, bp0 bp0Var, int i, int i2) {
        this.X = hk4Var;
        this.d = uo0Var;
        this.o = bp0Var;
        this.b = i;
        this.c = i2;
    }

    public boolean a(int i, int i2) {
        vc3 vc3VarP;
        hk4 hk4Var = (hk4) this.X;
        uo0 uo0Var = (uo0) this.d;
        int i3 = 2;
        try {
            if (i2 == 1) {
                vc3VarP = ((bp0) this.o).p();
            } else {
                if (i2 != 2) {
                    return false;
                }
                try {
                    vc3VarP = ((r2c) hk4Var.a).c(uo0Var.k, uo0Var.l, (Bitmap.Config) hk4Var.c);
                    i3 = -1;
                } catch (RuntimeException e) {
                    hk4Var.getClass();
                    op5.i(hk4.class, "Failed to create frame bitmap", e);
                    return false;
                }
            }
            vc3 vc3Var = vc3VarP;
            boolean zB = b(i, vc3Var, i2);
            vc3.P(vc3Var);
            return (zB || i3 == -1) ? zB : a(i, i3);
        } catch (Throwable th) {
            vc3.P(null);
            throw th;
        }
    }

    public boolean b(int i, vc3 vc3Var, int i2) {
        if (!vc3.i0(vc3Var) || vc3Var == null || !((we) ((hk4) this.X).b).n((Bitmap) vc3Var.Z(), i)) {
            return false;
        }
        ((hk4) this.X).getClass();
        op5.d(hk4.class, Integer.valueOf(i), "Frame %d ready.");
        synchronized (((SparseArray) ((hk4) this.X).o)) {
            ((bp0) this.o).o(i, vc3Var);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        SparseArray sparseArray;
        pv8 pv8Var;
        switch (this.a) {
            case 0:
                try {
                    if (((bp0) this.o).d(this.b)) {
                        ((hk4) this.X).getClass();
                        op5.d(hk4.class, Integer.valueOf(this.b), "Frame %d is cached already.");
                        hk4 hk4Var = (hk4) this.X;
                        sparseArray = (SparseArray) hk4Var.o;
                        synchronized (sparseArray) {
                            ((SparseArray) hk4Var.o).remove(this.c);
                        }
                    } else {
                        if (a(this.b, 1)) {
                            ((hk4) this.X).getClass();
                            op5.d(hk4.class, Integer.valueOf(this.b), "Prepared frame %d.");
                        } else {
                            ((hk4) this.X).getClass();
                            op5.b(hk4.class, "Could not prepare frame %d.", Integer.valueOf(this.b));
                        }
                        hk4 hk4Var2 = (hk4) this.X;
                        sparseArray = (SparseArray) hk4Var2.o;
                        synchronized (sparseArray) {
                            ((SparseArray) hk4Var2.o).remove(this.c);
                        }
                    }
                    return;
                } catch (Throwable th) {
                    hk4 hk4Var3 = (hk4) this.X;
                    synchronized (((SparseArray) hk4Var3.o)) {
                        ((SparseArray) hk4Var3.o).remove(this.c);
                        throw th;
                    }
                }
            default:
                wv8 wv8Var = (wv8) this.d;
                IBinder binder = wv8Var.a.getBinder();
                t9f t9fVar = (t9f) this.X;
                ((k89) t9fVar.b).o.remove(binder);
                k89 k89Var = (k89) t9fVar.b;
                Iterator it = k89Var.d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        pv8 pv8Var2 = (pv8) it.next();
                        if (pv8Var2.c == this.b) {
                            pv8Var = (TextUtils.isEmpty((String) this.o) || this.c <= 0) ? new pv8(k89Var, pv8Var2.a, pv8Var2.b, pv8Var2.c, wv8Var) : null;
                            it.remove();
                        }
                    }
                }
                if (pv8Var == null) {
                    pv8Var = new pv8(k89Var, (String) this.o, this.c, this.b, wv8Var);
                }
                k89Var.o.put(binder, pv8Var);
                try {
                    binder.linkToDeath(pv8Var, 0);
                    return;
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                    return;
                }
        }
    }

    public gk4(t9f t9fVar, wv8 wv8Var, int i, String str, int i2, Bundle bundle) {
        this.X = t9fVar;
        this.d = wv8Var;
        this.b = i;
        this.o = str;
        this.c = i2;
    }
}
