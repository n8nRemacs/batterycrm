package androidx.media3.extractor;

import androidx.media3.common.util.C23110a;
import androidx.media3.extractor.J;
import j.P;

/* compiled from: TrueHdSampleRechunker.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50384a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f50385b;

    /* renamed from: c, reason: collision with root package name */
    public int f50386c;

    /* renamed from: d, reason: collision with root package name */
    public long f50387d;

    /* renamed from: e, reason: collision with root package name */
    public int f50388e;

    /* renamed from: f, reason: collision with root package name */
    public int f50389f;

    /* renamed from: g, reason: collision with root package name */
    public int f50390g;

    public final void a(J j12, @P J.a aVar) {
        if (this.f50386c > 0) {
            j12.f(this.f50387d, this.f50388e, this.f50389f, this.f50390g, aVar);
            this.f50386c = 0;
        }
    }

    public final void b(J j12, long j13, int i12, int i13, int i14, @P J.a aVar) {
        C23110a.f("TrueHD chunk samples must be contiguous in the sample queue.", this.f50390g <= i13 + i14);
        if (this.f50385b) {
            int i15 = this.f50386c;
            int i16 = i15 + 1;
            this.f50386c = i16;
            if (i15 == 0) {
                this.f50387d = j13;
                this.f50388e = i12;
                this.f50389f = 0;
            }
            this.f50389f += i13;
            this.f50390g = i14;
            if (i16 >= 16) {
                a(j12, aVar);
            }
        }
    }

    public final void c(q qVar) {
        if (this.f50385b) {
            return;
        }
        byte[] bArr = this.f50384a;
        int i12 = 0;
        qVar.b(0, 10, bArr);
        qVar.f();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b12 = bArr[7];
            if ((b12 & 254) == 186) {
                i12 = 40 << ((bArr[(b12 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i12 == 0) {
            return;
        }
        this.f50385b = true;
    }
}
