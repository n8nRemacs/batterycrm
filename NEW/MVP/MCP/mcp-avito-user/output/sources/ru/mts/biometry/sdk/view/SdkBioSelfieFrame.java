package ru.mts.biometry.sdk.view;

import Ba1.D;
import Ba1.H;
import Ca1.B;
import H91.c;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.i;
import androidx.core.graphics.p;
import androidx.view.C23038g0;
import com.avito.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l.C43521a;
import z91.c;

@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR%\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/mts/biometry/sdk/view/SdkBioSelfieFrame;", "Landroid/view/View;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/G0;", "setupAttrs", "(Landroid/util/AttributeSet;)V", "", "text", "setText", "(Ljava/lang/String;)V", "Landroidx/lifecycle/g0;", "Landroid/graphics/Path;", "kotlin.jvm.PlatformType", "b", "Landroidx/lifecycle/g0;", "getFramePathLive", "()Landroidx/lifecycle/g0;", "framePathLive", "", "value", "q", "Z", "isActive", "()Z", "setActive", "(Z)V", "Landroid/graphics/RectF;", "getFrameRect", "()Landroid/graphics/RectF;", "frameRect", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SdkBioSelfieFrame extends View {

    /* renamed from: r, reason: collision with root package name */
    public static final int f436571r = c.a(22);

    /* renamed from: s, reason: collision with root package name */
    public static final int f436572s = c.a(20);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final C23038g0 framePathLive;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f436574c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f436575d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f436576e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f436577f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f436578g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f436579h;

    /* renamed from: i, reason: collision with root package name */
    public Path f436580i;

    /* renamed from: j, reason: collision with root package name */
    public int f436581j;

    /* renamed from: k, reason: collision with root package name */
    public int f436582k;

    /* renamed from: l, reason: collision with root package name */
    public int f436583l;

    /* renamed from: m, reason: collision with root package name */
    public final float f436584m;

    /* renamed from: n, reason: collision with root package name */
    public final float f436585n;

    /* renamed from: o, reason: collision with root package name */
    public float f436586o;

    /* renamed from: p, reason: collision with root package name */
    public String f436587p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean isActive;

    @j
    public SdkBioSelfieFrame(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        C23038g0 c23038g0 = new C23038g0(new Path());
        this.framePathLive = c23038g0;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setColor(0);
        this.f436574c = paint;
        Paint paint2 = new Paint(1);
        this.f436575d = paint2;
        Paint paint3 = new Paint(1);
        this.f436576e = paint3;
        Paint paint4 = new Paint(1);
        this.f436577f = paint4;
        Paint paint5 = new Paint(1);
        paint5.setTextAlign(Paint.Align.CENTER);
        this.f436578g = paint5;
        Rect rect = new Rect();
        this.f436579h = rect;
        this.f436586o = c.a(8);
        this.f436587p = "";
        if (attributeSet != null) {
            setupAttrs(attributeSet);
        }
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(this.f436581j);
        paint3.setStrokeWidth(this.f436586o);
        paint4.setStyle(style);
        paint4.setColor(this.f436582k);
        paint4.setStrokeWidth(this.f436586o);
        Rect rectA = H91.b.a(getContext());
        rect.right = rectA.width();
        rect.bottom = rectA.height();
        float fWidth = rect.width() - (f436572s * 2);
        this.f436584m = fWidth;
        this.f436585n = (float) (fWidth * 1.25d);
        Path path = this.f436580i;
        path = path == null ? null : path;
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        matrix.preScale(this.f436584m / rectF.right, this.f436585n / rectF.bottom);
        path.transform(matrix);
        Path path2 = this.f436580i;
        c23038g0.setValue(path2 != null ? path2 : null);
        paint2.setColor(this.f436583l);
    }

    private final void setupAttrs(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, c.m.f443900h, R.attr.sdkBioSelfieFrameStyle, R.style.Widget_Biometry_Selfie);
        try {
            this.f436580i = p.d("M160,4L160,4A156,156 0,0 1,316 160L316,240A156,156 0,0 1,160 396L160,396A156,156 0,0 1,4 240L4,160A156,156 0,0 1,160 4z");
            this.f436581j = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f436582k = typedArrayObtainStyledAttributes.getColor(3, 0);
            this.f436583l = typedArrayObtainStyledAttributes.getColor(0, 0);
            this.f436586o = typedArrayObtainStyledAttributes.getDimension(1, this.f436586o);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
            if (resourceId != 0) {
                a(resourceId);
            }
            int color = typedArrayObtainStyledAttributes.getColor(5, 0);
            if (color != 0) {
                this.f436578g.setColor(color);
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a(int i12) throws Resources.NotFoundException {
        Paint paint = this.f436578g;
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(i12, C43521a.m.f413375x);
        try {
            paint.setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            paint.setColor(typedArrayObtainStyledAttributes.getColor(3, -1));
            if (typedArrayObtainStyledAttributes.hasValue(10)) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(10, -1);
                paint.setTypeface(resourceId != -1 ? i.c(resourceId, getContext()) : Typeface.create(typedArrayObtainStyledAttributes.getString(10), 1));
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @k
    public final C23038g0<Path> getFramePathLive() {
        return this.framePathLive;
    }

    @k
    public RectF getFrameRect() {
        RectF rectF = new RectF();
        Path path = this.f436580i;
        if (path == null) {
            path = null;
        }
        path.computeBounds(rectF, true);
        return rectF;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(null, null);
        canvas.drawPaint(this.f436575d);
        Path path = this.f436580i;
        if (path == null) {
            path = null;
        }
        canvas.drawPath(path, this.f436574c);
        canvas.restoreToCount(iSaveLayer);
        Path path2 = this.f436580i;
        canvas.drawPath(path2 != null ? path2 : null, this.isActive ? this.f436577f : this.f436576e);
        if (this.f436587p.length() > 0) {
            float fWidth = r1.width() / 2.0f;
            ArrayList arrayListA = H.a(this.f436579h.width(), new B(this), this.f436587p);
            float f12 = getFrameRect().bottom;
            Paint paint = this.f436578g;
            float fA2 = D.a(paint) + f12 + f436571r;
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                canvas.drawText((String) it.next(), fWidth, fA2, paint);
                fA2 += D.a(paint) + H91.c.a(3);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        Rect rect = this.f436579h;
        rect.right = i12;
        rect.bottom = i13;
        RectF rectF = new RectF();
        Path path = this.f436580i;
        if (path == null) {
            path = null;
        }
        path.computeBounds(rectF, true);
        Path path2 = this.f436580i;
        if (path2 == null) {
            path2 = null;
        }
        Matrix matrix = new Matrix();
        float f12 = 2;
        matrix.setTranslate(((rect.width() / 2) - (rectF.right / f12)) - H91.c.a(2), ((rect.height() / 2) - (rectF.bottom / f12)) - H91.c.a(10));
        path2.transform(matrix);
        C23038g0 c23038g0 = this.framePathLive;
        Path path3 = this.f436580i;
        c23038g0.setValue(path3 != null ? path3 : null);
    }

    public void setActive(boolean z12) {
        this.isActive = z12;
        invalidate();
    }

    public void setText(@k String text) {
        this.f436587p = text;
        invalidate();
    }

    public /* synthetic */ SdkBioSelfieFrame(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }
}
