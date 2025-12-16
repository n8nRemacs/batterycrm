package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.i;
import com.google.android.material.shape.k;
import com.google.android.material.shape.q;
import com.google.android.material.shape.v;
import j.InterfaceC42156l;
import j.N;
import j.P;

/* compiled from: RippleDrawableCompat.java */
@RestrictTo
/* loaded from: classes6.dex */
public class a extends Drawable implements v, i {

    /* renamed from: b, reason: collision with root package name */
    public b f357007b;

    /* compiled from: RippleDrawableCompat.java */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @N
        public k f357008a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f357009b;

        public b(@N b bVar) {
            this.f357008a = (k) bVar.f357008a.f357034b.newDrawable();
            this.f357009b = bVar.f357009b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public final Drawable newDrawable() {
            return new a(new b(this));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        b bVar = this.f357007b;
        if (bVar.f357009b) {
            bVar.f357008a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public final Drawable.ConstantState getConstantState() {
        return this.f357007b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.f357007b.f357008a.getClass();
        return -3;
    }

    @Override // com.google.android.material.shape.v
    @N
    public final q getShapeAppearanceModel() {
        return this.f357007b.f357008a.f357034b.f357057a;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public final Drawable mutate() {
        this.f357007b = new b(this.f357007b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@N Rect rect) {
        super.onBoundsChange(rect);
        this.f357007b.f357008a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(@N int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f357007b.f357008a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zD2 = com.google.android.material.ripple.b.d(iArr);
        b bVar = this.f357007b;
        if (bVar.f357009b == zD2) {
            return zOnStateChange;
        }
        bVar.f357009b = zD2;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f357007b.f357008a.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@P ColorFilter colorFilter) {
        this.f357007b.f357008a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.v
    public final void setShapeAppearanceModel(@N q qVar) {
        this.f357007b.f357008a.setShapeAppearanceModel(qVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(@InterfaceC42156l int i12) {
        this.f357007b.f357008a.setTint(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(@P ColorStateList colorStateList) {
        this.f357007b.f357008a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(@P PorterDuff.Mode mode) {
        this.f357007b.f357008a.setTintMode(mode);
    }

    public a(q qVar) {
        k kVar = new k(qVar);
        b bVar = new b();
        bVar.f357008a = kVar;
        bVar.f357009b = false;
        this(bVar);
    }

    public a(b bVar) {
        this.f357007b = bVar;
    }
}
