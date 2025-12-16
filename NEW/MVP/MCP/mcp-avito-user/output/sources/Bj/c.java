package bJ;

import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlotKt;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api2HotelByItemIdGetOfferGetResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LbJ/c;", "", "Lcom/avito/android/remote/model/text/AttributedText;", DeliverySummarySlotKt.ORIGINAL_PRICE, "percent", "LbJ/b;", "percentBackgroundColor", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;LbJ/b;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "LbJ/b;", "c", "()LbJ/b;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    @com.google.gson.annotations.c(DeliverySummarySlotKt.ORIGINAL_PRICE)
    @l
    private final AttributedText originalPrice;

    @com.google.gson.annotations.c("percent")
    @l
    private final AttributedText percent;

    @com.google.gson.annotations.c("percentBackgroundColor")
    @l
    private final b percentBackgroundColor;

    public c(@l AttributedText attributedText, @l AttributedText attributedText2, @l b bVar) {
        this.originalPrice = attributedText;
        this.percent = attributedText2;
        this.percentBackgroundColor = bVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getOriginalPrice() {
        return this.originalPrice;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getPercent() {
        return this.percent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final b getPercentBackgroundColor() {
        return this.percentBackgroundColor;
    }
}
