package com.avito.android.messenger.channels.mvi.list_feature;

import HY.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelsListActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LHY/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$27", f = "ChannelsListActor.kt", i = {}, l = {560, 565}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class H extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187735q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f187736r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C31772a f187737s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c.b f187738t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(c.b bVar, C31772a c31772a, Continuation continuation) {
        super(2, continuation);
        this.f187737s = c31772a;
        this.f187738t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        H h12 = new H(this.f187738t, this.f187737s, continuation);
        h12.f187736r = obj;
        return h12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((H) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f187735q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.C42729a0.b(r5)     // Catch: java.lang.Throwable -> L12
            goto L4e
        L12:
            r5 = move-exception
            goto L56
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1c:
            kotlin.C42729a0.b(r5)
            goto L32
        L20:
            kotlin.C42729a0.b(r5)
            java.lang.Object r5 = r4.f187736r
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
            HY.d$e r1 = HY.d.e.f7177a
            r4.f187735q = r3
            java.lang.Object r5 = r5.emit(r1, r4)
            if (r5 != r0) goto L32
            return r0
        L32:
            com.avito.android.messenger.channels.mvi.list_feature.a r5 = r4.f187737s
            HY.c$b r1 = r4.f187738t
            com.avito.android.messenger.channels.mvi.interactor.A r5 = r5.f187937q     // Catch: java.lang.Throwable -> L12
            r3 = r1
            HY.c$b$c r3 = (HY.c.b.C0412c) r3     // Catch: java.lang.Throwable -> L12
            ru.avito.messenger.MessengerUserHashInfo r3 = r3.f7148a     // Catch: java.lang.Throwable -> L12
            HY.c$b$c r1 = (HY.c.b.C0412c) r1     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.f7149b     // Catch: java.lang.Throwable -> L12
            io.reactivex.rxjava3.core.a r5 = r5.a(r1, r3)     // Catch: java.lang.Throwable -> L12
            r4.f187735q = r2     // Catch: java.lang.Throwable -> L12
            java.lang.Object r5 = kotlinx.coroutines.rx3.C43292o.a(r5, r4)     // Catch: java.lang.Throwable -> L12
            if (r5 != r0) goto L4e
            return r0
        L4e:
            kotlin.G0 r5 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L12
            com.avito.android.arch.mvi.utils.c$c r0 = new com.avito.android.arch.mvi.utils.c$c     // Catch: java.lang.Throwable -> L12
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L12
            goto L62
        L56:
            kotlin.coroutines.CoroutineContext r0 = r4.getF411447c()
            kotlinx.coroutines.Q0.e(r0)
            com.avito.android.arch.mvi.utils.c$b r0 = new com.avito.android.arch.mvi.utils.c$b
            r0.<init>(r5)
        L62:
            boolean r5 = r0 instanceof com.avito.android.arch.mvi.utils.c.C2712c
            if (r5 == 0) goto L67
            goto L7a
        L67:
            boolean r5 = r0 instanceof com.avito.android.arch.mvi.utils.c.b
            if (r5 == 0) goto L7d
            com.avito.android.arch.mvi.utils.c$b r0 = (com.avito.android.arch.mvi.utils.c.b) r0
            A r5 = r0.f92027b
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            com.avito.android.util.X2 r0 = com.avito.android.util.X2.f318778a
            java.lang.String r1 = "ChannelsListActor"
            java.lang.String r2 = "restoreLocallyDeletedChat failed"
            r0.a(r1, r2, r5)
        L7a:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L7d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.H.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
