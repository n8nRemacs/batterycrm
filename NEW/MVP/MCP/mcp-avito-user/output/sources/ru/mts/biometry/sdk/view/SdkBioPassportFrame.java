package ru.mts.biometry.sdk.view;

import Ba1.D;
import Ba1.H;
import Ca1.o;
import Ca1.p;
import Ca1.q;
import Ca1.r;
import Ca1.s;
import H91.c;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.i;
import androidx.view.C22981N;
import androidx.view.C22985S;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import l.C43521a;
import z91.c;

@s0
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u001b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010(\u001a\u00020!2\u0006\u0010\t\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/mts/biometry/sdk/view/SdkBioPassportFrame;", "Landroid/view/View;", "Landroidx/lifecycle/P;", "Landroid/util/AttributeSet;", "attrs", "Lkotlin/G0;", "setupAttrs", "(Landroid/util/AttributeSet;)V", "", "value", "setVerticalBias", "(F)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "ratio", "setRatio", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "Landroid/graphics/RectF;", "d", "Landroid/graphics/RectF;", "getFrameRect", "()Landroid/graphics/RectF;", "frameRect", "", "e", "Z", "setActive", "(Z)V", "isActive", "", "x", "I", "getFramePadding", "()I", "setFramePadding", "(I)V", "framePadding", "getTextHeight", "()F", "textHeight", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SdkBioPassportFrame extends View implements InterfaceC22983P {

    /* renamed from: y, reason: collision with root package name */
    public static final int f436542y = c.a(21);

    /* renamed from: z, reason: collision with root package name */
    public static final int f436543z = c.a(25);

    /* renamed from: b, reason: collision with root package name */
    public float f436544b;

    /* renamed from: c, reason: collision with root package name */
    public final C22985S f436545c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final RectF frameRect;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isActive;

    /* renamed from: f, reason: collision with root package name */
    public final Z1 f436548f;

    /* renamed from: g, reason: collision with root package name */
    public float f436549g;

    /* renamed from: h, reason: collision with root package name */
    public int f436550h;

    /* renamed from: i, reason: collision with root package name */
    public int f436551i;

    /* renamed from: j, reason: collision with root package name */
    public final float f436552j;

    /* renamed from: k, reason: collision with root package name */
    public int f436553k;

    /* renamed from: l, reason: collision with root package name */
    public int f436554l;

    /* renamed from: m, reason: collision with root package name */
    public int f436555m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f436556n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f436557o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f436558p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f436559q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f436560r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f436561s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f436562t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f436563u;

    /* renamed from: v, reason: collision with root package name */
    public String f436564v;

    /* renamed from: w, reason: collision with root package name */
    public String f436565w;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int framePadding;

    @j
    public SdkBioPassportFrame(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final float getTextHeight() {
        float fA2 = f436542y;
        int size = H.a(this.f436550h, new r(this), this.f436564v).size();
        for (int i12 = 0; i12 < size; i12++) {
            fA2 += D.a(this.f436558p) + c.a(3);
        }
        int size2 = H.a(this.f436550h, new s(this), this.f436565w).size();
        for (int i13 = 0; i13 < size2; i13++) {
            fA2 += D.a(this.f436559q) + c.a(3);
        }
        return fA2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActive(boolean z12) {
        if (z12 == this.isActive) {
            return;
        }
        this.isActive = z12;
        Canvas canvas = this.f436562t;
        if (canvas == null) {
            return;
        }
        int i12 = z12 ? this.f436555m : this.f436554l;
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f436557o.setColor(i12);
        Drawable drawable = this.f436563u;
        if (drawable != null) {
            drawable.setTint(i12);
        }
        Drawable drawable2 = this.f436563u;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        invalidate();
    }

    private final void setupAttrs(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, c.m.f443897e, R.attr.sdkBioPassportFrameStyle, R.style.Widget_Biometry_Passport);
        try {
            this.f436553k = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f436555m = typedArrayObtainStyledAttributes.getColor(1, this.f436555m);
            this.f436554l = typedArrayObtainStyledAttributes.getColor(3, this.f436554l);
            this.f436549g = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
            Paint paint = this.f436558p;
            if (resourceId != 0) {
                b(paint, resourceId);
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
            Paint paint2 = this.f436559q;
            if (resourceId2 != 0) {
                b(paint2, resourceId2);
            }
            int color = typedArrayObtainStyledAttributes.getColor(7, 0);
            if (color != 0) {
                paint.setColor(color);
                paint2.setColor(color);
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a() {
        RectF rectF = this.frameRect;
        Rect rect = this.f436560r;
        rectF.left = (rect.width() - this.f436550h) / 2.0f;
        rectF.top = (((rect.height() * this.f436549g) - this.f436551i) - getTextHeight()) / 2.0f;
        rectF.right = rectF.left + this.f436550h;
        rectF.bottom = rectF.top + this.f436551i;
    }

    public final void b(Paint paint, int i12) throws Resources.NotFoundException {
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

    public final int getFramePadding() {
        return this.framePadding;
    }

    @k
    public final RectF getFrameRect() {
        return this.frameRect;
    }

    @Override // androidx.view.InterfaceC22983P
    @k
    public Lifecycle getLifecycle() {
        return this.f436545c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f436545c.h(Lifecycle.State.f46683f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f436545c.h(Lifecycle.State.f46681d);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        if (getWidth() == 0 || getHeight() == 0 || (bitmap = this.f436561s) == null) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(null, null);
        canvas.drawColor(this.f436553k);
        RectF rectF = this.frameRect;
        Paint paint = this.f436556n;
        float f12 = this.f436552j;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        canvas.restoreToCount(iSaveLayer);
        if (this.f436563u != null) {
            canvas.drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        } else {
            canvas.drawRoundRect(rectF, f12, f12, this.f436557o);
        }
        if (this.f436564v.length() > 0) {
            float fWidth = this.f436560r.width() / 2.0f;
            ArrayList arrayListA = H.a(this.f436550h, new p(this), this.f436564v);
            float f13 = rectF.bottom;
            Paint paint2 = this.f436558p;
            float fA2 = D.a(paint2) + f13 + f436542y;
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                canvas.drawText((String) it.next(), fWidth, fA2, paint2);
                fA2 += D.a(paint2) + H91.c.a(3);
            }
            if (this.f436565w.length() == 0) {
                return;
            }
            Iterator it2 = H.a(this.f436550h, new q(this), this.f436565w).iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                Paint paint3 = this.f436559q;
                canvas.drawText(str, fWidth, fA2, paint3);
                fA2 += D.a(paint3) + H91.c.a(3);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        Canvas canvas;
        super.onSizeChanged(i12, i13, i14, i15);
        if (i12 == 0 || i13 == 0) {
            return;
        }
        Rect rect = this.f436560r;
        rect.right = i12;
        rect.bottom = i13;
        int iWidth = rect.width();
        int i16 = f436543z;
        int i17 = iWidth - (i16 * 2);
        int i18 = (int) (i17 * this.f436544b);
        if (i18 > getHeight()) {
            this.f436550h = (int) (getHeight() / this.f436544b);
            this.f436551i = (getHeight() - ((int) getTextHeight())) - i16;
        } else {
            this.f436550h = i17;
            this.f436551i = i18;
        }
        Drawable drawable = this.f436563u;
        if (drawable != null) {
            int i19 = this.framePadding;
            drawable.setBounds(i19, i19, this.f436550h - i19, this.f436551i - i19);
        }
        a();
        if (this.f436550h != 0 && this.f436551i != 0 && ((canvas = this.f436562t) == null || canvas.getWidth() != this.f436550h || canvas.getHeight() != this.f436551i)) {
            this.f436561s = Bitmap.createBitmap(this.f436550h, this.f436551i, Bitmap.Config.ARGB_8888);
            this.f436562t = new Canvas(this.f436561s);
        }
        Canvas canvas2 = this.f436562t;
        if (canvas2 == null) {
            return;
        }
        int i22 = this.isActive ? this.f436555m : this.f436554l;
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f436557o.setColor(i22);
        Drawable drawable2 = this.f436563u;
        if (drawable2 != null) {
            drawable2.setTint(i22);
        }
        Drawable drawable3 = this.f436563u;
        if (drawable3 != null) {
            drawable3.draw(canvas2);
        }
        invalidate();
    }

    public final void setDrawable(@k Drawable drawable) {
        this.f436563u = drawable;
        this.f436544b = drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
        a();
        invalidate();
    }

    public final void setFramePadding(int i12) {
        this.framePadding = i12;
        invalidate();
    }

    public final void setRatio(float ratio) {
        this.f436544b = ratio;
        a();
        invalidate();
    }

    public final void setVerticalBias(float value) {
        this.f436549g = value;
        a();
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SdkBioPassportFrame(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f436544b = 1.0f;
        this.f436545c = new C22985S(this, true);
        this.frameRect = new RectF();
        this.f436548f = p2.a(Boolean.FALSE);
        this.f436549g = 1.0f;
        this.f436552j = context.getResources().getDimensionPixelSize(R.dimen.sdk_bio_passport_frame_radius);
        this.f436554l = -1;
        this.f436555m = -16711936;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setColor(0);
        this.f436556n = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint3.setStrokeWidth(H91.c.a(6));
        this.f436557o = paint3;
        Paint paint4 = new Paint(1);
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        this.f436558p = paint4;
        Paint paint5 = new Paint(1);
        paint5.setTextAlign(align);
        this.f436559q = paint5;
        this.f436560r = new Rect();
        this.f436564v = "";
        this.f436565w = "";
        this.framePadding = H91.c.a(0);
        if (attributeSet != null) {
            setupAttrs(attributeSet);
        }
        paint.setColor(this.f436553k);
        C22981N.a(getLifecycle()).e(new o(this, null));
    }
}
