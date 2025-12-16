package com.avito.android.home.bottom_navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomNavigationOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/bottom_navigation/BottomNavigationOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomNavigationOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<BottomNavigationOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f162303b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationSpace f162304c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationScreenParams f162305d;

    /* compiled from: BottomNavigationOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BottomNavigationOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final BottomNavigationOpenParams createFromParcel(Parcel parcel) {
            return new BottomNavigationOpenParams(parcel.readInt() != 0, BottomNavigationSpace.valueOf(parcel.readString()), BottomNavigationScreenParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BottomNavigationOpenParams[] newArray(int i12) {
            return new BottomNavigationOpenParams[i12];
        }
    }

    public BottomNavigationOpenParams(boolean z12, @Y61.k BottomNavigationSpace bottomNavigationSpace, @Y61.k BottomNavigationScreenParams bottomNavigationScreenParams) {
        this.f162303b = z12;
        this.f162304c = bottomNavigationSpace;
        this.f162305d = bottomNavigationScreenParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomNavigationOpenParams)) {
            return false;
        }
        BottomNavigationOpenParams bottomNavigationOpenParams = (BottomNavigationOpenParams) obj;
        return this.f162303b == bottomNavigationOpenParams.f162303b && this.f162304c == bottomNavigationOpenParams.f162304c && L.f(this.f162305d, bottomNavigationOpenParams.f162305d);
    }

    public final int hashCode() {
        return this.f162305d.hashCode() + ((this.f162304c.hashCode() + (Boolean.hashCode(this.f162303b) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "BottomNavigationOpenParams(isRootSpace=" + this.f162303b + ", bottomNavigationSpace=" + this.f162304c + ", bottomNavigationScreenParams=" + this.f162305d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f162303b ? 1 : 0);
        parcel.writeString(this.f162304c.name());
        this.f162305d.writeToParcel(parcel, i12);
    }
}
