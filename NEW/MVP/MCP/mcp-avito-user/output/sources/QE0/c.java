package QE0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelGuestProfileOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LQE0/c;", "", "a", "b", "c", "d", "e", "LQE0/c$a;", "LQE0/c$b;", "LQE0/c$c;", "LQE0/c$d;", "LQE0/c$e;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: TravelGuestProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQE0/c$a;", "LQE0/c;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13612a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1346866399;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: TravelGuestProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/c$b;", "LQE0/c;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13613a;

        public b(@k DeepLink deepLink) {
            this.f13613a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f13613a, ((b) obj).f13613a);
        }

        public final int hashCode() {
            return this.f13613a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f13613a, ')');
        }
    }

    /* compiled from: TravelGuestProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/c$c;", "LQE0/c;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: QE0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0892c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Image> f13614a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f13615b;

        public C0892c(@k List<Image> list, @l Integer num) {
            this.f13614a = list;
            this.f13615b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0892c)) {
                return false;
            }
            C0892c c0892c = (C0892c) obj;
            return L.f(this.f13614a, c0892c.f13614a) && L.f(this.f13615b, c0892c.f13615b);
        }

        public final int hashCode() {
            int iHashCode = this.f13614a.hashCode() * 31;
            Integer num = this.f13615b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenPhotoGallery(images=");
            sb2.append(this.f13614a);
            sb2.append(", position=");
            return s.j(sb2, this.f13615b, ')');
        }
    }

    /* compiled from: TravelGuestProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/c$d;", "LQE0/c;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f13616a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<SearchParametersEntry.SearchParametersBlock.Sort.SortOption> f13617b;

        public d(@l String str, @k List<SearchParametersEntry.SearchParametersBlock.Sort.SortOption> list) {
            this.f13616a = str;
            this.f13617b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f13616a, dVar.f13616a) && L.f(this.f13617b, dVar.f13617b);
        }

        public final int hashCode() {
            String str = this.f13616a;
            return this.f13617b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSortingOptionsDialog(selectedOption=");
            sb2.append(this.f13616a);
            sb2.append(", options=");
            return H.p(sb2, this.f13617b, ')');
        }
    }

    /* compiled from: TravelGuestProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/c$e;", "LQE0/c;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f13618a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13619b;

        public e(@k ApiError apiError, boolean z12) {
            this.f13618a = apiError;
            this.f13619b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f13618a, eVar.f13618a) && this.f13619b == eVar.f13619b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13619b) + (this.f13618a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowReviewsLoadingErrorToast(apiError=");
            sb2.append(this.f13618a);
            sb2.append(", isPagination=");
            return r.x(sb2, this.f13619b, ')');
        }
    }
}
