package N9;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.price_list.AdvertPriceListSectionItem;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertPriceListBottomSheetDialogState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LN9/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0721a f11239c = new C0721a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f11240d = new a(C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<AdvertPriceListSectionItem> f11241b;

    /* compiled from: AdvertPriceListBottomSheetDialogState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LN9/a$a;", "", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: N9.a$a, reason: collision with other inner class name */
    public static final class C0721a {
        public /* synthetic */ C0721a(C42822w c42822w) {
            this();
        }

        public C0721a() {
        }
    }

    public a(@k List<AdvertPriceListSectionItem> list) {
        this.f11241b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f11241b, ((a) obj).f11241b);
    }

    public final int hashCode() {
        return this.f11241b.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("AdvertPriceListBottomSheetDialogState(items="), this.f11241b, ')');
    }
}
