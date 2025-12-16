package com.avito.android.widget_filters.mvi;

import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WidgetFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LOP0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "<anonymous>", "(LOP0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$process$4", f = "WidgetFiltersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class o extends SuspendLambda implements Y41.p<OP0.a, Continuation<? super InterfaceC43160i<? extends WidgetFiltersInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f330203q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f330204r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.widget_filters.mvi.entity.c> f330205s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Y41.a aVar, n nVar, Continuation continuation) {
        super(2, continuation);
        this.f330204r = nVar;
        this.f330205s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f330205s, this.f330204r, continuation);
        oVar.f330203q = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(OP0.a aVar, Continuation<? super InterfaceC43160i<? extends WidgetFiltersInternalAction>> continuation) {
        return ((o) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f330204r.b((OP0.a) this.f330203q, this.f330205s.invoke());
    }
}
