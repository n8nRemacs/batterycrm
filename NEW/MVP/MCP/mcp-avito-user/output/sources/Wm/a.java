package WM;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.imv_cars_details.presentation.ImvCarsDetailsParams;
import com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.DifferenceImvAvgPriceItem;
import com.avito.android.remote.model.PricePoll;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LWM/a;", "", "a", "b", "c", "d", "e", "LWM/a$a;", "LWM/a$b;", "LWM/a$c;", "LWM/a$d;", "LWM/a$e;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: ImvCarsDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWM/a$a;", "LWM/a;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: WM.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1266a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ImvCarsDetailsParams f17874a;

        public C1266a(@k ImvCarsDetailsParams imvCarsDetailsParams) {
            this.f17874a = imvCarsDetailsParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1266a) && L.f(this.f17874a, ((C1266a) obj).f17874a);
        }

        public final int hashCode() {
            return this.f17874a.hashCode();
        }

        @k
        public final String toString() {
            return "LoadImvDetails(params=" + this.f17874a + ')';
        }
    }

    /* compiled from: ImvCarsDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWM/a$b;", "LWM/a;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17875a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f17876b;

        public b(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            str = (i12 & 2) != 0 ? null : str;
            this.f17875a = deepLink;
            this.f17876b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f17875a, bVar.f17875a) && L.f(this.f17876b, bVar.f17876b);
        }

        public final int hashCode() {
            int iHashCode = this.f17875a.hashCode() * 31;
            String str = this.f17876b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenLinkAction(deepLink=");
            sb2.append(this.f17875a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f17876b, ')');
        }
    }

    /* compiled from: ImvCarsDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWM/a$c;", "LWM/a;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PricePoll f17877a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17878b;

        public c(@k PricePoll pricePoll, int i12) {
            this.f17877a = pricePoll;
            this.f17878b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f17877a, cVar.f17877a) && this.f17878b == cVar.f17878b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f17878b) + (this.f17877a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PollAnswered(poll=");
            sb2.append(this.f17877a);
            sb2.append(", answerId=");
            return r.t(sb2, this.f17878b, ')');
        }
    }

    /* compiled from: ImvCarsDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWM/a$d;", "LWM/a;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return DifferenceImvAvgPriceItem.class.equals(DifferenceImvAvgPriceItem.class);
        }

        public final int hashCode() {
            return DifferenceImvAvgPriceItem.class.hashCode();
        }

        @k
        public final String toString() {
            return "ScrollToItem(type=" + DifferenceImvAvgPriceItem.class + ')';
        }
    }

    /* compiled from: ImvCarsDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWM/a$e;", "LWM/a;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17879a;

        public e(@k String str) {
            this.f17879a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f17879a, ((e) obj).f17879a);
        }

        public final int hashCode() {
            return this.f17879a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastAction(message="), this.f17879a, ')');
        }
    }
}
