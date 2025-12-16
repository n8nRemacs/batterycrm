package com.google.android.gms.common.server;

import RX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@a
/* loaded from: classes6.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {

    @N
    @a
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new WX0.a();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349545b;

    /* renamed from: c, reason: collision with root package name */
    @N
    @SafeParcelable.c
    public final String f349546c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349547d;

    @SafeParcelable.b
    public FavaDiagnosticsEntity(@SafeParcelable.e int i12, @SafeParcelable.e @N String str, @SafeParcelable.e int i13) {
        this.f349545b = i12;
        this.f349546c = str;
        this.f349547d = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349545b);
        TX0.a.j(parcel, 2, this.f349546c, false);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349547d);
        TX0.a.p(parcel, iO2);
    }
}
