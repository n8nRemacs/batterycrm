package dX;

import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceFeatureCard.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LdX/l;", "", "", "id", "hint", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", BeduinCartItemModel.DISABLED_STRING, "LdX/j;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/Boolean;LdX/j;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "g", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "f", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "LdX/j;", "a", "()LdX/j;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class l {

    @com.google.gson.annotations.c("content")
    @Y61.l
    private final j content;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c(BeduinCartItemModel.DISABLED_STRING)
    @Y61.l
    private final Boolean disabled;

    @com.google.gson.annotations.c("hint")
    @Y61.l
    private final String hint;

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final String id;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final UniversalImage image;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public l(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l AttributedText attributedText, @Y61.l UniversalImage universalImage, @Y61.l Boolean bool, @Y61.l j jVar) {
        this.id = str;
        this.hint = str2;
        this.title = str3;
        this.description = attributedText;
        this.image = universalImage;
        this.disabled = bool;
        this.content = jVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final j getContent() {
        return this.content;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.id, lVar.id) && L.f(this.hint, lVar.hint) && L.f(this.title, lVar.title) && L.f(this.description, lVar.description) && L.f(this.image, lVar.image) && L.f(this.disabled, lVar.disabled) && L.f(this.content, lVar.content);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hint;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.description;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Boolean bool = this.disabled;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        j jVar = this.content;
        return iHashCode6 + (jVar != null ? jVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "QualityServiceFeatureCard(id=" + this.id + ", hint=" + this.hint + ", title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", disabled=" + this.disabled + ", content=" + this.content + ')';
    }
}
