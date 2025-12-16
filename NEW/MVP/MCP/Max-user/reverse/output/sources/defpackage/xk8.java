package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class xk8 implements np0 {
    public final py0 a = new py0(4);
    public final int b;
    public final x5c c;
    public int d;

    public xk8(int i, wha whaVar) {
        this.b = i;
        this.c = whaVar;
    }

    @Override // defpackage.qf9
    public final void a(pf9 pf9Var) {
        e((int) ((1.0d - pf9Var.a) * 0));
    }

    @Override // defpackage.u5c, defpackage.fod
    public final void b(Object obj) {
        boolean zAdd;
        Bitmap bitmap = (Bitmap) obj;
        this.a.getClass();
        int iD = xp0.d(bitmap);
        if (iD <= this.b) {
            this.c.getClass();
            py0 py0Var = this.a;
            py0Var.getClass();
            if (py0.H(bitmap)) {
                synchronized (py0Var) {
                    zAdd = ((HashSet) py0Var.b).add(bitmap);
                }
                if (zAdd) {
                    u5i u5iVar = (u5i) py0Var.c;
                    int iD2 = xp0.d(bitmap);
                    synchronized (u5iVar) {
                        try {
                            gu0 gu0Var = (gu0) ((SparseArray) u5iVar.a).get(iD2);
                            if (gu0Var == null) {
                                LinkedList linkedList = new LinkedList();
                                gu0Var = new gu0();
                                gu0Var.a = null;
                                gu0Var.b = iD2;
                                gu0Var.c = linkedList;
                                gu0Var.d = null;
                                ((SparseArray) u5iVar.a).put(iD2, gu0Var);
                            }
                            gu0Var.c.addLast(bitmap);
                            if (((gu0) u5iVar.b) != gu0Var) {
                                u5iVar.q(gu0Var);
                                gu0 gu0Var2 = (gu0) u5iVar.b;
                                if (gu0Var2 == null) {
                                    u5iVar.b = gu0Var;
                                    u5iVar.c = gu0Var;
                                } else {
                                    gu0Var.d = gu0Var2;
                                    gu0Var2.a = gu0Var;
                                    u5iVar.b = gu0Var;
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            synchronized (this) {
                this.d += iD;
            }
        }
    }

    public final synchronized void e(int i) {
        Bitmap bitmap;
        while (this.d > i && (bitmap = (Bitmap) this.a.J()) != null) {
            this.a.getClass();
            this.d -= xp0.d(bitmap);
            this.c.getClass();
        }
    }

    @Override // defpackage.u5c
    public final Object get(int i) {
        synchronized (this) {
            try {
                if (this.d > 0) {
                    e(0);
                }
                Bitmap bitmapY = this.a.y(i);
                if (bitmapY == null) {
                    this.c.getClass();
                    return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
                }
                this.a.getClass();
                this.d -= xp0.d(bitmapY);
                this.c.getClass();
                return bitmapY;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
