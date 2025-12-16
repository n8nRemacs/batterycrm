package com.avito.android.mortgage.widgets;

import LV.c;
import VU.b;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.core.view.o0;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.a;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42156l;
import j.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalStepsBar.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001:\u0003%&'J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0006R*\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0006R*\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0006R*\u0010 \u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0006R*\u0010$\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0006¨\u0006("}, d2 = {"Lcom/avito/android/mortgage/widgets/VerticalStepsBar;", "Landroid/view/ViewGroup;", "", "stepPosition", "Lkotlin/G0;", "setCurrentStep", "(I)V", "", "getCurrentStepTitle", "()Ljava/lang/String;", "<set-?>", "s", "I", "getCurrentStep", "()I", "currentStep", "value", "t", "getStepsMargin", "setStepsMargin", "stepsMargin", "u", "getEmptyProgressColor", "setEmptyProgressColor", "emptyProgressColor", "v", "getCompletedProgressColor", "setCompletedProgressColor", "completedProgressColor", "w", "getEmptyDotColor", "setEmptyDotColor", "emptyDotColor", "x", "getCompletedDotColor", "setCompletedDotColor", "completedDotColor", "a", "b", "c", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerticalStepsBar extends ViewGroup {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f203971y = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f203972b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RectF f203973c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f203974d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Path f203975e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Path f203976f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Path f203977g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Path f203978h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final float[] f203979i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinearLayout f203980j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ArrayList f203981k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ArrayList f203982l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ArrayList f203983m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final ArrayList f203984n;

    /* renamed from: o, reason: collision with root package name */
    public final int f203985o;

    /* renamed from: p, reason: collision with root package name */
    public final int f203986p;

    /* renamed from: q, reason: collision with root package name */
    public final float f203987q;

    /* renamed from: r, reason: collision with root package name */
    public float f203988r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int currentStep;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @r
    public int stepsMargin;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int emptyProgressColor;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int completedProgressColor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int emptyDotColor;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int completedDotColor;

    /* compiled from: VerticalStepsBar.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/widgets/VerticalStepsBar$a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f203995a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f203996b;

        public a(@k String str, @k DeepLink deepLink) {
            this.f203995a = str;
            this.f203996b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f203995a, aVar.f203995a) && L.f(this.f203996b, aVar.f203996b);
        }

        public final int hashCode() {
            return this.f203996b.hashCode() + (this.f203995a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f203995a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f203996b, ')');
        }
    }

    /* compiled from: VerticalStepsBar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/widgets/VerticalStepsBar$b;", "", "<init>", "()V", "", "DEFAULT_CURRENT_STEP_POSITION", "I", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    @j
    public VerticalStepsBar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static float a(TextView textView) {
        return (textView.getLineHeight() / 2.0f) + textView.getTop();
    }

    public final void b(@l Y41.l lVar, @k ArrayList arrayList) {
        a aVar;
        String str;
        ViewGroup viewGroup;
        VerticalStepsBar verticalStepsBar = this;
        int size = arrayList.size();
        ArrayList arrayList2 = verticalStepsBar.f203981k;
        int size2 = arrayList2.size();
        ArrayList arrayList3 = verticalStepsBar.f203982l;
        ArrayList arrayList4 = verticalStepsBar.f203983m;
        ArrayList arrayList5 = verticalStepsBar.f203984n;
        boolean z12 = false;
        if (size != size2) {
            while (true) {
                int size3 = arrayList.size();
                int size4 = arrayList2.size();
                viewGroup = verticalStepsBar.f203980j;
                if (size3 >= size4) {
                    break;
                }
                viewGroup.removeView((View) arrayList2.remove(C42745f0.J(arrayList2)));
                viewGroup.removeView((View) arrayList3.remove(C42745f0.J(arrayList3)));
                viewGroup.removeView((View) arrayList4.remove(C42745f0.J(arrayList4)));
                viewGroup.removeView((View) arrayList5.remove(C42745f0.J(arrayList5)));
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            while (arrayList.size() > arrayList2.size()) {
                ViewGroup viewGroup2 = (ViewGroup) layoutInflaterFrom.inflate(R.layout.mortgage_vertical_steps_bar_step, viewGroup, z12);
                View viewFindViewById = viewGroup2.findViewById(R.id.title);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById;
                View viewFindViewById2 = viewGroup2.findViewById(R.id.description);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView2 = (TextView) viewFindViewById2;
                View viewFindViewById3 = viewGroup2.findViewById(R.id.subtitle);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView3 = (TextView) viewFindViewById3;
                FrameLayout frameLayout = new FrameLayout(getContext());
                Button button = new Button(getContext(), null, 0, 0, 14, null);
                b.a aVar2 = VU.b.f17147t;
                Context context = getContext();
                aVar2.getClass();
                button.setStyle((VU.b) c.a.a(aVar2, context, R.attr.buttonPrimaryMedium));
                frameLayout.addView(button, -2, -2);
                arrayList2.add(textView);
                arrayList3.add(textView2);
                arrayList4.add(textView3);
                arrayList5.add(frameLayout);
                viewGroup2.removeView(textView);
                viewGroup2.removeView(textView2);
                viewGroup2.removeView(textView3);
                viewGroup.addView(textView, -1, -2);
                viewGroup.addView(textView2, -1, -2);
                viewGroup.addView(textView3, -1, -2);
                viewGroup.addView(frameLayout, -1, -2);
                D6.c(textView, null, Integer.valueOf(getContext().getResources().getDimensionPixelOffset(R.dimen.mortgage_vertical_steps_bar_text_margin)), null, null, 13);
                D6.c(textView2, null, Integer.valueOf(getContext().getResources().getDimensionPixelOffset(R.dimen.mortgage_vertical_steps_bar_text_margin)), null, null, 13);
                D6.c(textView3, null, Integer.valueOf(getContext().getResources().getDimensionPixelOffset(R.dimen.mortgage_vertical_steps_bar_text_margin)), null, null, 13);
                D6.c(frameLayout, null, Integer.valueOf(getContext().getResources().getDimensionPixelOffset(R.dimen.mortgage_vertical_steps_bar_action_margin)), null, null, 13);
                z12 = false;
            }
        }
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            c cVar = (c) obj;
            ((TextView) arrayList2.get(i12)).setText(cVar.f203997a);
            TextView textView4 = (TextView) arrayList3.get(i12);
            textView4.setText(cVar.f203998b);
            int i14 = i12 == arrayList.size() + (-1) ? 0 : verticalStepsBar.stepsMargin;
            String str2 = cVar.f203999c;
            a aVar3 = cVar.f204000d;
            if (str2 == null && aVar3 == null) {
                D6.c(textView4, null, null, null, Integer.valueOf(i14), 7);
                aVar = aVar3;
                str = str2;
            } else {
                aVar = aVar3;
                str = str2;
                D6.c(textView4, null, null, null, 0, 7);
            }
            TextView textView5 = (TextView) arrayList4.get(i12);
            I5.a(textView5, str, false);
            a aVar4 = aVar;
            if (aVar4 == null) {
                D6.c(textView5, null, null, null, Integer.valueOf(i14), 7);
            } else {
                D6.c(textView5, null, null, null, 0, 7);
            }
            FrameLayout frameLayout2 = (FrameLayout) arrayList5.get(i12);
            if (aVar4 == null) {
                D6.w(frameLayout2);
                D6.c(frameLayout2, null, null, null, 0, 7);
            } else {
                D6.H(frameLayout2);
                D6.c(frameLayout2, null, null, null, Integer.valueOf(i14), 7);
                Button button2 = (Button) o0.a(frameLayout2, 0);
                button2.setText(aVar4.f203995a);
                button2.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(29, lVar, (Object) cVar));
            }
            verticalStepsBar = this;
            i12 = i13;
        }
        requestLayout();
    }

    public final void c() {
        ArrayList arrayList = this.f203981k;
        if (arrayList.isEmpty()) {
            return;
        }
        int i12 = this.currentStep;
        int iJ2 = C42745f0.J(arrayList);
        if (i12 > iJ2) {
            i12 = iJ2;
        }
        Path path = this.f203975e;
        path.reset();
        Path path2 = this.f203976f;
        path2.reset();
        Path path3 = this.f203977g;
        path3.reset();
        Path path4 = this.f203978h;
        path4.reset();
        float f12 = this.f203988r;
        float[] fArr = this.f203979i;
        int i13 = 0;
        fArr[0] = f12;
        fArr[1] = f12;
        fArr[2] = f12;
        fArr[3] = f12;
        fArr[4] = f12;
        fArr[5] = f12;
        fArr[6] = f12;
        fArr[7] = f12;
        RectF rectF = this.f203974d;
        rectF.setEmpty();
        RectF rectF2 = this.f203973c;
        rectF.set(rectF2);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        LinearLayout linearLayout = this.f203980j;
        rectF.bottom = a((TextView) arrayList.get(i12)) + linearLayout.getTop() + this.f203988r;
        path2.addRoundRect(rectF, fArr, direction);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            TextView textView = (TextView) next;
            if (i13 <= i12) {
                path4.addCircle(rectF2.centerX(), a(textView) + linearLayout.getTop(), this.f203987q, Path.Direction.CW);
            } else {
                path3.addCircle(rectF2.centerX(), a(textView) + linearLayout.getTop(), this.f203987q, Path.Direction.CW);
            }
            i13 = i14;
        }
    }

    public final int getCompletedDotColor() {
        return this.completedDotColor;
    }

    public final int getCompletedProgressColor() {
        return this.completedProgressColor;
    }

    public final int getCurrentStep() {
        return this.currentStep;
    }

    @k
    public final String getCurrentStepTitle() {
        return ((TextView) this.f203981k.get(this.currentStep)).getText().toString();
    }

    public final int getEmptyDotColor() {
        return this.emptyDotColor;
    }

    public final int getEmptyProgressColor() {
        return this.emptyProgressColor;
    }

    public final int getStepsMargin() {
        return this.stepsMargin;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        Path path = this.f203975e;
        Paint paint = this.f203972b;
        paint.setColor(this.emptyProgressColor);
        G0 g02 = G0.f406611a;
        canvas.drawPath(path, paint);
        Path path2 = this.f203976f;
        paint.setColor(this.completedProgressColor);
        paint.setShadowLayer(0.0f, 2.0f, 2.0f, this.completedProgressColor);
        canvas.drawPath(path2, paint);
        Path path3 = this.f203977g;
        paint.setColor(this.emptyDotColor);
        canvas.drawPath(path3, paint);
        Path path4 = this.f203978h;
        paint.setColor(this.completedDotColor);
        canvas.drawPath(path4, paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int measuredHeight = getMeasuredHeight();
        LinearLayout linearLayout = this.f203980j;
        int iMin = Math.min(measuredHeight, linearLayout.getMeasuredHeight());
        int paddingStart = getPaddingStart() + this.f203985o + this.f203986p;
        int paddingEnd = (i14 - i12) - getPaddingEnd();
        int paddingTop = getPaddingTop();
        linearLayout.layout(paddingStart, paddingTop, paddingEnd, iMin + paddingTop);
        RectF rectF = this.f203973c;
        rectF.set(getPaddingStart(), 0.0f, getPaddingStart() + this.f203985o, 0.0f);
        this.f203988r = rectF.width() / 2;
        ArrayList arrayList = this.f203981k;
        TextView textView = (TextView) C42745f0.G(arrayList);
        float top = (linearLayout.getTop() + (textView != null ? a(textView) : i13)) - this.f203988r;
        TextView textView2 = (TextView) C42745f0.S(arrayList);
        float top2 = linearLayout.getTop() + (textView2 != null ? a(textView2) : top) + this.f203988r;
        rectF.top = top;
        rectF.bottom = top2;
        c();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int paddingStart = (((size - getPaddingStart()) - this.f203985o) - this.f203986p) - getPaddingEnd();
        LinearLayout linearLayout = this.f203980j;
        int iMin = 0;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingStart, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2, 0));
        int paddingEnd = getPaddingEnd() + getPaddingStart() + linearLayout.getMeasuredWidth() + this.f203985o + this.f203986p;
        int mode = View.MeasureSpec.getMode(i12);
        if (mode == Integer.MIN_VALUE) {
            paddingEnd = Math.min(paddingEnd, View.MeasureSpec.getSize(i12));
        } else if (mode != 0) {
            paddingEnd = mode != 1073741824 ? 0 : View.MeasureSpec.getSize(i12);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight();
        int mode2 = View.MeasureSpec.getMode(i13);
        if (mode2 == Integer.MIN_VALUE) {
            iMin = Math.min(paddingBottom, View.MeasureSpec.getSize(i13));
        } else if (mode2 == 0) {
            iMin = paddingBottom;
        } else if (mode2 == 1073741824) {
            iMin = View.MeasureSpec.getSize(i13);
        }
        setMeasuredDimension(paddingEnd, iMin);
    }

    public final void setCompletedDotColor(int i12) {
        if (this.completedDotColor != i12) {
            this.completedDotColor = i12;
            postInvalidate();
        }
    }

    public final void setCompletedProgressColor(int i12) {
        if (this.completedProgressColor != i12) {
            this.completedProgressColor = i12;
            postInvalidate();
        }
    }

    public final void setCurrentStep(int stepPosition) {
        if (stepPosition < 0) {
            stepPosition = 0;
        }
        this.currentStep = stepPosition;
        c();
        invalidate();
    }

    public final void setEmptyDotColor(int i12) {
        if (this.emptyDotColor != i12) {
            this.emptyDotColor = i12;
            postInvalidate();
        }
    }

    public final void setEmptyProgressColor(int i12) {
        if (this.emptyProgressColor != i12) {
            this.emptyProgressColor = i12;
            postInvalidate();
        }
    }

    public final void setStepsMargin(int i12) {
        if (this.stepsMargin != i12) {
            this.stepsMargin = i12;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VerticalStepsBar(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.verticalStepsBar : i12;
        i13 = (i14 & 8) != 0 ? R.style.Widget_VerticalStepsBar : i13;
        super(context, attributeSet, i12, i13);
        this.f203972b = new Paint(1);
        this.f203973c = new RectF();
        this.f203974d = new RectF();
        this.f203975e = new Path();
        this.f203976f = new Path();
        this.f203977g = new Path();
        this.f203978h = new Path();
        this.f203979i = new float[8];
        this.f203981k = new ArrayList();
        this.f203982l = new ArrayList();
        this.f203983m = new ArrayList();
        this.f203984n = new ArrayList();
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        this.f203980j = linearLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i.f198161b, i12, i13);
        this.f203985o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, this.f203985o);
        this.f203986p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, this.f203986p);
        float f12 = 2;
        this.f203987q = typedArrayObtainStyledAttributes.getDimension(5, this.f203987q * f12) / f12;
        setStepsMargin(typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, this.stepsMargin));
        setEmptyProgressColor(typedArrayObtainStyledAttributes.getColor(7, this.emptyProgressColor));
        setCompletedProgressColor(typedArrayObtainStyledAttributes.getColor(3, this.completedProgressColor));
        setEmptyDotColor(typedArrayObtainStyledAttributes.getColor(6, this.emptyDotColor));
        setCompletedDotColor(typedArrayObtainStyledAttributes.getColor(2, this.completedDotColor));
        int integer = typedArrayObtainStyledAttributes.getInteger(4, -1);
        if (integer > -1) {
            setCurrentStep(integer);
        }
        if (isInEditMode()) {
            invalidate();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* compiled from: VerticalStepsBar.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/widgets/VerticalStepsBar$c;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f203997a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f203998b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f203999c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final a f204000d;

        public c(@k String str, @k String str2, @l String str3, @l a aVar) {
            this.f203997a = str;
            this.f203998b = str2;
            this.f203999c = str3;
            this.f204000d = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f203997a, cVar.f203997a) && L.f(this.f203998b, cVar.f203998b) && L.f(this.f203999c, cVar.f203999c) && L.f(this.f204000d, cVar.f204000d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f203997a.hashCode() * 31, 31, this.f203998b);
            String str = this.f203999c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.f204000d;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Step(title=" + this.f203997a + ", description=" + this.f203998b + ", subtitle=" + this.f203999c + ", action=" + this.f204000d + ')';
        }

        public /* synthetic */ c(String str, String str2, String str3, a aVar, int i12, C42822w c42822w) {
            this(str, str2, str3, (i12 & 8) != 0 ? null : aVar);
        }
    }
}
