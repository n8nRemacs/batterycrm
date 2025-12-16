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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/cpt/remote/model/CncData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/cpt/remote/model/FeeBlock;", "fee", "Lcom/avito/android/cpt/remote/model/OverallBlock;", "overall", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/cpt/remote/model/FeeBlock;Lcom/avito/android/cpt/remote/model/OverallBlock;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/cpt/remote/model/FeeBlock;", "c", "()Lcom/avito/android/cpt/remote/model/FeeBlock;", "Lcom/avito/android/cpt/remote/model/OverallBlock;", "d", "()Lcom/avito/android/cpt/remote/model/OverallBlock;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CncData implements Parcelable {

    @k
    public static final Parcelable.Creator<CncData> CREATOR = new a();

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
    public static final class a implements Parcelable.Creator<CncData> {
        @Override // android.os.Parcelable.Creator
        public final CncData createFromParcel(Parcel parcel) {
            return new CncData((AttributedText) parcel.readParcelable(CncData.class.getClassLoader()), parcel.readInt() == 0 ? null : FeeBlock.CREATOR.createFromParcel(parcel), OverallBlock.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CncData[] newArray(int i12) {
            return new CncData[i12];
        }
    }

    public CncData(@l AttributedText attributedText, @l FeeBlock feeBlock, @k OverallBlock overallBlock) {
        this.title = attributedText;
        this.fee = feeBlock;
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
    }
}
