package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a9c extends FrameLayout {
    public final j81 A0;
    public final mc5 B0;
    public x8c a;
    public bma b;
    public final o1e c;
    public final v8c d;
    public boolean o;
    public final j8a s0;
    public final AtomicReference t0;
    public w12 u0;
    public final b9c v0;
    public final p7i w0;
    public l22 x0;
    public MotionEvent y0;
    public final w8c z0;

    public a9c(Context context) {
        super(context, null, 0, 0);
        this.a = x8c.PERFORMANCE;
        v8c v8cVar = new v8c();
        v8cVar.h = y8c.FILL_CENTER;
        this.d = v8cVar;
        this.o = true;
        this.s0 = new j8a(z8c.a);
        this.t0 = new AtomicReference();
        this.v0 = new b9c(v8cVar);
        this.z0 = new w8c(this);
        this.A0 = new j81(4, this);
        this.B0 = new mc5(26, this);
        jei.b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, d6d.PreviewView, 0, 0);
        hfh.m(this, context, d6d.PreviewView, null, typedArrayObtainStyledAttributes, 0, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(d6d.PreviewView_scaleType, v8cVar.h.a);
            for (y8c y8cVar : y8c.values()) {
                if (y8cVar.a == integer) {
                    setScaleType(y8cVar);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(d6d.PreviewView_implementationMode, 0);
                    for (x8c x8cVar : x8c.values()) {
                        if (x8cVar.a == integer2) {
                            setImplementationMode(x8cVar);
                            typedArrayObtainStyledAttributes.recycle();
                            this.w0 = new p7i(context, new xu9(15, this));
                            if (getBackground() == null) {
                                setBackgroundColor(s34.a(getContext(), R.color.black));
                            }
                            o1e o1eVar = new o1e(context, null, 0, 0);
                            o1eVar.setBackgroundColor(-1);
                            o1eVar.setAlpha(0.0f);
                            o1eVar.setElevation(Float.MAX_VALUE);
                            this.c = o1eVar;
                            o1eVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean c(msf msfVar, x8c x8cVar) {
        boolean zEquals = msfVar.e.n().k().equals("androidx.camera.camera2.legacy");
        boolean z = (qv4.a.e(SurfaceViewStretchedQuirk.class) == null && qv4.a.e(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (!zEquals && !z) {
            int iOrdinal = x8cVar.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Invalid implementation mode: " + x8cVar);
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private de7 getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(de7 de7Var) {
        w12 w12Var = this.u0;
        if (w12Var == null) {
            gri.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        l1e l1eVar = l1e.a;
        m1e m1eVar = new m1e(l1eVar, de7Var);
        m1e m1eVarG = w12Var.g();
        w12Var.F.put(l1eVar, m1eVar);
        m1e m1eVarG2 = w12Var.g();
        if (m1eVarG2 == null || m1eVarG2.equals(m1eVarG)) {
            return;
        }
        w12Var.v();
    }

    public final void a(boolean z) {
        jei.b();
        chh viewPort = getViewPort();
        if (this.u0 == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.u0.a(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            gri.c("PreviewView", e.toString(), e);
        }
    }

    public final void b() {
        Rect rect;
        Display display;
        l22 l22Var;
        jei.b();
        if (this.b != null) {
            if (this.o && (display = getDisplay()) != null && (l22Var = this.x0) != null) {
                v8c v8cVar = this.d;
                int iL = l22Var.l(display.getRotation());
                int rotation = display.getRotation();
                if (v8cVar.g) {
                    v8cVar.c = iL;
                    v8cVar.e = rotation;
                }
            }
            this.b.i();
        }
        b9c b9cVar = this.v0;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        b9cVar.getClass();
        jei.b();
        synchronized (b9cVar) {
            try {
                if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = b9cVar.c) == null) {
                    b9cVar.d = null;
                } else {
                    b9cVar.d = b9cVar.b.a(size, layoutDirection, rect);
                }
            } finally {
            }
        }
        w12 w12Var = this.u0;
        if (w12Var != null) {
            Matrix sensorToViewTransform = getSensorToViewTransform();
            jei.b();
            yc7 yc7Var = w12Var.g;
            if (yc7Var != null && yc7Var.i() == 1) {
                w12Var.g.d(sensorToViewTransform);
            }
        }
    }

    public Bitmap getBitmap() {
        jei.b();
        bma bmaVar = this.b;
        if (bmaVar == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) bmaVar.c;
        Bitmap bitmapE = bmaVar.e();
        if (bitmapE == null) {
            return null;
        }
        v8c v8cVar = (v8c) bmaVar.d;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!v8cVar.f()) {
            return bitmapE;
        }
        Matrix matrixD = v8cVar.d();
        RectF rectFE = v8cVar.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapE.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / v8cVar.a.getWidth(), rectFE.height() / v8cVar.a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapE, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public w12 getController() {
        jei.b();
        return this.u0;
    }

    public x8c getImplementationMode() {
        jei.b();
        return this.a;
    }

    public jz9 getMeteringPointFactory() {
        jei.b();
        return this.v0;
    }

    public mkb getOutputTransform() {
        Matrix matrixC;
        v8c v8cVar = this.d;
        jei.b();
        try {
            matrixC = v8cVar.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = v8cVar.b;
        if (matrixC == null || rect == null) {
            gri.a("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = bhg.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(bhg.a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.b instanceof r6g) {
            matrixC.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            gri.i("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new mkb();
    }

    public cb8 getPreviewStreamState() {
        return this.s0;
    }

    public y8c getScaleType() {
        jei.b();
        return this.d.h;
    }

    public de7 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        jei.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        v8c v8cVar = this.d;
        if (!v8cVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(v8cVar.d);
        matrix.postConcat(v8cVar.c(size, layoutDirection));
        return matrix;
    }

    public q8c getSurfaceProvider() {
        jei.b();
        return this.B0;
    }

    public chh getViewPort() {
        jei.b();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        jei.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        chh chhVar = new chh();
        chhVar.a = viewPortScaleType;
        chhVar.b = rational;
        chhVar.c = rotation;
        chhVar.d = layoutDirection;
        return chhVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.z0, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.A0);
        bma bmaVar = this.b;
        if (bmaVar != null) {
            bmaVar.f();
        }
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.A0);
        bma bmaVar = this.b;
        if (bmaVar != null) {
            bmaVar.g();
        }
        w12 w12Var = this.u0;
        if (w12Var != null) {
            w12Var.b();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.z0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.u0 == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = motionEvent.getPointerCount() == 1;
        boolean z2 = motionEvent.getAction() == 1;
        boolean z3 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (z && z2 && z3) {
            this.y0 = motionEvent;
            performClick();
            return true;
        }
        p7i p7iVar = this.w0;
        int i = p7iVar.a;
        xu9 xu9Var = p7iVar.b;
        motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (p7iVar.c) {
            p7iVar.l.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z4 = (motionEvent.getButtonState() & 32) != 0;
        boolean z5 = p7iVar.k == 2 && !z4;
        boolean z6 = actionMasked == 1 || actionMasked == 3 || z5;
        if (actionMasked == 0 || z6) {
            if (p7iVar.g) {
                p7iVar.a();
                xu9Var.f(new n7i());
                p7iVar.g = false;
                p7iVar.h = 0.0f;
                p7iVar.k = 0;
            } else if (p7iVar.b() && z6) {
                p7iVar.g = false;
                p7iVar.h = 0.0f;
                p7iVar.k = 0;
            }
            if (z6) {
                return true;
            }
        }
        if (!p7iVar.g && p7iVar.d && !p7iVar.b() && !z6 && z4) {
            p7iVar.i = motionEvent.getX();
            p7iVar.j = motionEvent.getY();
            p7iVar.k = 2;
            p7iVar.h = 0.0f;
        }
        boolean z7 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z5;
        boolean z8 = actionMasked == 6;
        int actionIndex = z8 ? motionEvent.getActionIndex() : -1;
        int i2 = z8 ? pointerCount - 1 : pointerCount;
        if (p7iVar.b()) {
            f = p7iVar.i;
            f2 = p7iVar.j;
            p7iVar.m = motionEvent.getY() < f2;
        } else {
            float x = 0.0f;
            float y = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    x = motionEvent.getX(i3) + x;
                    y = motionEvent.getY(i3) + y;
                }
            }
            float f3 = i2;
            f = x / f3;
            f2 = y / f3;
        }
        float f4 = 0.0f;
        float fAbs = 0.0f;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                float fAbs2 = Math.abs(motionEvent.getX(i4) - f) + f4;
                fAbs = Math.abs(motionEvent.getY(i4) - f2) + fAbs;
                f4 = fAbs2;
            }
        }
        float f5 = i2;
        float f6 = f4 / f5;
        float f7 = fAbs / f5;
        float f8 = 2;
        float f9 = f6 * f8;
        float fHypot = f8 * f7;
        if (!p7iVar.b()) {
            fHypot = (float) Math.hypot(f9, fHypot);
        }
        boolean z9 = p7iVar.g;
        kti.d(f);
        kti.d(f2);
        if (!p7iVar.b() && p7iVar.g && (fHypot < 0 || z7)) {
            p7iVar.a();
            xu9Var.f(new n7i());
            p7iVar.g = false;
            p7iVar.h = fHypot;
        }
        if (z7) {
            p7iVar.e = fHypot;
            p7iVar.f = fHypot;
            p7iVar.h = fHypot;
        }
        int i5 = p7iVar.b() ? i : 0;
        if (!p7iVar.g && fHypot >= i5 && (z9 || Math.abs(fHypot - p7iVar.h) > i)) {
            p7iVar.e = fHypot;
            p7iVar.f = fHypot;
            xu9Var.f(new n7i());
            p7iVar.g = true;
        }
        if (actionMasked != 2) {
            return true;
        }
        p7iVar.e = fHypot;
        if (p7iVar.g) {
            xu9Var.f(new o7i(p7iVar.a()));
        }
        p7iVar.f = p7iVar.e;
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.u0 != null) {
            MotionEvent motionEvent = this.y0;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.y0;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            w12 w12Var = this.u0;
            if (!w12Var.i()) {
                gri.i("CameraController", "Use cases not attached to camera.");
            } else if (w12Var.w) {
                gri.a("CameraController", "Tap to focus started: " + x + ", " + y);
                w12Var.z.i(1);
                b9c b9cVar = this.v0;
                iz9 iz9VarA = b9cVar.a(x, y, 0.16666667f);
                iz9 iz9VarA2 = b9cVar.a(x, y, 0.25f);
                z95 z95Var = new z95(iz9VarA);
                z95Var.j(iz9VarA2, 2);
                wsf.b(((s12) w12Var.p.c.A0.d).h(new z95(z95Var)), new y6i(8, w12Var), ayi.a());
            } else {
                gri.a("CameraController", "Tap to focus disabled. ");
            }
        }
        this.y0 = null;
        return super.performClick();
    }

    public void setController(w12 w12Var) {
        jei.b();
        w12 w12Var2 = this.u0;
        if (w12Var2 != null && w12Var2 != w12Var) {
            w12Var2.b();
            setScreenFlashUiInfo(null);
        }
        this.u0 = w12Var;
        a(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(x8c x8cVar) {
        jei.b();
        this.a = x8cVar;
    }

    public void setScaleType(y8c y8cVar) {
        jei.b();
        this.d.h = y8cVar;
        b();
        a(false);
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        jei.b();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
