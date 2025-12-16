package com.avito.android.mortgage_invite.client_search.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageClient.kt */
@F3
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/model/MortgageClientFullName;", "Landroid/os/Parcelable;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageClientFullName implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageClientFullName> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f205400b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f205401c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f205402d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f205403e;

    /* compiled from: MortgageClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageClientFullName> {
        @Override // android.os.Parcelable.Creator
        public final MortgageClientFullName createFromParcel(Parcel parcel) {
            return new MortgageClientFullName(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageClientFullName[] newArray(int i12) {
            return new MortgageClientFullName[i12];
        }
    }

    public MortgageClientFullName(@k String str, @k String str2, @k String str3, @k String str4) {
        this.f205400b = str;
        this.f205401c = str2;
        this.f205402d = str3;
        this.f205403e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageClientFullName)) {
            return false;
        }
        MortgageClientFullName mortgageClientFullName = (MortgageClientFullName) obj;
        return L.f(this.f205400b, mortgageClientFullName.f205400b) && L.f(this.f205401c, mortgageClientFullName.f205401c) && L.f(this.f205402d, mortgageClientFullName.f205402d) && L.f(this.f205403e, mortgageClientFullName.f205403e);
    }

    public final int hashCode() {
        return this.f205403e.hashCode() + H.d(H.d(this.f205400b.hashCode() * 31, 31, this.f205401c), 31, this.f205402d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageClientFullName(firstName=");
        sb2.append(this.f205400b);
        sb2.append(", middleName=");
        sb2.append(this.f205401c);
        sb2.append(", lastName=");
        sb2.append(this.f205402d);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f205403e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f205400b);
        parcel.writeString(this.f205401c);
        parcel.writeString(this.f205402d);
        parcel.writeString(this.f205403e);
    }
}
