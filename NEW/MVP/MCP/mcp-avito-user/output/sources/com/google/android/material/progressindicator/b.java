package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.RestrictTo;
import androidx.vectordrawable.graphics.drawable.b;
import com.google.android.material.R;
import com.google.android.material.internal.G;
import com.google.android.material.progressindicator.c;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.N;
import j.P;
import j.U;
import j.k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: BaseProgressIndicator.java */
/* loaded from: classes6.dex */
public abstract class b<S extends com.google.android.material.progressindicator.c> extends ProgressBar {

    /* renamed from: o, reason: collision with root package name */
    public static final int f356889o = R.style.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: b, reason: collision with root package name */
    public final S f356890b;

    /* renamed from: c, reason: collision with root package name */
    public int f356891c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f356892d;

    /* renamed from: e, reason: collision with root package name */
    public final int f356893e;

    /* renamed from: f, reason: collision with root package name */
    public final int f356894f;

    /* renamed from: g, reason: collision with root package name */
    public long f356895g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.progressindicator.a f356896h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f356897i;

    /* renamed from: j, reason: collision with root package name */
    public int f356898j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f356899k;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f356900l;

    /* renamed from: m, reason: collision with root package name */
    public final b.a f356901m;

    /* renamed from: n, reason: collision with root package name */
    public final b.a f356902n;

    /* compiled from: BaseProgressIndicator.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CircularProgressIndicator f356903b;

        public a(CircularProgressIndicator circularProgressIndicator) {
            this.f356903b = circularProgressIndicator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i12 = b.f356889o;
            CircularProgressIndicator circularProgressIndicator = this.f356903b;
            if (circularProgressIndicator.f356894f > 0) {
                circularProgressIndicator.f356895g = SystemClock.uptimeMillis();
            }
            circularProgressIndicator.setVisibility(0);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: com.google.android.material.progressindicator.b$b, reason: collision with other inner class name */
    public class RunnableC10642b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CircularProgressIndicator f356904b;

        public RunnableC10642b(CircularProgressIndicator circularProgressIndicator) {
            this.f356904b = circularProgressIndicator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i12 = b.f356889o;
            CircularProgressIndicator circularProgressIndicator = this.f356904b;
            ((l) circularProgressIndicator.getCurrentDrawable()).f(false, false, true);
            if ((circularProgressIndicator.getProgressDrawable() == null || !circularProgressIndicator.getProgressDrawable().isVisible()) && (circularProgressIndicator.getIndeterminateDrawable() == null || !circularProgressIndicator.getIndeterminateDrawable().isVisible())) {
                circularProgressIndicator.setVisibility(4);
            }
            circularProgressIndicator.f356895g = -1L;
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    public class c extends b.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CircularProgressIndicator f356905b;

        public c(CircularProgressIndicator circularProgressIndicator) {
            this.f356905b = circularProgressIndicator;
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public final void b(Drawable drawable) {
            CircularProgressIndicator circularProgressIndicator = this.f356905b;
            circularProgressIndicator.setIndeterminate(false);
            circularProgressIndicator.b(circularProgressIndicator.f356891c);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    public class d extends b.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CircularProgressIndicator f356906b;

        public d(CircularProgressIndicator circularProgressIndicator) {
            this.f356906b = circularProgressIndicator;
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public final void b(Drawable drawable) {
            CircularProgressIndicator circularProgressIndicator = this.f356906b;
            if (circularProgressIndicator.f356897i) {
                return;
            }
            circularProgressIndicator.setVisibility(circularProgressIndicator.f356898j);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface e {
    }

    /* compiled from: BaseProgressIndicator.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface f {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@N Context context, @P AttributeSet attributeSet, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(BY0.a.a(context, attributeSet, i12, f356889o), attributeSet, i12);
        int i13 = CircularProgressIndicator.f356888p;
        this.f356895g = -1L;
        this.f356897i = false;
        this.f356898j = 4;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) this;
        this.f356899k = new a(circularProgressIndicator);
        this.f356900l = new RunnableC10642b(circularProgressIndicator);
        this.f356901m = new c(circularProgressIndicator);
        this.f356902n = new d(circularProgressIndicator);
        Context context2 = getContext();
        int i14 = R.attr.circularProgressIndicatorStyle;
        h hVar = new h();
        hVar.f356909c = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = R.styleable.BaseProgressIndicator;
        G.a(context2, attributeSet, i14, i13);
        G.b(context2, attributeSet, iArr, i14, i13, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i14, i13);
        hVar.f356907a = com.google.android.material.resources.c.c(context2, typedArrayObtainStyledAttributes, R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        hVar.f356908b = Math.min(com.google.android.material.resources.c.c(context2, typedArrayObtainStyledAttributes, R.styleable.BaseProgressIndicator_trackCornerRadius, 0), hVar.f356907a / 2);
        hVar.f356911e = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        hVar.f356912f = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.BaseProgressIndicator_indicatorColor)) {
            hVar.f356909c = new int[]{com.google.android.material.color.k.b(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(R.styleable.BaseProgressIndicator_indicatorColor).type != 1) {
            hVar.f356909c = new int[]{typedArrayObtainStyledAttributes.getColor(R.styleable.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(R.styleable.BaseProgressIndicator_indicatorColor, -1));
            hVar.f356909c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BaseProgressIndicator_trackColor)) {
            hVar.f356910d = typedArrayObtainStyledAttributes.getColor(R.styleable.BaseProgressIndicator_trackColor, -1);
        } else {
            hVar.f356910d = hVar.f356909c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f12 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            hVar.f356910d = com.google.android.material.color.k.a(hVar.f356910d, (int) (f12 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        int[] iArr2 = R.styleable.CircularProgressIndicator;
        G.a(context2, attributeSet, i14, i13);
        G.b(context2, attributeSet, iArr2, i14, i13, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i14, i13);
        hVar.f356932g = Math.max(com.google.android.material.resources.c.c(context2, typedArrayObtainStyledAttributes3, R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize2), hVar.f356907a * 2);
        hVar.f356933h = com.google.android.material.resources.c.c(context2, typedArrayObtainStyledAttributes3, R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize3);
        hVar.f356934i = typedArrayObtainStyledAttributes3.getInt(R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayObtainStyledAttributes3.recycle();
        this.f356890b = hVar;
        int[] iArr3 = R.styleable.BaseProgressIndicator;
        G.a(context2, attributeSet, i12, i13);
        G.b(context2, attributeSet, iArr3, i12, i13, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr3, i12, i13);
        this.f356893e = typedArrayObtainStyledAttributes4.getInt(R.styleable.BaseProgressIndicator_showDelay, -1);
        this.f356894f = Math.min(typedArrayObtainStyledAttributes4.getInt(R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayObtainStyledAttributes4.recycle();
        this.f356896h = new com.google.android.material.progressindicator.a();
        this.f356892d = true;
    }

    @P
    private m<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f356959m;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f356936m;
    }

    public final void a() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f356899k);
            return;
        }
        Runnable runnable = this.f356900l;
        removeCallbacks(runnable);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f356895g;
        int i12 = this.f356894f;
        if (jUptimeMillis >= i12) {
            ((RunnableC10642b) runnable).run();
        } else {
            postDelayed(runnable, i12 - jUptimeMillis);
        }
    }

    public void b(int i12) {
        if (!isIndeterminate()) {
            super.setProgress(i12);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f356891c = i12;
            this.f356897i = true;
            if (getIndeterminateDrawable().isVisible()) {
                com.google.android.material.progressindicator.a aVar = this.f356896h;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f356960n.d();
                    return;
                }
            }
            this.f356901m.b(getIndeterminateDrawable());
        }
    }

    public final void c() {
        Runnable runnable = this.f356899k;
        int i12 = this.f356893e;
        if (i12 <= 0) {
            ((a) runnable).run();
        } else {
            removeCallbacks(runnable);
            postDelayed(runnable, i12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r2 = this;
            java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r0 = androidx.core.view.C22823h0.f45055a
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L2c
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            r0 = r2
        Lf:
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L16
            goto L2c
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L23
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            goto L27
        L23:
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L29
        L27:
            r0 = 1
            goto L2d
        L29:
            android.view.View r0 = (android.view.View) r0
            goto Lf
        L2c:
            r0 = 0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.b.d():boolean");
    }

    @Override // android.widget.ProgressBar
    @P
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f356890b.f356912f;
    }

    @N
    public int[] getIndicatorColor() {
        return this.f356890b.f356909c;
    }

    public int getShowAnimationBehavior() {
        return this.f356890b.f356911e;
    }

    @InterfaceC42156l
    public int getTrackColor() {
        return this.f356890b.f356910d;
    }

    @U
    public int getTrackCornerRadius() {
        return this.f356890b.f356908b;
    }

    @U
    public int getTrackThickness() {
        return this.f356890b.f356907a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f356960n.c(this.f356901m);
        }
        i<S> progressDrawable = getProgressDrawable();
        b.a aVar = this.f356902n;
        if (progressDrawable != null) {
            i<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f356949g == null) {
                progressDrawable2.f356949g = new ArrayList();
            }
            if (!progressDrawable2.f356949g.contains(aVar)) {
                progressDrawable2.f356949g.add(aVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            o<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f356949g == null) {
                indeterminateDrawable.f356949g = new ArrayList();
            }
            if (!indeterminateDrawable.f356949g.contains(aVar)) {
                indeterminateDrawable.f356949g.add(aVar);
            }
        }
        if (d()) {
            if (this.f356894f > 0) {
                this.f356895g = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f356900l);
        removeCallbacks(this.f356899k);
        ((l) getCurrentDrawable()).c();
        o<S> indeterminateDrawable = getIndeterminateDrawable();
        b.a aVar = this.f356902n;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().h(aVar);
            getIndeterminateDrawable().f356960n.f();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().h(aVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(@N Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i12, int i13) {
        try {
            m<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.b() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i12) : currentDrawingDelegate.b() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.a() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i13) : currentDrawingDelegate.a() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@N View view, int i12) {
        super.onVisibilityChanged(view, i12);
        boolean z12 = i12 == 0;
        if (this.f356892d) {
            ((l) getCurrentDrawable()).f(d(), false, z12);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i12) {
        super.onWindowVisibilityChanged(i12);
        if (this.f356892d) {
            ((l) getCurrentDrawable()).f(d(), false, false);
        }
    }

    @k0
    @RestrictTo
    public void setAnimatorDurationScaleProvider(@N com.google.android.material.progressindicator.a aVar) {
        this.f356896h = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f356946d = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f356946d = aVar;
        }
    }

    public void setHideAnimationBehavior(int i12) {
        this.f356890b.f356912f = i12;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z12) {
        try {
            if (z12 == isIndeterminate()) {
                return;
            }
            l lVar = (l) getCurrentDrawable();
            if (lVar != null) {
                lVar.c();
            }
            super.setIndeterminate(z12);
            l lVar2 = (l) getCurrentDrawable();
            if (lVar2 != null) {
                lVar2.f(d(), false, false);
            }
            if ((lVar2 instanceof o) && d()) {
                ((o) lVar2).f356960n.e();
            }
            this.f356897i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@P Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof o)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((l) drawable).c();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@InterfaceC42156l int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{com.google.android.material.color.k.b(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f356890b.f356909c = iArr;
        getIndeterminateDrawable().f356960n.b();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i12) {
        if (isIndeterminate()) {
            return;
        }
        b(i12);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@P Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof i)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            i iVar = (i) drawable;
            iVar.f(false, false, false);
            super.setProgressDrawable(iVar);
            iVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i12) {
        this.f356890b.f356911e = i12;
        invalidate();
    }

    public void setTrackColor(@InterfaceC42156l int i12) {
        S s5 = this.f356890b;
        if (s5.f356910d != i12) {
            s5.f356910d = i12;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@U int i12) {
        S s5 = this.f356890b;
        if (s5.f356908b != i12) {
            s5.f356908b = Math.min(i12, s5.f356907a / 2);
        }
    }

    public void setTrackThickness(@U int i12) {
        S s5 = this.f356890b;
        if (s5.f356907a != i12) {
            s5.f356907a = i12;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i12) {
        if (i12 != 0 && i12 != 4 && i12 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f356898j = i12;
    }

    @Override // android.widget.ProgressBar
    @P
    public o<S> getIndeterminateDrawable() {
        return (o) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @P
    public i<S> getProgressDrawable() {
        return (i) super.getProgressDrawable();
    }
}
