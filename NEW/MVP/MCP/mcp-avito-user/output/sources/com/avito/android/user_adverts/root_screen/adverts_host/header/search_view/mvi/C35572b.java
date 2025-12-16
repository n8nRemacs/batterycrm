package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SearchActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LBI0/a;", "action", "Lkotlinx/coroutines/flow/i;", "LBI0/b;", "<anonymous>", "(LBI0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.SearchActor$mergeActions$1", f = "SearchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35572b extends SuspendLambda implements Y41.p<BI0.a, Continuation<? super InterfaceC43160i<? extends BI0.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f312855q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35571a f312856r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<BI0.d> f312857s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35572b(Y41.a aVar, C35571a c35571a, Continuation continuation) {
        super(2, continuation);
        this.f312856r = c35571a;
        this.f312857s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35572b c35572b = new C35572b(this.f312857s, this.f312856r, continuation);
        c35572b.f312855q = obj;
        return c35572b;
    }

    @Override // Y41.p
    public final Object invoke(BI0.a aVar, Continuation<? super InterfaceC43160i<? extends BI0.b>> continuation) {
        return ((C35572b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f312856r.b((BI0.a) this.f312855q, this.f312857s.invoke());
    }
}
