package com.avito.android.widget_filters.mvi;

import com.avito.android.util.O2;
import com.avito.android.widget_filters.analytics.a;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import com.avito.android.widget_filters.mvi.entity.d;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WidgetFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$handleLocationWidgetCollapse$1", f = "WidgetFiltersActor.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.widget_filters.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36158b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329956q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.widget_filters.mvi.entity.c f329957r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f329958s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36158b(n nVar, com.avito.android.widget_filters.mvi.entity.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f329957r = cVar;
        this.f329958s = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36158b(this.f329958s, this.f329957r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C36158b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f329956q;
        if (i12 == 0) {
            C42729a0.b(obj);
            d.C10254d c10254d = this.f329957r.f330101h;
            if (c10254d != null && c10254d.f330144j && O2.a(c10254d.f330143i)) {
                com.avito.android.widget_filters.analytics.e eVar = this.f329958s.f330189h;
                a.b.f329705a.getClass();
                this.f329956q = 1;
                if (eVar.b("search_widget", this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
