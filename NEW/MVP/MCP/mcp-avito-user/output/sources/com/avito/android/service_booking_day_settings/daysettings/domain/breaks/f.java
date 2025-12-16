package com.avito.android.service_booking_day_settings.daysettings.domain.breaks;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.service_booking_day_settings.daysettings.adapter.BreakDescription;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect;
import com.avito.android.service_booking_day_settings.daysettings.domain.breaks.d;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import com.avito.android.service_booking_utils.events.ActionStatusEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.ws.WebSocketProtocol;
import xt0.C49997a;
import yt0.InterfaceC50300a;

/* compiled from: ServiceBookingBreaksInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/f;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/e;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e {

    /* compiled from: ServiceBookingBreaksInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f276766a = new int[ActionStatusEvent.Source.values().length];
    }

    /* compiled from: ServiceBookingBreaksInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.domain.breaks.ServiceBookingBreaksInteractorImpl$process$1", f = "ServiceBookingBreaksInteractor.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f276767q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f276768r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DaySettingsState f276769s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DaySettingsState daySettingsState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f276769s = daySettingsState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f276769s, continuation);
            bVar.f276768r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f276767q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f276768r;
                if (this.f276769s.f276968e.f277022e) {
                    DaySettingsInternalAction.AddEmptyBreak addEmptyBreak = DaySettingsInternalAction.AddEmptyBreak.f276926b;
                    this.f276767q = 1;
                    if (interfaceC43172j.emit(addEmptyBreak, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: ServiceBookingBreaksInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.domain.breaks.ServiceBookingBreaksInteractorImpl$process$2", f = "ServiceBookingBreaksInteractor.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f276770q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f276771r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DaySettingsState f276772s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC50300a.InterfaceC12928a f276773t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DaySettingsState daySettingsState, InterfaceC50300a.InterfaceC12928a interfaceC12928a, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f276772s = daySettingsState;
            this.f276773t = interfaceC12928a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f276772s, this.f276773t, continuation);
            cVar.f276771r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            DaySettingsState.WorkHoursInfo workHoursInfo;
            DaySettingsState.TimePeriod timePeriod;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f276770q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f276771r;
                DaySettingsState.DayScheduleInfo dayScheduleInfo = this.f276772s.f276966c;
                if (dayScheduleInfo != null && (workHoursInfo = dayScheduleInfo.f277001f) != null && (timePeriod = workHoursInfo.f277031c) != null) {
                    InterfaceC50300a.InterfaceC12928a.d dVar = (InterfaceC50300a.InterfaceC12928a.d) this.f276773t;
                    String str = dVar.f443566a;
                    org.threeten.bp.g gVar = dVar.f443567b;
                    if (gVar == null) {
                        gVar = timePeriod.f277026b;
                    }
                    org.threeten.bp.e eVarL = org.threeten.bp.e.L();
                    gVar.getClass();
                    org.threeten.bp.f fVarG = org.threeten.bp.f.G(eVarL, gVar);
                    org.threeten.bp.e eVarL2 = org.threeten.bp.e.L();
                    org.threeten.bp.g gVar2 = timePeriod.f277027c;
                    gVar2.getClass();
                    DaySettingsInternalAction.OpenBreakStartTimePicker openBreakStartTimePicker = new DaySettingsInternalAction.OpenBreakStartTimePicker(str, fVarG, org.threeten.bp.f.G(eVarL2, gVar2));
                    this.f276770q = 1;
                    if (interfaceC43172j.emit(openBreakStartTimePicker, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: ServiceBookingBreaksInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.domain.breaks.ServiceBookingBreaksInteractorImpl$process$3", f = "ServiceBookingBreaksInteractor.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f276774q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f276775r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DaySettingsState f276776s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC50300a.InterfaceC12928a f276777t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DaySettingsState daySettingsState, InterfaceC50300a.InterfaceC12928a interfaceC12928a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f276776s = daySettingsState;
            this.f276777t = interfaceC12928a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = new d(this.f276776s, this.f276777t, continuation);
            dVar.f276775r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            DaySettingsState.WorkHoursInfo workHoursInfo;
            DaySettingsState.TimePeriod timePeriod;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f276774q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f276775r;
                DaySettingsState.DayScheduleInfo dayScheduleInfo = this.f276776s.f276966c;
                if (dayScheduleInfo != null && (workHoursInfo = dayScheduleInfo.f277001f) != null && (timePeriod = workHoursInfo.f277031c) != null) {
                    InterfaceC50300a.InterfaceC12928a.b bVar = (InterfaceC50300a.InterfaceC12928a.b) this.f276777t;
                    String str = bVar.f443563a;
                    org.threeten.bp.g gVar = bVar.f443564b;
                    if (gVar == null) {
                        gVar = timePeriod.f277027c;
                    }
                    org.threeten.bp.e eVarL = org.threeten.bp.e.L();
                    gVar.getClass();
                    org.threeten.bp.f fVarG = org.threeten.bp.f.G(eVarL, gVar);
                    org.threeten.bp.e eVarL2 = org.threeten.bp.e.L();
                    org.threeten.bp.g gVar2 = timePeriod.f277026b;
                    gVar2.getClass();
                    DaySettingsInternalAction.OpenBreakEndTimePicker openBreakEndTimePicker = new DaySettingsInternalAction.OpenBreakEndTimePicker(str, fVarG, org.threeten.bp.f.G(eVarL2, gVar2));
                    this.f276774q = 1;
                    if (interfaceC43172j.emit(openBreakEndTimePicker, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: ServiceBookingBreaksInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.domain.breaks.ServiceBookingBreaksInteractorImpl$process$4", f = "ServiceBookingBreaksInteractor.kt", i = {0, 0}, l = {99, 104}, m = "invokeSuspend", n = {"$this$flow", "selectedId"}, s = {"L$0", "L$1"})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f276778q;

        /* renamed from: r, reason: collision with root package name */
        public int f276779r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f276780s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ DaySettingsState f276781t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC50300a.InterfaceC12928a f276782u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f f276783v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f fVar, DaySettingsState daySettingsState, Continuation continuation, InterfaceC50300a.InterfaceC12928a interfaceC12928a) {
            super(2, continuation);
            this.f276781t = daySettingsState;
            this.f276782u = interfaceC12928a;
            this.f276783v = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            e eVar = new e(this.f276783v, this.f276781t, continuation, this.f276782u);
            eVar.f276780s = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x00ff A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_day_settings.daysettings.domain.breaks.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ServiceBookingBreaksInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.domain.breaks.ServiceBookingBreaksInteractorImpl$process$5", f = "ServiceBookingBreaksInteractor.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_booking_day_settings.daysettings.domain.breaks.f$f, reason: collision with other inner class name */
    public static final class C8224f extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f276784q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f276785r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DaySettingsState f276786s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC50300a.InterfaceC12928a f276787t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ f f276788u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8224f(f fVar, DaySettingsState daySettingsState, Continuation continuation, InterfaceC50300a.InterfaceC12928a interfaceC12928a) {
            super(2, continuation);
            this.f276786s = daySettingsState;
            this.f276787t = interfaceC12928a;
            this.f276788u = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8224f c8224f = new C8224f(this.f276788u, this.f276786s, continuation, this.f276787t);
            c8224f.f276785r = obj;
            return c8224f;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8224f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            String str;
            Object next;
            DaySettingsState.OccupiedInfo occupiedInfo;
            DaySettingsState.OccupiedInfo occupiedInfo2;
            TimeSelect timeSelect;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f276784q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f276785r;
                DaySettingsState daySettingsState = this.f276786s;
                DaySettingsState.BreaksInfo breaksInfo = daySettingsState.f276971h;
                if (breaksInfo == null || (str = breaksInfo.f276993k) == null) {
                    return G0.f406611a;
                }
                Iterator<T> it = breaksInfo.f276986d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((SettingsBreakItem) next).f276723b, str)) {
                        break;
                    }
                }
                SettingsBreakItem settingsBreakItem = (SettingsBreakItem) next;
                org.threeten.bp.g gVar = (settingsBreakItem == null || (timeSelect = settingsBreakItem.f276724c) == null) ? null : timeSelect.f276729b;
                org.threeten.bp.g gVar2 = ((InterfaceC50300a.InterfaceC12928a.c) this.f276787t).f443565a;
                DaySettingsState.DayScheduleInfo dayScheduleInfo = daySettingsState.f276966c;
                PrintableText printableTextB = this.f276788u.b(gVar, gVar2, (dayScheduleInfo == null || (occupiedInfo = dayScheduleInfo.f276998c) == null) ? C42784z0.f406748b : occupiedInfo.f277009d, (dayScheduleInfo == null || (occupiedInfo2 = dayScheduleInfo.f276998c) == null) ? null : occupiedInfo2.f277008c);
                DaySettingsInternalAction daySettingsInternalActionD = f.d(this.f276788u, daySettingsState, daySettingsState.f276971h, str, printableTextB != null ? new BreakDescription(printableTextB, breaksInfo.f276990h, true) : null, this.f276787t);
                if (daySettingsInternalActionD != null) {
                    this.f276784q = 1;
                    if (interfaceC43172j.emit(daySettingsInternalActionD, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: ServiceBookingBreaksInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.domain.breaks.ServiceBookingBreaksInteractorImpl$process$6", f = "ServiceBookingBreaksInteractor.kt", i = {}, l = {148, 160}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f276789q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f276790r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DaySettingsState f276791s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ f f276792t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC50300a.InterfaceC12928a f276793u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar, DaySettingsState daySettingsState, Continuation continuation, InterfaceC50300a.InterfaceC12928a interfaceC12928a) {
            super(2, continuation);
            this.f276791s = daySettingsState;
            this.f276792t = fVar;
            this.f276793u = interfaceC12928a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            g gVar = new g(this.f276792t, this.f276791s, continuation, this.f276793u);
            gVar.f276790r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            ?? arrayList;
            DaySettingsState.OccupiedInfo occupiedInfo;
            DaySettingsState.OccupiedInfo occupiedInfo2;
            List<SettingsBreakItem> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f276789q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f276790r;
                DaySettingsState daySettingsState = this.f276791s;
                DaySettingsState.BreaksInfo breaksInfo = daySettingsState.f276971h;
                if (breaksInfo == null || (list = breaksInfo.f276986d) == null) {
                    arrayList = C42784z0.f406748b;
                } else {
                    arrayList = new ArrayList();
                    int i13 = 0;
                    for (Object obj2 : list) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        if (i13 != ((InterfaceC50300a.InterfaceC12928a.f) this.f276793u).f443569a) {
                            arrayList.add(obj2);
                        }
                        i13 = i14;
                    }
                }
                DaySettingsState.BreaksInfo breaksInfo2 = daySettingsState.f276971h;
                DaySettingsState daySettingsStateA = DaySettingsState.a(this.f276791s, null, null, null, null, breaksInfo2 != null ? DaySettingsState.BreaksInfo.a(breaksInfo2, arrayList, null, null, 1019) : null, null, 191);
                f fVar = this.f276792t;
                com.avito.android.service_booking_day_settings.daysettings.domain.breaks.d dVarA = fVar.a(daySettingsStateA, true);
                if (dVarA instanceof d.b) {
                    List<SettingsBreakItem> list2 = ((d.b) dVarA).f276765a;
                    if (list2 != null) {
                        List<SettingsBreakItem> list3 = list2;
                        ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                        for (SettingsBreakItem settingsBreakItem : list3) {
                            UniversalColor universalColor = breaksInfo2 != null ? breaksInfo2.f276990h : null;
                            org.threeten.bp.g gVar = settingsBreakItem.f276724c.f276729b;
                            org.threeten.bp.g gVar2 = settingsBreakItem.f276725d.f276729b;
                            DaySettingsState.DayScheduleInfo dayScheduleInfo = daySettingsState.f276966c;
                            PrintableText printableTextB = fVar.b(gVar, gVar2, (dayScheduleInfo == null || (occupiedInfo = dayScheduleInfo.f276998c) == null) ? C42784z0.f406748b : occupiedInfo.f277009d, (dayScheduleInfo == null || (occupiedInfo2 = dayScheduleInfo.f276998c) == null) ? null : occupiedInfo2.f277008c);
                            BreakDescription breakDescription = printableTextB != null ? new BreakDescription(printableTextB, universalColor, true) : null;
                            if (breakDescription == null) {
                                breakDescription = settingsBreakItem.f276728g;
                            }
                            arrayList2.add(SettingsBreakItem.a(settingsBreakItem, null, null, breakDescription, 31));
                        }
                        DaySettingsInternalAction.DeleteBreak deleteBreak = new DaySettingsInternalAction.DeleteBreak(arrayList2);
                        this.f276789q = 1;
                        if (interfaceC43172j.emit(deleteBreak, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (dVarA instanceof d.a) {
                    d.a aVar = (d.a) dVarA;
                    DaySettingsInternalAction.UpdateBreaksDescriptions updateBreaksDescriptions = new DaySettingsInternalAction.UpdateBreaksDescriptions(aVar.f276763a, aVar.f276764b);
                    this.f276789q = 2;
                    if (interfaceC43172j.emit(updateBreaksDescriptions, this) == coroutine_suspended) {
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

    @Inject
    public f() {
    }

    public static final DaySettingsInternalAction d(f fVar, DaySettingsState daySettingsState, DaySettingsState.BreaksInfo breaksInfo, String str, BreakDescription breakDescription, InterfaceC50300a.InterfaceC12928a interfaceC12928a) {
        fVar.getClass();
        List<SettingsBreakItem> list = breaksInfo.f276986d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (SettingsBreakItem settingsBreakItemA : list) {
            boolean zF2 = L.f(settingsBreakItemA.f276723b, str);
            BreakDescription breakDescription2 = settingsBreakItemA.f276728g;
            if (zF2 && (interfaceC12928a instanceof InterfaceC50300a.InterfaceC12928a.e)) {
                TimeSelect timeSelect = new TimeSelect(((InterfaceC50300a.InterfaceC12928a.e) interfaceC12928a).f443568a, false);
                if (breakDescription != null) {
                    breakDescription2 = breakDescription;
                }
                settingsBreakItemA = SettingsBreakItem.a(settingsBreakItemA, timeSelect, null, breakDescription2, 29);
            } else if (L.f(settingsBreakItemA.f276723b, str) && (interfaceC12928a instanceof InterfaceC50300a.InterfaceC12928a.c)) {
                TimeSelect timeSelect2 = new TimeSelect(((InterfaceC50300a.InterfaceC12928a.c) interfaceC12928a).f443565a, false);
                if (breakDescription != null) {
                    breakDescription2 = breakDescription;
                }
                settingsBreakItemA = SettingsBreakItem.a(settingsBreakItemA, null, timeSelect2, breakDescription2, 27);
            }
            arrayList.add(settingsBreakItemA);
        }
        com.avito.android.service_booking_day_settings.daysettings.domain.breaks.d dVarA = fVar.a(DaySettingsState.a(daySettingsState, null, null, null, null, DaySettingsState.BreaksInfo.a(breaksInfo, arrayList, null, null, 1019), null, 191), true);
        if (!(dVarA instanceof d.b)) {
            if (!(dVarA instanceof d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d.a aVar = (d.a) dVarA;
            return new DaySettingsInternalAction.UpdateBreaksDescriptions(aVar.f276763a, aVar.f276764b);
        }
        if (interfaceC12928a instanceof InterfaceC50300a.InterfaceC12928a.e) {
            List<SettingsBreakItem> list2 = ((d.b) dVarA).f276765a;
            if (list2 != null) {
                return new DaySettingsInternalAction.BreakStartTimeChanged(list2, str);
            }
            return null;
        }
        List<SettingsBreakItem> list3 = ((d.b) dVarA).f276765a;
        if (list3 != null) {
            return new DaySettingsInternalAction.BreakEndTimeChanged(list3, str);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.avito.android.service_booking_utils.events.ActionStatusEvent$Source] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem] */
    public static final void e(DaySettingsState daySettingsState, SettingsBreakItem settingsBreakItem, l0.h<ActionStatusEvent.Source> hVar, l0.h<SettingsBreakItem> hVar2) {
        List<SettingsBreakItem> list = daySettingsState.f276971h.f276986d;
        TimeSelect timeSelect = settingsBreakItem.f276724c;
        if (timeSelect.f276729b != null) {
            TimeSelect timeSelect2 = settingsBreakItem.f276725d;
            if (timeSelect2.f276729b != null) {
                for (SettingsBreakItem settingsBreakItem2 : list) {
                    if (settingsBreakItem2.f276724c.f276729b != null) {
                        TimeSelect timeSelect3 = settingsBreakItem2.f276725d;
                        if (timeSelect3.f276729b != null && !L.f(settingsBreakItem2.f276723b, settingsBreakItem.f276723b) && settingsBreakItem2.f276724c.f276729b.compareTo(timeSelect2.f276729b) < 0 && timeSelect3.f276729b.compareTo(timeSelect.f276729b) > 0) {
                            hVar.f406842b = ActionStatusEvent.Source.f278318d;
                            hVar2.f406842b = com.avito.android.service_booking_day_settings.daysettings.adapter.a.a(settingsBreakItem, daySettingsState.f276971h);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem] */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, com.avito.android.service_booking_utils.events.ActionStatusEvent$Source] */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, com.avito.android.service_booking_utils.events.ActionStatusEvent$Source] */
    /* JADX WARN: Type inference failed for: r1v22, types: [T, com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem] */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, com.avito.android.service_booking_utils.events.ActionStatusEvent$Source] */
    /* JADX WARN: Type inference failed for: r1v26, types: [T, com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem] */
    /* JADX WARN: Type inference failed for: r1v28, types: [T, com.avito.android.service_booking_utils.events.ActionStatusEvent$Source] */
    /* JADX WARN: Type inference failed for: r1v30, types: [T, com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem] */
    /* JADX WARN: Type inference failed for: r1v37, types: [T, com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, com.avito.android.service_booking_utils.events.ActionStatusEvent$Source] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem] */
    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e
    @k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.breaks.d a(@k DaySettingsState daySettingsState, boolean z12) {
        DaySettingsState.DayScheduleInfo dayScheduleInfo;
        DaySettingsState.BreaksInfo breaksInfo;
        DaySettingsState.TimePeriod timePeriod;
        Iterator it;
        boolean z13;
        BreakDescription breakDescription;
        DaySettingsState.BreaksInfo breaksInfo2 = daySettingsState.f276971h;
        BreakDescription breakDescription2 = null;
        if (breaksInfo2 == null || (dayScheduleInfo = daySettingsState.f276966c) == null || !dayScheduleInfo.f276999d.f276994b) {
            return new d.b(null);
        }
        boolean z14 = daySettingsState.f276968e.f277022e;
        List<SettingsBreakItem> list = breaksInfo2.f276986d;
        if (!z14) {
            return new d.b(list);
        }
        l0.h hVar = new l0.h();
        DaySettingsState.TimePeriod timePeriod2 = dayScheduleInfo.f277001f.f277031c;
        org.threeten.bp.g gVar = timePeriod2.f277026b;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SettingsBreakItem settingsBreakItem = (SettingsBreakItem) it2.next();
            l0.h hVar2 = new l0.h();
            TimeSelect timeSelectA = TimeSelect.a(settingsBreakItem.f276724c, false);
            TimeSelect timeSelect = settingsBreakItem.f276725d;
            hVar2.f406842b = SettingsBreakItem.a(settingsBreakItem, timeSelectA, TimeSelect.a(timeSelect, false), breakDescription2, 57);
            org.threeten.bp.g gVar2 = timeSelect.f276729b;
            TimeSelect timeSelect2 = settingsBreakItem.f276724c;
            if (z12) {
                e(daySettingsState, settingsBreakItem, hVar, hVar2);
                breaksInfo = breaksInfo2;
                timePeriod = timePeriod2;
                it = it2;
            } else {
                org.threeten.bp.g gVar3 = timeSelect2.f276729b;
                UniversalColor universalColor = breaksInfo2.f276989g;
                DaySettingsState.BreakErrorInfo breakErrorInfo = breaksInfo2.f276988f;
                org.threeten.bp.g gVar4 = timeSelect2.f276729b;
                if (gVar3 == null || gVar2 == null) {
                    breaksInfo = breaksInfo2;
                    timePeriod = timePeriod2;
                    it = it2;
                    if (gVar3 == null && gVar2 == null) {
                        z13 = true;
                        if (list.size() == 1) {
                            arrayList.add(settingsBreakItem);
                            breaksInfo2 = breaksInfo;
                            it2 = it;
                            timePeriod2 = timePeriod;
                            breakDescription2 = null;
                        }
                    } else {
                        z13 = true;
                    }
                    hVar.f406842b = ActionStatusEvent.Source.f278319e;
                    TimeSelect timeSelect3 = new TimeSelect(gVar4, gVar4 == null ? z13 : false);
                    if (gVar2 != null) {
                        z13 = false;
                    }
                    hVar2.f406842b = SettingsBreakItem.a(settingsBreakItem, timeSelect3, new TimeSelect(gVar2, z13), new BreakDescription(com.avito.android.printable_text.b.f(breakErrorInfo.f276980d), universalColor, false), 25);
                } else {
                    breaksInfo = breaksInfo2;
                    if (gVar3.J() != gVar2.J() || breakErrorInfo.f276982f == null) {
                        it = it2;
                        if (gVar4.J() <= gVar2.J() || breakErrorInfo.f276981e == null) {
                            int iJ2 = gVar4.J();
                            int iJ3 = gVar.J();
                            org.threeten.bp.g gVar5 = timePeriod2.f277027c;
                            if (iJ2 == iJ3 && gVar2.J() == gVar5.J() && breakErrorInfo.f276983g != null) {
                                hVar.f406842b = ActionStatusEvent.Source.f278322h;
                                timePeriod = timePeriod2;
                                hVar2.f406842b = SettingsBreakItem.a(settingsBreakItem, new TimeSelect(gVar4, gVar4.J() == gVar.J()), new TimeSelect(gVar2, gVar2.J() == gVar5.J()), new BreakDescription(com.avito.android.printable_text.b.f(breakErrorInfo.f276983g), universalColor, false), 25);
                            } else {
                                timePeriod = timePeriod2;
                                if (gVar4.J() <= gVar.J() || gVar2.J() >= gVar5.J()) {
                                    hVar.f406842b = ActionStatusEvent.Source.f278317c;
                                    hVar2.f406842b = SettingsBreakItem.a(settingsBreakItem, new TimeSelect(gVar4, true), new TimeSelect(gVar2, true), new BreakDescription(com.avito.android.printable_text.b.f(breakErrorInfo.f276978b), universalColor, false), 25);
                                } else {
                                    e(daySettingsState, settingsBreakItem, hVar, hVar2);
                                }
                            }
                        } else {
                            hVar.f406842b = ActionStatusEvent.Source.f278321g;
                            hVar2.f406842b = SettingsBreakItem.a(settingsBreakItem, new TimeSelect(gVar4, true), new TimeSelect(gVar2, true), new BreakDescription(com.avito.android.printable_text.b.f(breakErrorInfo.f276981e), universalColor, false), 25);
                        }
                    } else {
                        hVar.f406842b = ActionStatusEvent.Source.f278320f;
                        it = it2;
                        hVar2.f406842b = SettingsBreakItem.a(settingsBreakItem, new TimeSelect(gVar4, true), new TimeSelect(gVar2, true), new BreakDescription(com.avito.android.printable_text.b.f(breakErrorInfo.f276982f), universalColor, false), 25);
                    }
                    timePeriod = timePeriod2;
                }
            }
            if (hVar.f406842b == 0 && (breakDescription = settingsBreakItem.f276728g) != null && !breakDescription.f276722d) {
                hVar2.f406842b = SettingsBreakItem.a(settingsBreakItem, new TimeSelect(timeSelect2.f276729b, false), new TimeSelect(gVar2, false), null, 25);
            }
            arrayList.add(hVar2.f406842b);
            breaksInfo2 = breaksInfo;
            it2 = it;
            timePeriod2 = timePeriod;
            breakDescription2 = null;
        }
        ActionStatusEvent.Source source = (ActionStatusEvent.Source) hVar.f406842b;
        return (source == null ? -1 : a.f276766a[source.ordinal()]) == -1 ? new d.b(arrayList) : new d.a(arrayList, (ActionStatusEvent.Source) hVar.f406842b);
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e
    @l
    public final PrintableText b(@l org.threeten.bp.g gVar, @l org.threeten.bp.g gVar2, @k List<DaySettingsState.TimePeriod> list, @l String str) {
        if (gVar == null || gVar2 == null || str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            DaySettingsState.TimePeriod timePeriod = (DaySettingsState.TimePeriod) obj;
            org.threeten.bp.g gVar3 = timePeriod.f277026b;
            if (gVar.compareTo(timePeriod.f277027c) < 0 && gVar2.compareTo(gVar3) > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DaySettingsState.TimePeriod timePeriod2 = (DaySettingsState.TimePeriod) it.next();
            arrayList2.add(C49997a.a(timePeriod2.f277026b) + '-' + C49997a.a(timePeriod2.f277027c));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return com.avito.android.printable_text.b.c(R.string.occupied_string_holder, str, C42745f0.O(arrayList2, ", ", null, null, null, 62));
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e
    @k
    public final InterfaceC43160i<DaySettingsInternalAction> c(@k InterfaceC50300a.InterfaceC12928a interfaceC12928a, @k DaySettingsState daySettingsState) {
        if (interfaceC12928a.equals(InterfaceC50300a.InterfaceC12928a.C12929a.f443562a)) {
            return C43175k.G(new b(daySettingsState, null));
        }
        if (interfaceC12928a instanceof InterfaceC50300a.InterfaceC12928a.d) {
            return C43175k.G(new c(daySettingsState, interfaceC12928a, null));
        }
        if (interfaceC12928a instanceof InterfaceC50300a.InterfaceC12928a.b) {
            return C43175k.G(new d(daySettingsState, interfaceC12928a, null));
        }
        if (interfaceC12928a instanceof InterfaceC50300a.InterfaceC12928a.e) {
            return C43175k.G(new e(this, daySettingsState, null, interfaceC12928a));
        }
        if (interfaceC12928a instanceof InterfaceC50300a.InterfaceC12928a.c) {
            return C43175k.G(new C8224f(this, daySettingsState, null, interfaceC12928a));
        }
        if (interfaceC12928a instanceof InterfaceC50300a.InterfaceC12928a.f) {
            return C43175k.G(new g(this, daySettingsState, null, interfaceC12928a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
