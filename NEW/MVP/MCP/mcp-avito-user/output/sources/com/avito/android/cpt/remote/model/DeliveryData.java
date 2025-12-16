package com.avito.android.cpt.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ActivationEstimateResponseV2.kt */
@d
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/cpt/remote/model/DeliveryData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/cpt/remote/model/FeeBlock;", "fee", "Lcom/avito/android/cpt/remote/model/SubsidyBlock;", "subsidy", "Lcom/avito/android/cpt/remote/model/OverallBlock;", "overall", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/cpt/remote/model/FeeBlock;Lcom/avito/android/cpt/remote/model/SubsidyBlock;Lcom/avito/android/cpt/remote/model/OverallBlock;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/cpt/remote/model/FeeBlock;", "c", "()Lcom/avito/android/cpt/remote/model/FeeBlock;", "Lcom/avito/android/cpt/remote/model/SubsidyBlock;", "e", "()Lcom/avito/android/cpt/remote/model/SubsidyBlock;", "Lcom/avito/android/cpt/remote/model/OverallBlock;", "d", "()Lcom/avito/android/cpt/remote/model/OverallBlock;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryData implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryData> CREATOR = new a();

    @c("fee")
    @l
    private final FeeBlock fee;

    @c("overall")
    @k
    private final OverallBlock overall;

    @c("subsidy")
    @l
    private final SubsidyBlock subsidy;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: ActivationEstimateResponseV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryData> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryData createFromParcel(Parcel parcel) {
            return new DeliveryData((AttributedText) parcel.readParcelable(DeliveryData.class.getClassLoader()), parcel.readInt() == 0 ? null : FeeBlock.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SubsidyBlock.CREATOR.createFromParcel(parcel) : null, OverallBlock.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryData[] newArray(int i12) {
            return new DeliveryData[i12];
        }
    }

    public DeliveryData(@l AttributedText attributedText, @l FeeBlock feeBlock, @l SubsidyBlock subsidyBlock, @k OverallBlock overallBlock) {
        this.title = attributedText;
        this.fee = feeBlock;
        this.subsidy = subsidyBlock;
        this.overall = overallBlock;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final FeeBlock getFee() {
        return this.fee;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final OverallBlock getOverall() {
        return this.overall;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final SubsidyBlock getSubsidy() {
        return this.subsidy;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        FeeBlock feeBlock = this.fee;
        if (feeBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeBlock.writeToParcel(parcel, i12);
        }
        SubsidyBlock subsidyBlock = this.subsidy;
        if (subsidyBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subsidyBlock.writeToParcel(parcel, i12);
        }
        this.overall.writeToParcel(parcel, i12);
    }
}
