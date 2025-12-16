package com.avito.android.comfortable_deal.end_deal.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommissionInfo.kt */
@F3
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/CommissionInfo;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CommissionInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<CommissionInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f122238b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f122239c;

    /* compiled from: CommissionInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommissionInfo> {
        @Override // android.os.Parcelable.Creator
        public final CommissionInfo createFromParcel(Parcel parcel) {
            return new CommissionInfo((AttributedText) parcel.readParcelable(CommissionInfo.class.getClassLoader()), (AttributedText) parcel.readParcelable(CommissionInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CommissionInfo[] newArray(int i12) {
            return new CommissionInfo[i12];
        }
    }

    public CommissionInfo(@k AttributedText attributedText, @k AttributedText attributedText2) {
        this.f122238b = attributedText;
        this.f122239c = attributedText2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissionInfo)) {
            return false;
        }
        CommissionInfo commissionInfo = (CommissionInfo) obj;
        return L.f(this.f122238b, commissionInfo.f122238b) && L.f(this.f122239c, commissionInfo.f122239c);
    }

    public final int hashCode() {
        return this.f122239c.hashCode() + (this.f122238b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommissionInfo(title=");
        sb2.append(this.f122238b);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f122239c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f122238b, i12);
        parcel.writeParcelable(this.f122239c, i12);
    }
}
