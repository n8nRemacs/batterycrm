package com.avito.android.lib.deprecated_design;

import X41.j;
import Y61.k;
import Y61.l;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.util.D1;
import fw.C40487a;
import hw.InterfaceC41179d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ProgressView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/ProgressView;", "Landroid/view/View;", "a", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class ProgressView extends View {

    /* renamed from: b, reason: collision with root package name */
    public final int f177767b;

    /* renamed from: c, reason: collision with root package name */
    public final int f177768c;

    /* renamed from: d, reason: collision with root package name */
    public final long f177769d;

    /* renamed from: e, reason: collision with root package name */
    public float f177770e;

    /* renamed from: f, reason: collision with root package name */
    public float f177771f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f177772g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ValueAnimator f177773h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ArrayList f177774i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Paint f177775j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f177776k;

    /* compiled from: ProgressView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/ProgressView$a;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f177777a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Paint f177778b;

        /* renamed from: c, reason: collision with root package name */
        public final float f177779c;

        public a(float f12, Paint paint, float f13, int i12, C42822w c42822w) {
            f13 = (i12 & 4) != 0 ? 1.0f : f13;
            this.f177777a = f12;
            this.f177778b = paint;
            this.f177779c = f13;
        }
    }

    @j
    public ProgressView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final void draw(@k Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        ValueAnimator valueAnimator = this.f177773h;
        if (valueAnimator != null) {
            canvas.rotate(((Float) valueAnimator.getAnimatedValue()).floatValue(), canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        }
        ArrayList<a> arrayList = this.f177772g;
        if (arrayList == null) {
            arrayList = null;
        }
        int i12 = 0;
        for (a aVar : arrayList) {
            int i13 = i12 + 1;
            int width = canvas.getWidth() / 2;
            int width2 = canvas.getWidth() / 2;
            ArrayList arrayList2 = this.f177772g;
            if (arrayList2 == null) {
                arrayList2 = null;
            }
            double size = ((i12 / arrayList2.size()) * 6.283185307179586d) - ((3.0f * 6.283185307179586d) / 8.0f);
            float fCos = (float) ((Math.cos(size) * this.f177770e) + width);
            float fB2 = (float) r.b(size, this.f177770e, width2);
            float f12 = aVar.f177777a * aVar.f177779c * this.f177771f;
            Paint paint = this.f177775j;
            if (paint == null) {
                paint = aVar.f177778b;
            }
            canvas.drawCircle(fCos, fB2, f12, paint);
            i12 = i13;
        }
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        int iMin = (int) (((this.f177767b * 2) + this.f177768c) * this.f177771f);
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(iMin, size);
        } else if (mode != 1073741824) {
            size = iMin;
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            iMin = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, size2);
        }
        setMeasuredDimension(size, iMin);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        int i16 = this.f177767b;
        int i17 = this.f177768c;
        this.f177771f = i12 / (i16 + i17);
        this.f177770e = ((i17 * ((float) Math.sqrt(2.0d))) / 2.0f) * this.f177771f;
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ProgressView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws Resources.NotFoundException {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f177771f = 1.0f;
        this.f177774i = new ArrayList();
        this.f177776k = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40487a.l.f396191f);
        this.f177776k = typedArrayObtainStyledAttributes.getBoolean(1, this.f177776k);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            Paint paint = new Paint();
            this.f177775j = paint;
            paint.setColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        }
        this.f177767b = context.getResources().getInteger(R.integer.loader_padding);
        this.f177768c = context.getResources().getInteger(R.integer.loader_circles_distance);
        this.f177769d = context.getResources().getInteger(R.integer.loader_animation_duration);
        int[] intArray = context.getResources().getIntArray(R.array.loader_circle_colors);
        Integer[] numArr = new Integer[intArray.length];
        int length = intArray.length;
        for (int i14 = 0; i14 < length; i14++) {
            numArr[i14] = Integer.valueOf(intArray[i14]);
        }
        int[] intArray2 = context.getResources().getIntArray(R.array.loader_circle_sizes);
        Integer[] numArr2 = new Integer[intArray2.length];
        int length2 = intArray2.length;
        for (int i15 = 0; i15 < length2; i15++) {
            numArr2[i15] = Integer.valueOf(intArray2[i15]);
        }
        ArrayList arrayListN0 = C42756l.n0(numArr2, numArr);
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListN0, 10));
        Iterator it = arrayListN0.iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            Paint paint2 = new Paint();
            paint2.setColor(((Number) q12.f406620c).intValue());
            arrayList.add(new a(((Number) q12.f406619b).intValue(), paint2, 0.0f, 4, null));
        }
        this.f177772g = arrayList;
        Iterator it2 = C42745f0.T0(e.f177953a, arrayList).iterator();
        while (it2.hasNext()) {
            Q q13 = (Q) it2.next();
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(q13.f406620c, q13.f406619b);
            objectAnimatorOfPropertyValuesHolder.setDuration(this.f177769d);
            D1.a(objectAnimatorOfPropertyValuesHolder, -1);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(null);
            objectAnimatorOfPropertyValuesHolder.start();
            this.f177774i.add(objectAnimatorOfPropertyValuesHolder);
        }
        if (this.f177776k) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
            this.f177773h = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(this.f177769d);
                D1.a(valueAnimatorOfFloat, -1);
                valueAnimatorOfFloat.setInterpolator(null);
                valueAnimatorOfFloat.start();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
