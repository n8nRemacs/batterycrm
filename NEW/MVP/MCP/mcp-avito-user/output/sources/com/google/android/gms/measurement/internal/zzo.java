package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new H5();

    /* renamed from: A, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355561A;

    /* renamed from: B, reason: collision with root package name */
    @SafeParcelable.c
    public final int f355562B;

    /* renamed from: C, reason: collision with root package name */
    @SafeParcelable.c
    public final String f355563C;

    /* renamed from: D, reason: collision with root package name */
    @SafeParcelable.c
    public final int f355564D;

    /* renamed from: E, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355565E;

    /* renamed from: F, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355566F;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355567b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355568c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355569d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355570e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355571f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355572g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355573h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f355574i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f355575j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355576k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355577l;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    @Deprecated
    public final long f355578m;

    /* renamed from: n, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355579n;

    /* renamed from: o, reason: collision with root package name */
    @SafeParcelable.c
    public final int f355580o;

    /* renamed from: p, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f355581p;

    /* renamed from: q, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f355582q;

    /* renamed from: r, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355583r;

    /* renamed from: s, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Boolean f355584s;

    /* renamed from: t, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355585t;

    /* renamed from: u, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final List<String> f355586u;

    /* renamed from: v, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355587v;

    /* renamed from: w, reason: collision with root package name */
    @SafeParcelable.c
    public final String f355588w;

    /* renamed from: x, reason: collision with root package name */
    @SafeParcelable.c
    public final String f355589x;

    /* renamed from: y, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f355590y;

    /* renamed from: z, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f355591z;

    public zzo(@j.P String str, @j.P String str2, @j.P String str3, long j12, @j.P String str4, long j13, long j14, @j.P String str5, boolean z12, boolean z13, @j.P String str6, long j15, int i12, boolean z14, boolean z15, @j.P String str7, @j.P Boolean bool, long j16, @j.P List list, String str8, String str9, @j.P String str10, boolean z16, long j17, int i13, String str11, int i14, long j18, @j.P String str12) {
        C36729v.f(str);
        this.f355567b = str;
        this.f355568c = TextUtils.isEmpty(str2) ? null : str2;
        this.f355569d = str3;
        this.f355576k = j12;
        this.f355570e = str4;
        this.f355571f = j13;
        this.f355572g = j14;
        this.f355573h = str5;
        this.f355574i = z12;
        this.f355575j = z13;
        this.f355577l = str6;
        this.f355578m = 0L;
        this.f355579n = j15;
        this.f355580o = i12;
        this.f355581p = z14;
        this.f355582q = z15;
        this.f355583r = str7;
        this.f355584s = bool;
        this.f355585t = j16;
        this.f355586u = list;
        this.f355587v = null;
        this.f355588w = str8;
        this.f355589x = str9;
        this.f355590y = str10;
        this.f355591z = z16;
        this.f355561A = j17;
        this.f355562B = i13;
        this.f355563C = str11;
        this.f355564D = i14;
        this.f355565E = j18;
        this.f355566F = str12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 2, this.f355567b, false);
        TX0.a.j(parcel, 3, this.f355568c, false);
        TX0.a.j(parcel, 4, this.f355569d, false);
        TX0.a.j(parcel, 5, this.f355570e, false);
        TX0.a.q(parcel, 6, 8);
        parcel.writeLong(this.f355571f);
        TX0.a.q(parcel, 7, 8);
        parcel.writeLong(this.f355572g);
        TX0.a.j(parcel, 8, this.f355573h, false);
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(this.f355574i ? 1 : 0);
        TX0.a.q(parcel, 10, 4);
        parcel.writeInt(this.f355575j ? 1 : 0);
        TX0.a.q(parcel, 11, 8);
        parcel.writeLong(this.f355576k);
        TX0.a.j(parcel, 12, this.f355577l, false);
        TX0.a.q(parcel, 13, 8);
        parcel.writeLong(this.f355578m);
        TX0.a.q(parcel, 14, 8);
        parcel.writeLong(this.f355579n);
        TX0.a.q(parcel, 15, 4);
        parcel.writeInt(this.f355580o);
        TX0.a.q(parcel, 16, 4);
        parcel.writeInt(this.f355581p ? 1 : 0);
        TX0.a.q(parcel, 18, 4);
        parcel.writeInt(this.f355582q ? 1 : 0);
        TX0.a.j(parcel, 19, this.f355583r, false);
        Boolean bool = this.f355584s;
        if (bool != null) {
            TX0.a.q(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        TX0.a.q(parcel, 22, 8);
        parcel.writeLong(this.f355585t);
        TX0.a.l(this.f355586u, parcel, 23);
        TX0.a.j(parcel, 24, this.f355587v, false);
        TX0.a.j(parcel, 25, this.f355588w, false);
        TX0.a.j(parcel, 26, this.f355589x, false);
        TX0.a.j(parcel, 27, this.f355590y, false);
        TX0.a.q(parcel, 28, 4);
        parcel.writeInt(this.f355591z ? 1 : 0);
        TX0.a.q(parcel, 29, 8);
        parcel.writeLong(this.f355561A);
        TX0.a.q(parcel, 30, 4);
        parcel.writeInt(this.f355562B);
        TX0.a.j(parcel, 31, this.f355563C, false);
        TX0.a.q(parcel, 32, 4);
        parcel.writeInt(this.f355564D);
        TX0.a.q(parcel, 34, 8);
        parcel.writeLong(this.f355565E);
        TX0.a.j(parcel, 35, this.f355566F, false);
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzo(@SafeParcelable.e @j.P String str, @SafeParcelable.e @j.P String str2, @SafeParcelable.e @j.P String str3, @SafeParcelable.e @j.P String str4, @SafeParcelable.e long j12, @SafeParcelable.e long j13, @SafeParcelable.e @j.P String str5, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13, @SafeParcelable.e long j14, @SafeParcelable.e @j.P String str6, @SafeParcelable.e long j15, @SafeParcelable.e long j16, @SafeParcelable.e int i12, @SafeParcelable.e boolean z14, @SafeParcelable.e boolean z15, @SafeParcelable.e @j.P String str7, @SafeParcelable.e @j.P Boolean bool, @SafeParcelable.e long j17, @SafeParcelable.e @j.P ArrayList arrayList, @SafeParcelable.e @j.P String str8, @SafeParcelable.e String str9, @SafeParcelable.e String str10, @SafeParcelable.e String str11, @SafeParcelable.e boolean z16, @SafeParcelable.e long j18, @SafeParcelable.e int i13, @SafeParcelable.e String str12, @SafeParcelable.e int i14, @SafeParcelable.e long j19, @SafeParcelable.e @j.P String str13) {
        this.f355567b = str;
        this.f355568c = str2;
        this.f355569d = str3;
        this.f355576k = j14;
        this.f355570e = str4;
        this.f355571f = j12;
        this.f355572g = j13;
        this.f355573h = str5;
        this.f355574i = z12;
        this.f355575j = z13;
        this.f355577l = str6;
        this.f355578m = j15;
        this.f355579n = j16;
        this.f355580o = i12;
        this.f355581p = z14;
        this.f355582q = z15;
        this.f355583r = str7;
        this.f355584s = bool;
        this.f355585t = j17;
        this.f355586u = arrayList;
        this.f355587v = str8;
        this.f355588w = str9;
        this.f355589x = str10;
        this.f355590y = str11;
        this.f355591z = z16;
        this.f355561A = j18;
        this.f355562B = i13;
        this.f355563C = str12;
        this.f355564D = i14;
        this.f355565E = j19;
        this.f355566F = str13;
    }
}
