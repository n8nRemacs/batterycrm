package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC36733z;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@RX0.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public enum UserVerificationRequirement implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");


    @j.N
    public static final Parcelable.Creator<UserVerificationRequirement> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.C
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return UserVerificationRequirement.a(parcel.readString());
            } catch (zzbc e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i12) {
            return new UserVerificationRequirement[i12];
        }
    };

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f349849b;

    UserVerificationRequirement(@j.N String str) {
        this.f349849b = str;
    }

    @j.N
    @RX0.a
    public static UserVerificationRequirement a(@j.N String str) throws zzbc {
        for (UserVerificationRequirement userVerificationRequirement : values()) {
            if (str.equals(userVerificationRequirement.f349849b)) {
                return userVerificationRequirement;
            }
        }
        throw new zzbc(AK.c.k("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @j.N
    public final String toString() {
        return this.f349849b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        parcel.writeString(this.f349849b);
    }
}
