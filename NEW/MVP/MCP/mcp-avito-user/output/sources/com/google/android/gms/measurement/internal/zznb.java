package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zznb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznb> CREATOR = new L5();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f355554b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f355555c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355556d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Long f355557e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355558f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final String f355559g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Double f355560h;

    /* JADX WARN: Illegal instructions before constructor call */
    public zznb(K5 k52) {
        String str = k52.f354767c;
        this(k52.f354768d, k52.f354769e, str, k52.f354766b);
    }

    @j.P
    public final Object h() {
        Long l12 = this.f355557e;
        if (l12 != null) {
            return l12;
        }
        Double d12 = this.f355560h;
        if (d12 != null) {
            return d12;
        }
        String str = this.f355558f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f355554b);
        TX0.a.j(parcel, 2, this.f355555c, false);
        TX0.a.q(parcel, 3, 8);
        parcel.writeLong(this.f355556d);
        TX0.a.h(parcel, 4, this.f355557e);
        TX0.a.j(parcel, 6, this.f355558f, false);
        TX0.a.j(parcel, 7, this.f355559g, false);
        TX0.a.c(parcel, 8, this.f355560h);
        TX0.a.p(parcel, iO2);
    }

    public zznb(long j12, @j.P Object obj, String str, String str2) {
        C36729v.f(str);
        this.f355554b = 2;
        this.f355555c = str;
        this.f355556d = j12;
        this.f355559g = str2;
        if (obj == null) {
            this.f355557e = null;
            this.f355560h = null;
            this.f355558f = null;
            return;
        }
        if (obj instanceof Long) {
            this.f355557e = (Long) obj;
            this.f355560h = null;
            this.f355558f = null;
        } else if (obj instanceof String) {
            this.f355557e = null;
            this.f355560h = null;
            this.f355558f = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f355557e = null;
            this.f355560h = (Double) obj;
            this.f355558f = null;
        }
    }

    @SafeParcelable.b
    public zznb(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e long j12, @SafeParcelable.e @j.P Long l12, @SafeParcelable.e Float f12, @SafeParcelable.e @j.P String str2, @SafeParcelable.e String str3, @SafeParcelable.e @j.P Double d12) {
        this.f355554b = i12;
        this.f355555c = str;
        this.f355556d = j12;
        this.f355557e = l12;
        if (i12 == 1) {
            this.f355560h = f12 != null ? Double.valueOf(f12.doubleValue()) : null;
        } else {
            this.f355560h = d12;
        }
        this.f355558f = str2;
        this.f355559g = str3;
    }
}
