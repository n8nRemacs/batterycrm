package com.avito.android.home.bottom_navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.CalledFrom;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomNavigationOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/bottom_navigation/BottomNavigationScreenParams;", "Landroid/os/Parcelable;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomNavigationScreenParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BottomNavigationScreenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f162306b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final TabFragmentFactory.Data f162307c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final CalledFrom f162308d;

    /* compiled from: BottomNavigationOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BottomNavigationScreenParams> {
        @Override // android.os.Parcelable.Creator
        public final BottomNavigationScreenParams createFromParcel(Parcel parcel) {
            return new BottomNavigationScreenParams(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (TabFragmentFactory.Data) parcel.readParcelable(BottomNavigationScreenParams.class.getClassLoader()), (CalledFrom) parcel.readParcelable(BottomNavigationScreenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BottomNavigationScreenParams[] newArray(int i12) {
            return new BottomNavigationScreenParams[i12];
        }
    }

    public BottomNavigationScreenParams(@Y61.l Integer num, @Y61.l TabFragmentFactory.Data data, @Y61.l CalledFrom calledFrom) {
        this.f162306b = num;
        this.f162307c = data;
        this.f162308d = calledFrom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomNavigationScreenParams)) {
            return false;
        }
        BottomNavigationScreenParams bottomNavigationScreenParams = (BottomNavigationScreenParams) obj;
        return L.f(this.f162306b, bottomNavigationScreenParams.f162306b) && L.f(this.f162307c, bottomNavigationScreenParams.f162307c) && L.f(this.f162308d, bottomNavigationScreenParams.f162308d);
    }

    public final int hashCode() {
        Integer num = this.f162306b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        TabFragmentFactory.Data data = this.f162307c;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        CalledFrom calledFrom = this.f162308d;
        return iHashCode2 + (calledFrom != null ? calledFrom.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "BottomNavigationScreenParams(tabOrdinal=" + this.f162306b + ", tabData=" + this.f162307c + ", calledFrom=" + this.f162308d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.f162306b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f162307c, i12);
        parcel.writeParcelable(this.f162308d, i12);
    }
}
