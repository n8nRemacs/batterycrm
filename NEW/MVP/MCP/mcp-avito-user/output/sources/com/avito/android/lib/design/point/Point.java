package com.avito.android.lib.design.point;

import X41.j;
import Y61.k;
import Y61.l;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.f0;
import j.r;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: Point.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0007R*\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0007R*\u0010\u001a\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u0007R*\u0010\"\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u0007¨\u0006#"}, d2 = {"Lcom/avito/android/lib/design/point/Point;", "Landroid/view/View;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "value", "o", "I", "getSize", "()I", "setSize", "size", "p", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "", "q", "Z", "getWithStroke", "()Z", "setWithStroke", "(Z)V", "withStroke", "r", "getColor", "setColor", "color", "s", "getStrokeColor", "setStrokeColor", "strokeColor", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Point extends View implements InterfaceC46971a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f180054b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f180055c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Paint f180056d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f180057e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f180058f;

    /* renamed from: g, reason: collision with root package name */
    public int f180059g;

    /* renamed from: h, reason: collision with root package name */
    public float f180060h;

    /* renamed from: i, reason: collision with root package name */
    public float f180061i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public AnimatorSet f180062j;

    /* renamed from: k, reason: collision with root package name */
    public float f180063k;

    /* renamed from: l, reason: collision with root package name */
    public long f180064l;

    /* renamed from: m, reason: collision with root package name */
    public long f180065m;

    /* renamed from: n, reason: collision with root package name */
    public int f180066n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @r
    public int size;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @r
    public int strokeWidth;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean withStroke;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int color;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int strokeColor;

    @j
    public Point(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void a(TypedArray typedArray) {
        setColor(typedArray.getColor(4, 0));
        setSize(typedArray.getDimensionPixelOffset(9, this.size));
        setStrokeWidth(typedArray.getDimensionPixelOffset(11, this.strokeWidth));
        setStrokeColor(typedArray.getColor(10, 0));
        this.f180059g = typedArray.getDimensionPixelSize(8, this.f180059g);
        this.f180060h = typedArray.getFloat(7, 0.0f);
        float f12 = typedArray.getFloat(6, 0.0f);
        this.f180061i = f12;
        this.f180055c.setAlpha((int) (f12 * 255));
        this.f180064l = typedArray.getInteger(1, 0);
        this.f180065m = typedArray.getInteger(0, 0);
        this.f180066n = typedArray.getInteger(2, this.f180066n);
    }

    public final int getColor() {
        return this.color;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeWidth() {
        return this.strokeWidth;
    }

    public final boolean getWithStroke() {
        return this.withStroke;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f180062j;
        if (animatorSet != null) {
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.f180062j = null;
            this.f180063k = 0.0f;
            this.f180055c.setAlpha((int) (this.f180061i * 255));
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        boolean zIsInEditMode = isInEditMode();
        Paint paint = this.f180055c;
        if (zIsInEditMode && !this.f180058f) {
            canvas.drawCircle(width, height, (this.f180059g / 2.0f) * 1.46f, paint);
            canvas.drawCircle(width, height, this.f180059g / 2.0f, paint);
        }
        canvas.drawCircle(width, height, (this.f180059g * this.f180063k) / 2.0f, paint);
        if (this.withStroke) {
            canvas.drawCircle(width, height, this.size / 2.0f, this.f180056d);
        }
        canvas.drawCircle(width, height, this.size / 2.0f, this.f180054b);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int iMin;
        Integer numValueOf = Integer.valueOf(this.strokeWidth * 2);
        if (!this.withStroke) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        boolean z12 = this.f180057e;
        if (z12) {
            iMin = (int) (this.f180059g * 1.46f);
        } else {
            if (z12) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = iIntValue + this.size;
        }
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(iMin, size);
        } else if (mode != 1073741824) {
            size = iMin;
        }
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (mode2 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, size2);
        } else if (mode2 == 1073741824) {
            iMin = size2;
        }
        setMeasuredDimension(size, iMin);
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178985o0);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setColor(int i12) {
        this.color = i12;
        this.f180054b.setColor(i12);
        this.f180055c.setColor(i12);
        invalidate();
    }

    public final void setSize(int i12) {
        this.size = i12;
        requestLayout();
    }

    public final void setStrokeColor(int i12) {
        this.strokeColor = i12;
        this.f180056d.setColor(i12);
        invalidate();
    }

    public final void setStrokeWidth(int i12) {
        this.strokeWidth = i12;
        this.f180056d.setStrokeWidth(i12);
        requestLayout();
    }

    public final void setWithStroke(boolean z12) {
        this.withStroke = z12;
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Point(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        Context context2;
        int i15;
        int i16 = 2;
        AttributeSet attributeSet2 = (i14 & 2) != 0 ? null : attributeSet;
        int i17 = (i14 & 4) != 0 ? R.attr.point : i12;
        if ((i14 & 8) != 0) {
            i15 = R.style.Design_Widget_Point;
            context2 = context;
        } else {
            context2 = context;
            i15 = i13;
        }
        super(context2, attributeSet2, i17);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f180054b = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.f180055c = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        this.f180056d = paint3;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet2, d.n.f178985o0, i17, i15);
        setWithStroke(typedArrayObtainStyledAttributes.getBoolean(13, false));
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f180057e = typedArrayObtainStyledAttributes.getBoolean(3, this.f180057e);
        this.f180058f = typedArrayObtainStyledAttributes.getBoolean(5, this.f180058f);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        if (z12 && this.f180062j == null) {
            new d();
            long j12 = this.f180064l;
            long j13 = this.f180065m;
            int i18 = this.f180066n;
            final a aVar = new a(this);
            ArrayList arrayList = new ArrayList();
            int i19 = 0;
            while (i19 < i18) {
                long j14 = j12 / i16;
                float[] fArr = new float[i16];
                // fill-array-data instruction
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                valueAnimatorOfFloat.setDuration(j14);
                int i22 = i18;
                valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.71f, -0.46f, 0.88f, 0.6f));
                final int i23 = 1;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.lib.design.point.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i23) {
                            case 0:
                                aVar.invoke((Float) valueAnimator.getAnimatedValue());
                                break;
                            default:
                                aVar.invoke((Float) valueAnimator.getAnimatedValue());
                                break;
                        }
                    }
                });
                valueAnimatorOfFloat.setStartDelay(i19 > 0 ? j12 : 0L);
                arrayList.add(valueAnimatorOfFloat);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(j14);
                valueAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.12f, 0.4f, 0.29f, 1.46f));
                final int i24 = 0;
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.lib.design.point.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i24) {
                            case 0:
                                aVar.invoke((Float) valueAnimator.getAnimatedValue());
                                break;
                            default:
                                aVar.invoke((Float) valueAnimator.getAnimatedValue());
                                break;
                        }
                    }
                });
                arrayList.add(valueAnimatorOfFloat2);
                i19++;
                i16 = 2;
                i18 = i22;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(arrayList);
            animatorSet.addListener(new c(new l0.a(), aVar, arrayList, animatorSet, j12, j13));
            this.f180062j = animatorSet;
            animatorSet.start();
        }
    }
}
