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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DbsData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;", "fee", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;", "overall", "additionalInfo", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;Lcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;", "getFee", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/FeeBlock;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;", "getOverall", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/PriceBlockV2;", "getAdditionalInfo", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DbsData implements Parcelable {

    @k
    public static final Parcelable.Creator<DbsData> CREATOR = new Creator();

    @c("additionalInfo")
    @l
    private final AttributedText additionalInfo;

    @c("fee")
    @l
    private final FeeBlock fee;

    @c("overall")
    @k
    private final PriceBlockV2 overall;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: DeliverySummarySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DbsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DbsData createFromParcel(@k Parcel parcel) {
            return new DbsData((AttributedText) parcel.readParcelable(DbsData.class.getClassLoader()), parcel.readInt() == 0 ? null : FeeBlock.CREATOR.createFromParcel(parcel), PriceBlockV2.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(DbsData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DbsData[] newArray(int i12) {
            return new DbsData[i12];
        }
    }

    public DbsData(@l AttributedText attributedText, @l FeeBlock feeBlock, @k PriceBlockV2 priceBlockV2, @l AttributedText attributedText2) {
        this.title = attributedText;
        this.fee = feeBlock;
        this.overall = priceBlockV2;
        this.additionalInfo = attributedText2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AttributedText getAdditionalInfo() {
        return this.additionalInfo;
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
        this.overall.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.additionalInfo, flags);
    }
}
