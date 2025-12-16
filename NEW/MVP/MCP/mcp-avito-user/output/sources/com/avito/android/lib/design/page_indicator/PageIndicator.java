package com.avito.android.lib.design.page_indicator;

import K51.d;
import Y61.k;
import Y61.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.page_indicator.DotParamsProvider;
import com.avito.android.lib.design.page_indicator.PageIndicator;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D1;
import j.InterfaceC42150f;
import j.f0;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;
import rV.C47601e;
import rV.InterfaceC47597a;
import rV.j;

/* compiled from: PageIndicator.kt */
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019R$\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\r¨\u0006\""}, d2 = {"Lcom/avito/android/lib/design/page_indicator/PageIndicator;", "Landroid/view/View;", "LpK0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "selectedColor", "setSelectedDotColor", "unselectedColor", "setUnselectedDotColor", "pageCount", "setPageCount", "Landroid/graphics/Paint;", "getBackgroundPaint", "()Landroid/graphics/Paint;", "", "getContentWidth", "()F", "getContentHeight", "getAnimationExtraSpace", "value", "r", "I", "setSelectedIndex", "selectedIndex", "SavedState", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PageIndicator extends View implements InterfaceC46971a {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f179865w = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f179866b;

    /* renamed from: c, reason: collision with root package name */
    public float f179867c;

    /* renamed from: d, reason: collision with root package name */
    public float f179868d;

    /* renamed from: e, reason: collision with root package name */
    public float f179869e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Paint f179870f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Paint f179871g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Paint f179872h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Paint f179873i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final RectF f179874j;

    /* renamed from: k, reason: collision with root package name */
    public final float f179875k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final DotParamsProvider f179876l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public InterfaceC47597a<?> f179877m;

    /* renamed from: n, reason: collision with root package name */
    public float f179878n;

    /* renamed from: o, reason: collision with root package name */
    public float f179879o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public float[] f179880p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final ValueAnimator f179881q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public int selectedIndex;

    /* renamed from: s, reason: collision with root package name */
    public int f179883s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f179884t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f179885u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final C47601e f179886v;

    /* compiled from: PageIndicator.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/page_indicator/PageIndicator$SavedState;", "Landroid/view/View$BaseSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Parcelable f179887b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DotParamsProvider.State f179888c;

        /* compiled from: PageIndicator.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), (DotParamsProvider.State) parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(@k Parcelable parcelable, @k DotParamsProvider.State state) {
            super(parcelable);
            this.f179887b = parcelable;
            this.f179888c = state;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f179887b, i12);
            parcel.writeParcelable(this.f179888c, i12);
        }
    }

    public PageIndicator(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.pageIndicator);
        this.f179866b = 5;
        this.f179870f = new Paint();
        this.f179871g = new Paint();
        Paint paint = new Paint();
        paint.setColor(0);
        this.f179872h = paint;
        this.f179873i = new Paint();
        this.f179874j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f179875k = getResources().getDimension(R.dimen.design_page_indicator_bg_rect_radius);
        this.f179876l = new DotParamsProvider();
        this.f179880p = new float[this.f179866b];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        this.f179881q = valueAnimatorOfFloat;
        this.f179883s = -1;
        this.f179886v = new C47601e(this);
        i(attributeSet, 0);
    }

    public static final void b(final PageIndicator pageIndicator, int i12, int i13) {
        int i14 = pageIndicator.selectedIndex;
        if (i12 == i14) {
            return;
        }
        int i15 = i12 - i14;
        boolean z12 = Math.abs(i15) > 1 || pageIndicator.selectedIndex == -1;
        pageIndicator.setSelectedIndex(i12);
        pageIndicator.f179883s = i13 < 0 ? 1 : -1;
        if (i13 == 0) {
            pageIndicator.f179883s = i15 <= 0 ? 1 : -1;
        }
        ValueAnimator valueAnimator = pageIndicator.f179881q;
        if (!z12) {
            int i16 = pageIndicator.f179883s;
            DotParamsProvider dotParamsProvider = pageIndicator.f179876l;
            int i17 = dotParamsProvider.f179858c.f179863a;
            dotParamsProvider.b(i12, i16);
            if (dotParamsProvider.f179858c.f179863a != i17) {
                int i18 = dotParamsProvider.f179857b;
                for (int i19 = 0; i19 < i18; i19++) {
                    float fH2 = pageIndicator.h(i19);
                    int i22 = i19 - pageIndicator.f179883s;
                    int i23 = pageIndicator.f179876l.f179857b;
                    int i24 = i22 % i23;
                    if (i24 < 0) {
                        i24 = i23 - 1;
                    }
                    pageIndicator.f179880p[i19] = fH2 - pageIndicator.h(i24);
                }
                final float animationExtraSpace = pageIndicator.f179883s * pageIndicator.getAnimationExtraSpace();
                if (valueAnimator.isRunning()) {
                    D1.a(valueAnimator, 1);
                    return;
                }
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rV.d
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        int i25 = PageIndicator.f179865w;
                        float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        PageIndicator pageIndicator2 = this.f429818a;
                        pageIndicator2.f179879o = fFloatValue;
                        pageIndicator2.f179878n = animationExtraSpace * fFloatValue;
                        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                        pageIndicator2.postInvalidateOnAnimation();
                    }
                });
                D1.a(valueAnimator, 0);
                valueAnimator.start();
                return;
            }
        }
        valueAnimator.end();
        pageIndicator.f179878n = 0.0f;
        pageIndicator.invalidate();
    }

    public static void d(PageIndicator pageIndicator, Paint paint, int i12) {
        pageIndicator.getClass();
        paint.setColor(i12);
        paint.setAntiAlias(true);
    }

    private final float getAnimationExtraSpace() {
        return (this.f179867c * 2) + this.f179869e;
    }

    private final Paint getBackgroundPaint() {
        boolean z12 = this.f179884t;
        if (z12) {
            return this.f179872h;
        }
        if (z12) {
            throw new NoWhenBranchMatchedException();
        }
        return this.f179873i;
    }

    private final float getContentHeight() {
        return this.f179867c * 2;
    }

    private final float getContentWidth() {
        return ((r0 - 1) * this.f179869e) + (this.f179876l.f179857b * this.f179867c * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPageCount(int pageCount) {
        int iMin = Math.min(pageCount, this.f179866b);
        int i12 = this.f179866b;
        if (iMin < i12 && pageCount >= i12) {
            iMin = i12;
        }
        DotParamsProvider dotParamsProvider = this.f179876l;
        DotParamsProvider.a aVar = dotParamsProvider.f179858c;
        if ((pageCount - 1) - aVar.f179864b <= 0 || dotParamsProvider.f179857b != iMin) {
            dotParamsProvider.f179858c = DotParamsProvider.a(aVar, pageCount, iMin);
        }
        dotParamsProvider.f179856a = pageCount;
        dotParamsProvider.f179857b = iMin;
        this.f179880p = new float[iMin];
        f();
        setSelectedIndex(-1);
        this.f179884t = iMin < 2;
        invalidate();
    }

    private final void setSelectedIndex(int i12) {
        this.selectedIndex = i12;
        Y41.l<? super Integer, G0> lVar = this.f179885u;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i12));
        }
    }

    public final void c(TypedArray typedArray) {
        this.f179866b = typedArray.getInt(7, 5);
        float f12 = 2;
        this.f179867c = typedArray.getDimension(9, typedArray.getResources().getDimension(R.dimen.design_page_indicator_dot_big_size)) / f12;
        this.f179868d = typedArray.getDimension(11, typedArray.getResources().getDimension(R.dimen.design_page_indicator_dot_small_size)) / f12;
        this.f179869e = typedArray.getDimension(8, typedArray.getResources().getDimension(R.dimen.design_page_indicator_dot_offset));
        d(this, this.f179870f, typedArray.getColor(10, C35835l0.d(R.attr.blue, getContext())));
        d(this, this.f179871g, typedArray.getColor(12, C35835l0.d(R.attr.gray12, getContext())));
        d(this, this.f179873i, typedArray.getColor(6, 0));
        setPadding(typedArray.getDimensionPixelOffset(typedArray.hasValue(4) ? 4 : 0, 0), typedArray.getDimensionPixelOffset(1, 0), typedArray.getDimensionPixelOffset(typedArray.hasValue(5) ? 5 : 2, 0), typedArray.getDimensionPixelOffset(3, 0));
    }

    public final void e(@k ViewPager viewPager) {
        InterfaceC47597a<?> interfaceC47597a = this.f179877m;
        if (interfaceC47597a != null) {
            interfaceC47597a.a();
        }
        j jVar = new j(this.f179886v);
        jVar.b(viewPager);
        this.f179877m = jVar;
    }

    public final void f() {
        float contentWidth = getContentWidth();
        float contentHeight = getContentHeight();
        float height = getHeight() / 2.0f;
        float width = getWidth() / 2;
        float f12 = 2;
        float f13 = contentWidth / f12;
        RectF rectF = this.f179874j;
        rectF.left = (width - f13) - getPaddingLeft();
        float f14 = contentHeight / f12;
        rectF.top = (height - f14) - getPaddingTop();
        rectF.right = width + f13 + getPaddingRight();
        rectF.bottom = height + f14 + getPaddingBottom();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r5 == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if ((r0 - r2.f179858c.f179863a) == r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        return r4.f179871g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r4.f179870f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5 == (r2.f179857b - 1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Paint g(int r5) {
        /*
            r4 = this;
            boolean r0 = r4.f179884t
            if (r0 == 0) goto L7
            android.graphics.Paint r5 = r4.f179872h
            goto L2e
        L7:
            int r0 = r4.selectedIndex
            int r1 = r4.f179883s
            com.avito.android.lib.design.page_indicator.DotParamsProvider r2 = r4.f179876l
            int r3 = r2.f179856a
            int r3 = r3 + (-1)
            if (r0 != r3) goto L1a
            int r0 = r2.f179857b
            int r0 = r0 + (-1)
            if (r5 != r0) goto L2c
            goto L29
        L1a:
            if (r0 != 0) goto L1f
            if (r5 != 0) goto L2c
            goto L29
        L1f:
            r2.b(r0, r1)
            com.avito.android.lib.design.page_indicator.DotParamsProvider$a r1 = r2.f179858c
            int r1 = r1.f179863a
            int r0 = r0 - r1
            if (r0 != r5) goto L2c
        L29:
            android.graphics.Paint r5 = r4.f179870f
            goto L2e
        L2c:
            android.graphics.Paint r5 = r4.f179871g
        L2e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.page_indicator.PageIndicator.g(int):android.graphics.Paint");
    }

    public final float h(int i12) {
        int i13 = this.selectedIndex;
        int i14 = this.f179883s;
        DotParamsProvider dotParamsProvider = this.f179876l;
        if (i12 >= 0) {
            int i15 = dotParamsProvider.f179856a;
            if (i12 < i15) {
                if (i15 > dotParamsProvider.f179857b) {
                    dotParamsProvider.b(i13, i14);
                    if (i12 != 0) {
                    }
                }
                return this.f179867c;
            }
        } else {
            dotParamsProvider.getClass();
        }
        return this.f179868d;
    }

    public final void i(AttributeSet attributeSet, int i12) {
        int i13 = i12 == 0 ? R.attr.pageIndicator : 0;
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 <= 0) {
            numValueOf = null;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178965e0, i13, numValueOf != null ? numValueOf.intValue() : R.style.Design_Widget_PageIndicator);
        c(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        float f12 = this.f179875k;
        canvas.drawRoundRect(this.f179874j, f12, f12, getBackgroundPaint());
        float f13 = 2;
        float measuredWidth = ((getMeasuredWidth() - getContentWidth()) / f13) + this.f179867c;
        float f14 = this.f179878n;
        float f15 = measuredWidth + f14;
        DotParamsProvider dotParamsProvider = this.f179876l;
        int i12 = 0;
        if (f14 == 0.0f) {
            int i13 = dotParamsProvider.f179857b;
            while (i12 < i13) {
                canvas.drawCircle((((this.f179867c * f13) + this.f179869e) * i12) + f15, getHeight() / f13, h(i12), g(i12));
                i12++;
            }
            return;
        }
        int i14 = dotParamsProvider.f179857b;
        while (i12 < i14) {
            int i15 = i12 - this.f179883s;
            int i16 = this.f179876l.f179857b;
            int i17 = i15 % i16;
            if (i17 < 0) {
                i17 = i16 - 1;
            }
            float fMin = Math.min((this.f179880p[i12] * this.f179879o) + h(i17), this.f179867c);
            Paint paintG = g(i12);
            int i18 = i12 - this.f179883s;
            if (this.f179879o >= 0.25f || i17 == i18) {
                canvas.drawCircle((((this.f179867c * f13) + this.f179869e) * i18) + f15, getHeight() / f13, fMin, paintG);
            }
            i12++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        float paddingRight = getPaddingRight() + getPaddingLeft() + getContentWidth() + getAnimationExtraSpace();
        float paddingBottom = getPaddingBottom() + getPaddingTop() + getContentHeight();
        int iMin = (int) paddingRight;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, size);
        } else if (mode == 1073741824) {
            iMin = size;
        }
        int iMin2 = (int) paddingBottom;
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (mode2 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, size2);
        } else if (mode2 == 1073741824) {
            iMin2 = size2;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        DotParamsProvider dotParamsProvider = this.f179876l;
        dotParamsProvider.getClass();
        DotParamsProvider.State state = savedState.f179888c;
        DotParamsProvider.a aVar = new DotParamsProvider.a(state.f179859b, state.f179860c);
        int i12 = dotParamsProvider.f179857b;
        boolean z12 = i12 > 0 && dotParamsProvider.f179856a > 0;
        int i13 = state.f179861d;
        int i14 = state.f179862e;
        boolean z13 = (i14 == i12 && i13 == dotParamsProvider.f179856a) ? false : true;
        if (z12 && z13) {
            dotParamsProvider.f179858c = DotParamsProvider.a(aVar, dotParamsProvider.f179856a, i12);
            return;
        }
        dotParamsProvider.f179858c = aVar;
        dotParamsProvider.f179857b = i14;
        dotParamsProvider.f179856a = i13;
    }

    @Override // android.view.View
    @l
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        DotParamsProvider dotParamsProvider = this.f179876l;
        dotParamsProvider.getClass();
        DotParamsProvider.a aVar = dotParamsProvider.f179858c;
        return new SavedState(parcelableOnSaveInstanceState, new DotParamsProvider.State(aVar.f179863a, aVar.f179864b, dotParamsProvider.f179856a, dotParamsProvider.f179857b));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        f();
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178965e0);
        c(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setSelectedDotColor(int selectedColor) {
        d(this, this.f179870f, selectedColor);
    }

    public final void setUnselectedDotColor(int unselectedColor) {
        d(this, this.f179871g, unselectedColor);
    }

    public PageIndicator(@l Context context, int i12) {
        super(context, null, R.attr.pageIndicator, i12);
        this.f179866b = 5;
        this.f179870f = new Paint();
        this.f179871g = new Paint();
        Paint paint = new Paint();
        paint.setColor(0);
        this.f179872h = paint;
        this.f179873i = new Paint();
        this.f179874j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f179875k = getResources().getDimension(R.dimen.design_page_indicator_bg_rect_radius);
        this.f179876l = new DotParamsProvider();
        this.f179880p = new float[this.f179866b];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        this.f179881q = valueAnimatorOfFloat;
        this.f179883s = -1;
        this.f179886v = new C47601e(this);
        i(null, i12);
    }
}
