package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class um8 implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm8 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ um8(zm8 zm8Var, long j, String str, int i) {
        this.a = i;
        this.b = zm8Var;
        this.c = j;
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    @Override // defpackage.gu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 0: goto L3e;
                default: goto L5;
            }
        L5:
            zm8 r0 = r10.b
            long r1 = r10.c
            java.lang.String r3 = r10.d
            java.util.List r11 = (java.util.List) r11
            java.lang.String r4 = "zm8"
            java.lang.String r5 = "searchChats %d, finish %dms"
            int r6 = r11.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1}
            defpackage.wqi.i(r4, r5, r1)
            r0.o = r11
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L36
            tw0 r1 = r0.e     // Catch: java.lang.Exception -> L36
            r1.d(r0)     // Catch: java.lang.Exception -> L36
        L36:
            rm8 r0 = r0.i
            if (r0 == 0) goto L3d
            r0.d(r3, r11)
        L3d:
            return
        L3e:
            zm8 r0 = r10.b
            long r1 = r10.c
            java.lang.String r3 = r10.d
            wm8 r11 = (defpackage.wm8) r11
            r0.getClass()
            java.lang.String r4 = "zm8"
            java.lang.String r5 = "searchChatsAndMessages %d, finish %d ms"
            monitor-enter(r11)
            java.util.ArrayList r6 = r11.c     // Catch: java.lang.Throwable -> Lc7
            int r6 = r6.size()     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r11)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r8 = java.lang.System.nanoTime()
            long r8 = r8 - r1
            long r1 = r7.toMillis(r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1}
            defpackage.wqi.i(r4, r5, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList r2 = r11.c
            r1.<init>(r2)
            r0.n = r1
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L83
            tw0 r2 = r0.e     // Catch: java.lang.Exception -> L83
            r2.d(r0)     // Catch: java.lang.Exception -> L83
        L83:
            boolean r2 = r1.isEmpty()
            r4 = 0
            if (r2 == 0) goto Lb4
            monitor-enter(r11)
            java.util.EnumSet r2 = r11.a     // Catch: java.lang.Throwable -> Lab
            xm8 r5 = defpackage.xm8.a     // Catch: java.lang.Throwable -> Lab
            boolean r2 = r2.contains(r5)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto Lad
            java.util.EnumSet r2 = r11.a     // Catch: java.lang.Throwable -> Lab
            xm8 r5 = defpackage.xm8.c     // Catch: java.lang.Throwable -> Lab
            boolean r2 = r2.contains(r5)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto Lad
            java.util.EnumSet r2 = r11.a     // Catch: java.lang.Throwable -> Lab
            xm8 r5 = defpackage.xm8.b     // Catch: java.lang.Throwable -> Lab
            boolean r2 = r2.contains(r5)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto Lad
            r2 = 1
            goto Lae
        Lab:
            r0 = move-exception
            goto Lb2
        Lad:
            r2 = r4
        Lae:
            monitor-exit(r11)
            if (r2 != 0) goto Lb4
            goto Lc6
        Lb2:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lab
            throw r0
        Lb4:
            rm8 r11 = r0.i
            if (r11 == 0) goto Lc6
            java.lang.String r11 = "zm8"
            java.lang.String r2 = "searchChatsAndMessages, notify listener"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            defpackage.wqi.i(r11, r2, r5)
            rm8 r11 = r0.i
            r11.f(r3, r1, r4)
        Lc6:
            return
        Lc7:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lc7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um8.accept(java.lang.Object):void");
    }
}
