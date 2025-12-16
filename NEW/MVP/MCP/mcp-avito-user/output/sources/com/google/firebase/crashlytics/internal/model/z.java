package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C;

/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* loaded from: classes4.dex */
final class z extends C.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f361419a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361420b;

    /* renamed from: c, reason: collision with root package name */
    public final int f361421c;

    /* renamed from: d, reason: collision with root package name */
    public final long f361422d;

    /* renamed from: e, reason: collision with root package name */
    public final long f361423e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f361424f;

    /* renamed from: g, reason: collision with root package name */
    public final int f361425g;

    /* renamed from: h, reason: collision with root package name */
    public final String f361426h;

    /* renamed from: i, reason: collision with root package name */
    public final String f361427i;

    public z(int i12, String str, int i13, long j12, long j13, boolean z12, int i14, String str2, String str3) {
        this.f361419a = i12;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f361420b = str;
        this.f361421c = i13;
        this.f361422d = j12;
        this.f361423e = j13;
        this.f361424f = z12;
        this.f361425g = i14;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f361426h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f361427i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.b
    public final int a() {
        return this.f361419a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.b
    public final int b() {
        return this.f361421c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.b
    public final long d() {
        return this.f361423e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.b
    public final boolean e() {
        return this.f361424f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C.b)) {
            return false;
        }
        C.b bVar = (C.b) obj;
        return this.f361419a == bVar.a() && this.f361420b.equals(bVar.g()) && this.f361421c == bVar.b() && this.f361422d == bVar.j() && this.f361423e == bVar.d() && this.f361424f == bVar.e() && this.f361425g == bVar.i() && this.f361426h.equals(bVar.f()) && this.f361427i.equals(bVar.h());
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.b
    public final String f() {
        return this.f361426h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.b
    public final String g() {
        return this.f361420b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.b
    public final String h() {
        return this.f361427i;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f361419a ^ 1000003) * 1000003) ^ this.f361420b.hashCode()) * 1000003) ^ this.f361421c) * 1000003;
        long j12 = this.f361422d;
        int i12 = (iHashCode ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f361423e;
        return ((((((((i12 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ (this.f361424f ? 1231 : 1237)) * 1000003) ^ this.f361425g) * 1000003) ^ this.f361426h.hashCode()) * 1000003) ^ this.f361427i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.b
    public final int i() {
        return this.f361425g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.b
    public final long j() {
        return this.f361422d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f361419a);
        sb2.append(", model=");
        sb2.append(this.f361420b);
        sb2.append(", availableProcessors=");
        sb2.append(this.f361421c);
        sb2.append(", totalRam=");
        sb2.append(this.f361422d);
        sb2.append(", diskSpace=");
        sb2.append(this.f361423e);
        sb2.append(", isEmulator=");
        sb2.append(this.f361424f);
        sb2.append(", state=");
        sb2.append(this.f361425g);
        sb2.append(", manufacturer=");
        sb2.append(this.f361426h);
        sb2.append(", modelClass=");
        return AK.c.s(sb2, this.f361427i, "}");
    }
}
