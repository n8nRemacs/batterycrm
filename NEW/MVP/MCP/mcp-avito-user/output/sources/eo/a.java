package EO;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ItemPriceHistoryAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LEO/a;", "", "a", "b", "LEO/a$a;", "LEO/a$b;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: ItemPriceHistoryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEO/a$a;", "LEO/a;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: EO.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0231a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3994a;

        public C0231a(int i12) {
            this.f3994a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0231a) && this.f3994a == ((C0231a) obj).f3994a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f3994a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ItemPositionReached(position="), this.f3994a, ')');
        }
    }

    /* compiled from: ItemPriceHistoryAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEO/a$b;", "LEO/a;", "<init>", "()V", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f3995a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1128775420;
        }

        @k
        public final String toString() {
            return "MainButtonClicked";
        }
    }
}
