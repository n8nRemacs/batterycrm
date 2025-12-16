package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lg5 implements Runnable {
    public static final String c = cei.m("EnqueueRunnable");
    public final p4i a;
    public final wib b;

    public lg5(p4i p4iVar, wib wibVar) {
        this.a = p4iVar;
        this.b = wibVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ab  */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(defpackage.p4i r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg5.a(p4i):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        wib wibVar = this.b;
        p4i p4iVar = this.a;
        c5i c5iVar = p4iVar.a;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(p4iVar.e);
            HashSet hashSetE = p4i.e(p4iVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(p4iVar.e);
                    z = false;
                    break;
                } else if (hashSetE.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + p4iVar + ")");
            }
            WorkDatabase workDatabase = c5iVar.c;
            workDatabase.c();
            try {
                boolean zA = a(p4iVar);
                workDatabase.q();
                if (zA) {
                    klb.a(c5iVar.a, RescheduleReceiver.class, true);
                    v0e.a(c5iVar.b, c5iVar.c, c5iVar.e);
                }
                wibVar.B(vib.P);
            } finally {
                workDatabase.k();
            }
        } catch (Throwable th) {
            wibVar.B(new sib(th));
        }
    }
}
