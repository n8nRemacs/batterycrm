package com.google.android.gms.auth.api.proxy;

import PX0.e;
import RX0.c;
import TX0.a;
import android.app.PendingIntent;
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
public class ProxyResponse extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new e();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348714b;

    /* renamed from: c, reason: collision with root package name */
    @N
    @SafeParcelable.c
    public final PendingIntent f348715c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348716d;

    /* renamed from: e, reason: collision with root package name */
    @N
    @SafeParcelable.c
    public final byte[] f348717e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348718f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final Bundle f348719g;

    @SafeParcelable.b
    public ProxyResponse(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e PendingIntent pendingIntent, @SafeParcelable.e int i14, @SafeParcelable.e Bundle bundle, @SafeParcelable.e byte[] bArr) {
        this.f348718f = i12;
        this.f348714b = i13;
        this.f348716d = i14;
        this.f348719g = bundle;
        this.f348717e = bArr;
        this.f348715c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f348714b);
        a.i(parcel, 2, this.f348715c, i12, false);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f348716d);
        a.a(parcel, 4, this.f348719g, false);
        a.b(parcel, 5, this.f348717e, false);
        a.q(parcel, 1000, 4);
        parcel.writeInt(this.f348718f);
        a.p(parcel, iO2);
    }
}
