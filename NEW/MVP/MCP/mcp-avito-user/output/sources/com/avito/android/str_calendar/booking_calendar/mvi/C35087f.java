package com.avito.android.str_calendar.booking_calendar.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarInitParameters;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
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

/* compiled from: StrBookingCalendarBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35087f implements com.avito.android.arch.mvi.b<StrBookingCalendarInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final StrBookingCalendarInitParameters f286460a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f286461b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f286462c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f286463d;

    /* compiled from: StrBookingCalendarBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarBootstrap$produce$1", f = "StrBookingCalendarBootstrap.kt", i = {0, 0}, l = {AvailableCode.HMS_IS_SPOOF, 35}, m = "invokeSuspend", n = {"$this$flow", "todayDate"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.f$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrBookingCalendarInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Date f286464q;

        /* renamed from: r, reason: collision with root package name */
        public int f286465r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f286466s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C35087f.this.new a(continuation);
            aVar.f286466s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrBookingCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Date time;
            InterfaceC43160i<StrBookingCalendarInternalAction> interfaceC43160iA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286465r;
            C35087f c35087f = C35087f.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f286466s;
                if (c35087f.f286463d) {
                    return G0.f406611a;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(c35087f.f286462c.now());
                time = calendar.getTime();
                StrBookingCalendarInternalAction.Init init = new StrBookingCalendarInternalAction.Init(c35087f.f286460a, time);
                this.f286466s = interfaceC43172j;
                this.f286464q = time;
                this.f286465r = 1;
                if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    c35087f.f286463d = true;
                    return G0.f406611a;
                }
                time = this.f286464q;
                interfaceC43172j = (InterfaceC43172j) this.f286466s;
                C42729a0.b(obj);
            }
            String str = c35087f.f286460a.f286359b;
            StrBookingCalendarInitParameters strBookingCalendarInitParameters = c35087f.f286460a;
            p pVar = c35087f.f286461b;
            if (str == null || str.length() == 0) {
                SelectedDateRange selectedDateRange = strBookingCalendarInitParameters.f286360c;
                Date date = strBookingCalendarInitParameters.f286361d;
                if (date != null) {
                    time = date;
                }
                interfaceC43160iA = pVar.a(selectedDateRange, time, strBookingCalendarInitParameters.f286362e, strBookingCalendarInitParameters.f286363f);
            } else {
                String str2 = strBookingCalendarInitParameters.f286359b;
                Date date2 = strBookingCalendarInitParameters.f286361d;
                if (date2 != null) {
                    time = date2;
                }
                interfaceC43160iA = pVar.b(str2, strBookingCalendarInitParameters.f286360c, time, strBookingCalendarInitParameters.f286362e);
            }
            this.f286466s = null;
            this.f286464q = null;
            this.f286465r = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c35087f.f286463d = true;
            return G0.f406611a;
        }
    }

    @Inject
    public C35087f(@Y61.k StrBookingCalendarInitParameters strBookingCalendarInitParameters, @Y61.k p pVar, @Y61.k com.avito.android.server_time.f fVar) {
        this.f286460a = strBookingCalendarInitParameters;
        this.f286461b = pVar;
        this.f286462c = fVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrBookingCalendarInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
