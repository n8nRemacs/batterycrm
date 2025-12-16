package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import BI0.a;
import BI0.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SearchActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBI0/b$i;", "it", "Lkotlin/G0;", "<anonymous>", "(LBI0/b$i;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.SearchActor$processSuggestions$4", f = "SearchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class r extends SuspendLambda implements Y41.p<b.i, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f312929q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35571a f312930r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a.k f312931s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a.k kVar, C35571a c35571a, Continuation continuation) {
        super(2, continuation);
        this.f312930r = c35571a;
        this.f312931s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f312931s, this.f312930r, continuation);
        rVar.f312929q = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(b.i iVar, Continuation<? super G0> continuation) {
        return ((r) create(iVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (!((b.i) this.f312929q).f1313a.isEmpty()) {
            this.f312930r.f312854d.c(new qI0.f(this.f312931s.f1301a));
        }
        return G0.f406611a;
    }
}
