package com.google.android.gms.common.stats;

import I41.h;
import RX0.a;
import ZX0.e;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
@a
@Deprecated
/* loaded from: classes6.dex */
public final class WakeLockEvent extends StatsEvent {

    @N
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new e();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349583b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final long f349584c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349585d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349586e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349587f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349588g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349589h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @h
    public final ArrayList f349590i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349591j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public final long f349592k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349593l;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349594m;

    /* renamed from: n, reason: collision with root package name */
    @SafeParcelable.c
    public final float f349595n;

    /* renamed from: o, reason: collision with root package name */
    @SafeParcelable.c
    public final long f349596o;

    /* renamed from: p, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349597p;

    @SafeParcelable.b
    public WakeLockEvent(@SafeParcelable.e int i12, @SafeParcelable.e long j12, @SafeParcelable.e int i13, @SafeParcelable.e String str, @SafeParcelable.e int i14, @SafeParcelable.e @h ArrayList arrayList, @SafeParcelable.e String str2, @SafeParcelable.e long j13, @SafeParcelable.e int i15, @SafeParcelable.e String str3, @SafeParcelable.e String str4, @SafeParcelable.e float f12, @SafeParcelable.e long j14, @SafeParcelable.e String str5, @SafeParcelable.e boolean z12) {
        this.f349583b = i12;
        this.f349584c = j12;
        this.f349585d = i13;
        this.f349586e = str;
        this.f349587f = str3;
        this.f349588g = str5;
        this.f349589h = i14;
        this.f349590i = arrayList;
        this.f349591j = str2;
        this.f349592k = j13;
        this.f349593l = i15;
        this.f349594m = str4;
        this.f349595n = f12;
        this.f349596o = j14;
        this.f349597p = z12;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long h() {
        return this.f349584c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349583b);
        TX0.a.q(parcel, 2, 8);
        parcel.writeLong(this.f349584c);
        TX0.a.j(parcel, 4, this.f349586e, false);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f349589h);
        TX0.a.l(this.f349590i, parcel, 6);
        TX0.a.q(parcel, 8, 8);
        parcel.writeLong(this.f349592k);
        TX0.a.j(parcel, 10, this.f349587f, false);
        TX0.a.q(parcel, 11, 4);
        parcel.writeInt(this.f349585d);
        TX0.a.j(parcel, 12, this.f349591j, false);
        TX0.a.j(parcel, 13, this.f349594m, false);
        TX0.a.q(parcel, 14, 4);
        parcel.writeInt(this.f349593l);
        TX0.a.q(parcel, 15, 4);
        parcel.writeFloat(this.f349595n);
        TX0.a.q(parcel, 16, 8);
        parcel.writeLong(this.f349596o);
        TX0.a.j(parcel, 17, this.f349588g, false);
        TX0.a.q(parcel, 18, 4);
        parcel.writeInt(this.f349597p ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.f349585d;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @N
    public final String zzc() {
        ArrayList arrayList = this.f349590i;
        String strJoin = arrayList == null ? "" : TextUtils.join(",", arrayList);
        StringBuilder sb2 = new StringBuilder("\t");
        sb2.append(this.f349586e);
        sb2.append("\t");
        sb2.append(this.f349589h);
        sb2.append("\t");
        sb2.append(strJoin);
        sb2.append("\t");
        sb2.append(this.f349593l);
        sb2.append("\t");
        String str = this.f349587f;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append("\t");
        String str2 = this.f349594m;
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append("\t");
        sb2.append(this.f349595n);
        sb2.append("\t");
        String str3 = this.f349588g;
        sb2.append(str3 != null ? str3 : "");
        sb2.append("\t");
        sb2.append(this.f349597p);
        return sb2.toString();
    }
}
