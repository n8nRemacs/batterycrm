package JF0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDiscountV2.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000fB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJF0/a;", "", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "backgroundGradient", "", "LJF0/a$a;", "values", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/remote/model/UniversalImage;", "b", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c("backgroundGradient")
    @k
    private final String backgroundGradient;

    @com.google.gson.annotations.c("image")
    @k
    private final UniversalImage image;

    @com.google.gson.annotations.c("values")
    @k
    private final List<C0518a> values;

    /* compiled from: TrxPromoDiscountV2.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LJF0/a$a;", "", "", "commission", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/deep_linking/links/DeepLink;", "detailsUri", "<init>", "(ILcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)V", "I", "a", "()I", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: JF0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0518a {

        @com.google.gson.annotations.c("commission")
        private final int commission;

        @com.google.gson.annotations.c("description")
        @l
        private final AttributedText description;

        @com.google.gson.annotations.c("detailsUri")
        @k
        private final DeepLink detailsUri;

        @com.google.gson.annotations.c("title")
        @l
        private final AttributedText title;

        public C0518a(int i12, @l AttributedText attributedText, @l AttributedText attributedText2, @k DeepLink deepLink) {
            this.commission = i12;
            this.title = attributedText;
            this.description = attributedText2;
            this.detailsUri = deepLink;
        }

        /* renamed from: a, reason: from getter */
        public final int getCommission() {
            return this.commission;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final DeepLink getDetailsUri() {
            return this.detailsUri;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0518a)) {
                return false;
            }
            C0518a c0518a = (C0518a) obj;
            return this.commission == c0518a.commission && L.f(this.title, c0518a.title) && L.f(this.description, c0518a.description) && L.f(this.detailsUri, c0518a.detailsUri);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.commission) * 31;
            AttributedText attributedText = this.title;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.description;
            return this.detailsUri.hashCode() + ((iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Value(commission=");
            sb2.append(this.commission);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", detailsUri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.detailsUri, ')');
        }
    }

    public a(@k UniversalImage universalImage, @k String str, @k List<C0518a> list) {
        this.image = universalImage;
        this.backgroundGradient = str;
        this.values = list;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final List<C0518a> c() {
        return this.values;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.image, aVar.image) && L.f(this.backgroundGradient, aVar.backgroundGradient) && L.f(this.values, aVar.values);
    }

    public final int hashCode() {
        return this.values.hashCode() + H.d(this.image.hashCode() * 31, 31, this.backgroundGradient);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoDiscountV2(image=");
        sb2.append(this.image);
        sb2.append(", backgroundGradient=");
        sb2.append(this.backgroundGradient);
        sb2.append(", values=");
        return H.p(sb2, this.values, ')');
    }
}
