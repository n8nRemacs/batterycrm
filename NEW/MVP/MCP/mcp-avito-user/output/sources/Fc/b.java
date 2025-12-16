package FC;

import Y61.k;
import Y61.l;
import com.avito.android.favorite_sellers.SubscribableItem;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteSellersOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LFC/b;", "", "a", "b", "c", "d", "LFC/b$a;", "LFC/b$b;", "LFC/b$c;", "LFC/b$d;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: FavoriteSellersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/b$a;", "LFC/b;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f4613a;

        public a(@k Throwable th2) {
            this.f4613a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f4613a, ((a) obj).f4613a);
        }

        public final int hashCode() {
            return this.f4613a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowCommonErrorToastBar(throwable="), this.f4613a, ')');
        }
    }

    /* compiled from: FavoriteSellersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/b$b;", "LFC/b;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: FC.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0281b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserDialog f4614a;

        public C0281b(@k UserDialog userDialog) {
            this.f4614a = userDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0281b) && L.f(this.f4614a, ((C0281b) obj).f4614a);
        }

        public final int hashCode() {
            return this.f4614a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowErrorDialog(dialog=" + this.f4614a + ')';
        }
    }

    /* compiled from: FavoriteSellersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFC/b$c;", "LFC/b;", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f4615a = new c();
    }

    /* compiled from: FavoriteSellersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/b$d;", "LFC/b;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f4616a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SubscribableItem f4617b;

        public d(@k String str, @k SubscribableItem subscribableItem) {
            this.f4616a = str;
            this.f4617b = subscribableItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f4616a, dVar.f4616a) && L.f(this.f4617b, dVar.f4617b);
        }

        public final int hashCode() {
            return this.f4617b.hashCode() + (this.f4616a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowSnackbarWithUndo(message=" + this.f4616a + ", item=" + this.f4617b + ')';
        }
    }
}
