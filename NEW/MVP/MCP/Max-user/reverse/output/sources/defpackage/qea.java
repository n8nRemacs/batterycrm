package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qea implements cf5 {
    public static qea X;
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object o;

    public qea(String str, i17 i17Var) throws NumberFormatException {
        boolean z;
        int i;
        this.d = new HashMap();
        this.c = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            gri.i("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.a = z;
        this.b = i;
        this.o = i17Var;
    }

    public static synchronized qea a(Context context) {
        try {
            if (X == null) {
                X = new qea(context, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return X;
    }

    public int b() {
        int i;
        synchronized (this.o) {
            i = this.b;
        }
        return i;
    }

    public void c(ck4 ck4Var, Executor executor) {
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            nea neaVar = (nea) it.next();
            if (neaVar.a.get() == null) {
                copyOnWriteArrayList.remove(neaVar);
            }
        }
        nea neaVar2 = new nea(this, ck4Var, executor);
        synchronized (this.o) {
            ((CopyOnWriteArrayList) this.d).add(neaVar2);
            z = this.a;
        }
        if (z) {
            neaVar2.b.execute(new gq5(27, neaVar2));
        }
    }

    public void d(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            nea neaVar = (nea) it.next();
            if (neaVar.a.get() == null) {
                copyOnWriteArrayList.remove(neaVar);
            }
        }
        synchronized (this.o) {
            try {
                if (this.a && this.b == i) {
                    return;
                }
                this.a = true;
                this.b = i;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    nea neaVar2 = (nea) it2.next();
                    neaVar2.b.execute(new gq5(27, neaVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cf5
    public boolean i(int i) {
        return this.a && n(i) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01de  */
    @Override // defpackage.cf5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.df5 n(int r20) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qea.n(int):df5");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qea(android.content.Context r18, int r19) {
        /*
            Method dump skipped, instructions count: 8682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qea.<init>(android.content.Context, int):void");
    }
}
