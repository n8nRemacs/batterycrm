package com.avito.android.extended_profile_map.mvi;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileMapActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LAA/a;", "it", "Lkotlinx/coroutines/flow/i;", "LAA/b;", "<anonymous>", "(LAA/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_map.mvi.ExtendedProfileMapActor$process$1", f = "ExtendedProfileMapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<AA.a, Continuation<? super InterfaceC43160i<? extends AA.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f151270q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f151271r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<AA.d> f151272s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Y41.a<AA.d> aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f151271r = dVar;
        this.f151272s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f151271r, this.f151272s, continuation);
        bVar.f151270q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(AA.a aVar, Continuation<? super InterfaceC43160i<? extends AA.b>> continuation) {
        return ((b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f151271r.b((AA.a) this.f151270q, this.f151272s.invoke());
    }
}
