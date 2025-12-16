package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi;

import II0.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PanelConfigActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LII0/a$g;", "action", "Lkotlinx/coroutines/flow/i;", "LII0/b;", "<anonymous>", "(LII0/a$g;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.PanelConfigActor$processTooltipChanges$1", f = "PanelConfigActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class t extends SuspendLambda implements Y41.p<a.g, Continuation<? super InterfaceC43160i<? extends II0.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f313434q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35593a f313435r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<II0.d> f313436s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Y41.a aVar, C35593a c35593a, Continuation continuation) {
        super(2, continuation);
        this.f313435r = c35593a;
        this.f313436s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f313436s, this.f313435r, continuation);
        tVar.f313434q = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(a.g gVar, Continuation<? super InterfaceC43160i<? extends II0.b>> continuation) {
        return ((t) create(gVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f313435r.b((a.g) this.f313434q, this.f313436s.invoke());
    }
}
