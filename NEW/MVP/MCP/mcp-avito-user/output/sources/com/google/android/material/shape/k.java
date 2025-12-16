package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.q;
import com.google.android.material.shape.r;
import com.google.android.material.shape.t;
import j.F;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.N;
import j.P;
import j.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import java.util.Objects;
import rY0.C47618a;
import sY0.C48134a;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes6.dex */
public class k extends Drawable implements androidx.core.graphics.drawable.i, v {

    /* renamed from: x, reason: collision with root package name */
    public static final Paint f357033x;

    /* renamed from: b, reason: collision with root package name */
    public c f357034b;

    /* renamed from: c, reason: collision with root package name */
    public final t.i[] f357035c;

    /* renamed from: d, reason: collision with root package name */
    public final t.i[] f357036d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f357037e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f357038f;

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f357039g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f357040h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f357041i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f357042j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f357043k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f357044l;

    /* renamed from: m, reason: collision with root package name */
    public final Region f357045m;

    /* renamed from: n, reason: collision with root package name */
    public q f357046n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f357047o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f357048p;

    /* renamed from: q, reason: collision with root package name */
    public final yY0.b f357049q;

    /* renamed from: r, reason: collision with root package name */
    @N
    public final r.b f357050r;

    /* renamed from: s, reason: collision with root package name */
    public final r f357051s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public PorterDuffColorFilter f357052t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public PorterDuffColorFilter f357053u;

    /* renamed from: v, reason: collision with root package name */
    @N
    public final RectF f357054v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f357055w;

    /* compiled from: MaterialShapeDrawable.java */
    public class a implements r.b {
        public a() {
        }
    }

    /* compiled from: MaterialShapeDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    static {
        Paint paint = new Paint(1);
        f357033x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public k() {
        this(new q());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(@N RectF rectF, @N Path path) {
        c cVar = this.f357034b;
        this.f357051s.a(cVar.f357057a, cVar.f357065i, rectF, this.f357050r, path);
        if (this.f357034b.f357064h != 1.0f) {
            Matrix matrix = this.f357039g;
            matrix.reset();
            float f12 = this.f357034b.f357064h;
            matrix.setScale(f12, f12, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f357054v, true);
    }

    @RestrictTo
    @InterfaceC42156l
    public final int c(@InterfaceC42156l int i12) {
        c cVar = this.f357034b;
        float f12 = cVar.f357069m + 0.0f + cVar.f357068l;
        C48134a c48134a = cVar.f357058b;
        return c48134a != null ? c48134a.a(f12, i12) : i12;
    }

    public final void d(@N Canvas canvas) {
        this.f357037e.cardinality();
        int i12 = this.f357034b.f357072p;
        Path path = this.f357040h;
        yY0.b bVar = this.f357049q;
        if (i12 != 0) {
            canvas.drawPath(path, bVar.f443175a);
        }
        for (int i13 = 0; i13 < 4; i13++) {
            t.i iVar = this.f357035c[i13];
            int i14 = this.f357034b.f357071o;
            Matrix matrix = t.i.f357151b;
            iVar.a(matrix, bVar, i14, canvas);
            this.f357036d[i13].a(matrix, bVar, this.f357034b.f357071o, canvas);
        }
        if (this.f357055w) {
            c cVar = this.f357034b;
            int iSin = (int) (Math.sin(Math.toRadians(cVar.f357073q)) * cVar.f357072p);
            c cVar2 = this.f357034b;
            int iCos = (int) (Math.cos(Math.toRadians(cVar2.f357073q)) * cVar2.f357072p);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f357033x);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(@j.N android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.shape.k.draw(android.graphics.Canvas):void");
    }

    public final void e(@N Canvas canvas, @N Paint paint, @N Path path, @N q qVar, @N RectF rectF) {
        if (!qVar.e(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA2 = qVar.f357086f.a(rectF) * this.f357034b.f357065i;
            canvas.drawRoundRect(rectF, fA2, fA2, paint);
        }
    }

    @RestrictTo
    public void f(@N Canvas canvas) {
        Paint paint = this.f357048p;
        Path path = this.f357041i;
        q qVar = this.f357046n;
        RectF rectF = this.f357043k;
        rectF.set(g());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, qVar, rectF);
    }

    @N
    public final RectF g() {
        RectF rectF = this.f357042j;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f357034b.f357067k;
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public final Drawable.ConstantState getConstantState() {
        return this.f357034b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@N Outline outline) {
        if (this.f357034b.f357070n == 2) {
            return;
        }
        if (k()) {
            outline.setRoundRect(getBounds(), h() * this.f357034b.f357065i);
        } else {
            RectF rectFG = g();
            Path path = this.f357040h;
            b(rectFG, path);
            C47618a.d(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@N Rect rect) {
        Rect rect2 = this.f357034b.f357063g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // com.google.android.material.shape.v
    @N
    public final q getShapeAppearanceModel() {
        return this.f357034b.f357057a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f357044l;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f357040h;
        b(rectFG, path);
        Region region2 = this.f357045m;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        return this.f357034b.f357057a.f357085e.a(g());
    }

    public final boolean i() {
        Paint.Style style = this.f357034b.f357074r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f357048p.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f357038f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f357034b.f357061e) == null || !colorStateList.isStateful())) {
            this.f357034b.getClass();
            ColorStateList colorStateList3 = this.f357034b.f357060d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f357034b.f357059c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(Context context) {
        this.f357034b.f357058b = new C48134a(context);
        y();
    }

    @RestrictTo
    public final boolean k() {
        return this.f357034b.f357057a.e(g());
    }

    public final void l(float f12) {
        q.b bVarF = this.f357034b.f357057a.f();
        bVarF.c(f12);
        setShapeAppearanceModel(bVarF.a());
    }

    public final void m(float f12) {
        c cVar = this.f357034b;
        if (cVar.f357069m != f12) {
            cVar.f357069m = f12;
            y();
        }
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public Drawable mutate() {
        this.f357034b = new c(this.f357034b);
        return this;
    }

    public final void n(@P ColorStateList colorStateList) {
        c cVar = this.f357034b;
        if (cVar.f357059c != colorStateList) {
            cVar.f357059c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(float f12) {
        c cVar = this.f357034b;
        if (cVar.f357065i != f12) {
            cVar.f357065i = f12;
            this.f357038f = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f357038f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.D.b
    public boolean onStateChange(int[] iArr) {
        boolean z12 = w(iArr) || x();
        if (z12) {
            invalidateSelf();
        }
        return z12;
    }

    public final void p(Paint.Style style) {
        this.f357034b.f357074r = style;
        super.invalidateSelf();
    }

    public final void q(int i12) {
        this.f357049q.c(i12);
        this.f357034b.getClass();
        super.invalidateSelf();
    }

    public final void r(int i12) {
        c cVar = this.f357034b;
        if (cVar.f357073q != i12) {
            cVar.f357073q = i12;
            super.invalidateSelf();
        }
    }

    public final void s() {
        c cVar = this.f357034b;
        if (cVar.f357070n != 2) {
            cVar.f357070n = 2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@F int i12) {
        c cVar = this.f357034b;
        if (cVar.f357067k != i12) {
            cVar.f357067k = i12;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@P ColorFilter colorFilter) {
        this.f357034b.getClass();
        super.invalidateSelf();
    }

    @Override // com.google.android.material.shape.v
    public final void setShapeAppearanceModel(@N q qVar) {
        this.f357034b.f357057a = qVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(@InterfaceC42156l int i12) {
        setTintList(ColorStateList.valueOf(i12));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@P ColorStateList colorStateList) {
        this.f357034b.f357061e = colorStateList;
        x();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@P PorterDuff.Mode mode) {
        c cVar = this.f357034b;
        if (cVar.f357062f != mode) {
            cVar.f357062f = mode;
            x();
            super.invalidateSelf();
        }
    }

    @RestrictTo
    public final void t(int i12) {
        c cVar = this.f357034b;
        if (cVar.f357072p != i12) {
            cVar.f357072p = i12;
            super.invalidateSelf();
        }
    }

    public final void u(@P ColorStateList colorStateList) {
        c cVar = this.f357034b;
        if (cVar.f357060d != colorStateList) {
            cVar.f357060d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void v(float f12) {
        this.f357034b.f357066j = f12;
        invalidateSelf();
    }

    public final boolean w(int[] iArr) {
        boolean z12;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f357034b.f357059c == null || color2 == (colorForState2 = this.f357034b.f357059c.getColorForState(iArr, (color2 = (paint2 = this.f357047o).getColor())))) {
            z12 = false;
        } else {
            paint2.setColor(colorForState2);
            z12 = true;
        }
        if (this.f357034b.f357060d == null || color == (colorForState = this.f357034b.f357060d.getColorForState(iArr, (color = (paint = this.f357048p).getColor())))) {
            return z12;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean x() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f357052t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f357053u;
        c cVar = this.f357034b;
        ColorStateList colorStateList = cVar.f357061e;
        PorterDuff.Mode mode = cVar.f357062f;
        Paint paint = this.f357047o;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iC2 = c(color);
            porterDuffColorFilter = iC2 != color ? new PorterDuffColorFilter(iC2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f357052t = porterDuffColorFilter;
        this.f357034b.getClass();
        this.f357053u = null;
        this.f357034b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f357052t) && Objects.equals(porterDuffColorFilter3, this.f357053u)) ? false : true;
    }

    public final void y() {
        c cVar = this.f357034b;
        float f12 = cVar.f357069m + 0.0f;
        cVar.f357071o = (int) Math.ceil(0.75f * f12);
        this.f357034b.f357072p = (int) Math.ceil(f12 * 0.25f);
        x();
        super.invalidateSelf();
    }

    public k(@N Context context, @P AttributeSet attributeSet, @InterfaceC42150f int i12, @f0 int i13) {
        this(q.c(context, attributeSet, i12, i13).a());
    }

    public k(@N q qVar) {
        this(new c(qVar));
    }

    @RestrictTo
    public k(@N c cVar) {
        r rVar;
        this.f357035c = new t.i[4];
        this.f357036d = new t.i[4];
        this.f357037e = new BitSet(8);
        this.f357039g = new Matrix();
        this.f357040h = new Path();
        this.f357041i = new Path();
        this.f357042j = new RectF();
        this.f357043k = new RectF();
        this.f357044l = new Region();
        this.f357045m = new Region();
        Paint paint = new Paint(1);
        this.f357047o = paint;
        Paint paint2 = new Paint(1);
        this.f357048p = paint2;
        this.f357049q = new yY0.b();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            rVar = r.a.f357117a;
        } else {
            rVar = new r();
        }
        this.f357051s = rVar;
        this.f357054v = new RectF();
        this.f357055w = true;
        this.f357034b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        x();
        w(getState());
        this.f357050r = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    @RestrictTo
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @N
        public q f357057a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public C48134a f357058b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public ColorStateList f357059c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public ColorStateList f357060d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public ColorStateList f357061e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public PorterDuff.Mode f357062f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public Rect f357063g;

        /* renamed from: h, reason: collision with root package name */
        public final float f357064h;

        /* renamed from: i, reason: collision with root package name */
        public float f357065i;

        /* renamed from: j, reason: collision with root package name */
        public float f357066j;

        /* renamed from: k, reason: collision with root package name */
        public int f357067k;

        /* renamed from: l, reason: collision with root package name */
        public float f357068l;

        /* renamed from: m, reason: collision with root package name */
        public float f357069m;

        /* renamed from: n, reason: collision with root package name */
        public int f357070n;

        /* renamed from: o, reason: collision with root package name */
        public int f357071o;

        /* renamed from: p, reason: collision with root package name */
        public int f357072p;

        /* renamed from: q, reason: collision with root package name */
        public int f357073q;

        /* renamed from: r, reason: collision with root package name */
        public Paint.Style f357074r;

        public c(@N q qVar) {
            this.f357059c = null;
            this.f357060d = null;
            this.f357061e = null;
            this.f357062f = PorterDuff.Mode.SRC_IN;
            this.f357063g = null;
            this.f357064h = 1.0f;
            this.f357065i = 1.0f;
            this.f357067k = 255;
            this.f357068l = 0.0f;
            this.f357069m = 0.0f;
            this.f357070n = 0;
            this.f357071o = 0;
            this.f357072p = 0;
            this.f357073q = 0;
            this.f357074r = Paint.Style.FILL_AND_STROKE;
            this.f357057a = qVar;
            this.f357058b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable() {
            k kVar = new k(this);
            kVar.f357038f = true;
            return kVar;
        }

        public c(@N c cVar) {
            this.f357059c = null;
            this.f357060d = null;
            this.f357061e = null;
            this.f357062f = PorterDuff.Mode.SRC_IN;
            this.f357063g = null;
            this.f357064h = 1.0f;
            this.f357065i = 1.0f;
            this.f357067k = 255;
            this.f357068l = 0.0f;
            this.f357069m = 0.0f;
            this.f357070n = 0;
            this.f357071o = 0;
            this.f357072p = 0;
            this.f357073q = 0;
            this.f357074r = Paint.Style.FILL_AND_STROKE;
            this.f357057a = cVar.f357057a;
            this.f357058b = cVar.f357058b;
            this.f357066j = cVar.f357066j;
            this.f357059c = cVar.f357059c;
            this.f357060d = cVar.f357060d;
            this.f357062f = cVar.f357062f;
            this.f357061e = cVar.f357061e;
            this.f357067k = cVar.f357067k;
            this.f357064h = cVar.f357064h;
            this.f357072p = cVar.f357072p;
            this.f357070n = cVar.f357070n;
            this.f357065i = cVar.f357065i;
            this.f357068l = cVar.f357068l;
            this.f357069m = cVar.f357069m;
            this.f357071o = cVar.f357071o;
            this.f357073q = cVar.f357073q;
            this.f357074r = cVar.f357074r;
            if (cVar.f357063g != null) {
                this.f357063g = new Rect(cVar.f357063g);
            }
        }
    }
}
