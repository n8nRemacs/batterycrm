package androidx.media3.extractor.mkv;

import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;

/* compiled from: Sniffer.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final z f50869a = new z(8);

    /* renamed from: b, reason: collision with root package name */
    public int f50870b;

    public final long a(C23191j c23191j) {
        z zVar = this.f50869a;
        int i12 = 0;
        c23191j.a(zVar.f47962a, 0, 1, false);
        int i13 = zVar.f47962a[0] & 255;
        if (i13 == 0) {
            return Long.MIN_VALUE;
        }
        int i14 = 128;
        int i15 = 0;
        while ((i13 & i14) == 0) {
            i14 >>= 1;
            i15++;
        }
        int i16 = i13 & (~i14);
        c23191j.a(zVar.f47962a, 1, i15, false);
        while (i12 < i15) {
            i12++;
            i16 = (zVar.f47962a[i12] & 255) + (i16 << 8);
        }
        this.f50870b = i15 + 1 + this.f50870b;
        return i16;
    }
}
