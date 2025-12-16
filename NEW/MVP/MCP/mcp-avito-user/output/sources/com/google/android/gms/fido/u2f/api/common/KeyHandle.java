package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.appcompat.app.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@Deprecated
/* loaded from: classes6.dex */
public class KeyHandle extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<KeyHandle> CREATOR = new g();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349906b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final byte[] f349907c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final ProtocolVersion f349908d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final ArrayList f349909e;

    @SafeParcelable.b
    public KeyHandle(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e @P ArrayList arrayList, @SafeParcelable.e byte[] bArr) {
        this.f349906b = i12;
        this.f349907c = bArr;
        try {
            this.f349908d = ProtocolVersion.a(str);
            this.f349909e = arrayList;
        } catch (ProtocolVersion.UnsupportedProtocolException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public final boolean equals(@N Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.f349907c, keyHandle.f349907c) || !this.f349908d.equals(keyHandle.f349908d)) {
            return false;
        }
        ArrayList arrayList = this.f349909e;
        ArrayList arrayList2 = keyHandle.f349909e;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f349907c)), this.f349908d, this.f349909e});
    }

    @N
    public final String toString() {
        ArrayList arrayList = this.f349909e;
        String string = arrayList == null ? "null" : arrayList.toString();
        byte[] bArr = this.f349907c;
        StringBuilder sbA = r.A("{keyHandle: ", bArr == null ? null : Base64.encodeToString(bArr, 0), ", version: ");
        sbA.append(this.f349908d);
        sbA.append(", transports: ");
        sbA.append(string);
        sbA.append("}");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349906b);
        TX0.a.b(parcel, 2, this.f349907c, false);
        TX0.a.j(parcel, 3, this.f349908d.f349912b, false);
        TX0.a.n(parcel, 4, this.f349909e, false);
        TX0.a.p(parcel, iO2);
    }
}
