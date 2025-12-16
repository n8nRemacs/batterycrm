package com.avito.android.str_calendar.seller.calandar_parameters.domain;

import com.avito.android.remote.d1;
import com.avito.android.remote.model.StrSellerCalendarParametersUpdateResponse;
import com.avito.android.remote.model.TypedResult;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StrSellerCalendarParametersUpdateResponse;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$submitParameters$1", f = "StrCalendarParametersInteractor.kt", i = {}, l = {203, 211, 201}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<StrSellerCalendarParametersUpdateResponse>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f287002q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f287003r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f287004s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f287005t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f287006u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f287007v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Boolean f287008w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f287009x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, b bVar, String str2, String str3, Boolean bool, Map<String, String> map, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f287004s = str;
        this.f287005t = bVar;
        this.f287006u = str2;
        this.f287007v = str3;
        this.f287008w = bool;
        this.f287009x = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f287004s, this.f287005t, this.f287006u, this.f287007v, this.f287008w, this.f287009x, continuation);
        mVar.f287003r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<StrSellerCalendarParametersUpdateResponse>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        TypedResult typedResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287002q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f287003r;
            b bVar = this.f287005t;
            String str = this.f287004s;
            if (str == null || str.length() == 0) {
                d1 d1Var = bVar.f286868a;
                this.f287003r = interfaceC43172j;
                this.f287002q = 2;
                obj = d1Var.e(this.f287007v, this.f287008w, this.f287009x, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                typedResult = (TypedResult) obj;
            } else {
                d1 d1Var2 = bVar.f286868a;
                String str2 = this.f287006u;
                String str3 = str2 == null ? str : str2;
                this.f287003r = interfaceC43172j;
                this.f287002q = 1;
                obj = d1Var2.p(this.f287007v, this.f287004s, str3, this.f287008w, this.f287009x, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                typedResult = (TypedResult) obj;
            }
        } else if (i12 == 1) {
            interfaceC43172j = (InterfaceC43172j) this.f287003r;
            C42729a0.b(obj);
            typedResult = (TypedResult) obj;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f287003r;
            C42729a0.b(obj);
            typedResult = (TypedResult) obj;
        }
        this.f287003r = null;
        this.f287002q = 3;
        if (interfaceC43172j.emit(typedResult, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
