package bt0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.threeten.bp.g;

/* compiled from: DayScheduleOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lbt0/b;", "", "a", "b", "Lbt0/b$a;", "Lbt0/b$b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bt0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC25710b {

    /* compiled from: DayScheduleOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbt0/b$a;", "Lbt0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bt0.b$a */
    public static final /* data */ class a implements InterfaceC25710b {

        /* renamed from: a, reason: collision with root package name */
        public final int f57520a;

        public a(int i12) {
            this.f57520a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f57520a == ((a) obj).f57520a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57520a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollByOffset(offset="), this.f57520a, ')');
        }
    }

    /* compiled from: DayScheduleOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbt0/b$b;", "Lbt0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bt0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2022b implements InterfaceC25710b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final g f57521a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57522b;

        public C2022b(@k g gVar, boolean z12) {
            this.f57521a = gVar;
            this.f57522b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2022b)) {
                return false;
            }
            C2022b c2022b = (C2022b) obj;
            return L.f(this.f57521a, c2022b.f57521a) && this.f57522b == c2022b.f57522b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57522b) + (this.f57521a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScrollToTime(time=");
            sb2.append(this.f57521a);
            sb2.append(", centerAtQuarter=");
            return r.x(sb2, this.f57522b, ')');
        }
    }
}
