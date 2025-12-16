package com.avito.android.service_booking_settings.domain;

import Qt0.InterfaceC14932a;
import Ut0.C15566a;
import Ut0.C15567b;
import Ut0.C15568c;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import com.avito.android.service_booking_settings.domain.converters.g;
import com.avito.android.service_booking_settings.domain.converters.j;
import com.avito.android.service_booking_settings.domain.converters.m;
import com.avito.android.service_booking_settings.domain.converters.p;
import com.avito.android.service_booking_settings.domain.converters.s;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.ServiceBookingWorkHoursInternalAction;
import com.avito.android.util.A4;
import com.avito.android.util.R0;
import h31.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingSettingsMviInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/domain/b;", "Lcom/avito/android/service_booking_settings/domain/a;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking_settings.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC14932a> f277847a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f277848b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f277849c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final s f277850d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final p f277851e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_settings.domain.converters.d f277852f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final m f277853g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final j f277854h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_settings.domain.converters.a f277855i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_settings.data.preferences.a f277856j;

    /* compiled from: ServiceBookingSettingsMviInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_settings.domain.ServiceBookingSettingsMviInteractorImpl$getServiceBookingWorkHoursSettings$1", f = "ServiceBookingSettingsMviInteractor.kt", i = {0}, l = {50, 52, 61}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingWorkHoursInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277857q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277858r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f277860t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f277860t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f277860t, continuation);
            aVar.f277858r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingWorkHoursInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objA;
            Ut0.e eVarA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277857q;
            b bVar = b.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f277858r;
                InterfaceC14932a interfaceC14932a = bVar.f277847a.get();
                this.f277858r = interfaceC43172j;
                this.f277857q = 1;
                objA = interfaceC14932a.a(this.f277860t, this);
                if (objA == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f277858r;
                C42729a0.b(obj);
                objA = obj;
            }
            TypedResult typedResult = (TypedResult) objA;
            if (typedResult instanceof TypedResult.Error) {
                ServiceBookingWorkHoursInternalAction.ContentLoadingError contentLoadingError = new ServiceBookingWorkHoursInternalAction.ContentLoadingError(((TypedResult.Error) typedResult).getError().getF244063c());
                this.f277858r = null;
                this.f277857q = 2;
                if (interfaceC43172j.emit(contentLoadingError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                List<ServiceBookingWorkHours.ServiceBookingDay> listE = ((ServiceBookingWorkHours) success.getResult()).e();
                ArrayList arrayList = new ArrayList(C42745f0.q(listE, 10));
                Iterator<T> it = listE.iterator();
                while (it.hasNext()) {
                    arrayList.add(bVar.f277849c.a((ServiceBookingWorkHours.ServiceBookingDay) it.next()));
                }
                Ut0.k kVarA = bVar.f277850d.a(((ServiceBookingWorkHours) success.getResult()).getTimeGap());
                SchedulePeriod schedulePeriodA = bVar.f277851e.a(((ServiceBookingWorkHours) success.getResult()).getSchedulePeriod());
                C15568c c15568c = new C15568c(arrayList, kVarA, schedulePeriodA);
                String title = ((ServiceBookingWorkHours) success.getResult()).getTitle();
                String actionTitle = ((ServiceBookingWorkHours) success.getResult()).getActionTitle();
                ServiceBookingWorkHours.WorkHoursLink linkToRedirect = ((ServiceBookingWorkHours) success.getResult()).getLinkToRedirect();
                C15566a c15566aA = bVar.f277852f.a(((ServiceBookingWorkHours) success.getResult()).getContentDescription());
                Ut0.g gVarA = bVar.f277853g.a(((ServiceBookingWorkHours) success.getResult()).getSaveScheduleInfo());
                if (bVar.f277856j.f277782a.getBoolean("AGREEMENT_SHOWN_KEY", false)) {
                    eVarA = null;
                } else {
                    eVarA = bVar.f277854h.a(((ServiceBookingWorkHours) success.getResult()).getLicenseAgreement());
                }
                ServiceBookingWorkHoursInternalAction.ContentLoadingSuccess contentLoadingSuccess = new ServiceBookingWorkHoursInternalAction.ContentLoadingSuccess(title, actionTitle, arrayList, linkToRedirect, kVarA, schedulePeriodA, c15566aA, gVarA, eVarA, c15568c);
                this.f277858r = null;
                this.f277857q = 3;
                if (interfaceC43172j.emit(contentLoadingSuccess, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingSettingsMviInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_settings.domain.ServiceBookingSettingsMviInteractorImpl$saveServiceBookingWorkHoursSettings$1", f = "ServiceBookingSettingsMviInteractor.kt", i = {0}, l = {89, 95, 98}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.service_booking_settings.domain.b$b, reason: collision with other inner class name */
    public static final class C8252b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingWorkHoursInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277861q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277862r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<C15567b> f277863s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f277864t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f277865u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f277866v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ServiceBookingWorkHours.WorkHoursLink f277867w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8252b(List<C15567b> list, b bVar, String str, String str2, ServiceBookingWorkHours.WorkHoursLink workHoursLink, Continuation<? super C8252b> continuation) {
            super(2, continuation);
            this.f277863s = list;
            this.f277864t = bVar;
            this.f277865u = str;
            this.f277866v = str2;
            this.f277867w = workHoursLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8252b c8252b = new C8252b(this.f277863s, this.f277864t, this.f277865u, this.f277866v, this.f277867w, continuation);
            c8252b.f277862r = obj;
            return c8252b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingWorkHoursInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8252b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            b bVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277861q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f277862r;
                List<C15567b> list = this.f277863s;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    bVar = this.f277864t;
                    if (!zHasNext) {
                        break;
                    }
                    arrayList.add(bVar.f277855i.a((C15567b) it.next()));
                }
                A4.f318516a.getClass();
                Map<String, String> mapH = A4.h(arrayList, "days");
                InterfaceC14932a interfaceC14932a = bVar.f277847a.get();
                this.f277862r = interfaceC43172j;
                this.f277861q = 1;
                obj = interfaceC14932a.b(mapH, this.f277865u, this.f277866v, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f277862r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                ServiceBookingWorkHoursInternalAction.SaveSettingsError saveSettingsError = new ServiceBookingWorkHoursInternalAction.SaveSettingsError(((TypedResult.Error) typedResult).getError().getF244063c());
                this.f277862r = null;
                this.f277861q = 2;
                if (interfaceC43172j.emit(saveSettingsError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Success) {
                ServiceBookingWorkHoursInternalAction.SaveSettingsSuccess saveSettingsSuccess = new ServiceBookingWorkHoursInternalAction.SaveSettingsSuccess(this.f277867w);
                this.f277862r = null;
                this.f277861q = 3;
                if (interfaceC43172j.emit(saveSettingsSuccess, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k e<InterfaceC14932a> eVar, @k R0 r02, @k g gVar, @k s sVar, @k p pVar, @k com.avito.android.service_booking_settings.domain.converters.d dVar, @k m mVar, @k j jVar, @k com.avito.android.service_booking_settings.domain.converters.a aVar, @k com.avito.android.service_booking_settings.data.preferences.a aVar2) {
        this.f277847a = eVar;
        this.f277848b = r02;
        this.f277849c = gVar;
        this.f277850d = sVar;
        this.f277851e = pVar;
        this.f277852f = dVar;
        this.f277853g = mVar;
        this.f277854h = jVar;
        this.f277855i = aVar;
        this.f277856j = aVar2;
    }

    @Override // com.avito.android.service_booking_settings.domain.a
    @k
    public final InterfaceC43160i<ServiceBookingWorkHoursInternalAction> a(@l String str) {
        return C43175k.I(this.f277848b.a(), C43175k.G(new a(str, null)));
    }

    @Override // com.avito.android.service_booking_settings.domain.a
    @k
    public final InterfaceC43160i<ServiceBookingWorkHoursInternalAction> b(@k List<C15567b> list, @l String str, @l String str2, @l ServiceBookingWorkHours.WorkHoursLink workHoursLink) {
        return C43175k.I(this.f277848b.a(), C43175k.G(new C8252b(list, this, str, str2, workHoursLink, null)));
    }
}
