package um;

import androidx.compose.runtime.C22026a;
import com.avito.android.campaigns_sale_search.mvi.entity.Filter;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleSearchAction.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0014\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lum/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "Lum/b$a;", "Lum/b$b;", "Lum/b$c;", "Lum/b$d;", "Lum/b$e;", "Lum/b$f;", "Lum/b$g;", "Lum/b$h;", "Lum/b$i;", "Lum/b$j;", "Lum/b$k;", "Lum/b$l;", "Lum/b$m;", "Lum/b$n;", "Lum/b$o;", "Lum/b$p;", "Lum/b$q;", "Lum/b$r;", "Lum/b$s;", "Lum/b$t;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/b$a;", "Lum/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.campaigns_sale_search.konveyor.search_item.a f440231a;

        public a(@Y61.k com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar) {
            this.f440231a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f440231a, ((a) obj).f440231a);
        }

        public final int hashCode() {
            return this.f440231a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AddItemToSaleButtonClicked(item=" + this.f440231a + ')';
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lum/b$b;", "Lum/b;", "Lum/f;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: um.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12727b implements b, um.f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f440232a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f440233b;

        public C12727b(@Y61.k String str, @Y61.l Integer num) {
            this.f440232a = str;
            this.f440233b = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12727b)) {
                return false;
            }
            C12727b c12727b = (C12727b) obj;
            return L.f(this.f440232a, c12727b.f440232a) && L.f(this.f440233b, c12727b.f440233b);
        }

        public final int hashCode() {
            int iHashCode = this.f440232a.hashCode() * 31;
            Integer num = this.f440233b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplyDiscountButtonClicked(itemId=");
            sb2.append(this.f440232a);
            sb2.append(", discount=");
            return com.akita.compose.component.accordion.s.j(sb2, this.f440233b, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/b$c;", "Lum/b;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f440234a = new c();
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/b$d;", "Lum/b;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f440235a = new d();
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/b$e;", "Lum/b;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f440236a = new e();
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/b$f;", "Lum/b;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f440237a = new f();
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/b$g;", "Lum/b;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f440238a = new g();
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/b$h;", "Lum/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f440239a;

        public h(@Y61.k DeepLink deepLink) {
            this.f440239a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f440239a, ((h) obj).f440239a);
        }

        public final int hashCode() {
            return this.f440239a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClicked(deeplink="), this.f440239a, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/b$i;", "Lum/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.campaigns_sale_search.konveyor.search_item.a f440240a;

        public i(@Y61.k com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar) {
            this.f440240a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f440240a, ((i) obj).f440240a);
        }

        public final int hashCode() {
            return this.f440240a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DeleteItemFromSaleButtonClicked(item=" + this.f440240a + ')';
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/b$j;", "Lum/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.campaigns_sale_search.konveyor.search_item.a f440241a;

        public j(@Y61.k com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar) {
            this.f440241a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f440241a, ((j) obj).f440241a);
        }

        public final int hashCode() {
            return this.f440241a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DeleteItemFromSaleConfirmed(item=" + this.f440241a + ')';
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/b$k;", "Lum/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f440242a;

        public k(int i12) {
            this.f440242a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f440242a == ((k) obj).f440242a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f440242a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("DiscountChipClicked(discount="), this.f440242a, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/b$l;", "Lum/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f440243a;

        public l(@Y61.l Integer num) {
            this.f440243a = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f440243a, ((l) obj).f440243a);
        }

        public final int hashCode() {
            Integer num = this.f440243a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.akita.compose.component.accordion.s.j(new StringBuilder("DiscountForItemChosen(discount="), this.f440243a, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lum/b$m;", "Lum/b;", "Lum/f;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements b, um.f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f440244a = new m();
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/b$n;", "Lum/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Filter f440245a;

        public n(@Y61.k Filter filter) {
            this.f440245a = filter;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f440245a == ((n) obj).f440245a;
        }

        public final int hashCode() {
            return this.f440245a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "FilterSelected(filter=" + this.f440245a + ')';
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/b$o;", "Lum/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f440246a;

        public o(@Y61.k String str) {
            this.f440246a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f440246a, ((o) obj).f440246a);
        }

        public final int hashCode() {
            return this.f440246a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("HistoryItemClicked(name="), this.f440246a, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lum/b$p;", "Lum/b;", "Lum/f;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements b, um.f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f440247a;

        public p(@Y61.k String str) {
            this.f440247a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f440247a, ((p) obj).f440247a);
        }

        public final int hashCode() {
            return this.f440247a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChanged(query="), this.f440247a, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/b$q;", "Lum/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f440248a;

        public q(@Y61.k String str) {
            this.f440248a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f440248a, ((q) obj).f440248a);
        }

        public final int hashCode() {
            return this.f440248a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("KeyboardActionDoneClicked(query="), this.f440248a, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lum/b$r;", "Lum/b;", "Lum/f;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class r implements b, um.f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f440249a = new r();
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lum/b$s;", "Lum/b;", "Lum/f;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class s implements b, um.f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final s f440250a = new s();
    }

    /* compiled from: CampaignsSaleSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/b$t;", "Lum/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f440251a;

        public t(@Y61.k String str) {
            this.f440251a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && L.f(this.f440251a, ((t) obj).f440251a);
        }

        public final int hashCode() {
            return this.f440251a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("RemoveQueryFromHistory(query="), this.f440251a, ')');
        }
    }
}
