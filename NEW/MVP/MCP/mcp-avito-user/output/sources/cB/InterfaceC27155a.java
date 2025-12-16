package cb;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MviFavoriteAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcb/a;", "", "a", "b", "Lcb/a$a;", "Lcb/a$b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cb.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC27155a {

    /* compiled from: MviFavoriteAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcb/a$a;", "Lcb/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cb.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2048a implements InterfaceC27155a {

        /* renamed from: a, reason: collision with root package name */
        public final long f57968a;

        public C2048a(long j12) {
            this.f57968a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2048a) && this.f57968a == ((C2048a) obj).f57968a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f57968a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("SelectedPeriod(date="), this.f57968a, ')');
        }
    }

    /* compiled from: MviFavoriteAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcb/a$b;", "Lcb/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cb.a$b */
    public static final /* data */ class b implements InterfaceC27155a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AdvertDetailStatsTabItem f57969a;

        public b(@l AdvertDetailStatsTabItem advertDetailStatsTabItem) {
            this.f57969a = advertDetailStatsTabItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f57969a, ((b) obj).f57969a);
        }

        public final int hashCode() {
            AdvertDetailStatsTabItem advertDetailStatsTabItem = this.f57969a;
            if (advertDetailStatsTabItem == null) {
                return 0;
            }
            return advertDetailStatsTabItem.hashCode();
        }

        @k
        public final String toString() {
            return "SetTabData(item=" + this.f57969a + ')';
        }
    }
}
