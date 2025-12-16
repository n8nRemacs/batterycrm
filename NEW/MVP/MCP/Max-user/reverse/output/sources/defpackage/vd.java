package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.webrtc.IceCandidate;

/* loaded from: classes.dex */
public final class vd implements lf7, qn6, v2f, rn6 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public vd() {
        this.a = 15;
        this.d = new Object();
    }

    public static boolean d(u75 u75Var, u75 u75Var2) {
        boolean zB = u75Var2.b();
        int i = u75Var2.a;
        z5j.f("Fully specified range is not actually fully specified.", zB);
        int i2 = u75Var.a;
        if (i2 == 2 && i == 1) {
            return false;
        }
        if (i2 != 2 && i2 != 0 && i2 != i) {
            return false;
        }
        int i3 = u75Var.b;
        return i3 == 0 || i3 == u75Var2.b;
    }

    public static boolean h(u75 u75Var, u75 u75Var2, HashSet hashSet) {
        if (hashSet.contains(u75Var2)) {
            return d(u75Var, u75Var2);
        }
        gri.a("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + u75Var + "\nCandidate dynamic range:\n  " + u75Var2);
        return false;
    }

    public static u75 k(u75 u75Var, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (u75Var.a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            u75 u75Var2 = (u75) it.next();
            z5j.e(u75Var2, "Fully specified DynamicRange cannot be null.");
            int i = u75Var2.a;
            z5j.f("Fully specified DynamicRange must have fully defined encoding.", u75Var2.b());
            if (i != 1 && h(u75Var, u75Var2, hashSet)) {
                return u75Var2;
            }
        }
        return null;
    }

    private final void p(Throwable th) {
    }

    public static void t(HashSet hashSet, u75 u75Var, iv6 iv6Var) {
        z5j.f("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set setC = ((y75) iv6Var.b).c(u75Var);
        if (setC.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setC);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + u75Var + "\nConstraints:\n  " + TextUtils.join("\n  ", setC) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    @Override // defpackage.qn6
    public void a(Object obj) {
        int i;
        switch (this.a) {
            case 3:
                Bitmap bitmap = (Bitmap) obj;
                nla nlaVar = (nla) this.c;
                if (!this.b) {
                    nlaVar.g(bitmap);
                    pz1 pz1Var = (pz1) this.d;
                    ao6 ao6Var = new ao6(nlaVar.a());
                    f29 f29Var = (f29) pz1Var.c;
                    f29Var.o.execute(new qe5(f29Var, pz1Var.b, (w69) pz1Var.d, ao6Var, 2));
                    break;
                }
                break;
            case 7:
                o79 o79Var = (o79) this.d;
                u69 u69Var = (u69) this.c;
                boolean z = this.b;
                rei.h(o79Var.t, (v69) obj);
                zxg.J(o79Var.t);
                if (z) {
                    o79Var.q(u69Var);
                    break;
                }
                break;
            case 8:
                v69 v69Var = (v69) obj;
                o79 o79Var2 = ((z79) this.d).g;
                Handler handler = o79Var2.l;
                u69 u69Var2 = (u69) this.c;
                zxg.a0(handler, new k79(o79Var2, u69Var2, new ul5(this, v69Var, this.b, u69Var2, 4)));
                break;
            case 10:
                if (!this.b) {
                    ((v2f) this.c).a(obj);
                    break;
                }
                break;
            default:
                wu1 wu1Var = (wu1) this.c;
                s1h s1hVar = (s1h) this.d;
                if (wu1Var == s1hVar.t && (i = s1hVar.v) != 3) {
                    int i2 = this.b ? 1 : 2;
                    if (i2 != i) {
                        s1hVar.v = i2;
                        s1hVar.L().c(i2);
                        break;
                    }
                }
                break;
        }
    }

    public void b(yi1 yi1Var, wpb wpbVar) {
        ((y6d) this.d).log("IceCandidatesHandler", "handle, participant=" + yi1Var + ", client=" + wpbVar);
        if (!this.b || !yi1Var.c() || wpbVar == null || !wpbVar.f0) {
            ((y6d) this.d).log("IceCandidatesHandler", "Cant apply ice candidates, isIceApplyPermitted=" + this.b + ", " + yi1Var + ", client=" + wpbVar);
            return;
        }
        ((y6d) this.d).log("IceCandidatesHandler", wpbVar + " is iceable for " + yi1Var);
        Map map = (Map) ((HashMap) this.c).get(yi1Var);
        if (map != null) {
            if (Objects.equals(yi1Var.k, yi1.t)) {
                ((y6d) this.d).log("IceCandidatesHandler", "push all ice candidates to " + wpbVar);
                for (Map.Entry entry : map.entrySet()) {
                    Iterator it = ((List) ((imb) entry.getValue()).a).iterator();
                    while (it.hasNext()) {
                        wpbVar.s((IceCandidate) it.next());
                    }
                    if (!((List) ((imb) entry.getValue()).b).isEmpty()) {
                        wpbVar.I((IceCandidate[]) ((List) ((imb) entry.getValue()).b).toArray(new IceCandidate[((List) ((imb) entry.getValue()).b).size()]));
                    }
                }
            } else {
                imb imbVar = (imb) map.get(yi1Var.k);
                if (imbVar != null) {
                    Iterator it2 = ((List) imbVar.a).iterator();
                    while (it2.hasNext()) {
                        wpbVar.s((IceCandidate) it2.next());
                    }
                    if (!((List) imbVar.b).isEmpty()) {
                        List list = (List) imbVar.b;
                        wpbVar.I((IceCandidate[]) list.toArray(new IceCandidate[list.size()]));
                    }
                }
            }
            map.clear();
        }
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        v2f v2fVar = (v2f) this.c;
        try {
            ((enb) this.d).accept(py4Var);
            v2fVar.c(py4Var);
        } catch (Throwable th) {
            raj.c(th);
            this.b = true;
            py4Var.dispose();
            cd5.d(th, v2fVar);
        }
    }

    @Override // defpackage.lf7
    public void close() {
        synchronized (this.d) {
            ((ImageReader) this.c).close();
        }
    }

    @Override // defpackage.lf7
    public jf7 e() {
        Image imageAcquireLatestImage;
        synchronized (this.d) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new sd(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.lf7
    public int f() {
        int imageFormat;
        synchronized (this.d) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.lf7
    public void g() {
        synchronized (this.d) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.lf7
    public int getHeight() {
        int height;
        synchronized (this.d) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    @Override // defpackage.lf7
    public Surface getSurface() {
        Surface surface;
        synchronized (this.d) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    @Override // defpackage.lf7
    public int getWidth() {
        int width;
        synchronized (this.d) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    @Override // defpackage.lf7
    public void i(final kf7 kf7Var, final Executor executor) {
        synchronized (this.d) {
            this.b = false;
            ((ImageReader) this.c).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: td
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    vd vdVar = this.a;
                    Executor executor2 = executor;
                    kf7 kf7Var2 = kf7Var;
                    synchronized (vdVar.d) {
                        try {
                            if (!vdVar.b) {
                                executor2.execute(new ud(vdVar, 0, kf7Var2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, cn8.b());
        }
    }

    public void j() throws MediaCodec.CryptoException {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = ((MediaCodec) this.c).dequeueOutputBuffer(bufferInfo, WorkRequest.MIN_BACKOFF_MILLIS);
        if (this.b) {
            int iDequeueInputBuffer = ((MediaCodec) this.c).dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
            if (iDequeueInputBuffer >= 0) {
                ((MediaCodec) this.c).queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                this.b = false;
            } else {
                this.b = true;
            }
        }
        if (iDequeueOutputBuffer == -3 || iDequeueOutputBuffer == -2 || iDequeueOutputBuffer == -1) {
            return;
        }
        if (iDequeueOutputBuffer < 0) {
            wqi.e("vd", "unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, null);
            return;
        }
        boolean z = bufferInfo.size != 0;
        ((MediaCodec) this.c).releaseOutputBuffer(iDequeueOutputBuffer, z);
        v2h v2hVar = (v2h) this.d;
        if (v2hVar != null) {
            if (z) {
                long j = bufferInfo.presentationTimeUs;
                long j2 = v2hVar.x;
                if (j >= j2) {
                    if (j >= v2hVar.y) {
                        v2hVar.m = true;
                    } else {
                        bufferInfo.presentationTimeUs = j - j2;
                        ywf ywfVar = v2hVar.i;
                        EGLDisplay eGLDisplay = (EGLDisplay) ywfVar.a;
                        EGLSurface eGLSurface = (EGLSurface) ywfVar.c;
                        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) ywfVar.b)) {
                            throw new RuntimeException("eglMakeCurrent failed");
                        }
                        lkb lkbVar = v2hVar.g;
                        synchronized (lkbVar.c) {
                            while (!lkbVar.d) {
                                try {
                                    lkbVar.c.wait(500L);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            lkbVar.d = false;
                        }
                        lkbVar.o.getClass();
                        p6g.a("before updateTexImage");
                        lkbVar.a.updateTexImage();
                        lkb lkbVar2 = v2hVar.g;
                        lkbVar2.getClass();
                        p6g p6gVar = lkbVar2.o;
                        SurfaceTexture surfaceTexture = lkbVar2.a;
                        FloatBuffer floatBuffer = p6gVar.a;
                        float[] fArr = p6gVar.c;
                        float f = p6gVar.j;
                        float[] fArr2 = p6gVar.b;
                        p6g.a("onDrawFrame start");
                        if (surfaceTexture != null) {
                            surfaceTexture.getTransformMatrix(fArr);
                        }
                        if (p6gVar.k) {
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            GLES20.glClear(16640);
                        }
                        GLES20.glUseProgram(p6gVar.d);
                        p6g.a("glUseProgram");
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(36197, p6gVar.e);
                        floatBuffer.position(0);
                        GLES20.glVertexAttribPointer(p6gVar.h, 3, 5126, false, 20, (Buffer) p6gVar.a);
                        p6g.a("glVertexAttribPointer maPosition");
                        GLES20.glEnableVertexAttribArray(p6gVar.h);
                        p6g.a("glEnableVertexAttribArray maPositionHandle");
                        floatBuffer.position(3);
                        GLES20.glVertexAttribPointer(p6gVar.i, 2, 5126, false, 20, (Buffer) p6gVar.a);
                        p6g.a("glVertexAttribPointer maTextureHandle");
                        GLES20.glEnableVertexAttribArray(p6gVar.i);
                        p6g.a("glEnableVertexAttribArray maTextureHandle");
                        Matrix.setIdentityM(fArr2, 0);
                        if (f != 1.0f) {
                            Matrix.scaleM(fArr2, 0, 1.0f, f, 1.0f);
                        }
                        GLES20.glUniformMatrix4fv(p6gVar.f, 1, false, fArr2, 0);
                        GLES20.glUniformMatrix4fv(p6gVar.g, 1, false, fArr, 0);
                        GLES20.glDrawArrays(5, 0, 4);
                        p6g.a("glDrawArrays");
                        GLES20.glFinish();
                        ywf ywfVar2 = v2hVar.i;
                        EGLExt.eglPresentationTimeANDROID((EGLDisplay) ywfVar2.a, (EGLSurface) ywfVar2.c, bufferInfo.presentationTimeUs * 1000);
                        ywf ywfVar3 = v2hVar.i;
                        EGL14.eglSwapBuffers((EGLDisplay) ywfVar3.a, (EGLSurface) ywfVar3.c);
                    }
                }
            }
            if ((bufferInfo.flags & 4) != 0) {
                v2h v2hVar2 = (v2h) this.d;
                ((MediaCodec) v2hVar2.h.b).signalEndOfInputStream();
                MediaCodec mediaCodec = (MediaCodec) v2hVar2.f.c;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                }
                MediaCodec mediaCodec2 = (MediaCodec) v2hVar2.f.c;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
                v2hVar2.i.s();
                v2hVar2.k = true;
            }
        }
    }

    public SharedPreferences l() {
        this.b = true;
        return ((Context) this.c).getSharedPreferences("tracer-" + ((String) this.d), 0);
    }

    @Override // defpackage.lf7
    public int m() {
        int maxImages;
        synchronized (this.d) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.lf7
    public jf7 n() {
        Image imageAcquireNextImage;
        synchronized (this.d) {
            try {
                imageAcquireNextImage = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new sd(imageAcquireNextImage);
        }
    }

    public boolean o() {
        if (!this.b && fni.a(Looper.myLooper(), Looper.getMainLooper())) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis < l().getLong("system.shutdown.until.ts", Long.MIN_VALUE) || jCurrentTimeMillis < l().getLong("system.CRASH_REPORT.shutdown.until.ts", Long.MIN_VALUE);
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        if (this.b) {
            t8j.a(th);
        } else {
            ((v2f) this.c).onError(th);
        }
    }

    @Override // defpackage.qn6
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 3:
                if (!this.b) {
                    a8i.l("NotificationProvider", "Failed to load bitmap: " + th.getMessage());
                    break;
                }
                break;
            case 7:
                o79 o79Var = (o79) this.d;
                if (th instanceof UnsupportedOperationException) {
                    a8i.m("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    a8i.h("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                zxg.J(o79Var.t);
                if (this.b) {
                    o79Var.q((u69) this.c);
                    break;
                }
                break;
            case 8:
                break;
            default:
                if (!(th instanceof CancellationException)) {
                    gri.c("VideoCapture", "Surface update completed with unexpected exception", th);
                    break;
                }
                break;
        }
    }

    public void q() {
        kyd kydVar = (kyd) this.c;
        l48 l48VarP = kydVar.p();
        if (l48VarP.d != l38.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        l48VarP.a(new nhd(0, kydVar));
        pn pnVar = (pn) this.d;
        if (pnVar.c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        l48VarP.a(new npd(1, pnVar));
        pnVar.c = true;
        this.b = true;
    }

    public void r(Bundle bundle) {
        if (!this.b) {
            q();
        }
        l48 l48VarP = ((kyd) this.c).p();
        if (l48VarP.d.a(l38.d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + l48VarP.d).toString());
        }
        pn pnVar = (pn) this.d;
        if (!pnVar.c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (pnVar.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        pnVar.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        pnVar.d = true;
    }

    public void s(Bundle bundle) {
        pn pnVar = (pn) this.d;
        pnVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) pnVar.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        rwd rwdVar = (rwd) pnVar.f;
        rwdVar.getClass();
        pwd pwdVar = new pwd(rwdVar);
        rwdVar.c.put(pwdVar, Boolean.FALSE);
        while (pwdVar.hasNext()) {
            Map.Entry entry = (Map.Entry) pwdVar.next();
            bundle2.putBundle((String) entry.getKey(), ((jyd) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void u(p5j p5jVar) {
        synchronized (this.d) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(p5jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(Task task) {
        p5j p5jVar;
        synchronized (this.d) {
            if (((ArrayDeque) this.c) != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.d) {
                        try {
                            p5jVar = (p5j) ((ArrayDeque) this.c).poll();
                            if (p5jVar == null) {
                                this.b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    p5jVar.c(task);
                }
            }
        }
    }

    public /* synthetic */ vd(int i) {
        this.a = i;
    }

    public /* synthetic */ vd(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ vd(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.b = z;
    }

    public vd(yi1 yi1Var, boolean z, fje fjeVar) {
        this.a = 13;
        this.c = yi1Var;
        this.b = z;
        this.d = fjeVar;
    }

    public vd(y6d y6dVar) {
        this.a = 14;
        this.c = new HashMap();
        this.d = y6dVar;
    }

    public vd(String str, MediaFormat mediaFormat, lkb lkbVar, v2h v2hVar) throws IOException {
        this.a = 2;
        this.b = false;
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(str);
        this.c = mediaCodecCreateDecoderByType;
        wqi.c("vd", mediaFormat.toString(), new Object[0]);
        mediaCodecCreateDecoderByType.configure(mediaFormat, lkbVar.b, (MediaCrypto) null, 0);
        mediaCodecCreateDecoderByType.start();
        this.d = v2hVar;
    }

    public vd(kyd kydVar) {
        this.a = 9;
        this.c = kydVar;
        this.d = new pn();
    }

    public vd(Context context, Handler handler, xl5 xl5Var) {
        this.a = 1;
        this.c = context.getApplicationContext();
        this.d = new n20(this, handler, xl5Var);
    }

    public vd(ImageReader imageReader) {
        this.a = 0;
        this.d = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public vd(i12 i12Var) {
        this.a = 4;
        this.c = i12Var;
        this.d = iv6.o(i12Var);
        int[] iArr = (int[]) i12Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.b = z;
    }

    public vd(o79 o79Var, u69 u69Var, boolean z, o3c o3cVar) {
        this.a = 7;
        this.d = o79Var;
        this.c = u69Var;
        this.b = z;
    }
}
