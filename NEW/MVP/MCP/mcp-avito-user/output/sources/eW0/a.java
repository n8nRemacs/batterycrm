package EW0;

import FW0.b;
import I41.h;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.facebook.drawee.drawable.s;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: DebugControllerOverlayDrawable.java */
/* loaded from: classes.dex */
public class a extends Drawable implements b {

    /* renamed from: b, reason: collision with root package name */
    public String f4039b;

    /* renamed from: c, reason: collision with root package name */
    public int f4040c;

    /* renamed from: d, reason: collision with root package name */
    public int f4041d;

    /* renamed from: e, reason: collision with root package name */
    public int f4042e;

    /* renamed from: f, reason: collision with root package name */
    @h
    public s.c f4043f;

    /* renamed from: h, reason: collision with root package name */
    public int f4045h;

    /* renamed from: i, reason: collision with root package name */
    public int f4046i;

    /* renamed from: o, reason: collision with root package name */
    public int f4052o;

    /* renamed from: p, reason: collision with root package name */
    public int f4053p;

    /* renamed from: q, reason: collision with root package name */
    public int f4054q;

    /* renamed from: r, reason: collision with root package name */
    public int f4055r;

    /* renamed from: s, reason: collision with root package name */
    public int f4056s;

    /* renamed from: t, reason: collision with root package name */
    public long f4057t;

    /* renamed from: u, reason: collision with root package name */
    @h
    public String f4058u;

    /* renamed from: g, reason: collision with root package name */
    public HashMap<String, String> f4044g = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    public final int f4047j = 80;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f4048k = new Paint(1);

    /* renamed from: l, reason: collision with root package name */
    public final Matrix f4049l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    public final Rect f4050m = new Rect();

    /* renamed from: n, reason: collision with root package name */
    public final RectF f4051n = new RectF();

    /* renamed from: v, reason: collision with root package name */
    public int f4059v = -1;

    public a() {
        b();
    }

    public final void a(Canvas canvas, String str, String str2, int i12) {
        String strQ = r.q(str, ": ");
        Paint paint = this.f4048k;
        float fMeasureText = paint.measureText(strQ);
        float fMeasureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i13 = this.f4055r;
        int i14 = this.f4056s;
        canvas.drawRect(i13 - 4, i14 + 8, i13 + fMeasureText + fMeasureText2 + 4.0f, i14 + this.f4054q + 8, paint);
        paint.setColor(-1);
        canvas.drawText(strQ, this.f4055r, this.f4056s, paint);
        paint.setColor(i12);
        canvas.drawText(str2, this.f4055r + fMeasureText, this.f4056s, paint);
        this.f4056s += this.f4054q;
    }

    public final void b() {
        this.f4040c = -1;
        this.f4041d = -1;
        this.f4042e = -1;
        this.f4044g = new HashMap<>();
        this.f4045h = -1;
        this.f4046i = -1;
        this.f4039b = "none";
        invalidateSelf();
        this.f4057t = -1L;
        this.f4058u = null;
        this.f4059v = -1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Paint paint = this.f4048k;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(0);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        paint.setStyle(style);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-1);
        this.f4055r = this.f4052o;
        this.f4056s = this.f4053p;
        a(canvas, "ID", this.f4039b, -1);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        Locale locale = Locale.US;
        a(canvas, "D", iWidth + "x" + iHeight, -1);
        int i12 = this.f4040c;
        int i13 = this.f4041d;
        s.c cVar = this.f4043f;
        int iWidth2 = getBounds().width();
        int iHeight2 = getBounds().height();
        int i14 = -65536;
        if (iWidth2 > 0 && iHeight2 > 0 && i12 > 0 && i13 > 0) {
            if (cVar != null) {
                Rect rect = this.f4050m;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth2;
                rect.bottom = iHeight2;
                Matrix matrix = this.f4049l;
                matrix.reset();
                cVar.a(matrix, this.f4050m, i12, i13, 0.0f, 0.0f);
                RectF rectF = this.f4051n;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i12;
                rectF.bottom = i13;
                matrix.mapRect(rectF);
                int iWidth3 = (int) rectF.width();
                int iHeight3 = (int) rectF.height();
                iWidth2 = Math.min(iWidth2, iWidth3);
                iHeight2 = Math.min(iHeight2, iHeight3);
            }
            float f12 = iWidth2;
            float f13 = f12 * 0.1f;
            float f14 = f12 * 0.5f;
            float f15 = iHeight2;
            float f16 = 0.1f * f15;
            float f17 = f15 * 0.5f;
            int iAbs = Math.abs(i12 - iWidth2);
            int iAbs2 = Math.abs(i13 - iHeight2);
            float f18 = iAbs;
            if (f18 < f13 && iAbs2 < f16) {
                i14 = -16711936;
            } else if (f18 < f14 && iAbs2 < f17) {
                i14 = -256;
            }
        }
        a(canvas, "I", this.f4040c + "x" + this.f4041d, i14);
        a(canvas, "I", (this.f4042e / 1024) + " KiB", -1);
        int i15 = this.f4045h;
        if (i15 > 0) {
            a(canvas, "anim", H.j(i15, this.f4046i, "f ", ", l "), -1);
        }
        s.c cVar2 = this.f4043f;
        if (cVar2 != null) {
            a(canvas, "scale", String.valueOf(cVar2), -1);
        }
        long j12 = this.f4057t;
        if (j12 >= 0) {
            a(canvas, "t", j12 + " ms", -1);
        }
        String str = this.f4058u;
        if (str != null) {
            a(canvas, "origin", str, this.f4059v);
        }
        for (Map.Entry<String, String> entry : this.f4044g.entrySet()) {
            a(canvas, entry.getKey(), entry.getValue(), -1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.f4048k.setTextSize(iMin);
        int i12 = iMin + 8;
        this.f4054q = i12;
        int i13 = this.f4047j;
        if (i13 == 80) {
            this.f4054q = i12 * (-1);
        }
        this.f4052o = rect.left + 10;
        this.f4053p = i13 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
