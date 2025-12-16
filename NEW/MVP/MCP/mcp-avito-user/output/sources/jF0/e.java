package JF0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LJF0/e;", "", "<init>", "()V", "a", "b", "LJF0/e$a;", "LJF0/e$b;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class e {

    /* compiled from: TrxPromoGoodsConfigureResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJF0/e$a;", "LJF0/e;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        @com.google.gson.annotations.c("action")
        @k
        private final DeepLink deeplink;

        public a(@k DeepLink deepLink) {
            super(null);
            this.deeplink = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.deeplink, ((a) obj).deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Action(deeplink="), this.deeplink, ')');
        }
    }

    /* compiled from: TrxPromoGoodsConfigureResult.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b-\u0010#R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b1\u0010#R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"LJF0/e$b;", "LJF0/e;", "LuZ/e;", "navBar", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "LJF0/f;", "singleDate", "LJF0/d;", "commission", "extraInfo", "", "Lcom/avito/android/remote/model/ButtonAction;", "buttons", "agreement", "Lcom/avito/android/deep_linking/links/DeepLink;", "termsUri", "LJF0/c;", "changedState", "LJF0/a;", "discountV2", "<init>", "(LuZ/e;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;LJF0/f;LJF0/d;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;LJF0/c;LJF0/a;)V", "LuZ/e;", "i", "()LuZ/e;", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "h", "()Lcom/avito/android/remote/model/UniversalImage;", "LJF0/f;", "j", "()LJF0/f;", "LJF0/d;", "d", "()LJF0/d;", "g", "Ljava/util/List;", "b", "()Ljava/util/List;", "a", "Lcom/avito/android/deep_linking/links/DeepLink;", "k", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LJF0/c;", "c", "()LJF0/c;", "LJF0/a;", "f", "()LJF0/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        @com.google.gson.annotations.c("agreement")
        @l
        private final AttributedText agreement;

        @com.google.gson.annotations.c("buttons")
        @k
        private final List<ButtonAction> buttons;

        @com.google.gson.annotations.c("changedState")
        @l
        private final c changedState;

        @com.google.gson.annotations.c("commission")
        @k
        private final d commission;

        @com.google.gson.annotations.c("description")
        @l
        private final AttributedText description;

        @com.google.gson.annotations.c("discountV2")
        @l
        private final JF0.a discountV2;

        @com.google.gson.annotations.c("extraInfo")
        @l
        private final AttributedText extraInfo;

        @com.google.gson.annotations.c("image")
        @l
        private final UniversalImage image;

        @com.google.gson.annotations.c("navBar")
        @k
        private final uZ.e navBar;

        @com.google.gson.annotations.c("singleDate")
        @k
        private final f singleDate;

        @com.google.gson.annotations.c("termsUri")
        @l
        private final DeepLink termsUri;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public b(@k uZ.e eVar, @k String str, @l AttributedText attributedText, @l UniversalImage universalImage, @k f fVar, @k d dVar, @l AttributedText attributedText2, @k List<ButtonAction> list, @l AttributedText attributedText3, @l DeepLink deepLink, @l c cVar, @l JF0.a aVar) {
            super(null);
            this.navBar = eVar;
            this.title = str;
            this.description = attributedText;
            this.image = universalImage;
            this.singleDate = fVar;
            this.commission = dVar;
            this.extraInfo = attributedText2;
            this.buttons = list;
            this.agreement = attributedText3;
            this.termsUri = deepLink;
            this.changedState = cVar;
            this.discountV2 = aVar;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AttributedText getAgreement() {
            return this.agreement;
        }

        @k
        public final List<ButtonAction> b() {
            return this.buttons;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final c getChangedState() {
            return this.changedState;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final d getCommission() {
            return this.commission;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.navBar, bVar.navBar) && L.f(this.title, bVar.title) && L.f(this.description, bVar.description) && L.f(this.image, bVar.image) && L.f(this.singleDate, bVar.singleDate) && L.f(this.commission, bVar.commission) && L.f(this.extraInfo, bVar.extraInfo) && L.f(this.buttons, bVar.buttons) && L.f(this.agreement, bVar.agreement) && L.f(this.termsUri, bVar.termsUri) && L.f(this.changedState, bVar.changedState) && L.f(this.discountV2, bVar.discountV2);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final JF0.a getDiscountV2() {
            return this.discountV2;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final AttributedText getExtraInfo() {
            return this.extraInfo;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        public final int hashCode() {
            int iD2 = H.d(this.navBar.hashCode() * 31, 31, this.title);
            AttributedText attributedText = this.description;
            int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            UniversalImage universalImage = this.image;
            int iHashCode2 = (this.commission.hashCode() + ((this.singleDate.hashCode() + ((iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31)) * 31)) * 31;
            AttributedText attributedText2 = this.extraInfo;
            int iE2 = H.e((iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31, this.buttons);
            AttributedText attributedText3 = this.agreement;
            int iHashCode3 = (iE2 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
            DeepLink deepLink = this.termsUri;
            int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            c cVar = this.changedState;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            JF0.a aVar = this.discountV2;
            return iHashCode5 + (aVar != null ? aVar.hashCode() : 0);
        }

        @k
        /* renamed from: i, reason: from getter */
        public final uZ.e getNavBar() {
            return this.navBar;
        }

        @k
        /* renamed from: j, reason: from getter */
        public final f getSingleDate() {
            return this.singleDate;
        }

        @l
        /* renamed from: k, reason: from getter */
        public final DeepLink getTermsUri() {
            return this.termsUri;
        }

        @k
        /* renamed from: l, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String toString() {
            return "Ok(navBar=" + this.navBar + ", title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", singleDate=" + this.singleDate + ", commission=" + this.commission + ", extraInfo=" + this.extraInfo + ", buttons=" + this.buttons + ", agreement=" + this.agreement + ", termsUri=" + this.termsUri + ", changedState=" + this.changedState + ", discountV2=" + this.discountV2 + ')';
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    private e() {
    }
}
