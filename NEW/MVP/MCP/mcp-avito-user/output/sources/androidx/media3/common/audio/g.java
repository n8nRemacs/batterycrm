package androidx.media3.common.audio;

import aZ0.InterfaceC19845a;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: SonicAudioProcessor.java */
@J
/* loaded from: classes.dex */
public class g implements AudioProcessor {

    /* renamed from: b, reason: collision with root package name */
    public int f47599b;

    /* renamed from: c, reason: collision with root package name */
    public float f47600c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f47601d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f47602e;

    /* renamed from: f, reason: collision with root package name */
    public AudioProcessor.a f47603f;

    /* renamed from: g, reason: collision with root package name */
    public AudioProcessor.a f47604g;

    /* renamed from: h, reason: collision with root package name */
    public AudioProcessor.a f47605h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f47606i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public f f47607j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f47608k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f47609l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f47610m;

    /* renamed from: n, reason: collision with root package name */
    public long f47611n;

    /* renamed from: o, reason: collision with root package name */
    public long f47612o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f47613p;

    public g() {
        AudioProcessor.a aVar = AudioProcessor.a.f47560e;
        this.f47602e = aVar;
        this.f47603f = aVar;
        this.f47604g = aVar;
        this.f47605h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f47559a;
        this.f47608k = byteBuffer;
        this.f47609l = byteBuffer.asShortBuffer();
        this.f47610m = byteBuffer;
        this.f47599b = -1;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean a() {
        f fVar;
        return this.f47613p && ((fVar = this.f47607j) == null || (fVar.f47589m * fVar.f47578b) * 2 == 0);
    }

    public final long b(long j12) {
        if (this.f47612o < 1024) {
            return (long) (this.f47600c * j12);
        }
        long j13 = this.f47611n;
        this.f47607j.getClass();
        long j14 = j13 - ((r3.f47587k * r3.f47578b) * 2);
        int i12 = this.f47605h.f47561a;
        int i13 = this.f47604g.f47561a;
        return i12 == i13 ? M.K(j12, j14, this.f47612o) : M.K(j12, j14 * i12, this.f47612o * i13);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer f() {
        f fVar = this.f47607j;
        if (fVar != null) {
            int i12 = fVar.f47589m;
            int i13 = fVar.f47578b;
            int i14 = i12 * i13 * 2;
            if (i14 > 0) {
                if (this.f47608k.capacity() < i14) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i14).order(ByteOrder.nativeOrder());
                    this.f47608k = byteBufferOrder;
                    this.f47609l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f47608k.clear();
                    this.f47609l.clear();
                }
                ShortBuffer shortBuffer = this.f47609l;
                int iMin = Math.min(shortBuffer.remaining() / i13, fVar.f47589m);
                int i15 = iMin * i13;
                shortBuffer.put(fVar.f47588l, 0, i15);
                int i16 = fVar.f47589m - iMin;
                fVar.f47589m = i16;
                short[] sArr = fVar.f47588l;
                System.arraycopy(sArr, i15, sArr, 0, i16 * i13);
                this.f47612o += i14;
                this.f47608k.limit(i14);
                this.f47610m = this.f47608k;
            }
        }
        ByteBuffer byteBuffer = this.f47610m;
        this.f47610m = AudioProcessor.f47559a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f47602e;
            this.f47604g = aVar;
            AudioProcessor.a aVar2 = this.f47603f;
            this.f47605h = aVar2;
            if (this.f47606i) {
                this.f47607j = new f(aVar.f47561a, aVar.f47562b, this.f47600c, this.f47601d, aVar2.f47561a);
            } else {
                f fVar = this.f47607j;
                if (fVar != null) {
                    fVar.f47587k = 0;
                    fVar.f47589m = 0;
                    fVar.f47591o = 0;
                    fVar.f47592p = 0;
                    fVar.f47593q = 0;
                    fVar.f47594r = 0;
                    fVar.f47595s = 0;
                    fVar.f47596t = 0;
                    fVar.f47597u = 0;
                    fVar.f47598v = 0;
                }
            }
        }
        this.f47610m = AudioProcessor.f47559a;
        this.f47611n = 0L;
        this.f47612o = 0L;
        this.f47613p = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            f fVar = this.f47607j;
            fVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f47611n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i12 = fVar.f47578b;
            int i13 = iRemaining2 / i12;
            short[] sArrC = fVar.c(fVar.f47586j, fVar.f47587k, i13);
            fVar.f47586j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, fVar.f47587k * i12, ((i13 * i12) * 2) / 2);
            fVar.f47587k += i13;
            fVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void h() {
        f fVar = this.f47607j;
        if (fVar != null) {
            int i12 = fVar.f47587k;
            float f12 = fVar.f47579c;
            float f13 = fVar.f47580d;
            int i13 = fVar.f47589m + ((int) ((((i12 / (f12 / f13)) + fVar.f47591o) / (fVar.f47581e * f13)) + 0.5f));
            short[] sArr = fVar.f47586j;
            int i14 = fVar.f47584h * 2;
            fVar.f47586j = fVar.c(sArr, i12, i14 + i12);
            int i15 = 0;
            while (true) {
                int i16 = fVar.f47578b;
                if (i15 >= i14 * i16) {
                    break;
                }
                fVar.f47586j[(i16 * i12) + i15] = 0;
                i15++;
            }
            fVar.f47587k = i14 + fVar.f47587k;
            fVar.f();
            if (fVar.f47589m > i13) {
                fVar.f47589m = i13;
            }
            fVar.f47587k = 0;
            fVar.f47594r = 0;
            fVar.f47591o = 0;
        }
        this.f47613p = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @InterfaceC19845a
    public final AudioProcessor.a i(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f47563c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i12 = this.f47599b;
        if (i12 == -1) {
            i12 = aVar.f47561a;
        }
        this.f47602e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i12, aVar.f47562b, 2);
        this.f47603f = aVar2;
        this.f47606i = true;
        return aVar2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return this.f47603f.f47561a != -1 && (Math.abs(this.f47600c - 1.0f) >= 1.0E-4f || Math.abs(this.f47601d - 1.0f) >= 1.0E-4f || this.f47603f.f47561a != this.f47602e.f47561a);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.f47600c = 1.0f;
        this.f47601d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f47560e;
        this.f47602e = aVar;
        this.f47603f = aVar;
        this.f47604g = aVar;
        this.f47605h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f47559a;
        this.f47608k = byteBuffer;
        this.f47609l = byteBuffer.asShortBuffer();
        this.f47610m = byteBuffer;
        this.f47599b = -1;
        this.f47606i = false;
        this.f47607j = null;
        this.f47611n = 0L;
        this.f47612o = 0L;
        this.f47613p = false;
    }
}
