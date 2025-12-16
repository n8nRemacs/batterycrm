package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

@j.X
/* loaded from: classes8.dex */
final class fc extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f385268b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f385269c;

    /* renamed from: h, reason: collision with root package name */
    @j.B
    @j.P
    private MediaFormat f385274h;

    /* renamed from: i, reason: collision with root package name */
    @j.B
    @j.P
    private MediaFormat f385275i;

    /* renamed from: j, reason: collision with root package name */
    @j.B
    @j.P
    private MediaCodec.CodecException f385276j;

    /* renamed from: k, reason: collision with root package name */
    @j.B
    private long f385277k;

    /* renamed from: l, reason: collision with root package name */
    @j.B
    private boolean f385278l;

    /* renamed from: m, reason: collision with root package name */
    @j.B
    @j.P
    private IllegalStateException f385279m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f385267a = new Object();

    /* renamed from: d, reason: collision with root package name */
    @j.B
    private final f70 f385270d = new f70();

    /* renamed from: e, reason: collision with root package name */
    @j.B
    private final f70 f385271e = new f70();

    /* renamed from: f, reason: collision with root package name */
    @j.B
    private final ArrayDeque<MediaCodec.BufferInfo> f385272f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    @j.B
    private final ArrayDeque<MediaFormat> f385273g = new ArrayDeque<>();

    public fc(HandlerThread handlerThread) {
        this.f385268b = handlerThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.f385267a) {
            try {
                if (this.f385278l) {
                    return;
                }
                long j12 = this.f385277k - 1;
                this.f385277k = j12;
                if (j12 > 0) {
                    return;
                }
                if (j12 < 0) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    synchronized (this.f385267a) {
                        this.f385279m = illegalStateException;
                    }
                    return;
                }
                if (!this.f385273g.isEmpty()) {
                    this.f385275i = this.f385273g.getLast();
                }
                this.f385270d.a();
                this.f385271e.a();
                this.f385272f.clear();
                this.f385273g.clear();
                this.f385276j = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f385267a) {
            this.f385277k++;
            Handler handler = this.f385269c;
            int i12 = pc1.f388768a;
            handler.post(new J(this, 0));
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f385267a) {
            try {
                mediaFormat = this.f385274h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.f385267a) {
            try {
                this.f385278l = true;
                this.f385268b.quit();
                if (!this.f385273g.isEmpty()) {
                    this.f385275i = this.f385273g.getLast();
                }
                this.f385270d.a();
                this.f385271e.a();
                this.f385272f.clear();
                this.f385273g.clear();
                this.f385276j = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f385267a) {
            this.f385276j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i12) {
        synchronized (this.f385267a) {
            this.f385270d.a(i12);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i12, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f385267a) {
            try {
                MediaFormat mediaFormat = this.f385275i;
                if (mediaFormat != null) {
                    this.f385271e.a(-2);
                    this.f385273g.add(mediaFormat);
                    this.f385275i = null;
                }
                this.f385271e.a(i12);
                this.f385272f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f385267a) {
            this.f385271e.a(-2);
            this.f385273g.add(mediaFormat);
            this.f385275i = null;
        }
    }

    public final void a(MediaCodec mediaCodec) {
        db.b(this.f385269c == null);
        this.f385268b.start();
        Handler handler = new Handler(this.f385268b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f385269c = handler;
    }

    public final int a() {
        synchronized (this.f385267a) {
            try {
                int iC2 = -1;
                if (this.f385277k <= 0 && !this.f385278l) {
                    IllegalStateException illegalStateException = this.f385279m;
                    if (illegalStateException == null) {
                        MediaCodec.CodecException codecException = this.f385276j;
                        if (codecException == null) {
                            if (!this.f385270d.b()) {
                                iC2 = this.f385270d.c();
                            }
                            return iC2;
                        }
                        this.f385276j = null;
                        throw codecException;
                    }
                    this.f385279m = null;
                    throw illegalStateException;
                }
                return -1;
            } finally {
            }
        }
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f385267a) {
            try {
                if (this.f385277k <= 0 && !this.f385278l) {
                    IllegalStateException illegalStateException = this.f385279m;
                    if (illegalStateException == null) {
                        MediaCodec.CodecException codecException = this.f385276j;
                        if (codecException == null) {
                            if (this.f385271e.b()) {
                                return -1;
                            }
                            int iC2 = this.f385271e.c();
                            if (iC2 >= 0) {
                                db.b(this.f385274h);
                                MediaCodec.BufferInfo bufferInfoRemove = this.f385272f.remove();
                                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                            } else if (iC2 == -2) {
                                this.f385274h = this.f385273g.remove();
                            }
                            return iC2;
                        }
                        this.f385276j = null;
                        throw codecException;
                    }
                    this.f385279m = null;
                    throw illegalStateException;
                }
                return -1;
            } finally {
            }
        }
    }
}
