package com.avito.android.service_booking_schedule_repetition_impl;

import Cd.C13243a;
import Nt0.InterfaceC14610a;
import Nt0.b;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.C22026a;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.service_booking_calendar.CalendarView;
import com.avito.android.service_booking_schedule_repetition_impl.e;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.RepetitionSchedule;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionState;
import com.avito.android.service_booking_schedule_repetition_impl.perf_screen.ServicesBookingScheduleRepetition;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/ServiceBookingScheduleRepetitionSheet;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Result", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingScheduleRepetitionSheet extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final a f277534o0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public e.c f277535h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f277536i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.service_booking_schedule_repetition_impl.c f277537j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final O0 f277538k0;

    /* renamed from: l0, reason: collision with root package name */
    public com.avito.android.service_booking_schedule_repetition_impl.e f277539l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public Result f277540m0;

    /* renamed from: n0, reason: collision with root package name */
    public com.avito.android.lib.design.bottom_sheet.d f277541n0;

    /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/ServiceBookingScheduleRepetitionSheet$Result;", "Landroid/os/Parcelable;", "Canceled", "Success", "Lcom/avito/android/service_booking_schedule_repetition_impl/ServiceBookingScheduleRepetitionSheet$Result$Canceled;", "Lcom/avito/android/service_booking_schedule_repetition_impl/ServiceBookingScheduleRepetitionSheet$Result$Success;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Result extends Parcelable {

        /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/ServiceBookingScheduleRepetitionSheet$Result$Canceled;", "Lcom/avito/android/service_booking_schedule_repetition_impl/ServiceBookingScheduleRepetitionSheet$Result;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Canceled implements Result {

            @Y61.k
            public static final Parcelable.Creator<Canceled> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final BookingSettingsStatus f277542b;

            /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Canceled> {
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    return new Canceled(BookingSettingsStatus.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Canceled[] newArray(int i12) {
                    return new Canceled[i12];
                }
            }

            public Canceled(@Y61.k BookingSettingsStatus bookingSettingsStatus) {
                this.f277542b = bookingSettingsStatus;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Canceled) && this.f277542b == ((Canceled) obj).f277542b;
            }

            public final int hashCode() {
                return this.f277542b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Canceled(settingsStatus=" + this.f277542b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f277542b.name());
            }
        }

        /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/ServiceBookingScheduleRepetitionSheet$Result$Success;", "Lcom/avito/android/service_booking_schedule_repetition_impl/ServiceBookingScheduleRepetitionSheet$Result;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success implements Result {

            @Y61.k
            public static final Parcelable.Creator<Success> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f277543b;

            /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Success> {
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    return new Success(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i12) {
                    return new Success[i12];
                }
            }

            public Success(@Y61.l String str) {
                this.f277543b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && L.f(this.f277543b, ((Success) obj).f277543b);
            }

            public final int hashCode() {
                String str = this.f277543b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(message="), this.f277543b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f277543b);
            }
        }
    }

    /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/ServiceBookingScheduleRepetitionSheet$a;", "", "<init>", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC14610a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14610a interfaceC14610a) {
            ((com.avito.android.service_booking_schedule_repetition_impl.b) this.receiver).accept(interfaceC14610a);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f277545m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f277545m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ServiceBookingScheduleRepetitionSheet serviceBookingScheduleRepetitionSheet = ServiceBookingScheduleRepetitionSheet.this;
            if (serviceBookingScheduleRepetitionSheet.f277540m0 == null) {
                serviceBookingScheduleRepetitionSheet.f277540m0 = new Result.Canceled(((com.avito.android.service_booking_schedule_repetition_impl.b) serviceBookingScheduleRepetitionSheet.f277538k0.getValue()).getState().getValue().f277713f);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("result.key", serviceBookingScheduleRepetitionSheet.f277540m0);
            G0 g02 = G0.f406611a;
            serviceBookingScheduleRepetitionSheet.getParentFragmentManager().o0(bundle, this.f277545m);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Nt0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Nt0.b bVar) {
            Nt0.b bVar2 = bVar;
            ServiceBookingScheduleRepetitionSheet serviceBookingScheduleRepetitionSheet = (ServiceBookingScheduleRepetitionSheet) this.receiver;
            com.avito.android.service_booking_schedule_repetition_impl.e eVar = serviceBookingScheduleRepetitionSheet.f277539l0;
            if (eVar == null) {
                eVar = null;
            }
            eVar.getClass();
            boolean z12 = bVar2 instanceof b.C0769b;
            q qVar = eVar.f277592c;
            if (z12) {
                qVar.f277754d.b(((b.C0769b) bVar2).f11795a);
            } else if (bVar2 instanceof b.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                CalendarView calendarView = qVar.f277754d;
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, calendarView, ((b.c) bVar2).f11796a, null, null, null, f.c.a.b(), 2750, null, null, false, false, null, null, 4046);
            } else if (bVar2 instanceof b.a) {
                serviceBookingScheduleRepetitionSheet.f277540m0 = new Result.Success(((b.a) bVar2).f11794a);
                com.avito.android.lib.design.bottom_sheet.d dVar = serviceBookingScheduleRepetitionSheet.f277541n0;
                (dVar != null ? dVar : null).r();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<ScheduleRepetitionState, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ScheduleRepetitionState scheduleRepetitionState) {
            ScheduleRepetitionState scheduleRepetitionState2 = scheduleRepetitionState;
            ServiceBookingScheduleRepetitionSheet serviceBookingScheduleRepetitionSheet = ServiceBookingScheduleRepetitionSheet.this;
            ScreenPerformanceTracker screenPerformanceTracker = serviceBookingScheduleRepetitionSheet.f277536i0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            com.avito.android.analytics.screens.mvi.a.i(scheduleRepetitionState2, screenPerformanceTracker, new n(serviceBookingScheduleRepetitionSheet));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f277547l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f277547l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f277547l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ServiceBookingScheduleRepetitionSheet.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f277549l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f277549l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f277549l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f277550l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f277550l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f277550l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f277551l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f277551l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f277551l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_booking_schedule_repetition_impl/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.service_booking_schedule_repetition_impl.b> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.service_booking_schedule_repetition_impl.b invoke() {
            com.avito.android.service_booking_schedule_repetition_impl.c cVar = ServiceBookingScheduleRepetitionSheet.this.f277537j0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.service_booking_schedule_repetition_impl.b) cVar.get();
        }
    }

    public ServiceBookingScheduleRepetitionSheet() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f277538k0 = new O0(m0.f406844a.b(com.avito.android.service_booking_schedule_repetition_impl.b.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arg.schedule_repetition.schedule", RepetitionSchedule.class) : bundleRequireArguments.getParcelable("arg.schedule_repetition.schedule");
        if (parcelable == null) {
            throw new IllegalArgumentException("Schedule is not provided");
        }
        com.avito.android.service_booking_schedule_repetition_impl.di.a.a().a(new C28478k(ServicesBookingScheduleRepetition.f277750d, s.b(this), null, 4, null), (RepetitionSchedule) parcelable, (com.avito.android.service_booking_schedule_repetition_impl.di.c) C29972i.a(C29972i.b(this), com.avito.android.service_booking_schedule_repetition_impl.di.c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f277536i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.q qVar;
        Context context = getContext();
        String string = requireArguments().getString("arg.schedule_repetition.request_key");
        if (string == null) {
            throw new IllegalArgumentException("Request key is not provided");
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f277536i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        View viewInflate = View.inflate(context, R.layout.schedule_repetition_sheet, null);
        e.c cVar = this.f277535h0;
        if (cVar == null) {
            cVar = null;
        }
        O0 o02 = this.f277538k0;
        this.f277539l0 = cVar.a(new b(1, (com.avito.android.service_booking_schedule_repetition_impl.b) o02.getValue(), com.avito.android.service_booking_schedule_repetition_impl.b.class, "accept", "accept(Ljava/lang/Object;)V", 0), viewInflate, dVar);
        dVar.setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, true, true, 3);
        dVar.K(true);
        dVar.J(true);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        ColorStateList colorStateList = androidx.core.content.d.getColorStateList(dVar.getContext(), R.color.sheet_action_button_text_color);
        if (colorStateList != null && (qVar = dVar.f178530x) != null) {
            qVar.p(colorStateList);
        }
        dVar.R(new c(string));
        this.f277541n0 = dVar;
        com.avito.android.arch.mvi.android.f.a((com.avito.android.service_booking_schedule_repetition_impl.b) o02.getValue(), this, Lifecycle.State.f46682e, new d(1, this, ServiceBookingScheduleRepetitionSheet.class, "handleEvent", "handleEvent(Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionOneTimeEvent;)V", 0), new e());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f277536i0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.d();
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f277541n0;
        if (dVar2 == null) {
            return null;
        }
        return dVar2;
    }
}
