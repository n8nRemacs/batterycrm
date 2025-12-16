package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.avito.android.R;
import com.google.android.exoplayer2.ui.C;
import com.google.android.exoplayer2.ui.p;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.InterfaceC42156l;
import j.P;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: DefaultTimeBar.java */
/* loaded from: classes6.dex */
public class i extends View implements C {

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f347464Q = 0;

    /* renamed from: A, reason: collision with root package name */
    public final float f347465A;

    /* renamed from: B, reason: collision with root package name */
    public int f347466B;

    /* renamed from: C, reason: collision with root package name */
    public long f347467C;

    /* renamed from: D, reason: collision with root package name */
    public int f347468D;

    /* renamed from: E, reason: collision with root package name */
    public Rect f347469E;

    /* renamed from: F, reason: collision with root package name */
    public final ValueAnimator f347470F;

    /* renamed from: G, reason: collision with root package name */
    public float f347471G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f347472H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f347473I;

    /* renamed from: J, reason: collision with root package name */
    public long f347474J;

    /* renamed from: K, reason: collision with root package name */
    public long f347475K;

    /* renamed from: L, reason: collision with root package name */
    public long f347476L;

    /* renamed from: M, reason: collision with root package name */
    public long f347477M;

    /* renamed from: N, reason: collision with root package name */
    public int f347478N;

    /* renamed from: O, reason: collision with root package name */
    @P
    public long[] f347479O;

    /* renamed from: P, reason: collision with root package name */
    @P
    public boolean[] f347480P;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f347481b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f347482c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f347483d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f347484e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f347485f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f347486g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f347487h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f347488i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f347489j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f347490k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public final Drawable f347491l;

    /* renamed from: m, reason: collision with root package name */
    public final int f347492m;

    /* renamed from: n, reason: collision with root package name */
    public final int f347493n;

    /* renamed from: o, reason: collision with root package name */
    public final int f347494o;

    /* renamed from: p, reason: collision with root package name */
    public final int f347495p;

    /* renamed from: q, reason: collision with root package name */
    public final int f347496q;

    /* renamed from: r, reason: collision with root package name */
    public final int f347497r;

    /* renamed from: s, reason: collision with root package name */
    public final int f347498s;

    /* renamed from: t, reason: collision with root package name */
    public final int f347499t;

    /* renamed from: u, reason: collision with root package name */
    public final int f347500u;

    /* renamed from: v, reason: collision with root package name */
    public final StringBuilder f347501v;

    /* renamed from: w, reason: collision with root package name */
    public final Formatter f347502w;

    /* renamed from: x, reason: collision with root package name */
    public final RunnableC36570h f347503x;

    /* renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArraySet<C.a> f347504y;

    /* renamed from: z, reason: collision with root package name */
    public final Point f347505z;

    public i(Context context, @P AttributeSet attributeSet) {
        super(context, null, 0);
        this.f347481b = new Rect();
        this.f347482c = new Rect();
        this.f347483d = new Rect();
        this.f347484e = new Rect();
        Paint paint = new Paint();
        this.f347485f = paint;
        Paint paint2 = new Paint();
        this.f347486g = paint2;
        Paint paint3 = new Paint();
        this.f347487h = paint3;
        Paint paint4 = new Paint();
        this.f347488i = paint4;
        Paint paint5 = new Paint();
        this.f347489j = paint5;
        Paint paint6 = new Paint();
        this.f347490k = paint6;
        paint6.setAntiAlias(true);
        this.f347504y = new CopyOnWriteArraySet<>();
        this.f347505z = new Point();
        float f12 = context.getResources().getDisplayMetrics().density;
        this.f347465A = f12;
        this.f347500u = d(f12, -50);
        int iD2 = d(f12, 4);
        int iD3 = d(f12, 26);
        int iD4 = d(f12, 4);
        int iD5 = d(f12, 12);
        int iD6 = d(f12, 0);
        int iD7 = d(f12, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.m.f347538b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f347491l = drawable;
                if (drawable != null) {
                    int i12 = U.f348106a;
                    if (i12 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i12 < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    iD3 = Math.max(drawable.getMinimumHeight(), iD3);
                }
                this.f347492m = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iD2);
                this.f347493n = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iD3);
                this.f347494o = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f347495p = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iD4);
                this.f347496q = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iD5);
                this.f347497r = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iD6);
                this.f347498s = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iD7);
                int i13 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i15 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i16 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i17 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i18 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i13);
                paint6.setColor(i14);
                paint2.setColor(i15);
                paint3.setColor(i16);
                paint4.setColor(i17);
                paint5.setColor(i18);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f347492m = iD2;
            this.f347493n = iD3;
            this.f347494o = 0;
            this.f347495p = iD4;
            this.f347496q = iD5;
            this.f347497r = iD6;
            this.f347498s = iD7;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f347491l = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f347501v = sb2;
        this.f347502w = new Formatter(sb2, Locale.getDefault());
        this.f347503x = new RunnableC36570h(this, 0);
        Drawable drawable2 = this.f347491l;
        if (drawable2 != null) {
            this.f347499t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f347499t = (Math.max(this.f347497r, Math.max(this.f347496q, this.f347498s)) + 1) / 2;
        }
        this.f347471G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f347470F = valueAnimator;
        valueAnimator.addUpdateListener(new x(this, 4));
        this.f347475K = -9223372036854775807L;
        this.f347467C = -9223372036854775807L;
        this.f347466B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int d(float f12, int i12) {
        return (int) ((i12 * f12) + 0.5f);
    }

    private long getPositionIncrement() {
        long j12 = this.f347467C;
        if (j12 != -9223372036854775807L) {
            return j12;
        }
        long j13 = this.f347475K;
        if (j13 == -9223372036854775807L) {
            return 0L;
        }
        return j13 / this.f347466B;
    }

    private String getProgressText() {
        return U.z(this.f347501v, this.f347502w, this.f347476L);
    }

    private long getScrubberPosition() {
        if (this.f347482c.width() <= 0 || this.f347475K == -9223372036854775807L) {
            return 0L;
        }
        return (this.f347484e.width() * this.f347475K) / r0.width();
    }

    @Override // com.google.android.exoplayer2.ui.C
    public final void a(C.a aVar) {
        this.f347504y.remove(aVar);
    }

    @Override // com.google.android.exoplayer2.ui.C
    public final void b(@P long[] jArr, @P boolean[] zArr, int i12) {
        C36585a.b(i12 == 0 || !(jArr == null || zArr == null));
        this.f347478N = i12;
        this.f347479O = jArr;
        this.f347480P = zArr;
        h();
    }

    @Override // com.google.android.exoplayer2.ui.C
    public final void c(C.a aVar) {
        aVar.getClass();
        this.f347504y.add(aVar);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f347491l;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final boolean e(long j12) {
        long j13 = this.f347475K;
        if (j13 <= 0) {
            return false;
        }
        long j14 = this.f347473I ? this.f347474J : this.f347476L;
        long jL2 = U.l(j14 + j12, 0L, j13);
        if (jL2 == j14) {
            return false;
        }
        if (this.f347473I) {
            i(jL2);
        } else {
            f(jL2);
        }
        h();
        return true;
    }

    public final void f(long j12) {
        this.f347474J = j12;
        this.f347473I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<C.a> it = this.f347504y.iterator();
        while (it.hasNext()) {
            it.next().c(j12);
        }
    }

    public final void g(boolean z12) {
        removeCallbacks(this.f347503x);
        this.f347473I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<C.a> it = this.f347504y.iterator();
        while (it.hasNext()) {
            it.next().b(this.f347474J, z12);
        }
    }

    @Override // com.google.android.exoplayer2.ui.C
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f347482c.width() / this.f347465A);
        if (iWidth != 0) {
            long j12 = this.f347475K;
            if (j12 != 0 && j12 != -9223372036854775807L) {
                return j12 / iWidth;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void h() {
        Rect rect = this.f347483d;
        Rect rect2 = this.f347482c;
        rect.set(rect2);
        Rect rect3 = this.f347484e;
        rect3.set(rect2);
        long j12 = this.f347473I ? this.f347474J : this.f347476L;
        if (this.f347475K > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f347477M) / this.f347475K)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j12) / this.f347475K)), rect2.right);
        } else {
            int i12 = rect2.left;
            rect.right = i12;
            rect3.right = i12;
        }
        invalidate(this.f347481b);
    }

    public final void i(long j12) {
        if (this.f347474J == j12) {
            return;
        }
        this.f347474J = j12;
        Iterator<C.a> it = this.f347504y.iterator();
        while (it.hasNext()) {
            it.next().a(j12);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f347491l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f347482c;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i12 = iCenterY + iHeight;
        long j12 = this.f347475K;
        Paint paint = this.f347487h;
        Rect rect2 = this.f347484e;
        if (j12 <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i12, paint);
        } else {
            Rect rect3 = this.f347483d;
            int i13 = rect3.left;
            int i14 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i14), rect2.right);
            int i15 = rect.right;
            if (iMax < i15) {
                canvas.drawRect(iMax, iCenterY, i15, i12, paint);
            }
            int iMax2 = Math.max(i13, rect2.right);
            if (i14 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i14, i12, this.f347486g);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i12, this.f347485f);
            }
            if (this.f347478N != 0) {
                long[] jArr = this.f347479O;
                jArr.getClass();
                boolean[] zArr = this.f347480P;
                zArr.getClass();
                int i16 = this.f347495p;
                int i17 = i16 / 2;
                int i18 = 0;
                int i19 = 0;
                while (i19 < this.f347478N) {
                    canvas.drawRect(Math.min(rect.width() - i16, Math.max(i18, ((int) ((rect.width() * U.l(jArr[i19], 0L, this.f347475K)) / this.f347475K)) - i17)) + rect.left, iCenterY, r1 + i16, i12, zArr[i19] ? this.f347489j : this.f347488i);
                    i19++;
                    i18 = i18;
                    i16 = i16;
                }
            }
        }
        if (this.f347475K > 0) {
            int iK2 = U.k(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f347491l;
            if (drawable == null) {
                canvas.drawCircle(iK2, iCenterY2, (int) ((((this.f347473I || isFocused()) ? this.f347498s : isEnabled() ? this.f347496q : this.f347497r) * this.f347471G) / 2.0f), this.f347490k);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f347471G)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f347471G)) / 2;
                drawable.setBounds(iK2 - intrinsicWidth, iCenterY2 - intrinsicHeight, iK2 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z12, int i12, @P Rect rect) {
        super.onFocusChanged(z12, i12, rect);
        if (!this.f347473I || z12) {
            return;
        }
        g(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f347475K <= 0) {
            return;
        }
        if (U.f348106a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.e(r0)
            if (r0 == 0) goto L2e
            com.google.android.exoplayer2.ui.h r5 = r4.f347503x
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f347473I
            if (r0 == 0) goto L2e
            r5 = 0
            r4.g(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.i.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        int i18 = this.f347472H ? 0 : this.f347499t;
        int i19 = this.f347494o;
        int i22 = this.f347492m;
        int i23 = this.f347493n;
        if (i19 == 1) {
            paddingBottom = (i17 - getPaddingBottom()) - i23;
            paddingBottom2 = ((i17 - getPaddingBottom()) - i22) - Math.max(i18 - (i22 / 2), 0);
        } else {
            paddingBottom = (i17 - i23) / 2;
            paddingBottom2 = (i17 - i22) / 2;
        }
        Rect rect2 = this.f347481b;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i23 + paddingBottom);
        this.f347482c.set(rect2.left + i18, paddingBottom2, rect2.right - i18, i22 + paddingBottom2);
        if (U.f348106a >= 29 && ((rect = this.f347469E) == null || rect.width() != i16 || this.f347469E.height() != i17)) {
            Rect rect3 = new Rect(0, 0, i16, i17);
            this.f347469E = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        h();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int i14 = this.f347493n;
        if (mode == 0) {
            size = i14;
        } else if (mode != 1073741824) {
            size = Math.min(i14, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i12), size);
        Drawable drawable = this.f347491l;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i12) {
        Drawable drawable = this.f347491l;
        if (drawable == null || U.f348106a < 23 || !drawable.setLayoutDirection(i12)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La2
            long r2 = r9.f347475K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La2
        L11:
            android.graphics.Point r0 = r9.f347505z
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f347484e
            android.graphics.Rect r5 = r9.f347482c
            r6 = 1
            if (r3 == 0) goto L7e
            r7 = 3
            if (r3 == r6) goto L6f
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6f
            goto La2
        L38:
            boolean r10 = r9.f347473I
            if (r10 == 0) goto La2
            int r10 = r9.f347500u
            if (r0 >= r10) goto L53
            int r10 = r9.f347468D
            int r10 = androidx.appcompat.app.r.f(r2, r10, r7, r10)
            float r10 = (float) r10
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = com.google.android.exoplayer2.util.U.k(r10, r0, r1)
            r4.right = r10
            goto L61
        L53:
            r9.f347468D = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = com.google.android.exoplayer2.util.U.k(r10, r0, r1)
            r4.right = r10
        L61:
            long r0 = r9.getScrubberPosition()
            r9.i(r0)
            r9.h()
            r9.invalidate()
            return r6
        L6f:
            boolean r0 = r9.f347473I
            if (r0 == 0) goto La2
            int r10 = r10.getAction()
            if (r10 != r7) goto L7a
            r1 = r6
        L7a:
            r9.g(r1)
            return r6
        L7e:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f347481b
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La2
            int r0 = r5.left
            int r1 = r5.right
            int r10 = com.google.android.exoplayer2.util.U.k(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.h()
            r9.invalidate()
            return r6
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.i.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i12, @P Bundle bundle) {
        if (super.performAccessibilityAction(i12, bundle)) {
            return true;
        }
        if (this.f347475K <= 0) {
            return false;
        }
        if (i12 == 8192) {
            if (e(-getPositionIncrement())) {
                g(false);
            }
        } else {
            if (i12 != 4096) {
                return false;
            }
            if (e(getPositionIncrement())) {
                g(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(@InterfaceC42156l int i12) {
        this.f347488i.setColor(i12);
        invalidate(this.f347481b);
    }

    public void setBufferedColor(@InterfaceC42156l int i12) {
        this.f347486g.setColor(i12);
        invalidate(this.f347481b);
    }

    @Override // com.google.android.exoplayer2.ui.C
    public void setBufferedPosition(long j12) {
        if (this.f347477M == j12) {
            return;
        }
        this.f347477M = j12;
        h();
    }

    @Override // com.google.android.exoplayer2.ui.C
    public void setDuration(long j12) {
        if (this.f347475K == j12) {
            return;
        }
        this.f347475K = j12;
        if (this.f347473I && j12 == -9223372036854775807L) {
            g(true);
        }
        h();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.C
    public void setEnabled(boolean z12) {
        super.setEnabled(z12);
        if (!this.f347473I || z12) {
            return;
        }
        g(true);
    }

    public void setKeyCountIncrement(int i12) {
        C36585a.b(i12 > 0);
        this.f347466B = i12;
        this.f347467C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j12) {
        C36585a.b(j12 > 0);
        this.f347466B = -1;
        this.f347467C = j12;
    }

    public void setPlayedAdMarkerColor(@InterfaceC42156l int i12) {
        this.f347489j.setColor(i12);
        invalidate(this.f347481b);
    }

    public void setPlayedColor(@InterfaceC42156l int i12) {
        this.f347485f.setColor(i12);
        invalidate(this.f347481b);
    }

    @Override // com.google.android.exoplayer2.ui.C
    public void setPosition(long j12) {
        if (this.f347476L == j12) {
            return;
        }
        this.f347476L = j12;
        setContentDescription(getProgressText());
        h();
    }

    public void setScrubberColor(@InterfaceC42156l int i12) {
        this.f347490k.setColor(i12);
        invalidate(this.f347481b);
    }

    public void setUnplayedColor(@InterfaceC42156l int i12) {
        this.f347487h.setColor(i12);
        invalidate(this.f347481b);
    }
}
