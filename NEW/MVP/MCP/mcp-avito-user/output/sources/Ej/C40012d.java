package eJ;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3HotelByItemIdSearchOffersGetResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LeJ/d;", "", "LeJ/e;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "details", "LeJ/h;", "discount", "LeJ/k;", AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR, "price", "", "", "rentConditions", "<init>", "(LeJ/e;Lcom/avito/android/remote/model/text/AttributedText;LeJ/h;LeJ/k;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "LeJ/e;", "a", "()LeJ/e;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "LeJ/h;", "c", "()LeJ/h;", "LeJ/k;", "d", "()LeJ/k;", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eJ.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40012d {

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final C40013e button;

    @com.google.gson.annotations.c("details")
    @Y61.l
    private final AttributedText details;

    @com.google.gson.annotations.c("discount")
    @Y61.l
    private final h discount;

    @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR)
    @Y61.l
    private final k installments;

    @com.google.gson.annotations.c("price")
    @Y61.k
    private final AttributedText price;

    @com.google.gson.annotations.c("rentConditions")
    @Y61.l
    private final List<String> rentConditions;

    public C40012d(@Y61.k C40013e c40013e, @Y61.l AttributedText attributedText, @Y61.l h hVar, @Y61.l k kVar, @Y61.k AttributedText attributedText2, @Y61.l List<String> list) {
        this.button = c40013e;
        this.details = attributedText;
        this.discount = hVar;
        this.installments = kVar;
        this.price = attributedText2;
        this.rentConditions = list;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C40013e getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDetails() {
        return this.details;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final h getDiscount() {
        return this.discount;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final k getInstallments() {
        return this.installments;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    @Y61.l
    public final List<String> f() {
        return this.rentConditions;
    }
}
