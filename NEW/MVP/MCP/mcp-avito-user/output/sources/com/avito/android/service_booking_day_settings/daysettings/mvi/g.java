package com.avito.android.service_booking_day_settings.daysettings.mvi;

import Y41.p;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
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

/* compiled from: DaySettingsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements com.avito.android.arch.mvi.b<DaySettingsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f277042a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a f277043b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f277044c;

    /* compiled from: DaySettingsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.mvi.DaySettingsBootstrap$produce$1", f = "DaySettingsBootstrap.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277045q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277046r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f277046r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277045q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277046r;
                g gVar = g.this;
                if (!gVar.f277044c) {
                    gVar.f277044c = true;
                    InterfaceC43160i<DaySettingsInternalAction> interfaceC43160iA = gVar.f277043b.a(Long.parseLong(gVar.f277042a));
                    this.f277045q = 1;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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

    @Inject
    public g(@com.avito.android.service_booking_day_settings.di.d @Y61.k String str, @Y61.k com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a aVar) {
        this.f277042a = str;
        this.f277043b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<DaySettingsInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
