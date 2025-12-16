package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.shape.f;
import com.google.android.material.shape.g;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;
import j.N;
import j.P;
import j.f0;
import j.r;
import java.util.WeakHashMap;
import lY0.C43707b;
import wY0.C49576a;

/* compiled from: MaterialCardViewHelper.java */
@RestrictTo
/* loaded from: classes6.dex */
class c {

    /* renamed from: y, reason: collision with root package name */
    public static final double f356109y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f356110z;

    /* renamed from: a, reason: collision with root package name */
    @N
    public final com.google.android.material.card.a f356111a;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final k f356113c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final k f356114d;

    /* renamed from: e, reason: collision with root package name */
    @r
    public int f356115e;

    /* renamed from: f, reason: collision with root package name */
    @r
    public int f356116f;

    /* renamed from: g, reason: collision with root package name */
    public int f356117g;

    /* renamed from: h, reason: collision with root package name */
    @r
    public int f356118h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public Drawable f356119i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public Drawable f356120j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public ColorStateList f356121k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public ColorStateList f356122l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public q f356123m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public ColorStateList f356124n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public RippleDrawable f356125o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public LayerDrawable f356126p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public k f356127q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f356129s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public ValueAnimator f356130t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f356131u;

    /* renamed from: v, reason: collision with root package name */
    public final int f356132v;

    /* renamed from: w, reason: collision with root package name */
    public final int f356133w;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Rect f356112b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f356128r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f356134x = 0.0f;

    /* compiled from: MaterialCardViewHelper.java */
    public class a extends InsetDrawable {
        @Override // android.graphics.drawable.Drawable
        public final int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f356110z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(@N com.google.android.material.card.a aVar, AttributeSet attributeSet, int i12, @f0 int i13) {
        this.f356111a = aVar;
        k kVar = new k(aVar.getContext(), attributeSet, i12, i13);
        this.f356113c = kVar;
        kVar.j(aVar.getContext());
        kVar.q(-12303292);
        q.b bVarF = kVar.f357034b.f357057a.f();
        TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(attributeSet, R.styleable.CardView, i12, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CardView_cardCornerRadius)) {
            bVarF.c(typedArrayObtainStyledAttributes.getDimension(R.styleable.CardView_cardCornerRadius, 0.0f));
        }
        this.f356114d = new k();
        h(bVarF.a());
        this.f356131u = C49576a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, C43707b.f413879a);
        this.f356132v = C49576a.c(aVar.getContext(), R.attr.motionDurationShort2, 300);
        this.f356133w = C49576a.c(aVar.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(f fVar, float f12) {
        if (fVar instanceof p) {
            return (float) ((1.0d - f356109y) * f12);
        }
        if (fVar instanceof g) {
            return f12 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        f fVar = this.f356123m.f357081a;
        k kVar = this.f356113c;
        return Math.max(Math.max(b(fVar, kVar.h()), b(this.f356123m.f357082b, kVar.f357034b.f357057a.f357086f.a(kVar.g()))), Math.max(b(this.f356123m.f357083c, kVar.f357034b.f357057a.f357087g.a(kVar.g())), b(this.f356123m.f357084d, kVar.f357034b.f357057a.f357088h.a(kVar.g()))));
    }

    @N
    public final LayerDrawable c() {
        if (this.f356125o == null) {
            this.f356127q = new k(this.f356123m);
            this.f356125o = new RippleDrawable(this.f356121k, null, this.f356127q);
        }
        if (this.f356126p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f356125o, this.f356114d, this.f356120j});
            this.f356126p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f356126p;
    }

    @N
    public final Drawable d(Drawable drawable) {
        int iCeil;
        int i12;
        if (this.f356111a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i12 = iCeil2;
        } else {
            iCeil = 0;
            i12 = 0;
        }
        return new a(drawable, iCeil, i12, iCeil, i12);
    }

    public final void e(int i12, int i13) {
        int iCeil;
        int iCeil2;
        int i14;
        int i15;
        if (this.f356126p != null) {
            com.google.android.material.card.a aVar = this.f356111a;
            if (aVar.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((aVar.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((aVar.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i16 = this.f356117g;
            int i17 = (i16 & 8388613) == 8388613 ? ((i12 - this.f356115e) - this.f356116f) - iCeil2 : this.f356115e;
            int i18 = (i16 & 80) == 80 ? this.f356115e : ((i13 - this.f356115e) - this.f356116f) - iCeil;
            int i19 = (i16 & 8388613) == 8388613 ? this.f356115e : ((i12 - this.f356115e) - this.f356116f) - iCeil2;
            int i22 = (i16 & 80) == 80 ? ((i13 - this.f356115e) - this.f356116f) - iCeil : this.f356115e;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (aVar.getLayoutDirection() == 1) {
                i15 = i19;
                i14 = i17;
            } else {
                i14 = i19;
                i15 = i17;
            }
            this.f356126p.setLayerInset(2, i15, i22, i14, i18);
        }
    }

    public final void f(boolean z12, boolean z13) {
        Drawable drawable = this.f356120j;
        if (drawable != null) {
            if (!z13) {
                drawable.setAlpha(z12 ? 255 : 0);
                this.f356134x = z12 ? 1.0f : 0.0f;
                return;
            }
            float f12 = z12 ? 1.0f : 0.0f;
            float f13 = z12 ? 1.0f - this.f356134x : this.f356134x;
            ValueAnimator valueAnimator = this.f356130t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f356130t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f356134x, f12);
            this.f356130t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ColorDrawable colorDrawable = c.f356110z;
                    c cVar = this.f356108a;
                    cVar.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    cVar.f356120j.setAlpha((int) (255.0f * fFloatValue));
                    cVar.f356134x = fFloatValue;
                }
            });
            this.f356130t.setInterpolator(this.f356131u);
            this.f356130t.setDuration((long) ((z12 ? this.f356132v : this.f356133w) * f13));
            this.f356130t.start();
        }
    }

    public final void g(@P Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f356120j = drawableMutate;
            drawableMutate.setTintList(this.f356122l);
            f(this.f356111a.isChecked(), false);
        } else {
            this.f356120j = f356110z;
        }
        LayerDrawable layerDrawable = this.f356126p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f356120j);
        }
    }

    public final void h(@N q qVar) {
        this.f356123m = qVar;
        k kVar = this.f356113c;
        kVar.setShapeAppearanceModel(qVar);
        kVar.f357055w = !kVar.k();
        k kVar2 = this.f356114d;
        if (kVar2 != null) {
            kVar2.setShapeAppearanceModel(qVar);
        }
        k kVar3 = this.f356127q;
        if (kVar3 != null) {
            kVar3.setShapeAppearanceModel(qVar);
        }
    }

    public final boolean i() {
        com.google.android.material.card.a aVar = this.f356111a;
        return aVar.getPreventCornerOverlap() && this.f356113c.k() && aVar.getUseCompatPadding();
    }

    public final void j() {
        com.google.android.material.card.a aVar = this.f356111a;
        float cardViewRadius = 0.0f;
        float fA2 = ((aVar.getPreventCornerOverlap() && !this.f356113c.k()) || i()) ? a() : 0.0f;
        if (aVar.getPreventCornerOverlap() && aVar.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f356109y) * aVar.getCardViewRadius());
        }
        int i12 = (int) (fA2 - cardViewRadius);
        Rect rect = this.f356112b;
        aVar.setAncestorContentPadding(rect.left + i12, rect.top + i12, rect.right + i12, rect.bottom + i12);
    }

    public final void k() {
        boolean z12 = this.f356128r;
        com.google.android.material.card.a aVar = this.f356111a;
        if (!z12) {
            aVar.setBackgroundInternal(d(this.f356113c));
        }
        aVar.setForeground(d(this.f356119i));
    }
}
