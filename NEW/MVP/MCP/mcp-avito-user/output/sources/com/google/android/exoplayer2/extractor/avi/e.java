package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;

/* compiled from: ChunkReader.java */
/* loaded from: classes6.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final A f344463a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f344465c;

    /* renamed from: d, reason: collision with root package name */
    public final long f344466d;

    /* renamed from: e, reason: collision with root package name */
    public final int f344467e;

    /* renamed from: f, reason: collision with root package name */
    public int f344468f;

    /* renamed from: g, reason: collision with root package name */
    public int f344469g;

    /* renamed from: h, reason: collision with root package name */
    public int f344470h;

    /* renamed from: i, reason: collision with root package name */
    public int f344471i;

    /* renamed from: j, reason: collision with root package name */
    public int f344472j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f344473k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f344474l;

    public e(int i12, int i13, long j12, int i14, A a12) {
        boolean z12 = true;
        if (i13 != 1 && i13 != 2) {
            z12 = false;
        }
        C36585a.b(z12);
        this.f344466d = j12;
        this.f344467e = i14;
        this.f344463a = a12;
        int i15 = (((i12 % 10) + 48) << 8) | ((i12 / 10) + 48);
        this.f344464b = (i13 == 2 ? 1667497984 : 1651965952) | i15;
        this.f344465c = i13 == 2 ? i15 | 1650720768 : -1;
        this.f344473k = new long[512];
        this.f344474l = new int[512];
    }

    public final z a(int i12) {
        return new z(((this.f344466d * 1) / this.f344467e) * this.f344474l[i12], this.f344473k[i12]);
    }

    public final y.a b(long j12) {
        int i12 = (int) (j12 / ((this.f344466d * 1) / this.f344467e));
        int iE2 = U.e(this.f344474l, i12, true, true);
        if (this.f344474l[iE2] == i12) {
            z zVarA = a(iE2);
            return new y.a(zVarA, zVarA);
        }
        z zVarA2 = a(iE2);
        int i13 = iE2 + 1;
        return i13 < this.f344473k.length ? new y.a(zVarA2, a(i13)) : new y.a(zVarA2, zVarA2);
    }
}
