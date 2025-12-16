package com.avito.android.widget_filters.domain;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.widget_filters.remote.model.WidgetFiltersResponse;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WidgetFiltersInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/widget_filters/remote/model/WidgetFiltersResponse;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.widget_filters.domain.WidgetFiltersInteractorImpl$loadWidgetFilters$1", f = "WidgetFiltersInteractor.kt", i = {}, l = {72, 72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<WidgetFiltersResponse>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329875q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f329876r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f329877s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f329878t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, Map<String, String> map, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f329877s = hVar;
        this.f329878t = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f329877s, this.f329878t, continuation);
        kVar.f329876r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<WidgetFiltersResponse>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f329875q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f329876r;
            PP0.a aVar = this.f329877s.f329853a;
            this.f329876r = interfaceC43172j;
            this.f329875q = 1;
            obj = aVar.a(this.f329878t, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f329876r;
            C42729a0.b(obj);
        }
        this.f329876r = null;
        this.f329875q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
