package com.google.android.gms.internal.mlkit_vision_face;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzos> CREATOR = new zzot();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353456b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final List f353457c;

    @SafeParcelable.b
    public zzos(@SafeParcelable.e int i12, @SafeParcelable.e List list) {
        this.f353456b = i12;
        this.f353457c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f353456b);
        a.n(parcel, 2, this.f353457c, false);
        a.p(parcel, iO2);
    }

    public final int zza() {
        return this.f353456b;
    }

    public final List zzb() {
        return this.f353457c;
    }
}
