package EN;

import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.component.accordion.s;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersCalendarPickerResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LEN/b;", "", "a", "b", "c", "d", "LEN/b$a;", "LEN/b$b;", "LEN/b$c;", "LEN/b$d;", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: FiltersCalendarPickerResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEN/b$a;", "LEN/b;", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f3938a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f3939b;

        public a(@k Date date, @l Integer num) {
            this.f3938a = date;
            this.f3939b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f3938a, aVar.f3938a) && L.f(this.f3939b, aVar.f3939b);
        }

        public final int hashCode() {
            int iHashCode = this.f3938a.hashCode() * 31;
            Integer num = this.f3939b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DateChosen(date=");
            sb2.append(this.f3938a);
            sb2.append(", flexDatesOptionId=");
            return s.j(sb2, this.f3939b, ')');
        }
    }

    /* compiled from: FiltersCalendarPickerResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEN/b$b;", "LEN/b;", "<init>", "()V", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: EN.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0228b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0228b f3940a = new C0228b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0228b);
        }

        public final int hashCode() {
            return -1094040621;
        }

        @k
        public final String toString() {
            return "DatesCleared";
        }
    }

    /* compiled from: FiltersCalendarPickerResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEN/b$c;", "LEN/b;", "<init>", "()V", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f3941a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -434242115;
        }

        @k
        public final String toString() {
            return "Dismissed";
        }
    }

    /* compiled from: FiltersCalendarPickerResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEN/b$d;", "LEN/b;", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f3942a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Date f3943b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f3944c;

        public d(@k Date date, @k Date date2, @l Integer num) {
            this.f3942a = date;
            this.f3943b = date2;
            this.f3944c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f3942a, dVar.f3942a) && L.f(this.f3943b, dVar.f3943b) && L.f(this.f3944c, dVar.f3944c);
        }

        public final int hashCode() {
            int iF2 = m.f(this.f3943b, this.f3942a.hashCode() * 31, 31);
            Integer num = this.f3944c;
            return iF2 + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IntervalChosen(from=");
            sb2.append(this.f3942a);
            sb2.append(", to=");
            sb2.append(this.f3943b);
            sb2.append(", flexDatesOptionId=");
            return s.j(sb2, this.f3944c, ')');
        }
    }
}
