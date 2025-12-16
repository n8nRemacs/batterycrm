package com.avito.android.remote.model.category_parameters.slot.delivery_summary;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliverySummarySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliveryData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;", "fee", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FbsFeeBlock;", "fbsFee", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/SubsidyBlock;", "subsidy", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;", "overall", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FbsFeeBlock;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/SubsidyBlock;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;", "getFee", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FbsFeeBlock;", "getFbsFee", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FbsFeeBlock;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/SubsidyBlock;", "getSubsidy", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/SubsidyBlock;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;", "getOverall", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryData implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryData> CREATOR = new Creator();

    @c("fbsFee")
    @l
    private final FbsFeeBlock fbsFee;

    @c("fee")
    @l
    private final FeeBlock fee;

    @c("overall")
    @k
    private final PriceBlockV2 overall;

    @c("subsidy")
    @l
    private final SubsidyBlock subsidy;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: DeliverySummarySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryData createFromParcel(@k Parcel parcel) {
            return new DeliveryData((AttributedText) parcel.readParcelable(DeliveryData.class.getClassLoader()), parcel.readInt() == 0 ? null : FeeBlock.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FbsFeeBlock.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SubsidyBlock.CREATOR.createFromParcel(parcel) : null, PriceBlockV2.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryData[] newArray(int i12) {
            return new DeliveryData[i12];
        }
    }

    public DeliveryData(@l AttributedText attributedText, @l FeeBlock feeBlock, @l FbsFeeBlock fbsFeeBlock, @l SubsidyBlock subsidyBlock, @k PriceBlockV2 priceBlockV2) {
        this.title = attributedText;
        this.fee = feeBlock;
        this.fbsFee = fbsFeeBlock;
        this.subsidy = subsidyBlock;
        this.overall = priceBlockV2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final FbsFeeBlock getFbsFee() {
        return this.fbsFee;
    }

    @l
    public final FeeBlock getFee() {
        return this.fee;
    }

    @k
    public final PriceBlockV2 getOverall() {
        return this.overall;
    }

    @l
    public final SubsidyBlock getSubsidy() {
        return this.subsidy;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        FeeBlock feeBlock = this.fee;
        if (feeBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeBlock.writeToParcel(parcel, flags);
        }
        FbsFeeBlock fbsFeeBlock = this.fbsFee;
        if (fbsFeeBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fbsFeeBlock.writeToParcel(parcel, flags);
        }
        SubsidyBlock subsidyBlock = this.subsidy;
        if (subsidyBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subsidyBlock.writeToParcel(parcel, flags);
        }
        this.overall.writeToParcel(parcel, flags);
    }

    public /* synthetic */ DeliveryData(AttributedText attributedText, FeeBlock feeBlock, FbsFeeBlock fbsFeeBlock, SubsidyBlock subsidyBlock, PriceBlockV2 priceBlockV2, int i12, C42822w c42822w) {
        this(attributedText, feeBlock, (i12 & 4) != 0 ? null : fbsFeeBlock, subsidyBlock, priceBlockV2);
    }
}
