package KZ;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApplicationStatusItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LKZ/F;", "LKZ/p;", "", "id", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class F implements InterfaceC14286p {

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final Image image;

    @com.google.gson.annotations.c("subtitle")
    @Y61.k
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public F(@Y61.k String str, @Y61.k Image image, @Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2) {
        this.id = str;
        this.image = image;
        this.title = attributedText;
        this.subtitle = attributedText2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f12 = (F) obj;
        return kotlin.jvm.internal.L.f(this.id, f12.id) && kotlin.jvm.internal.L.f(this.image, f12.image) && kotlin.jvm.internal.L.f(this.title, f12.title) && kotlin.jvm.internal.L.f(this.subtitle, f12.subtitle);
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.g(this.image, this.id.hashCode() * 31, 31), 31, this.title);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationStatusItemValue(id=");
        sb2.append(this.id);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        return com.avito.android.actions_sheet.a.w(sb2, this.subtitle, ')');
    }
}
