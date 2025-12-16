package com.avito.android.service_booking_calendar.flexible.data.domain;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import Ys0.InterfaceC18323a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_calendar.domain.ToolbarAction;
import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.CalendarDataInternalAction;
import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
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

/* compiled from: LoadCalendarDaysUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/domain/e;", "Lcom/avito/android/service_booking_calendar/flexible/data/domain/d;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC18323a f275683a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_calendar.day.schedule.domain.d f275684b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f275685c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f275686d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_calendar.flexible.header.mvi.domain.g f275687e;

    /* compiled from: LoadCalendarDaysUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.data.domain.LoadCalendarDaysUseCaseImpl$invoke$1", f = "LoadCalendarDaysUseCase.kt", i = {0}, l = {30, 32, 44}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CalendarDataInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275688q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f275689r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f275689r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalendarDataInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275688q;
            e eVar = e.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f275689r;
                InterfaceC18323a interfaceC18323a = eVar.f275683a;
                this.f275689r = interfaceC43172j;
                this.f275688q = 1;
                obj = interfaceC18323a.b(null, null, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f275689r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                Zs0.b bVar = (Zs0.b) ((TypedResult.Success) typedResult).getResult();
                List<Zs0.c> listC = bVar.c();
                com.avito.android.service_booking_calendar.day.schedule.domain.d dVar = eVar.f275684b;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    ToolbarAction toolbarActionA = dVar.a((Zs0.c) it.next());
                    if (toolbarActionA != null) {
                        arrayList.add(toolbarActionA);
                    }
                }
                CalendarDataInternalAction.c cVar = new CalendarDataInternalAction.c(new a.C8178a(arrayList, eVar.f275685c.a(bVar.getCalendar().a()), bVar.getTodayButton(), eVar.f275687e.a(bVar.d())));
                this.f275689r = null;
                this.f275688q = 2;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Error) {
                CalendarDataInternalAction.b bVar2 = new CalendarDataInternalAction.b(((TypedResult.Error) typedResult).getError());
                this.f275689r = null;
                this.f275688q = 3;
                if (interfaceC43172j.emit(bVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LoadCalendarDaysUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.data.domain.LoadCalendarDaysUseCaseImpl$invoke$2", f = "LoadCalendarDaysUseCase.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super CalendarDataInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275691q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f275692r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f275692r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalendarDataInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275691q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275692r;
                CalendarDataInternalAction.Loading loading = new CalendarDataInternalAction.Loading();
                this.f275691q = 1;
                if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
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

    /* compiled from: LoadCalendarDaysUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.data.domain.LoadCalendarDaysUseCaseImpl$invoke$3", f = "LoadCalendarDaysUseCase.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super CalendarDataInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275693q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f275694r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f275695s;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CalendarDataInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f275694r = interfaceC43172j;
            cVar.f275695s = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275693q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f275694r;
                CalendarDataInternalAction.a aVar = new CalendarDataInternalAction.a(this.f275695s);
                this.f275694r = null;
                this.f275693q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
    public e(@k InterfaceC18323a interfaceC18323a, @k com.avito.android.service_booking_calendar.day.schedule.domain.d dVar, @k g gVar, @k R0 r02, @k com.avito.android.service_booking_calendar.flexible.header.mvi.domain.g gVar2) {
        this.f275683a = interfaceC18323a;
        this.f275684b = dVar;
        this.f275685c = gVar;
        this.f275686d = r02;
        this.f275687e = gVar2;
    }

    @Override // com.avito.android.service_booking_calendar.flexible.data.domain.d
    @k
    public final InterfaceC43160i<CalendarDataInternalAction> invoke() {
        return C43175k.I(this.f275686d.a(), new C43152f0(new C43137a0(new b(2, null), C43175k.G(new a(null))), new c(3, null)));
    }
}
