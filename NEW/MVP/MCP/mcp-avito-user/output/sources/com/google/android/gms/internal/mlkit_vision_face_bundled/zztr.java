package com.google.android.gms.internal.mlkit_vision_face_bundled;

import TX0.a;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zztr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztr> CREATOR = new zzts();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354019b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final PointF f354020c;

    @SafeParcelable.b
    public zztr(@SafeParcelable.e int i12, @SafeParcelable.e PointF pointF) {
        this.f354019b = i12;
        this.f354020c = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f354019b);
        a.i(parcel, 2, this.f354020c, i12, false);
        a.p(parcel, iO2);
    }
}
