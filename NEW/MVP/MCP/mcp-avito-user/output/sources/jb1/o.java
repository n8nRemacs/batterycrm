package jb1;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.SendTestPushRequestUseCase", f = "SendTestPushRequestUseCase.kt", i = {}, l = {18}, m = "invoke-1vKEnOE", n = {}, s = {})
/* loaded from: classes9.dex */
public final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f405717q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f405718r;

    /* renamed from: s, reason: collision with root package name */
    public int f405719s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f405718r = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            r6.f405717q = r7
            int r7 = r6.f405719s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.f405719s = r7
            jb1.p r7 = r6.f405718r
            r1 = 0
            r7.getClass()
            boolean r2 = r6 instanceof jb1.o
            if (r2 == 0) goto L1e
            int r2 = r6.f405719s
            r3 = r2 & r0
            if (r3 == 0) goto L1e
            int r2 = r2 - r0
            r6.f405719s = r2
            r0 = r6
            goto L23
        L1e:
            jb1.o r0 = new jb1.o
            r0.<init>(r7, r6)
        L23:
            java.lang.Object r2 = r0.f405717q
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r0.f405719s
            r5 = 1
            if (r4 == 0) goto L41
            if (r4 != r5) goto L39
            kotlin.C42729a0.b(r2)
            kotlin.Z r2 = (kotlin.Z) r2
            java.lang.Object r7 = r2.f406625b
        L37:
            r3 = r7
            goto L5a
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L41:
            kotlin.C42729a0.b(r2)
            int r2 = kotlin.Z.f406624c
            T11.f r2 = r7.f405721b
            java.lang.String r4 = "Start send test push"
            r2.info(r4)
            kotlin.C42729a0.b(r1)
            r0.f405719s = r5
            ab1.q r7 = r7.f405720a
            java.lang.Object r7 = r7.a(r1, r0)
            if (r7 != r3) goto L37
        L5a:
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r7) goto L61
            return r3
        L61:
            kotlin.Z r7 = kotlin.Z.a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jb1.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
