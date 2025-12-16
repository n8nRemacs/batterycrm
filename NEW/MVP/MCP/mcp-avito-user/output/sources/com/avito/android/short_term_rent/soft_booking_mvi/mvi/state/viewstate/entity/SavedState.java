package com.avito.android.short_term_rent.soft_booking_mvi.mvi.state.viewstate.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SavedState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking_mvi/mvi/state/viewstate/entity/SavedState;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedState implements Parcelable {

    @k
    public static final Parcelable.Creator<SavedState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f282997b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f282998c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f282999d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f283000e;

    /* compiled from: SavedState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedState> {
        @Override // android.os.Parcelable.Creator
        public final SavedState createFromParcel(Parcel parcel) {
            return new SavedState(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SavedState[] newArray(int i12) {
            return new SavedState[i12];
        }
    }

    public SavedState(int i12, @l String str, @l String str2, @l String str3) {
        this.f282997b = i12;
        this.f282998c = str;
        this.f282999d = str2;
        this.f283000e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedState)) {
            return false;
        }
        SavedState savedState = (SavedState) obj;
        return this.f282997b == savedState.f282997b && L.f(this.f282998c, savedState.f282998c) && L.f(this.f282999d, savedState.f282999d) && L.f(this.f283000e, savedState.f283000e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f282997b) * 31;
        String str = this.f282998c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f282999d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f283000e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedState(guestCount=");
        sb2.append(this.f282997b);
        sb2.append(", nameValue=");
        sb2.append(this.f282998c);
        sb2.append(", phoneValue=");
        sb2.append(this.f282999d);
        sb2.append(", emailValue=");
        return C22026a.c(sb2, this.f283000e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f282997b);
        parcel.writeString(this.f282998c);
        parcel.writeString(this.f282999d);
        parcel.writeString(this.f283000e);
    }
}
