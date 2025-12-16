package androidx.media3.extractor.mp4;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.M;

/* compiled from: TrackSampleTable.java */
/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    public final k f51074a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51075b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f51076c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f51077d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51078e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f51079f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f51080g;

    /* renamed from: h, reason: collision with root package name */
    public final long f51081h;

    public n(k kVar, long[] jArr, int[] iArr, int i12, long[] jArr2, int[] iArr2, long j12) {
        C23110a.b(iArr.length == jArr2.length);
        C23110a.b(jArr.length == jArr2.length);
        C23110a.b(iArr2.length == jArr2.length);
        this.f51074a = kVar;
        this.f51076c = jArr;
        this.f51077d = iArr;
        this.f51078e = i12;
        this.f51079f = jArr2;
        this.f51080g = iArr2;
        this.f51081h = j12;
        this.f51075b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j12) {
        long[] jArr = this.f51079f;
        for (int iB2 = M.b(jArr, j12, true); iB2 < jArr.length; iB2++) {
            if ((this.f51080g[iB2] & 1) != 0) {
                return iB2;
            }
        }
        return -1;
    }
}
