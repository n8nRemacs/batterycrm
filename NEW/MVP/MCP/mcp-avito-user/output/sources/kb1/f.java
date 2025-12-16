package kb1;

import kotlinx.coroutines.channels.A;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C43108m;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C43108m f406431d = A.a(-2, BufferOverflow.f410777b, null, 4);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f406432a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final qb1.g f406433b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final T11.f f406434c;

    public f(@Y61.k k kVar, @Y61.k qb1.g gVar, @Y61.k T11.f fVar) {
        this.f406432a = kVar;
        this.f406433b = gVar;
        this.f406434c = fVar.b("ClientServiceDataDispatcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.vk.push.common.messaging.RemoteMessage r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kb1.C42665b
            if (r0 == 0) goto L13
            r0 = r6
            kb1.b r0 = (kb1.C42665b) r0
            int r1 = r0.f406418t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f406418t = r1
            goto L18
        L13:
            kb1.b r0 = new kb1.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f406416r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f406418t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kb1.f r5 = r0.f406415q
            kotlin.C42729a0.b(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            kb1.s$a r6 = new kb1.s$a
            r6.<init>(r5)
            T11.f r5 = r4.f406434c
            java.lang.String r2 = "Trying to send new push message event to channel"
            r5.info(r2)
            r0.f406415q = r4
            r0.f406418t = r3
            kotlinx.coroutines.channels.m r5 = kb1.f.f406431d
            java.lang.Object r5 = r5.send(r6, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r5 = r4
        L50:
            T11.f r6 = r5.f406434c
            java.lang.String r0 = "Event with new push message has been sent to channel"
            r6.info(r0)
            kb1.k r5 = r5.f406432a
            r5.a()
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kb1.f.a(com.vk.push.common.messaging.RemoteMessage, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kb1.c
            if (r0 == 0) goto L13
            r0 = r6
            kb1.c r0 = (kb1.c) r0
            int r1 = r0.f406422t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f406422t = r1
            goto L18
        L13:
            kb1.c r0 = new kb1.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f406420r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f406422t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kb1.f r5 = r0.f406419q
            kotlin.C42729a0.b(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            kb1.s$b r6 = new kb1.s$b
            r6.<init>(r5)
            T11.f r5 = r4.f406434c
            java.lang.String r2 = "Trying to send new push token event to channel"
            r5.info(r2)
            r0.f406419q = r4
            r0.f406422t = r3
            kotlinx.coroutines.channels.m r5 = kb1.f.f406431d
            java.lang.Object r5 = r5.send(r6, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r5 = r4
        L50:
            T11.f r6 = r5.f406434c
            java.lang.String r0 = "Event with new push token has been sent to channel"
            r6.info(r0)
            kb1.k r5 = r5.f406432a
            r5.a()
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kb1.f.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.util.List r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kb1.e
            if (r0 == 0) goto L13
            r0 = r6
            kb1.e r0 = (kb1.e) r0
            int r1 = r0.f406430t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f406430t = r1
            goto L18
        L13:
            kb1.e r0 = new kb1.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f406428r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f406430t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kb1.f r5 = r0.f406427q
            kotlin.C42729a0.b(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            kb1.s$d r6 = new kb1.s$d
            r6.<init>(r5)
            T11.f r5 = r4.f406434c
            java.lang.String r2 = "Trying to send error message event to channel"
            r5.info(r2)
            r0.f406427q = r4
            r0.f406430t = r3
            kotlinx.coroutines.channels.m r5 = kb1.f.f406431d
            java.lang.Object r5 = r5.send(r6, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r5 = r4
        L50:
            T11.f r6 = r5.f406434c
            java.lang.String r0 = "Event with error message has been sent to channel"
            r6.info(r0)
            kb1.k r5 = r5.f406432a
            r5.a()
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kb1.f.c(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kb1.C42664a
            if (r0 == 0) goto L13
            r0 = r7
            kb1.a r0 = (kb1.C42664a) r0
            int r1 = r0.f406414u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f406414u = r1
            goto L18
        L13:
            kb1.a r0 = new kb1.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f406412s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f406414u
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r7)
            goto L96
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.String r2 = r0.f406411r
            kb1.f r4 = r0.f406410q
            kotlin.C42729a0.b(r7)
            goto L70
        L3f:
            kb1.f r2 = r0.f406410q
            kotlin.C42729a0.b(r7)
            r4 = r2
            goto L5e
        L46:
            kotlin.C42729a0.b(r7)
            T11.f r7 = r6.f406434c
            java.lang.String r2 = "Checking for undelivered push tokens"
            r7.info(r2)
            r0.f406410q = r6
            r0.f406414u = r4
            qb1.g r7 = r6.f406433b
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2
            qb1.g r7 = r4.f406433b
            r0.f406410q = r4
            r0.f406411r = r2
            r0.f406414u = r5
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto L70
            return r1
        L70:
            java.lang.String r7 = (java.lang.String) r7
            if (r2 == 0) goto L99
            boolean r5 = kotlin.text.C43066x.K(r2)
            if (r5 == 0) goto L7b
            goto L99
        L7b:
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L99
            T11.f r7 = r4.f406434c
            java.lang.String r5 = "Found undelivered token, sending it to service"
            r7.info(r5)
            r7 = 0
            r0.f406410q = r7
            r0.f406411r = r7
            r0.f406414u = r3
            java.lang.Object r7 = r4.b(r2, r0)
            if (r7 != r1) goto L96
            return r1
        L96:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L99:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kb1.f.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kb1.d
            if (r0 == 0) goto L13
            r0 = r6
            kb1.d r0 = (kb1.d) r0
            int r1 = r0.f406426t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f406426t = r1
            goto L18
        L13:
            kb1.d r0 = new kb1.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f406424r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f406426t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kb1.f r0 = r0.f406423q
            kotlin.C42729a0.b(r6)
            goto L4d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.C42729a0.b(r6)
            kb1.s$c r6 = kb1.s.c.f406497a
            T11.f r2 = r5.f406434c
            java.lang.String r4 = "Trying to send on delete messages event to channel"
            r2.info(r4)
            r0.f406423q = r5
            r0.f406426t = r3
            kotlinx.coroutines.channels.m r2 = kb1.f.f406431d
            java.lang.Object r6 = r2.send(r6, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            T11.f r6 = r0.f406434c
            java.lang.String r1 = "Event with on delete messages has been sent to channel"
            r6.info(r1)
            kb1.k r6 = r0.f406432a
            r6.a()
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kb1.f.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
