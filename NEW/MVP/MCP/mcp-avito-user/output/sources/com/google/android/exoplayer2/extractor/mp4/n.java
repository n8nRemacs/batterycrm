package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;

/* compiled from: TrackSampleTable.java */
/* loaded from: classes6.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    public final k f344901a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344902b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f344903c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f344904d;

    /* renamed from: e, reason: collision with root package name */
    public final int f344905e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f344906f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f344907g;

    /* renamed from: h, reason: collision with root package name */
    public final long f344908h;

    public n(k kVar, long[] jArr, int[] iArr, int i12, long[] jArr2, int[] iArr2, long j12) {
        C36585a.b(iArr.length == jArr2.length);
        C36585a.b(jArr.length == jArr2.length);
        C36585a.b(iArr2.length == jArr2.length);
        this.f344901a = kVar;
        this.f344903c = jArr;
        this.f344904d = iArr;
        this.f344905e = i12;
        this.f344906f = jArr2;
        this.f344907g = iArr2;
        this.f344908h = j12;
        this.f344902b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j12) {
        long[] jArr = this.f344906f;
        for (int iB2 = U.b(jArr, j12, true); iB2 < jArr.length; iB2++) {
            if ((this.f344907g[iB2] & 1) != 0) {
                return iB2;
            }
        }
        return -1;
    }
}
