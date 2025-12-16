package com.avito.android.profile_phones.confirm_phone;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneConfirmationArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/PhoneConfirmationArguments;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PhoneConfirmationArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhoneConfirmationArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f226996b;

    /* renamed from: c, reason: collision with root package name */
    public final int f226997c;

    /* renamed from: d, reason: collision with root package name */
    public final long f226998d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f226999e;

    /* compiled from: PhoneConfirmationArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneConfirmationArguments> {
        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmationArguments createFromParcel(Parcel parcel) {
            return new PhoneConfirmationArguments(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmationArguments[] newArray(int i12) {
            return new PhoneConfirmationArguments[i12];
        }
    }

    public PhoneConfirmationArguments(@Y61.k String str, @Y61.k String str2, int i12, long j12) {
        this.f226996b = str;
        this.f226997c = i12;
        this.f226998d = j12;
        this.f226999e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneConfirmationArguments)) {
            return false;
        }
        PhoneConfirmationArguments phoneConfirmationArguments = (PhoneConfirmationArguments) obj;
        return L.f(this.f226996b, phoneConfirmationArguments.f226996b) && this.f226997c == phoneConfirmationArguments.f226997c && this.f226998d == phoneConfirmationArguments.f226998d && L.f(this.f226999e, phoneConfirmationArguments.f226999e);
    }

    public final int hashCode() {
        return this.f226999e.hashCode() + androidx.appcompat.app.r.g(androidx.appcompat.app.r.e(this.f226997c, this.f226996b.hashCode() * 31, 31), 31, this.f226998d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneConfirmationArguments(phone=");
        sb2.append(this.f226996b);
        sb2.append(", codeLength=");
        sb2.append(this.f226997c);
        sb2.append(", timeout=");
        sb2.append(this.f226998d);
        sb2.append(", src=");
        return C22026a.c(sb2, this.f226999e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f226996b);
        parcel.writeInt(this.f226997c);
        parcel.writeLong(this.f226998d);
        parcel.writeString(this.f226999e);
    }
}
