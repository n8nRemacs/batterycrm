package KC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptConfigureLandingResult.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKC0/g;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "Lcom/avito/android/remote/model/UniversalImage;", "a", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class g {

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final UniversalImage image;

    @com.google.gson.annotations.c("subtitle")
    @Y61.k
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public g(@Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @Y61.k UniversalImage universalImage) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.image = universalImage;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.title, gVar.title) && L.f(this.subtitle, gVar.subtitle) && L.f(this.image, gVar.image);
    }

    public final int hashCode() {
        return this.image.hashCode() + com.avito.android.actions_sheet.a.b(this.title.hashCode() * 31, 31, this.subtitle);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptLandingFeature(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
    }
}
