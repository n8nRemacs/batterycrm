package com.avito.android.str_calendar.seller.last_minute_offer;

import Y41.p;
import com.avito.android.remote.d1;
import com.avito.android.remote.model.StrSellerCalendarParametersUpdateResponse;
import com.avito.android.remote.model.TypedResult;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LastMinuteOfferInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StrSellerCalendarParametersUpdateResponse;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.last_minute_offer.LastMinuteOfferInteractorImpl$updateLastMinuteOfferParameter$1", f = "LastMinuteOfferInteractor.kt", i = {}, l = {64, 62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class g extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<StrSellerCalendarParametersUpdateResponse>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f287895q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f287896r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f287897s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f287898t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f287899u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f287900v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, c cVar, String str2, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f287897s = str;
        this.f287898t = cVar;
        this.f287899u = str2;
        this.f287900v = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f287897s, this.f287898t, this.f287899u, this.f287900v, continuation);
        gVar.f287896r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<StrSellerCalendarParametersUpdateResponse>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287895q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f287896r;
            String str = this.f287897s;
            if (str == null) {
                throw new IllegalStateException("startDate couldn't be null");
            }
            c cVar = this.f287898t;
            d1 d1Var = cVar.f287843a;
            String str2 = this.f287899u;
            String str3 = str2 == null ? str : str2;
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            this.f287896r = interfaceC43172j;
            this.f287895q = 1;
            obj = d1Var.p(cVar.f287845c, str, str3, boolBoxBoolean, this.f287900v, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f287896r;
            C42729a0.b(obj);
        }
        this.f287896r = null;
        this.f287895q = 2;
        if (interfaceC43172j.emit((TypedResult) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
