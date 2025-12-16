package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class xcf extends Drawable implements Drawable.Callback {
    public boolean X;
    public boolean Z;
    public wcf a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public ue s0;
    public long t0;
    public long u0;
    public sf v0;
    public wcf w0;
    public boolean x0;
    public int o = 255;
    public int Y = -1;

    public xcf(wcf wcfVar, Resources resources) {
        g(new wcf(wcfVar, this, resources));
        onStateChange(getState());
    }

    public final void a(int[] iArr, Drawable drawable) {
        wcf wcfVar = this.w0;
        int i = wcfVar.h;
        Drawable[] drawableArr = wcfVar.g;
        if (i >= drawableArr.length) {
            int i2 = i + 10;
            Drawable[] drawableArr2 = new Drawable[i2];
            System.arraycopy(drawableArr, 0, drawableArr2, 0, i);
            wcfVar.g = drawableArr2;
            int[][] iArr2 = new int[i2][];
            System.arraycopy(wcfVar.H, 0, iArr2, 0, i);
            wcfVar.H = iArr2;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(wcfVar.a);
        wcfVar.g[i] = drawable;
        wcfVar.h++;
        wcfVar.e = drawable.getChangingConfigurations() | wcfVar.e;
        wcfVar.r = false;
        wcfVar.t = false;
        wcfVar.k = null;
        wcfVar.j = false;
        wcfVar.m = false;
        wcfVar.u = false;
        wcfVar.H[i] = iArr;
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        c(theme);
        onStateChange(getState());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.X = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.t0
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.o
            r3.setAlpha(r9)
            r13.t0 = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            wcf r10 = r13.a
            int r10 = r10.y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.o
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.t0 = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.d
            if (r9 == 0) goto L61
            long r10 = r13.u0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.d = r0
            r13.u0 = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            wcf r4 = r13.a
            int r4 = r4.z
            int r3 = r3 / r4
            int r4 = r13.o
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.u0 = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            ue r14 = r13.s0
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xcf.b(boolean):void");
    }

    public final void c(Resources.Theme theme) {
        wcf wcfVar = this.a;
        if (theme == null) {
            wcfVar.getClass();
            return;
        }
        wcfVar.b();
        int i = wcfVar.h;
        Drawable[] drawableArr = wcfVar.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && t35.b(drawable)) {
                t35.a(drawableArr[i2], theme);
                wcfVar.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            wcfVar.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = wcfVar.c;
            wcfVar.c = i3;
            if (i4 != i3) {
                wcfVar.m = false;
                wcfVar.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.v0 == null) {
            this.v0 = new sf();
        }
        sf sfVar = this.v0;
        sfVar.b = drawable.getCallback();
        drawable.setCallback(sfVar);
        try {
            if (this.a.y <= 0 && this.X) {
                drawable.setAlpha(this.o);
            }
            wcf wcfVar = this.a;
            if (wcfVar.C) {
                drawable.setColorFilter(wcfVar.B);
            } else {
                if (wcfVar.F) {
                    t35.h(drawable, wcfVar.D);
                }
                wcf wcfVar2 = this.a;
                if (wcfVar2.G) {
                    t35.i(drawable, wcfVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            u35.b(drawable, u35.a(this));
            drawable.setAutoMirrored(this.a.A);
            Rect rect = this.b;
            if (rect != null) {
                t35.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            sf sfVar2 = this.v0;
            Drawable.Callback callback = (Drawable.Callback) sfVar2.b;
            sfVar2.b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            sf sfVar3 = this.v0;
            Drawable.Callback callback2 = (Drawable.Callback) sfVar3.b;
            sfVar3.b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final Drawable e() {
        if (!this.Z && super.mutate() == this) {
            wcf wcfVar = new wcf(this.w0, this, null);
            wcfVar.e();
            g(wcfVar);
            this.Z = true;
        }
        return this;
    }

    public final boolean f(int[] iArr) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void g(wcf wcfVar) {
        this.a = wcfVar;
        int i = this.Y;
        if (i >= 0) {
            Drawable drawableC = wcfVar.c(i);
            this.c = drawableC;
            if (drawableC != null) {
                d(drawableC);
            }
        }
        this.d = null;
        this.w0 = wcfVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        wcf wcfVar = this.a;
        if (!wcfVar.u) {
            wcfVar.b();
            wcfVar.u = true;
            int i = wcfVar.h;
            Drawable[] drawableArr = wcfVar.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    wcfVar.v = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    wcfVar.v = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = wcfVar.v;
        }
        if (!z) {
            return null;
        }
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        wcf wcfVar = this.a;
        if (wcfVar.l) {
            if (!wcfVar.m) {
                wcfVar.a();
            }
            return wcfVar.o;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        wcf wcfVar = this.a;
        if (wcfVar.l) {
            if (!wcfVar.m) {
                wcfVar.a();
            }
            return wcfVar.n;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        wcf wcfVar = this.a;
        if (wcfVar.l) {
            if (!wcfVar.m) {
                wcfVar.a();
            }
            return wcfVar.q;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        wcf wcfVar = this.a;
        if (wcfVar.l) {
            if (!wcfVar.m) {
                wcfVar.a();
            }
            return wcfVar.p;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        if (drawable != null && drawable.isVisible()) {
            wcf wcfVar = this.a;
            if (wcfVar.r) {
                return wcfVar.s;
            }
            wcfVar.b();
            int i = wcfVar.h;
            Drawable[] drawableArr = wcfVar.g;
            opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            wcfVar.s = opacity;
            wcfVar.r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        wcf wcfVar = this.a;
        Rect rect2 = null;
        boolean padding = false;
        if (!wcfVar.i) {
            Rect rect3 = wcfVar.k;
            if (rect3 != null || wcfVar.j) {
                rect2 = rect3;
            } else {
                wcfVar.b();
                Rect rect4 = new Rect();
                int i = wcfVar.h;
                Drawable[] drawableArr = wcfVar.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                wcfVar.j = true;
                wcfVar.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.a.A && u35.a(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        wcf wcfVar = this.a;
        if (wcfVar != null) {
            wcfVar.r = false;
            wcfVar.t = false;
        }
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.X) {
                this.c.setAlpha(this.o);
            }
        }
        if (this.u0 != 0) {
            this.u0 = 0L;
            z = true;
        }
        if (this.t0 != 0) {
            this.t0 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.x0) {
            e();
            this.w0.e();
            this.x0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        wcf wcfVar = this.a;
        int i2 = this.Y;
        int i3 = wcfVar.h;
        Drawable[] drawableArr = wcfVar.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zB = u35.b(drawable, i);
                if (i4 == i2) {
                    z = zB;
                }
            }
        }
        wcfVar.x = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onStateChange(int[] r11) {
        /*
            r10 = this;
            boolean r0 = r10.f(r11)
            wcf r1 = r10.w0
            int r11 = r1.d(r11)
            if (r11 >= 0) goto L14
            wcf r11 = r10.w0
            int[] r1 = android.util.StateSet.WILD_CARD
            int r11 = r11.d(r1)
        L14:
            int r1 = r10.Y
            r2 = 0
            if (r11 != r1) goto L1b
            goto L93
        L1b:
            long r3 = android.os.SystemClock.uptimeMillis()
            wcf r1 = r10.a
            int r1 = r1.z
            r5 = 0
            r6 = 0
            if (r1 <= 0) goto L43
            android.graphics.drawable.Drawable r1 = r10.d
            if (r1 == 0) goto L2f
            r1.setVisible(r2, r2)
        L2f:
            android.graphics.drawable.Drawable r1 = r10.c
            if (r1 == 0) goto L3e
            r10.d = r1
            wcf r1 = r10.a
            int r1 = r1.z
            long r1 = (long) r1
            long r1 = r1 + r3
            r10.u0 = r1
            goto L4a
        L3e:
            r10.d = r5
            r10.u0 = r6
            goto L4a
        L43:
            android.graphics.drawable.Drawable r1 = r10.c
            if (r1 == 0) goto L4a
            r1.setVisible(r2, r2)
        L4a:
            if (r11 < 0) goto L6a
            wcf r1 = r10.a
            int r2 = r1.h
            if (r11 >= r2) goto L6a
            android.graphics.drawable.Drawable r1 = r1.c(r11)
            r10.c = r1
            r10.Y = r11
            if (r1 == 0) goto L6f
            wcf r11 = r10.a
            int r11 = r11.y
            if (r11 <= 0) goto L66
            long r8 = (long) r11
            long r3 = r3 + r8
            r10.t0 = r3
        L66:
            r10.d(r1)
            goto L6f
        L6a:
            r10.c = r5
            r11 = -1
            r10.Y = r11
        L6f:
            long r1 = r10.t0
            int r11 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r2 = 1
            if (r11 != 0) goto L7c
            long r3 = r10.u0
            int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 == 0) goto L90
        L7c:
            ue r11 = r10.s0
            if (r11 != 0) goto L8a
            ue r11 = new ue
            r1 = 15
            r11.<init>(r1, r10)
            r10.s0 = r11
            goto L8d
        L8a:
            r10.unscheduleSelf(r11)
        L8d:
            r10.b(r2)
        L90:
            r10.invalidateSelf()
        L93:
            if (r2 != 0) goto L9a
            if (r0 == 0) goto L98
            goto L9a
        L98:
            r11 = 0
            return r11
        L9a:
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xcf.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.X && this.o == i) {
            return;
        }
        this.X = true;
        this.o = i;
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.t0 == 0) {
                drawable.setAlpha(i);
            } else {
                b(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        wcf wcfVar = this.a;
        if (wcfVar.A != z) {
            wcfVar.A = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        wcf wcfVar = this.a;
        wcfVar.C = true;
        if (wcfVar.B != colorFilter) {
            wcfVar.B = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        wcf wcfVar = this.a;
        if (wcfVar.w != z) {
            wcfVar.w = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            t35.e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            t35.f(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        wcf wcfVar = this.a;
        wcfVar.F = true;
        if (wcfVar.D != colorStateList) {
            wcfVar.D = colorStateList;
            p9j.b(this.c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        wcf wcfVar = this.a;
        wcfVar.G = true;
        if (wcfVar.E != mode) {
            wcfVar.E = mode;
            p9j.c(this.c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
