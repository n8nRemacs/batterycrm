package bJ;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api2HotelByItemIdGetOfferGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"LbJ/f;", "", "LbJ/h;", "actionButton", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/Image;", "image", "price", "<init>", "(LbJ/h;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;)V", "LbJ/h;", "a", "()LbJ/h;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "d", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {

    @com.google.gson.annotations.c("actionButton")
    @k
    private final h actionButton;

    @com.google.gson.annotations.c("description")
    @k
    private final AttributedText description;

    @com.google.gson.annotations.c("image")
    @l
    private final Image image;

    @com.google.gson.annotations.c("price")
    @l
    private final AttributedText price;

    public f(@k h hVar, @k AttributedText attributedText, @l Image image, @l AttributedText attributedText2) {
        this.actionButton = hVar;
        this.description = attributedText;
        this.image = image;
        this.price = attributedText2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final h getActionButton() {
        return this.actionButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }
}
