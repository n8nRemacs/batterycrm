package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new C36866e();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public String f355521b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public String f355522c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public zznb f355523d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public long f355524e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f355525f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public String f355526g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzbe f355527h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public long f355528i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public zzbe f355529j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355530k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzbe f355531l;

    public zzae(zzae zzaeVar) {
        C36729v.j(zzaeVar);
        this.f355521b = zzaeVar.f355521b;
        this.f355522c = zzaeVar.f355522c;
        this.f355523d = zzaeVar.f355523d;
        this.f355524e = zzaeVar.f355524e;
        this.f355525f = zzaeVar.f355525f;
        this.f355526g = zzaeVar.f355526g;
        this.f355527h = zzaeVar.f355527h;
        this.f355528i = zzaeVar.f355528i;
        this.f355529j = zzaeVar.f355529j;
        this.f355530k = zzaeVar.f355530k;
        this.f355531l = zzaeVar.f355531l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 2, this.f355521b, false);
        TX0.a.j(parcel, 3, this.f355522c, false);
        TX0.a.i(parcel, 4, this.f355523d, i12, false);
        long j12 = this.f355524e;
        TX0.a.q(parcel, 5, 8);
        parcel.writeLong(j12);
        boolean z12 = this.f355525f;
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(z12 ? 1 : 0);
        TX0.a.j(parcel, 7, this.f355526g, false);
        TX0.a.i(parcel, 8, this.f355527h, i12, false);
        long j13 = this.f355528i;
        TX0.a.q(parcel, 9, 8);
        parcel.writeLong(j13);
        TX0.a.i(parcel, 10, this.f355529j, i12, false);
        TX0.a.q(parcel, 11, 8);
        parcel.writeLong(this.f355530k);
        TX0.a.i(parcel, 12, this.f355531l, i12, false);
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzae(@SafeParcelable.e @j.P String str, @SafeParcelable.e String str2, @SafeParcelable.e zznb zznbVar, @SafeParcelable.e long j12, @SafeParcelable.e boolean z12, @SafeParcelable.e @j.P String str3, @SafeParcelable.e @j.P zzbe zzbeVar, @SafeParcelable.e long j13, @SafeParcelable.e @j.P zzbe zzbeVar2, @SafeParcelable.e long j14, @SafeParcelable.e @j.P zzbe zzbeVar3) {
        this.f355521b = str;
        this.f355522c = str2;
        this.f355523d = zznbVar;
        this.f355524e = j12;
        this.f355525f = z12;
        this.f355526g = str3;
        this.f355527h = zzbeVar;
        this.f355528i = j13;
        this.f355529j = zzbeVar2;
        this.f355530k = j14;
        this.f355531l = zzbeVar3;
    }
}
