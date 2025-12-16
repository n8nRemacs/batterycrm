package com.avito.android.service_booking_schedule_repetition_impl.mvi.domain;

import Kt0.InterfaceC14349a;
import Lt0.InterfaceC14438a;
import Y41.p;
import Y41.q;
import Y61.l;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionInternalAction;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetScheduleRepetitionUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/c;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/b;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14349a f277641a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f277642b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RepetitionSchedule f277643c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Lt0.e f277644d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14438a f277645e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.breaks.a f277646f;

    /* compiled from: GetScheduleRepetitionUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.GetScheduleRepetitionUseCaseImpl$invoke$1", f = "GetScheduleRepetitionUseCase.kt", i = {0, 1, 1}, l = {37, 49, 57, 62}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "calendarItems"}, s = {"L$0", "L$0", "L$2"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ScheduleRepetitionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public c f277647q;

        /* renamed from: r, reason: collision with root package name */
        public List f277648r;

        /* renamed from: s, reason: collision with root package name */
        public int f277649s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f277650t;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f277650t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ScheduleRepetitionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0149 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00fd A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x012e A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: GetScheduleRepetitionUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.GetScheduleRepetitionUseCaseImpl$invoke$2", f = "GetScheduleRepetitionUseCase.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super ScheduleRepetitionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277652q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277653r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f277653r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ScheduleRepetitionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277652q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277653r;
                ScheduleRepetitionInternalAction.ShowLoading showLoading = new ScheduleRepetitionInternalAction.ShowLoading();
                this.f277652q = 1;
                if (interfaceC43172j.emit(showLoading, this) == coroutine_suspended) {
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

    /* compiled from: GetScheduleRepetitionUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.GetScheduleRepetitionUseCaseImpl$invoke$3", f = "GetScheduleRepetitionUseCase.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.c$c, reason: collision with other inner class name */
    public static final class C8244c extends SuspendLambda implements q<InterfaceC43172j<? super ScheduleRepetitionInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277654q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f277655r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f277656s;

        public C8244c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ScheduleRepetitionInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C8244c c8244c = new C8244c(3, continuation);
            c8244c.f277655r = interfaceC43172j;
            c8244c.f277656s = th2;
            return c8244c.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277654q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f277655r;
                ScheduleRepetitionInternalAction.ShowDefaultError showDefaultError = new ScheduleRepetitionInternalAction.ShowDefaultError(this.f277656s);
                this.f277655r = null;
                this.f277654q = 1;
                if (interfaceC43172j.emit(showDefaultError, this) == coroutine_suspended) {
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
    public c(@Y61.k InterfaceC14349a interfaceC14349a, @Y61.k R0 r02, @Y61.k RepetitionSchedule repetitionSchedule, @Y61.k Lt0.e eVar, @Y61.k InterfaceC14438a interfaceC14438a, @Y61.k com.avito.android.service_booking_day_settings.breaks.a aVar) {
        this.f277641a = interfaceC14349a;
        this.f277642b = r02;
        this.f277643c = repetitionSchedule;
        this.f277644d = eVar;
        this.f277645e = interfaceC14438a;
        this.f277646f = aVar;
    }

    @Override // com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.b
    @Y61.k
    public final InterfaceC43160i<ScheduleRepetitionInternalAction> invoke() {
        return C43175k.I(this.f277642b.a(), new C43152f0(new C43137a0(new b(2, null), C43175k.G(new a(null))), new C8244c(3, null)));
    }
}
