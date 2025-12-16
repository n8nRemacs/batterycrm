package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.impl.C23612w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.Y;
import java.util.HashSet;

/* compiled from: EnqueueRunnable.java */
@RestrictTo
/* renamed from: androidx.work.impl.utils.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23595e {
    static {
        androidx.work.G.b("EnqueueRunnable");
    }

    public static void a(@j.N androidx.work.impl.G g12) {
        g12.getClass();
        if (androidx.work.impl.G.b(g12, new HashSet())) {
            throw new IllegalStateException("WorkContinuation has cycles (" + g12 + ")");
        }
        Y y12 = g12.f55526a;
        WorkDatabase workDatabase = y12.f55559d;
        workDatabase.c();
        try {
            C23596f.a(workDatabase, y12.f55558c, g12);
            boolean zB2 = b(g12);
            workDatabase.s();
            if (zB2) {
                C23612w.b(y12.f55558c, y12.f55559d, y12.f55561f);
            }
        } finally {
            workDatabase.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ab  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(@j.N androidx.work.impl.G r25) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.C23595e.b(androidx.work.impl.G):boolean");
    }
}
