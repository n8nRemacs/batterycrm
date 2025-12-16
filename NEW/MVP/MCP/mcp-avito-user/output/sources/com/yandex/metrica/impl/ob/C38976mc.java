package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.mc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38976mc {

    /* renamed from: a, reason: collision with root package name */
    public final long f381037a;

    /* renamed from: b, reason: collision with root package name */
    public final float f381038b;

    /* renamed from: c, reason: collision with root package name */
    public final int f381039c;

    /* renamed from: d, reason: collision with root package name */
    public final int f381040d;

    /* renamed from: e, reason: collision with root package name */
    public final long f381041e;

    /* renamed from: f, reason: collision with root package name */
    public final int f381042f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f381043g;

    /* renamed from: h, reason: collision with root package name */
    public final long f381044h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f381045i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f381046j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f381047k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f381048l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public final Xb f381049m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public final Xb f381050n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public final Xb f381051o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    public final Xb f381052p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public final C38727cc f381053q;

    public C38976mc(long j12, float f12, int i12, int i13, long j13, int i14, boolean z12, long j14, boolean z13, boolean z14, boolean z15, boolean z16, @j.P Xb xb2, @j.P Xb xb3, @j.P Xb xb4, @j.P Xb xb5, @j.P C38727cc c38727cc) {
        this.f381037a = j12;
        this.f381038b = f12;
        this.f381039c = i12;
        this.f381040d = i13;
        this.f381041e = j13;
        this.f381042f = i14;
        this.f381043g = z12;
        this.f381044h = j14;
        this.f381045i = z13;
        this.f381046j = z14;
        this.f381047k = z15;
        this.f381048l = z16;
        this.f381049m = xb2;
        this.f381050n = xb3;
        this.f381051o = xb4;
        this.f381052p = xb5;
        this.f381053q = c38727cc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38976mc.class != obj.getClass()) {
            return false;
        }
        C38976mc c38976mc = (C38976mc) obj;
        if (this.f381037a != c38976mc.f381037a || Float.compare(c38976mc.f381038b, this.f381038b) != 0 || this.f381039c != c38976mc.f381039c || this.f381040d != c38976mc.f381040d || this.f381041e != c38976mc.f381041e || this.f381042f != c38976mc.f381042f || this.f381043g != c38976mc.f381043g || this.f381044h != c38976mc.f381044h || this.f381045i != c38976mc.f381045i || this.f381046j != c38976mc.f381046j || this.f381047k != c38976mc.f381047k || this.f381048l != c38976mc.f381048l) {
            return false;
        }
        Xb xb2 = this.f381049m;
        if (xb2 == null ? c38976mc.f381049m != null : !xb2.equals(c38976mc.f381049m)) {
            return false;
        }
        Xb xb3 = this.f381050n;
        if (xb3 == null ? c38976mc.f381050n != null : !xb3.equals(c38976mc.f381050n)) {
            return false;
        }
        Xb xb4 = this.f381051o;
        if (xb4 == null ? c38976mc.f381051o != null : !xb4.equals(c38976mc.f381051o)) {
            return false;
        }
        Xb xb5 = this.f381052p;
        if (xb5 == null ? c38976mc.f381052p != null : !xb5.equals(c38976mc.f381052p)) {
            return false;
        }
        C38727cc c38727cc = this.f381053q;
        C38727cc c38727cc2 = c38976mc.f381053q;
        return c38727cc != null ? c38727cc.equals(c38727cc2) : c38727cc2 == null;
    }

    public int hashCode() {
        long j12 = this.f381037a;
        int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
        float f12 = this.f381038b;
        int iFloatToIntBits = (((((i12 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31) + this.f381039c) * 31) + this.f381040d) * 31;
        long j13 = this.f381041e;
        int i13 = (((((iFloatToIntBits + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f381042f) * 31) + (this.f381043g ? 1 : 0)) * 31;
        long j14 = this.f381044h;
        int i14 = (((((((((i13 + ((int) ((j14 >>> 32) ^ j14))) * 31) + (this.f381045i ? 1 : 0)) * 31) + (this.f381046j ? 1 : 0)) * 31) + (this.f381047k ? 1 : 0)) * 31) + (this.f381048l ? 1 : 0)) * 31;
        Xb xb2 = this.f381049m;
        int iHashCode = (i14 + (xb2 != null ? xb2.hashCode() : 0)) * 31;
        Xb xb3 = this.f381050n;
        int iHashCode2 = (iHashCode + (xb3 != null ? xb3.hashCode() : 0)) * 31;
        Xb xb4 = this.f381051o;
        int iHashCode3 = (iHashCode2 + (xb4 != null ? xb4.hashCode() : 0)) * 31;
        Xb xb5 = this.f381052p;
        int iHashCode4 = (iHashCode3 + (xb5 != null ? xb5.hashCode() : 0)) * 31;
        C38727cc c38727cc = this.f381053q;
        return iHashCode4 + (c38727cc != null ? c38727cc.hashCode() : 0);
    }

    public String toString() {
        return "LocationArguments{updateTimeInterval=" + this.f381037a + ", updateDistanceInterval=" + this.f381038b + ", recordsCountToForceFlush=" + this.f381039c + ", maxBatchSize=" + this.f381040d + ", maxAgeToForceFlush=" + this.f381041e + ", maxRecordsToStoreLocally=" + this.f381042f + ", collectionEnabled=" + this.f381043g + ", lbsUpdateTimeInterval=" + this.f381044h + ", lbsCollectionEnabled=" + this.f381045i + ", passiveCollectionEnabled=" + this.f381046j + ", allCellsCollectingEnabled=" + this.f381047k + ", connectedCellCollectingEnabled=" + this.f381048l + ", wifiAccessConfig=" + this.f381049m + ", lbsAccessConfig=" + this.f381050n + ", gpsAccessConfig=" + this.f381051o + ", passiveAccessConfig=" + this.f381052p + ", gplConfig=" + this.f381053q + '}';
    }
}
