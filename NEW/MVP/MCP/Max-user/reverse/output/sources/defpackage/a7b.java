package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a7b implements rf9, ComponentCallbacks2 {
    public final ConcurrentHashMap.KeySetView a = ConcurrentHashMap.newKeySet();
    public final k18 b;

    public a7b(k18 k18Var) {
        this.b = k18Var;
    }

    @Override // defpackage.rf9
    public final void a(qf9 qf9Var) {
        this.a.add(qf9Var);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[PHI: r2
  0x0024: PHI (r2v1 pf9) = (r2v0 pf9), (r2v0 pf9), (r2v2 pf9), (r2v2 pf9) binds: [B:9:0x0013, B:11:0x0017, B:13:0x001d, B:15:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.ComponentCallbacks2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTrimMemory(int r4) {
        /*
            r3 = this;
            r0 = 5
            pf9 r1 = defpackage.pf9.OnSystemLowMemoryWhileAppInForeground
            if (r4 == r0) goto L25
            r0 = 10
            if (r4 == r0) goto L25
            r0 = 15
            pf9 r1 = defpackage.pf9.OnCloseToDalvikHeapLimit
            if (r4 == r0) goto L25
            r0 = 20
            pf9 r2 = defpackage.pf9.OnAppBackgrounded
            if (r4 == r0) goto L24
            r0 = 40
            if (r4 == r0) goto L24
            r0 = 60
            pf9 r2 = defpackage.pf9.OnSystemLowMemoryWhileAppInBackgroundLowSeverity
            if (r4 == r0) goto L24
            r0 = 80
            if (r4 == r0) goto L24
            goto L25
        L24:
            r1 = r2
        L25:
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = r3.a
            java.util.Iterator r4 = r4.iterator()
        L2b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r4.next()
            qf9 r0 = (defpackage.qf9) r0
            r0.a(r1)
            goto L2b
        L3b:
            k18 r4 = r3.b
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L47:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r4.next()
            qf9 r0 = (defpackage.qf9) r0
            r0.a(r1)
            goto L47
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a7b.onTrimMemory(int):void");
    }
}
