package com.google.android.gms.internal.mlkit_vision_face;

import TX0.a;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzpc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpc> CREATOR = new zzpd();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353475b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final PointF f353476c;

    @SafeParcelable.b
    public zzpc(@SafeParcelable.e int i12, @SafeParcelable.e PointF pointF) {
        this.f353475b = i12;
        this.f353476c = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f353475b);
        a.i(parcel, 2, this.f353476c, i12, false);
        a.p(parcel, iO2);
    }

    public final int zza() {
        return this.f353475b;
    }

    public final PointF zzb() {
        return this.f353476c;
    }
}
