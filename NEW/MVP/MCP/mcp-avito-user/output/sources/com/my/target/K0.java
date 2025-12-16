package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.my.target.InterfaceC37815v;
import e11.C39875i0;
import e11.C39883l;
import e11.C39884l0;
import e11.C39898q;
import e11.C39922y0;
import e11.C39924z;
import e11.E1;
import e11.ViewOnClickListenerC39879j1;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class K0 extends ViewGroup implements View.OnTouchListener, InterfaceC37815v {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final TextView f364415b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final TextView f364416c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final TextView f364417d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final e11.r f364418e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C39924z f364419f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final C39922y0 f364420g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final E0 f364421h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final HashMap<View, Boolean> f364422i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final C39875i0 f364423j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final Button f364424k;

    /* renamed from: l, reason: collision with root package name */
    public final int f364425l;

    /* renamed from: m, reason: collision with root package name */
    public final int f364426m;

    /* renamed from: n, reason: collision with root package name */
    public final int f364427n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f364428o;

    /* renamed from: p, reason: collision with root package name */
    public final double f364429p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public InterfaceC37815v.a f364430q;

    public interface a {
        void a(@j.N C39883l c39883l);

        void a(@j.N List<C39883l> list);
    }

    public K0(@j.N Context context) {
        super(context);
        C39924z.g(this, -1, -3806472);
        boolean z12 = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        this.f364428o = z12;
        this.f364429p = z12 ? 0.5d : 0.7d;
        e11.r rVar = new e11.r(context);
        this.f364418e = rVar;
        C39924z c39924z = new C39924z(context);
        this.f364419f = c39924z;
        TextView textView = new TextView(context);
        this.f364415b = textView;
        TextView textView2 = new TextView(context);
        this.f364416c = textView2;
        TextView textView3 = new TextView(context);
        this.f364417d = textView3;
        C39922y0 c39922y0 = new C39922y0(context);
        this.f364420g = c39922y0;
        Button button = new Button(context);
        this.f364424k = button;
        E0 e02 = new E0(context);
        this.f364421h = e02;
        rVar.setContentDescription("close");
        rVar.setVisibility(4);
        c39922y0.setContentDescription("icon");
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setLines(1);
        textView2.setEllipsize(truncateAt);
        textView3.setTextColor(-16777216);
        float f12 = 15;
        float f13 = 10;
        button.setPadding(c39924z.a(f12), c39924z.a(f13), c39924z.a(f12), c39924z.a(f13));
        button.setMinimumWidth(c39924z.a(100));
        button.setMaxEms(12);
        button.setTransformationMethod(null);
        button.setSingleLine();
        button.setTextSize(18.0f);
        button.setEllipsize(truncateAt);
        button.setElevation(c39924z.a(r15));
        C39924z.n(button, -16733198, -16746839, c39924z.a(2));
        button.setTextColor(-1);
        e02.setPadding(0, 0, 0, c39924z.a(8));
        e02.setSideSlidesMargins(c39924z.a(f13));
        if (z12) {
            int iA2 = c39924z.a(18);
            this.f364426m = iA2;
            this.f364425l = iA2;
            textView.setTextSize((int) TypedValue.applyDimension(2, 24, context.getResources().getDisplayMetrics()));
            float f14 = 20;
            textView3.setTextSize((int) TypedValue.applyDimension(2, f14, context.getResources().getDisplayMetrics()));
            textView2.setTextSize((int) TypedValue.applyDimension(2, f14, context.getResources().getDisplayMetrics()));
            this.f364427n = c39924z.a(96);
            textView.setTypeface(null, 1);
        } else {
            this.f364425l = c39924z.a(12);
            this.f364426m = c39924z.a(f13);
            textView.setTextSize(22.0f);
            textView3.setTextSize(18.0f);
            textView2.setTextSize(18.0f);
            this.f364427n = c39924z.a(64);
        }
        C39875i0 c39875i0 = new C39875i0(context);
        this.f364423j = c39875i0;
        C39924z.m(this, "ad_view");
        C39924z.m(textView, "title_text");
        C39924z.m(textView3, "description_text");
        C39924z.m(c39922y0, "icon_image");
        C39924z.m(rVar, "close_button");
        C39924z.m(textView2, "category_text");
        addView(e02);
        addView(c39922y0);
        addView(textView);
        addView(textView2);
        addView(c39875i0);
        addView(textView3);
        addView(rVar);
        addView(button);
        this.f364422i = new HashMap<>();
    }

    @Override // com.my.target.InterfaceC37815v
    public final void d() {
        this.f364418e.setVisibility(0);
    }

    @Override // com.my.target.InterfaceC37815v
    @j.N
    public View getCloseButton() {
        return this.f364418e;
    }

    @j.N
    public int[] getNumbersOfCurrentShowingCards() {
        E0 e02 = this.f364421h;
        int iK1 = e02.getCardLayoutManager().K1();
        int iL1 = e02.getCardLayoutManager().L1();
        int i12 = 0;
        if (iK1 == -1 || iL1 == -1) {
            return new int[0];
        }
        int i13 = (iL1 - iK1) + 1;
        int[] iArr = new int[i13];
        while (i12 < i13) {
            iArr[i12] = iK1;
            i12++;
            iK1++;
        }
        return iArr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16;
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        e11.r rVar = this.f364418e;
        rVar.layout(i14 - rVar.getMeasuredWidth(), i13, i14, rVar.getMeasuredHeight() + i13);
        C39875i0 c39875i0 = this.f364423j;
        C39924z.h(c39875i0, rVar.getLeft() - c39875i0.getMeasuredWidth(), rVar.getTop(), rVar.getLeft(), rVar.getBottom());
        TextView textView = this.f364417d;
        TextView textView2 = this.f364416c;
        TextView textView3 = this.f364415b;
        C39922y0 c39922y0 = this.f364420g;
        boolean z13 = this.f364428o;
        E0 e02 = this.f364421h;
        int i19 = this.f364426m;
        if (i18 > i17 || z13) {
            int bottom = rVar.getBottom();
            int measuredHeight = (i19 * 2) + textView.getMeasuredHeight() + Math.max(textView2.getMeasuredHeight() + textView3.getMeasuredHeight(), c39922y0.getMeasuredHeight()) + e02.getMeasuredHeight();
            if (measuredHeight < i18 && (i16 = (i18 - measuredHeight) / 2) > bottom) {
                bottom = i16;
            }
            int i22 = i12 + i19;
            c39922y0.layout(i22, bottom, c39922y0.getMeasuredWidth() + i12 + i19, c39922y0.getMeasuredHeight() + i13 + bottom);
            textView3.layout(c39922y0.getRight(), bottom, textView3.getMeasuredWidth() + c39922y0.getRight(), textView3.getMeasuredHeight() + bottom);
            textView2.layout(c39922y0.getRight(), textView3.getBottom(), textView2.getMeasuredWidth() + c39922y0.getRight(), textView2.getMeasuredHeight() + textView3.getBottom());
            int iMax = Math.max(Math.max(c39922y0.getBottom(), textView2.getBottom()), textView3.getBottom());
            textView.layout(i22, iMax, textView.getMeasuredWidth() + i22, textView.getMeasuredHeight() + iMax);
            int iMax2 = Math.max(iMax, textView.getBottom()) + i19;
            e02.layout(i22, iMax2, i14, e02.getMeasuredHeight() + iMax2);
            androidx.recyclerview.widget.A a12 = e02.f364380I0;
            if (z13) {
                a12.b(null);
                return;
            } else {
                a12.b(e02);
                return;
            }
        }
        e02.f364380I0.b(null);
        int i23 = i15 - i19;
        c39922y0.layout(i19, i23 - c39922y0.getMeasuredHeight(), c39922y0.getMeasuredWidth() + i19, i23);
        int measuredHeight2 = c39922y0.getMeasuredHeight();
        Button button = this.f364424k;
        int iMax3 = ((Math.max(measuredHeight2, button.getMeasuredHeight()) - textView3.getMeasuredHeight()) - textView2.getMeasuredHeight()) / 2;
        if (iMax3 < 0) {
            iMax3 = 0;
        }
        int i24 = i23 - iMax3;
        textView2.layout(c39922y0.getRight(), i24 - textView2.getMeasuredHeight(), textView2.getMeasuredWidth() + c39922y0.getRight(), i24);
        textView3.layout(c39922y0.getRight(), textView2.getTop() - textView3.getMeasuredHeight(), textView3.getMeasuredWidth() + c39922y0.getRight(), textView2.getTop());
        int iMax4 = (Math.max(c39922y0.getMeasuredHeight(), textView2.getMeasuredHeight() + textView3.getMeasuredHeight()) - button.getMeasuredHeight()) / 2;
        if (iMax4 < 0) {
            iMax4 = 0;
        }
        int i25 = i14 - i19;
        int i26 = i23 - iMax4;
        button.layout(i25 - button.getMeasuredWidth(), i26 - button.getMeasuredHeight(), i25, i26);
        e02.layout(i19, i19, i14, e02.getMeasuredHeight() + i19);
        textView.layout(0, 0, 0, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION);
        e11.r rVar = this.f364418e;
        rVar.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        C39922y0 c39922y0 = this.f364420g;
        int i14 = this.f364427n;
        c39922y0.measure(View.MeasureSpec.makeMeasureSpec(i14, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i14, BeduinInputModel.MIN_TEXT_VERSION));
        this.f364423j.measure(i12, i13);
        boolean z12 = this.f364428o;
        TextView textView = this.f364416c;
        TextView textView2 = this.f364415b;
        E0 e02 = this.f364421h;
        Button button = this.f364424k;
        int i15 = this.f364426m;
        if (size2 > size || z12) {
            button.setVisibility(8);
            int measuredHeight = rVar.getMeasuredHeight();
            if (z12) {
                measuredHeight = i15;
            }
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - (i15 * 2)) - c39922y0.getMeasuredWidth(), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION));
            textView.measure(View.MeasureSpec.makeMeasureSpec((size - (i15 * 2)) - c39922y0.getMeasuredWidth(), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION));
            TextView textView3 = this.f364417d;
            textView3.measure(View.MeasureSpec.makeMeasureSpec(size - (i15 * 2), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION));
            int iMax = ((size2 - measuredHeight) - Math.max(textView.getMeasuredHeight() + textView2.getMeasuredHeight(), c39922y0.getMeasuredHeight() - (i15 * 2))) - textView3.getMeasuredHeight();
            int i16 = size - i15;
            if (size2 > size) {
                double d12 = iMax / size2;
                double d13 = this.f364429p;
                if (d12 > d13) {
                    iMax = (int) (size2 * d13);
                }
            }
            if (z12) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax - (i15 * 2), BeduinInputModel.MIN_TEXT_VERSION);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax - (i15 * 2), 1073741824);
            }
        } else {
            button.setVisibility(0);
            button.measure(View.MeasureSpec.makeMeasureSpec(size, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION));
            int measuredWidth = button.getMeasuredWidth();
            int i17 = (size / 2) - (i15 * 2);
            if (measuredWidth > i17) {
                button.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION));
            }
            int measuredWidth2 = (size - c39922y0.getMeasuredWidth()) - measuredWidth;
            int i18 = this.f364425l;
            textView2.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth2 - i18) - i15, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION));
            textView.measure(View.MeasureSpec.makeMeasureSpec((((size - c39922y0.getMeasuredWidth()) - measuredWidth) - i18) - i15, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION));
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - i15, BeduinInputModel.MIN_TEXT_VERSION);
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((((size2 - Math.max(c39922y0.getMeasuredHeight(), Math.max(button.getMeasuredHeight(), textView.getMeasuredHeight() + textView2.getMeasuredHeight()))) - (i15 * 2)) - e02.getPaddingBottom()) - e02.getPaddingTop(), BeduinInputModel.MIN_TEXT_VERSION);
        }
        e02.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        HashMap<View, Boolean> map = this.f364422i;
        if (!map.containsKey(view)) {
            return false;
        }
        if (!map.get(view).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(-3806472);
        } else if (action == 1) {
            setBackgroundColor(-1);
            InterfaceC37815v.a aVar = this.f364430q;
            if (aVar != null) {
                aVar.e();
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    @Override // com.my.target.InterfaceC37815v
    public void setBanner(@j.N C39884l0 c39884l0) {
        com.my.target.common.models.b bVar = c39884l0.f394741H;
        e11.r rVar = this.f364418e;
        if (bVar == null || bVar.a() == null) {
            Bitmap bitmapA = C39898q.a(this.f364419f.a(28));
            if (bitmapA != null) {
                rVar.a(bitmapA, false);
            }
        } else {
            rVar.a(bVar.a(), true);
        }
        this.f364424k.setText(c39884l0.a());
        com.my.target.common.models.b bVar2 = c39884l0.f394717p;
        if (bVar2 != null) {
            C39922y0 c39922y0 = this.f364420g;
            int i12 = bVar2.f394305b;
            int i13 = bVar2.f394306c;
            c39922y0.f394908e = i12;
            c39922y0.f394907d = i13;
            C37802o.c(bVar2, c39922y0, null);
        }
        TextView textView = this.f364415b;
        textView.setTextColor(-16777216);
        textView.setText(c39884l0.f394706e);
        String str = c39884l0.f394711j;
        String str2 = c39884l0.f394712k;
        String strF = TextUtils.isEmpty(str) ? "" : androidx.camera.camera2.internal.G.f("", str);
        if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(str2)) {
            strF = androidx.appcompat.app.r.q(strF, ", ");
        }
        if (!TextUtils.isEmpty(str2)) {
            strF = androidx.appcompat.app.r.q(strF, str2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(strF);
        TextView textView2 = this.f364416c;
        if (zIsEmpty) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(strF);
            textView2.setVisibility(0);
        }
        this.f364417d.setText(c39884l0.f394704c);
        this.f364421h.M0(c39884l0.f394672M);
        C37788h c37788h = c39884l0.f394698D;
        C39875i0 c39875i0 = this.f364423j;
        if (c37788h == null) {
            c39875i0.setVisibility(8);
        } else {
            c39875i0.setImageBitmap(c37788h.f364851a.a());
            c39875i0.setOnClickListener(new J0(this));
        }
    }

    public void setCarouselListener(@j.P a aVar) {
        this.f364421h.setCarouselListener(aVar);
    }

    @Override // com.my.target.InterfaceC37815v
    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickArea(@j.N E1 e12) {
        boolean z12 = true;
        if (e12.f394344m) {
            setOnClickListener(new ViewOnClickListenerC39879j1(this, 2));
            C39924z.g(this, -1, -3806472);
            setClickable(true);
            return;
        }
        TextView textView = this.f364415b;
        textView.setOnTouchListener(this);
        TextView textView2 = this.f364416c;
        textView2.setOnTouchListener(this);
        C39922y0 c39922y0 = this.f364420g;
        c39922y0.setOnTouchListener(this);
        TextView textView3 = this.f364417d;
        textView3.setOnTouchListener(this);
        Button button = this.f364424k;
        button.setOnTouchListener(this);
        setOnTouchListener(this);
        HashMap<View, Boolean> map = this.f364422i;
        map.put(textView, Boolean.valueOf(e12.f394332a));
        map.put(textView2, Boolean.valueOf(e12.f394342k));
        map.put(c39922y0, Boolean.valueOf(e12.f394334c));
        map.put(textView3, Boolean.valueOf(e12.f394333b));
        boolean z13 = e12.f394343l;
        if (!z13 && !e12.f394338g) {
            z12 = false;
        }
        map.put(button, Boolean.valueOf(z12));
        map.put(this, Boolean.valueOf(z13));
    }

    @Override // com.my.target.InterfaceC37815v
    public void setInterstitialPromoViewListener(@j.P InterfaceC37815v.a aVar) {
        this.f364430q = aVar;
    }

    @Override // com.my.target.InterfaceC37815v
    @j.N
    public View getView() {
        return this;
    }
}
