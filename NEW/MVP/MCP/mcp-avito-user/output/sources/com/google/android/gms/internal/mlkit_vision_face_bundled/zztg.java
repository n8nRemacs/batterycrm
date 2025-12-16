package com.google.android.gms.internal.mlkit_vision_face_bundled;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zztg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztg> CREATOR = new zzth();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354000b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final List f354001c;

    @SafeParcelable.b
    public zztg(@SafeParcelable.e int i12, @SafeParcelable.e List list) {
        this.f354000b = i12;
        this.f354001c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f354000b);
        a.n(parcel, 2, this.f354001c, false);
        a.p(parcel, iO2);
    }
}
