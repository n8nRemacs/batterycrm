package lM0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: PlanCheckoutElement.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b'\u0010\u0015¨\u0006("}, d2 = {"LlM0/b;", "LlM0/a;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "price", "oldPrice", "Lcom/avito/android/remote/model/Image;", "icon", "", "cancellable", "LlM0/d;", "prolongation", "", "priceValue", "jobBadge", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;LlM0/d;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "i", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "e", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "LlM0/d;", "h", "()LlM0/d;", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "d", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lM0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43657b implements InterfaceC43656a {

    @com.google.gson.annotations.c("cancellable")
    @l
    private final Boolean cancellable;

    @com.google.gson.annotations.c("icon")
    @k
    private final Image icon;

    @com.google.gson.annotations.c("slug")
    @k
    private final String id;

    @com.google.gson.annotations.c("jobBadge")
    @l
    private final String jobBadge;

    @com.google.gson.annotations.c("oldPrice")
    @l
    private final AttributedText oldPrice;

    @com.google.gson.annotations.c("price")
    @l
    private final String price;

    @com.google.gson.annotations.c("priceValue")
    @l
    private final Integer priceValue;

    @com.google.gson.annotations.c("prolongation")
    @l
    private final d prolongation;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public C43657b(@k String str, @k AttributedText attributedText, @l String str2, @l AttributedText attributedText2, @k Image image, @l Boolean bool, @l d dVar, @l Integer num, @l String str3) {
        this.id = str;
        this.title = attributedText;
        this.price = str2;
        this.oldPrice = attributedText2;
        this.icon = image;
        this.cancellable = bool;
        this.prolongation = dVar;
        this.priceValue = num;
        this.jobBadge = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getCancellable() {
        return this.cancellable;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getJobBadge() {
        return this.jobBadge;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getOldPrice() {
        return this.oldPrice;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Integer getPriceValue() {
        return this.priceValue;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final d getProlongation() {
        return this.prolongation;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
