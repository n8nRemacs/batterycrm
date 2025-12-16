package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import MI0.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PanelSoaActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LMI0/a$f;", "action", "Lkotlinx/coroutines/flow/i;", "LMI0/b;", "<anonymous>", "(LMI0/a$f;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$processTooltip$1", f = "PanelSoaActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class t extends SuspendLambda implements Y41.p<a.f, Continuation<? super InterfaceC43160i<? extends MI0.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f313623q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35597a f313624r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<MI0.d> f313625s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Y41.a aVar, C35597a c35597a, Continuation continuation) {
        super(2, continuation);
        this.f313624r = c35597a;
        this.f313625s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f313625s, this.f313624r, continuation);
        tVar.f313623q = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(a.f fVar, Continuation<? super InterfaceC43160i<? extends MI0.b>> continuation) {
        return ((t) create(fVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f313624r.b((a.f) this.f313623q, this.f313625s.invoke());
    }
}
