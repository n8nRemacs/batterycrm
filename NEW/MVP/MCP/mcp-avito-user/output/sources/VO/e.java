package vo;

import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiCheckoutV8Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lvo/e;", "", "", "Lvo/f;", "dropDownList", "", "oldPrice", "Lcom/avito/android/remote/model/text/AttributedText;", "price", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    @com.google.gson.annotations.c("dropDownList")
    @Y61.l
    private final List<f> dropDownList;

    @com.google.gson.annotations.c("oldPrice")
    @Y61.l
    private final String oldPrice;

    @com.google.gson.annotations.c("price")
    @Y61.k
    private final AttributedText price;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public e(@Y61.l List<f> list, @Y61.l String str, @Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2) {
        this.dropDownList = list;
        this.oldPrice = str;
        this.price = attributedText;
        this.title = attributedText2;
    }

    @Y61.l
    public final List<f> a() {
        return this.dropDownList;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getOldPrice() {
        return this.oldPrice;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
