package defpackage;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference$NullReferenceException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class vc3 implements Cloneable, Closeable {
    public static final tha X;
    public static final rha o;
    public boolean a = false;
    public final vve b;
    public final uc3 c;
    public final Throwable d;

    static {
        int i = 16;
        o = new rha(i);
        X = new tha(i);
    }

    public vc3(vve vveVar, uc3 uc3Var, Throwable th) {
        int i;
        boolean z;
        vveVar.getClass();
        this.b = vveVar;
        synchronized (vveVar) {
            synchronized (vveVar) {
                i = vveVar.b;
                z = i > 0;
            }
            this.c = uc3Var;
            this.d = th;
        }
        if (!z) {
            throw new SharedReference$NullReferenceException();
        }
        vveVar.b = i + 1;
        this.c = uc3Var;
        this.d = th;
    }

    public static void P(vc3 vc3Var) {
        if (vc3Var != null) {
            vc3Var.close();
        }
    }

    public static void Q(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                P((vc3) it.next());
            }
        }
    }

    public static boolean i0(vc3 vc3Var) {
        return vc3Var != null && vc3Var.h0();
    }

    public static qk4 j0(Closeable closeable) {
        return k0(closeable, o, X);
    }

    public static qk4 k0(Object obj, fod fodVar, uc3 uc3Var) {
        if (obj == null) {
            return null;
        }
        uc3Var.m();
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof sc3;
        }
        return new qk4(obj, fodVar, uc3Var, null, true);
    }

    public static vc3 y(vc3 vc3Var) {
        if (vc3Var != null) {
            return vc3Var.w();
        }
        return null;
    }

    public final synchronized Object Z() {
        Object objA;
        l5j.f(!this.a);
        objA = this.b.a();
        objA.getClass();
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0075 A[ORIG_RETURN, RETURN] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.a     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto La
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L89
        La:
            r0 = 1
            r5.a = r0     // Catch: java.lang.Throwable -> L7
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7
            vve r0 = r5.b
            monitor-enter(r0)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L76
            int r1 = r0.b     // Catch: java.lang.Throwable -> L84
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L1a
            r4 = r3
            goto L1b
        L1a:
            r4 = r2
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L7e
            if (r1 <= 0) goto L21
            r2 = r3
        L21:
            if (r2 == 0) goto L78
            int r1 = r0.b     // Catch: java.lang.Throwable -> L76
            int r1 = r1 - r3
            r0.b = r1     // Catch: java.lang.Throwable -> L76
            monitor-exit(r0)
            if (r1 != 0) goto L75
            monitor-enter(r0)
            java.lang.Object r1 = r0.a     // Catch: java.lang.Throwable -> L72
            r2 = 0
            r0.a = r2     // Catch: java.lang.Throwable -> L72
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L75
            fod r0 = r0.c
            if (r0 == 0) goto L3b
            r0.b(r1)
        L3b:
            java.util.IdentityHashMap r0 = defpackage.vve.d
            monitor-enter(r0)
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L58
            java.lang.String r2 = "SharedReference"
            java.lang.String r3 = "No entry in sLiveObjects for value of type %s"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L56
            defpackage.op5.n(r2, r3, r1)     // Catch: java.lang.Throwable -> L56
            goto L6e
        L56:
            r1 = move-exception
            goto L70
        L58:
            int r4 = r2.intValue()     // Catch: java.lang.Throwable -> L56
            if (r4 != r3) goto L62
            r0.remove(r1)     // Catch: java.lang.Throwable -> L56
            goto L6e
        L62:
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L56
            int r2 = r2 - r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L56
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L56
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L75
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r1
        L72:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            throw r1
        L75:
            return
        L76:
            r1 = move-exception
            goto L87
        L78:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L76
            r1.<init>()     // Catch: java.lang.Throwable -> L76
            throw r1     // Catch: java.lang.Throwable -> L76
        L7e:
            com.facebook.common.references.SharedReference$NullReferenceException r1 = new com.facebook.common.references.SharedReference$NullReferenceException     // Catch: java.lang.Throwable -> L76
            r1.<init>()     // Catch: java.lang.Throwable -> L76
            throw r1     // Catch: java.lang.Throwable -> L76
        L84:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L76
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            throw r1
        L89:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc3.close():void");
    }

    public synchronized boolean h0() {
        return !this.a;
    }

    /* renamed from: l */
    public abstract vc3 clone();

    public synchronized vc3 w() {
        if (!h0()) {
            return null;
        }
        return clone();
    }

    public vc3(Object obj, fod fodVar, uc3 uc3Var, Throwable th, boolean z) {
        this.b = new vve(obj, fodVar, z);
        this.c = uc3Var;
        this.d = th;
    }
}
