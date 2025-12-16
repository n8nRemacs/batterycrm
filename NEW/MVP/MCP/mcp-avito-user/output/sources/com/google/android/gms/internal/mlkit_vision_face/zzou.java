package com.google.android.gms.internal.mlkit_vision_face;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new zzov();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353458b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353459c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353460d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353461e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f353462f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final float f353463g;

    @SafeParcelable.b
    public zzou(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e int i15, @SafeParcelable.e boolean z12, @SafeParcelable.e float f12) {
        this.f353458b = i12;
        this.f353459c = i13;
        this.f353460d = i14;
        this.f353461e = i15;
        this.f353462f = z12;
        this.f353463g = f12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f353458b);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f353459c);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f353460d);
        a.q(parcel, 4, 4);
        parcel.writeInt(this.f353461e);
        a.q(parcel, 5, 4);
        parcel.writeInt(this.f353462f ? 1 : 0);
        a.q(parcel, 6, 4);
        parcel.writeFloat(this.f353463g);
        a.p(parcel, iO2);
    }
}
