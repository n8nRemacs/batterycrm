package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class wq0 extends Drawable {
    public static final int[] n = new int[2];
    public static final int[] o = new int[2];
    public final int a;
    public final boolean b;
    public tq0 c;
    public final bwf d;
    public final vq0 e;
    public boolean f;
    public Bitmap g;
    public uq0 h;
    public hah i;
    public hah j;
    public final float k;
    public boolean l;
    public final r40 m;

    public wq0(Context context, int i, float f, boolean z) {
        this.a = i;
        this.b = z;
        this.c = Build.VERSION.SDK_INT >= 31 ? new ulc(1) : new z0g(context);
        this.d = new bwf(new o40(context, 4));
        this.e = new vq0(0, this);
        this.k = f;
        this.m = new r40(this, 1, context);
    }

    public final View a() {
        Object callback = getCallback();
        while (callback != null) {
            if (callback instanceof Drawable) {
                callback = ((Drawable) callback).getCallback();
            }
            if (callback instanceof View) {
                return (View) callback;
            }
        }
        return null;
    }

    public final void b(boolean z) {
        View rootView;
        View viewA = a();
        if (viewA == null || (rootView = viewA.getRootView()) == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = viewA.getViewTreeObserver();
        vq0 vq0Var = this.e;
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(vq0Var);
        }
        ViewTreeObserver viewTreeObserver2 = rootView.getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.removeOnPreDrawListener(vq0Var);
        }
        if (z) {
            rootView.getViewTreeObserver().addOnPreDrawListener(vq0Var);
            if (fni.a(rootView.getWindowId(), viewA.getWindowId())) {
                return;
            }
            viewA.getViewTreeObserver().addOnPreDrawListener(vq0Var);
        }
    }

    public final void c() {
        Bitmap bitmap;
        View viewA;
        tq0 tq0Var;
        uq0 uq0Var = this.h;
        if (uq0Var == null || (bitmap = this.g) == null || (viewA = a()) == null || (tq0Var = this.c) == null) {
            return;
        }
        View rootView = viewA.getRootView();
        bitmap.eraseColor(0);
        uq0Var.save();
        hah hahVar = this.i;
        if (hahVar != null) {
            hahVar.invoke();
        }
        int[] iArr = n;
        rootView.getLocationOnScreen(iArr);
        int[] iArr2 = o;
        viewA.getLocationOnScreen(iArr2);
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        float height = viewA.getHeight() / bitmap.getHeight();
        float width = viewA.getWidth() / bitmap.getWidth();
        uq0Var.translate((-i) / width, (-i2) / height);
        float f = 1;
        uq0Var.scale(f / width, f / height);
        try {
            rootView.draw(uq0Var);
        } catch (Throwable th) {
            wqi.p(wq0.class.getName(), "fail to draw blur", th);
        }
        uq0Var.restore();
        if (!bitmap.isRecycled()) {
            tq0Var.j(bitmap, this.k);
            this.f = true;
        }
        hah hahVar2 = this.j;
        if (hahVar2 != null) {
            hahVar2.invoke();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f || (canvas instanceof uq0) || (bitmap = this.g) == null || bitmap.isRecycled()) {
            return;
        }
        int iSave = canvas.save();
        canvas.scale(getBounds().width() / bitmap.getWidth(), getBounds().height() / bitmap.getHeight(), 0.0f, 0.0f);
        try {
            if (canvas.isHardwareAccelerated()) {
                tq0 tq0Var = this.c;
                if (tq0Var != null) {
                    tq0Var.g(canvas, bitmap);
                }
            } else {
                ((z0g) this.d.getValue()).g(canvas, bitmap);
            }
            canvas.restoreToCount(iSave);
            int i = this.a;
            if (i != 0) {
                canvas.drawColor(i);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        c();
        if (this.l) {
            return;
        }
        View viewA = a();
        if (viewA != null) {
            viewA.addOnAttachStateChangeListener(this.m);
        }
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        b(this.b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (((int) Math.ceil(iWidth / 6.0f)) == 0 || ((int) Math.ceil(iHeight / 6.0f)) == 0) {
            return;
        }
        this.f = false;
        int iCeil = (int) Math.ceil(rect.width() / 6.0f);
        int i = iCeil % 64;
        if (i != 0) {
            iCeil = (iCeil - i) + 64;
        }
        int iCeil2 = (int) Math.ceil(rect.height() / (rect.width() / iCeil));
        Bitmap bitmapCreateBitmap = this.g;
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled() || iCeil >= bitmapCreateBitmap.getWidth() || iCeil2 >= bitmapCreateBitmap.getHeight()) {
            bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.g;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.g = bitmapCreateBitmap;
        } else {
            bitmapCreateBitmap.reconfigure(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
        }
        this.h = new uq0(bitmapCreateBitmap);
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        tq0 tq0Var = this.c;
        if (tq0Var != null) {
            tq0Var.e(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
