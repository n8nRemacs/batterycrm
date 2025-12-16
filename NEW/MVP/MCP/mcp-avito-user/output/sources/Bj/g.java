package bJ;

import Y61.l;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2HotelByItemIdGetOfferGetResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b \u0010\u0012¨\u0006!"}, d2 = {"LbJ/g;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "details", "LbJ/c;", "discount", "", "Lcom/avito/android/remote/model/Image;", "images", "LbJ/d;", AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR, "previewImage", "price", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;LbJ/c;Ljava/util/List;LbJ/d;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "LbJ/c;", "c", "()LbJ/c;", "Ljava/util/List;", "d", "()Ljava/util/List;", "LbJ/d;", "e", "()LbJ/d;", "Lcom/avito/android/remote/model/Image;", "f", "()Lcom/avito/android/remote/model/Image;", "g", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g {

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("details")
    @l
    private final AttributedText details;

    @com.google.gson.annotations.c("discount")
    @l
    private final c discount;

    @com.google.gson.annotations.c("images")
    @l
    private final List<Image> images;

    @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR)
    @l
    private final d installments;

    @com.google.gson.annotations.c("previewImage")
    @l
    private final Image previewImage;

    @com.google.gson.annotations.c("price")
    @l
    private final AttributedText price;

    public g(@l AttributedText attributedText, @l AttributedText attributedText2, @l c cVar, @l List<Image> list, @l d dVar, @l Image image, @l AttributedText attributedText3) {
        this.description = attributedText;
        this.details = attributedText2;
        this.discount = cVar;
        this.images = list;
        this.installments = dVar;
        this.previewImage = image;
        this.price = attributedText3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDetails() {
        return this.details;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final c getDiscount() {
        return this.discount;
    }

    @l
    public final List<Image> d() {
        return this.images;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final d getInstallments() {
        return this.installments;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Image getPreviewImage() {
        return this.previewImage;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }
}
