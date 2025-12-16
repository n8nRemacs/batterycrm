package zw;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_agency_search.domain.GetClientListResponse;
import com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.Tab;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model.ReturnToWorkResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealCabinetAction.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lzw/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "Lzw/b$a;", "Lzw/b$b;", "Lzw/b$c;", "Lzw/b$d;", "Lzw/b$e;", "Lzw/b$f;", "Lzw/b$g;", "Lzw/b$h;", "Lzw/b$i;", "Lzw/b$j;", "Lzw/b$k;", "Lzw/b$l;", "Lzw/b$m;", "Lzw/b$n;", "Lzw/b$o;", "Lzw/b$p;", "Lzw/b$q;", "Lzw/b$r;", "Lzw/b$s;", "Lzw/b$t;", "Lzw/b$u;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$a;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f444349a;

        public a(@Y61.k String str) {
            this.f444349a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f444349a, ((a) obj).f444349a);
        }

        public final int hashCode() {
            return this.f444349a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnBannerClicked(id="), this.f444349a, ')');
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$b;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zw.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12980b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f444350a;

        public C12980b(@Y61.k String str) {
            this.f444350a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12980b) && L.f(this.f444350a, ((C12980b) obj).f444350a);
        }

        public final int hashCode() {
            return this.f444350a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnBannerShown(id="), this.f444350a, ')');
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$c;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f444351a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final GetClientListResponse.PendingClientStateStatus f444352b;

        public c(@Y61.k String str, @Y61.k GetClientListResponse.PendingClientStateStatus pendingClientStateStatus) {
            this.f444351a = str;
            this.f444352b = pendingClientStateStatus;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f444351a, cVar.f444351a) && this.f444352b == cVar.f444352b;
        }

        public final int hashCode() {
            return this.f444352b.hashCode() + (this.f444351a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnClientItemClicked(clientId=" + this.f444351a + ", status=" + this.f444352b + ')';
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$d;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.developments_agency_search.adapter.checkable_item.a f444353a;

        public d(@Y61.k com.avito.android.developments_agency_search.adapter.checkable_item.a aVar) {
            this.f444353a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f444353a, ((d) obj).f444353a);
        }

        public final int hashCode() {
            return this.f444353a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnClientListFilterSelected(filter=" + this.f444353a + ')';
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/b$e;", "Lzw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f444354a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -89527943;
        }

        @Y61.k
        public final String toString() {
            return "OnClosePromoBannerButtonClicked";
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$f;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f444355a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final GetDealUpdatesResponse.UpdatedDeal f444356b;

        public f(@Y61.k String str, @Y61.k GetDealUpdatesResponse.UpdatedDeal updatedDeal) {
            this.f444355a = str;
            this.f444356b = updatedDeal;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f444355a, fVar.f444355a) && L.f(this.f444356b, fVar.f444356b);
        }

        public final int hashCode() {
            return this.f444356b.hashCode() + (this.f444355a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnDealUpdateItemClicked(clientId=" + this.f444355a + ", updatedDeal=" + this.f444356b + ')';
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/b$g;", "Lzw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f444357a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1050954589;
        }

        @Y61.k
        public final String toString() {
            return "OnDeeplinkResultReceived";
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/b$h;", "Lzw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f444358a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1124273057;
        }

        @Y61.k
        public final String toString() {
            return "OnFooterButtonClicked";
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/b$i;", "Lzw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f444359a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1866110731;
        }

        @Y61.k
        public final String toString() {
            return "OnFooterButtonShown";
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/b$j;", "Lzw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f444360a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1250805106;
        }

        @Y61.k
        public final String toString() {
            return "OnItemListRefreshActionButtonClicked";
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$k;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f444361a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final GetMortgageListRequestStatus f444362b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f444363c;

        public k(@Y61.k String str, @Y61.k GetMortgageListRequestStatus getMortgageListRequestStatus, @Y61.k DeepLink deepLink) {
            this.f444361a = str;
            this.f444362b = getMortgageListRequestStatus;
            this.f444363c = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f444361a, kVar.f444361a) && this.f444362b == kVar.f444362b && L.f(this.f444363c, kVar.f444363c);
        }

        public final int hashCode() {
            return this.f444363c.hashCode() + ((this.f444362b.hashCode() + (this.f444361a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnMortgageItemClicked(applicationId=");
            sb2.append(this.f444361a);
            sb2.append(", status=");
            sb2.append(this.f444362b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f444363c, ')');
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$l;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.developments_agency_search.adapter.checkable_item.a f444364a;

        public l(@Y61.k com.avito.android.developments_agency_search.adapter.checkable_item.a aVar) {
            this.f444364a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f444364a, ((l) obj).f444364a);
        }

        public final int hashCode() {
            return this.f444364a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnMortgageListFilterSelected(filter=" + this.f444364a + ')';
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/b$m;", "Lzw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f444365a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 592241011;
        }

        @Y61.k
        public final String toString() {
            return "OnRefreshButtonClicked";
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/b$n;", "Lzw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f444366a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -826111862;
        }

        @Y61.k
        public final String toString() {
            return "OnScreenLoaded";
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/b$o;", "Lzw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f444367a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 716038409;
        }

        @Y61.k
        public final String toString() {
            return "OnScrollAtPositionForNextPage";
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/b$p;", "Lzw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f444368a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 2135386628;
        }

        @Y61.k
        public final String toString() {
            return "OnSearchBarFilterIconClicked";
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$q;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f444369a;

        public q(@Y61.k String str) {
            this.f444369a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f444369a, ((q) obj).f444369a);
        }

        public final int hashCode() {
            return this.f444369a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSearchBarQueryUpdated(searchQuery="), this.f444369a, ')');
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$r;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f444370a;

        public r(@Y61.k String str) {
            this.f444370a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && L.f(this.f444370a, ((r) obj).f444370a);
        }

        public final int hashCode() {
            return this.f444370a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnShowPromoConditionClicked(conditionUrl="), this.f444370a, ')');
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$s;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Tab f444371a;

        public s(@Y61.k Tab tab) {
            this.f444371a = tab;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f444371a == ((s) obj).f444371a;
        }

        public final int hashCode() {
            return this.f444371a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnTabSelected(selectedTab=" + this.f444371a + ')';
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/b$t;", "Lzw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final t f444372a = new t();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 1663836414;
        }

        @Y61.k
        public final String toString() {
            return "OnToolbarBackClicked";
        }
    }

    /* compiled from: DealCabinetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/b$u;", "Lzw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ReturnToWorkResult f444373a;

        public u(@Y61.k ReturnToWorkResult returnToWorkResult) {
            this.f444373a = returnToWorkResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && L.f(this.f444373a, ((u) obj).f444373a);
        }

        public final int hashCode() {
            return this.f444373a.f137205b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReturnToWorkResultReceived(result=" + this.f444373a + ')';
        }
    }
}
