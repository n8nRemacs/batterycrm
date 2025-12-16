package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class lv0 extends hn6 implements um6 {
    public static final lv0 a = new lv0(3, pv0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        return defpackage.qqg.a;
     */
    @Override // defpackage.um6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            r0 = r9
            pv0 r0 = (defpackage.pv0) r0
            r5 = r10
            nbe r5 = (defpackage.nbe) r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = defpackage.pv0.b
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = defpackage.pv0.Y
            java.lang.Object r9 = r9.get(r0)
            oa2 r9 = (defpackage.oa2) r9
        L13:
            boolean r10 = r0.v()
            if (r10 == 0) goto L20
            kotlinx.coroutines.internal.Symbol r9 = defpackage.rv0.l
            mbe r5 = (defpackage.mbe) r5
            r5.o = r9
            goto L73
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = defpackage.pv0.c
            long r3 = r10.getAndIncrement(r0)
            int r10 = defpackage.rv0.b
            long r10 = (long) r10
            long r1 = r3 / r10
            long r10 = r3 % r10
            int r10 = (int) r10
            long r6 = r9.id
            int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r11 == 0) goto L3e
            oa2 r11 = r0.o(r1, r9)
            if (r11 != 0) goto L3b
            goto L13
        L3b:
            r1 = r11
        L3c:
            r2 = r10
            goto L40
        L3e:
            r1 = r9
            goto L3c
        L40:
            java.lang.Object r9 = r0.G(r1, r2, r3, r5)
            r11 = r1
            kotlinx.coroutines.internal.Symbol r10 = defpackage.rv0.m
            if (r9 != r10) goto L57
            boolean r9 = r5 instanceof defpackage.ojh
            if (r9 == 0) goto L50
            ojh r5 = (defpackage.ojh) r5
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == 0) goto L73
            r5.a(r11, r2)
            goto L73
        L57:
            kotlinx.coroutines.internal.Symbol r10 = defpackage.rv0.o
            if (r9 != r10) goto L68
            long r9 = r0.s()
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 >= 0) goto L66
            r11.cleanPrev()
        L66:
            r9 = r11
            goto L13
        L68:
            kotlinx.coroutines.internal.Symbol r10 = defpackage.rv0.n
            if (r9 == r10) goto L76
            r11.cleanPrev()
            mbe r5 = (defpackage.mbe) r5
            r5.o = r9
        L73:
            qqg r9 = defpackage.qqg.a
            return r9
        L76:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
