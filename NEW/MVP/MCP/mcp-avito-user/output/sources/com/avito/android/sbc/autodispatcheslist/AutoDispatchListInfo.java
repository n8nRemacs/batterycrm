package com.avito.android.sbc.autodispatcheslist;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoDispatchListInfo.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/AutoDispatchListInfo;", "Landroid/os/Parcelable;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoDispatchListInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoDispatchListInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f258987b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<String> f258988c;

    /* compiled from: AutoDispatchListInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoDispatchListInfo> {
        @Override // android.os.Parcelable.Creator
        public final AutoDispatchListInfo createFromParcel(Parcel parcel) {
            return new AutoDispatchListInfo(parcel.readInt() != 0, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoDispatchListInfo[] newArray(int i12) {
            return new AutoDispatchListInfo[i12];
        }
    }

    public AutoDispatchListInfo(boolean z12, @k List<String> list) {
        this.f258987b = z12;
        this.f258988c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoDispatchListInfo)) {
            return false;
        }
        AutoDispatchListInfo autoDispatchListInfo = (AutoDispatchListInfo) obj;
        return this.f258987b == autoDispatchListInfo.f258987b && L.f(this.f258988c, autoDispatchListInfo.f258988c);
    }

    public final int hashCode() {
        return this.f258988c.hashCode() + (Boolean.hashCode(this.f258987b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoDispatchListInfo(isActiveTab=");
        sb2.append(this.f258987b);
        sb2.append(", dispatchListStatuses=");
        return H.p(sb2, this.f258988c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f258987b ? 1 : 0);
        parcel.writeStringList(this.f258988c);
    }
}
