package MZ;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationFlow.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LMZ/m;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "textContent", "Lcom/avito/android/remote/model/UniversalImage;", "topStartImage", "bottomImage", "bigBottomImage", "", "isHighlighted", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Z)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "d", "()Lcom/avito/android/remote/model/UniversalImage;", "b", "a", "Z", "e", "()Z", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class m {

    @com.google.gson.annotations.c("bigBottomImage")
    @Y61.l
    private final UniversalImage bigBottomImage;

    @com.google.gson.annotations.c("bottomImage")
    @Y61.l
    private final UniversalImage bottomImage;

    @com.google.gson.annotations.c("isHighlighted")
    private final boolean isHighlighted;

    @com.google.gson.annotations.c("textContent")
    @Y61.k
    private final AttributedText textContent;

    @com.google.gson.annotations.c("topStartImage")
    @Y61.l
    private final UniversalImage topStartImage;

    public m(@Y61.k AttributedText attributedText, @Y61.l UniversalImage universalImage, @Y61.l UniversalImage universalImage2, @Y61.l UniversalImage universalImage3, boolean z12) {
        this.textContent = attributedText;
        this.topStartImage = universalImage;
        this.bottomImage = universalImage2;
        this.bigBottomImage = universalImage3;
        this.isHighlighted = z12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final UniversalImage getBigBottomImage() {
        return this.bigBottomImage;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final UniversalImage getBottomImage() {
        return this.bottomImage;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getTextContent() {
        return this.textContent;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final UniversalImage getTopStartImage() {
        return this.topStartImage;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsHighlighted() {
        return this.isHighlighted;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.textContent, mVar.textContent) && L.f(this.topStartImage, mVar.topStartImage) && L.f(this.bottomImage, mVar.bottomImage) && L.f(this.bigBottomImage, mVar.bigBottomImage) && this.isHighlighted == mVar.isHighlighted;
    }

    public final int hashCode() {
        int iHashCode = this.textContent.hashCode() * 31;
        UniversalImage universalImage = this.topStartImage;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.bottomImage;
        int iHashCode3 = (iHashCode2 + (universalImage2 == null ? 0 : universalImage2.hashCode())) * 31;
        UniversalImage universalImage3 = this.bigBottomImage;
        return Boolean.hashCode(this.isHighlighted) + ((iHashCode3 + (universalImage3 != null ? universalImage3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepItem(textContent=");
        sb2.append(this.textContent);
        sb2.append(", topStartImage=");
        sb2.append(this.topStartImage);
        sb2.append(", bottomImage=");
        sb2.append(this.bottomImage);
        sb2.append(", bigBottomImage=");
        sb2.append(this.bigBottomImage);
        sb2.append(", isHighlighted=");
        return r.x(sb2, this.isHighlighted, ')');
    }
}
