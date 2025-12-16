package KC0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CptConfigureLandingResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LKC0/d;", "", "<init>", "()V", "a", "b", "LKC0/d$a;", "LKC0/d$b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class d {

    /* compiled from: CptConfigureLandingResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LKC0/d$a;", "LKC0/d;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        @com.google.gson.annotations.c("action")
        @Y61.k
        private final DeepLink deeplink;

        public a(@Y61.k DeepLink deepLink) {
            super(null);
            this.deeplink = deepLink;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.deeplink, ((a) obj).deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Action(deeplink="), this.deeplink, ')');
        }
    }

    /* compiled from: CptConfigureLandingResult.kt */
    @P
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LKC0/d$b;", "LKC0/d;", "", "title", "", "LKC0/g;", "features", "termsTitle", "LKC0/h;", "termsItems", "Lcom/avito/android/remote/model/ButtonAction;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "legalInfo", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "e", "d", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        @com.google.gson.annotations.c("button")
        @Y61.k
        private final ButtonAction button;

        @com.google.gson.annotations.c("features")
        @Y61.k
        private final List<g> features;

        @com.google.gson.annotations.c("legalInfo")
        @Y61.l
        private final AttributedText legalInfo;

        @com.google.gson.annotations.c("termsItems")
        @Y61.k
        private final List<h> termsItems;

        @com.google.gson.annotations.c("termsTitle")
        @Y61.k
        private final String termsTitle;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public b(@Y61.k String str, @Y61.k List<g> list, @Y61.k String str2, @Y61.k List<h> list2, @Y61.k ButtonAction buttonAction, @Y61.l AttributedText attributedText) {
            super(null);
            this.title = str;
            this.features = list;
            this.termsTitle = str2;
            this.termsItems = list2;
            this.button = buttonAction;
            this.legalInfo = attributedText;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final ButtonAction getButton() {
            return this.button;
        }

        @Y61.k
        public final List<g> b() {
            return this.features;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final AttributedText getLegalInfo() {
            return this.legalInfo;
        }

        @Y61.k
        public final List<h> d() {
            return this.termsItems;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getTermsTitle() {
            return this.termsTitle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.title, bVar.title) && L.f(this.features, bVar.features) && L.f(this.termsTitle, bVar.termsTitle) && L.f(this.termsItems, bVar.termsItems) && L.f(this.button, bVar.button) && L.f(this.legalInfo, bVar.legalInfo);
        }

        @Y61.k
        /* renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = (this.button.hashCode() + H.e(H.d(H.e(this.title.hashCode() * 31, 31, this.features), 31, this.termsTitle), 31, this.termsItems)) * 31;
            AttributedText attributedText = this.legalInfo;
            return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Ok(title=");
            sb2.append(this.title);
            sb2.append(", features=");
            sb2.append(this.features);
            sb2.append(", termsTitle=");
            sb2.append(this.termsTitle);
            sb2.append(", termsItems=");
            sb2.append(this.termsItems);
            sb2.append(", button=");
            sb2.append(this.button);
            sb2.append(", legalInfo=");
            return com.avito.android.actions_sheet.a.w(sb2, this.legalInfo, ')');
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    private d() {
    }
}
