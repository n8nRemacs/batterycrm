package com.avito.android.select;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SegmentedControlRedesign.kt */
@P
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016J'\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/avito/android/select/SegmentedControlRedesign;", "Landroidx/cardview/widget/CardView;", "Lkotlin/Function2;", "", "", "Lkotlin/G0;", "clickListener", "setOnClickListener", "(LY41/p;)V", "", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl$c;", "<set-?>", "b", "Ljava/util/List;", "getData", "()Ljava/util/List;", "data", "c", "I", "getSelectedIndex", "()I", "selectedIndex", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SegmentedControlRedesign extends CardView {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f264969h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Object f264970b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int selectedIndex;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f264972d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f264973e;

    /* renamed from: f, reason: collision with root package name */
    public final int f264974f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super Integer, ? super CharSequence, G0> f264975g;

    /* compiled from: SegmentedControlRedesign.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/SegmentedControlRedesign$a;", "Landroid/view/View;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends View {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.lib.design.button.c f264976b;

        public a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
            super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
            com.avito.android.lib.design.button.c cVar = new com.avito.android.lib.design.button.c();
            this.f264976b = cVar;
            cVar.h(D6.i(12, context), new VU.d(0, D6.i(1, context), 218103808, D6.i(3, context)), new VU.d(0, D6.i(4, context), 520093696, D6.i(24, context)), true);
        }

        @Override // android.view.View
        public final void draw(@Y61.k Canvas canvas) {
            this.f264976b.a(canvas, this);
            super.draw(canvas);
        }

        @Override // android.view.View
        public final void onMeasure(int i12, int i13) {
            super.onMeasure(i12, i13);
            this.f264976b.d(this);
        }
    }

    @X41.j
    public SegmentedControlRedesign(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void c(int i12, boolean z12) {
        if (this.f264970b.isEmpty()) {
            return;
        }
        LinearLayout linearLayout = this.f264972d;
        if (i12 >= linearLayout.getChildCount()) {
            return;
        }
        View childAt = linearLayout.getChildAt(i12);
        int width = childAt.getWidth();
        int left = childAt.getLeft();
        a aVar = this.f264973e;
        aVar.getLayoutParams().width = width;
        if (!z12) {
            aVar.setTranslationX(left);
            aVar.requestLayout();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(aVar.getTranslationX(), left);
        valueAnimatorOfFloat.addUpdateListener(new AV.a(this, 15));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfFloat);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new androidx.interpolator.view.animation.b());
        animatorSet.start();
    }

    public final void d(int i12, @Y61.k List list) {
        LinearLayout linearLayout = this.f264972d;
        linearLayout.removeAllViews();
        this.f264970b = list;
        this.selectedIndex = Math.min(i12, list.size() - 1);
        int i13 = 0;
        for (Object obj : (Iterable) this.f264970b) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            SegmentedControl.c cVar = (SegmentedControl.c) obj;
            TextView textView = new TextView(getContext());
            textView.setText(cVar.f180221a);
            textView.setTextAppearance(C35835l0.j(R.attr.textM20, textView.getContext()));
            textView.setGravity(17);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, this.f264974f, 1.0f));
            if (!cVar.f180222b) {
                textView.setTextColor(C35835l0.d(R.attr.gray36, textView.getContext()));
            }
            textView.setOnClickListener(new com.avito.android.fakedoor_dialog.a(i13, 6, this));
            linearLayout.addView(textView);
            i13 = i14;
        }
        post(new androidx.camera.video.internal.audio.q(i12, 15, this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final void e(int i12, boolean z12) {
        if (i12 == this.selectedIndex || i12 >= this.f264970b.size() || !((SegmentedControl.c) this.f264970b.get(i12)).f180222b) {
            return;
        }
        c(i12, z12);
        this.selectedIndex = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.avito.android.lib.design.segmented_control.SegmentedControl$c>] */
    @Y61.k
    public final List<SegmentedControl.c> getData() {
        return this.f264970b;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final void setOnClickListener(@Y61.k Y41.p<? super Integer, ? super CharSequence, G0> clickListener) {
        this.f264975g = clickListener;
    }

    public SegmentedControlRedesign(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f264970b = C42784z0.f406748b;
        int iD2 = C35835l0.d(R.attr.warmGray4, context);
        int iD3 = C35835l0.d(com.avito.android.lib.util.darkTheme.c.a(context) ? R.attr.warmGray20 : R.attr.white, context);
        float fI2 = D6.i(12, context);
        float fI3 = D6.i(8, context);
        int i14 = D6.i(4, context);
        int i15 = D6.i(36, context);
        this.f264974f = i15;
        setClipToPadding(false);
        setClipChildren(false);
        setCardBackgroundColor(iD2);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setElevation(0.0f);
        setRadius(fI2);
        a aVar = new a(context, null, 0, 6, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iD3);
        gradientDrawable.setCornerRadius(fI3);
        aVar.setBackground(gradientDrawable);
        this.f264973e = aVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, i15);
        layoutParams.setMargins(i14, i14, i14, i14);
        G0 g02 = G0.f406611a;
        addView(aVar, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.f264972d = linearLayout;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i14, i14, i14, i14);
        addView(linearLayout, layoutParams2);
    }
}
