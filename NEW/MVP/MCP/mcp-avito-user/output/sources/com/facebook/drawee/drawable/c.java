package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import j.k0;

/* compiled from: AutoRotateDrawable.java */
/* loaded from: classes10.dex */
public class c extends i implements Runnable, d {

    /* renamed from: f, reason: collision with root package name */
    public int f340047f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f340048g;

    /* renamed from: h, reason: collision with root package name */
    @k0
    public float f340049h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f340050i;

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i12 = bounds.right - bounds.left;
        int i13 = bounds.bottom - bounds.top;
        float f12 = this.f340049h;
        if (!this.f340048g) {
            f12 = 360.0f - f12;
        }
        canvas.rotate(f12, (i12 / 2) + r3, (i13 / 2) + r1);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (this.f340050i) {
            return;
        }
        this.f340050i = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f340050i = false;
        this.f340049h += (int) ((20.0f / this.f340047f) * 360.0f);
        invalidateSelf();
    }
}
