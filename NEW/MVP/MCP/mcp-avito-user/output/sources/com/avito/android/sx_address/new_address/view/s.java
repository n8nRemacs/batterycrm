package com.avito.android.sx_address.new_address.view;

import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.new_address.domain.WeekDay;
import com.avito.android.sx_address.new_address.domain.WorkingHours;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScheduleView.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/s;", "", "a", "b", "Lcom/avito/android/sx_address/new_address/view/s$a;", "Lcom/avito/android/sx_address/new_address/view/s$b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WeekDay f293996a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WorkingHours.Day.Time f293997b;

    /* compiled from: ScheduleView.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/s$a;", "Lcom/avito/android/sx_address/new_address/view/s;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends s {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final WeekDay f293998c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final WorkingHours.Day.Time f293999d;

        public a(@Y61.k WeekDay weekDay, @Y61.k WorkingHours.Day.Time time) {
            super(weekDay, time, null);
            this.f293998c = weekDay;
            this.f293999d = time;
        }

        @Override // com.avito.android.sx_address.new_address.view.s
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final WeekDay getF293996a() {
            return this.f293998c;
        }

        @Override // com.avito.android.sx_address.new_address.view.s
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final WorkingHours.Day.Time getF293997b() {
            return this.f293999d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f293998c == aVar.f293998c && L.f(this.f293999d, aVar.f293999d);
        }

        public final int hashCode() {
            return this.f293999d.hashCode() + (this.f293998c.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "From(day=" + this.f293998c + ", timeValue=" + this.f293999d + ')';
        }
    }

    /* compiled from: ScheduleView.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/s$b;", "Lcom/avito/android/sx_address/new_address/view/s;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends s {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final WeekDay f294000c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final WorkingHours.Day.Time f294001d;

        public b(@Y61.k WeekDay weekDay, @Y61.k WorkingHours.Day.Time time) {
            super(weekDay, time, null);
            this.f294000c = weekDay;
            this.f294001d = time;
        }

        @Override // com.avito.android.sx_address.new_address.view.s
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final WeekDay getF293996a() {
            return this.f294000c;
        }

        @Override // com.avito.android.sx_address.new_address.view.s
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final WorkingHours.Day.Time getF293997b() {
            return this.f294001d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f294000c == bVar.f294000c && L.f(this.f294001d, bVar.f294001d);
        }

        public final int hashCode() {
            return this.f294001d.hashCode() + (this.f294000c.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "To(day=" + this.f294000c + ", timeValue=" + this.f294001d + ')';
        }
    }

    public s(WeekDay weekDay, WorkingHours.Day.Time time, C42822w c42822w) {
        this.f293996a = weekDay;
        this.f293997b = time;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public WeekDay getF293996a() {
        return this.f293996a;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public WorkingHours.Day.Time getF293997b() {
        return this.f293997b;
    }
}
