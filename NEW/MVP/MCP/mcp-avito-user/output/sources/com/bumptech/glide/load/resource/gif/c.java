package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.load.resource.gif.g;
import com.bumptech.glide.util.k;
import j.N;
import j.k0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: GifDrawable.java */
/* loaded from: classes5.dex */
public class c extends Drawable implements g.b, Animatable, androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: b, reason: collision with root package name */
    public final a f339434b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f339435c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f339436d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f339437e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f339438f;

    /* renamed from: g, reason: collision with root package name */
    public int f339439g;

    /* renamed from: h, reason: collision with root package name */
    public final int f339440h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f339441i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f339442j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f339443k;

    /* compiled from: GifDrawable.java */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @k0
        public final g f339444a;

        public a(g gVar) {
            this.f339444a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f339438f = true;
        this.f339440h = -1;
        this.f339434b = aVar;
    }

    @Override // com.bumptech.glide.load.resource.gif.g.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g.a aVar = this.f339434b.f339444a.f339454i;
        if ((aVar != null ? aVar.f339464f : -1) == r0.f339446a.f338792l.f338768c - 1) {
            this.f339439g++;
        }
        int i12 = this.f339440h;
        if (i12 == -1 || this.f339439g < i12) {
            return;
        }
        stop();
    }

    public final ByteBuffer b() {
        return this.f339434b.f339444a.f339446a.f338784d.asReadOnlyBuffer();
    }

    public final Bitmap c() {
        return this.f339434b.f339444a.f339457l;
    }

    public final void d() {
        k.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f339437e);
        g gVar = this.f339434b.f339444a;
        if (gVar.f339446a.f338792l.f338768c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f339435c) {
            return;
        }
        this.f339435c = true;
        if (gVar.f339455j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = gVar.f339448c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !gVar.f339451f) {
            gVar.f339451f = true;
            gVar.f339455j = false;
            gVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        if (this.f339437e) {
            return;
        }
        if (this.f339441i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f339443k == null) {
                this.f339443k = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f339443k);
            this.f339441i = false;
        }
        g gVar = this.f339434b.f339444a;
        g.a aVar = gVar.f339454i;
        Bitmap bitmap = aVar != null ? aVar.f339466h : gVar.f339457l;
        if (this.f339443k == null) {
            this.f339443k = new Rect();
        }
        Rect rect = this.f339443k;
        if (this.f339442j == null) {
            this.f339442j = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f339442j);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f339434b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f339434b.f339444a.f339462q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f339434b.f339444a.f339461p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f339435c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f339441i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        if (this.f339442j == null) {
            this.f339442j = new Paint(2);
        }
        this.f339442j.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f339442j == null) {
            this.f339442j = new Paint(2);
        }
        this.f339442j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        k.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f339437e);
        this.f339438f = z12;
        if (!z12) {
            this.f339435c = false;
            g gVar = this.f339434b.f339444a;
            ArrayList arrayList = gVar.f339448c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gVar.f339451f = false;
            }
        } else if (this.f339436d) {
            d();
        }
        return super.setVisible(z12, z13);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f339436d = true;
        this.f339439g = 0;
        if (this.f339438f) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f339436d = false;
        this.f339435c = false;
        g gVar = this.f339434b.f339444a;
        ArrayList arrayList = gVar.f339448c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gVar.f339451f = false;
        }
    }
}
