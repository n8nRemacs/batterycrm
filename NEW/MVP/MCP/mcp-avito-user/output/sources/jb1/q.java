package jb1;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.SubscribeToTopicUseCase", f = "SubscribeToTopicUseCase.kt", i = {}, l = {8}, m = "invoke-gIAlu-s", n = {}, s = {})
/* loaded from: classes9.dex */
public final class q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f405722q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f405723r;

    /* renamed from: s, reason: collision with root package name */
    public int f405724s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f405723r = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
        /*
            r5 = this;
            r5.f405722q = r6
            int r6 = r5.f405724s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r0
            r5.f405724s = r6
            jb1.r r6 = r5.f405723r
            r6.getClass()
            boolean r0 = r5 instanceof jb1.q
            if (r0 == 0) goto L1f
            int r0 = r5.f405724s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L1f
            int r0 = r0 - r1
            r5.f405724s = r0
            r0 = r5
            goto L24
        L1f:
            jb1.q r0 = new jb1.q
            r0.<init>(r6, r5)
        L24:
            java.lang.Object r1 = r0.f405722q
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.f405724s
            r4 = 1
            if (r3 == 0) goto L42
            if (r3 != r4) goto L3a
            kotlin.C42729a0.b(r1)
            kotlin.Z r1 = (kotlin.Z) r1
            java.lang.Object r6 = r1.f406625b
        L38:
            r2 = r6
            goto L4f
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L42:
            kotlin.C42729a0.b(r1)
            r0.f405724s = r4
            ab1.v r6 = r6.f405725a
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r2) goto L38
        L4f:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r6) goto L56
            return r2
        L56:
            kotlin.Z r6 = kotlin.Z.a(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jb1.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
