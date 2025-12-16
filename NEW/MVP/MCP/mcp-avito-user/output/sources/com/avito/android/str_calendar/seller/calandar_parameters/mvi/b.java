package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import Gy0.InterfaceC13931a;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersActor$handleDialogFormClick$1", f = "StrCalendarParametersActor.kt", i = {}, l = {272, 285}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f287326q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f287327r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Gy0.e f287328s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13931a.l f287329t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f287330u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Gy0.e eVar, InterfaceC13931a.l lVar, a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f287328s = eVar;
        this.f287329t = lVar;
        this.f287330u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f287328s, this.f287329t, this.f287330u, continuation);
        bVar.f287327r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Date date;
        Date date2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287326q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f287327r;
            Gy0.e eVar = this.f287328s;
            SelectedDateRange selectedDateRange = eVar.f6881h;
            String str = this.f287329t.f6822a;
            boolean zF2 = L.f(str, "refundDaysPopup");
            String str2 = eVar.f6885l;
            a aVar = this.f287330u;
            if (zF2) {
                String strD = null;
                Long lZ02 = str2 != null ? C43066x.z0(str2) : null;
                if (lZ02 != null) {
                    aVar.f287309b.a(str2);
                    long jLongValue = lZ02.longValue();
                    String strD2 = (selectedDateRange == null || (date2 = selectedDateRange.f286645b) == null) ? null : wy0.b.d(date2);
                    if (selectedDateRange != null && (date = selectedDateRange.f286646c) != null) {
                        strD = wy0.b.d(date);
                    }
                    StrCalendarParametersInternalAction.OpenCancellationSettings openCancellationSettings = new StrCalendarParametersInternalAction.OpenCancellationSettings(jLongValue, strD2, strD);
                    this.f287326q = 1;
                    if (interfaceC43172j.emit(openCancellationSettings, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (L.f(str, "lastMinuteOfferPopup") && str2 != null && selectedDateRange != null) {
                aVar.f287309b.e(str2);
                StrCalendarParametersInternalAction.ShowLastMinuteOffer showLastMinuteOffer = new StrCalendarParametersInternalAction.ShowLastMinuteOffer(str2, selectedDateRange);
                this.f287326q = 2;
                if (interfaceC43172j.emit(showLastMinuteOffer, this) == coroutine_suspended) {
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
