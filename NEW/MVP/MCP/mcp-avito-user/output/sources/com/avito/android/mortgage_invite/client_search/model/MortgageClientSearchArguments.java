package com.avito.android.mortgage_invite.client_search.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageClientSearchArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/model/MortgageClientSearchArguments;", "Landroid/os/Parcelable;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageClientSearchArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageClientSearchArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f205404b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f205405c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f205406d;

    /* compiled from: MortgageClientSearchArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageClientSearchArguments> {
        @Override // android.os.Parcelable.Creator
        public final MortgageClientSearchArguments createFromParcel(Parcel parcel) {
            return new MortgageClientSearchArguments(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageClientSearchArguments[] newArray(int i12) {
            return new MortgageClientSearchArguments[i12];
        }
    }

    public MortgageClientSearchArguments(@k String str, @k String str2, @k String str3) {
        this.f205404b = str;
        this.f205405c = str2;
        this.f205406d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageClientSearchArguments)) {
            return false;
        }
        MortgageClientSearchArguments mortgageClientSearchArguments = (MortgageClientSearchArguments) obj;
        return L.f(this.f205404b, mortgageClientSearchArguments.f205404b) && L.f(this.f205405c, mortgageClientSearchArguments.f205405c) && L.f(this.f205406d, mortgageClientSearchArguments.f205406d);
    }

    public final int hashCode() {
        return this.f205406d.hashCode() + H.d(this.f205404b.hashCode() * 31, 31, this.f205405c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageClientSearchArguments(query=");
        sb2.append(this.f205404b);
        sb2.append(", screenTitle=");
        sb2.append(this.f205405c);
        sb2.append(", fieldPlaceholder=");
        return C22026a.c(sb2, this.f205406d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f205404b);
        parcel.writeString(this.f205405c);
        parcel.writeString(this.f205406d);
    }
}
