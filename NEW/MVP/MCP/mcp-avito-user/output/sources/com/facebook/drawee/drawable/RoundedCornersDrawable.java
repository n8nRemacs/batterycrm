package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import j.k0;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class RoundedCornersDrawable extends i implements n {

    /* renamed from: f, reason: collision with root package name */
    @k0
    public final Type f340021f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f340022g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f340023h;

    /* renamed from: i, reason: collision with root package name */
    @k0
    public final float[] f340024i;

    /* renamed from: j, reason: collision with root package name */
    @k0
    public final Paint f340025j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f340026k;

    /* renamed from: l, reason: collision with root package name */
    public float f340027l;

    /* renamed from: m, reason: collision with root package name */
    public int f340028m;

    /* renamed from: n, reason: collision with root package name */
    public int f340029n;

    /* renamed from: o, reason: collision with root package name */
    public float f340030o;

    /* renamed from: p, reason: collision with root package name */
    public final Path f340031p;

    /* renamed from: q, reason: collision with root package name */
    public final Path f340032q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f340033r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f340034b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f340035c;

        static {
            Type type = new Type("OVERLAY_COLOR", 0);
            f340034b = type;
            f340035c = new Type[]{type, new Type("CLIPPING", 1)};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f340035c.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f340036a;

        static {
            int[] iArr = new int[Type.values().length];
            f340036a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340036a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornersDrawable(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.f340021f = Type.f340034b;
        this.f340022g = new RectF();
        this.f340023h = new float[8];
        this.f340024i = new float[8];
        this.f340025j = new Paint(1);
        this.f340026k = false;
        this.f340027l = 0.0f;
        this.f340028m = 0;
        this.f340029n = 0;
        this.f340030o = 0.0f;
        this.f340031p = new Path();
        this.f340032q = new Path();
        this.f340033r = new RectF();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void b(boolean z12) {
        this.f340026k = z12;
        o();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void c(float f12, int i12) {
        this.f340028m = i12;
        this.f340027l = f12;
        o();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void d(float f12) {
        this.f340030o = f12;
        o();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.f340022g;
        rectF.set(getBounds());
        int iOrdinal = this.f340021f.ordinal();
        Path path = this.f340031p;
        Paint paint = this.f340025j;
        if (iOrdinal == 0) {
            super.draw(canvas);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f340029n);
            paint.setStrokeWidth(0.0f);
            paint.setFilterBitmap(false);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
            if (this.f340026k) {
                float fWidth = ((rectF.width() - rectF.height()) + this.f340027l) / 2.0f;
                float fHeight = ((rectF.height() - rectF.width()) + this.f340027l) / 2.0f;
                if (fWidth > 0.0f) {
                    float f12 = rectF.left;
                    canvas.drawRect(f12, rectF.top, f12 + fWidth, rectF.bottom, paint);
                    float f13 = rectF.right;
                    canvas.drawRect(f13 - fWidth, rectF.top, f13, rectF.bottom, paint);
                }
                if (fHeight > 0.0f) {
                    float f14 = rectF.left;
                    float f15 = rectF.top;
                    canvas.drawRect(f14, f15, rectF.right, f15 + fHeight, paint);
                    float f16 = rectF.left;
                    float f17 = rectF.bottom;
                    canvas.drawRect(f16, f17 - fHeight, rectF.right, f17, paint);
                }
            }
        } else if (iOrdinal == 1) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (this.f340028m != 0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.f340028m);
            paint.setStrokeWidth(this.f340027l);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f340032q, paint);
        }
    }

    @Override // com.facebook.drawee.drawable.n
    public final void h(float[] fArr) {
        float[] fArr2 = this.f340023h;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            com.facebook.common.internal.o.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        o();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void i() {
        Arrays.fill(this.f340023h, 0.0f);
        o();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void l() {
        o();
        invalidateSelf();
    }

    public final void o() {
        float[] fArr;
        Path path = this.f340031p;
        path.reset();
        Path path2 = this.f340032q;
        path2.reset();
        RectF rectF = this.f340033r;
        rectF.set(getBounds());
        float f12 = this.f340030o;
        rectF.inset(f12, f12);
        if (this.f340021f == Type.f340034b) {
            path.addRect(rectF, Path.Direction.CW);
        }
        boolean z12 = this.f340026k;
        float[] fArr2 = this.f340023h;
        if (z12) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f13 = this.f340030o;
        rectF.inset(-f13, -f13);
        float f14 = this.f340027l;
        rectF.inset(f14 / 2.0f, f14 / 2.0f);
        if (this.f340026k) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i12 = 0;
            while (true) {
                fArr = this.f340024i;
                if (i12 >= fArr.length) {
                    break;
                }
                fArr[i12] = (fArr2[i12] + this.f340030o) - (this.f340027l / 2.0f);
                i12++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f15 = this.f340027l;
        rectF.inset((-f15) / 2.0f, (-f15) / 2.0f);
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        o();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void j() {
    }
}
