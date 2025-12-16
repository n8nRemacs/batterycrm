package e11;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import i11.C41211a;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class b2 extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final TextView f394540b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39892o f394541c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final TextView f394542d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final LinearLayout f394543e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C41211a f394544f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final TextView f394545g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final TextView f394546h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final Button f394547i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final C39922y0 f394548j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final C39924z f394549k;

    /* renamed from: l, reason: collision with root package name */
    public final int f394550l;

    /* renamed from: m, reason: collision with root package name */
    public final int f394551m;

    /* renamed from: n, reason: collision with root package name */
    public final int f394552n;

    public b2(@j.N Context context, @j.N C39924z c39924z) {
        super(context);
        this.f394549k = c39924z;
        Button button = new Button(context);
        this.f394547i = button;
        C39924z.m(button, "cta_button");
        C39922y0 c39922y0 = new C39922y0(context);
        this.f394548j = c39922y0;
        C39924z.m(c39922y0, "icon_image");
        this.f394541c = new C39892o(context);
        TextView textView = new TextView(context);
        this.f394540b = textView;
        C39924z.m(textView, "description_text");
        TextView textView2 = new TextView(context);
        this.f394542d = textView2;
        C39924z.m(textView2, "disclaimer_text");
        this.f394543e = new LinearLayout(context);
        C41211a c41211a = new C41211a(context);
        this.f394544f = c41211a;
        C39924z.m(c41211a, "stars_view");
        TextView textView3 = new TextView(context);
        this.f394545g = textView3;
        C39924z.m(textView3, "votes_text");
        TextView textView4 = new TextView(context);
        this.f394546h = textView4;
        C39924z.m(textView4, "domain_text");
        this.f394550l = c39924z.a(16);
        this.f394552n = c39924z.a(8);
        this.f394551m = c39924z.a(64);
    }

    public final void a(int i12, @j.N View... viewArr) {
        C39922y0 c39922y0 = this.f394548j;
        int height = c39922y0.getHeight();
        int height2 = getHeight();
        Button button = this.f394547i;
        int width = button.getWidth();
        int height3 = button.getHeight();
        int width2 = c39922y0.getWidth();
        c39922y0.setPivotX(0.0f);
        c39922y0.setPivotY(height / 2.0f);
        button.setPivotX(width);
        button.setPivotY(height3 / 2.0f);
        float f12 = height2 * 0.3f;
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property, 0.7f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property2, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(c39922y0, (Property<C39922y0, Float>) property, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(c39922y0, (Property<C39922y0, Float>) property2, 0.7f));
        TextView textView = this.f394540b;
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
        TextView textView2 = this.f394542d;
        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
        LinearLayout linearLayout = this.f394543e;
        if (linearLayout.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property3, 1.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<b2, Float>) property3, 0.6f));
        float f13 = -(width2 * 0.3f);
        Property property4 = View.TRANSLATION_X;
        arrayList.add(ObjectAnimator.ofFloat(this.f394541c, (Property<C39892o, Float>) property4, f13));
        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property4, f13));
        TextView textView3 = this.f394546h;
        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, f13));
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, f13));
        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, f13));
        Property property5 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<b2, Float>) property5, f12));
        float f14 = (-f12) / 2.0f;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property5, f14));
        arrayList.add(ObjectAnimator.ofFloat(c39922y0, (Property<C39922y0, Float>) property5, f14));
        for (View view : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f12));
        }
        if (linearLayout.isEnabled()) {
            linearLayout.setVisibility(0);
        }
        if (textView3.isEnabled()) {
            textView3.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new a());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(i12);
        animatorSet.start();
    }

    public final void b(View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Button button = this.f394547i;
        Property property = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property, 1.0f));
        Property property2 = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property2, 1.0f));
        C39922y0 c39922y0 = this.f394548j;
        arrayList.add(ObjectAnimator.ofFloat(c39922y0, (Property<C39922y0, Float>) property, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(c39922y0, (Property<C39922y0, Float>) property2, 1.0f));
        TextView textView = this.f394540b;
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 1.0f));
        TextView textView2 = this.f394542d;
        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
        LinearLayout linearLayout = this.f394543e;
        if (linearLayout.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property3, 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<b2, Float>) property3, 1.0f));
        Property property4 = View.TRANSLATION_X;
        arrayList.add(ObjectAnimator.ofFloat(this.f394541c, (Property<C39892o, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f394546h, (Property<TextView, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, 0.0f));
        Property property5 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<b2, Float>) property5, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property5, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(c39922y0, (Property<C39922y0, Float>) property5, 0.0f));
        for (View view : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        if (!TextUtils.isEmpty(textView2.getText().toString())) {
            textView2.setVisibility(0);
        }
        textView.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new c2(this));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        C39922y0 c39922y0 = this.f394548j;
        int measuredHeight2 = c39922y0.getMeasuredHeight();
        int measuredWidth2 = c39922y0.getMeasuredWidth();
        int i16 = (measuredHeight - measuredHeight2) / 2;
        int i17 = this.f394550l;
        c39922y0.layout(i17, i16, i17 + measuredWidth2, measuredHeight2 + i16);
        Button button = this.f394547i;
        int measuredWidth3 = button.getMeasuredWidth();
        int measuredHeight3 = button.getMeasuredHeight();
        int i18 = (measuredHeight - measuredHeight3) / 2;
        button.layout((measuredWidth - measuredWidth3) - i17, i18, measuredWidth - i17, measuredHeight3 + i18);
        int i19 = measuredWidth2 + i17 + i17;
        C39892o c39892o = this.f394541c;
        int measuredWidth4 = c39892o.getMeasuredWidth() + i19;
        int measuredHeight4 = c39892o.getMeasuredHeight();
        int i22 = this.f394552n;
        c39892o.layout(i19, i22, measuredWidth4, measuredHeight4 + i22);
        LinearLayout linearLayout = this.f394543e;
        linearLayout.layout(i19, c39892o.getBottom(), linearLayout.getMeasuredWidth() + i19, linearLayout.getMeasuredHeight() + c39892o.getBottom());
        TextView textView = this.f394546h;
        textView.layout(i19, c39892o.getBottom(), textView.getMeasuredWidth() + i19, textView.getMeasuredHeight() + c39892o.getBottom());
        TextView textView2 = this.f394540b;
        textView2.layout(i19, c39892o.getBottom(), textView2.getMeasuredWidth() + i19, textView2.getMeasuredHeight() + c39892o.getBottom());
        TextView textView3 = this.f394542d;
        textView3.layout(i19, textView2.getBottom(), textView3.getMeasuredWidth() + i19, textView3.getMeasuredHeight() + textView2.getBottom());
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13) / 4;
        int i14 = this.f394550l;
        int i15 = size - (i14 * 2);
        int i16 = this.f394552n;
        int i17 = size2 - (i16 * 2);
        int iMin = Math.min(i17, this.f394551m);
        C39922y0 c39922y0 = this.f394548j;
        c39922y0.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        Button button = this.f394547i;
        button.measure(View.MeasureSpec.makeMeasureSpec(i15, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(iMin - (i16 * 2), 1073741824));
        int measuredWidth = ((i15 - c39922y0.getMeasuredWidth()) - button.getMeasuredWidth()) - (i14 * 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION);
        C39892o c39892o = this.f394541c;
        c39892o.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        LinearLayout linearLayout = this.f394543e;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION));
        this.f394546h.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION));
        TextView textView = this.f394540b;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i17 - c39892o.getMeasuredHeight(), BeduinInputModel.MIN_TEXT_VERSION));
        TextView textView2 = this.f394542d;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION));
        int iMax = (i16 * 2) + Math.max(textView.getMeasuredHeight(), linearLayout.getMeasuredHeight()) + c39892o.getMeasuredHeight();
        if (textView2.getVisibility() == 0) {
            iMax += textView2.getMeasuredHeight();
        }
        setMeasuredDimension(size, (i16 * 2) + Math.max(button.getMeasuredHeight(), Math.max(c39922y0.getMeasuredHeight(), iMax)));
    }

    public void setBanner(@j.N C39884l0 c39884l0) {
        C39892o c39892o = this.f394541c;
        c39892o.getLeftText().setText(c39884l0.f394706e);
        this.f394540b.setText(c39884l0.f394704c);
        String str = c39884l0.f394707f;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f394542d;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        com.my.target.common.models.b bVar = c39884l0.f394717p;
        C39922y0 c39922y0 = this.f394548j;
        if (bVar != null) {
            c39922y0.setVisibility(0);
            c39922y0.setImageData(bVar);
        } else {
            c39922y0.setVisibility(8);
        }
        Button button = this.f394547i;
        button.setText(c39884l0.a());
        boolean zEquals = "".equals(c39884l0.f394708g);
        V rightBorderedView = c39892o.getRightBorderedView();
        if (zEquals) {
            rightBorderedView.setVisibility(8);
        } else {
            rightBorderedView.setText(c39884l0.f394708g);
        }
        C39924z.n(button, -16733198, -16746839, this.f394549k.a(2));
        button.setTextColor(-1);
        boolean zEquals2 = "store".equals(c39884l0.f394714m);
        LinearLayout linearLayout = this.f394543e;
        TextView textView2 = this.f394546h;
        if (zEquals2) {
            if (c39884l0.f394710i == 0 || c39884l0.f394709h <= 0.0f) {
                linearLayout.setEnabled(false);
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setEnabled(true);
                this.f394544f.setRating(c39884l0.f394709h);
                this.f394545g.setText(String.valueOf(c39884l0.f394710i));
            }
            textView2.setEnabled(false);
        } else {
            String str2 = c39884l0.f394713l;
            if (TextUtils.isEmpty(str2)) {
                textView2.setEnabled(false);
                textView2.setVisibility(8);
            } else {
                textView2.setEnabled(true);
                textView2.setText(str2);
            }
            linearLayout.setEnabled(false);
        }
        C39913v0<com.my.target.common.models.e> c39913v0 = c39884l0.f394673N;
        if (c39913v0 == null || !c39913v0.f394863Q) {
            linearLayout.setVisibility(8);
            textView2.setVisibility(8);
        }
    }

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            b2 b2Var = b2.this;
            b2Var.f394542d.setVisibility(8);
            b2Var.f394540b.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
