package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.yandex.mobile.ads.impl.ac0;
import com.yandex.mobile.ads.impl.dc;
import java.nio.ByteBuffer;

@j.X
/* loaded from: classes8.dex */
final class dc implements ac0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f384571a;

    /* renamed from: b, reason: collision with root package name */
    private final fc f384572b;

    /* renamed from: c, reason: collision with root package name */
    private final ec f384573c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f384574d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f384575e;

    /* renamed from: f, reason: collision with root package name */
    private int f384576f;

    public static final class a implements ac0.b {

        /* renamed from: a, reason: collision with root package name */
        private final z71<HandlerThread> f384577a;

        /* renamed from: b, reason: collision with root package name */
        private final z71<HandlerThread> f384578b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(final int i12) {
            final int i13 = 0;
            final int i14 = 1;
            this(new z71() { // from class: com.yandex.mobile.ads.impl.G
                @Override // com.yandex.mobile.ads.impl.z71
                public final Object get() {
                    switch (i13) {
                        case 0:
                            return dc.a.a(i12);
                        default:
                            return dc.a.b(i12);
                    }
                }
            }, new z71() { // from class: com.yandex.mobile.ads.impl.G
                @Override // com.yandex.mobile.ads.impl.z71
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return dc.a.a(i12);
                        default:
                            return dc.a.b(i12);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread b(int i12) {
            return new HandlerThread(dc.d(i12));
        }

        @j.k0
        public a(z71 z71Var, z71 z71Var2) {
            this.f384577a = z71Var;
            this.f384578b = z71Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread a(int i12) {
            return new HandlerThread(dc.e(i12));
        }

        @Override // com.yandex.mobile.ads.impl.ac0.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final dc a(ac0.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            dc dcVar;
            String str = aVar.f383458a.f384886a;
            dc dcVar2 = null;
            try {
                r91.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    dcVar = new dc(mediaCodecCreateByCodecName, this.f384577a.get(), this.f384578b.get(), false, 0);
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
                mediaCodecCreateByCodecName = null;
            }
            try {
                r91.a();
                dc.a(dcVar, aVar.f383459b, aVar.f383461d, aVar.f383462e);
                return dcVar;
            } catch (Exception e14) {
                e = e14;
                dcVar2 = dcVar;
                if (dcVar2 != null) {
                    dcVar2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }
    }

    public /* synthetic */ dc(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z12, int i12) {
        this(mediaCodec, handlerThread, handlerThread2, z12);
    }

    public static String d(int i12) {
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
        if (i12 == 1) {
            sb2.append("Audio");
        } else if (i12 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i12);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public static String e(int i12) {
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
        if (i12 == 1) {
            sb2.append("Audio");
        } else if (i12 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i12);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final MediaFormat b() {
        return this.f384572b.c();
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final int c() {
        return this.f384572b.a();
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void flush() {
        this.f384573c.a();
        this.f384571a.flush();
        this.f384572b.b();
        this.f384571a.start();
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void release() {
        try {
            if (this.f384576f == 1) {
                this.f384573c.b();
                this.f384572b.e();
            }
            this.f384576f = 2;
            if (this.f384575e) {
                return;
            }
            this.f384571a.release();
            this.f384575e = true;
        } catch (Throwable th2) {
            if (!this.f384575e) {
                this.f384571a.release();
                this.f384575e = true;
            }
            throw th2;
        }
    }

    private dc(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z12) {
        this.f384571a = mediaCodec;
        this.f384572b = new fc(handlerThread);
        this.f384573c = new ec(mediaCodec, handlerThread2);
        this.f384574d = z12;
        this.f384576f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    @j.P
    public final ByteBuffer b(int i12) {
        return this.f384571a.getInputBuffer(i12);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    @j.P
    public final ByteBuffer c(int i12) {
        return this.f384571a.getOutputBuffer(i12);
    }

    public static void a(dc dcVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        dcVar.f384572b.a(dcVar.f384571a);
        r91.a("configureCodec");
        dcVar.f384571a.configure(mediaFormat, surface, mediaCrypto, 0);
        r91.a();
        dcVar.f384573c.c();
        r91.a("startCodec");
        dcVar.f384571a.start();
        r91.a();
        dcVar.f384576f = 1;
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(int i12, int i13, long j12, int i14) {
        this.f384573c.a(i12, i13, j12, i14);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(int i12, um umVar, long j12) {
        this.f384573c.a(i12, umVar, j12);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(boolean z12, int i12) {
        this.f384571a.releaseOutputBuffer(i12, z12);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(int i12, long j12) {
        this.f384571a.releaseOutputBuffer(i12, j12);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f384572b.a(bufferInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ac0.c cVar, MediaCodec mediaCodec, long j12, long j13) {
        cVar.a(j12);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(ac0.c cVar, Handler handler) {
        if (this.f384574d) {
            try {
                this.f384573c.d();
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e12);
            }
        }
        this.f384571a.setOnFrameRenderedListener(new F(this, cVar, 0), handler);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(Surface surface) {
        if (this.f384574d) {
            try {
                this.f384573c.d();
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e12);
            }
        }
        this.f384571a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(Bundle bundle) {
        if (this.f384574d) {
            try {
                this.f384573c.d();
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e12);
            }
        }
        this.f384571a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(int i12) {
        if (this.f384574d) {
            try {
                this.f384573c.d();
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e12);
            }
        }
        this.f384571a.setVideoScalingMode(i12);
    }
}
