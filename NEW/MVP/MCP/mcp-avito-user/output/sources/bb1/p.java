package bb1;

import eb1.C40084a;
import gb1.InterfaceC40649a;
import kotlinx.coroutines.InterfaceC43076a0;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40649a f57254a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final cb1.l f57255b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final cb1.m f57256c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T11.f f57257d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public volatile InterfaceC43076a0<C40084a> f57258e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f57259f = new kotlinx.coroutines.sync.d();

    public p(@Y61.k InterfaceC40649a interfaceC40649a, @Y61.k cb1.l lVar, @Y61.k cb1.m mVar, @Y61.k T11.f fVar) {
        this.f57254a = interfaceC40649a;
        this.f57255b = lVar;
        this.f57256c = mVar;
        this.f57257d = fVar.b("IPCClientsDataSource");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(bb1.p r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof bb1.q
            if (r0 == 0) goto L13
            r0 = r5
            bb1.q r0 = (bb1.q) r0
            int r1 = r0.f57263t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57263t = r1
            goto L18
        L13:
            bb1.q r0 = new bb1.q
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f57261r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f57263t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            bb1.p r4 = r0.f57260q
            kotlin.C42729a0.b(r5)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.C42729a0.b(r5)
            cb1.l r5 = r4.f57255b
            r0.f57260q = r4
            r0.f57263t = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L43
            goto L66
        L43:
            T11.a r5 = (T11.a) r5
            T11.f r0 = r4.f57257d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Client works with host: "
            r1.<init>(r2)
            java.lang.String r2 = r5.f15306a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.info(r1)
            bb1.r r0 = new bb1.r
            r1 = 0
            r0.<init>(r4, r1)
            gb1.a r4 = r4.f57254a
            eb1.a r1 = r4.a(r5, r0)
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bb1.p.a(bb1.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.a] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof bb1.o
            if (r0 == 0) goto L13
            r0 = r7
            bb1.o r0 = (bb1.o) r0
            int r1 = r0.f57253u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57253u = r1
            goto L18
        L13:
            bb1.o r0 = new bb1.o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f57251s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f57253u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.sync.a r1 = r0.f57250r
            bb1.p r0 = r0.f57249q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L68
        L31:
            r7 = move-exception
            goto L75
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3b:
            kotlinx.coroutines.sync.a r2 = r0.f57250r
            bb1.p r4 = r0.f57249q
            kotlin.C42729a0.b(r7)
            r7 = r2
            goto L57
        L44:
            kotlin.C42729a0.b(r7)
            kotlinx.coroutines.sync.d r7 = r6.f57259f
            r0.f57249q = r6
            r0.f57250r = r7
            r0.f57253u = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 != r1) goto L56
            return r1
        L56:
            r4 = r6
        L57:
            cb1.m r2 = r4.f57256c     // Catch: java.lang.Throwable -> L73
            r0.f57249q = r4     // Catch: java.lang.Throwable -> L73
            r0.f57250r = r7     // Catch: java.lang.Throwable -> L73
            r0.f57253u = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r1) goto L66
            return r1
        L66:
            r1 = r7
            r0 = r4
        L68:
            r0.f57258e = r5     // Catch: java.lang.Throwable -> L31
            kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L31
            r1.d(r5)
            return r7
        L70:
            r1 = r7
            r7 = r0
            goto L75
        L73:
            r0 = move-exception
            goto L70
        L75:
            r1.d(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bb1.p.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
