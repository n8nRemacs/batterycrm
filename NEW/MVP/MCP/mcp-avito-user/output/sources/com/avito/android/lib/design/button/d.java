package com.avito.android.lib.design.button;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShadowPainter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/button/d;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f178646a;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Bitmap f178651f;

    /* renamed from: g, reason: collision with root package name */
    public float f178652g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public VU.d f178647b = new VU.d(0, 0, 0, 0, 15, null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public VU.d f178648c = new VU.d(0, 0, 0, 0, 15, null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Paint f178649d = new Paint(7);

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Paint f178650e = new Paint(7);

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Rect f178653h = new Rect();

    public final void a(@k Canvas canvas, @k View view) {
        if (this.f178646a) {
            if (Build.VERSION.SDK_INT >= 28) {
                c(view, canvas, this.f178649d, this.f178647b);
                c(view, canvas, this.f178650e, this.f178648c);
                return;
            }
            float f12 = this.f178652g * (-1.0f);
            Rect rect = this.f178653h;
            float f13 = rect.left + f12;
            float f14 = f12 + rect.top;
            Bitmap bitmap = this.f178651f;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, f13, f14, (Paint) null);
            }
        }
    }

    public abstract void b(@k Canvas canvas, @k Paint paint, @k RectF rectF);

    public final void c(View view, Canvas canvas, Paint paint, VU.d dVar) {
        if (dVar.f17176d == 0) {
            return;
        }
        Rect rect = new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        rect.offset(dVar.f17173a, dVar.f17174b);
        b(canvas, paint, new RectF(rect));
    }

    public final void d(@k View view) {
        Object layoutParams = view.getLayoutParams();
        Bitmap bitmapCreateBitmap = null;
        com.avito.android.lib.design.shadow_layout.c cVar = layoutParams instanceof com.avito.android.lib.design.shadow_layout.c ? (com.avito.android.lib.design.shadow_layout.c) layoutParams : null;
        if (cVar != null) {
            cVar.a(this.f178646a);
        }
        if (Build.VERSION.SDK_INT >= 28 || !this.f178646a) {
            return;
        }
        int iB2 = kotlin.math.b.b(this.f178652g * 2);
        int measuredWidth = view.getMeasuredWidth() + iB2;
        Rect rect = this.f178653h;
        int iWidth = rect.width() + measuredWidth;
        int iHeight = rect.height() + view.getMeasuredHeight() + iB2;
        if (iWidth != 0 && iHeight != 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(this.f178652g + Math.abs(rect.left), this.f178652g + Math.abs(rect.top));
            c(view, canvas, this.f178649d, this.f178647b);
            c(view, canvas, this.f178650e, this.f178648c);
        }
        this.f178651f = bitmapCreateBitmap;
    }

    public final void e(@k VU.d dVar, @k VU.d dVar2) {
        this.f178647b = dVar;
        Paint paint = this.f178649d;
        int i12 = dVar.f17176d;
        if (i12 != 0) {
            paint.setMaskFilter(new BlurMaskFilter(i12, BlurMaskFilter.Blur.NORMAL));
        }
        paint.setColor(dVar.f17175c);
        this.f178648c = dVar2;
        Paint paint2 = this.f178650e;
        int i13 = dVar2.f17176d;
        if (i13 != 0) {
            paint2.setMaskFilter(new BlurMaskFilter(i13, BlurMaskFilter.Blur.NORMAL));
        }
        paint2.setColor(dVar2.f17175c);
        if (Build.VERSION.SDK_INT < 28) {
            this.f178652g = (Math.max(i12, i13) * 3) / 2.0f;
            int i14 = dVar2.f17173a;
            int i15 = dVar.f17173a;
            int iMin = Math.min(Math.min(i14, i15), 0);
            int i16 = dVar2.f17174b;
            int i17 = dVar.f17174b;
            this.f178653h.set(iMin, Math.min(Math.min(i16, i17), 0), Math.max(Math.max(i14, i15), 0), Math.max(Math.max(i16, i17), 0));
        }
    }
}
