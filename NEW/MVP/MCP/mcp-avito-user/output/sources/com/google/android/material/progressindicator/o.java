package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import com.google.android.material.progressindicator.c;
import j.N;

/* compiled from: IndeterminateDrawable.java */
/* loaded from: classes6.dex */
public final class o<S extends c> extends l {

    /* renamed from: m, reason: collision with root package name */
    public d f356959m;

    /* renamed from: n, reason: collision with root package name */
    public n<ObjectAnimator> f356960n;

    public o() {
        throw null;
    }

    @Override // com.google.android.material.progressindicator.l
    public final void c() {
        super.f(false, false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        d dVar = this.f356959m;
        Rect bounds = getBounds();
        float fB2 = b();
        dVar.f356954a.getClass();
        dVar.c(canvas, bounds, fB2);
        d dVar2 = this.f356959m;
        Paint paint = this.f356952j;
        dVar2.f(canvas, paint);
        int i12 = 0;
        while (true) {
            n<ObjectAnimator> nVar = this.f356960n;
            int[] iArr = nVar.f356958c;
            if (i12 >= iArr.length) {
                canvas.restore();
                return;
            }
            d dVar3 = this.f356959m;
            float[] fArr = nVar.f356957b;
            int i13 = i12 * 2;
            dVar3.e(canvas, paint, fArr[i13], fArr[i13 + 1], iArr[i12]);
            i12++;
        }
    }

    @Override // com.google.android.material.progressindicator.l
    public final boolean g(boolean z12, boolean z13, boolean z14) {
        boolean zG2 = super.g(z12, z13, z14);
        if (!super.isRunning()) {
            this.f356960n.a();
        }
        a aVar = this.f356946d;
        ContentResolver contentResolver = this.f356944b.getContentResolver();
        aVar.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z12 && z14) {
            this.f356960n.e();
        }
        return zG2;
    }

    @Override // com.google.android.material.progressindicator.l, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f356953k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f356959m.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f356959m.g();
    }

    @Override // com.google.android.material.progressindicator.l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.progressindicator.l, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        return f(z12, z13, true);
    }
}
