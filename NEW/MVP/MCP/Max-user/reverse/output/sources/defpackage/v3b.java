package defpackage;

import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class v3b {
    public final hbd a;
    public final WeakHashMap b = new WeakHashMap();

    public v3b(hbd hbdVar) {
        this.a = hbdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r5, defpackage.ts9 r6, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.t3b
            if (r0 == 0) goto L13
            r0 = r7
            t3b r0 = (defpackage.t3b) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            t3b r0 = new t3b
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            defpackage.g8j.b(r7)
            goto L54
        L2d:
            defpackage.g8j.b(r7)
            android.content.Context r5 = r5.getApplicationContext()
            android.app.Application r5 = (android.app.Application) r5
            u3b r7 = new u3b
            r7.<init>(r6, r4)
            r5.registerActivityLifecycleCallbacks(r7)
            tw r5 = new tw
            r6 = 9
            r5.<init>(r6, r4)
            r0.X = r2
            hbd r6 = r4.a
            mcf r6 = r6.a
            java.lang.Object r5 = r6.d(r5, r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L54
            return
        L54:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v3b.a(android.content.Context, ts9, q44):void");
    }
}
