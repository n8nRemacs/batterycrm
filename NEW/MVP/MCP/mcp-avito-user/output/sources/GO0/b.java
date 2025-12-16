package GO0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.wallet.history.mvi.entity.HistoryItemStatus;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WalletHistoryItem.kt */
@H0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LGO0/b;", "", "a", "b", "c", "d", "LGO0/b$a;", "LGO0/b$b;", "LGO0/b$d;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: WalletHistoryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGO0/b$a;", "LGO0/b;", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f6478a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final String f6479b = "wallet_history_loader_key";

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f6480c = "wallet_history_loader";

        @Override // GO0.b
        @k
        public final String d() {
            return f6480c;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // GO0.b
        @k
        /* renamed from: getId */
        public final String getF6486a() {
            return f6479b;
        }

        public final int hashCode() {
            return -966620500;
        }

        @k
        public final String toString() {
            return "Loader";
        }
    }

    /* compiled from: WalletHistoryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGO0/b$b;", "LGO0/b;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: GO0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0349b implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f6481a;

        public C0349b(@l String str) {
            this.f6481a = str;
        }

        @Override // GO0.b
        @k
        public final String d() {
            return "wallet_history_end_text";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0349b) && L.f(this.f6481a, ((C0349b) obj).f6481a);
        }

        @Override // GO0.b
        @k
        /* renamed from: getId */
        public final String getF6486a() {
            String str = this.f6481a;
            return str == null ? "wallet_history_end_text_key" : str;
        }

        public final int hashCode() {
            String str = this.f6481a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("WalletHistoryEndText(text="), this.f6481a, ')');
        }
    }

    /* compiled from: WalletHistoryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGO0/b$c;", "", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f6482a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f6483b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Map<String, Object> f6484c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Boolean f6485d;

        public c(@l Integer num, @l Integer num2, @l Map<String, ? extends Object> map, @l Boolean bool) {
            this.f6482a = num;
            this.f6483b = num2;
            this.f6484c = map;
            this.f6485d = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f6482a, cVar.f6482a) && L.f(this.f6483b, cVar.f6483b) && L.f(this.f6484c, cVar.f6484c) && L.f(this.f6485d, cVar.f6485d);
        }

        public final int hashCode() {
            Integer num = this.f6482a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f6483b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Map<String, Object> map = this.f6484c;
            int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Boolean bool = this.f6485d;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WalletHistoryEventsV2(id=");
            sb2.append(this.f6482a);
            sb2.append(", version=");
            sb2.append(this.f6483b);
            sb2.append(", params=");
            sb2.append(this.f6484c);
            sb2.append(", hasSensitiveData=");
            return C0.g(sb2, this.f6485d, ')');
        }
    }

    /* compiled from: WalletHistoryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGO0/b$d;", "LGO0/b;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6486a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f6487b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f6488c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f6489d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final HistoryItemStatus f6490e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DeepLink f6491f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final UniversalImage f6492g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final JO0.a f6493h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final c f6494i;

        public d(String str, String str2, String str3, String str4, HistoryItemStatus historyItemStatus, DeepLink deepLink, UniversalImage universalImage, JO0.a aVar, c cVar, int i12, C42822w c42822w) {
            aVar = (i12 & 128) != 0 ? null : aVar;
            cVar = (i12 & 256) != 0 ? null : cVar;
            this.f6486a = str;
            this.f6487b = str2;
            this.f6488c = str3;
            this.f6489d = str4;
            this.f6490e = historyItemStatus;
            this.f6491f = deepLink;
            this.f6492g = universalImage;
            this.f6493h = aVar;
            this.f6494i = cVar;
        }

        @Override // GO0.b
        @k
        public final String d() {
            return "wallet_history_item";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f6486a, dVar.f6486a) && L.f(this.f6487b, dVar.f6487b) && L.f(this.f6488c, dVar.f6488c) && L.f(this.f6489d, dVar.f6489d) && this.f6490e == dVar.f6490e && L.f(this.f6491f, dVar.f6491f) && L.f(this.f6492g, dVar.f6492g) && L.f(this.f6493h, dVar.f6493h) && L.f(this.f6494i, dVar.f6494i);
        }

        @Override // GO0.b
        @k
        /* renamed from: getId, reason: from getter */
        public final String getF6486a() {
            return this.f6486a;
        }

        public final int hashCode() {
            int iHashCode = this.f6486a.hashCode() * 31;
            String str = this.f6487b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f6488c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f6489d;
            int iHashCode4 = (this.f6490e.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            DeepLink deepLink = this.f6491f;
            int iHashCode5 = (iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            UniversalImage universalImage = this.f6492g;
            int iHashCode6 = (iHashCode5 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            JO0.a aVar = this.f6493h;
            int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            c cVar = this.f6494i;
            return iHashCode7 + (cVar != null ? cVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "WalletHistoryItemData(id=" + this.f6486a + ", text=" + this.f6487b + ", date=" + this.f6488c + ", amount=" + this.f6489d + ", status=" + this.f6490e + ", detailsDeeplink=" + this.f6491f + ", image=" + this.f6492g + ", events=" + this.f6493h + ", eventsV2=" + this.f6494i + ')';
        }
    }

    @k
    String d();

    @k
    /* renamed from: getId */
    String getF6486a();
}
