package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import j.B;
import j.P;
import j.X;
import java.util.ArrayDeque;

/* compiled from: AsynchronousMediaCodecCallback.java */
@X
/* loaded from: classes.dex */
final class g extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f49358b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f49359c;

    /* renamed from: h, reason: collision with root package name */
    @B
    @P
    public MediaFormat f49364h;

    /* renamed from: i, reason: collision with root package name */
    @B
    @P
    public MediaFormat f49365i;

    /* renamed from: j, reason: collision with root package name */
    @B
    @P
    public MediaCodec.CodecException f49366j;

    /* renamed from: k, reason: collision with root package name */
    @B
    public long f49367k;

    /* renamed from: l, reason: collision with root package name */
    @B
    public boolean f49368l;

    /* renamed from: m, reason: collision with root package name */
    @B
    @P
    public IllegalStateException f49369m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f49357a = new Object();

    /* renamed from: d, reason: collision with root package name */
    @B
    public final k f49360d = new k();

    /* renamed from: e, reason: collision with root package name */
    @B
    public final k f49361e = new k();

    /* renamed from: f, reason: collision with root package name */
    @B
    public final ArrayDeque<MediaCodec.BufferInfo> f49362f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    @B
    public final ArrayDeque<MediaFormat> f49363g = new ArrayDeque<>();

    public g(HandlerThread handlerThread) {
        this.f49358b = handlerThread;
    }

    @B
    public final void a() {
        ArrayDeque<MediaFormat> arrayDeque = this.f49363g;
        if (!arrayDeque.isEmpty()) {
            this.f49365i = arrayDeque.getLast();
        }
        k kVar = this.f49360d;
        kVar.f49376a = 0;
        kVar.f49377b = -1;
        kVar.f49378c = 0;
        k kVar2 = this.f49361e;
        kVar2.f49376a = 0;
        kVar2.f49377b = -1;
        kVar2.f49378c = 0;
        this.f49362f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f49357a) {
            this.f49366j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i12) {
        synchronized (this.f49357a) {
            this.f49360d.a(i12);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i12, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f49357a) {
            try {
                MediaFormat mediaFormat = this.f49365i;
                if (mediaFormat != null) {
                    this.f49361e.a(-2);
                    this.f49363g.add(mediaFormat);
                    this.f49365i = null;
                }
                this.f49361e.a(i12);
                this.f49362f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f49357a) {
            this.f49361e.a(-2);
            this.f49363g.add(mediaFormat);
            this.f49365i = null;
        }
    }
}
