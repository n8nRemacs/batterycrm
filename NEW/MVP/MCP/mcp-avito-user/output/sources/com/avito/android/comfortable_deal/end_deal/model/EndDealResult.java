package com.avito.android.comfortable_deal.end_deal.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EndDealResult.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealResult;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EndDealResult implements Parcelable {

    @k
    public static final Parcelable.Creator<EndDealResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final StagesTransitionResultStrategy f122277b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final EndDealSavedState f122278c;

    /* compiled from: EndDealResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EndDealResult> {
        @Override // android.os.Parcelable.Creator
        public final EndDealResult createFromParcel(Parcel parcel) {
            return new EndDealResult(StagesTransitionResultStrategy.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EndDealSavedState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EndDealResult[] newArray(int i12) {
            return new EndDealResult[i12];
        }
    }

    public EndDealResult(@k StagesTransitionResultStrategy stagesTransitionResultStrategy, @l EndDealSavedState endDealSavedState) {
        this.f122277b = stagesTransitionResultStrategy;
        this.f122278c = endDealSavedState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndDealResult)) {
            return false;
        }
        EndDealResult endDealResult = (EndDealResult) obj;
        return this.f122277b == endDealResult.f122277b && L.f(this.f122278c, endDealResult.f122278c);
    }

    public final int hashCode() {
        int iHashCode = this.f122277b.hashCode() * 31;
        EndDealSavedState endDealSavedState = this.f122278c;
        return iHashCode + (endDealSavedState == null ? 0 : endDealSavedState.hashCode());
    }

    @k
    public final String toString() {
        return "EndDealResult(strategy=" + this.f122277b + ", state=" + this.f122278c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f122277b.writeToParcel(parcel, i12);
        EndDealSavedState endDealSavedState = this.f122278c;
        if (endDealSavedState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            endDealSavedState.writeToParcel(parcel, i12);
        }
    }
}
