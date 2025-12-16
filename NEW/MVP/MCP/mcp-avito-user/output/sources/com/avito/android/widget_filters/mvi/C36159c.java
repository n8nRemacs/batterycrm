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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WidgetFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$handleLocationWidgetExpand$1", f = "WidgetFiltersActor.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.widget_filters.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36159c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329959q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f329960r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.widget_filters.mvi.entity.c f329961s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f329962t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36159c(n nVar, com.avito.android.widget_filters.mvi.entity.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f329961s = cVar;
        this.f329962t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C36159c c36159c = new C36159c(this.f329962t, this.f329961s, continuation);
        c36159c.f329960r = obj;
        return c36159c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C36159c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f329959q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f329960r;
            com.avito.android.widget_filters.mvi.entity.c cVar = this.f329961s;
            d.C10254d c10254d = cVar.f330101h;
            if (c10254d != null && c10254d.f330144j && O2.a(c10254d.f330143i)) {
                a.b bVar = a.b.f329705a;
                n nVar = this.f329962t;
                nVar.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new f(cVar, nVar, bVar, null));
                this.f329959q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
