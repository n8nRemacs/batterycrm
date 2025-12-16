package WM;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.DifferenceImvAvgPriceItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LWM/b;", "", "a", "b", "c", "LWM/b$a;", "LWM/b$b;", "LWM/b$c;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: ImvCarsDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWM/b$a;", "LWM/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17880a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f17881b;

        public a(@k DeepLink deepLink, @l String str) {
            this.f17880a = deepLink;
            this.f17881b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f17880a, aVar.f17880a) && L.f(this.f17881b, aVar.f17881b);
        }

        public final int hashCode() {
            int iHashCode = this.f17880a.hashCode() * 31;
            String str = this.f17881b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenLink(deepLink=");
            sb2.append(this.f17880a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f17881b, ')');
        }

        public /* synthetic */ a(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: ImvCarsDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWM/b$b;", "LWM/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: WM.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1267b implements b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1267b)) {
                return false;
            }
            ((C1267b) obj).getClass();
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

    /* compiled from: ImvCarsDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWM/b$c;", "LWM/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17882a;

        public c(@k String str) {
            this.f17882a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f17882a, ((c) obj).f17882a);
        }

        public final int hashCode() {
            return this.f17882a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f17882a, ')');
        }
    }
}
