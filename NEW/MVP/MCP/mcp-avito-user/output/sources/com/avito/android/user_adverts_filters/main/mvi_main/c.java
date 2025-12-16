package com.avito.android.user_adverts_filters.main.mvi_main;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinResult;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MainFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/user_adverts_filters/main/model/UserAdvertsFiltersBeduinResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_main.MainFiltersActor$processLoad$1", f = "MainFiltersActor.kt", i = {}, l = {149, 149}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<UserAdvertsFiltersBeduinResult>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f316208q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f316209r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f316210s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ rJ0.c f316211t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, rJ0.c cVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f316210s = rVar;
        this.f316211t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f316210s, this.f316211t, continuation);
        cVar.f316209r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<UserAdvertsFiltersBeduinResult>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f316208q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f316209r;
            com.avito.android.user_adverts_filters.main.domain.a aVar = this.f316210s.f316307a;
            Map<String, ? extends Object> map = this.f316211t.f429740b.f315951b;
            this.f316209r = interfaceC43172j;
            this.f316208q = 1;
            obj = aVar.a(map, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f316209r;
            C42729a0.b(obj);
        }
        this.f316209r = null;
        this.f316208q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
