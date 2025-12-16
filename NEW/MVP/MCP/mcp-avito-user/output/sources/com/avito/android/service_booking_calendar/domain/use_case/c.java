package com.avito.android.service_booking_calendar.domain.use_case;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import Ys0.InterfaceC18323a;
import com.avito.android.service_booking_calendar.day.schedule.di.m;
import com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: LoadDayScheduleUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/use_case/c;", "Lcom/avito/android/service_booking_calendar/domain/use_case/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.avito.android.service_booking_calendar.domain.use_case.b {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC18323a f275564d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_calendar.domain.c f275565e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final R0 f275566f;

    /* compiled from: LoadDayScheduleUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.domain.use_case.LoadDayScheduleUseCaseImpl$invoke$1", f = "LoadDayScheduleUseCaseImpl.kt", i = {0, 1, 1}, l = {AvailableCode.HMS_IS_SPOOF, 35, 41, 45}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "timeSlots"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super DayScheduleInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public List f275567q;

        /* renamed from: r, reason: collision with root package name */
        public int f275568r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f275569s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f275571u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f275572v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f275571u = str;
            this.f275572v = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(this.f275571u, this.f275572v, continuation);
            aVar.f275569s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DayScheduleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f275568r
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 1
                com.avito.android.service_booking_calendar.domain.use_case.c r6 = com.avito.android.service_booking_calendar.domain.use_case.c.this
                r7 = 2
                if (r1 == 0) goto L39
                if (r1 == r5) goto L31
                if (r1 == r7) goto L25
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                kotlin.C42729a0.b(r10)
                goto Lce
            L25:
                java.util.List r1 = r9.f275567q
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r3 = r9.f275569s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r10)
                goto L88
            L31:
                java.lang.Object r1 = r9.f275569s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L52
            L39:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f275569s
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                Ys0.a r1 = r6.f275564d
                r9.f275569s = r10
                r9.f275568r = r5
                java.lang.String r5 = r9.f275571u
                java.lang.Object r1 = r1.c(r5, r9)
                if (r1 != r0) goto L4f
                return r0
            L4f:
                r8 = r1
                r1 = r10
                r10 = r8
            L52:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r5 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto La5
                com.avito.android.service_booking_calendar.domain.c r3 = r6.f275565e
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r5 = r10.getResult()
                com.avito.android.service_booking_calendar.data.model.a r5 = (com.avito.android.service_booking_calendar.data.model.a) r5
                java.util.List r5 = r5.b()
                java.lang.Object r10 = r10.getResult()
                com.avito.android.service_booking_calendar.data.model.a r10 = (com.avito.android.service_booking_calendar.data.model.a) r10
                java.util.List r10 = r10.a()
                java.util.ArrayList r10 = r3.a(r5, r10)
                com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction$ScheduleLoaded r3 = new com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction$ScheduleLoaded
                r3.<init>(r10, r2, r7, r2)
                r9.f275569s = r1
                r9.f275567q = r10
                r9.f275568r = r7
                java.lang.Object r3 = r1.emit(r3, r9)
                if (r3 != r0) goto L86
                return r0
            L86:
                r3 = r1
                r1 = r10
            L88:
                boolean r10 = r9.f275572v
                if (r10 == 0) goto Lce
                r6.getClass()
                com.avito.android.service_booking_calendar.domain.use_case.a r10 = new com.avito.android.service_booking_calendar.domain.use_case.a
                r10.<init>(r6, r1, r2)
                kotlinx.coroutines.flow.i r10 = kotlinx.coroutines.flow.C43175k.G(r10)
                r9.f275569s = r2
                r9.f275567q = r2
                r9.f275568r = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r3)
                if (r10 != r0) goto Lce
                return r0
            La5:
                boolean r4 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto Lce
                com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction$ScheduleLoadingError r4 = new com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction$ScheduleLoadingError
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                java.lang.Throwable r5 = r10.getCause()
                if (r5 != 0) goto Lc0
                java.lang.Throwable r5 = new java.lang.Throwable
                com.avito.android.remote.error.ApiError r10 = r10.getError()
                java.lang.String r10 = r10.getF244063c()
                r5.<init>(r10)
            Lc0:
                r4.<init>(r5)
                r9.f275569s = r2
                r9.f275568r = r3
                java.lang.Object r10 = r1.emit(r4, r9)
                if (r10 != r0) goto Lce
                return r0
            Lce:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_calendar.domain.use_case.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LoadDayScheduleUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.domain.use_case.LoadDayScheduleUseCaseImpl$invoke$2", f = "LoadDayScheduleUseCaseImpl.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super DayScheduleInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275573q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f275574r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f275574r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DayScheduleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275573q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275574r;
                DayScheduleInternalAction.ScheduleLoading scheduleLoading = new DayScheduleInternalAction.ScheduleLoading();
                this.f275573q = 1;
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

    /* compiled from: LoadDayScheduleUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.domain.use_case.LoadDayScheduleUseCaseImpl$invoke$3", f = "LoadDayScheduleUseCaseImpl.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_booking_calendar.domain.use_case.c$c, reason: collision with other inner class name */
    public static final class C8177c extends SuspendLambda implements q<InterfaceC43172j<? super DayScheduleInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275575q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f275576r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f275577s;

        public C8177c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super DayScheduleInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C8177c c8177c = new C8177c(3, continuation);
            c8177c.f275576r = interfaceC43172j;
            c8177c.f275577s = th2;
            return c8177c.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275575q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f275576r;
                DayScheduleInternalAction.ScheduleLoadingError scheduleLoadingError = new DayScheduleInternalAction.ScheduleLoadingError(this.f275577s);
                this.f275576r = null;
                this.f275575q = 1;
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
    public c(@k InterfaceC18323a interfaceC18323a, @k com.avito.android.service_booking_calendar.domain.c cVar, @k R0 r02, @l @com.avito.android.service_booking_calendar.day.schedule.di.k Integer num, @m boolean z12, @com.avito.android.service_booking_calendar.day.schedule.di.l boolean z13) {
        super(num, z12, z13);
        this.f275564d = interfaceC18323a;
        this.f275565e = cVar;
        this.f275566f = r02;
    }

    @Override // com.avito.android.service_booking_calendar.domain.use_case.b
    @k
    public final InterfaceC43160i<DayScheduleInternalAction> a(@k String str, boolean z12) {
        return C43175k.I(this.f275566f.a(), new C43152f0(new C43137a0(new b(2, null), C43175k.G(new a(str, z12, null))), new C8177c(3, null)));
    }
}
