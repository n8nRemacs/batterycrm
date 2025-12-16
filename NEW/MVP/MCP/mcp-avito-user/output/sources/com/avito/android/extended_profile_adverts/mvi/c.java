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
import pA.InterfaceC46926a;

/* compiled from: ProfileAdvertsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LpA/a;", "it", "Lkotlinx/coroutines/flow/i;", "LpA/b;", "<anonymous>", "(LpA/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_adverts.mvi.ProfileAdvertsActor$process$1", f = "ProfileAdvertsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements p<InterfaceC46926a, Continuation<? super InterfaceC43160i<? extends pA.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f150896q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f150897r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<pA.d> f150898s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Y41.a<pA.d> aVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f150897r = dVar;
        this.f150898s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f150897r, this.f150898s, continuation);
        cVar.f150896q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC46926a interfaceC46926a, Continuation<? super InterfaceC43160i<? extends pA.b>> continuation) {
        return ((c) create(interfaceC46926a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f150897r.b((InterfaceC46926a) this.f150896q, this.f150898s.invoke());
    }
}
