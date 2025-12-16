package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_utils.ux_feedback.h;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import ut0.InterfaceC49110a;

/* compiled from: SaveDayScheduleUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/use_case/e;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/use_case/d;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC49110a> f276843a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f276844b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_day_settings.breaks.a f276845c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f276846d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a f276847e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f276848f = C42727D.c(new d());

    /* compiled from: SaveDayScheduleUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.SaveDayScheduleUseCaseImpl$invoke$1", f = "SaveDayScheduleUseCase.kt", i = {0, 1, 1, 3, 4}, l = {57, 64, 67, 76, 82, 83}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "result", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$1", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult f276849q;

        /* renamed from: r, reason: collision with root package name */
        public int f276850r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f276851s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<Long> f276852t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e f276853u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List<SettingsBreakItem> f276854v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f276855w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f276856x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ int f276857y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f276858z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Long> list, e eVar, List<SettingsBreakItem> list2, boolean z12, int i12, int i13, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f276852t = list;
            this.f276853u = eVar;
            this.f276854v = list2;
            this.f276855w = z12;
            this.f276856x = i12;
            this.f276857y = i13;
            this.f276858z = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f276852t, this.f276853u, this.f276854v, this.f276855w, this.f276856x, this.f276857y, this.f276858z, continuation);
            aVar.f276851s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0127 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SaveDayScheduleUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.SaveDayScheduleUseCaseImpl$invoke$2", f = "SaveDayScheduleUseCase.kt", i = {0}, l = {89, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {"$this$onStart"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f276859q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f276860r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f276860r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f276859q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f276860r;
                DaySettingsInternalAction.OnStartLoading onStartLoading = DaySettingsInternalAction.OnStartLoading.f276945b;
                this.f276860r = interfaceC43172j;
                this.f276859q = 1;
                if (interfaceC43172j.emit(onStartLoading, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f276860r;
                C42729a0.b(obj);
            }
            DaySettingsInternalAction.SetViewEnabled setViewEnabled = new DaySettingsInternalAction.SetViewEnabled(false);
            this.f276860r = null;
            this.f276859q = 2;
            if (interfaceC43172j.emit(setViewEnabled, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveDayScheduleUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.SaveDayScheduleUseCaseImpl$invoke$3", f = "SaveDayScheduleUseCase.kt", i = {0}, l = {92, 93}, m = "invokeSuspend", n = {"$this$onCompletion"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super DaySettingsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f276861q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f276862r;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f276862r = interfaceC43172j;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f276861q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = this.f276862r;
                DaySettingsInternalAction.SetViewEnabled setViewEnabled = new DaySettingsInternalAction.SetViewEnabled(true);
                this.f276862r = interfaceC43172j;
                this.f276861q = 1;
                if (interfaceC43172j.emit(setViewEnabled, this) == coroutine_suspended) {
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
                interfaceC43172j = this.f276862r;
                C42729a0.b(obj);
            }
            DaySettingsInternalAction.OnChangeSaveDialogVisibility onChangeSaveDialogVisibility = new DaySettingsInternalAction.OnChangeSaveDialogVisibility(false);
            this.f276862r = null;
            this.f276861q = 2;
            if (interfaceC43172j.emit(onChangeSaveDialogVisibility, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveDayScheduleUseCase.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeepLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<DeepLink> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final DeepLink invoke() {
            return e.this.f276846d.a();
        }
    }

    @Inject
    public e(@k h31.e<InterfaceC49110a> eVar, @k R0 r02, @k com.avito.android.service_booking_day_settings.breaks.a aVar, @k h hVar, @k com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a aVar2) {
        this.f276843a = eVar;
        this.f276844b = r02;
        this.f276845c = aVar;
        this.f276846d = hVar;
        this.f276847e = aVar2;
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.d
    @k
    public final InterfaceC43160i<DaySettingsInternalAction> a(@k List<Long> list, boolean z12, int i12, int i13, @l List<SettingsBreakItem> list2, @k String str) {
        return C43175k.I(this.f276844b.a(), new X(new C43137a0(new b(2, null), C43175k.G(new a(list, this, list2, z12, i12, i13, str, null))), new c(3, null)));
    }
}
