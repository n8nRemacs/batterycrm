package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.squareup.picasso.Picasso;

/* compiled from: PicassoDrawable.java */
/* loaded from: classes7.dex */
final class w extends BitmapDrawable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f366471e = 0;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f366472a;

    /* renamed from: b, reason: collision with root package name */
    public final long f366473b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f366474c;

    /* renamed from: d, reason: collision with root package name */
    public int f366475d;

    static {
        new Paint();
    }

    public w(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom) {
        super(context.getResources(), bitmap);
        this.f366475d = 255;
        float f12 = context.getResources().getDisplayMetrics().density;
        if (loadedFrom != Picasso.LoadedFrom.MEMORY) {
            this.f366472a = drawable;
            this.f366474c = true;
            this.f366473b = SystemClock.uptimeMillis();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.f366474c) {
            super.draw(canvas);
            return;
        }
        float fUptimeMillis = (SystemClock.uptimeMillis() - this.f366473b) / 200.0f;
        if (fUptimeMillis >= 1.0f) {
            this.f366474c = false;
            this.f366472a = null;
            super.draw(canvas);
        } else {
            Drawable drawable = this.f366472a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            super.setAlpha((int) (this.f366475d * fUptimeMillis));
            super.draw(canvas);
            super.setAlpha(this.f366475d);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f366472a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f366475d = i12;
        Drawable drawable = this.f366472a;
        if (drawable != null) {
            drawable.setAlpha(i12);
        }
        super.setAlpha(i12);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f366472a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
