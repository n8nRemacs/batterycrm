package com.google.android.gms.internal.mlkit_vision_barcode;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzob extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzob> CREATOR = new zzoa();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352224b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String[] f352225c;

    @SafeParcelable.b
    public zzob(@SafeParcelable.e int i12, @SafeParcelable.e String[] strArr) {
        this.f352224b = i12;
        this.f352225c = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f352224b);
        a.k(parcel, 2, this.f352225c, false);
        a.p(parcel, iO2);
    }

    public final int zza() {
        return this.f352224b;
    }

    public final String[] zzb() {
        return this.f352225c;
    }
}
