package com.google.android.gms.auth.api.proxy;

import PX0.d;
import RX0.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@c
@SafeParcelable.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public class ProxyRequest extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new d();

    /* renamed from: b, reason: collision with root package name */
    @N
    @SafeParcelable.c
    public final String f348708b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348709c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final long f348710d;

    /* renamed from: e, reason: collision with root package name */
    @N
    @SafeParcelable.c
    public final byte[] f348711e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348712f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final Bundle f348713g;

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    @c
    @InterfaceC36733z
    public static class a {
    }

    @SafeParcelable.b
    public ProxyRequest(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e int i13, @SafeParcelable.e long j12, @SafeParcelable.e byte[] bArr, @SafeParcelable.e Bundle bundle) {
        this.f348712f = i12;
        this.f348708b = str;
        this.f348709c = i13;
        this.f348710d = j12;
        this.f348711e = bArr;
        this.f348713g = bundle;
    }

    @N
    public final String toString() {
        return "ProxyRequest[ url: " + this.f348708b + ", method: " + this.f348709c + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f348708b, false);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f348709c);
        TX0.a.q(parcel, 3, 8);
        parcel.writeLong(this.f348710d);
        TX0.a.b(parcel, 4, this.f348711e, false);
        TX0.a.a(parcel, 5, this.f348713g, false);
        TX0.a.q(parcel, 1000, 4);
        parcel.writeInt(this.f348712f);
        TX0.a.p(parcel, iO2);
    }
}
