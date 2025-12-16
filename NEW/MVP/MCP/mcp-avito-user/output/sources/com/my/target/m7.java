package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import e11.C39884l0;
import e11.C39896p0;
import e11.C39897p1;
import e11.C39906t;
import e11.C39922y0;
import e11.C39924z;
import e11.E1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class m7 extends ViewGroup implements InterfaceC37779c0, View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39922y0 f364943b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39896p0 f364944c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final TextView f364945d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final TextView f364946e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final TextView f364947f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final TextView f364948g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final TextView f364949h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final Button f364950i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final b4 f364951j;

    /* renamed from: k, reason: collision with root package name */
    public final int f364952k;

    /* renamed from: l, reason: collision with root package name */
    public final int f364953l;

    /* renamed from: m, reason: collision with root package name */
    public final int f364954m;

    /* renamed from: n, reason: collision with root package name */
    public final int f364955n;

    /* renamed from: o, reason: collision with root package name */
    public final int f364956o;

    /* renamed from: p, reason: collision with root package name */
    public final int f364957p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    public final C39906t f364958q;

    /* renamed from: r, reason: collision with root package name */
    public final int f364959r;

    /* renamed from: s, reason: collision with root package name */
    public final int f364960s;

    /* renamed from: t, reason: collision with root package name */
    public final int f364961t;

    /* renamed from: u, reason: collision with root package name */
    @j.N
    public b f364962u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f364963v;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f364964a;

        static {
            int[] iArr = new int[b.values().length];
            f364964a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f364964a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f364964a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f364965b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f364966c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f364967d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f364968e;

        static {
            b bVar = new b("PORTRAIT", 0);
            f364965b = bVar;
            b bVar2 = new b("LANDSCAPE", 1);
            f364966c = bVar2;
            b bVar3 = new b("SQUARE", 2);
            f364967d = bVar3;
            f364968e = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f364968e.clone();
        }
    }

    public m7(@j.N C39906t c39906t, @j.N Context context, @j.N b4 b4Var) {
        super(context);
        this.f364962u = b.f364965b;
        this.f364951j = b4Var;
        this.f364958q = c39906t;
        this.f364952k = c39906t.f394842a.get(C39906t.f394797E);
        int i12 = C39906t.f394798F;
        SparseIntArray sparseIntArray = c39906t.f394842a;
        this.f364953l = sparseIntArray.get(i12);
        this.f364961t = sparseIntArray.get(C39906t.f394799G);
        this.f364954m = sparseIntArray.get(C39906t.f394800H);
        this.f364955n = sparseIntArray.get(C39906t.f394829n);
        this.f364956o = sparseIntArray.get(C39906t.f394828m);
        int i13 = sparseIntArray.get(C39906t.f394805M);
        this.f364959r = i13;
        int i14 = sparseIntArray.get(C39906t.f394812T);
        this.f364957p = sparseIntArray.get(C39906t.f394811S);
        this.f364960s = C39924z.c(i13, context);
        C39922y0 c39922y0 = new C39922y0(context);
        this.f364943b = c39922y0;
        C39896p0 c39896p0 = new C39896p0(context);
        this.f364944c = c39896p0;
        TextView textView = new TextView(context);
        this.f364945d = textView;
        textView.setMaxLines(1);
        textView.setTextSize(1, sparseIntArray.get(C39906t.f394801I));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.f364946e = textView2;
        textView2.setTextSize(1, sparseIntArray.get(C39906t.f394803K));
        textView2.setMaxLines(sparseIntArray.get(C39906t.f394804L));
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        TextView textView3 = new TextView(context);
        this.f364947f = textView3;
        float f12 = i13;
        textView3.setTextSize(1, f12);
        textView3.setEllipsize(truncateAt);
        textView3.setLines(1);
        textView3.setIncludeFontPadding(false);
        TextView textView4 = new TextView(context);
        this.f364948g = textView4;
        textView4.setTextSize(1, f12);
        textView4.setIncludeFontPadding(false);
        Button button = new Button(context);
        this.f364950i = button;
        button.setLines(1);
        button.setTextSize(1, sparseIntArray.get(C39906t.f394837v));
        button.setEllipsize(truncateAt);
        button.setMinimumWidth(i14);
        button.setIncludeFontPadding(false);
        int i15 = sparseIntArray.get(C39906t.f394838w);
        int i16 = i15 * 2;
        button.setPadding(i16, i15, i16, i15);
        TextView textView5 = new TextView(context);
        this.f364949h = textView5;
        textView5.setPadding(sparseIntArray.get(C39906t.f394839x), 0, 0, 0);
        textView5.setTextColor(-1);
        textView5.setMaxLines(sparseIntArray.get(C39906t.f394793A));
        textView5.setIncludeFontPadding(false);
        textView5.setTextSize(1, sparseIntArray.get(C39906t.f394794B));
        c39922y0.setContentDescription("panel_icon");
        C39924z.m(c39922y0, "panel_icon");
        textView.setContentDescription("panel_title");
        C39924z.m(textView, "panel_title");
        textView2.setContentDescription("panel_description");
        C39924z.m(textView2, "panel_description");
        textView3.setContentDescription("panel_domain");
        C39924z.m(textView3, "panel_domain");
        textView4.setContentDescription("panel_rating");
        C39924z.m(textView4, "panel_rating");
        button.setContentDescription("panel_cta");
        C39924z.m(button, "panel_cta");
        textView5.setContentDescription("age_bordering");
        C39924z.m(textView5, "age_bordering");
        addView(c39922y0);
        addView(c39896p0);
        addView(textView);
        addView(textView2);
        addView(textView3);
        addView(textView4);
        addView(button);
        addView(textView5);
    }

    private void setClickArea(@j.N E1 e12) {
        boolean z12 = e12.f394344m;
        Button button = this.f364950i;
        if (z12) {
            setOnClickListener(this);
            button.setOnClickListener(this);
            return;
        }
        if (e12.f394338g) {
            button.setOnClickListener(this);
        } else {
            button.setEnabled(false);
        }
        if (e12.f394343l) {
            setOnClickListener(this);
        } else {
            setOnClickListener(null);
        }
        boolean z13 = e12.f394332a;
        TextView textView = this.f364945d;
        if (z13) {
            textView.setOnClickListener(this);
        } else {
            textView.setOnClickListener(null);
        }
        boolean z14 = e12.f394334c;
        C39922y0 c39922y0 = this.f364943b;
        if (z14) {
            c39922y0.setOnClickListener(this);
        } else {
            c39922y0.setOnClickListener(null);
        }
        boolean z15 = e12.f394333b;
        TextView textView2 = this.f364946e;
        if (z15) {
            textView2.setOnClickListener(this);
        } else {
            textView2.setOnClickListener(null);
        }
        boolean z16 = e12.f394336e;
        C39896p0 c39896p0 = this.f364944c;
        TextView textView3 = this.f364948g;
        if (z16) {
            textView3.setOnClickListener(this);
            c39896p0.setOnClickListener(this);
        } else {
            textView3.setOnClickListener(null);
            c39896p0.setOnClickListener(null);
        }
        boolean z17 = e12.f394341j;
        TextView textView4 = this.f364947f;
        if (z17) {
            textView4.setOnClickListener(this);
        } else {
            textView4.setOnClickListener(null);
        }
        boolean z18 = e12.f394339h;
        TextView textView5 = this.f364949h;
        if (z18) {
            textView5.setOnClickListener(this);
        } else {
            textView5.setOnClickListener(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f364951j.a(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        TextView textView = this.f364947f;
        int measuredHeight = textView.getMeasuredHeight();
        C39896p0 c39896p0 = this.f364944c;
        int measuredHeight2 = c39896p0.getMeasuredHeight();
        int i18 = a.f364964a[this.f364962u.ordinal()];
        Button button = this.f364950i;
        TextView textView2 = this.f364945d;
        int i19 = this.f364954m;
        TextView textView3 = this.f364948g;
        int i22 = this.f364953l;
        C39922y0 c39922y0 = this.f364943b;
        if (i18 != 1) {
            TextView textView4 = this.f364949h;
            if (i18 != 3) {
                C39924z.p(c39922y0, i22, i22);
                int right = (i22 / 2) + c39922y0.getRight();
                int iD2 = C39924z.d(textView3.getMeasuredHeight(), measuredHeight2, measuredHeight);
                int iD3 = C39924z.d(i13 + i22, c39922y0.getTop());
                if (c39922y0.getMeasuredHeight() > 0) {
                    iD3 += (((c39922y0.getMeasuredHeight() - textView2.getMeasuredHeight()) - i19) - iD2) / 2;
                }
                textView2.layout(right, iD3, textView2.getMeasuredWidth() + right, textView2.getMeasuredHeight() + iD3);
                C39924z.e(textView2.getBottom() + i19, right, textView2.getBottom() + i19 + iD2, i22 / 4, c39896p0, textView3, textView);
                C39924z.s(textView4, textView2.getBottom(), textView2.getRight() + i19);
                return;
            }
            int i23 = this.f364961t;
            int i24 = (i15 - i13) - i23;
            C39924z.s(c39922y0, i24, i23);
            C39924z.r(button, i24, (i14 - i12) - i23);
            int right2 = c39922y0.getRight() + i22;
            int iD4 = C39924z.d(textView3.getMeasuredHeight(), measuredHeight2, measuredHeight);
            int measuredHeight3 = ((((c39922y0.getMeasuredHeight() - textView2.getMeasuredHeight()) - i19) - iD4) / 2) + C39924z.d(c39922y0.getTop(), i19);
            textView2.layout(right2, measuredHeight3, textView2.getMeasuredWidth() + right2, textView2.getMeasuredHeight() + measuredHeight3);
            C39924z.e(textView2.getBottom() + i19, right2, textView2.getBottom() + i19 + iD4, i22 / 4, c39896p0, textView3, textView);
            C39924z.s(textView4, textView2.getBottom(), (i22 / 2) + textView2.getRight());
            return;
        }
        int measuredHeight4 = c39922y0.getMeasuredHeight();
        if (measuredHeight4 > 0) {
            i17 = measuredHeight4;
            i16 = 1;
        } else {
            i16 = 0;
            i17 = 0;
        }
        int measuredHeight5 = textView2.getMeasuredHeight();
        if (measuredHeight5 > 0) {
            i16++;
            i17 += measuredHeight5;
        }
        TextView textView5 = this.f364946e;
        int measuredHeight6 = textView5.getMeasuredHeight();
        if (measuredHeight6 > 0) {
            i16++;
            i17 += measuredHeight6;
        }
        int iMax = Math.max(c39896p0.getMeasuredHeight(), textView.getMeasuredHeight());
        if (iMax > 0) {
            i16++;
            i17 += iMax;
        }
        int measuredHeight7 = button.getMeasuredHeight();
        if (measuredHeight7 > 0) {
            i16++;
            i17 += measuredHeight7;
        }
        int i25 = (i15 - i13) - i17;
        int i26 = i25 / i16;
        int i27 = C39924z.f394913b;
        if (i26 <= i19) {
            i22 = i19;
        } else if (i26 <= i22) {
            i22 = i26;
        }
        int i28 = (i25 - (i16 * i22)) / 2;
        int i29 = i14 - i12;
        C39924z.h(c39922y0, 0, i28, i29, measuredHeight4 + i28);
        int iD5 = C39924z.d(i28, c39922y0.getBottom() + i22);
        C39924z.h(textView2, 0, iD5, i29, measuredHeight5 + iD5);
        int iD6 = C39924z.d(iD5, textView2.getBottom() + i22);
        C39924z.h(textView5, 0, iD6, i29, iD6 + measuredHeight6);
        int iD7 = C39924z.d(iD6, textView5.getBottom() + i22);
        C39924z.e(iD7, ((((i29 - textView3.getMeasuredWidth()) - c39896p0.getMeasuredWidth()) - textView.getMeasuredWidth()) - (i19 * 2)) / 2, iMax + iD7, i19, c39896p0, textView3, textView);
        int iD8 = C39924z.d(iD7, textView.getBottom(), c39896p0.getBottom()) + i22;
        C39924z.h(button, 0, iD8, i29, iD8 + measuredHeight7);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int i14 = this.f364953l;
        int i15 = i14 * 2;
        int i16 = size - i15;
        int i17 = size2 - i15;
        b bVar = b.f364966c;
        b bVar2 = b.f364967d;
        if (i16 == i17) {
            this.f364962u = bVar2;
        } else if (i16 > i17) {
            this.f364962u = bVar;
        } else {
            this.f364962u = b.f364965b;
        }
        C39922y0 c39922y0 = this.f364943b;
        int i18 = this.f364952k;
        C39924z.f(i18, i18, 1073741824, c39922y0);
        TextView textView = this.f364948g;
        int visibility = textView.getVisibility();
        int i19 = this.f364954m;
        if (visibility != 8) {
            C39924z.f((i16 - c39922y0.getMeasuredWidth()) - i19, i17, BeduinInputModel.MIN_TEXT_VERSION, textView);
            C39896p0 c39896p0 = this.f364944c;
            int i22 = this.f364960s;
            C39924z.f(i22, i22, 1073741824, c39896p0);
        }
        TextView textView2 = this.f364947f;
        if (textView2.getVisibility() != 8) {
            C39924z.f((i16 - c39922y0.getMeasuredWidth()) - (i14 * 2), i17, BeduinInputModel.MIN_TEXT_VERSION, textView2);
        }
        b bVar3 = this.f364962u;
        int i23 = this.f364957p;
        int i24 = this.f364961t;
        C39906t c39906t = this.f364958q;
        TextView textView3 = this.f364949h;
        Button button = this.f364950i;
        TextView textView4 = this.f364946e;
        TextView textView5 = this.f364945d;
        if (bVar3 == bVar2) {
            int i25 = i24 * 2;
            int i26 = size - i25;
            int i27 = i16 - i25;
            textView5.setGravity(1);
            textView4.setGravity(1);
            textView4.setVisibility(0);
            button.setVisibility(0);
            textView3.setVisibility(8);
            textView5.setTypeface(Typeface.defaultFromStyle(0));
            textView5.setTextSize(1, c39906t.f394842a.get(C39906t.f394802J));
            button.measure(View.MeasureSpec.makeMeasureSpec(i27, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i23, 1073741824));
            C39924z.f(i27, i27, BeduinInputModel.MIN_TEXT_VERSION, textView5);
            C39924z.f(i27, i27, BeduinInputModel.MIN_TEXT_VERSION, textView4);
            setMeasuredDimension(i26, i26);
            return;
        }
        if (bVar3 != bVar) {
            textView5.setGravity(8388611);
            textView4.setVisibility(8);
            button.setVisibility(8);
            textView3.setVisibility(0);
            textView5.setTypeface(textView5.getTypeface(), 1);
            textView5.setTextSize(1, c39906t.f394842a.get(C39906t.f394801I));
            C39924z.f(i16, i17, BeduinInputModel.MIN_TEXT_VERSION, textView3);
            int i28 = i14 * 2;
            C39924z.f(((i16 - c39922y0.getMeasuredWidth()) - i28) - textView3.getMeasuredWidth(), c39922y0.getMeasuredHeight() - (i19 * 2), BeduinInputModel.MIN_TEXT_VERSION, textView5);
            setMeasuredDimension(size, C39924z.d(c39922y0.getMeasuredHeight() + i28, C39924z.d(this.f364959r, textView2.getMeasuredHeight()) + textView5.getMeasuredHeight() + i14));
            return;
        }
        textView5.setGravity(8388611);
        textView4.setVisibility(8);
        button.setVisibility(0);
        textView5.setTextSize(c39906t.f394842a.get(C39906t.f394802J));
        textView3.setVisibility(0);
        textView5.setTypeface(textView5.getTypeface(), 1);
        textView5.setTextSize(1, c39906t.f394842a.get(C39906t.f394801I));
        button.measure(View.MeasureSpec.makeMeasureSpec(i16 / 3, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i23, 1073741824));
        C39924z.f(i16, i17, BeduinInputModel.MIN_TEXT_VERSION, textView3);
        int measuredWidth = i16 - ((textView3.getMeasuredWidth() + ((i14 * 2) + (button.getMeasuredWidth() + c39922y0.getMeasuredWidth()))) + i19);
        C39924z.f(measuredWidth, i17, BeduinInputModel.MIN_TEXT_VERSION, textView5);
        C39924z.f(measuredWidth, i17, BeduinInputModel.MIN_TEXT_VERSION, textView2);
        int measuredHeight = (i24 * 2) + button.getMeasuredHeight();
        if (this.f364963v) {
            measuredHeight += this.f364956o;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // com.my.target.InterfaceC37779c0
    public void setBanner(@j.N C39884l0 c39884l0) {
        C39897p1 c39897p1 = c39884l0.f394671L;
        int i12 = c39897p1.f394734e;
        TextView textView = this.f364945d;
        textView.setTextColor(c39897p1.f394735f);
        TextView textView2 = this.f364946e;
        textView2.setTextColor(i12);
        TextView textView3 = this.f364947f;
        textView3.setTextColor(i12);
        TextView textView4 = this.f364948g;
        textView4.setTextColor(i12);
        this.f364944c.setColor(i12);
        this.f364963v = c39884l0.f394673N != null;
        this.f364943b.setImageData(c39884l0.f394717p);
        textView.setText(c39884l0.f394706e);
        textView2.setText(c39884l0.f394704c);
        if (c39884l0.f394714m.equals("store")) {
            textView3.setVisibility(8);
            if (c39884l0.f394709h > 0.0f) {
                textView4.setVisibility(0);
                String strValueOf = String.valueOf(c39884l0.f394709h);
                if (strValueOf.length() > 3) {
                    strValueOf = strValueOf.substring(0, 3);
                }
                textView4.setText(strValueOf);
            } else {
                textView4.setVisibility(8);
            }
        } else {
            textView4.setVisibility(8);
            textView3.setVisibility(0);
            textView3.setText(c39884l0.f394713l);
            textView3.setTextColor(c39897p1.f394738i);
        }
        String strA = c39884l0.a();
        Button button = this.f364950i;
        button.setText(strA);
        C39924z.n(button, c39897p1.f394730a, c39897p1.f394731b, this.f364955n);
        button.setTextColor(c39897p1.f394734e);
        setClickArea(c39884l0.f394718q);
        this.f364949h.setText(c39884l0.f394708g);
    }
}
