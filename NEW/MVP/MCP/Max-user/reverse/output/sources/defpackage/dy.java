package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class dy implements kw8, wqa {
    public Object X;
    public Object Y;
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object o;

    public dy(Class cls, int i) {
        this.a = 4;
        this.b = i;
        this.d = cls;
        this.o = new Rect();
        this.X = new ArrayList();
        this.Y = new WeakReference(null);
    }

    public static void a(dy dyVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        sa9 sa9Var;
        LoudnessCodecController loudnessCodecController;
        ky kyVar = (ky) dyVar.o;
        MediaCodec mediaCodec = (MediaCodec) dyVar.d;
        HandlerThread handlerThread = kyVar.b;
        hsi.g(kyVar.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(kyVar, handler);
        kyVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((nw8) dyVar.X).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (sa9Var = (sa9) dyVar.Y) != null && ((loudnessCodecController = (LoudnessCodecController) sa9Var.c) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            hsi.g(((HashSet) sa9Var.a).add(mediaCodec));
        }
        dyVar.b = 1;
    }

    public static final void c(hih hihVar, View view, ViewTreeObserver viewTreeObserver) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(hihVar);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(hihVar);
        }
    }

    public static void e(int i, int i2, String str) throws GlUtil$GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        guf.e(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        guf.d();
    }

    public static String u(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public void A(int i, Object obj) {
        synchronized (this.d) {
            try {
                kee keeVar = (kee) ((us) this.o).remove(Integer.valueOf(i));
                if (keeVar != null) {
                    if (keeVar.s0.getClass() == obj.getClass()) {
                        keeVar.k(obj);
                    } else {
                        a8i.l("SequencedFutureManager", "Type mismatch, expected " + keeVar.s0.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((gy8) this.X) != null && ((us) this.o).isEmpty()) {
                    release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(int i, String str) {
        ou6 ou6Var = (ou6) ((HashMap) this.Y).get(str);
        ou6Var.getClass();
        ou6Var.d[0] = i;
    }

    public void C(int i, int i2, String str) {
        ou6 ou6Var = (ou6) ((HashMap) this.Y).get(str);
        ou6Var.getClass();
        ou6Var.e = i;
        ou6Var.f = i2;
    }

    public void D(Object obj) {
        Iterator it;
        int i;
        synchronized (this.d) {
            try {
                if (Objects.equals(((AtomicReference) this.o).getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.b + 1;
                this.b = i2;
                if (this.c) {
                    return;
                }
                this.c = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.Y).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((zcf) it2.next()).a(i2);
                    } else {
                        synchronized (this.d) {
                            try {
                                if (this.b == i2) {
                                    this.c = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.Y).iterator();
                                    i = this.b;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.kw8
    public void b(int i, za4 za4Var, long j, int i2) {
        ((nw8) this.X).b(i, za4Var, j, i2);
    }

    @Override // defpackage.kw8
    public void d(long j, int i, int i2, int i3) {
        ((nw8) this.X).d(j, i, i2, i3);
    }

    @Override // defpackage.wqa
    public void f(Executor executor, uqa uqaVar) {
        zcf zcfVar;
        synchronized (this.d) {
            w(uqaVar);
            zcfVar = new zcf((AtomicReference) this.o, executor, uqaVar);
            ((HashMap) this.X).put(uqaVar, zcfVar);
            ((CopyOnWriteArraySet) this.Y).add(zcfVar);
        }
        zcfVar.a(0);
    }

    @Override // defpackage.kw8
    public void flush() {
        ((nw8) this.X).flush();
        ((MediaCodec) this.d).flush();
        ky kyVar = (ky) this.o;
        synchronized (kyVar.a) {
            kyVar.l++;
            Handler handler = kyVar.c;
            String str = zxg.a;
            handler.post(new o3(10, kyVar));
        }
        ((MediaCodec) this.d).start();
    }

    @Override // defpackage.kw8
    public void g(int i, long j) {
        ((MediaCodec) this.d).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.kw8
    public ByteBuffer getInputBuffer(int i) {
        return ((MediaCodec) this.d).getInputBuffer(i);
    }

    @Override // defpackage.kw8
    public ByteBuffer getOutputBuffer(int i) {
        return ((MediaCodec) this.d).getOutputBuffer(i);
    }

    @Override // defpackage.kw8
    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        ky kyVar = (ky) this.o;
        synchronized (kyVar.a) {
            try {
                mediaFormat = kyVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.kw8
    public int h() {
        ((nw8) this.X).a();
        ky kyVar = (ky) this.o;
        synchronized (kyVar.a) {
            try {
                IllegalStateException illegalStateException = kyVar.n;
                if (illegalStateException != null) {
                    kyVar.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = kyVar.j;
                if (codecException != null) {
                    kyVar.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = kyVar.k;
                if (cryptoException != null) {
                    kyVar.k = null;
                    throw cryptoException;
                }
                int i = -1;
                if (kyVar.l > 0 || kyVar.m) {
                    return -1;
                }
                w93 w93Var = kyVar.d;
                int i2 = w93Var.a;
                int i3 = w93Var.b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = w93Var.c[i2];
                    w93Var.a = (i2 + 1) & w93Var.d;
                }
                return i;
            } finally {
            }
        }
    }

    @Override // defpackage.kw8
    public int i(MediaCodec.BufferInfo bufferInfo) {
        ((nw8) this.X).a();
        ky kyVar = (ky) this.o;
        synchronized (kyVar.a) {
            try {
                IllegalStateException illegalStateException = kyVar.n;
                if (illegalStateException != null) {
                    kyVar.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = kyVar.j;
                if (codecException != null) {
                    kyVar.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = kyVar.k;
                if (cryptoException != null) {
                    kyVar.k = null;
                    throw cryptoException;
                }
                if (kyVar.l > 0 || kyVar.m) {
                    return -1;
                }
                w93 w93Var = kyVar.e;
                int i = w93Var.a;
                int i2 = w93Var.b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = w93Var.c[i];
                w93Var.a = w93Var.d & (i + 1);
                if (i3 >= 0) {
                    hsi.h(kyVar.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) kyVar.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    kyVar.h = (MediaFormat) kyVar.g.remove();
                }
                return i3;
            } finally {
            }
        }
    }

    @Override // defpackage.kw8
    public void j(int i) {
        ((MediaCodec) this.d).setVideoScalingMode(i);
    }

    @Override // defpackage.kw8
    public void k(Surface surface) {
        ((MediaCodec) this.d).setOutputSurface(surface);
    }

    @Override // defpackage.kw8
    public void l(int i) {
        ((MediaCodec) this.d).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.kw8
    public boolean m(r5j r5jVar) {
        ky kyVar = (ky) this.o;
        synchronized (kyVar.a) {
            kyVar.o = r5jVar;
        }
        return true;
    }

    @Override // defpackage.kw8
    public void n() {
        ((MediaCodec) this.d).detachOutputSurface();
    }

    public cm6 o(Widget widget) {
        View view;
        View view2 = widget.getView();
        c54 targetController = widget.getTargetController();
        View view3 = targetController != null ? targetController.getView() : null;
        if (view2 != null) {
            view = view2;
        } else {
            if (view3 == null) {
                return new zfb(23);
            }
            view = view3;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        hih hihVar = new hih(this, view3, view);
        viewTreeObserver.addOnPreDrawListener(hihVar);
        widget.addLifecycleListener(new gih(this, viewTreeObserver, hihVar, view));
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new fih(view, viewTreeObserver, hihVar, view, 0));
        } else if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new fih(view, viewTreeObserver, hihVar, view, 1));
        } else {
            c(hihVar, view, viewTreeObserver);
        }
        return new qhh(hihVar, view, viewTreeObserver);
    }

    @Override // defpackage.wqa
    public ha8 p() {
        Object obj = ((AtomicReference) this.o).get();
        return obj instanceof mb0 ? new ag7(1, ((mb0) obj).a) : wsf.f(obj);
    }

    public void q() throws GlUtil$GlException {
        for (nu6 nu6Var : (nu6[]) this.d) {
            FloatBuffer floatBuffer = nu6Var.b;
            hsi.e(floatBuffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(nu6Var.a, nu6Var.c, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(nu6Var.a);
            guf.d();
        }
        for (ou6 ou6Var : (ou6[]) this.o) {
            boolean z = this.c;
            int[] iArr = ou6Var.d;
            float[] fArr = ou6Var.c;
            int i = ou6Var.a;
            int i2 = ou6Var.b;
            if (i2 == 5124) {
                GLES20.glUniform1iv(i, 1, iArr, 0);
                guf.d();
            } else if (i2 == 5126) {
                GLES20.glUniform1fv(i, 1, fArr, 0);
                guf.d();
            } else if (i2 == 35678 || i2 == 35815 || i2 == 36198) {
                if (ou6Var.e == 0) {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                GLES20.glActiveTexture(ou6Var.f + 33984);
                guf.d();
                guf.b(i2 == 35678 ? 3553 : 36197, ou6Var.e, (i2 == 35678 || !z) ? 9729 : 9728);
                if (i2 == 35678) {
                    if (ou6Var.g == 9987) {
                        GLES20.glGenerateMipmap(3553);
                        guf.d();
                    }
                    GLES20.glTexParameteri(3553, 10241, ou6Var.g);
                    guf.d();
                }
                GLES20.glUniform1i(i, ou6Var.f);
                guf.d();
            } else {
                switch (i2) {
                    case 35664:
                        GLES20.glUniform2fv(i, 1, fArr, 0);
                        guf.d();
                        break;
                    case 35665:
                        GLES20.glUniform3fv(i, 1, fArr, 0);
                        guf.d();
                        break;
                    case 35666:
                        GLES20.glUniform4fv(i, 1, fArr, 0);
                        guf.d();
                        break;
                    case 35667:
                        GLES20.glUniform2iv(i, 1, iArr, 0);
                        guf.d();
                        break;
                    case 35668:
                        GLES20.glUniform3iv(i, 1, iArr, 0);
                        guf.d();
                        break;
                    case 35669:
                        GLES20.glUniform4iv(i, 1, iArr, 0);
                        guf.d();
                        break;
                    default:
                        switch (i2) {
                            case 35675:
                                GLES20.glUniformMatrix3fv(i, 1, false, fArr, 0);
                                guf.d();
                                break;
                            case 35676:
                                GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
                                guf.d();
                                break;
                            default:
                                throw new IllegalStateException(ho7.f(i2, "Unexpected uniform type: "));
                        }
                }
            }
        }
    }

    @Override // defpackage.wqa
    public void r(uqa uqaVar) {
        synchronized (this.d) {
            w(uqaVar);
        }
    }

    @Override // defpackage.kw8
    public void release() {
        sa9 sa9Var;
        sa9 sa9Var2;
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                try {
                    if (this.b == 1) {
                        ((nw8) this.X).shutdown();
                        ky kyVar = (ky) this.o;
                        synchronized (kyVar.a) {
                            kyVar.m = true;
                            kyVar.b.quit();
                            kyVar.a();
                        }
                    }
                    this.b = 2;
                    if (this.c) {
                        return;
                    }
                    try {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 30 && i < 33) {
                            ((MediaCodec) this.d).stop();
                        }
                        if (i >= 35 && (sa9Var2 = (sa9) this.Y) != null) {
                            sa9Var2.E((MediaCodec) this.d);
                        }
                        ((MediaCodec) this.d).release();
                        this.c = true;
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    if (!this.c) {
                        try {
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 30 && i2 < 33) {
                                ((MediaCodec) this.d).stop();
                            }
                            if (i2 >= 35 && (sa9Var = (sa9) this.Y) != null) {
                                sa9Var.E((MediaCodec) this.d);
                            }
                            ((MediaCodec) this.d).release();
                            this.c = true;
                        } finally {
                        }
                    }
                    throw th;
                }
            default:
                synchronized (this.d) {
                    try {
                        this.c = true;
                        arrayList = new ArrayList(((us) this.o).values());
                        ((us) this.o).clear();
                        if (((gy8) this.X) != null) {
                            Handler handler = (Handler) this.Y;
                            handler.getClass();
                            handler.post((gy8) this.X);
                            this.X = null;
                            this.Y = null;
                        }
                    } finally {
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((kee) it.next()).m();
                }
                return;
        }
    }

    public kee s(Object obj) {
        kee keeVar;
        synchronized (this.d) {
            try {
                int iV = v();
                keeVar = new kee(iV, obj);
                if (this.c) {
                    keeVar.m();
                } else {
                    ((us) this.o).put(Integer.valueOf(iV), keeVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return keeVar;
    }

    @Override // defpackage.kw8
    public void setParameters(Bundle bundle) {
        ((nw8) this.X).setParameters(bundle);
    }

    @Override // defpackage.kw8
    public void t(hx8 hx8Var, Handler handler) {
        ((MediaCodec) this.d).setOnFrameRenderedListener(new zx(this, hx8Var, 0), handler);
    }

    public int v() {
        int i;
        synchronized (this.d) {
            i = this.b;
            this.b = i + 1;
        }
        return i;
    }

    public void w(uqa uqaVar) {
        zcf zcfVar = (zcf) ((HashMap) this.X).remove(uqaVar);
        if (zcfVar != null) {
            zcfVar.c.set(false);
            ((CopyOnWriteArraySet) this.Y).remove(zcfVar);
        }
    }

    public void x(float[] fArr) {
        nu6 nu6Var = (nu6) ((HashMap) this.X).get("aFramePosition");
        nu6Var.getClass();
        nu6Var.b = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        nu6Var.c = 4;
    }

    public void y(String str, float f) {
        ou6 ou6Var = (ou6) ((HashMap) this.Y).get(str);
        ou6Var.getClass();
        ou6Var.c[0] = f;
    }

    public void z(String str, float[] fArr) {
        ou6 ou6Var = (ou6) ((HashMap) this.Y).get(str);
        ou6Var.getClass();
        System.arraycopy(fArr, 0, ou6Var.c, 0, fArr.length);
    }

    public dy() {
        this.a = 3;
        this.d = new Object();
        this.o = new us(0);
    }

    public dy(Context context, String str, String str2) throws IOException, GlUtil$GlException {
        this.a = 1;
        String strR = zxg.R(context, str);
        String strR2 = zxg.R(context, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.b = iGlCreateProgram;
        guf.d();
        e(iGlCreateProgram, 35633, strR);
        e(iGlCreateProgram, 35632, strR2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        guf.e("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.X = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.d = new nu6[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.b;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            String str3 = new String(bArr, 0, i3);
            nu6 nu6Var = new nu6(str3, GLES20.glGetAttribLocation(i2, str3));
            ((nu6[]) this.d)[i] = nu6Var;
            ((HashMap) this.X).put(str3, nu6Var);
        }
        this.Y = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.b, 35718, iArr4, 0);
        this.o = new ou6[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int[] iArr6 = new int[1];
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, iArr6, 0, bArr2, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            String str4 = new String(bArr2, 0, i7);
            ou6 ou6Var = new ou6(str4, GLES20.glGetUniformLocation(i6, str4), iArr6[0]);
            ((ou6[]) this.o)[i5] = ou6Var;
            ((HashMap) this.Y).put(str4, ou6Var);
        }
        guf.d();
    }

    public dy(Object obj) {
        this.a = 2;
        this.d = new Object();
        this.b = 0;
        this.c = false;
        this.X = new HashMap();
        this.Y = new CopyOnWriteArraySet();
        this.o = new AtomicReference(obj);
    }

    public dy(MediaCodec mediaCodec, HandlerThread handlerThread, nw8 nw8Var, sa9 sa9Var) {
        this.a = 0;
        this.d = mediaCodec;
        this.o = new ky(handlerThread);
        this.X = nw8Var;
        this.Y = sa9Var;
        this.b = 0;
    }
}
