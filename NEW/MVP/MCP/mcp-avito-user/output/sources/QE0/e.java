package QE0;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelGuestProfileState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LQE0/e;", "", "a", "b", "c", "LQE0/e$a;", "LQE0/e$b;", "LQE0/e$c;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface e {

    /* compiled from: TravelGuestProfileState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/e$a;", "LQE0/e;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f13631a;

        public a(@k ArrayList arrayList) {
            this.f13631a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f13631a.equals(((a) obj).f13631a);
        }

        public final int hashCode() {
            return this.f13631a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Content(items="), this.f13631a, ')');
        }
    }

    /* compiled from: TravelGuestProfileState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/e$b;", "LQE0/e;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f13632a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f13633b;

        public b(@k PrintableText printableText, @l PrintableText printableText2) {
            this.f13632a = printableText;
            this.f13633b = printableText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f13632a, bVar.f13632a) && L.f(this.f13633b, bVar.f13633b);
        }

        public final int hashCode() {
            int iHashCode = this.f13632a.hashCode() * 31;
            PrintableText printableText = this.f13633b;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(errorTitle=");
            sb2.append(this.f13632a);
            sb2.append(", errorSubtitle=");
            return AK.c.m(sb2, this.f13633b, ')');
        }
    }

    /* compiled from: TravelGuestProfileState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQE0/e$c;", "LQE0/e;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f13634a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1551851919;
        }

        @k
        public final String toString() {
            return "Progress";
        }
    }
}
