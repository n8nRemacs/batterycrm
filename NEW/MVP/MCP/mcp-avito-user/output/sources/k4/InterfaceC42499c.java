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

/* compiled from: AdvertDetailsInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lk4/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "Lk4/c$a;", "Lk4/c$b;", "Lk4/c$c;", "Lk4/c$d;", "Lk4/c$e;", "Lk4/c$f;", "Lk4/c$g;", "Lk4/c$h;", "Lk4/c$i;", "Lk4/c$j;", "Lk4/c$k;", "Lk4/c$l;", "Lk4/c$m;", "Lk4/c$n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC42499c {

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$a;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$a */
    public static final /* data */ class a implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AdvertDetailsWithMeta f406060a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AdvertDetailsStyle f406061b;

        public a(@Y61.k AdvertDetailsWithMeta advertDetailsWithMeta, @Y61.k AdvertDetailsStyle advertDetailsStyle) {
            this.f406060a = advertDetailsWithMeta;
            this.f406061b = advertDetailsStyle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f406060a, aVar.f406060a) && this.f406061b == aVar.f406061b;
        }

        public final int hashCode() {
            return this.f406061b.hashCode() + (this.f406060a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "AdvertLoaded(advertDetailsWithMeta=" + this.f406060a + ", advertDetailsStyle=" + this.f406061b + ')';
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$b;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$b */
    public static final /* data */ class b implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f406062a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<i1> f406063b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k String str, @Y61.k List<? extends i1> list) {
            this.f406062a = str;
            this.f406063b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f406062a, bVar.f406062a) && L.f(this.f406063b, bVar.f406063b);
        }

        public final int hashCode() {
            return this.f406063b.hashCode() + (this.f406062a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BlockCreated(identifier=");
            sb2.append(this.f406062a);
            sb2.append(", items=");
            return H.p(sb2, this.f406063b, ')');
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$c;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11603c implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.advert.item.creditinfo.buzzoola.a f406064a;

        public C11603c(@Y61.k com.avito.android.advert.item.creditinfo.buzzoola.a aVar) {
            this.f406064a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11603c) && L.f(this.f406064a, ((C11603c) obj).f406064a);
        }

        public final int hashCode() {
            return this.f406064a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "BuzzoolaCreditBannerLoaded(creditBanner=" + this.f406064a + ')';
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk4/c$d;", "Lk4/c;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$d */
    public static final /* data */ class d implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f406065a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 945092565;
        }

        @Y61.k
        public final String toString() {
            return "ClearBlocks";
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$e;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$e */
    public static final /* data */ class e implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AdvertDetailsPpRecallPromoItem f406066a;

        public e(@Y61.k AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem) {
            this.f406066a = advertDetailsPpRecallPromoItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f406066a, ((e) obj).f406066a);
        }

        public final int hashCode() {
            return this.f406066a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ClosePpRecallPromoItem(ppRecallPromoItem=" + this.f406066a + ')';
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$f;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$f */
    public static final /* data */ class f implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExpandItemsButtonItem f406067a;

        public f(@Y61.k ExpandItemsButtonItem expandItemsButtonItem) {
            this.f406067a = expandItemsButtonItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f406067a, ((f) obj).f406067a);
        }

        public final int hashCode() {
            return this.f406067a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ExpandButtonClicked(button=" + this.f406067a + ')';
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$g;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$g */
    public static final /* data */ class g implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f406068a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f406069b;

        public g(@Y61.k String str, boolean z12) {
            this.f406068a = str;
            this.f406069b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f406068a, gVar.f406068a) && this.f406069b == gVar.f406069b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f406069b) + (this.f406068a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FavoriteStatusChanged(itemId=");
            sb2.append(this.f406068a);
            sb2.append(", isFavorite=");
            return r.x(sb2, this.f406069b, ')');
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$h;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$h */
    public static final /* data */ class h implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        public final int f406070a;

        /* renamed from: b, reason: collision with root package name */
        public final long f406071b;

        public h(int i12, long j12) {
            this.f406070a = i12;
            this.f406071b = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f406070a == hVar.f406070a && this.f406071b == hVar.f406071b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f406071b) + (Integer.hashCode(this.f406070a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PageSelected(page=");
            sb2.append(this.f406070a);
            sb2.append(", stateId=");
            return r.u(sb2, this.f406071b, ')');
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$i;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$i */
    public static final /* data */ class i implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.deeplink_handler.handler.bundle.a f406072a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f406073b;

        public i(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
            this.f406072a = aVar;
            this.f406073b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f406072a, iVar.f406072a) && this.f406073b == iVar.f406073b;
        }

        public final int hashCode() {
            com.avito.android.deeplink_handler.handler.bundle.a aVar = this.f406072a;
            return Boolean.hashCode(this.f406073b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PpRecallPromoSetLoading(deeplinkBundle=");
            sb2.append(this.f406072a);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f406073b, ')');
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$j;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$j */
    public static final /* data */ class j implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RealtyQuizBannerItem f406074a;

        public j(@Y61.k RealtyQuizBannerItem realtyQuizBannerItem) {
            this.f406074a = realtyQuizBannerItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f406074a, ((j) obj).f406074a);
        }

        public final int hashCode() {
            return this.f406074a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "RemoveRealtyQuizItem(quizItem=" + this.f406074a + ')';
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$k;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$k */
    public static final /* data */ class k implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PersistableSpannedItem f406075a;

        public k(@Y61.k PersistableSpannedItem persistableSpannedItem) {
            this.f406075a = persistableSpannedItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f406075a, ((k) obj).f406075a);
        }

        public final int hashCode() {
            return this.f406075a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateItem(item=" + this.f406075a + ')';
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$l;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$l */
    public static final /* data */ class l implements InterfaceC42499c {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            ((l) obj).getClass();
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

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$m;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$m */
    public static final /* data */ class m implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<TrustFactorsComponent> f406076a;

        /* JADX WARN: Multi-variable type inference failed */
        public m(@Y61.k List<? extends TrustFactorsComponent> list) {
            this.f406076a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f406076a, ((m) obj).f406076a);
        }

        public final int hashCode() {
            return this.f406076a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("UpdateSafeDealComponent(components="), this.f406076a, ')');
        }
    }

    /* compiled from: AdvertDetailsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/c$n;", "Lk4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.c$n */
    public static final /* data */ class n implements InterfaceC42499c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f406077a;

        public n(@Y61.k DeepLink deepLink) {
            this.f406077a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f406077a, ((n) obj).f406077a);
        }

        public final int hashCode() {
            return this.f406077a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("UpdateVideoCallRequestItemToMessenger(deeplink="), this.f406077a, ')');
        }
    }
}
