package com.avito.android.service_booking_calendar.domain.use_case;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import Ys0.InterfaceC18323a;
import com.avito.android.service_booking_calendar.data.model.ServiceBookingFlexibleScheduleResult;
import com.avito.android.service_booking_calendar.day.schedule.di.m;
import com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction;
import com.avito.android.util.R0;
import it0.InterfaceC42109d;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LoadFlexibleScheduleUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/use_case/f;", "Lcom/avito/android/service_booking_calendar/domain/use_case/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.android.service_booking_calendar.domain.use_case.b {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC18323a f275584d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_calendar.domain.c f275585e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final R0 f275586f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42109d f275587g;

    /* compiled from: LoadFlexibleScheduleUseCaseImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f275588a;

        static {
            int[] iArr = new int[ServiceBookingFlexibleScheduleResult.ButtonStyle.values().length];
            try {
                iArr[ServiceBookingFlexibleScheduleResult.ButtonStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceBookingFlexibleScheduleResult.ButtonStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f275588a = iArr;
        }
    }

    /* compiled from: LoadFlexibleScheduleUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.domain.use_case.LoadFlexibleScheduleUseCaseImpl$invoke$1", f = "LoadFlexibleScheduleUseCaseImpl.kt", i = {0, 1, 1}, l = {38, 44, 67, 71}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "timeSlots"}, s = {"L$0", "L$0", "L$1"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super DayScheduleInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public List f275589q;

        /* renamed from: r, reason: collision with root package name */
        public int f275590r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f275591s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f275593u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f275594v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f275593u = str;
            this.f275594v = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = f.this.new b(this.f275593u, this.f275594v, continuation);
            bVar.f275591s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DayScheduleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_calendar.domain.use_case.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LoadFlexibleScheduleUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.domain.use_case.LoadFlexibleScheduleUseCaseImpl$invoke$2", f = "LoadFlexibleScheduleUseCaseImpl.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super DayScheduleInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275595q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f275596r;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(2, continuation);
            cVar.f275596r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DayScheduleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275595q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275596r;
                DayScheduleInternalAction.ScheduleLoading scheduleLoading = new DayScheduleInternalAction.ScheduleLoading();
                this.f275595q = 1;
                if (interfaceC43172j.emit(scheduleLoading, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LoadFlexibleScheduleUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.domain.use_case.LoadFlexibleScheduleUseCaseImpl$invoke$3", f = "LoadFlexibleScheduleUseCaseImpl.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements q<InterfaceC43172j<? super DayScheduleInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275597q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f275598r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f275599s;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super DayScheduleInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f275598r = interfaceC43172j;
            dVar.f275599s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275597q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f275598r;
                DayScheduleInternalAction.ScheduleLoadingError scheduleLoadingError = new DayScheduleInternalAction.ScheduleLoadingError(this.f275599s);
                this.f275598r = null;
                this.f275597q = 1;
                if (interfaceC43172j.emit(scheduleLoadingError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public f(@k InterfaceC18323a interfaceC18323a, @k com.avito.android.service_booking_calendar.domain.c cVar, @k R0 r02, @l @com.avito.android.service_booking_calendar.day.schedule.di.k Integer num, @m boolean z12, @com.avito.android.service_booking_calendar.day.schedule.di.l boolean z13, @k InterfaceC42109d interfaceC42109d) {
        super(num, z12, z13);
        this.f275584d = interfaceC18323a;
        this.f275585e = cVar;
        this.f275586f = r02;
        this.f275587g = interfaceC42109d;
    }

    @Override // com.avito.android.service_booking_calendar.domain.use_case.b
    @k
    public final InterfaceC43160i<DayScheduleInternalAction> a(@k String str, boolean z12) {
        return C43175k.I(this.f275586f.a(), new C43152f0(new C43137a0(new c(2, null), C43175k.G(new b(str, z12, null))), new d(3, null)));
    }
}
