package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import com.google.android.material.progressindicator.c;
import j.N;

/* compiled from: DeterminateDrawable.java */
/* loaded from: classes6.dex */
public final class i<S extends c> extends l {

    /* renamed from: r, reason: collision with root package name */
    public static final androidx.dynamicanimation.animation.f<i> f356935r = new a("indicatorLevel");

    /* renamed from: m, reason: collision with root package name */
    public final d f356936m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.dynamicanimation.animation.j f356937n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.dynamicanimation.animation.i f356938o;

    /* renamed from: p, reason: collision with root package name */
    public float f356939p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f356940q;

    /* compiled from: DeterminateDrawable.java */
    public class a extends androidx.dynamicanimation.animation.f<i> {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(i iVar) {
            return iVar.f356939p * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(i iVar, float f12) {
            i iVar2 = iVar;
            androidx.dynamicanimation.animation.f<i> fVar = i.f356935r;
            iVar2.f356939p = f12 / 10000.0f;
            iVar2.invalidateSelf();
        }
    }

    public i(@N Context context, @N c cVar, @N d dVar) {
        super(context, cVar);
        this.f356940q = false;
        this.f356936m = dVar;
        dVar.f356955b = this;
        androidx.dynamicanimation.animation.j jVar = new androidx.dynamicanimation.animation.j();
        this.f356937n = jVar;
        jVar.a(1.0f);
        jVar.b(50.0f);
        androidx.dynamicanimation.animation.i iVar = new androidx.dynamicanimation.animation.i(this, f356935r);
        iVar.f46048u = Float.MAX_VALUE;
        iVar.f46049v = false;
        this.f356938o = iVar;
        iVar.f46047t = jVar;
        if (this.f356951i != 1.0f) {
            this.f356951i = 1.0f;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.progressindicator.l
    public final void c() {
        super.f(false, false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            d dVar = this.f356936m;
            Rect bounds = getBounds();
            float fB2 = b();
            dVar.f356954a.getClass();
            dVar.c(canvas, bounds, fB2);
            d dVar2 = this.f356936m;
            Paint paint = this.f356952j;
            dVar2.f(canvas, paint);
            this.f356936m.e(canvas, paint, 0.0f, this.f356939p, com.google.android.material.color.k.a(this.f356945c.f356909c[0], this.f356953k));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.l
    public final boolean g(boolean z12, boolean z13, boolean z14) {
        boolean zG2 = super.g(z12, z13, z14);
        com.google.android.material.progressindicator.a aVar = this.f356946d;
        ContentResolver contentResolver = this.f356944b.getContentResolver();
        aVar.getClass();
        float f12 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f12 == 0.0f) {
            this.f356940q = true;
        } else {
            this.f356940q = false;
            this.f356937n.b(50.0f / f12);
        }
        return zG2;
    }

    @Override // com.google.android.material.progressindicator.l, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f356953k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f356936m.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f356936m.g();
    }

    @Override // com.google.android.material.progressindicator.l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f356938o.i();
        this.f356939p = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i12) {
        boolean z12 = this.f356940q;
        androidx.dynamicanimation.animation.i iVar = this.f356938o;
        if (z12) {
            iVar.i();
            this.f356939p = i12 / 10000.0f;
            invalidateSelf();
        } else {
            iVar.f46032b = this.f356939p * 10000.0f;
            iVar.f46033c = true;
            iVar.h(i12);
        }
        return true;
    }

    @Override // com.google.android.material.progressindicator.l, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        return f(z12, z13, true);
    }
}
