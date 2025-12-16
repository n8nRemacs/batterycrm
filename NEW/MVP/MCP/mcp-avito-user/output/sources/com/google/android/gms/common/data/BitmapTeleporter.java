package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@RX0.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @N
    @RX0.a
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new m();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349267b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public ParcelFileDescriptor f349268c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349269d;

    @SafeParcelable.b
    public BitmapTeleporter(@SafeParcelable.e int i12, @SafeParcelable.e ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.e int i13) {
        this.f349267b = i12;
        this.f349268c = parcelFileDescriptor;
        this.f349269d = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        if (this.f349268c == null) {
            C36729v.j(null);
            throw null;
        }
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349267b);
        TX0.a.i(parcel, 2, this.f349268c, i12 | 1, false);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349269d);
        TX0.a.p(parcel, iO2);
        this.f349268c = null;
    }
}
