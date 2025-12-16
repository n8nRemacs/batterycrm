package com.avito.android.profile_phones.confirm_phone;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneConfirmationWithCodeRequestArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/PhoneConfirmationWithCodeRequestArguments;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PhoneConfirmationWithCodeRequestArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhoneConfirmationWithCodeRequestArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f227000b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f227001c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f227002d;

    /* compiled from: PhoneConfirmationWithCodeRequestArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneConfirmationWithCodeRequestArguments> {
        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmationWithCodeRequestArguments createFromParcel(Parcel parcel) {
            return new PhoneConfirmationWithCodeRequestArguments(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmationWithCodeRequestArguments[] newArray(int i12) {
            return new PhoneConfirmationWithCodeRequestArguments[i12];
        }
    }

    public PhoneConfirmationWithCodeRequestArguments(@Y61.k String str, boolean z12, @Y61.k String str2) {
        this.f227000b = str;
        this.f227001c = z12;
        this.f227002d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneConfirmationWithCodeRequestArguments)) {
            return false;
        }
        PhoneConfirmationWithCodeRequestArguments phoneConfirmationWithCodeRequestArguments = (PhoneConfirmationWithCodeRequestArguments) obj;
        return L.f(this.f227000b, phoneConfirmationWithCodeRequestArguments.f227000b) && this.f227001c == phoneConfirmationWithCodeRequestArguments.f227001c && L.f(this.f227002d, phoneConfirmationWithCodeRequestArguments.f227002d);
    }

    public final int hashCode() {
        return this.f227002d.hashCode() + androidx.appcompat.app.r.i(this.f227000b.hashCode() * 31, 31, this.f227001c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneConfirmationWithCodeRequestArguments(phone=");
        sb2.append(this.f227000b);
        sb2.append(", needPhoneValidation=");
        sb2.append(this.f227001c);
        sb2.append(", src=");
        return C22026a.c(sb2, this.f227002d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f227000b);
        parcel.writeInt(this.f227001c ? 1 : 0);
        parcel.writeString(this.f227002d);
    }
}
