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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/avito/android/cpt/remote/model/DbsData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/cpt/remote/model/FeeBlock;", "fee", "Lcom/avito/android/cpt/remote/model/OverallBlock;", "overall", "additionalInfo", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/cpt/remote/model/FeeBlock;Lcom/avito/android/cpt/remote/model/OverallBlock;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/cpt/remote/model/FeeBlock;", "d", "()Lcom/avito/android/cpt/remote/model/FeeBlock;", "Lcom/avito/android/cpt/remote/model/OverallBlock;", "e", "()Lcom/avito/android/cpt/remote/model/OverallBlock;", "c", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DbsData implements Parcelable {

    @k
    public static final Parcelable.Creator<DbsData> CREATOR = new a();

    @c("additionalInfo")
    @l
    private final AttributedText additionalInfo;

    @c("fee")
    @l
    private final FeeBlock fee;

    @c("overall")
    @k
    private final OverallBlock overall;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: ActivationEstimateResponseV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DbsData> {
        @Override // android.os.Parcelable.Creator
        public final DbsData createFromParcel(Parcel parcel) {
            return new DbsData((AttributedText) parcel.readParcelable(DbsData.class.getClassLoader()), parcel.readInt() == 0 ? null : FeeBlock.CREATOR.createFromParcel(parcel), OverallBlock.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(DbsData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DbsData[] newArray(int i12) {
            return new DbsData[i12];
        }
    }

    public DbsData(@l AttributedText attributedText, @l FeeBlock feeBlock, @k OverallBlock overallBlock, @l AttributedText attributedText2) {
        this.title = attributedText;
        this.fee = feeBlock;
        this.overall = overallBlock;
        this.additionalInfo = attributedText2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getAdditionalInfo() {
        return this.additionalInfo;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final FeeBlock getFee() {
        return this.fee;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final OverallBlock getOverall() {
        return this.overall;
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
        this.overall.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.additionalInfo, i12);
    }
}
