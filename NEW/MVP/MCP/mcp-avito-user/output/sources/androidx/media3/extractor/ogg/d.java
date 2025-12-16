package androidx.media3.extractor.ogg;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: OggPacket.java */
/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f51105a = new e();

    /* renamed from: b, reason: collision with root package name */
    public final z f51106b = new z(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f51107c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f51108d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f51109e;

    public final int a(int i12) {
        int i13;
        int i14 = 0;
        this.f51108d = 0;
        do {
            int i15 = this.f51108d;
            int i16 = i12 + i15;
            e eVar = this.f51105a;
            if (i16 >= eVar.f51112c) {
                break;
            }
            int[] iArr = eVar.f51115f;
            this.f51108d = i15 + 1;
            i13 = iArr[i15 + i12];
            i14 += i13;
        } while (i13 == 255);
        return i14;
    }

    public final boolean b(C23191j c23191j) throws InterruptedIOException {
        int i12;
        C23110a.g(c23191j != null);
        boolean z12 = this.f51109e;
        z zVar = this.f51106b;
        if (z12) {
            this.f51109e = false;
            zVar.C(0);
        }
        while (!this.f51109e) {
            int i13 = this.f51107c;
            e eVar = this.f51105a;
            if (i13 < 0) {
                if (eVar.b(c23191j, -1L) && eVar.a(c23191j, true)) {
                    int iA2 = eVar.f51113d;
                    if ((eVar.f51110a & 1) == 1 && zVar.f47964c == 0) {
                        iA2 += a(0);
                        i12 = this.f51108d;
                    } else {
                        i12 = 0;
                    }
                    try {
                        c23191j.i(iA2);
                        this.f51107c = i12;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA3 = a(this.f51107c);
            int i14 = this.f51107c + this.f51108d;
            if (iA3 > 0) {
                zVar.b(zVar.f47964c + iA3);
                try {
                    c23191j.d(zVar.f47962a, zVar.f47964c, iA3, false);
                    zVar.E(zVar.f47964c + iA3);
                    this.f51109e = eVar.f51115f[i14 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i14 == eVar.f51112c) {
                i14 = -1;
            }
            this.f51107c = i14;
        }
        return true;
    }
}
