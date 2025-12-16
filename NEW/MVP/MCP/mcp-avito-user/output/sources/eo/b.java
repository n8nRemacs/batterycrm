package EO;

import Y61.k;
import Y61.l;
import com.avito.android.item_price_history.presentation.mvi.entity.IsFavoriteState;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistoryOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LEO/b;", "", "a", "b", "c", "d", "LEO/b$a;", "LEO/b$b;", "LEO/b$c;", "LEO/b$d;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: ItemPriceHistoryOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEO/b$a;", "LEO/b;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final IsFavoriteState f3996a;

        public a(@k IsFavoriteState isFavoriteState) {
            this.f3996a = isFavoriteState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f3996a == ((a) obj).f3996a;
        }

        public final int hashCode() {
            return this.f3996a.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeMainButtonState(state=" + this.f3996a + ')';
        }
    }

    /* compiled from: ItemPriceHistoryOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEO/b$b;", "LEO/b;", "<init>", "()V", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: EO.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0232b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0232b f3997a = new C0232b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0232b);
        }

        public final int hashCode() {
            return -150590034;
        }

        @k
        public final String toString() {
            return "PerformHapticFeedback";
        }
    }

    /* compiled from: ItemPriceHistoryOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEO/b$c;", "LEO/b;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f3998a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f3999b;

        public c(@k PrintableText printableText, @k Throwable th2) {
            this.f3998a = printableText;
            this.f3999b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f3998a, cVar.f3998a) && L.f(this.f3999b, cVar.f3999b);
        }

        public final int hashCode() {
            return this.f3999b.hashCode() + (this.f3998a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToast(text=");
            sb2.append(this.f3998a);
            sb2.append(", error=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f3999b, ')');
        }
    }

    /* compiled from: ItemPriceHistoryOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEO/b$d;", "LEO/b;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f4000a;

        public d(@k PrintableText printableText) {
            this.f4000a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f4000a, ((d) obj).f4000a);
        }

        public final int hashCode() {
            return this.f4000a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(text="), this.f4000a, ')');
        }
    }
}
