package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Property;
import android.util.Size;
import android.view.GestureDetector;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import org.webrtc.EglBase;

/* loaded from: classes.dex */
public class tz4 implements zdg {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public tz4(final Context context, p0c p0cVar, kvf kvfVar, s6b s6bVar) {
        this.a = 0;
        this.c = p0cVar;
        this.d = kvfVar;
        this.e = s6bVar;
        lk6 lk6Var = new lk6(context);
        this.f = lk6Var;
        lk6 lk6Var2 = new lk6(context);
        this.g = lk6Var2;
        this.h = new GestureDetector(context, new kx0(6, this));
        this.i = new e44(10, this);
        this.j = new Rect();
        this.b = kti.d(92 * vw4.d().getDisplayMetrics().density);
        final int i = 0;
        this.k = ipi.b(3, new cm6(this) { // from class: rz4
            public final /* synthetic */ tz4 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.f(context, true);
                    default:
                        return this.b.f(context, false);
                }
            }
        });
        final int i2 = 1;
        this.l = ipi.b(3, new cm6(this) { // from class: rz4
            public final /* synthetic */ tz4 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.f(context, true);
                    default:
                        return this.b.f(context, false);
                }
            }
        });
        lk6Var2.c = new kce(16, this);
        lk6Var.c = new t9f(14, this);
    }

    public static final void a(tz4 tz4Var, boolean z, int i) {
        TextView textView;
        long j;
        p0c p0cVar = (p0c) tz4Var.c;
        e44 e44Var = (e44) tz4Var.i;
        p0cVar.removeCallbacks(new aj0(2, e44Var));
        String string = p0cVar.getContext().getString(e1b.f, Integer.valueOf(i));
        if (z) {
            tz4Var.m = c(tz4Var.k(), (Animator) tz4Var.m);
            dqi.a(p0cVar, tz4Var.k(), -1);
            View childAt = tz4Var.k().getChildAt(0);
            textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                textView.setText(string);
            }
            tz4Var.m = b(tz4Var.k(), (Animator) tz4Var.m);
        } else {
            tz4Var.n = c(tz4Var.m(), (Animator) tz4Var.n);
            dqi.a(p0cVar, tz4Var.m(), -1);
            View childAt2 = tz4Var.m().getChildAt(0);
            textView = childAt2 instanceof TextView ? (TextView) childAt2 : null;
            if (textView != null) {
                textView.setText(string);
            }
            tz4Var.n = b(tz4Var.m(), (Animator) tz4Var.n);
        }
        cbh cbhVar = (cbh) ((kvf) tz4Var.d).invoke();
        if (cbhVar == null) {
            wqi.c(tz4.class.getName(), "Media viewer. Can't seek by double tap because player is null", new Object[0]);
            return;
        }
        long jE = cbhVar.e();
        long j2 = 10000;
        long j3 = z ? jE + j2 : jE - j2;
        long duration = cbhVar.getDuration();
        if (j3 > duration) {
            tz4Var.d();
            j3 = duration;
        }
        if (j3 < 0) {
            tz4Var.d();
            j = 0;
        } else {
            j = j3;
        }
        if (cbhVar.y0() || cbhVar.isIdle()) {
            VideoViewerWidget videoViewerWidget = (VideoViewerWidget) ((s6b) tz4Var.e).a;
            yy7[] yy7VarArr = VideoViewerWidget.u0;
            rdh rdhVarA0 = videoViewerWidget.A0();
            if (rdhVarA0 != null) {
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) rdhVarA0;
                chatMediaViewerScreen.N0().d(j, chatMediaViewerScreen.O0().O0(), chatMediaViewerScreen.O0().getDuration());
            }
        }
        cbhVar.seekTo(j);
        p0cVar.postDelayed(new aj0(3, e44Var), 600L);
    }

    public static Animator b(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() == 0 && animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, viewGroup.getAlpha(), 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new sz4(viewGroup, 0));
        objectAnimatorOfFloat.start();
        return objectAnimatorOfFloat;
    }

    public static Animator c(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() != 0) {
            return animator;
        }
        if (animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, viewGroup.getAlpha(), 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new sz4(viewGroup, 1));
        objectAnimatorOfFloat.start();
        return objectAnimatorOfFloat;
    }

    public void d() {
        if (k().getVisibility() == 0) {
            this.m = c(k(), (Animator) this.m);
        }
        if (m().getVisibility() == 0) {
            this.n = c(m(), (Animator) this.n);
        }
        ((lk6) this.f).b = 0;
        ((lk6) this.g).b = 0;
    }

    public void e() {
        int iV = az1.v(this.b);
        if (iV == 0 || iV == 1) {
            u();
            return;
        }
        if (iV == 2 || iV == 3) {
            gri.a("VideoEncoderSession", "closeInternal in " + xrf.z(this.b) + " state");
            this.b = 3;
            return;
        }
        if (iV == 4) {
            gri.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + xrf.z(this.b) + " is not handled");
    }

    public FrameLayout f(Context context, boolean z) {
        FrameLayout frameLayout = new FrameLayout(context);
        int i = z ? 8388629 : 8388627;
        int i2 = this.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2, i);
        if (z) {
            layoutParams.rightMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
        } else {
            layoutParams.leftMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
        }
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        dpg.B.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.B(textView).c.getText().e);
        int i3 = z ? c1b.a : c1b.b;
        int i4 = v1aVar.B(textView).c.getIcon().f;
        Drawable drawableMutate = r34.b(textView.getContext(), i3).mutate();
        cei.k(drawableMutate, i4);
        ArrayList arrayList = b6g.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawableMutate, (Drawable) null, (Drawable) null);
        frameLayout.addView(textView);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        yeb yebVar = v1aVar.B(frameLayout).c;
        shapeDrawable.setTint(-1728053248);
        frameLayout.setBackground(shapeDrawable);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public void g(u75 u75Var, gge ggeVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f, iArr, 0, iArr, 1)) {
            this.f = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (ggeVar != null) {
            String str = iArr[0] + "." + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            ggeVar.c = str;
        }
        int i = u75Var.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f, new int[]{12324, i, 12323, i, 12322, i, 12321, u75Var.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, u75Var.a() ? 64 : 4, EglBase.EGL_RECORDABLE_ANDROID, u75Var.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, u75Var.a() ? 3 : 2, 12344}, 0);
        ho6.a("eglCreateContext");
        this.i = eGLConfig;
        this.g = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext((EGLDisplay) this.f, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public wa0 h(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f;
            EGLConfig eGLConfig = (EGLConfig) this.i;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceI = ho6.i(eGLDisplay, eGLConfig, surface, (int[]) this.h);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new wa0(eGLSurfaceI, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            gri.j("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public void i() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f;
        EGLConfig eGLConfig = (EGLConfig) this.i;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = ho6.a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        ho6.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.j = eGLSurfaceEglCreatePbufferSurface;
    }

    public kmb j(u75 u75Var) {
        ho6.d((AtomicBoolean) this.c, false);
        try {
            g(u75Var, null);
            i();
            o((EGLSurface) this.j);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new kmb(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            gri.j("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new kmb("", "");
        } finally {
            r();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public ViewGroup k() {
        return (ViewGroup) this.k.getValue();
    }

    public wa0 l(Surface surface) {
        HashMap map = (HashMap) this.d;
        z5j.f("The surface is not registered.", map.containsKey(surface));
        wa0 wa0Var = (wa0) map.get(surface);
        Objects.requireNonNull(wa0Var);
        return wa0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public ViewGroup m() {
        return (ViewGroup) this.l.getValue();
    }

    public fa0 n(u75 u75Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        ho6.d(atomicBoolean, false);
        gge ggeVar = new gge(2);
        ggeVar.b = "0.0";
        ggeVar.c = "0.0";
        ggeVar.d = "";
        ggeVar.o = "";
        try {
            if (u75Var.a()) {
                kmb kmbVarJ = j(u75Var);
                String str = (String) kmbVarJ.a;
                str.getClass();
                String str2 = (String) kmbVarJ.b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    gri.i("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    u75Var = u75.d;
                }
                this.h = ho6.f(str2, u75Var);
                ggeVar.d = str;
                ggeVar.o = str2;
            }
            g(u75Var, ggeVar);
            i();
            o((EGLSurface) this.j);
            String strJ = ho6.j();
            if (strJ == null) {
                throw new NullPointerException("Null glVersion");
            }
            ggeVar.b = strJ;
            this.l = ho6.g(u75Var);
            int iH = ho6.h();
            this.b = iH;
            v(iH);
            this.e = Thread.currentThread();
            atomicBoolean.set(true);
            String strI = ((String) ggeVar.b) == null ? " glVersion" : "";
            if (((String) ggeVar.c) == null) {
                strI = strI.concat(" eglVersion");
            }
            if (((String) ggeVar.d) == null) {
                strI = az1.i(strI, " glExtensions");
            }
            if (((String) ggeVar.o) == null) {
                strI = az1.i(strI, " eglExtensions");
            }
            if (strI.isEmpty()) {
                return new fa0((String) ggeVar.b, (String) ggeVar.c, (String) ggeVar.d, (String) ggeVar.o);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        } catch (IllegalArgumentException e) {
            e = e;
            r();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            r();
            throw e;
        }
    }

    public void o(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f).getClass();
        ((EGLContext) this.g).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f, eGLSurface, eGLSurface, (EGLContext) this.g)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void p(Surface surface) {
        ho6.d((AtomicBoolean) this.c, true);
        ho6.c((Thread) this.e);
        HashMap map = (HashMap) this.d;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, ho6.j);
    }

    public void q() {
        if (((AtomicBoolean) this.c).getAndSet(false)) {
            ho6.c((Thread) this.e);
            r();
        }
    }

    public void r() {
        HashMap map = (HashMap) this.d;
        Iterator it = ((Map) this.l).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((fo6) it.next()).a);
        }
        this.l = Collections.EMPTY_MAP;
        this.m = null;
        if (!Objects.equals((EGLDisplay) this.f, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (wa0 wa0Var : map.values()) {
                if (!Objects.equals(wa0Var.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f, wa0Var.a)) {
                    try {
                        ho6.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        gri.c("GLUtils", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.j, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f, (EGLSurface) this.j);
                this.j = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f, (EGLContext) this.g);
                this.g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f);
            this.f = EGL14.EGL_NO_DISPLAY;
        }
        this.i = null;
        this.b = -1;
        this.n = eo6.a;
        this.k = null;
        this.e = null;
    }

    public void s(Surface surface, boolean z) {
        HashMap map = (HashMap) this.d;
        if (((Surface) this.k) == surface) {
            this.k = null;
            o((EGLSurface) this.j);
        }
        wa0 wa0Var = z ? (wa0) map.remove(surface) : (wa0) map.put(surface, ho6.j);
        if (wa0Var == null || wa0Var == ho6.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f, wa0Var.a);
        } catch (RuntimeException e) {
            gri.j("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    public void t(long j, float[] fArr, Surface surface) {
        ho6.d((AtomicBoolean) this.c, true);
        ho6.c((Thread) this.e);
        wa0 wa0VarL = l(surface);
        if (wa0VarL == ho6.j) {
            wa0VarL = h(surface);
            if (wa0VarL == null) {
                return;
            } else {
                ((HashMap) this.d).put(surface, wa0VarL);
            }
        }
        int i = wa0VarL.c;
        int i2 = wa0VarL.b;
        EGLSurface eGLSurface = wa0VarL.a;
        if (surface != ((Surface) this.k)) {
            o(eGLSurface);
            this.k = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        fo6 fo6Var = (fo6) this.m;
        fo6Var.getClass();
        if (fo6Var instanceof go6) {
            GLES20.glUniformMatrix4fv(((go6) fo6Var).f, 1, false, fArr, 0);
            ho6.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        ho6.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            return;
        }
        gri.i("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        s(surface, false);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((msf) this.h, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public void u() {
        int iV = az1.v(this.b);
        if (iV == 0) {
            this.b = 5;
            return;
        }
        if (iV != 1 && iV != 2 && iV != 3) {
            if (iV != 4) {
                throw new IllegalStateException("State " + xrf.z(this.b) + " is not handled");
            }
            gri.a("VideoEncoderSession", "terminateNow in " + xrf.z(this.b) + ", No-op");
            return;
        }
        this.b = 5;
        ((tu1) this.n).b((bf5) this.f);
        this.h = null;
        if (((bf5) this.f) == null) {
            gri.i("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            ((tu1) this.l).b(null);
            return;
        }
        gri.a("VideoEncoderSession", "VideoEncoder is releasing: " + ((bf5) this.f));
        bf5 bf5Var = (bf5) this.f;
        bf5Var.h.execute(new ne5(bf5Var, 4));
        ((bf5) this.f).i.d(new m1h(2, this), (Executor) this.d);
        this.f = null;
    }

    public void v(int i) {
        fo6 fo6Var = (fo6) ((Map) this.l).get((eo6) this.n);
        if (fo6Var == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + ((eo6) this.n));
        }
        if (((fo6) this.m) != fo6Var) {
            this.m = fo6Var;
            fo6Var.b();
            Log.d("OpenGlRenderer", "Using program for input format " + ((eo6) this.n) + ": " + ((fo6) this.m));
        }
        GLES20.glActiveTexture(33984);
        ho6.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        ho6.b("glBindTexture");
    }

    public tz4() {
        this.a = 1;
        this.c = new AtomicBoolean(false);
        this.d = new HashMap();
        this.f = EGL14.EGL_NO_DISPLAY;
        this.g = EGL14.EGL_NO_CONTEXT;
        this.h = ho6.a;
        this.j = EGL14.EGL_NO_SURFACE;
        this.l = Collections.EMPTY_MAP;
        this.m = null;
        this.n = eo6.a;
        this.b = -1;
    }

    public tz4(ycd ycdVar, qee qeeVar, Executor executor) {
        this.a = 2;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.b = 1;
        this.k = new ag7(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.l = null;
        this.m = new ag7(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.n = null;
        this.c = executor;
        this.d = qeeVar;
        this.e = ycdVar;
    }
}
