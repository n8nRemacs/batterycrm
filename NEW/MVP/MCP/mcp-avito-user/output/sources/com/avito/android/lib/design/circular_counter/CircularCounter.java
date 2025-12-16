package com.avito.android.lib.design.circular_counter;

import PK0.n;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.lib.design.circular_counter.a;
import com.avito.android.lib.design.circular_counter.b;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.text_view.e;
import com.avito.android.lib.util.c;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35821j2;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CircularCounter.kt */
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u00017J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b!\u0010\u0018J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0019¢\u0006\u0004\b&\u0010$R$\u0010\u001a\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00138\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b(\u0010)\"\u0004\b\u001b\u0010*R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b+\u0010,\"\u0004\b\u0017\u0010-R$\u0010 \u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b.\u0010,\"\u0004\b!\u0010-R$\u00101\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00108\u0002@BX\u0083\u000e¢\u0006\f\n\u0004\b/\u0010,\"\u0004\b0\u0010-R$\u00102\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b2\u00103\"\u0004\b4\u0010$R$\u00105\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b5\u00103\"\u0004\b6\u0010$¨\u00068"}, d2 = {"Lcom/avito/android/lib/design/circular_counter/CircularCounter;", "Landroid/view/View;", "LLV/a;", "Lcom/avito/android/lib/design/circular_counter/a;", "Lcom/avito/android/lib/design/circular_counter/b;", "newStyle", "Lkotlin/G0;", "setStyle", "(Lcom/avito/android/lib/design/circular_counter/b;)V", "newState", "setState", "(Lcom/avito/android/lib/design/circular_counter/a;)V", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "getProgress", "()F", "", "getCounter", "()Ljava/lang/CharSequence;", "progress", "setProgress", "(Ljava/lang/Float;)V", "", "counter", "setCounter", "(Ljava/lang/Integer;)V", "", "setStringCounter", "(Ljava/lang/String;)V", "progressMax", "setProgressMax", "backgroundColor", "setBackgroundColor", "(I)V", "color", "setTrackColor", "value", "j", "Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;)V", "k", "F", "(F)V", "l", "m", "setProgressBarWidth", "progressBarWidth", "progressBarColor", "I", "setProgressBarColor", "backgroundProgressBarColor", "setBackgroundProgressBarColor", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CircularCounter extends View implements LV.a<com.avito.android.lib.design.circular_counter.a, b> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.circular_counter.a f178816b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public b f178817c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f178818d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Paint f178819e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Paint f178820f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.text_view.a f178821g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageView f178822h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final FrameLayout f178823i;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    public CharSequence counter;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public float progress;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float progressMax;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @U
    public float progressBarWidth;

    /* compiled from: CircularCounter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/lib/design/circular_counter/CircularCounter$a;", "", "<init>", "()V", "", "DEFAULT_ICON_SIZE", "I", "", "DEFAULT_MAX_VALUE", "F", "DEFAULT_START_ANGLE", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @j
    public CircularCounter(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void setBackgroundProgressBarColor(int i12) {
        this.f178819e.setColor(i12);
        invalidate();
    }

    private final void setCounter(CharSequence charSequence) {
        this.counter = charSequence;
        if (!C43066x.K(charSequence)) {
            D6.w(this.f178822h);
        }
        I5.a(this.f178821g, this.counter, false);
        invalidate();
    }

    private final void setProgress(float f12) {
        float f13 = this.progress;
        float f14 = this.progressMax;
        if (f13 > f14) {
            f12 = f14;
        }
        this.progress = f12;
        invalidate();
    }

    private final void setProgressBarColor(int i12) {
        this.f178820f.setColor(i12);
        invalidate();
    }

    private final void setProgressBarWidth(float f12) {
        this.progressBarWidth = f12;
        Paint paint = this.f178820f;
        paint.setStrokeWidth(f12);
        this.f178819e.setStrokeWidth(f12);
        paint.setStrokeCap(Paint.Cap.ROUND);
        requestLayout();
        invalidate();
    }

    private final void setProgressMax(float f12) {
        this.progressMax = f12;
        invalidate();
    }

    @k
    public final CharSequence getCounter() {
        return this.counter;
    }

    public final float getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f178818d;
        canvas.drawOval(rectF, this.f178819e);
        canvas.drawArc(rectF, 270.0f, 360 * ((this.progress * 100.0f) / this.progressMax), false, this.f178820f);
        this.f178823i.draw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        com.avito.android.lib.design.text_view.a aVar = this.f178821g;
        FrameLayout frameLayout = this.f178823i;
        aVar.layout((frameLayout.getMeasuredWidth() / 2) - (aVar.getMeasuredWidth() / 2), (frameLayout.getMeasuredHeight() / 2) - (aVar.getMeasuredHeight() / 2), getWidth(), getHeight());
        int measuredWidth = frameLayout.getMeasuredWidth() / 2;
        ImageView imageView = this.f178822h;
        int measuredWidth2 = measuredWidth - (imageView.getMeasuredWidth() / 2);
        int measuredHeight = (frameLayout.getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2);
        imageView.layout(measuredWidth2, measuredHeight, imageView.getMeasuredWidth() + measuredWidth2, imageView.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        Integer num;
        Integer num2;
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i12), View.getDefaultSize(getSuggestedMinimumHeight(), i13));
        setMeasuredDimension(iMin, iMin);
        RectF rectF = this.f178818d;
        float f12 = this.progressBarWidth;
        float f13 = 2;
        float f14 = iMin;
        rectF.set(f12 / f13, f12 / f13, f14 - (f12 / f13), f14 - (f12 / f13));
        this.f178821g.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        ImageView imageView = this.f178822h;
        b bVar = this.f178817c;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((bVar == null || (num2 = bVar.f178838e) == null) ? y6.b(20) : num2.intValue(), 1073741824);
        b bVar2 = this.f178817c;
        imageView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((bVar2 == null || (num = bVar2.f178838e) == null) ? y6.b(20) : num.intValue(), 1073741824));
        this.f178823i.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        setBackgroundProgressBarColor(backgroundColor);
    }

    public final void setIcon(@l Drawable iconDrawable) {
        if (iconDrawable == null) {
            return;
        }
        D6.w(this.f178821g);
        ImageView imageView = this.f178822h;
        D6.H(imageView);
        C35821j2.a(imageView, iconDrawable);
    }

    public final void setStringCounter(@l String counter) {
        if (counter != null) {
            setCounter(counter);
        }
    }

    public final void setTrackColor(int color) {
        setProgressBarColor(color);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CircularCounter(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        this.f178818d = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f178819e = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        this.f178820f = paint2;
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar.setId(R.id.counter_text);
        aVar.setGravity(17);
        this.f178821g = aVar;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.counter_image);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(y6.b(20), y6.b(20), 17));
        this.f178822h = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f178823i = frameLayout;
        this.counter = "0";
        this.progressMax = 100.0f;
        frameLayout.addView(aVar);
        frameLayout.addView(imageView);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178978l, i12, i13);
        b.f178833g.getClass();
        setStyle(b.a.b(typedArrayObtainStyledAttributes, context));
        setProgress(typedArrayObtainStyledAttributes.getFloat(8, 0.0f));
        String string = typedArrayObtainStyledAttributes.getString(6);
        setCounter(string == null ? "" : string);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setIcon(typedArrayObtainStyledAttributes.getDrawable(7));
        }
        setProgressMax(typedArrayObtainStyledAttributes.getFloat(9, this.progressMax));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // LV.b
    public void setState(@k com.avito.android.lib.design.circular_counter.a newState) {
        com.avito.android.lib.design.circular_counter.a aVar = this.f178816b;
        if (new c(newState, aVar).f181333c) {
            return;
        }
        this.f178816b = newState;
        a.AbstractC5261a abstractC5261a = aVar != null ? aVar.f178828a : null;
        a.AbstractC5261a abstractC5261a2 = newState.f178828a;
        if (!new c(abstractC5261a2, abstractC5261a).f181333c && abstractC5261a2 != null) {
            if (abstractC5261a2 instanceof a.AbstractC5261a.b) {
                setCounter(((a.AbstractC5261a.b) abstractC5261a2).f178832a.toString());
                D6.H(this.f178821g);
                D6.w(this.f178822h);
            } else if (abstractC5261a2 instanceof a.AbstractC5261a.C5262a) {
                setIcon(((a.AbstractC5261a.C5262a) abstractC5261a2).f178831a);
                invalidate();
            }
        }
        if (!new c(Integer.valueOf(newState.f178829b), aVar != null ? Integer.valueOf(aVar.f178829b) : null).f181333c) {
            setProgress(r2.intValue() / 100);
        }
        if (new c(Integer.valueOf(newState.f178830c), aVar != null ? Integer.valueOf(aVar.f178830c) : null).f181333c) {
            return;
        }
        setProgressMax(r6.intValue());
    }

    @Override // LV.d
    public void setStyle(@k b newStyle) {
        b bVar = this.f178817c;
        if (new c(newStyle, bVar).f181333c) {
            return;
        }
        this.f178817c = newStyle;
        n nVar = bVar != null ? bVar.f178839f : null;
        n nVar2 = newStyle.f178839f;
        if (!new c(nVar2, nVar).f181333c && nVar2 != null) {
            e.a(this.f178821g, nVar2);
        }
        Float f12 = bVar != null ? bVar.f178836c : null;
        Float f13 = newStyle.f178836c;
        if (!new c(f13, f12).f181333c && f13 != null) {
            setProgressBarWidth(f13.floatValue());
        }
        C35763c0 c35763c0 = bVar != null ? bVar.f178834a : null;
        C35763c0 c35763c02 = newStyle.f178834a;
        if (!new c(c35763c02, c35763c0).f181333c && c35763c02 != null) {
            setProgressBarColor(c35763c02.f318848a);
        }
        C35763c0 c35763c03 = bVar != null ? bVar.f178835b : null;
        C35763c0 c35763c04 = newStyle.f178835b;
        if (!new c(c35763c04, c35763c03).f181333c && c35763c04 != null) {
            setBackgroundProgressBarColor(c35763c04.f318848a);
        }
        Integer num = bVar != null ? bVar.f178837d : null;
        Integer num2 = newStyle.f178837d;
        if (!new c(num2, num).f181333c && num2 != null) {
            int iIntValue = num2.intValue();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = iIntValue;
            layoutParams.height = iIntValue;
            setLayoutParams(layoutParams);
            requestLayout();
        }
        Integer num3 = bVar != null ? bVar.f178838e : null;
        Integer num4 = newStyle.f178838e;
        if (new c(num4, num3).f181333c || num4 == null) {
            return;
        }
        int iIntValue2 = num4.intValue();
        ImageView imageView = this.f178822h;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.width = iIntValue2;
        layoutParams2.height = iIntValue2;
        imageView.setLayoutParams(layoutParams2);
        requestLayout();
    }

    public final void setProgress(@l Float progress) {
        if (progress != null) {
            setProgress(progress.floatValue());
        }
    }

    public final void setProgressMax(@l Float progressMax) {
        if (progressMax != null) {
            setProgressMax(progressMax.floatValue());
        }
    }

    public final void setCounter(@l Integer counter) {
        setStringCounter(counter != null ? counter.toString() : null);
    }
}
