package androidx.media3.decoder;

import android.media.MediaCodec;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import j.X;

/* compiled from: CryptoInfo.java */
@J
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @P
    public byte[] f48329a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public byte[] f48330b;

    /* renamed from: c, reason: collision with root package name */
    public int f48331c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public int[] f48332d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public int[] f48333e;

    /* renamed from: f, reason: collision with root package name */
    public int f48334f;

    /* renamed from: g, reason: collision with root package name */
    public int f48335g;

    /* renamed from: h, reason: collision with root package name */
    public int f48336h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f48337i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final b f48338j;

    /* compiled from: CryptoInfo.java */
    @X
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f48339a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f48340b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public b(MediaCodec.CryptoInfo cryptoInfo, a aVar) {
            this.f48339a = cryptoInfo;
        }
    }

    public d() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f48337i = cryptoInfo;
        this.f48338j = M.f47887a >= 24 ? new b(cryptoInfo, null) : null;
    }

    public final void a(int i12, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i13, int i14, int i15) {
        this.f48334f = i12;
        this.f48332d = iArr;
        this.f48333e = iArr2;
        this.f48330b = bArr;
        this.f48329a = bArr2;
        this.f48331c = i13;
        this.f48335g = i14;
        this.f48336h = i15;
        MediaCodec.CryptoInfo cryptoInfo = this.f48337i;
        cryptoInfo.numSubSamples = i12;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i13;
        if (M.f47887a >= 24) {
            b bVar = this.f48338j;
            bVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = bVar.f48340b;
            pattern.set(i14, i15);
            bVar.f48339a.setPattern(pattern);
        }
    }
}
