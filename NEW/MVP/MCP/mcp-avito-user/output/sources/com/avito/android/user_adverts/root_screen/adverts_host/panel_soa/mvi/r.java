package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import MI0.b;
import com.avito.android.analytics.event.U;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PanelSoaActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMI0/b;", "it", "Lkotlin/G0;", "<anonymous>", "(LMI0/b;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$processOpenSoaInfo$2", f = "PanelSoaActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class r extends SuspendLambda implements Y41.p<MI0.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f313616q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35597a f313617r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C35597a c35597a, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f313617r = c35597a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f313617r, continuation);
        rVar.f313616q = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(MI0.b bVar, Continuation<? super G0> continuation) {
        return ((r) create(bVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (((MI0.b) this.f313616q) instanceof b.e) {
            C35597a c35597a = this.f313617r;
            c35597a.f313520f.c(new pI0.f());
            c35597a.f313520f.c(new U());
        }
        return G0.f406611a;
    }
}
