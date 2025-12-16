package com.avito.android.messenger.channels.mvi.header_feature;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelsHeaderActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LFY/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderActor$process$4", f = "ChannelsHeaderActor.kt", i = {0, 1, 2}, l = {98, 100, 106}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$onFailureSuspend$iv"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: com.avito.android.messenger.channels.mvi.header_feature.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31753e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FY.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187539q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f187540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C31755g f187541s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31753e(C31755g c31755g, Continuation<? super C31753e> continuation) {
        super(2, continuation);
        this.f187541s = c31755g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31753e c31753e = new C31753e(this.f187541s, continuation);
        c31753e.f187540r = obj;
        return c31753e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FY.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C31753e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f187539q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r6.f187540r
            com.avito.android.arch.mvi.utils.c r0 = (com.avito.android.arch.mvi.utils.c) r0
            kotlin.C42729a0.b(r7)
            goto L9c
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            java.lang.Object r1 = r6.f187540r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L67
        L2a:
            r7 = move-exception
            goto L6f
        L2c:
            java.lang.Object r1 = r6.f187540r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L51
        L34:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f187540r
            r1 = r7
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.messenger.channels.mvi.header_feature.g r7 = r6.f187541s
            ru.avito.messenger.z r7 = r7.f187543a     // Catch: java.lang.Throwable -> L2a
            com.avito.android.remote.model.messenger.get_settings.GetSettingsRequest$ForAutoReplies r5 = com.avito.android.remote.model.messenger.get_settings.GetSettingsRequest.ForAutoReplies.INSTANCE     // Catch: java.lang.Throwable -> L2a
            io.reactivex.rxjava3.core.I r7 = r7.n(r5)     // Catch: java.lang.Throwable -> L2a
            r6.f187540r = r1     // Catch: java.lang.Throwable -> L2a
            r6.f187539q = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.b(r7, r6)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r0) goto L51
            return r0
        L51:
            com.avito.android.remote.model.messenger.get_settings.GetSettingsResponse r7 = (com.avito.android.remote.model.messenger.get_settings.GetSettingsResponse) r7     // Catch: java.lang.Throwable -> L2a
            FY.b$c r4 = new FY.b$c     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r7.getAutoRepliesUrl()     // Catch: java.lang.Throwable -> L2a
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L2a
            r6.f187540r = r1     // Catch: java.lang.Throwable -> L2a
            r6.f187539q = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r1.emit(r4, r6)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r0) goto L67
            return r0
        L67:
            kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L2a
            com.avito.android.arch.mvi.utils.c$c r3 = new com.avito.android.arch.mvi.utils.c$c     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L2a
            goto L7b
        L6f:
            kotlin.coroutines.CoroutineContext r3 = r6.getF411447c()
            kotlinx.coroutines.Q0.e(r3)
            com.avito.android.arch.mvi.utils.c$b r3 = new com.avito.android.arch.mvi.utils.c$b
            r3.<init>(r7)
        L7b:
            boolean r7 = r3 instanceof com.avito.android.arch.mvi.utils.c.C2712c
            if (r7 == 0) goto L80
            goto L9c
        L80:
            boolean r7 = r3 instanceof com.avito.android.arch.mvi.utils.c.b
            if (r7 == 0) goto L9f
            r7 = r3
            com.avito.android.arch.mvi.utils.c$b r7 = (com.avito.android.arch.mvi.utils.c.b) r7
            A r7 = r7.f92027b
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            FY.b$c r7 = new FY.b$c
            r4 = 0
            r7.<init>(r4)
            r6.f187540r = r3
            r6.f187539q = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L9c
            return r0
        L9c:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L9f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.header_feature.C31753e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
