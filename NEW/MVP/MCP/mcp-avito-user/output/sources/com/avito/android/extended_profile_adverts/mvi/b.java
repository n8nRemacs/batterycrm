package com.avito.android.extended_profile_adverts.mvi;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: ProfileAdvertsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "it", "Lkotlinx/coroutines/flow/i;", "LpA/b;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_adverts.mvi.ProfileAdvertsActor$observeDeeplinkResultForBuyWithDelivery$2", f = "ProfileAdvertsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<C43501a, Continuation<? super InterfaceC43160i<? extends pA.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f150894q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<pA.d> f150895r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Y41.a<pA.d> aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f150894q = dVar;
        this.f150895r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f150894q, this.f150895r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends pA.b>> continuation) {
        return ((b) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        d dVar = this.f150894q;
        com.avito.android.extended_profile_adverts.d dVar2 = dVar.f150904f;
        Y41.a<pA.d> aVar = this.f150895r;
        return dVar2.a(dVar.f150899a, dVar.f150900b, dVar.f150901c, aVar.invoke().f428246d, aVar.invoke().f428247e + 1, dVar.f150902d, dVar.f150903e, dVar.f150910l);
    }
}
