package shark.internal;

import kotlin.Metadata;

/* compiled from: ByteSubArray.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/t;", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.internal.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48296t {

    /* renamed from: a, reason: collision with root package name */
    public final int f438601a;

    /* renamed from: b, reason: collision with root package name */
    public int f438602b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f438603c;

    /* renamed from: d, reason: collision with root package name */
    public final int f438604d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f438605e;

    public C48296t(@Y61.k byte[] bArr, int i12, int i13, boolean z12) {
        this.f438603c = bArr;
        this.f438604d = i12;
        this.f438605e = z12;
        this.f438601a = i13 - 1;
    }

    public final byte a() {
        int i12 = this.f438602b;
        this.f438602b = i12 + 1;
        int i13 = this.f438601a;
        if (i12 >= 0 && i13 >= i12) {
            return this.f438603c[this.f438604d + i12];
        }
        throw new IllegalArgumentException(androidx.compose.foundation.H.j(i12, i13, "Index ", " should be between 0 and ").toString());
    }

    public final long b() {
        if (!this.f438605e) {
            return c();
        }
        int i12 = this.f438602b;
        this.f438602b = i12 + 8;
        int i13 = this.f438601a;
        if (i12 >= 0 && i12 <= i13 - 7) {
            return C48297u.b(this.f438604d + i12, this.f438603c);
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index ", " should be between 0 and ");
        sbJ.append(i13 - 7);
        throw new IllegalArgumentException(sbJ.toString().toString());
    }

    public final int c() {
        int i12 = this.f438602b;
        this.f438602b = i12 + 4;
        int i13 = this.f438601a;
        if (i12 >= 0 && i12 <= i13 + (-3)) {
            return C48297u.a(this.f438604d + i12, this.f438603c);
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index ", " should be between 0 and ");
        sbJ.append(i13 - 3);
        throw new IllegalArgumentException(sbJ.toString().toString());
    }

    public final long d(int i12) {
        int i13 = this.f438602b;
        this.f438602b = i13 + i12;
        int i14 = this.f438601a;
        if (!(i13 >= 0 && i13 <= i14 - (i12 + (-1)))) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i13, "Index ", " should be between 0 and ");
            sbJ.append(i14 - (i12 - 1));
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        int i15 = this.f438604d + i13;
        int i16 = (i12 - 1) * 8;
        long j12 = 0;
        while (true) {
            byte[] bArr = this.f438603c;
            if (i16 < 8) {
                return (bArr[i15] & 255) | j12;
            }
            j12 |= (255 & bArr[i15]) << i16;
            i16 -= 8;
            i15++;
        }
    }
}
