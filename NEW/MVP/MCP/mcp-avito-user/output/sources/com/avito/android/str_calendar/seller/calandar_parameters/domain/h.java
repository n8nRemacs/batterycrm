package com.avito.android.str_calendar.seller.calandar_parameters.domain;

import com.avito.android.remote.d1;
import com.avito.android.remote.model.StrSellerCalendarParameters;
import com.avito.android.remote.model.TypedResult;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StrSellerCalendarParameters;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$initialLoadParameters$1", f = "StrCalendarParametersInteractor.kt", i = {}, l = {71, 76, 79, 66}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<StrSellerCalendarParameters>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286964q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f286965r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Date f286966s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Date f286967t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f286968u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f286969v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Date date, Date date2, b bVar, String str, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f286966s = date;
        this.f286967t = date2;
        this.f286968u = bVar;
        this.f286969v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f286966s, this.f286967t, this.f286968u, this.f286969v, continuation);
        hVar.f286965r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<StrSellerCalendarParameters>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Date date;
        TypedResult typedResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f286964q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f286965r;
            String str = this.f286969v;
            b bVar = this.f286968u;
            Date date2 = this.f286966s;
            if (date2 != null && (date = this.f286967t) != null) {
                String strD = wy0.b.d(date2);
                String strD2 = wy0.b.d(date);
                d1 d1Var = bVar.f286868a;
                this.f286965r = interfaceC43172j;
                this.f286964q = 1;
                obj = d1Var.g(str, strD, strD2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                typedResult = (TypedResult) obj;
            } else if (date2 != null) {
                String strD3 = wy0.b.d(date2);
                d1 d1Var2 = bVar.f286868a;
                this.f286965r = interfaceC43172j;
                this.f286964q = 2;
                obj = d1Var2.g(str, strD3, strD3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                typedResult = (TypedResult) obj;
            } else {
                d1 d1Var3 = bVar.f286868a;
                this.f286965r = interfaceC43172j;
                this.f286964q = 3;
                obj = d1Var3.f(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                typedResult = (TypedResult) obj;
            }
        } else if (i12 == 1) {
            interfaceC43172j = (InterfaceC43172j) this.f286965r;
            C42729a0.b(obj);
            typedResult = (TypedResult) obj;
        } else if (i12 == 2) {
            interfaceC43172j = (InterfaceC43172j) this.f286965r;
            C42729a0.b(obj);
            typedResult = (TypedResult) obj;
        } else {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f286965r;
            C42729a0.b(obj);
            typedResult = (TypedResult) obj;
        }
        this.f286965r = null;
        this.f286964q = 4;
        if (interfaceC43172j.emit(typedResult, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
