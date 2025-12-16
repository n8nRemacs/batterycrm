package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.a0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37105a0 extends H1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f358283a;

    /* renamed from: b, reason: collision with root package name */
    public final long f358284b;

    /* renamed from: c, reason: collision with root package name */
    public final int f358285c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f358286d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f358287e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f358288f;

    public C37105a0(@j.P String str, long j12, int i12, boolean z12, boolean z13, @j.P byte[] bArr) {
        this.f358283a = str;
        this.f358284b = j12;
        this.f358285c = i12;
        this.f358286d = z12;
        this.f358287e = z13;
        this.f358288f = bArr;
    }

    @Override // com.google.android.play.core.assetpacks.H1
    public final int a() {
        return this.f358285c;
    }

    @Override // com.google.android.play.core.assetpacks.H1
    public final long b() {
        return this.f358284b;
    }

    @Override // com.google.android.play.core.assetpacks.H1
    @j.P
    public final String c() {
        return this.f358283a;
    }

    @Override // com.google.android.play.core.assetpacks.H1
    public final boolean d() {
        return this.f358287e;
    }

    @Override // com.google.android.play.core.assetpacks.H1
    public final boolean e() {
        return this.f358286d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H1) {
            H1 h12 = (H1) obj;
            String str = this.f358283a;
            if (str != null ? str.equals(h12.c()) : h12.c() == null) {
                if (this.f358284b == h12.b() && this.f358285c == h12.a() && this.f358286d == h12.e() && this.f358287e == h12.d()) {
                    if (Arrays.equals(this.f358288f, h12 instanceof C37105a0 ? ((C37105a0) h12).f358288f : h12.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.H1
    @j.P
    public final byte[] f() {
        return this.f358288f;
    }

    public final int hashCode() {
        String str = this.f358283a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j12 = this.f358284b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ this.f358285c) * 1000003) ^ (true != this.f358286d ? 1237 : 1231)) * 1000003) ^ (true != this.f358287e ? 1237 : 1231)) * 1000003) ^ Arrays.hashCode(this.f358288f);
    }

    public final String toString() {
        return "ZipEntry{name=" + this.f358283a + ", size=" + this.f358284b + ", compressionMethod=" + this.f358285c + ", isPartial=" + this.f358286d + ", isEndOfArchive=" + this.f358287e + ", headerBytes=" + Arrays.toString(this.f358288f) + "}";
    }
}
