package com.avito.android.lib.deprecated_design.progress_step_bar;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import fw.C40487a;
import hw.InterfaceC41179d;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.f0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: ProgressStepBar.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001f J\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0007R*\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0007R*\u0010\u0016\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0007R*\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u0007R$\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\f¨\u0006!"}, d2 = {"Lcom/avito/android/lib/deprecated_design/progress_step_bar/a;", "Landroid/view/View;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "value", "m", "I", "getStepColor", "()I", "setStepColor", "stepColor", "n", "getEmptyStepColor", "setEmptyStepColor", "emptyStepColor", "o", "getSeparatorColor", "setSeparatorColor", "separatorColor", "p", "getStepsCount", "setStepsCount", "stepsCount", "<set-?>", "q", "getStepPosition", "stepPosition", "a", "b", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class a extends View implements InterfaceC46971a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f178057b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RectF f178058c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f178059d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Path f178060e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Path f178061f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Path f178062g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final float[] f178063h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ArrayList f178064i;

    /* renamed from: j, reason: collision with root package name */
    public int f178065j;

    /* renamed from: k, reason: collision with root package name */
    public int f178066k;

    /* renamed from: l, reason: collision with root package name */
    public float f178067l;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int stepColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int emptyStepColor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int separatorColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int stepsCount;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int stepPosition;

    /* compiled from: ProgressStepBar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/deprecated_design/progress_step_bar/a$a;", "", "<init>", "()V", "", "DEFAULT_DONE_STEP_POSITION", "I", "DEFAULT_STEP_ANIMATION_DURATION", "DEFAULT_STEP_ANIMATION_START_DELAY", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.deprecated_design.progress_step_bar.a$a, reason: collision with other inner class name */
    public static final class C5246a {
        public /* synthetic */ C5246a(C42822w c42822w) {
            this();
        }

        public C5246a() {
        }
    }

    /* compiled from: ProgressStepBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/deprecated_design/progress_step_bar/a$b;", "", "<init>", "()V", "a", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* compiled from: ProgressStepBar.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/deprecated_design/progress_step_bar/a$b$a;", "", "<init>", "()V", "", "PROGRESS_DONE", "F", "PROGRESS_NONE", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.deprecated_design.progress_step_bar.a$b$a, reason: collision with other inner class name */
        public static final class C5247a {
            public /* synthetic */ C5247a(C42822w c42822w) {
                this();
            }

            public C5247a() {
            }
        }

        static {
            new C5247a(null);
        }
    }

    static {
        new C5246a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.progressStepBar : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_ProgressStepBar : i13;
        super(context, attributeSet, i12, i13);
        this.f178057b = new Paint(1);
        this.f178058c = new RectF();
        this.f178059d = new RectF();
        this.f178060e = new Path();
        this.f178061f = new Path();
        this.f178062g = new Path();
        this.f178063h = new float[8];
        this.f178064i = new ArrayList();
        new DecelerateInterpolator();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40487a.l.f396190e, i12, i13);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        this.stepPosition = -1;
    }

    public final void a(TypedArray typedArray) {
        setStepColor(typedArray.getColor(2, this.stepColor));
        setEmptyStepColor(typedArray.getColor(1, this.emptyStepColor));
        setSeparatorColor(typedArray.getColor(3, this.separatorColor));
        this.f178065j = typedArray.getDimensionPixelOffset(4, this.f178065j);
        this.f178066k = typedArray.getDimensionPixelOffset(0, this.f178066k);
        setStepsCount(typedArray.getInteger(7, this.stepsCount));
        typedArray.getInteger(5, 350);
        typedArray.getInteger(6, 150);
        if (isInEditMode()) {
            invalidate();
        }
    }

    public final void b() {
        this.stepPosition = -1;
        ArrayList arrayList = this.f178064i;
        arrayList.clear();
        int i12 = this.stepsCount;
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(new b());
        }
        c();
        postInvalidateOnAnimation();
    }

    public final void c() {
        float f12;
        float f13;
        ArrayList arrayList = this.f178064i;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.f178060e;
        path.reset();
        this.f178061f.reset();
        Path path2 = this.f178062g;
        path2.reset();
        RectF rectF = this.f178059d;
        rectF.setEmpty();
        RectF rectF2 = this.f178058c;
        rectF.set(rectF2);
        float fWidth = (rectF2.width() - ((arrayList.size() - 1) * this.f178065j)) / arrayList.size();
        float f14 = rectF2.left;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            int i13 = i12 + 1;
            b bVar = (b) it.next();
            float f15 = f14 + fWidth;
            float f16 = i12 == 0 ? this.f178067l : 0.0f;
            if (i12 == arrayList.size() - 1) {
                f13 = this.f178067l;
                f12 = fWidth;
            } else {
                f12 = fWidth;
                f13 = 0.0f;
            }
            float[] fArr = this.f178063h;
            fArr[0] = f16;
            fArr[1] = f16;
            fArr[2] = f13;
            fArr[3] = f13;
            fArr[4] = f13;
            fArr[5] = f13;
            fArr[6] = f16;
            fArr[7] = f16;
            rectF.left = f14;
            rectF.right = f15;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            bVar.getClass();
            if (i12 < arrayList.size() - 1) {
                rectF.left = f15;
                rectF.right = this.f178065j + f15;
                path2.addRect(rectF, direction);
            }
            f14 = this.f178065j + f15;
            i12 = i13;
            fWidth = f12;
        }
    }

    public final int getEmptyStepColor() {
        return this.emptyStepColor;
    }

    public final int getSeparatorColor() {
        return this.separatorColor;
    }

    public final int getStepColor() {
        return this.stepColor;
    }

    public final int getStepPosition() {
        return this.stepPosition;
    }

    public final int getStepsCount() {
        return this.stepsCount;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        Path path = this.f178060e;
        Paint paint = this.f178057b;
        paint.setColor(this.emptyStepColor);
        G0 g02 = G0.f406611a;
        canvas.drawPath(path, paint);
        Path path2 = this.f178061f;
        paint.setColor(this.stepColor);
        canvas.drawPath(path2, paint);
        Path path3 = this.f178062g;
        paint.setColor(this.separatorColor);
        canvas.drawPath(path3, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int iMin = Math.min(getMeasuredHeight(), this.f178066k);
        int paddingBottom = (i15 - i13) - getPaddingBottom();
        int paddingTop = (((paddingBottom - getPaddingTop()) - iMin) / 2) + getPaddingTop();
        float paddingEnd = (i14 - i12) - getPaddingEnd();
        float f12 = paddingBottom;
        RectF rectF = this.f178058c;
        rectF.set(getPaddingStart(), paddingTop, paddingEnd, f12);
        this.f178067l = rectF.height() / 2;
        c();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i13);
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? 0 : View.MeasureSpec.getSize(i13) : getPaddingBottom() + getPaddingTop() + this.f178066k : Math.min(getPaddingBottom() + getPaddingTop() + this.f178066k, View.MeasureSpec.getSize(i13)));
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, C40487a.l.f396190e);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        b();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setEmptyStepColor(int i12) {
        if (this.emptyStepColor != i12) {
            this.emptyStepColor = i12;
            postInvalidateOnAnimation();
        }
    }

    public final void setSeparatorColor(int i12) {
        if (this.separatorColor != i12) {
            this.separatorColor = i12;
            postInvalidateOnAnimation();
        }
    }

    public final void setStepColor(int i12) {
        if (this.stepColor != i12) {
            this.stepColor = i12;
            postInvalidateOnAnimation();
        }
    }

    public final void setStepsCount(int i12) {
        if (this.stepsCount != i12) {
            if (i12 < 0) {
                i12 = 0;
            }
            this.stepsCount = i12;
            b();
        }
    }
}
