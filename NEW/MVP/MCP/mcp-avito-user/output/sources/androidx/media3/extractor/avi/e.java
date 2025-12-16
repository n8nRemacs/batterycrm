package androidx.media3.extractor.avi;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.M;
import androidx.media3.extractor.H;
import androidx.media3.extractor.I;
import androidx.media3.extractor.J;

/* compiled from: ChunkReader.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final J f50456a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50457b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50458c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50459d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50460e;

    /* renamed from: f, reason: collision with root package name */
    public int f50461f;

    /* renamed from: g, reason: collision with root package name */
    public int f50462g;

    /* renamed from: h, reason: collision with root package name */
    public int f50463h;

    /* renamed from: i, reason: collision with root package name */
    public int f50464i;

    /* renamed from: j, reason: collision with root package name */
    public int f50465j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f50466k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f50467l;

    public e(int i12, int i13, long j12, int i14, J j13) {
        boolean z12 = true;
        if (i13 != 1 && i13 != 2) {
            z12 = false;
        }
        C23110a.b(z12);
        this.f50459d = j12;
        this.f50460e = i14;
        this.f50456a = j13;
        int i15 = (((i12 % 10) + 48) << 8) | ((i12 / 10) + 48);
        this.f50457b = (i13 == 2 ? 1667497984 : 1651965952) | i15;
        this.f50458c = i13 == 2 ? i15 | 1650720768 : -1;
        this.f50466k = new long[512];
        this.f50467l = new int[512];
    }

    public final I a(int i12) {
        return new I(((this.f50459d * 1) / this.f50460e) * this.f50467l[i12], this.f50466k[i12]);
    }

    public final H.a b(long j12) {
        int i12 = (int) (j12 / ((this.f50459d * 1) / this.f50460e));
        int iE2 = M.e(this.f50467l, i12, true, true);
        if (this.f50467l[iE2] == i12) {
            I iA2 = a(iE2);
            return new H.a(iA2, iA2);
        }
        I iA3 = a(iE2);
        int i13 = iE2 + 1;
        return i13 < this.f50466k.length ? new H.a(iA3, a(i13)) : new H.a(iA3, iA3);
    }
}
