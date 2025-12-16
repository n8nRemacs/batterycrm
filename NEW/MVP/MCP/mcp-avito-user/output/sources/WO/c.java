package wo;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiCheckoutV9Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lwo/c;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "Lwo/b;", "dropDownList", "", "oldPrice", "price", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "e", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("dropDownList")
    @l
    private final List<b> dropDownList;

    @com.google.gson.annotations.c("oldPrice")
    @l
    private final String oldPrice;

    @com.google.gson.annotations.c("price")
    @k
    private final AttributedText price;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public c(@l AttributedText attributedText, @l List<b> list, @l String str, @k AttributedText attributedText2, @k AttributedText attributedText3) {
        this.description = attributedText;
        this.dropDownList = list;
        this.oldPrice = str;
        this.price = attributedText2;
        this.title = attributedText3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final List<b> b() {
        return this.dropDownList;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getOldPrice() {
        return this.oldPrice;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
