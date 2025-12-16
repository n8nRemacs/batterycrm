package dX;

import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.loyalty.remote.model.quality_service.GradeColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceGrayWidget.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LdX/o;", "", "a", "b", "c", "d", "e", "f", "LdX/o$a;", "LdX/o$b;", "LdX/o$e;", "LdX/o$f;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface o {

    /* compiled from: QualityServiceGrayWidget.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LdX/o$a;", "LdX/o;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements o {

        @com.google.gson.annotations.c(Constants.DEEPLINK)
        @Y61.k
        private final DeepLink deeplink;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public a(@Y61.k String str, @Y61.k DeepLink deepLink) {
            this.title = str;
            this.deeplink = deepLink;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.title, aVar.title) && L.f(this.deeplink, aVar.deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode() + (this.title.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonItem(title=");
            sb2.append(this.title);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
        }
    }

    /* compiled from: QualityServiceGrayWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LdX/o$b;", "LdX/o;", "", "LdX/o$c;", "items", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements o {

        @com.google.gson.annotations.c("items")
        @Y61.k
        private final List<c> items;

        public b(@Y61.k List<c> list) {
            this.items = list;
        }

        @Y61.k
        public final List<c> a() {
            return this.items;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.items, ((b) obj).items);
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("GradeProgress(items="), this.items, ')');
        }
    }

    /* compiled from: QualityServiceGrayWidget.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LdX/o$c;", "", "", "title", "", "greenThreshold", "value", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;", "color", "<init>", "(Ljava/lang/String;IILcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "I", "c", "()I", "e", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;", "a", "()Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        @com.google.gson.annotations.c("color")
        @Y61.k
        private final GradeColor color;

        @com.google.gson.annotations.c("description")
        @Y61.l
        private final AttributedText description;

        @com.google.gson.annotations.c("greenThreshold")
        private final int greenThreshold;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c("value")
        private final int value;

        public c(@Y61.k String str, int i12, int i13, @Y61.l AttributedText attributedText, @Y61.k GradeColor gradeColor) {
            this.title = str;
            this.greenThreshold = i12;
            this.value = i13;
            this.description = attributedText;
            this.color = gradeColor;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final GradeColor getColor() {
            return this.color;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        /* renamed from: c, reason: from getter */
        public final int getGreenThreshold() {
            return this.greenThreshold;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: e, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.title, cVar.title) && this.greenThreshold == cVar.greenThreshold && this.value == cVar.value && L.f(this.description, cVar.description) && this.color == cVar.color;
        }

        public final int hashCode() {
            int iE2 = androidx.appcompat.app.r.e(this.value, androidx.appcompat.app.r.e(this.greenThreshold, this.title.hashCode() * 31, 31), 31);
            AttributedText attributedText = this.description;
            return this.color.hashCode() + ((iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "GradeProgressItem(title=" + this.title + ", greenThreshold=" + this.greenThreshold + ", value=" + this.value + ", description=" + this.description + ", color=" + this.color + ')';
        }
    }

    /* compiled from: QualityServiceGrayWidget.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LdX/o$d;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "b", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        @com.google.gson.annotations.c("description")
        @Y61.l
        private final AttributedText description;

        @com.google.gson.annotations.c("image")
        @Y61.l
        private final UniversalImage image;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final String title;

        public d(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l UniversalImage universalImage) {
            this.title = str;
            this.description = attributedText;
            this.image = universalImage;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.title, dVar.title) && L.f(this.description, dVar.description) && L.f(this.image, dVar.image);
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.description;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            UniversalImage universalImage = this.image;
            return iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfoCardItem(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
        }
    }

    /* compiled from: QualityServiceGrayWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LdX/o$e;", "LdX/o;", "", "LdX/o$d;", "items", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements o {

        @com.google.gson.annotations.c("items")
        @Y61.k
        private final List<d> items;

        public e(@Y61.k List<d> list) {
            this.items = list;
        }

        @Y61.k
        public final List<d> a() {
            return this.items;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.items, ((e) obj).items);
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("InfoCards(items="), this.items, ')');
        }
    }

    /* compiled from: QualityServiceGrayWidget.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LdX/o$f;", "LdX/o;", "", "height", "<init>", "(I)V", "I", "a", "()I", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements o {

        @com.google.gson.annotations.c("height")
        private final int height;

        public f(int i12) {
            this.height = i12;
        }

        /* renamed from: a, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.height == ((f) obj).height;
        }

        public final int hashCode() {
            return Integer.hashCode(this.height);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("SpacerItem(height="), this.height, ')');
        }
    }
}
