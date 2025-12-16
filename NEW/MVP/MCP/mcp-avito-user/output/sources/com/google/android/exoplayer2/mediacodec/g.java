package com.google.android.exoplayer2.mediacodec;

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
/* loaded from: classes6.dex */
final class g extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f345580b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f345581c;

    /* renamed from: h, reason: collision with root package name */
    @B
    @P
    public MediaFormat f345586h;

    /* renamed from: i, reason: collision with root package name */
    @B
    @P
    public MediaFormat f345587i;

    /* renamed from: j, reason: collision with root package name */
    @B
    @P
    public MediaCodec.CodecException f345588j;

    /* renamed from: k, reason: collision with root package name */
    @B
    public long f345589k;

    /* renamed from: l, reason: collision with root package name */
    @B
    public boolean f345590l;

    /* renamed from: m, reason: collision with root package name */
    @B
    @P
    public IllegalStateException f345591m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f345579a = new Object();

    /* renamed from: d, reason: collision with root package name */
    @B
    public final k f345582d = new k();

    /* renamed from: e, reason: collision with root package name */
    @B
    public final k f345583e = new k();

    /* renamed from: f, reason: collision with root package name */
    @B
    public final ArrayDeque<MediaCodec.BufferInfo> f345584f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    @B
    public final ArrayDeque<MediaFormat> f345585g = new ArrayDeque<>();

    public g(HandlerThread handlerThread) {
        this.f345580b = handlerThread;
    }

    @B
    public final void a() {
        ArrayDeque<MediaFormat> arrayDeque = this.f345585g;
        if (!arrayDeque.isEmpty()) {
            this.f345587i = arrayDeque.getLast();
        }
        k kVar = this.f345582d;
        kVar.f345598a = 0;
        kVar.f345599b = -1;
        kVar.f345600c = 0;
        k kVar2 = this.f345583e;
        kVar2.f345598a = 0;
        kVar2.f345599b = -1;
        kVar2.f345600c = 0;
        this.f345584f.clear();
        arrayDeque.clear();
        this.f345588j = null;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f345579a) {
            this.f345588j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i12) {
        synchronized (this.f345579a) {
            this.f345582d.a(i12);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i12, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f345579a) {
            try {
                MediaFormat mediaFormat = this.f345587i;
                if (mediaFormat != null) {
                    this.f345583e.a(-2);
                    this.f345585g.add(mediaFormat);
                    this.f345587i = null;
                }
                this.f345583e.a(i12);
                this.f345584f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f345579a) {
            this.f345583e.a(-2);
            this.f345585g.add(mediaFormat);
            this.f345587i = null;
        }
    }
}
