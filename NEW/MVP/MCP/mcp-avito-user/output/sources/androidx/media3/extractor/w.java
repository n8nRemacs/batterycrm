package androidx.media3.extractor;

import androidx.media3.common.util.C23110a;
import androidx.media3.extractor.H;
import androidx.media3.extractor.x;

/* compiled from: FlacSeekTableSeekMap.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class w implements H {

    /* renamed from: a, reason: collision with root package name */
    public final x f51848a;

    /* renamed from: b, reason: collision with root package name */
    public final long f51849b;

    public w(x xVar, long j12) {
        this.f51848a = xVar;
        this.f51849b = j12;
    }

    @Override // androidx.media3.extractor.H
    public final long d() {
        return this.f51848a.b();
    }

    @Override // androidx.media3.extractor.H
    public final H.a f(long j12) {
        x xVar = this.f51848a;
        C23110a.h(xVar.f51901k);
        x.a aVar = xVar.f51901k;
        long[] jArr = aVar.f51903a;
        int iF2 = androidx.media3.common.util.M.f(jArr, androidx.media3.common.util.M.l((xVar.f51895e * j12) / 1000000, 0L, xVar.f51900j - 1), false);
        long j13 = iF2 == -1 ? 0L : jArr[iF2];
        long[] jArr2 = aVar.f51904b;
        long j14 = iF2 != -1 ? jArr2[iF2] : 0L;
        int i12 = xVar.f51895e;
        long j15 = (j13 * 1000000) / i12;
        long j16 = this.f51849b;
        I i13 = new I(j15, j14 + j16);
        if (j15 == j12 || iF2 == jArr.length - 1) {
            return new H.a(i13, i13);
        }
        int i14 = iF2 + 1;
        return new H.a(i13, new I((jArr[i14] * 1000000) / i12, j16 + jArr2[i14]));
    }

    @Override // androidx.media3.extractor.H
    public final boolean g() {
        return true;
    }
}
