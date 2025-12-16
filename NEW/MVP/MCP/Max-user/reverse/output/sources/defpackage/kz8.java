package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class kz8 {
    public final Context a;
    public final String b;

    public kz8(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context.getApplicationContext();
                this.b = "ActivityThemer";
                break;
            default:
                this.a = context.getApplicationContext();
                this.b = kz8.class.getName();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        r1 = r9.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        if (r3 >= r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        r2 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        if (defpackage.fni.a(r2, r5) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        r2.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006d, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0075, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0078, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return new defpackage.hz8(r5, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.hz8 a(android.net.Uri r9) {
        /*
            r8 = this;
            gz8 r0 = new gz8
            android.content.Context r1 = r8.a
            r0.<init>(r1, r9)
            pm4 r9 = new pm4
            r9.<init>()
            monitor-enter(r9)
            r1 = 1
            r9.b = r1     // Catch: java.lang.Throwable -> L84
            monitor-exit(r9)
            monitor-enter(r9)
            r2 = 6
            r9.c = r2     // Catch: java.lang.Throwable -> L81
            monitor-exit(r9)
            dl4 r2 = r0.a
            android.net.Uri r2 = r2.getUri()
            if (r2 == 0) goto L79
            id5 r3 = defpackage.id5.a
            gp5[] r9 = r9.i(r2, r3)
            int r2 = r9.length
            r3 = 0
            if (r2 != r1) goto L30
            hz8 r1 = new hz8
            r9 = r9[r3]
            r1.<init>(r9, r0)
            return r1
        L30:
            int r1 = r9.length
            r2 = r3
        L32:
            r4 = 0
            if (r2 >= r1) goto L5b
            r5 = r9[r2]
            nm4 r6 = r0.c     // Catch: java.lang.Throwable -> L4e
            if (r6 == 0) goto L46
            boolean r6 = r5.i(r6)     // Catch: java.lang.Throwable -> L4e
            nm4 r7 = r0.c
            if (r7 == 0) goto L55
            r7.X = r3
            goto L55
        L46:
            java.lang.String r6 = "Required value was null."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L4e
            throw r7     // Catch: java.lang.Throwable -> L4e
        L4e:
            nm4 r6 = r0.c
            if (r6 == 0) goto L54
            r6.X = r3
        L54:
            r6 = r3
        L55:
            if (r6 == 0) goto L58
            goto L5c
        L58:
            int r2 = r2 + 1
            goto L32
        L5b:
            r5 = r4
        L5c:
            int r1 = r9.length
        L5d:
            if (r3 >= r1) goto L6d
            r2 = r9[r3]
            boolean r6 = defpackage.fni.a(r2, r5)
            if (r6 != 0) goto L6a
            r2.release()
        L6a:
            int r3 = r3 + 1
            goto L5d
        L6d:
            if (r5 == 0) goto L75
            hz8 r4 = new hz8
            r4.<init>(r5, r0)
            goto L78
        L75:
            r0.close()
        L78:
            return r4
        L79:
            java.lang.String r9 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L81:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L81
            throw r0
        L84:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L84
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz8.a(android.net.Uri):hz8");
    }
}
