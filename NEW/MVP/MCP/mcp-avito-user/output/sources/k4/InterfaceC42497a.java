package k4;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.realty_quiz_banner.RealtyQuizBannerItem;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lk4/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "Lk4/a$a;", "Lk4/a$b;", "Lk4/a$c;", "Lk4/a$d;", "Lk4/a$e;", "Lk4/a$f;", "Lk4/a$g;", "Lk4/a$h;", "Lk4/a$i;", "Lk4/a$j;", "Lk4/a$k;", "Lk4/a$l;", "Lk4/a$m;", "Lk4/a$n;", "Lk4/a$o;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC42497a {

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$a;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11602a implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AdvertDetailsWithMeta f406038a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AdvertDetailsStyle f406039b;

        public C11602a(@Y61.k AdvertDetailsWithMeta advertDetailsWithMeta, @Y61.k AdvertDetailsStyle advertDetailsStyle) {
            this.f406038a = advertDetailsWithMeta;
            this.f406039b = advertDetailsStyle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11602a)) {
                return false;
            }
            C11602a c11602a = (C11602a) obj;
            return L.f(this.f406038a, c11602a.f406038a) && this.f406039b == c11602a.f406039b;
        }

        public final int hashCode() {
            return this.f406039b.hashCode() + (this.f406038a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "AdvertLoaded(advertDetailsWithMeta=" + this.f406038a + ", advertDetailsStyle=" + this.f406039b + ')';
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$b;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$b */
    public static final /* data */ class b implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f406040a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<i1> f406041b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k String str, @Y61.k List<? extends i1> list) {
            this.f406040a = str;
            this.f406041b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f406040a, bVar.f406040a) && L.f(this.f406041b, bVar.f406041b);
        }

        public final int hashCode() {
            return this.f406041b.hashCode() + (this.f406040a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BlockCreated(identifier=");
            sb2.append(this.f406040a);
            sb2.append(", items=");
            return H.p(sb2, this.f406041b, ')');
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$c;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$c */
    public static final /* data */ class c implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.advert.item.creditinfo.buzzoola.a f406042a;

        public c(@Y61.k com.avito.android.advert.item.creditinfo.buzzoola.a aVar) {
            this.f406042a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f406042a, ((c) obj).f406042a);
        }

        public final int hashCode() {
            return this.f406042a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "BuzzoolaCreditBannerLoaded(creditBanner=" + this.f406042a + ')';
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$d;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$d */
    public static final /* data */ class d implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExpandItemsButtonItem f406043a;

        public d(@Y61.k ExpandItemsButtonItem expandItemsButtonItem) {
            this.f406043a = expandItemsButtonItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f406043a, ((d) obj).f406043a);
        }

        public final int hashCode() {
            return this.f406043a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ExpandButtonClicked(button=" + this.f406043a + ')';
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$e;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$e */
    public static final /* data */ class e implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f406044a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f406045b;

        public e(@Y61.k String str, boolean z12) {
            this.f406044a = str;
            this.f406045b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f406044a, eVar.f406044a) && this.f406045b == eVar.f406045b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f406045b) + (this.f406044a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FavoriteButtonClicked(itemId=");
            sb2.append(this.f406044a);
            sb2.append(", isFavorite=");
            return r.x(sb2, this.f406045b, ')');
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$f;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$f */
    public static final /* data */ class f implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PersistableSpannedItem f406046a;

        public f(@Y61.k PersistableSpannedItem persistableSpannedItem) {
            this.f406046a = persistableSpannedItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f406046a, ((f) obj).f406046a);
        }

        public final int hashCode() {
            return this.f406046a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ItemChanged(item=" + this.f406046a + ')';
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$g;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$g */
    public static final /* data */ class g implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        public final int f406047a;

        /* renamed from: b, reason: collision with root package name */
        public final long f406048b;

        public g(int i12, long j12) {
            this.f406047a = i12;
            this.f406048b = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f406047a == gVar.f406047a && this.f406048b == gVar.f406048b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f406048b) + (Integer.hashCode(this.f406047a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PageSelected(page=");
            sb2.append(this.f406047a);
            sb2.append(", stateId=");
            return r.u(sb2, this.f406048b, ')');
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$h;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$h */
    public static final /* data */ class h implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AdvertDetailsPpRecallPromoItem f406049a;

        public h(@Y61.k AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem) {
            this.f406049a = advertDetailsPpRecallPromoItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f406049a, ((h) obj).f406049a);
        }

        public final int hashCode() {
            return this.f406049a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PpRecallPromoBannerCloseClicked(item=" + this.f406049a + ')';
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$i;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$i */
    public static final /* data */ class i implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.deeplink_handler.handler.bundle.a f406050a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f406051b;

        public i(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
            this.f406050a = aVar;
            this.f406051b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f406050a, iVar.f406050a) && this.f406051b == iVar.f406051b;
        }

        public final int hashCode() {
            com.avito.android.deeplink_handler.handler.bundle.a aVar = this.f406050a;
            return Boolean.hashCode(this.f406051b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PpRecallPromoBannerSetLoading(deeplinkBundle=");
            sb2.append(this.f406050a);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f406051b, ')');
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$j;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$j */
    public static final /* data */ class j implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RealtyQuizBannerItem f406052a;

        public j(@Y61.k RealtyQuizBannerItem realtyQuizBannerItem) {
            this.f406052a = realtyQuizBannerItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f406052a, ((j) obj).f406052a);
        }

        public final int hashCode() {
            return this.f406052a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "RealtyQuizBannerCloseClicked(item=" + this.f406052a + ')';
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk4/a$k;", "Lk4/a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$k */
    public static final /* data */ class k implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f406053a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 63534828;
        }

        @Y61.k
        public final String toString() {
            return "RefreshScreen";
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$l;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$l */
    public static final /* data */ class l implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f406054a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<i1> f406055b;

        /* JADX WARN: Multi-variable type inference failed */
        public l(@Y61.k String str, @Y61.k List<? extends i1> list) {
            this.f406054a = str;
            this.f406055b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f406054a, lVar.f406054a) && L.f(this.f406055b, lVar.f406055b);
        }

        public final int hashCode() {
            return this.f406055b.hashCode() + (this.f406054a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReplaceBlock(identifier=");
            sb2.append(this.f406054a);
            sb2.append(", items=");
            return H.p(sb2, this.f406055b, ')');
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$m;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$m */
    public static final /* data */ class m implements InterfaceC42497a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            ((m) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "UpdateSafeDealCombinedButtonsComponent(data=null)";
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$n;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$n */
    public static final /* data */ class n implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<TrustFactorsComponent> f406056a;

        /* JADX WARN: Multi-variable type inference failed */
        public n(@Y61.k List<? extends TrustFactorsComponent> list) {
            this.f406056a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f406056a, ((n) obj).f406056a);
        }

        public final int hashCode() {
            return this.f406056a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("UpdateSafeDealComponent(components="), this.f406056a, ')');
        }
    }

    /* compiled from: AdvertDetailsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/a$o;", "Lk4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.a$o */
    public static final /* data */ class o implements InterfaceC42497a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f406057a;

        public o(@Y61.k DeepLink deepLink) {
            this.f406057a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f406057a, ((o) obj).f406057a);
        }

        public final int hashCode() {
            return this.f406057a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("UpdateVideoCallRequestItemToMessenger(deeplink="), this.f406057a, ')');
        }
    }
}
