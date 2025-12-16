package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import j.P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: SonicAudioProcessor.java */
/* loaded from: classes6.dex */
public final class z implements AudioProcessor {

    /* renamed from: b, reason: collision with root package name */
    public int f344136b;

    /* renamed from: c, reason: collision with root package name */
    public float f344137c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f344138d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f344139e;

    /* renamed from: f, reason: collision with root package name */
    public AudioProcessor.a f344140f;

    /* renamed from: g, reason: collision with root package name */
    public AudioProcessor.a f344141g;

    /* renamed from: h, reason: collision with root package name */
    public AudioProcessor.a f344142h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f344143i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public y f344144j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f344145k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f344146l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f344147m;

    /* renamed from: n, reason: collision with root package name */
    public long f344148n;

    /* renamed from: o, reason: collision with root package name */
    public long f344149o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f344150p;

    public z() {
        AudioProcessor.a aVar = AudioProcessor.a.f343847e;
        this.f344139e = aVar;
        this.f344140f = aVar;
        this.f344141g = aVar;
        this.f344142h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f343846a;
        this.f344145k = byteBuffer;
        this.f344146l = byteBuffer.asShortBuffer();
        this.f344147m = byteBuffer;
        this.f344136b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean a() {
        y yVar;
        return this.f344150p && ((yVar = this.f344144j) == null || (yVar.f344126m * yVar.f344115b) * 2 == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f343850c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i12 = this.f344136b;
        if (i12 == -1) {
            i12 = aVar.f343848a;
        }
        this.f344139e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i12, aVar.f343849b, 2);
        this.f344140f = aVar2;
        this.f344143i = true;
        return aVar2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer f() {
        y yVar = this.f344144j;
        if (yVar != null) {
            int i12 = yVar.f344126m;
            int i13 = yVar.f344115b;
            int i14 = i12 * i13 * 2;
            if (i14 > 0) {
                if (this.f344145k.capacity() < i14) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i14).order(ByteOrder.nativeOrder());
                    this.f344145k = byteBufferOrder;
                    this.f344146l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f344145k.clear();
                    this.f344146l.clear();
                }
                ShortBuffer shortBuffer = this.f344146l;
                int iMin = Math.min(shortBuffer.remaining() / i13, yVar.f344126m);
                int i15 = iMin * i13;
                shortBuffer.put(yVar.f344125l, 0, i15);
                int i16 = yVar.f344126m - iMin;
                yVar.f344126m = i16;
                short[] sArr = yVar.f344125l;
                System.arraycopy(sArr, i15, sArr, 0, i16 * i13);
                this.f344149o += i14;
                this.f344145k.limit(i14);
                this.f344147m = this.f344145k;
            }
        }
        ByteBuffer byteBuffer = this.f344147m;
        this.f344147m = AudioProcessor.f343846a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f344139e;
            this.f344141g = aVar;
            AudioProcessor.a aVar2 = this.f344140f;
            this.f344142h = aVar2;
            if (this.f344143i) {
                this.f344144j = new y(aVar.f343848a, aVar.f343849b, this.f344137c, this.f344138d, aVar2.f343848a);
            } else {
                y yVar = this.f344144j;
                if (yVar != null) {
                    yVar.f344124k = 0;
                    yVar.f344126m = 0;
                    yVar.f344128o = 0;
                    yVar.f344129p = 0;
                    yVar.f344130q = 0;
                    yVar.f344131r = 0;
                    yVar.f344132s = 0;
                    yVar.f344133t = 0;
                    yVar.f344134u = 0;
                    yVar.f344135v = 0;
                }
            }
        }
        this.f344147m = AudioProcessor.f343846a;
        this.f344148n = 0L;
        this.f344149o = 0L;
        this.f344150p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            y yVar = this.f344144j;
            yVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f344148n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i12 = yVar.f344115b;
            int i13 = iRemaining2 / i12;
            short[] sArrC = yVar.c(yVar.f344123j, yVar.f344124k, i13);
            yVar.f344123j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, yVar.f344124k * i12, ((i13 * i12) * 2) / 2);
            yVar.f344124k += i13;
            yVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void h() {
        y yVar = this.f344144j;
        if (yVar != null) {
            int i12 = yVar.f344124k;
            float f12 = yVar.f344116c;
            float f13 = yVar.f344117d;
            int i13 = yVar.f344126m + ((int) ((((i12 / (f12 / f13)) + yVar.f344128o) / (yVar.f344118e * f13)) + 0.5f));
            short[] sArr = yVar.f344123j;
            int i14 = yVar.f344121h * 2;
            yVar.f344123j = yVar.c(sArr, i12, i14 + i12);
            int i15 = 0;
            while (true) {
                int i16 = yVar.f344115b;
                if (i15 >= i14 * i16) {
                    break;
                }
                yVar.f344123j[(i16 * i12) + i15] = 0;
                i15++;
            }
            yVar.f344124k = i14 + yVar.f344124k;
            yVar.f();
            if (yVar.f344126m > i13) {
                yVar.f344126m = i13;
            }
            yVar.f344124k = 0;
            yVar.f344131r = 0;
            yVar.f344128o = 0;
        }
        this.f344150p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.f344140f.f343848a != -1 && (Math.abs(this.f344137c - 1.0f) >= 1.0E-4f || Math.abs(this.f344138d - 1.0f) >= 1.0E-4f || this.f344140f.f343848a != this.f344139e.f343848a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        this.f344137c = 1.0f;
        this.f344138d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f343847e;
        this.f344139e = aVar;
        this.f344140f = aVar;
        this.f344141g = aVar;
        this.f344142h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f343846a;
        this.f344145k = byteBuffer;
        this.f344146l = byteBuffer.asShortBuffer();
        this.f344147m = byteBuffer;
        this.f344136b = -1;
        this.f344143i = false;
        this.f344144j = null;
        this.f344148n = 0L;
        this.f344149o = 0L;
        this.f344150p = false;
    }
}
