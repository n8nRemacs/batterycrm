package z90;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001BE\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"Lz90/J;", "", "", "Lz90/K;", "actions", "Lcom/avito/android/remote/model/text/AttributedText;", "additionalInfo", "Lcom/avito/android/remote/model/Image;", "image", "", "oldPrice", "price", "title", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "f", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class J {

    @com.google.gson.annotations.c("actions")
    @Y61.l
    private final List<K> actions;

    @com.google.gson.annotations.c("additionalInfo")
    @Y61.k
    private final AttributedText additionalInfo;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final Image image;

    @com.google.gson.annotations.c("oldPrice")
    @Y61.l
    private final String oldPrice;

    @com.google.gson.annotations.c("price")
    @Y61.l
    private final String price;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public J(@Y61.l List<K> list, @Y61.k AttributedText attributedText, @Y61.l Image image, @Y61.l String str, @Y61.l String str2, @Y61.k AttributedText attributedText2) {
        this.actions = list;
        this.additionalInfo = attributedText;
        this.image = image;
        this.oldPrice = str;
        this.price = str2;
        this.title = attributedText2;
    }

    @Y61.l
    public final List<K> a() {
        return this.actions;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getAdditionalInfo() {
        return this.additionalInfo;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getOldPrice() {
        return this.oldPrice;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
