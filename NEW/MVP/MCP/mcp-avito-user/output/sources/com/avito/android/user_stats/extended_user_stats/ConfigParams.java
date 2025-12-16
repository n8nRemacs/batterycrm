package com.avito.android.user_stats.extended_user_stats;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedUserStatsViewModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ConfigParams;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ConfigParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ConfigParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f317006b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ArrayList f317007c;

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConfigParams> {
        @Override // android.os.Parcelable.Creator
        public final ConfigParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(MetricParams.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ConfigParams(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ConfigParams[] newArray(int i12) {
            return new ConfigParams[i12];
        }
    }

    public ConfigParams(@Y61.l String str, @Y61.l ArrayList arrayList) {
        this.f317006b = str;
        this.f317007c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigParams)) {
            return false;
        }
        ConfigParams configParams = (ConfigParams) obj;
        return L.f(this.f317006b, configParams.f317006b) && L.f(this.f317007c, configParams.f317007c);
    }

    public final int hashCode() {
        String str = this.f317006b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList arrayList = this.f317007c;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigParams(platformDynamicsABGroup=");
        sb2.append(this.f317006b);
        sb2.append(", metrics=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f317007c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f317006b);
        ArrayList arrayList = this.f317007c;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            ((MetricParams) itY.next()).writeToParcel(parcel, i12);
        }
    }
}
