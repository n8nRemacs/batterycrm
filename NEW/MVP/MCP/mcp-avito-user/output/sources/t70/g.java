package T70;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryState.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LT70/g;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "LT70/g$a;", "LT70/g$b;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class g extends q {

    /* compiled from: GridGalleryState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/g$a;", "LT70/g;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f15427b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f15428c;

        public a(@k ArrayList arrayList, @l Integer num) {
            super(null);
            this.f15427b = arrayList;
            this.f15428c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f15427b, aVar.f15427b) && L.f(this.f15428c, aVar.f15428c);
        }

        public final int hashCode() {
            int iHashCode = this.f15427b.hashCode() * 31;
            Integer num = this.f15428c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(navbarItems=");
            sb2.append(this.f15427b);
            sb2.append(", positionToScrollTo=");
            return s.j(sb2, this.f15428c, ')');
        }
    }

    /* compiled from: GridGalleryState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LT70/g$b;", "LT70/g;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends g {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f15429b = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -841171080;
        }

        @k
        public final String toString() {
            return "Hidden";
        }
    }

    public /* synthetic */ g(C42822w c42822w) {
        this();
    }

    public g() {
    }
}
