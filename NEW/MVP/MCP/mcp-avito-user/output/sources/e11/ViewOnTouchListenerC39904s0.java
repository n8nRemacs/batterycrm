package e11;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.my.target.E0;
import i11.C41211a;
import java.util.HashMap;

/* renamed from: e11.s0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ViewOnTouchListenerC39904s0 extends ViewGroup implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39922y0 f394779b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final TextView f394780c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final TextView f394781d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final Button f394782e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C39924z f394783f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final C41211a f394784g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final TextView f394785h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final HashMap<View, Boolean> f394786i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f394787j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public E0.a f394788k;

    /* renamed from: l, reason: collision with root package name */
    public final int f394789l;

    /* renamed from: m, reason: collision with root package name */
    public final int f394790m;

    /* renamed from: n, reason: collision with root package name */
    public final int f394791n;

    public ViewOnTouchListenerC39904s0(@j.N Context context, boolean z12) {
        super(context);
        this.f394786i = new HashMap<>();
        this.f394787j = z12;
        C39924z c39924z = new C39924z(context);
        this.f394783f = c39924z;
        C39922y0 c39922y0 = new C39922y0(context);
        this.f394779b = c39922y0;
        TextView textView = new TextView(context);
        this.f394780c = textView;
        TextView textView2 = new TextView(context);
        this.f394781d = textView2;
        Button button = new Button(context);
        this.f394782e = button;
        C41211a c41211a = new C41211a(context);
        this.f394784g = c41211a;
        TextView textView3 = new TextView(context);
        this.f394785h = textView3;
        C39924z.i(this, 0, 0, -3355444, c39924z.a(1), 0);
        float f12 = 2;
        this.f394790m = c39924z.a(f12);
        float f13 = 12;
        this.f394791n = c39924z.a(f13);
        float f14 = 15;
        float f15 = 10;
        button.setPadding(c39924z.a(f14), c39924z.a(f15), c39924z.a(f14), c39924z.a(f15));
        button.setMinimumWidth(c39924z.a(100));
        button.setTransformationMethod(null);
        button.setSingleLine();
        if (z12) {
            button.setTextSize(20.0f);
        } else {
            button.setTextSize(18.0f);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        button.setElevation(c39924z.a(f12));
        this.f394789l = c39924z.a(f13);
        C39924z.n(button, -16733198, -16746839, c39924z.a(f12));
        button.setTextColor(-1);
        if (z12) {
            textView.setTextSize(20.0f);
        } else {
            textView.setTextSize(18.0f);
        }
        textView.setTextColor(-16777216);
        textView.setTypeface(null, 1);
        textView.setLines(1);
        textView.setEllipsize(truncateAt);
        textView2.setTextColor(-7829368);
        textView2.setLines(2);
        if (z12) {
            textView2.setTextSize(20.0f);
        } else {
            textView2.setTextSize(18.0f);
        }
        textView2.setEllipsize(truncateAt);
        c41211a.setStarSize(c39924z.a(z12 ? 24 : 18));
        c41211a.setStarsPadding(c39924z.a(4));
        C39924z.m(this, "card_view");
        C39924z.m(textView, "card_title_text");
        C39924z.m(textView2, "card_description_text");
        C39924z.m(textView3, "card_domain_text");
        C39924z.m(button, "card_cta_button");
        C39924z.m(c41211a, "card_stars_view");
        C39924z.m(c39922y0, "card_image");
        addView(c39922y0);
        addView(textView2);
        addView(textView);
        addView(button);
        addView(c41211a);
        addView(textView3);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a(@j.P E0.a aVar, @j.P E1 e12) {
        this.f394788k = aVar;
        Button button = this.f394782e;
        if (aVar == null || e12 == null) {
            super.setOnClickListener(null);
            button.setOnClickListener(null);
            return;
        }
        setOnTouchListener(this);
        C39922y0 c39922y0 = this.f394779b;
        c39922y0.setOnTouchListener(this);
        TextView textView = this.f394780c;
        textView.setOnTouchListener(this);
        TextView textView2 = this.f394781d;
        textView2.setOnTouchListener(this);
        C41211a c41211a = this.f394784g;
        c41211a.setOnTouchListener(this);
        TextView textView3 = this.f394785h;
        textView3.setOnTouchListener(this);
        button.setOnTouchListener(this);
        HashMap<View, Boolean> map = this.f394786i;
        boolean z12 = e12.f394335d;
        boolean z13 = true;
        boolean z14 = e12.f394344m;
        map.put(c39922y0, Boolean.valueOf(z12 || z14));
        map.put(this, Boolean.valueOf(e12.f394343l || z14));
        map.put(textView, Boolean.valueOf(e12.f394332a || z14));
        map.put(textView2, Boolean.valueOf(e12.f394333b || z14));
        map.put(c41211a, Boolean.valueOf(e12.f394336e || z14));
        map.put(textView3, Boolean.valueOf(e12.f394341j || z14));
        if (!e12.f394338g && !z14) {
            z13 = false;
        }
        map.put(button, Boolean.valueOf(z13));
    }

    @j.N
    public Button getCtaButtonView() {
        return this.f394782e;
    }

    @j.N
    public TextView getDescriptionTextView() {
        return this.f394781d;
    }

    @j.N
    public TextView getDomainTextView() {
        return this.f394785h;
    }

    @j.N
    public C41211a getRatingView() {
        return this.f394784g;
    }

    @j.N
    public C39922y0 getSmartImageView() {
        return this.f394779b;
    }

    @j.N
    public TextView getTitleTextView() {
        return this.f394780c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16 = (i14 - i12) - (this.f394790m * 2);
        boolean z13 = !this.f394787j && getResources().getConfiguration().orientation == 2;
        C39922y0 c39922y0 = this.f394779b;
        c39922y0.layout(0, 0, c39922y0.getMeasuredWidth(), c39922y0.getMeasuredHeight());
        TextView textView = this.f394781d;
        TextView textView2 = this.f394785h;
        C41211a c41211a = this.f394784g;
        Button button = this.f394782e;
        TextView textView3 = this.f394780c;
        if (z13) {
            textView3.setTypeface(null, 1);
            textView3.layout(0, c39922y0.getBottom(), i16, textView3.getMeasuredHeight() + c39922y0.getBottom());
            C39924z.g(this, 0, 0);
            textView.layout(0, 0, 0, 0);
            button.layout(0, 0, 0, 0);
            c41211a.layout(0, 0, 0, 0);
            textView2.layout(0, 0, 0, 0);
            return;
        }
        textView3.setTypeface(null, 0);
        C39924z.i(this, 0, 0, -3355444, this.f394783f.a(1), 0);
        textView3.layout(this.f394790m + this.f394791n, c39922y0.getBottom(), textView3.getMeasuredWidth() + this.f394790m + this.f394791n, textView3.getMeasuredHeight() + c39922y0.getBottom());
        textView.layout(this.f394790m + this.f394791n, textView3.getBottom(), textView.getMeasuredWidth() + this.f394790m + this.f394791n, textView.getMeasuredHeight() + textView3.getBottom());
        int measuredWidth = (i16 - button.getMeasuredWidth()) / 2;
        button.layout(measuredWidth, (i15 - button.getMeasuredHeight()) - this.f394791n, button.getMeasuredWidth() + measuredWidth, i15 - this.f394791n);
        int measuredWidth2 = (i16 - c41211a.getMeasuredWidth()) / 2;
        c41211a.layout(measuredWidth2, (button.getTop() - this.f394791n) - c41211a.getMeasuredHeight(), c41211a.getMeasuredWidth() + measuredWidth2, button.getTop() - this.f394791n);
        int measuredWidth3 = (i16 - textView2.getMeasuredWidth()) / 2;
        textView2.layout(measuredWidth3, (button.getTop() - textView2.getMeasuredHeight()) - this.f394791n, textView2.getMeasuredWidth() + measuredWidth3, button.getTop() - this.f394791n);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int measuredHeight;
        int measuredHeight2;
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        boolean z12 = !this.f394787j && getResources().getConfiguration().orientation == 2;
        int i14 = size == 0 ? 0 : Integer.MIN_VALUE;
        int i15 = this.f394790m * 2;
        int i16 = size2 - i15;
        int i17 = size - i15;
        Button button = this.f394782e;
        TextView textView = this.f394785h;
        TextView textView2 = this.f394781d;
        TextView textView3 = this.f394780c;
        C41211a c41211a = this.f394784g;
        if (z12) {
            textView3.measure(View.MeasureSpec.makeMeasureSpec(size, i14), View.MeasureSpec.makeMeasureSpec(i16, BeduinInputModel.MIN_TEXT_VERSION));
            textView2.measure(0, 0);
            c41211a.measure(0, 0);
            textView.measure(0, 0);
            button.measure(0, 0);
        } else {
            textView3.measure(View.MeasureSpec.makeMeasureSpec(i17 - (this.f394791n * 2), i14), View.MeasureSpec.makeMeasureSpec(i16, BeduinInputModel.MIN_TEXT_VERSION));
            textView2.measure(View.MeasureSpec.makeMeasureSpec(i17 - (this.f394791n * 2), i14), View.MeasureSpec.makeMeasureSpec(i16, BeduinInputModel.MIN_TEXT_VERSION));
            c41211a.measure(View.MeasureSpec.makeMeasureSpec(i17, i14), View.MeasureSpec.makeMeasureSpec(i16, BeduinInputModel.MIN_TEXT_VERSION));
            textView.measure(View.MeasureSpec.makeMeasureSpec(i17, i14), View.MeasureSpec.makeMeasureSpec(i16, BeduinInputModel.MIN_TEXT_VERSION));
            button.measure(View.MeasureSpec.makeMeasureSpec(i17 - (this.f394791n * 2), i14), View.MeasureSpec.makeMeasureSpec(i16 - (this.f394791n * 2), BeduinInputModel.MIN_TEXT_VERSION));
        }
        if (z12) {
            measuredHeight = size2 - textView3.getMeasuredHeight();
            measuredHeight2 = this.f394790m;
        } else {
            measuredHeight = (((size2 - button.getMeasuredHeight()) - (this.f394789l * 2)) - Math.max(c41211a.getMeasuredHeight(), textView.getMeasuredHeight())) - textView2.getMeasuredHeight();
            measuredHeight2 = textView3.getMeasuredHeight();
        }
        int i18 = measuredHeight - measuredHeight2;
        if (i18 <= size) {
            size = i18;
        }
        this.f394779b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            java.util.HashMap<android.view.View, java.lang.Boolean> r0 = r10.f394786i
            boolean r1 = r0.containsKey(r11)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.Object r0 = r0.get(r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r11.setClickable(r0)
            int r12 = r12.getAction()
            android.widget.Button r1 = r10.f394782e
            r3 = 1
            if (r12 == 0) goto L4c
            if (r12 == r3) goto L2b
            r4 = 3
            if (r12 == r4) goto L26
            goto L5a
        L26:
            if (r0 == 0) goto L5a
            if (r11 != r1) goto L3a
            goto L36
        L2b:
            com.my.target.E0$a r12 = r10.f394788k
            if (r12 == 0) goto L32
            r12.onClick(r11)
        L32:
            if (r0 == 0) goto L5a
            if (r11 != r1) goto L3a
        L36:
            r1.setPressed(r2)
            goto L5a
        L3a:
            float r11 = (float) r3
            e11.z r12 = r10.f394783f
            int r8 = r12.a(r11)
            r5 = 0
            r6 = 0
            r7 = -3355444(0xffffffffffcccccc, float:NaN)
            r9 = 0
            r4 = r10
            e11.C39924z.i(r4, r5, r6, r7, r8, r9)
            goto L5a
        L4c:
            if (r0 == 0) goto L5a
            if (r11 != r1) goto L54
            r1.setPressed(r3)
            goto L5a
        L54:
            r11 = -3806472(0xffffffffffc5eaf8, float:NaN)
            r10.setBackgroundColor(r11)
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.ViewOnTouchListenerC39904s0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
