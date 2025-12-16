package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37012z {

    /* renamed from: a, reason: collision with root package name */
    public final String f355499a;

    /* renamed from: b, reason: collision with root package name */
    public final String f355500b;

    /* renamed from: c, reason: collision with root package name */
    public final long f355501c;

    /* renamed from: d, reason: collision with root package name */
    public final long f355502d;

    /* renamed from: e, reason: collision with root package name */
    public final long f355503e;

    /* renamed from: f, reason: collision with root package name */
    public final long f355504f;

    /* renamed from: g, reason: collision with root package name */
    public final long f355505g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f355506h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f355507i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f355508j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f355509k;

    public C37012z(String str, String str2, long j12) {
        this(str, str2, 0L, 0L, 0L, j12, 0L, null, null, null, null);
    }

    public final C37012z a(long j12) {
        return new C37012z(this.f355499a, this.f355500b, this.f355501c, this.f355502d, this.f355503e, j12, this.f355505g, this.f355506h, this.f355507i, this.f355508j, this.f355509k);
    }

    public final C37012z b(Long l12, Long l13, Boolean bool) {
        return new C37012z(this.f355499a, this.f355500b, this.f355501c, this.f355502d, this.f355503e, this.f355504f, this.f355505g, this.f355506h, l12, l13, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public C37012z(String str, String str2, long j12, long j13, long j14, long j15, long j16, Long l12, Long l13, Long l14, Boolean bool) {
        C36729v.f(str);
        C36729v.f(str2);
        C36729v.b(j12 >= 0);
        C36729v.b(j13 >= 0);
        C36729v.b(j14 >= 0);
        C36729v.b(j16 >= 0);
        this.f355499a = str;
        this.f355500b = str2;
        this.f355501c = j12;
        this.f355502d = j13;
        this.f355503e = j14;
        this.f355504f = j15;
        this.f355505g = j16;
        this.f355506h = l12;
        this.f355507i = l13;
        this.f355508j = l14;
        this.f355509k = bool;
    }
}
