package com.avito.android.str_calendar.seller.calendar.mvi;

import Hy0.C14050b;
import Hy0.C14051c;
import com.avito.android.error.z;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarInternalAction;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarState;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.mvi.StrSellerCalendarActor$onEditParametersClick$1", f = "StrSellerCalendarActor.kt", i = {}, l = {75, 84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f287672q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f287673r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrSellerCalendarState f287674s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f287675t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(StrSellerCalendarState strSellerCalendarState, d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f287674s = strSellerCalendarState;
        this.f287675t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f287674s, this.f287675t, continuation);
        bVar.f287673r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Date date;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287672q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return G0.f406611a;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f287673r;
        StrSellerCalendarState strSellerCalendarState = this.f287674s;
        String str = strSellerCalendarState.f287721h;
        d dVar = this.f287675t;
        if (str == null) {
            C14050b c14050b = dVar.f287681c;
            Throwable th2 = C14051c.f7846a;
            c14050b.a(th2);
            StrSellerCalendarInternalAction.ContentError contentError = new StrSellerCalendarInternalAction.ContentError(z.n(th2));
            this.f287672q = 1;
            if (interfaceC43172j.emit(contentError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        DateRange dateRange = strSellerCalendarState.f287718e;
        if (dateRange == null || (date = dateRange.f286636b) == null) {
            date = strSellerCalendarState.f287717d;
        }
        Date date2 = dateRange != null ? dateRange.f286637c : null;
        dVar.f287682d.b(str);
        StrSellerCalendarInternalAction.ShowCalendarParameters showCalendarParameters = new StrSellerCalendarInternalAction.ShowCalendarParameters(strSellerCalendarState.f287721h, date, date2, strSellerCalendarState.f287722i);
        this.f287672q = 2;
        if (interfaceC43172j.emit(showCalendarParameters, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
