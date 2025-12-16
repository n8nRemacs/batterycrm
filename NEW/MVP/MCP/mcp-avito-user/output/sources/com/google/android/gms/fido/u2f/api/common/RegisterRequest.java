package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import j.N;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@Deprecated
/* loaded from: classes6.dex */
public class RegisterRequest extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new i();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349913b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final ProtocolVersion f349914c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final byte[] f349915d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349916e;

    @SafeParcelable.b
    public RegisterRequest(@SafeParcelable.e String str, @SafeParcelable.e String str2, @SafeParcelable.e int i12, @SafeParcelable.e byte[] bArr) {
        this.f349913b = i12;
        try {
            this.f349914c = ProtocolVersion.a(str);
            this.f349915d = bArr;
            this.f349916e = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public final boolean equals(@N Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.f349915d, registerRequest.f349915d) || this.f349914c != registerRequest.f349914c) {
            return false;
        }
        String str = registerRequest.f349916e;
        String str2 = this.f349916e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f349914c.hashCode() + ((Arrays.hashCode(this.f349915d) + 31) * 31);
        String str = this.f349916e;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349913b);
        TX0.a.j(parcel, 2, this.f349914c.f349912b, false);
        TX0.a.b(parcel, 3, this.f349915d, false);
        TX0.a.j(parcel, 4, this.f349916e, false);
        TX0.a.p(parcel, iO2);
    }
}
