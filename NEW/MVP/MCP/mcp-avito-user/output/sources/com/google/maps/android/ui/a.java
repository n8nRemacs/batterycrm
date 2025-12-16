package com.google.maps.android.ui;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.avito.android.R;

/* compiled from: BubbleDrawable.java */
/* loaded from: classes6.dex */
class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f362280a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f362281b;

    /* renamed from: c, reason: collision with root package name */
    public int f362282c = -1;

    public a(Resources resources) {
        this.f362281b = resources.getDrawable(R.drawable.amu_bubble_mask);
        this.f362280a = resources.getDrawable(R.drawable.amu_bubble_shadow);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f362281b.draw(canvas);
        canvas.drawColor(this.f362282c, PorterDuff.Mode.SRC_IN);
        this.f362280a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f362281b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i12, int i13, int i14, int i15) {
        this.f362281b.setBounds(i12, i13, i14, i15);
        this.f362280a.setBounds(i12, i13, i14, i15);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        this.f362281b.setBounds(rect);
        this.f362280a.setBounds(rect);
    }
}
