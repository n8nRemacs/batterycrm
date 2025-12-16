package com.avito.android.mortgage.sign.model;

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

/* compiled from: SignArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/model/SignArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SignArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SignArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f203729b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f203730c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f203731d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f203732e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f203733f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f203734g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f203735h;

    /* compiled from: SignArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SignArguments> {
        @Override // android.os.Parcelable.Creator
        public final SignArguments createFromParcel(Parcel parcel) {
            return new SignArguments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SignArguments[] newArray(int i12) {
            return new SignArguments[i12];
        }
    }

    public SignArguments(@k String str, @k String str2, @k String str3, @k String str4, @l String str5, @l String str6, @l String str7) {
        this.f203729b = str;
        this.f203730c = str2;
        this.f203731d = str3;
        this.f203732e = str4;
        this.f203733f = str5;
        this.f203734g = str6;
        this.f203735h = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignArguments)) {
            return false;
        }
        SignArguments signArguments = (SignArguments) obj;
        return L.f(this.f203729b, signArguments.f203729b) && L.f(this.f203730c, signArguments.f203730c) && L.f(this.f203731d, signArguments.f203731d) && L.f(this.f203732e, signArguments.f203732e) && L.f(this.f203733f, signArguments.f203733f) && L.f(this.f203734g, signArguments.f203734g) && L.f(this.f203735h, signArguments.f203735h);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f203729b.hashCode() * 31, 31, this.f203730c), 31, this.f203731d), 31, this.f203732e);
        String str = this.f203733f;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f203734g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f203735h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SignArguments(name=");
        sb2.append(this.f203729b);
        sb2.append(", packageId=");
        sb2.append(this.f203730c);
        sb2.append(", documentId=");
        sb2.append(this.f203731d);
        sb2.append(", applicantId=");
        sb2.append(this.f203732e);
        sb2.append(", applicantType=");
        sb2.append(this.f203733f);
        sb2.append(", applicationId=");
        sb2.append(this.f203734g);
        sb2.append(", error=");
        return C22026a.c(sb2, this.f203735h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f203729b);
        parcel.writeString(this.f203730c);
        parcel.writeString(this.f203731d);
        parcel.writeString(this.f203732e);
        parcel.writeString(this.f203733f);
        parcel.writeString(this.f203734g);
        parcel.writeString(this.f203735h);
    }
}
