package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/early_access/remote/model/AnalyticsInfo;", "Landroid/os/Parcelable;", "", "purchase", "select", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getPurchase", "()Ljava/lang/String;", "getSelect", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AnalyticsInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<AnalyticsInfo> CREATOR = new a();

    @c("purchase")
    @l
    private final String purchase;

    @c("select")
    @l
    private final String select;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AnalyticsInfo> {
        @Override // android.os.Parcelable.Creator
        public final AnalyticsInfo createFromParcel(Parcel parcel) {
            return new AnalyticsInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AnalyticsInfo[] newArray(int i12) {
            return new AnalyticsInfo[i12];
        }
    }

    public AnalyticsInfo(@l String str, @l String str2) {
        this.purchase = str;
        this.select = str2;
    }

    @k
    public final ReEarlyAccessData.Package.AnalyticsData c() {
        return new ReEarlyAccessData.Package.AnalyticsData(this.select, this.purchase);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsInfo)) {
            return false;
        }
        AnalyticsInfo analyticsInfo = (AnalyticsInfo) obj;
        return L.f(this.purchase, analyticsInfo.purchase) && L.f(this.select, analyticsInfo.select);
    }

    public final int hashCode() {
        String str = this.purchase;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.select;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticsInfo(purchase=");
        sb2.append(this.purchase);
        sb2.append(", select=");
        return C22026a.c(sb2, this.select, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.purchase);
        parcel.writeString(this.select);
    }
}
