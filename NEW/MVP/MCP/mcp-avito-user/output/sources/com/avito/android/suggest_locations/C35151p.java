package com.avito.android.suggest_locations;

import com.avito.android.geo_common.model.CoordsByAddressResult;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SuggestLocationsInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/geo_common/model/CoordsByAddressResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.suggest_locations.SuggestLocationsInteractorImpl$getCoordsByAddress$1$1", f = "SuggestLocationsInteractor.kt", i = {0}, l = {121, 122}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.suggest_locations.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35151p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<CoordsByAddressResult>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292349q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f292350r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35154t f292351s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f292352t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35151p(C35154t c35154t, String str, Continuation<? super C35151p> continuation) {
        super(2, continuation);
        this.f292351s = c35154t;
        this.f292352t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35151p c35151p = new C35151p(this.f292351s, this.f292352t, continuation);
        c35151p.f292350r = obj;
        return c35151p;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<CoordsByAddressResult>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35151p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f292349q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f292350r;
            com.avito.android.geo_common.interactor.g gVar = this.f292351s.f292378a;
            this.f292350r = interfaceC43172j;
            this.f292349q = 1;
            obj = gVar.o(this.f292352t, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f292350r;
            C42729a0.b(obj);
        }
        this.f292350r = null;
        this.f292349q = 2;
        if (interfaceC43172j.emit((TypedResult) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
