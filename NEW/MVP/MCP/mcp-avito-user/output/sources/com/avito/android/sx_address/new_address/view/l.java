package com.avito.android.sx_address.new_address.view;

import android.animation.LayoutTransition;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.sx_address.new_address.analytics.FormInputFieldName;
import com.avito.android.sx_address.new_address.domain.ScheduleType;
import com.avito.android.sx_address.new_address.domain.WeekDay;
import com.avito.android.sx_address.new_address.domain.WorkingHours;
import com.avito.android.sx_address.new_address.view.s;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import j.InterfaceC42156l;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: ScheduleView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/l;", "Lcom/avito/android/sx_address/new_address/view/j;", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f293903a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.new_address.d f293904b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f293905c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f293906d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f293907e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final e2 f293908f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final e2 f293909g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final e2 f293910h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final e2 f293911i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final k f293912j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Chips f293913k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f293914l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final LayoutTransition f293915m;

    /* compiled from: ScheduleView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/l$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ScheduleType f293916b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f293917c;

        public a(@Y61.k ScheduleType scheduleType, @Y61.k String str) {
            this.f293916b = scheduleType;
            this.f293917c = str;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            return (obj instanceof a) && L.f(((a) obj).f293917c, this.f293917c);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: W */
        public final CharSequence getF199741b() {
            return this.f293917c;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f293916b == aVar.f293916b && L.f(this.f293917c, aVar.f293917c);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF293858c() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            return this.f293917c.hashCode() + (this.f293916b.hashCode() * 31);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF281693d() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChipableOption(type=");
            sb2.append(this.f293916b);
            sb2.append(", chipTitle=");
            return C22026a.c(sb2, this.f293917c, ')');
        }
    }

    /* compiled from: ScheduleView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ScheduleType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ScheduleType scheduleType = ScheduleType.f293617b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ScheduleType scheduleType2 = ScheduleType.f293617b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ScheduleView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isSwitched", "Lcom/avito/android/sx_address/new_address/domain/WeekDay;", SelectionType.TYPE_DAY, "Lkotlin/G0;", "invoke", "(ZLcom/avito/android/sx_address/new_address/domain/WeekDay;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<Boolean, WeekDay, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ H f293919m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super FormInputFieldName, G0> lVar) {
            super(2);
            this.f293919m = (H) lVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // Y41.p
        public final G0 invoke(Boolean bool, WeekDay weekDay) {
            l.this.f293907e.K5(new i(bool.booleanValue(), weekDay));
            this.f293919m.invoke(FormInputFieldName.f293569f);
            return G0.f406611a;
        }
    }

    /* compiled from: ScheduleView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/WeekDay;", SelectionType.TYPE_DAY, "Lcom/avito/android/sx_address/new_address/domain/WorkingHours$Day$Time;", "timeValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/sx_address/new_address/domain/WeekDay;Lcom/avito/android/sx_address/new_address/domain/WorkingHours$Day$Time;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<WeekDay, WorkingHours.Day.Time, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ H f293921m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l<? super FormInputFieldName, G0> lVar) {
            super(2);
            this.f293921m = (H) lVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // Y41.p
        public final G0 invoke(WeekDay weekDay, WorkingHours.Day.Time time) {
            l.this.f293909g.K5(new s.a(weekDay, time));
            this.f293921m.invoke(FormInputFieldName.f293569f);
            return G0.f406611a;
        }
    }

    /* compiled from: ScheduleView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/WeekDay;", SelectionType.TYPE_DAY, "Lcom/avito/android/sx_address/new_address/domain/WorkingHours$Day$Time;", "timeValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/sx_address/new_address/domain/WeekDay;Lcom/avito/android/sx_address/new_address/domain/WorkingHours$Day$Time;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.p<WeekDay, WorkingHours.Day.Time, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ H f293923m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.l<? super FormInputFieldName, G0> lVar) {
            super(2);
            this.f293923m = (H) lVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // Y41.p
        public final G0 invoke(WeekDay weekDay, WorkingHours.Day.Time time) {
            l.this.f293909g.K5(new s.b(weekDay, time));
            this.f293923m.invoke(FormInputFieldName.f293569f);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.avito.android.sx_address.new_address.view.k] */
    public l(@Y61.k View view, @Y61.k com.avito.android.sx_address.new_address.d dVar) {
        this.f293903a = view;
        this.f293904b = dVar;
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f293905c = e2VarB;
        this.f293906d = e2VarB;
        e2 e2VarB2 = f2.b(0, 1, null, 5);
        this.f293907e = e2VarB2;
        this.f293908f = e2VarB2;
        e2 e2VarB3 = f2.b(0, 1, null, 5);
        this.f293909g = e2VarB3;
        this.f293910h = e2VarB3;
        this.f293911i = f2.b(0, 1, null, 5);
        this.f293912j = new ViewTreeObserver.OnDrawListener() { // from class: com.avito.android.sx_address.new_address.view.k
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                this.f293902b.f293911i.K5(Boolean.FALSE);
            }
        };
        View viewFindViewById = view.findViewById(R.id.schedule_options_chips_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f293913k = (Chips) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.schedule_days_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f293914l = (LinearLayout) viewFindViewById2;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(0);
        layoutTransition.enableTransitionType(1);
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(3);
        layoutTransition.disableTransitionType(4);
        this.f293915m = layoutTransition;
    }

    public final void a(WorkingHours workingHours, ScheduleType scheduleType, Y41.l<? super FormInputFieldName, G0> lVar) throws Resources.NotFoundException {
        ScheduleType scheduleType2 = ScheduleType.f293618c;
        LinearLayout linearLayout = this.f293914l;
        if (scheduleType == scheduleType2) {
            D6.H(linearLayout);
        } else {
            D6.w(linearLayout);
        }
        c cVar = new c(lVar);
        final d dVar = new d(lVar);
        final e eVar = new e(lVar);
        linearLayout.removeAllViews();
        int i12 = 0;
        for (Object obj : workingHours.f293632b.entrySet()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.schedule_day_layout, (ViewGroup) linearLayout, false);
            if (i12 > 0) {
                D6.c(viewInflate, null, Integer.valueOf(y6.b(12)), null, null, 13);
            }
            WeekDay weekDay = (WeekDay) entry.getKey();
            final G g12 = new G(viewInflate, weekDay);
            final WorkingHours.Day day = (WorkingHours.Day) entry.getValue();
            boolean z12 = day.f293636c;
            Switcher switcher = g12.f293871c;
            switcher.setChecked(z12);
            switcher.setOnCheckedChangeListener(new com.avito.android.lib.deprecated_design.radio_button.c(6, cVar, g12));
            I5.a(g12.f293872d, viewInflate.getResources().getString(weekDay.f293631b), false);
            StringBuilder sb2 = new StringBuilder();
            WorkingHours.Day.Time time = day.f293635b;
            sb2.append(G.a(time.f293638b));
            sb2.append(':');
            sb2.append(G.a(time.f293639c));
            String string = sb2.toString();
            Input input = g12.f293873e;
            Input.t(input, string, false, 6);
            final int i14 = 0;
            input.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.new_address.view.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            dVar.invoke(g12.f293870b, day.f293635b);
                            break;
                        default:
                            dVar.invoke(g12.f293870b, day.f293637d);
                            break;
                    }
                }
            });
            input.setEnabled(z12);
            StringBuilder sb3 = new StringBuilder();
            WorkingHours.Day.Time time2 = day.f293637d;
            sb3.append(G.a(time2.f293638b));
            sb3.append(':');
            sb3.append(G.a(time2.f293639c));
            String string2 = sb3.toString();
            Input input2 = g12.f293874f;
            Input.t(input2, string2, false, 6);
            final int i15 = 1;
            input2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.new_address.view.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            eVar.invoke(g12.f293870b, day.f293635b);
                            break;
                        default:
                            eVar.invoke(g12.f293870b, day.f293637d);
                            break;
                    }
                }
            });
            input2.setEnabled(z12);
            linearLayout.addView(viewInflate);
            i12 = i13;
        }
    }
}
