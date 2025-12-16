package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class X extends AssetPackState {

    /* renamed from: a, reason: collision with root package name */
    public final String f358259a;

    /* renamed from: b, reason: collision with root package name */
    public final int f358260b;

    /* renamed from: c, reason: collision with root package name */
    public final int f358261c;

    /* renamed from: d, reason: collision with root package name */
    public final long f358262d;

    /* renamed from: e, reason: collision with root package name */
    public final long f358263e;

    /* renamed from: f, reason: collision with root package name */
    public final int f358264f;

    /* renamed from: g, reason: collision with root package name */
    @HY0.d
    public final int f358265g;

    /* renamed from: h, reason: collision with root package name */
    public final String f358266h;

    /* renamed from: i, reason: collision with root package name */
    public final String f358267i;

    public X(String str, int i12, int i13, long j12, long j13, int i14, int i15, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f358259a = str;
        this.f358260b = i12;
        this.f358261c = i13;
        this.f358262d = j12;
        this.f358263e = j13;
        this.f358264f = i14;
        this.f358265g = i15;
        if (str2 == null) {
            throw new NullPointerException("Null availableVersionTag");
        }
        this.f358266h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null installedVersionTag");
        }
        this.f358267i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String a() {
        return this.f358266h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long c() {
        return this.f358262d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    @HY0.a
    public final int d() {
        return this.f358261c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String e() {
        return this.f358267i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f358259a.equals(assetPackState.f()) && this.f358260b == assetPackState.g() && this.f358261c == assetPackState.d() && this.f358262d == assetPackState.c() && this.f358263e == assetPackState.h() && this.f358264f == assetPackState.i() && this.f358265g == assetPackState.j() && this.f358266h.equals(assetPackState.a()) && this.f358267i.equals(assetPackState.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String f() {
        return this.f358259a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    @HY0.b
    public final int g() {
        return this.f358260b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long h() {
        return this.f358263e;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f358259a.hashCode() ^ 1000003) * 1000003) ^ this.f358260b) * 1000003) ^ this.f358261c;
        long j12 = this.f358262d;
        long j13 = this.f358263e;
        return (((((((((((iHashCode * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f358264f) * 1000003) ^ this.f358265g) * 1000003) ^ this.f358266h.hashCode()) * 1000003) ^ this.f358267i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int i() {
        return this.f358264f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    @HY0.d
    public final int j() {
        return this.f358265g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssetPackState{name=");
        sb2.append(this.f358259a);
        sb2.append(", status=");
        sb2.append(this.f358260b);
        sb2.append(", errorCode=");
        sb2.append(this.f358261c);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f358262d);
        sb2.append(", totalBytesToDownload=");
        sb2.append(this.f358263e);
        sb2.append(", transferProgressPercentage=");
        sb2.append(this.f358264f);
        sb2.append(", updateAvailability=");
        sb2.append(this.f358265g);
        sb2.append(", availableVersionTag=");
        sb2.append(this.f358266h);
        sb2.append(", installedVersionTag=");
        return AK.c.s(sb2, this.f358267i, "}");
    }
}
