package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import java.util.Collections;
import java.util.List;

/* compiled from: SubripSubtitle.java */
/* loaded from: classes6.dex */
final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.text.a[] f346994b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f346995c;

    public b(com.google.android.exoplayer2.text.a[] aVarArr, long[] jArr) {
        this.f346994b = aVarArr;
        this.f346995c = jArr;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final long a(int i12) {
        C36585a.b(i12 >= 0);
        long[] jArr = this.f346995c;
        C36585a.b(i12 < jArr.length);
        return jArr[i12];
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int b() {
        return this.f346995c.length;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int c(long j12) {
        long[] jArr = this.f346995c;
        int iB2 = U.b(jArr, j12, false);
        if (iB2 < jArr.length) {
            return iB2;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final List<com.google.android.exoplayer2.text.a> d(long j12) {
        com.google.android.exoplayer2.text.a aVar;
        int iF2 = U.f(this.f346995c, j12, false);
        return (iF2 == -1 || (aVar = this.f346994b[iF2]) == com.google.android.exoplayer2.text.a.f346715s) ? Collections.emptyList() : Collections.singletonList(aVar);
    }
}
