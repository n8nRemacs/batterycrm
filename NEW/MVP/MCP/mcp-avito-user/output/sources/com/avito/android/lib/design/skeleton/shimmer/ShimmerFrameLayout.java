package com.avito.android.lib.design.skeleton.shimmer;

import AV.b;
import Y61.k;
import Y61.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.skeleton.shimmer.a;
import com.avito.android.util.C1;
import com.avito.android.util.D1;
import kotlin.Metadata;

/* compiled from: ShimmerFrameLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/ShimmerFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f180515b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f180516c;

    public ShimmerFrameLayout(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f180515b = new Paint();
        b bVar = new b();
        this.f180516c = bVar;
        setWillNotDraw(false);
        bVar.setCallback(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178914C0, 0, 0);
        try {
            a(((typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) ? new a.c() : new a.C5297a()).b(typedArrayObtainStyledAttributes).a());
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @k
    public final void a(@l a aVar) {
        boolean zIsStarted;
        b bVar = this.f180516c;
        if (aVar != null) {
            bVar.f352b.setXfermode(new PorterDuffXfermode(aVar.f180553q));
        }
        bVar.f356f = aVar;
        bVar.b();
        a aVar2 = bVar.f356f;
        if (aVar2 != null) {
            ValueAnimator valueAnimator = bVar.f355e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (aVar2.f180557u / aVar2.f180556t) + 1.0f);
            bVar.f355e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(aVar2.f180555s);
            D1.a(valueAnimatorOfFloat, aVar2.f180554r);
            valueAnimatorOfFloat.setDuration(aVar2.f180556t + aVar2.f180557u);
            valueAnimatorOfFloat.addUpdateListener(bVar.f351a);
            C1.f318564a.getClass();
            if (C1.a() && zIsStarted) {
                valueAnimatorOfFloat.start();
            }
        }
        bVar.invalidateSelf();
        if (aVar != null && aVar.f180550n) {
            C1.f318564a.getClass();
            if (C1.a()) {
                setLayerType(2, this.f180515b);
                return;
            }
        }
        setLayerType(0, null);
    }

    public final void b() {
        b bVar = this.f180516c;
        ValueAnimator valueAnimator = bVar.f355e;
        C1.f318564a.getClass();
        if (!C1.a() || valueAnimator == null) {
            return;
        }
        ValueAnimator valueAnimator2 = bVar.f355e;
        if ((valueAnimator2 == null || !valueAnimator2.isStarted()) && bVar.getCallback() != null) {
            valueAnimator.start();
        }
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f180516c.f355e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        valueAnimator.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@k Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f180516c.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f180516c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        this.f180516c.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@k Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f180516c;
    }
}
