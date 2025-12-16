package defpackage;

import android.os.Process;

/* loaded from: classes2.dex */
public final class ge implements s7g {
    public static final ge a = new ge();
    public static final f8a b;

    static {
        f8a f8aVar = new f8a(10);
        f8aVar.e(1, 10);
        f8aVar.e(2, 16);
        f8aVar.e(3, 13);
        f8aVar.e(4, 16);
        f8aVar.e(5, 0);
        f8aVar.e(6, -2);
        f8aVar.e(7, -4);
        f8aVar.e(8, -6);
        f8aVar.e(9, -5);
        f8aVar.e(10, -8);
        b = f8aVar;
    }

    @Override // defpackage.s7g
    public final void a(int i) {
        f8a f8aVar = b;
        int iB = f8aVar.b(i);
        int i2 = iB >= 0 ? f8aVar.c[iB] : -1;
        if (i2 == -1) {
            return;
        }
        try {
            Process.setThreadPriority(i2);
        } catch (Throwable unused) {
        }
    }
}
