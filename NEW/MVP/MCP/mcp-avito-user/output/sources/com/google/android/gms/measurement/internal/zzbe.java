package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new C();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f355534b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final zzaz f355535c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final String f355536d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355537e;

    public zzbe(zzbe zzbeVar, long j12) {
        C36729v.j(zzbeVar);
        this.f355534b = zzbeVar.f355534b;
        this.f355535c = zzbeVar.f355535c;
        this.f355536d = zzbeVar.f355536d;
        this.f355537e = j12;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f355535c);
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(this.f355536d);
        sb2.append(",name=");
        return androidx.camera.camera2.internal.G.g(sb2, this.f355534b, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 2, this.f355534b, false);
        TX0.a.i(parcel, 3, this.f355535c, i12, false);
        TX0.a.j(parcel, 4, this.f355536d, false);
        TX0.a.q(parcel, 5, 8);
        parcel.writeLong(this.f355537e);
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzbe(@SafeParcelable.e String str, @SafeParcelable.e zzaz zzazVar, @SafeParcelable.e String str2, @SafeParcelable.e long j12) {
        this.f355534b = str;
        this.f355535c = zzazVar;
        this.f355536d = str2;
        this.f355537e = j12;
    }
}
