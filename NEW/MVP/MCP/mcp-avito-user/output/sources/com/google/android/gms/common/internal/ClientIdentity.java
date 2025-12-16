package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@RX0.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @j.N
    @RX0.a
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new F();

    /* renamed from: b, reason: collision with root package name */
    @RX0.a
    @SafeParcelable.c
    public final int f349304b;

    /* renamed from: c, reason: collision with root package name */
    @RX0.a
    @SafeParcelable.c
    @j.P
    public final String f349305c;

    @SafeParcelable.b
    public ClientIdentity(@SafeParcelable.e int i12, @SafeParcelable.e @j.P String str) {
        this.f349304b = i12;
        this.f349305c = str;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f349304b == this.f349304b && C36727t.a(clientIdentity.f349305c, this.f349305c);
    }

    public final int hashCode() {
        return this.f349304b;
    }

    @j.N
    public final String toString() {
        return this.f349304b + ":" + this.f349305c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349304b);
        TX0.a.j(parcel, 2, this.f349305c, false);
        TX0.a.p(parcel, iO2);
    }
}
