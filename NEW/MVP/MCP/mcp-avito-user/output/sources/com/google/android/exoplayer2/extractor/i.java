package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.upstream.InterfaceC36580j;
import com.google.android.exoplayer2.util.F;
import j.P;
import java.io.EOFException;

/* compiled from: DummyTrackOutput.java */
/* loaded from: classes6.dex */
public final class i implements A {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f344551a = new byte[4096];

    @Override // com.google.android.exoplayer2.extractor.A
    public final int d(InterfaceC36580j interfaceC36580j, int i12, boolean z12) throws EOFException {
        byte[] bArr = this.f344551a;
        int i13 = interfaceC36580j.read(bArr, 0, Math.min(bArr.length, i12));
        if (i13 != -1) {
            return i13;
        }
        if (z12) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.exoplayer2.extractor.A
    public final void e(int i12, F f12) {
        f12.C(i12);
    }

    @Override // com.google.android.exoplayer2.extractor.A
    public final void a(I i12) {
    }

    @Override // com.google.android.exoplayer2.extractor.A
    public final void f(long j12, int i12, int i13, int i14, @P A.a aVar) {
    }
}
