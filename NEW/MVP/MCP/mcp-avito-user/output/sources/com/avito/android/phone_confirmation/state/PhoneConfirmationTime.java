package com.avito.android.phone_confirmation.state;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneConfirmationTime.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/state/PhoneConfirmationTime;", "Landroid/os/Parcelable;", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PhoneConfirmationTime implements Parcelable {

    @k
    public static final Parcelable.Creator<PhoneConfirmationTime> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f215965b;

    /* renamed from: c, reason: collision with root package name */
    public final long f215966c;

    /* compiled from: PhoneConfirmationTime.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneConfirmationTime> {
        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmationTime createFromParcel(Parcel parcel) {
            return new PhoneConfirmationTime(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmationTime[] newArray(int i12) {
            return new PhoneConfirmationTime[i12];
        }
    }

    public PhoneConfirmationTime(@k String str, long j12) {
        this.f215965b = str;
        this.f215966c = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneConfirmationTime)) {
            return false;
        }
        PhoneConfirmationTime phoneConfirmationTime = (PhoneConfirmationTime) obj;
        return L.f(this.f215965b, phoneConfirmationTime.f215965b) && this.f215966c == phoneConfirmationTime.f215966c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f215966c) + (this.f215965b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneConfirmationTime(phoneNumber=");
        sb2.append(this.f215965b);
        sb2.append(", timeNextRequestAllowed=");
        return r.u(sb2, this.f215966c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f215965b);
        parcel.writeLong(this.f215966c);
    }
}
