package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.h;
import com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.n;
import com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.r;
import com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.u;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vt0.InterfaceC49381a;

/* compiled from: GetDayScheduleUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/use_case/b;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/use_case/a;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC49381a> f276819a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f276820b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.k f276821c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f276822d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.a f276823e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final u f276824f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final r f276825g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_day_settings.daysettings.data.preferences.a f276826h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.e f276827i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final n f276828j;

    /* compiled from: GetDayScheduleUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.GetDayScheduleUseCaseImpl$invoke$1", f = "GetDayScheduleUseCaseImpl.kt", i = {0, 1}, l = {36, 38, 41, 50}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f276829q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f276830r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f276832t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f276832t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f276832t, continuation);
            aVar.f276830r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k h31.e<InterfaceC49381a> eVar, @k R0 r02, @k com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.k kVar, @k h hVar, @k com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.a aVar, @k u uVar, @k r rVar, @k com.avito.android.service_booking_day_settings.daysettings.data.preferences.a aVar2, @k com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.e eVar2, @k n nVar) {
        this.f276819a = eVar;
        this.f276820b = r02;
        this.f276821c = kVar;
        this.f276822d = hVar;
        this.f276823e = aVar;
        this.f276824f = uVar;
        this.f276825g = rVar;
        this.f276826h = aVar2;
        this.f276827i = eVar2;
        this.f276828j = nVar;
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a
    @k
    public final InterfaceC43160i<DaySettingsInternalAction> a(long j12) {
        return C43175k.I(this.f276820b.a(), C43175k.G(new a(j12, null)));
    }
}
