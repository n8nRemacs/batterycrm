package com.avito.android.vas_planning;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlanningFragmentArgument.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/VasPlanningFragmentArgument;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VasPlanningFragmentArgument implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VasPlanningFragmentArgument> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f322195b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f322196c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f322197d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f322198e;

    /* compiled from: VasPlanningFragmentArgument.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPlanningFragmentArgument> {
        @Override // android.os.Parcelable.Creator
        public final VasPlanningFragmentArgument createFromParcel(Parcel parcel) {
            return new VasPlanningFragmentArgument(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VasPlanningFragmentArgument[] newArray(int i12) {
            return new VasPlanningFragmentArgument[i12];
        }
    }

    public VasPlanningFragmentArgument(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
        this.f322195b = str;
        this.f322196c = str2;
        this.f322197d = str3;
        this.f322198e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasPlanningFragmentArgument)) {
            return false;
        }
        VasPlanningFragmentArgument vasPlanningFragmentArgument = (VasPlanningFragmentArgument) obj;
        return L.f(this.f322195b, vasPlanningFragmentArgument.f322195b) && L.f(this.f322196c, vasPlanningFragmentArgument.f322196c) && L.f(this.f322197d, vasPlanningFragmentArgument.f322197d) && this.f322198e == vasPlanningFragmentArgument.f322198e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322198e) + H.d(H.d(this.f322195b.hashCode() * 31, 31, this.f322196c), 31, this.f322197d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasPlanningFragmentArgument(itemId=");
        sb2.append(this.f322195b);
        sb2.append(", checkoutContext=");
        sb2.append(this.f322196c);
        sb2.append(", currentFlow=");
        sb2.append(this.f322197d);
        sb2.append(", closable=");
        return androidx.appcompat.app.r.x(sb2, this.f322198e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f322195b);
        parcel.writeString(this.f322196c);
        parcel.writeString(this.f322197d);
        parcel.writeInt(this.f322198e ? 1 : 0);
    }
}
