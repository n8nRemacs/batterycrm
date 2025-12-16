package ml0;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateV4Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lml0/m;", "", "Lml0/n;", "badge", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "disableSubsidyIfFeeIsNotIncluded", "", "feeAfterIncluding", "Lcom/avito/android/remote/model/Image;", "image", "itemPriceWithFee", "<init>", "(Lml0/n;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;JLcom/avito/android/remote/model/Image;J)V", "Lml0/n;", "a", "()Lml0/n;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "J", "d", "()J", "Lcom/avito/android/remote/model/Image;", "e", "()Lcom/avito/android/remote/model/Image;", "f", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m {

    @com.google.gson.annotations.c("badge")
    @Y61.l
    private final n badge;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("disableSubsidyIfFeeIsNotIncluded")
    @Y61.l
    private final Boolean disableSubsidyIfFeeIsNotIncluded;

    @com.google.gson.annotations.c("feeAfterIncluding")
    private final long feeAfterIncluding;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final Image image;

    @com.google.gson.annotations.c("itemPriceWithFee")
    private final long itemPriceWithFee;

    public m(@Y61.l n nVar, @Y61.k AttributedText attributedText, @Y61.l Boolean bool, long j12, @Y61.l Image image, long j13) {
        this.badge = nVar;
        this.description = attributedText;
        this.disableSubsidyIfFeeIsNotIncluded = bool;
        this.feeAfterIncluding = j12;
        this.image = image;
        this.itemPriceWithFee = j13;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final n getBadge() {
        return this.badge;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Boolean getDisableSubsidyIfFeeIsNotIncluded() {
        return this.disableSubsidyIfFeeIsNotIncluded;
    }

    /* renamed from: d, reason: from getter */
    public final long getFeeAfterIncluding() {
        return this.feeAfterIncluding;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: f, reason: from getter */
    public final long getItemPriceWithFee() {
        return this.itemPriceWithFee;
    }
}
