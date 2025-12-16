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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lcom/avito/android/beduin_models/BeduinModel;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor$extractFilterParams$currentModels$1", f = "FiltersDelegateActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super List<? extends BeduinModel>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43779a f316131q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC43779a interfaceC43779a, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f316131q = interfaceC43779a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f316131q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super List<? extends BeduinModel>> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f316131q.f();
    }
}
