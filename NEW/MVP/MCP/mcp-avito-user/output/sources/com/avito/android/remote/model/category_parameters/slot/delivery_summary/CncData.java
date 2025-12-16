package com.avito.android.remote.model.category_parameters.slot.delivery_summary;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DeliverySummarySlotConfig.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/CncData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;", "fee", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;", "overall", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;", "getFee", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;", "getOverall", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CncData implements Parcelable {

    @k
    public static final Parcelable.Creator<CncData> CREATOR = new Creator();

    @c("fee")
    @l
    private final FeeBlock fee;

    @c("overall")
    @l
    private final PriceBlockV2 overall;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: DeliverySummarySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CncData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CncData createFromParcel(@k Parcel parcel) {
            return new CncData((AttributedText) parcel.readParcelable(CncData.class.getClassLoader()), parcel.readInt() == 0 ? null : FeeBlock.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PriceBlockV2.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CncData[] newArray(int i12) {
            return new CncData[i12];
        }
    }

    public CncData(@l AttributedText attributedText, @l FeeBlock feeBlock, @l PriceBlockV2 priceBlockV2) {
        this.title = attributedText;
        this.fee = feeBlock;
        this.overall = priceBlockV2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final FeeBlock getFee() {
        return this.fee;
    }

    @l
    public final PriceBlockV2 getOverall() {
        return this.overall;
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
        PriceBlockV2 priceBlockV2 = this.overall;
        if (priceBlockV2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceBlockV2.writeToParcel(parcel, flags);
        }
    }
}
