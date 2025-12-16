package YF0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBanner;
import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBannerButtonsItem;
import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkDiscountV2;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LYF0/o;", "", "a", "b", "LYF0/o$a;", "LYF0/o$b;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface o {

    /* compiled from: ApiTrxPromoConfigureV7Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LYF0/o$a;", "LYF0/o;", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements o {

        @com.google.gson.annotations.c("action")
        @Y61.k
        private final DeepLink action;

        public a(@Y61.k DeepLink deepLink) {
            this.action = deepLink;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final DeepLink getAction() {
            return this.action;
        }
    }

    /* compiled from: ApiTrxPromoConfigureV7Response.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b-\u0010\u001dR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b1\u0010\u001dR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"LYF0/o$b;", "LYF0/o;", "Lcom/avito/android/remote/model/text/AttributedText;", "agreement", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBanner;", AdFormat.BANNER, "", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBannerButtonsItem;", "buttons", "LYF0/p;", "changedState", "LYF0/c;", "commission", "LYF0/g;", "dates", "description", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkDiscountV2;", "discountV2", "extraInfo", "LYF0/m;", "navBar", "Lcom/avito/android/deep_linking/links/DeepLink;", "termsUri", "", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBanner;Ljava/util/List;LYF0/p;LYF0/c;LYF0/g;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkDiscountV2;Lcom/avito/android/remote/model/text/AttributedText;LYF0/m;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBanner;", "b", "()Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBanner;", "Ljava/util/List;", "c", "()Ljava/util/List;", "LYF0/p;", "d", "()LYF0/p;", "LYF0/c;", "e", "()LYF0/c;", "LYF0/g;", "f", "()LYF0/g;", "g", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkDiscountV2;", "h", "()Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkDiscountV2;", "i", "LYF0/m;", "j", "()LYF0/m;", "Lcom/avito/android/deep_linking/links/DeepLink;", "k", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements o {

        @com.google.gson.annotations.c("agreement")
        @Y61.l
        private final AttributedText agreement;

        @com.google.gson.annotations.c(AdFormat.BANNER)
        @Y61.l
        private final OkResponseSuccessOkBanner banner;

        @com.google.gson.annotations.c("buttons")
        @Y61.k
        private final List<OkResponseSuccessOkBannerButtonsItem> buttons;

        @com.google.gson.annotations.c("changedState")
        @Y61.l
        private final p changedState;

        @com.google.gson.annotations.c("commission")
        @Y61.k
        private final c commission;

        @com.google.gson.annotations.c("dates")
        @Y61.k
        private final g dates;

        @com.google.gson.annotations.c("description")
        @Y61.l
        private final AttributedText description;

        @com.google.gson.annotations.c("discountV2")
        @Y61.l
        private final OkResponseSuccessOkDiscountV2 discountV2;

        @com.google.gson.annotations.c("extraInfo")
        @Y61.l
        private final AttributedText extraInfo;

        @com.google.gson.annotations.c("navBar")
        @Y61.l
        private final m navBar;

        @com.google.gson.annotations.c("termsUri")
        @Y61.l
        private final DeepLink termsUri;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public b(@Y61.l AttributedText attributedText, @Y61.l OkResponseSuccessOkBanner okResponseSuccessOkBanner, @Y61.k List<OkResponseSuccessOkBannerButtonsItem> list, @Y61.l p pVar, @Y61.k c cVar, @Y61.k g gVar, @Y61.l AttributedText attributedText2, @Y61.l OkResponseSuccessOkDiscountV2 okResponseSuccessOkDiscountV2, @Y61.l AttributedText attributedText3, @Y61.l m mVar, @Y61.l DeepLink deepLink, @Y61.k String str) {
            this.agreement = attributedText;
            this.banner = okResponseSuccessOkBanner;
            this.buttons = list;
            this.changedState = pVar;
            this.commission = cVar;
            this.dates = gVar;
            this.description = attributedText2;
            this.discountV2 = okResponseSuccessOkDiscountV2;
            this.extraInfo = attributedText3;
            this.navBar = mVar;
            this.termsUri = deepLink;
            this.title = str;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final AttributedText getAgreement() {
            return this.agreement;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final OkResponseSuccessOkBanner getBanner() {
            return this.banner;
        }

        @Y61.k
        public final List<OkResponseSuccessOkBannerButtonsItem> c() {
            return this.buttons;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final p getChangedState() {
            return this.changedState;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final c getCommission() {
            return this.commission;
        }

        @Y61.k
        /* renamed from: f, reason: from getter */
        public final g getDates() {
            return this.dates;
        }

        @Y61.l
        /* renamed from: g, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final OkResponseSuccessOkDiscountV2 getDiscountV2() {
            return this.discountV2;
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final AttributedText getExtraInfo() {
            return this.extraInfo;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final m getNavBar() {
            return this.navBar;
        }

        @Y61.l
        /* renamed from: k, reason: from getter */
        public final DeepLink getTermsUri() {
            return this.termsUri;
        }

        @Y61.k
        /* renamed from: l, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }
}
