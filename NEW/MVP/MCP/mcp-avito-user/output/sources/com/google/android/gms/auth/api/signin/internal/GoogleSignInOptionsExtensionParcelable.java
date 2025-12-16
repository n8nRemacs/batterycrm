package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348766b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348767c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final Bundle f348768d;

    @SafeParcelable.b
    public GoogleSignInOptionsExtensionParcelable(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e Bundle bundle) {
        this.f348766b = i12;
        this.f348767c = i13;
        this.f348768d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348766b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f348767c);
        TX0.a.a(parcel, 3, this.f348768d, false);
        TX0.a.p(parcel, iO2);
    }
}
