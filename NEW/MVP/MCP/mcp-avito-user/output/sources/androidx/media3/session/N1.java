package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.H;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23110a;
import java.util.Arrays;

/* compiled from: SessionPositionInfo.java */
/* loaded from: classes.dex */
final class N1 implements InterfaceC23096j {

    /* renamed from: l, reason: collision with root package name */
    public static final H.k f52177l;

    /* renamed from: m, reason: collision with root package name */
    public static final N1 f52178m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f52179n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f52180o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f52181p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f52182q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f52183r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f52184s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f52185t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f52186u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f52187v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f52188w;

    /* renamed from: x, reason: collision with root package name */
    public static final M1 f52189x;

    /* renamed from: b, reason: collision with root package name */
    public final H.k f52190b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f52191c;

    /* renamed from: d, reason: collision with root package name */
    public final long f52192d;

    /* renamed from: e, reason: collision with root package name */
    public final long f52193e;

    /* renamed from: f, reason: collision with root package name */
    public final long f52194f;

    /* renamed from: g, reason: collision with root package name */
    public final int f52195g;

    /* renamed from: h, reason: collision with root package name */
    public final long f52196h;

    /* renamed from: i, reason: collision with root package name */
    public final long f52197i;

    /* renamed from: j, reason: collision with root package name */
    public final long f52198j;

    /* renamed from: k, reason: collision with root package name */
    public final long f52199k;

    static {
        H.k kVar = new H.k(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f52177l = kVar;
        f52178m = new N1(kVar, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        int i12 = androidx.media3.common.util.M.f47887a;
        f52179n = Integer.toString(0, 36);
        f52180o = Integer.toString(1, 36);
        f52181p = Integer.toString(2, 36);
        f52182q = Integer.toString(3, 36);
        f52183r = Integer.toString(4, 36);
        f52184s = Integer.toString(5, 36);
        f52185t = Integer.toString(6, 36);
        f52186u = Integer.toString(7, 36);
        f52187v = Integer.toString(8, 36);
        f52188w = Integer.toString(9, 36);
        f52189x = new M1(0);
    }

    public N1(H.k kVar, boolean z12, long j12, long j13, long j14, int i12, long j15, long j16, long j17, long j18) {
        C23110a.b(z12 == (kVar.f47261i != -1));
        this.f52190b = kVar;
        this.f52191c = z12;
        this.f52192d = j12;
        this.f52193e = j13;
        this.f52194f = j14;
        this.f52195g = i12;
        this.f52196h = j15;
        this.f52197i = j16;
        this.f52198j = j17;
        this.f52199k = j18;
    }

    public final Bundle a(boolean z12, boolean z13) {
        Bundle bundle = new Bundle();
        bundle.putBundle(f52179n, this.f52190b.a(z12, z13));
        bundle.putBoolean(f52180o, z12 && this.f52191c);
        bundle.putLong(f52181p, this.f52192d);
        bundle.putLong(f52182q, z12 ? this.f52193e : -9223372036854775807L);
        bundle.putLong(f52183r, z12 ? this.f52194f : 0L);
        bundle.putInt(f52184s, z12 ? this.f52195g : 0);
        bundle.putLong(f52185t, z12 ? this.f52196h : 0L);
        bundle.putLong(f52186u, z12 ? this.f52197i : -9223372036854775807L);
        bundle.putLong(f52187v, z12 ? this.f52198j : -9223372036854775807L);
        bundle.putLong(f52188w, z12 ? this.f52199k : 0L);
        return bundle;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N1.class != obj.getClass()) {
            return false;
        }
        N1 n12 = (N1) obj;
        return this.f52190b.equals(n12.f52190b) && this.f52191c == n12.f52191c && this.f52192d == n12.f52192d && this.f52193e == n12.f52193e && this.f52194f == n12.f52194f && this.f52195g == n12.f52195g && this.f52196h == n12.f52196h && this.f52197i == n12.f52197i && this.f52198j == n12.f52198j && this.f52199k == n12.f52199k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52190b, Boolean.valueOf(this.f52191c)});
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public final Bundle k() {
        return a(true, true);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        H.k kVar = this.f52190b;
        sb2.append(kVar.f47255c);
        sb2.append(", periodIndex=");
        sb2.append(kVar.f47258f);
        sb2.append(", positionMs=");
        sb2.append(kVar.f47259g);
        sb2.append(", contentPositionMs=");
        sb2.append(kVar.f47260h);
        sb2.append(", adGroupIndex=");
        sb2.append(kVar.f47261i);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(kVar.f47262j);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f52191c);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f52192d);
        sb2.append(", durationMs=");
        sb2.append(this.f52193e);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f52194f);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f52195g);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f52196h);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.f52197i);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f52198j);
        sb2.append(", contentBufferedPositionMs=");
        return AK.c.j(this.f52199k, "}", sb2);
    }
}
