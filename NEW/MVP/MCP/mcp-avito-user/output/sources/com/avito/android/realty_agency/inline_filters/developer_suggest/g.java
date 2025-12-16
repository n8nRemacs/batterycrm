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
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;

/* compiled from: DeveloperSuggestFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "kotlin.jvm.PlatformType", "dialogItem", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/inline_filters/dialog/select/adapter/i;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.developer_suggest.DeveloperSuggestFilterDialog$onViewCreated$1$3", f = "DeveloperSuggestFilterDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements p<com.avito.android.inline_filters.dialog.select.adapter.i, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f251532q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f251533r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f251533r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f251533r, continuation);
        gVar.f251532q = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.inline_filters.dialog.select.adapter.i iVar, Continuation<? super G0> continuation) {
        return ((g) create(iVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String string = ((com.avito.android.inline_filters.dialog.select.adapter.i) this.f251532q).f172091b.toString();
        C43044a.a(10);
        int i12 = Integer.parseInt(string, 10);
        k kVar = this.f251533r.f251520G;
        if (kVar == null) {
            kVar = null;
        }
        kVar.accept(new InterfaceC40686a.b(i12));
        return G0.f406611a;
    }
}
