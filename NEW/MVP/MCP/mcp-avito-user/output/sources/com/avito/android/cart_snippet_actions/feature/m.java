package com.avito.android.cart_snippet_actions.feature;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import tn.InterfaceC48692a;
import tn.InterfaceC48693b;

/* compiled from: CartSnippetActionsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltn/a;", "it", "Lkotlinx/coroutines/flow/i;", "Ltn/b;", "<anonymous>", "(Ltn/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_snippet_actions.feature.CartSnippetActionsActor$process$defaultFlow$1", f = "CartSnippetActionsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC48692a, Continuation<? super InterfaceC43160i<? extends InterfaceC48693b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f116239q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f116240r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<tn.d> f116241s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, Y41.a<tn.d> aVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f116240r = kVar;
        this.f116241s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f116240r, this.f116241s, continuation);
        mVar.f116239q = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC48692a interfaceC48692a, Continuation<? super InterfaceC43160i<? extends InterfaceC48693b>> continuation) {
        return ((m) create(interfaceC48692a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f116240r.b((InterfaceC48692a) this.f116239q, this.f116241s.invoke());
    }
}
