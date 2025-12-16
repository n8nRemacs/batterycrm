package com.avito.android.realty_agency.inline_filters.developer_suggest;

import Y41.p;
import gi0.InterfaceC40686a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DeveloperSuggestFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.developer_suggest.DeveloperSuggestFilterDialog$onViewCreated$1$4", f = "DeveloperSuggestFilterDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements p<CharSequence, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f251534q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f251535r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f251535r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f251535r, continuation);
        hVar.f251534q = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(CharSequence charSequence, Continuation<? super G0> continuation) {
        return ((h) create(charSequence, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        CharSequence charSequence = (CharSequence) this.f251534q;
        k kVar = this.f251535r.f251520G;
        if (kVar == null) {
            kVar = null;
        }
        kVar.accept(new InterfaceC40686a.C11224a(charSequence.toString()));
        return G0.f406611a;
    }
}
