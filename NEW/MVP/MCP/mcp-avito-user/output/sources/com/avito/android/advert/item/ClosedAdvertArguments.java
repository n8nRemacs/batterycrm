package com.avito.android.advert.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import kotlin.Metadata;

/* compiled from: ClosedAdvertArguments.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ClosedAdvertArguments;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ClosedAdvertArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ClosedAdvertArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f71602b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final BottomNavigationSpace f71603c;

    /* compiled from: ClosedAdvertArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClosedAdvertArguments> {
        @Override // android.os.Parcelable.Creator
        public final ClosedAdvertArguments createFromParcel(Parcel parcel) {
            return new ClosedAdvertArguments(parcel.readString(), parcel.readInt() == 0 ? null : BottomNavigationSpace.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClosedAdvertArguments[] newArray(int i12) {
            return new ClosedAdvertArguments[i12];
        }
    }

    public ClosedAdvertArguments(@Y61.l String str, @Y61.l BottomNavigationSpace bottomNavigationSpace) {
        this.f71602b = str;
        this.f71603c = bottomNavigationSpace;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosedAdvertArguments)) {
            return false;
        }
        ClosedAdvertArguments closedAdvertArguments = (ClosedAdvertArguments) obj;
        return kotlin.jvm.internal.L.f(this.f71602b, closedAdvertArguments.f71602b) && this.f71603c == closedAdvertArguments.f71603c;
    }

    public final int hashCode() {
        String str = this.f71602b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BottomNavigationSpace bottomNavigationSpace = this.f71603c;
        return iHashCode + (bottomNavigationSpace != null ? bottomNavigationSpace.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ClosedAdvertArguments(subtitle=" + this.f71602b + ", bottomNavigationSpace=" + this.f71603c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f71602b);
        BottomNavigationSpace bottomNavigationSpace = this.f71603c;
        if (bottomNavigationSpace == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bottomNavigationSpace.name());
        }
    }
}
