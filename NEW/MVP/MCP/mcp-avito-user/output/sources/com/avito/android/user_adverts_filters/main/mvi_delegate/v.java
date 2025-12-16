package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import lj.InterfaceC43779a;

/* compiled from: FiltersDelegateActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor$setModels$2", f = "FiltersDelegateActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class v extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f316187q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List<BeduinModel> f316188r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43779a f316189s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(String str, List<? extends BeduinModel> list, InterfaceC43779a interfaceC43779a, Continuation<? super v> continuation) {
        super(2, continuation);
        this.f316187q = str;
        this.f316188r = list;
        this.f316189s = interfaceC43779a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new v(this.f316187q, this.f316188r, this.f316189s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((v) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String str = this.f316187q;
        if (str != null) {
            List<BeduinModel> list = this.f316188r;
            List<BeduinModel> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                com.avito.android.beduin_shared.model.utils.j.b(this.f316189s, str, list);
            }
        }
        return G0.f406611a;
    }
}
