package com.avito.android.service_booking_schedule_repetition_impl.mvi.domain;

import Y41.l;
import Y41.p;
import Y41.q;
import com.avito.android.R;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_calendar.view.day.d;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionInternalAction;
import com.avito.android.util.R0;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ut0.InterfaceC49110a;

/* compiled from: SaveScheduleRepetitionUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/g;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/f;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49110a f277663a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f277664b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RepetitionSchedule f277665c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.breaks.a f277666d;

    /* compiled from: SaveScheduleRepetitionUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.SaveScheduleRepetitionUseCaseImpl$invoke$1", f = "SaveScheduleRepetitionUseCase.kt", i = {0, 2, 2}, l = {38, 50, 55, 56}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "response"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ScheduleRepetitionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult.Error f277667q;

        /* renamed from: r, reason: collision with root package name */
        public int f277668r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f277669s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<com.avito.android.service_booking_calendar.a> f277670t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ g f277671u;

        /* compiled from: SaveScheduleRepetitionUseCase.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/d$a;", "Lkotlin/internal/i;", "it", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/a;", "invoke", "(Lcom/avito/android/service_booking_calendar/view/day/d$a;)Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.g$a$a, reason: collision with other inner class name */
        public static final class C8245a extends N implements l<d.a, com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.a> {

            /* renamed from: l, reason: collision with root package name */
            public static final C8245a f277672l = new C8245a();

            public C8245a() {
                super(1);
            }

            @Override // Y41.l
            public final com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.a invoke(d.a aVar) {
                return (com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.a) aVar.f276190c;
            }
        }

        /* compiled from: SaveScheduleRepetitionUseCase.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/a;", "it", "", "invoke", "(Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements l<com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.a, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f277673l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.a aVar) {
                return Boolean.valueOf(aVar.f277639e);
            }
        }

        /* compiled from: SaveScheduleRepetitionUseCase.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/a;", "it", "", "invoke", "(Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/a;)Ljava/lang/Long;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class c extends N implements l<com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.a, Long> {

            /* renamed from: l, reason: collision with root package name */
            public static final c f277674l = new c();

            public c() {
                super(1);
            }

            @Override // Y41.l
            public final Long invoke(com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.a aVar) {
                return aVar.f277640f;
            }
        }

        /* compiled from: _Sequences.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class d extends N implements l<Object, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final d f277675l = new d();

            public d() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof d.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends com.avito.android.service_booking_calendar.a> list, g gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f277670t = list;
            this.f277671u = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f277670t, this.f277671u, continuation);
            aVar.f277669s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ScheduleRepetitionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00f8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SaveScheduleRepetitionUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.SaveScheduleRepetitionUseCaseImpl$invoke$2", f = "SaveScheduleRepetitionUseCase.kt", i = {0}, l = {61, 62}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super ScheduleRepetitionInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277676q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f277677r;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ScheduleRepetitionInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f277677r = interfaceC43172j;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277676q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = this.f277677r;
                ScheduleRepetitionInternalAction.HideSaveLoading hideSaveLoading = ScheduleRepetitionInternalAction.HideSaveLoading.f277690b;
                this.f277677r = interfaceC43172j;
                this.f277676q = 1;
                if (interfaceC43172j.emit(hideSaveLoading, this) == coroutine_suspended) {
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
                interfaceC43172j = this.f277677r;
                C42729a0.b(obj);
            }
            ScheduleRepetitionInternalAction.ShowErrorToast showErrorToast = new ScheduleRepetitionInternalAction.ShowErrorToast(com.avito.android.printable_text.b.c(R.string.sb_schedule_repetition_default_save_error, new Serializable[0]));
            this.f277677r = null;
            this.f277676q = 2;
            if (interfaceC43172j.emit(showErrorToast, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveScheduleRepetitionUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.SaveScheduleRepetitionUseCaseImpl$invoke$3", f = "SaveScheduleRepetitionUseCase.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super ScheduleRepetitionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277678q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277679r;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(2, continuation);
            cVar.f277679r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ScheduleRepetitionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277678q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277679r;
                ScheduleRepetitionInternalAction.ShowSaveLoading showSaveLoading = ScheduleRepetitionInternalAction.ShowSaveLoading.f277705b;
                this.f277678q = 1;
                if (interfaceC43172j.emit(showSaveLoading, this) == coroutine_suspended) {
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
    public g(@Y61.k InterfaceC49110a interfaceC49110a, @Y61.k R0 r02, @Y61.k RepetitionSchedule repetitionSchedule, @Y61.k com.avito.android.service_booking_day_settings.breaks.a aVar) {
        this.f277663a = interfaceC49110a;
        this.f277664b = r02;
        this.f277665c = repetitionSchedule;
        this.f277666d = aVar;
    }

    @Override // com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.f
    @Y61.k
    public final InterfaceC43160i<ScheduleRepetitionInternalAction> a(@Y61.k List<? extends com.avito.android.service_booking_calendar.a> list) {
        return C43175k.I(this.f277664b.a(), new C43137a0(new c(2, null), new C43152f0(C43175k.G(new a(list, this, null)), new b(3, null))));
    }
}
