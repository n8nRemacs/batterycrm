package com.avito.android.str_calendar.booking_calendar.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.remote.d1;
import com.avito.android.remote.model.StrBookingCalendar;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lE.C43624b;
import oy0.C44956a;
import vy0.C49398a;
import yy0.InterfaceC50323a;
import zy0.InterfaceC50643a;

/* compiled from: StrBookingCalendarInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/q;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/p;", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q implements p {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f286500i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d1 f286501a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50323a f286502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43624b f286503c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f286504d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f286505e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f286506f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.booking_calendar.h f286507g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35089h f286508h;

    /* compiled from: StrBookingCalendarInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/q$a;", "", "<init>", "()V", "", "DEFAULT_MONTHS_COUNT_TO_SHOW", "I", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "com/avito/android/str_calendar/booking_calendar/mvi/t", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<StrBookingCalendarInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43137a0 f286509b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f286510c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f286511d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SelectedDateRange f286512e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Date f286513f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Date f286514g;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/avito/android/str_calendar/booking_calendar/mvi/t$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f286515b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f286516c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ q f286517d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ SelectedDateRange f286518e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Date f286519f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Date f286520g;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarData$$inlined$getBookingCalendarDates$10$2", f = "StrBookingCalendarInteractor.kt", i = {}, l = {233, 219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.q$b$a$a, reason: collision with other inner class name */
            public static final class C8581a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f286521q;

                /* renamed from: r, reason: collision with root package name */
                public int f286522r;

                /* renamed from: s, reason: collision with root package name */
                public InterfaceC43172j f286523s;

                public C8581a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f286521q = obj;
                    this.f286522r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, q qVar, q qVar2, SelectedDateRange selectedDateRange, Date date, Date date2) {
                this.f286515b = interfaceC43172j;
                this.f286516c = qVar;
                this.f286517d = qVar2;
                this.f286518e = selectedDateRange;
                this.f286519f = date;
                this.f286520g = date2;
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r14, @Y61.k kotlin.coroutines.Continuation r15) {
                /*
                    Method dump skipped, instructions count: 285
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.q.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(C43137a0 c43137a0, q qVar, q qVar2, SelectedDateRange selectedDateRange, Date date, Date date2) {
            this.f286509b = c43137a0;
            this.f286510c = qVar;
            this.f286511d = qVar2;
            this.f286512e = selectedDateRange;
            this.f286513f = date;
            this.f286514g = date2;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super StrBookingCalendarInternalAction> interfaceC43172j, @Y61.k Continuation continuation) throws Throwable {
            Object objCollect = this.f286509b.collect(new a(interfaceC43172j, this.f286510c, this.f286511d, this.f286512e, this.f286513f, this.f286514g), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: StrBookingCalendarInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/str_calendar/booking_calendar/mvi/u"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarData$$inlined$getBookingCalendarDates$1", f = "StrBookingCalendarInteractor.kt", i = {}, l = {334, 233}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<InterfaceC50643a>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f286525q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f286526r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ q f286527s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f286528t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f286529u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Continuation continuation, q qVar, String str, String str2) {
            super(2, continuation);
            this.f286527s = qVar;
            this.f286528t = str;
            this.f286529u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(continuation, this.f286527s, this.f286528t, this.f286529u);
            cVar.f286526r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<InterfaceC50643a>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286525q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f286526r;
                InterfaceC50323a interfaceC50323a = this.f286527s.f286502b;
                Long lZ02 = C43066x.z0(this.f286528t);
                this.f286526r = interfaceC43172j;
                this.f286525q = 1;
                obj = interfaceC50323a.a(lZ02, this.f286529u, this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f286526r;
                C42729a0.b(obj);
            }
            this.f286526r = null;
            this.f286525q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrBookingCalendarInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lcom/avito/android/remote/model/TypedResult;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/model/TypedResult;)V", "com/avito/android/str_calendar/booking_calendar/mvi/v"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarDates$2", f = "StrBookingCalendarInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<TypedResult<InterfaceC50643a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f286530q;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = q.this.new d(continuation);
            dVar.f286530q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(TypedResult<InterfaceC50643a> typedResult, Continuation<? super G0> continuation) {
            return ((d) create(typedResult, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            TypedResult typedResult = (TypedResult) this.f286530q;
            if (typedResult instanceof TypedResult.Error) {
                InterfaceC28373a interfaceC28373a = q.this.f286506f;
                StringBuilder sb2 = new StringBuilder("StrBookingCalendar: api error = ");
                TypedResult.Error error = (TypedResult.Error) typedResult;
                sb2.append(error.getError());
                interfaceC28373a.c(new NonFatalErrorEvent(sb2.toString(), error.getCause(), null, NonFatalErrorEvent.a.C4323a.f147930a, 4, null));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "com/avito/android/str_calendar/booking_calendar/mvi/s", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements InterfaceC43160i<P2<? super InterfaceC50643a>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43197r1 f286532b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/avito/android/str_calendar/booking_calendar/mvi/s$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f286533b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarData$$inlined$getBookingCalendarDates$3$2", f = "StrBookingCalendarInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.q$e$a$a, reason: collision with other inner class name */
            public static final class C8582a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f286534q;

                /* renamed from: r, reason: collision with root package name */
                public int f286535r;

                public C8582a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f286534q = obj;
                    this.f286535r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f286533b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.str_calendar.booking_calendar.mvi.q.e.a.C8582a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.str_calendar.booking_calendar.mvi.q$e$a$a r0 = (com.avito.android.str_calendar.booking_calendar.mvi.q.e.a.C8582a) r0
                    int r1 = r0.f286535r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f286535r = r1
                    goto L18
                L13:
                    com.avito.android.str_calendar.booking_calendar.mvi.q$e$a$a r0 = new com.avito.android.str_calendar.booking_calendar.mvi.q$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f286534q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f286535r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L60
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
                    boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r6 == 0) goto L46
                    com.avito.android.util.P2$b r6 = new com.avito.android.util.P2$b
                    com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
                    java.lang.Object r5 = r5.getResult()
                    r6.<init>(r5)
                    goto L55
                L46:
                    boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r6 == 0) goto L63
                    com.avito.android.util.P2$a r6 = new com.avito.android.util.P2$a
                    com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
                    com.avito.android.remote.error.ApiError r5 = r5.getError()
                    r6.<init>(r5)
                L55:
                    r0.f286535r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f286533b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L60
                    return r1
                L60:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L63:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.q.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(C43197r1 c43197r1) {
            this.f286532b = c43197r1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super P2<? super InterfaceC50643a>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f286532b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: StrBookingCalendarInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/str_calendar/booking_calendar/mvi/w"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarDates$4", f = "StrBookingCalendarInteractor.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super P2<? super InterfaceC50643a>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f286537q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f286538r;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(2, continuation);
            fVar.f286538r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super P2<? super InterfaceC50643a>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286537q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f286538r;
                P2.c cVar = P2.c.f318721a;
                this.f286537q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "com/avito/android/str_calendar/booking_calendar/mvi/t", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements InterfaceC43160i<StrBookingCalendarInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43137a0 f286539b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f286540c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f286541d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SelectedDateRange f286542e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Date f286543f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Date f286544g;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/avito/android/str_calendar/booking_calendar/mvi/t$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f286545b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f286546c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ q f286547d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ SelectedDateRange f286548e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Date f286549f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Date f286550g;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarData$$inlined$getBookingCalendarDates$5$2", f = "StrBookingCalendarInteractor.kt", i = {}, l = {234, 219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.q$g$a$a, reason: collision with other inner class name */
            public static final class C8583a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f286551q;

                /* renamed from: r, reason: collision with root package name */
                public int f286552r;

                /* renamed from: s, reason: collision with root package name */
                public InterfaceC43172j f286553s;

                public C8583a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f286551q = obj;
                    this.f286552r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, q qVar, q qVar2, SelectedDateRange selectedDateRange, Date date, Date date2) {
                this.f286545b = interfaceC43172j;
                this.f286546c = qVar;
                this.f286547d = qVar2;
                this.f286548e = selectedDateRange;
                this.f286549f = date;
                this.f286550g = date2;
            }

            /* JADX WARN: Removed duplicated region for block: B:59:0x014a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r14, @Y61.k kotlin.coroutines.Continuation r15) {
                /*
                    Method dump skipped, instructions count: 346
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.q.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(C43137a0 c43137a0, q qVar, q qVar2, SelectedDateRange selectedDateRange, Date date, Date date2) {
            this.f286539b = c43137a0;
            this.f286540c = qVar;
            this.f286541d = qVar2;
            this.f286542e = selectedDateRange;
            this.f286543f = date;
            this.f286544g = date2;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super StrBookingCalendarInternalAction> interfaceC43172j, @Y61.k Continuation continuation) throws Throwable {
            Object objCollect = this.f286539b.collect(new a(interfaceC43172j, this.f286540c, this.f286541d, this.f286542e, this.f286543f, this.f286544g), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: StrBookingCalendarInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/str_calendar/booking_calendar/mvi/u"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarData$$inlined$getBookingCalendarDates$6", f = "StrBookingCalendarInteractor.kt", i = {}, l = {334, 233}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<StrBookingCalendar>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f286555q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f286556r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ q f286557s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f286558t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f286559u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Continuation continuation, q qVar, String str, String str2) {
            super(2, continuation);
            this.f286557s = qVar;
            this.f286558t = str;
            this.f286559u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = new h(continuation, this.f286557s, this.f286558t, this.f286559u);
            hVar.f286556r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<StrBookingCalendar>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286555q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f286556r;
                d1 d1Var = this.f286557s.f286501a;
                this.f286556r = interfaceC43172j;
                this.f286555q = 1;
                obj = d1Var.l(this.f286558t, this.f286559u, this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f286556r;
                C42729a0.b(obj);
            }
            this.f286556r = null;
            this.f286555q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrBookingCalendarInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lcom/avito/android/remote/model/TypedResult;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/model/TypedResult;)V", "com/avito/android/str_calendar/booking_calendar/mvi/v"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarDates$2", f = "StrBookingCalendarInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<TypedResult<StrBookingCalendar>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f286560q;

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = q.this.new i(continuation);
            iVar.f286560q = obj;
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(TypedResult<StrBookingCalendar> typedResult, Continuation<? super G0> continuation) {
            return ((i) create(typedResult, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            TypedResult typedResult = (TypedResult) this.f286560q;
            if (typedResult instanceof TypedResult.Error) {
                InterfaceC28373a interfaceC28373a = q.this.f286506f;
                StringBuilder sb2 = new StringBuilder("StrBookingCalendar: api error = ");
                TypedResult.Error error = (TypedResult.Error) typedResult;
                sb2.append(error.getError());
                interfaceC28373a.c(new NonFatalErrorEvent(sb2.toString(), error.getCause(), null, NonFatalErrorEvent.a.C4323a.f147930a, 4, null));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "com/avito/android/str_calendar/booking_calendar/mvi/s", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements InterfaceC43160i<P2<? super StrBookingCalendar>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43197r1 f286562b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/avito/android/str_calendar/booking_calendar/mvi/s$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f286563b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarData$$inlined$getBookingCalendarDates$8$2", f = "StrBookingCalendarInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.q$j$a$a, reason: collision with other inner class name */
            public static final class C8584a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f286564q;

                /* renamed from: r, reason: collision with root package name */
                public int f286565r;

                public C8584a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f286564q = obj;
                    this.f286565r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f286563b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.str_calendar.booking_calendar.mvi.q.j.a.C8584a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.str_calendar.booking_calendar.mvi.q$j$a$a r0 = (com.avito.android.str_calendar.booking_calendar.mvi.q.j.a.C8584a) r0
                    int r1 = r0.f286565r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f286565r = r1
                    goto L18
                L13:
                    com.avito.android.str_calendar.booking_calendar.mvi.q$j$a$a r0 = new com.avito.android.str_calendar.booking_calendar.mvi.q$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f286564q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f286565r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L60
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
                    boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r6 == 0) goto L46
                    com.avito.android.util.P2$b r6 = new com.avito.android.util.P2$b
                    com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
                    java.lang.Object r5 = r5.getResult()
                    r6.<init>(r5)
                    goto L55
                L46:
                    boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r6 == 0) goto L63
                    com.avito.android.util.P2$a r6 = new com.avito.android.util.P2$a
                    com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
                    com.avito.android.remote.error.ApiError r5 = r5.getError()
                    r6.<init>(r5)
                L55:
                    r0.f286565r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f286563b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L60
                    return r1
                L60:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L63:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.q.j.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public j(C43197r1 c43197r1) {
            this.f286562b = c43197r1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super P2<? super StrBookingCalendar>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f286562b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: StrBookingCalendarInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/str_calendar/booking_calendar/mvi/w"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarDates$4", f = "StrBookingCalendarInteractor.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super P2<? super StrBookingCalendar>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f286567q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f286568r;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            k kVar = new k(2, continuation);
            kVar.f286568r = obj;
            return kVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super P2<? super StrBookingCalendar>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286567q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f286568r;
                P2.c cVar = P2.c.f318721a;
                this.f286567q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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

    /* compiled from: StrBookingCalendarInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getDefaultCalendarData$1", f = "StrBookingCalendarInteractor.kt", i = {0, 1, 1, 3, 3, 3}, l = {130, 132, 147, 156, 163}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "bookingCalendarItems", "$this$flow", "bookingCalendarItems", "calendarData"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrBookingCalendarInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public List f286569q;

        /* renamed from: r, reason: collision with root package name */
        public C44956a f286570r;

        /* renamed from: s, reason: collision with root package name */
        public int f286571s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f286572t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Date f286574v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Date f286575w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelectedDateRange f286576x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f286577y;

        /* compiled from: StrBookingCalendarInteractor.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ljava/util/Date;", "kotlin.jvm.PlatformType", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getDefaultCalendarData$1$bookingCalendarItems$1", f = "StrBookingCalendarInteractor.kt", i = {0}, l = {110}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Date>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f286578q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f286579r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Calendar f286580s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Calendar f286581t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Calendar calendar, Calendar calendar2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f286580s = calendar;
                this.f286581t = calendar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f286580s, this.f286581t, continuation);
                aVar.f286579r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC43172j<? super Date> interfaceC43172j, Continuation<? super G0> continuation) {
                return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003f -> B:14:0x0042). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r8.f286578q
                    java.util.Calendar r2 = r8.f286580s
                    r3 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r3) goto L15
                    java.lang.Object r1 = r8.f286579r
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                    kotlin.C42729a0.b(r9)
                    goto L42
                L15:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1d:
                    kotlin.C42729a0.b(r9)
                    java.lang.Object r9 = r8.f286579r
                    kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                    r1 = r9
                L25:
                    long r4 = r2.getTimeInMillis()
                    java.util.Calendar r9 = r8.f286581t
                    long r6 = r9.getTimeInMillis()
                    int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r9 > 0) goto L47
                    java.util.Date r9 = r2.getTime()
                    r8.f286579r = r1
                    r8.f286578q = r3
                    java.lang.Object r9 = r1.emit(r9, r8)
                    if (r9 != r0) goto L42
                    return r0
                L42:
                    r9 = 6
                    r2.add(r9, r3)
                    goto L25
                L47:
                    kotlin.G0 r9 = kotlin.G0.f406611a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.q.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC43160i<C49398a> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f286582b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Date f286583c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Date f286584d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f286585e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Calendar f286586f;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f286587b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Date f286588c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Date f286589d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f286590e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Calendar f286591f;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getDefaultCalendarData$1$invokeSuspend$$inlined$map$1$2", f = "StrBookingCalendarInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.q$l$b$a$a, reason: collision with other inner class name */
                public static final class C8585a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f286592q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f286593r;

                    public C8585a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f286592q = obj;
                        this.f286593r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j, Date date, Date date2, boolean z12, Calendar calendar) {
                    this.f286587b = interfaceC43172j;
                    this.f286588c = date;
                    this.f286589d = date2;
                    this.f286590e = z12;
                    this.f286591f = calendar;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.avito.android.str_calendar.booking_calendar.mvi.q.l.b.a.C8585a
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.avito.android.str_calendar.booking_calendar.mvi.q$l$b$a$a r0 = (com.avito.android.str_calendar.booking_calendar.mvi.q.l.b.a.C8585a) r0
                        int r1 = r0.f286593r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f286593r = r1
                        goto L18
                    L13:
                        com.avito.android.str_calendar.booking_calendar.mvi.q$l$b$a$a r0 = new com.avito.android.str_calendar.booking_calendar.mvi.q$l$b$a$a
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.f286592q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f286593r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r9)
                        goto L7a
                    L29:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L31:
                        kotlin.C42729a0.b(r9)
                        java.util.Date r8 = (java.util.Date) r8
                        vy0.a r9 = new vy0.a
                        java.util.Date r2 = r7.f286588c
                        boolean r4 = wy0.C49704a.d(r2, r8)
                        if (r4 != 0) goto L46
                        boolean r2 = wy0.C49704a.e(r2, r8)
                        if (r2 == 0) goto L54
                    L46:
                        java.util.Date r2 = r7.f286589d
                        if (r2 == 0) goto L4f
                        boolean r2 = wy0.C49704a.b(r2, r8)
                        goto L50
                    L4f:
                        r2 = r3
                    L50:
                        if (r2 == 0) goto L54
                        r2 = r3
                        goto L55
                    L54:
                        r2 = 0
                    L55:
                        com.avito.android.str_calendar.common.models.DateRange r4 = new com.avito.android.str_calendar.common.models.DateRange
                        boolean r5 = r7.f286590e
                        if (r5 == 0) goto L5d
                        r5 = r8
                        goto L62
                    L5d:
                        r5 = 5
                        java.util.Date r5 = com.avito.android.util.G0.a(r8, r5)
                    L62:
                        java.util.Calendar r6 = r7.f286591f
                        java.util.Date r6 = r6.getTime()
                        r4.<init>(r5, r6)
                        r5 = 0
                        r9.<init>(r8, r2, r4, r5)
                        r0.f286593r = r3
                        kotlinx.coroutines.flow.j r8 = r7.f286587b
                        java.lang.Object r8 = r8.emit(r9, r0)
                        if (r8 != r1) goto L7a
                        return r1
                    L7a:
                        kotlin.G0 r8 = kotlin.G0.f406611a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.q.l.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC43160i interfaceC43160i, Date date, Date date2, boolean z12, Calendar calendar) {
                this.f286582b = interfaceC43160i;
                this.f286583c = date;
                this.f286584d = date2;
                this.f286585e = z12;
                this.f286586f = calendar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super C49398a> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f286582b.collect(new a(interfaceC43172j, this.f286583c, this.f286584d, this.f286585e, this.f286586f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Date date, Date date2, SelectedDateRange selectedDateRange, boolean z12, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f286574v = date;
            this.f286575w = date2;
            this.f286576x = selectedDateRange;
            this.f286577y = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            l lVar = q.this.new l(this.f286574v, this.f286575w, this.f286576x, this.f286577y, continuation);
            lVar.f286572t = obj;
            return lVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrBookingCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0199 A[RETURN] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.List, oy0.a] */
        /* JADX WARN: Type inference failed for: r8v6 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 413
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.q.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrBookingCalendarInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getDefaultCalendarData$2", f = "StrBookingCalendarInteractor.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrBookingCalendarInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f286595q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f286596r;

        public m() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            m mVar = new m(2, continuation);
            mVar.f286596r = obj;
            return mVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrBookingCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286595q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f286596r;
                StrBookingCalendarInternalAction.ShowLoading showLoading = new StrBookingCalendarInternalAction.ShowLoading();
                this.f286595q = 1;
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

    static {
        new a(null);
    }

    @Inject
    public q(@Y61.k d1 d1Var, @Y61.k InterfaceC50323a interfaceC50323a, @Y61.k C43624b c43624b, @Y61.k com.avito.android.server_time.f fVar, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.str_calendar.booking_calendar.h hVar, @Y61.k InterfaceC35089h interfaceC35089h) {
        this.f286501a = d1Var;
        this.f286502b = interfaceC50323a;
        this.f286503c = c43624b;
        this.f286504d = fVar;
        this.f286505e = r02;
        this.f286506f = interfaceC28373a;
        this.f286507g = hVar;
        this.f286508h = interfaceC35089h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.str_calendar.booking_calendar.mvi.q r15, java.util.ArrayList r16, com.avito.android.str_calendar.common.models.SelectedDateRange r17, java.util.Date r18, java.util.Date r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.q.c(com.avito.android.str_calendar.booking_calendar.mvi.q, java.util.ArrayList, com.avito.android.str_calendar.common.models.SelectedDateRange, java.util.Date, java.util.Date, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.str_calendar.booking_calendar.mvi.p
    @Y61.k
    public final InterfaceC43160i<StrBookingCalendarInternalAction> a(@Y61.l SelectedDateRange selectedDateRange, @Y61.l Date date, @Y61.l Date date2, boolean z12) {
        return C43175k.I(this.f286505e.c(), new C43137a0(new m(2, null), C43175k.G(new l(date, date2, selectedDateRange, z12, null))));
    }

    @Override // com.avito.android.str_calendar.booking_calendar.mvi.p
    @Y61.k
    public final InterfaceC43160i<StrBookingCalendarInternalAction> b(@Y61.k String str, @Y61.l SelectedDateRange selectedDateRange, @Y61.l Date date, @Y61.l Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f286504d.now());
        String strD = wy0.b.d(calendar.getTime());
        C43624b c43624b = this.f286503c;
        c43624b.getClass();
        kotlin.reflect.n<Object> nVar = C43624b.f413639o[11];
        boolean zBooleanValue = ((Boolean) c43624b.f413651m.a().invoke()).booleanValue();
        R0 r02 = this.f286505e;
        if (zBooleanValue) {
            return C43175k.I(r02.a(), new g(new C43137a0(new f(2, null), new e(new C43197r1(new d(null), C43175k.G(new c(null, this, str, strD))))), this, this, selectedDateRange, date, date2));
        }
        return C43175k.I(r02.a(), new b(new C43137a0(new k(2, null), new j(new C43197r1(new i(null), C43175k.G(new h(null, this, str, strD))))), this, this, selectedDateRange, date, date2));
    }
}
