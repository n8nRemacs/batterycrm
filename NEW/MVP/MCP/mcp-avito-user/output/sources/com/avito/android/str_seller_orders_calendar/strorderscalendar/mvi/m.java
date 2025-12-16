package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import Sz0.C15273b;
import Uz0.b;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import java.util.Date;
import java.util.List;
import java.util.Map;
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

/* compiled from: StrOrdersCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$handleSellerCalendarUpdatedDates$1", f = "StrOrdersCalendarActor.kt", i = {}, l = {125, 136}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291115q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291116r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b.t f291117s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarState f291118t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C35130a f291119u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b.t tVar, StrOrdersCalendarState strOrdersCalendarState, C35130a c35130a, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f291117s = tVar;
        this.f291118t = strOrdersCalendarState;
        this.f291119u = c35130a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f291117s, this.f291118t, this.f291119u, continuation);
        mVar.f291116r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291115q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f291116r;
            UpdatedParametersInfo updatedParametersInfo = this.f291117s.f16837a;
            if (updatedParametersInfo == null) {
                return G0.f406611a;
            }
            boolean z12 = updatedParametersInfo instanceof UpdatedParametersInfo.Base;
            C35130a c35130a = this.f291119u;
            StrOrdersCalendarState strOrdersCalendarState = this.f291118t;
            if (z12) {
                Date date = strOrdersCalendarState.f291045d;
                if (date == null) {
                    return G0.f406611a;
                }
                Date date2 = strOrdersCalendarState.f291046e;
                if (date2 == null) {
                    return G0.f406611a;
                }
                InterfaceC43160i<StrOrdersCalendarInternalAction> interfaceC43160iA = c35130a.f290983a.a(((UpdatedParametersInfo.Base) updatedParametersInfo).f286649b, date, date2, strOrdersCalendarState.f291052k);
                this.f291115q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (updatedParametersInfo instanceof UpdatedParametersInfo.Ranged) {
                com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a aVar = c35130a.f290983a;
                UpdatedParametersInfo.Ranged ranged = (UpdatedParametersInfo.Ranged) updatedParametersInfo;
                Map<String, List<C15273b>> map = strOrdersCalendarState.f291052k;
                InterfaceC43160i<StrOrdersCalendarInternalAction> interfaceC43160iA2 = aVar.a(ranged.f286650b, ranged.f286651c, ranged.f286652d, map);
                this.f291115q = 2;
                if (C43175k.u(this, interfaceC43160iA2, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
