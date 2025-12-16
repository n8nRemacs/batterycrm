package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import androidx.work.WorkRequest;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.EglBase;

/* loaded from: classes2.dex */
public final class v2h {
    public ByteBuffer a;
    public MediaExtractor b;
    public r9a c;
    public vd f;
    public lkb g;
    public jdc h;
    public ywf i;
    public final Context o;
    public final yi5 p;
    public final Uri q;
    public final String r;
    public final float s;
    public final float t;
    public final isc u;
    public final boolean v;
    public final s6b w;
    public long x;
    public long y;
    public int d = -1;
    public int e = -1;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    public v2h(Context context, yi5 yi5Var, Uri uri, String str, float f, float f2, isc iscVar, boolean z, s6b s6bVar) {
        this.o = context;
        this.p = yi5Var;
        this.q = uri;
        this.r = str;
        this.s = f;
        this.t = f2;
        this.u = iscVar;
        this.v = z;
        this.w = s6bVar;
    }

    public static boolean a(Context context, yi5 yi5Var, Uri uri, String str, float f, float f2, isc iscVar, boolean z, s6b s6bVar) {
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        MediaCodec mediaCodec3;
        MediaCodec mediaCodec4;
        MediaCodec mediaCodec5;
        MediaCodec mediaCodec6;
        MediaCodec mediaCodec7;
        MediaCodec mediaCodec8;
        v2h v2hVar = new v2h(context, yi5Var, uri, str, f, f2, iscVar, z, s6bVar);
        wqi.c("v2h", "Start convert with parameters: \nsrcUri: %s\ndstPath: %s\nstartPosition: %f\nendPosition: %f\nquality: %s\nmute: %s", uri, str, Float.valueOf(f), Float.valueOf(f2), iscVar, Boolean.valueOf(z));
        try {
        } catch (Throwable th) {
            try {
                if (th instanceof InterruptedException) {
                    wqi.e("v2h", "execute: interrupted", null);
                    throw th;
                }
                if ((th instanceof RuntimeException) && (th.getCause() instanceof InterruptedException)) {
                    wqi.e("v2h", "execute: interrupted", null);
                    throw ((InterruptedException) th.getCause());
                }
                wqi.b("v2h", "failed to convert video", th);
                ((y3b) v2hVar.p).a(new IllegalStateException("failed to convert video", th));
                jdc jdcVar = v2hVar.h;
                if (jdcVar != null && (mediaCodec4 = (MediaCodec) jdcVar.b) != null) {
                    mediaCodec4.release();
                }
                vd vdVar = v2hVar.f;
                if (vdVar != null && (mediaCodec3 = (MediaCodec) vdVar.c) != null) {
                    mediaCodec3.release();
                }
                MediaExtractor mediaExtractor = v2hVar.b;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                r9a r9aVar = v2hVar.c;
                if (r9aVar != null) {
                    ((MediaMuxer) r9aVar.f).release();
                }
                ywf ywfVar = v2hVar.i;
                if (ywfVar != null && ((Surface) ywfVar.d) != null) {
                    ywfVar.s();
                }
                lkb lkbVar = v2hVar.g;
                if (lkbVar != null && lkbVar.b != null) {
                    lkbVar.a();
                }
            } catch (Throwable th2) {
                jdc jdcVar2 = v2hVar.h;
                if (jdcVar2 != null && (mediaCodec2 = (MediaCodec) jdcVar2.b) != null) {
                    mediaCodec2.release();
                }
                vd vdVar2 = v2hVar.f;
                if (vdVar2 != null && (mediaCodec = (MediaCodec) vdVar2.c) != null) {
                    mediaCodec.release();
                }
                MediaExtractor mediaExtractor2 = v2hVar.b;
                if (mediaExtractor2 != null) {
                    mediaExtractor2.release();
                }
                r9a r9aVar2 = v2hVar.c;
                if (r9aVar2 != null) {
                    ((MediaMuxer) r9aVar2.f).release();
                }
                ywf ywfVar2 = v2hVar.i;
                if (ywfVar2 != null && ((Surface) ywfVar2.d) != null) {
                    ywfVar2.s();
                }
                lkb lkbVar2 = v2hVar.g;
                if (lkbVar2 != null && lkbVar2.b != null) {
                    lkbVar2.a();
                }
                throw th2;
            }
        }
        if (!v2hVar.b()) {
            wqi.e("v2h", "execute: failed to init recorder", null);
            jdc jdcVar3 = v2hVar.h;
            if (jdcVar3 != null && (mediaCodec8 = (MediaCodec) jdcVar3.b) != null) {
                mediaCodec8.release();
            }
            vd vdVar3 = v2hVar.f;
            if (vdVar3 != null && (mediaCodec7 = (MediaCodec) vdVar3.c) != null) {
                mediaCodec7.release();
            }
            MediaExtractor mediaExtractor3 = v2hVar.b;
            if (mediaExtractor3 != null) {
                mediaExtractor3.release();
            }
            r9a r9aVar3 = v2hVar.c;
            if (r9aVar3 != null) {
                ((MediaMuxer) r9aVar3.f).release();
            }
            ywf ywfVar3 = v2hVar.i;
            if (ywfVar3 != null && ((Surface) ywfVar3.d) != null) {
                ywfVar3.s();
            }
            lkb lkbVar3 = v2hVar.g;
            if (lkbVar3 != null && lkbVar3.b != null) {
                lkbVar3.a();
                return false;
            }
            return false;
        }
        long j = v2hVar.x;
        if (j > 0) {
            v2hVar.b.seekTo(j, 0);
        } else {
            v2hVar.b.seekTo(0L, 0);
        }
        while (!v2hVar.l) {
            while (true) {
                if (v2hVar.j) {
                    break;
                }
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException("conversion is interrupted");
                }
                int sampleTrackIndex = v2hVar.b.getSampleTrackIndex();
                if (sampleTrackIndex != -1 && (!v2hVar.n || !v2hVar.m)) {
                    if (sampleTrackIndex == v2hVar.d) {
                        vd vdVar4 = v2hVar.f;
                        MediaExtractor mediaExtractor4 = v2hVar.b;
                        MediaCodec mediaCodec9 = (MediaCodec) vdVar4.c;
                        int iDequeueInputBuffer = mediaCodec9.dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
                        if (iDequeueInputBuffer >= 0) {
                            ((MediaCodec) vdVar4.c).queueInputBuffer(iDequeueInputBuffer, 0, mediaExtractor4.readSampleData(mediaCodec9.getInputBuffer(iDequeueInputBuffer), 0), mediaExtractor4.getSampleTime(), 0);
                            mediaExtractor4.advance();
                        }
                    } else {
                        int i = v2hVar.e;
                        if (sampleTrackIndex != i || i == -1) {
                            v2hVar.b.advance();
                        } else {
                            if (z || v2hVar.b.getSampleTime() >= v2hVar.y) {
                                v2hVar.n = true;
                            } else if (v2hVar.b.getSampleTime() > v2hVar.x) {
                                v2hVar.a.rewind();
                                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                bufferInfo.offset = 0;
                                bufferInfo.size = v2hVar.b.readSampleData(v2hVar.a, 0);
                                bufferInfo.presentationTimeUs = v2hVar.b.getSampleTime();
                                bufferInfo.flags = v2hVar.b.getSampleFlags();
                                bufferInfo.presentationTimeUs -= v2hVar.x;
                                r9a r9aVar4 = v2hVar.c;
                                ByteBuffer byteBuffer = v2hVar.a;
                                MediaMuxer mediaMuxer = (MediaMuxer) r9aVar4.f;
                                if (r9aVar4.b()) {
                                    if (!r9aVar4.c) {
                                        mediaMuxer.start();
                                        r9aVar4.c = true;
                                    }
                                    r9aVar4.a();
                                    mediaMuxer.writeSampleData(r9aVar4.b, byteBuffer, bufferInfo);
                                } else {
                                    ((ArrayList) r9aVar4.g).add(new q9a(r9aVar4.b, byteBuffer, bufferInfo));
                                }
                            }
                            v2hVar.b.advance();
                        }
                    }
                }
                v2hVar.j = true;
                v2hVar.b.release();
                vd vdVar5 = v2hVar.f;
                int iDequeueInputBuffer2 = ((MediaCodec) vdVar5.c).dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
                if (iDequeueInputBuffer2 >= 0) {
                    ((MediaCodec) vdVar5.c).queueInputBuffer(iDequeueInputBuffer2, 0, 0, 0L, 4);
                    vdVar5.b = false;
                } else {
                    vdVar5.b = true;
                }
            }
            if (!v2hVar.k) {
                v2hVar.f.j();
            }
            if (!v2hVar.l) {
                v2hVar.h.g();
            }
        }
        jdc jdcVar4 = v2hVar.h;
        if (jdcVar4 != null && (mediaCodec6 = (MediaCodec) jdcVar4.b) != null) {
            mediaCodec6.release();
        }
        vd vdVar6 = v2hVar.f;
        if (vdVar6 != null && (mediaCodec5 = (MediaCodec) vdVar6.c) != null) {
            mediaCodec5.release();
        }
        MediaExtractor mediaExtractor5 = v2hVar.b;
        if (mediaExtractor5 != null) {
            mediaExtractor5.release();
        }
        r9a r9aVar5 = v2hVar.c;
        if (r9aVar5 != null) {
            ((MediaMuxer) r9aVar5.f).release();
        }
        ywf ywfVar4 = v2hVar.i;
        if (ywfVar4 != null && ((Surface) ywfVar4.d) != null) {
            ywfVar4.s();
        }
        lkb lkbVar4 = v2hVar.g;
        if (lkbVar4 != null && lkbVar4.b != null) {
            lkbVar4.a();
        }
        wqi.c("v2h", "Video convert successfully done", new Object[0]);
        return true;
    }

    public final boolean b() throws IOException {
        int integer;
        File parentFile;
        this.a = ByteBuffer.allocate(262144);
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.b = mediaExtractor;
        mediaExtractor.setDataSource(this.o, this.q, (Map<String, String>) null);
        String str = this.r;
        File file = new File(str);
        if (!file.exists() && (parentFile = file.getParentFile()) != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        r9a r9aVar = new r9a();
        r9aVar.c = false;
        r9aVar.a = -1;
        r9aVar.b = -1;
        r9aVar.d = false;
        r9aVar.e = false;
        r9aVar.g = new ArrayList();
        r9aVar.f = new MediaMuxer(str, 0);
        this.c = r9aVar;
        int trackCount = this.b.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = this.b.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            wqi.c("v2h", string, new Object[0]);
            wqi.c("v2h", trackFormat.toString(), new Object[0]);
            this.b.selectTrack(i);
            if (string.startsWith("video/")) {
                this.d = i;
                float f = trackFormat.getLong("durationUs");
                this.x = (long) (this.s * f);
                this.y = (long) (f * this.t);
                isc iscVar = this.u;
                int i2 = iscVar.b;
                int i3 = iscVar.c;
                int i4 = i2 - (i2 % 4);
                int i5 = i3 - (i3 % 4);
                try {
                    integer = trackFormat.getInteger("frame-rate");
                } catch (Throwable unused) {
                    integer = 15;
                }
                jdc jdcVar = new jdc(i4, i5, integer, iscVar.d, this);
                this.h = jdcVar;
                Surface surface = (Surface) jdcVar.d;
                ywf ywfVar = new ywf();
                ywfVar.a = EGL14.EGL_NO_DISPLAY;
                ywfVar.b = EGL14.EGL_NO_CONTEXT;
                ywfVar.c = EGL14.EGL_NO_SURFACE;
                surface.getClass();
                ywfVar.d = surface;
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                ywfVar.a = eGLDisplayEglGetDisplay;
                if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("unable to get EGL14 display");
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                    ywfVar.a = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig((EGLDisplay) ywfVar.a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
                }
                ywfVar.b = EGL14.eglCreateContext((EGLDisplay) ywfVar.a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                ywf.j("eglCreateContext");
                if (((EGLContext) ywfVar.b) == null) {
                    throw new RuntimeException("null context");
                }
                ywfVar.c = EGL14.eglCreateWindowSurface((EGLDisplay) ywfVar.a, eGLConfigArr[0], (Surface) ywfVar.d, new int[]{12344}, 0);
                ywf.j("eglCreateWindowSurface");
                EGLSurface eGLSurface = (EGLSurface) ywfVar.c;
                if (eGLSurface == null) {
                    throw new RuntimeException("surface was null");
                }
                this.i = ywfVar;
                if (!EGL14.eglMakeCurrent((EGLDisplay) ywfVar.a, eGLSurface, eGLSurface, (EGLContext) ywfVar.b)) {
                    throw new RuntimeException("eglMakeCurrent failed");
                }
                this.g = new lkb();
                this.f = new vd(string, trackFormat, this.g, this);
                this.c.d = true;
            } else if (string.startsWith("audio/")) {
                this.e = i;
                if (this.v) {
                    this.c.e = false;
                } else {
                    r9a r9aVar2 = this.c;
                    r9aVar2.e = true;
                    r9aVar2.b = ((MediaMuxer) r9aVar2.f).addTrack(trackFormat);
                }
            }
            if (this.e != -1 && this.d != -1) {
                break;
            }
        }
        return this.d != -1;
    }
}
