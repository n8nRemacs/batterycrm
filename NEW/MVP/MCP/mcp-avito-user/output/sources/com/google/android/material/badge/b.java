package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.D;
import com.google.android.material.internal.G;
import com.google.android.material.shape.k;
import com.google.android.material.shape.q;
import j.InterfaceC42150f;
import j.N;
import j.P;
import j.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* compiled from: BadgeDrawable.java */
/* loaded from: classes6.dex */
public class b extends Drawable implements D.b {

    /* renamed from: o, reason: collision with root package name */
    @f0
    public static final int f355878o = R.style.Widget_MaterialComponents_Badge;

    /* renamed from: p, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f355879p = R.attr.badgeStyle;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final WeakReference<Context> f355880b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final k f355881c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final D f355882d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final Rect f355883e;

    /* renamed from: f, reason: collision with root package name */
    @N
    public final BadgeState f355884f;

    /* renamed from: g, reason: collision with root package name */
    public float f355885g;

    /* renamed from: h, reason: collision with root package name */
    public float f355886h;

    /* renamed from: i, reason: collision with root package name */
    public final int f355887i;

    /* renamed from: j, reason: collision with root package name */
    public float f355888j;

    /* renamed from: k, reason: collision with root package name */
    public float f355889k;

    /* renamed from: l, reason: collision with root package name */
    public float f355890l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public WeakReference<View> f355891m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public WeakReference<FrameLayout> f355892n;

    /* compiled from: BadgeDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public b(@N Context context, @P BadgeState.State state) {
        com.google.android.material.resources.d dVar;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f355880b = weakReference;
        G.c(context, G.f356730b, "Theme.MaterialComponents");
        this.f355883e = new Rect();
        D d12 = new D(this);
        this.f355882d = d12;
        TextPaint textPaint = d12.f356721a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, state);
        this.f355884f = badgeState;
        boolean zA2 = badgeState.a();
        BadgeState.State state2 = badgeState.f355844b;
        k kVar = new k(q.a(context, zA2 ? state2.f355861h.intValue() : state2.f355859f.intValue(), badgeState.a() ? state2.f355862i.intValue() : state2.f355860g.intValue()).a());
        this.f355881c = kVar;
        e();
        Context context2 = weakReference.get();
        if (context2 != null && d12.f356726f != (dVar = new com.google.android.material.resources.d(context2, state2.f355858e.intValue()))) {
            d12.b(dVar, context2);
            textPaint.setColor(state2.f355857d.intValue());
            invalidateSelf();
            g();
            invalidateSelf();
        }
        this.f355887i = ((int) Math.pow(10.0d, state2.f355865l - 1.0d)) - 1;
        d12.f356724d = true;
        g();
        invalidateSelf();
        d12.f356724d = true;
        e();
        g();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(state2.f355856c.intValue());
        if (kVar.f357034b.f357059c != colorStateListValueOf) {
            kVar.n(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.f355857d.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f355891m;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f355891m.get();
            WeakReference<FrameLayout> weakReference3 = this.f355892n;
            f(view, weakReference3 != null ? weakReference3.get() : null);
        }
        g();
        setVisible(state2.f355871r.booleanValue(), false);
    }

    @Override // com.google.android.material.internal.D.b
    @RestrictTo
    public final void a() {
        invalidateSelf();
    }

    @N
    public final String b() {
        int iD2 = d();
        int i12 = this.f355887i;
        BadgeState badgeState = this.f355884f;
        if (iD2 <= i12) {
            return NumberFormat.getInstance(badgeState.f355844b.f355866m).format(d());
        }
        Context context = this.f355880b.get();
        return context == null ? "" : String.format(badgeState.f355844b.f355866m, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f355887i), "+");
    }

    @P
    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        BadgeState badgeState = this.f355884f;
        boolean zA2 = badgeState.a();
        BadgeState.State state = badgeState.f355844b;
        if (!zA2) {
            return state.f355867n;
        }
        if (state.f355868o == 0 || (context = this.f355880b.get()) == null) {
            return null;
        }
        int iD2 = d();
        int i12 = this.f355887i;
        return iD2 <= i12 ? context.getResources().getQuantityString(state.f355868o, d(), Integer.valueOf(d())) : context.getString(state.f355869p, Integer.valueOf(i12));
    }

    public final int d() {
        BadgeState badgeState = this.f355884f;
        if (badgeState.a()) {
            return badgeState.f355844b.f355864k;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f355881c.draw(canvas);
        if (this.f355884f.a()) {
            Rect rect = new Rect();
            String strB = b();
            D d12 = this.f355882d;
            d12.f356721a.getTextBounds(strB, 0, strB.length(), rect);
            canvas.drawText(strB, this.f355885g, this.f355886h + (rect.height() / 2), d12.f356721a);
        }
    }

    public final void e() {
        Context context = this.f355880b.get();
        if (context == null) {
            return;
        }
        BadgeState badgeState = this.f355884f;
        boolean zA2 = badgeState.a();
        BadgeState.State state = badgeState.f355844b;
        this.f355881c.setShapeAppearanceModel(q.a(context, zA2 ? state.f355861h.intValue() : state.f355859f.intValue(), badgeState.a() ? state.f355862i.intValue() : state.f355860g.intValue()).a());
        invalidateSelf();
    }

    public final void f(@N View view, @P FrameLayout frameLayout) {
        this.f355891m = new WeakReference<>(view);
        this.f355892n = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        g();
        invalidateSelf();
    }

    public final void g() {
        Context context = this.f355880b.get();
        WeakReference<View> weakReference = this.f355891m;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f355883e;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference2 = this.f355892n;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        BadgeState badgeState = this.f355884f;
        float f12 = !badgeState.a() ? badgeState.f355845c : badgeState.f355846d;
        this.f355888j = f12;
        if (f12 != -1.0f) {
            this.f355890l = f12;
            this.f355889k = f12;
        } else {
            this.f355890l = Math.round((!badgeState.a() ? badgeState.f355848f : badgeState.f355850h) / 2.0f);
            this.f355889k = Math.round((!badgeState.a() ? badgeState.f355847e : badgeState.f355849g) / 2.0f);
        }
        if (d() > 9) {
            this.f355889k = Math.max(this.f355889k, (this.f355882d.a(b()) / 2.0f) + badgeState.f355851i);
        }
        boolean zA2 = badgeState.a();
        BadgeState.State state = badgeState.f355844b;
        int iIntValue = zA2 ? state.f355875v.intValue() : state.f355873t.intValue();
        int i12 = badgeState.f355854l;
        if (i12 == 0) {
            iIntValue -= Math.round(this.f355890l);
        }
        int iIntValue2 = state.f355877x.intValue() + iIntValue;
        int iIntValue3 = state.f355870q.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f355886h = rect3.bottom - iIntValue2;
        } else {
            this.f355886h = rect3.top + iIntValue2;
        }
        int iIntValue4 = badgeState.a() ? state.f355874u.intValue() : state.f355872s.intValue();
        if (i12 == 1) {
            iIntValue4 += badgeState.a() ? badgeState.f355853k : badgeState.f355852j;
        }
        int iIntValue5 = state.f355876w.intValue() + iIntValue4;
        int iIntValue6 = state.f355870q.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            this.f355885g = view.getLayoutDirection() == 0 ? (rect3.left - this.f355889k) + iIntValue5 : (rect3.right + this.f355889k) - iIntValue5;
        } else {
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            this.f355885g = view.getLayoutDirection() == 0 ? (rect3.right + this.f355889k) - iIntValue5 : (rect3.left - this.f355889k) + iIntValue5;
        }
        float f13 = this.f355885g;
        float f14 = this.f355886h;
        float f15 = this.f355889k;
        float f16 = this.f355890l;
        rect2.set((int) (f13 - f15), (int) (f14 - f16), (int) (f13 + f15), (int) (f14 + f16));
        float f17 = this.f355888j;
        k kVar = this.f355881c;
        if (f17 != -1.0f) {
            kVar.l(f17);
        }
        if (rect.equals(rect2)) {
            return;
        }
        kVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f355884f.f355844b.f355863j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f355883e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f355883e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.D.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        BadgeState badgeState = this.f355884f;
        badgeState.f355843a.f355863j = i12;
        badgeState.f355844b.f355863j = i12;
        this.f355882d.f356721a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
