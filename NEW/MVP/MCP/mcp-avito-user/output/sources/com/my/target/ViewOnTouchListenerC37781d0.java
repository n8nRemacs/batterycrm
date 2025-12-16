package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.my.target.InterfaceC37775a0;
import e11.C39883l;
import e11.C39897p1;
import e11.C39906t;
import e11.C39922y0;
import e11.C39924z;
import e11.E1;
import java.util.HashSet;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.my.target.d0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC37781d0 extends LinearLayout implements View.OnTouchListener, InterfaceC37775a0 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39922y0 f364788b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final TextView f364789c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final TextView f364790d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final Button f364791e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C39906t f364792f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final HashSet f364793g;

    /* renamed from: h, reason: collision with root package name */
    public final int f364794h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public InterfaceC37775a0.a f364795i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public com.my.target.common.models.b f364796j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f364797k;

    public ViewOnTouchListenerC37781d0(@j.N Context context, @j.N C39897p1 c39897p1, @j.N C39906t c39906t) {
        super(context);
        this.f364793g = new HashSet();
        setOrientation(1);
        this.f364792f = c39906t;
        C39922y0 c39922y0 = new C39922y0(context);
        this.f364788b = c39922y0;
        TextView textView = new TextView(context);
        this.f364789c = textView;
        TextView textView2 = new TextView(context);
        this.f364790d = textView2;
        Button button = new Button(context);
        this.f364791e = button;
        this.f364794h = c39906t.f394842a.get(C39906t.f394811S);
        int i12 = C39906t.f394823h;
        SparseIntArray sparseIntArray = c39906t.f394842a;
        int i13 = sparseIntArray.get(i12);
        int i14 = sparseIntArray.get(C39906t.f394799G);
        button.setTransformationMethod(null);
        button.setSingleLine();
        button.setTextSize(1, sparseIntArray.get(C39906t.f394837v));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        button.setGravity(17);
        button.setIncludeFontPadding(false);
        button.setPadding(i13, 0, i13, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i15 = C39906t.f394807O;
        layoutParams.leftMargin = sparseIntArray.get(i15);
        layoutParams.rightMargin = sparseIntArray.get(i15);
        layoutParams.topMargin = i14;
        layoutParams.gravity = 1;
        button.setLayoutParams(layoutParams);
        C39924z.n(button, c39897p1.f394730a, c39897p1.f394731b, sparseIntArray.get(C39906t.f394829n));
        button.setTextColor(c39897p1.f394732c);
        textView.setTextSize(1, sparseIntArray.get(C39906t.f394808P));
        textView.setTextColor(c39897p1.f394735f);
        textView.setIncludeFontPadding(false);
        int i16 = C39906t.f394806N;
        textView.setPadding(sparseIntArray.get(i16), 0, sparseIntArray.get(i16), 0);
        textView.setTypeface(null, 1);
        textView.setLines(sparseIntArray.get(C39906t.f394795C));
        textView.setEllipsize(truncateAt);
        textView.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = i13;
        textView.setLayoutParams(layoutParams2);
        textView2.setTextColor(c39897p1.f394734e);
        textView2.setIncludeFontPadding(false);
        textView2.setLines(sparseIntArray.get(C39906t.f394796D));
        textView2.setTextSize(1, sparseIntArray.get(C39906t.f394809Q));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(sparseIntArray.get(i16), 0, sparseIntArray.get(i16), 0);
        textView2.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        C39924z.m(this, "card_view");
        C39924z.m(textView, "card_title_text");
        C39924z.m(textView2, "card_description_text");
        C39924z.m(button, "card_cta_button");
        C39924z.m(c39922y0, "card_image");
        addView(c39922y0);
        addView(textView);
        addView(textView2);
        addView(button);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickArea(@j.N E1 e12) {
        setOnTouchListener(this);
        C39922y0 c39922y0 = this.f364788b;
        c39922y0.setOnTouchListener(this);
        TextView textView = this.f364789c;
        textView.setOnTouchListener(this);
        TextView textView2 = this.f364790d;
        textView2.setOnTouchListener(this);
        Button button = this.f364791e;
        button.setOnTouchListener(this);
        HashSet hashSet = this.f364793g;
        hashSet.clear();
        if (e12.f394344m) {
            this.f364797k = true;
            return;
        }
        if (e12.f394338g) {
            hashSet.add(button);
        } else {
            button.setEnabled(false);
            hashSet.remove(button);
        }
        if (e12.f394343l) {
            hashSet.add(this);
        } else {
            hashSet.remove(this);
        }
        if (e12.f394332a) {
            hashSet.add(textView);
        } else {
            hashSet.remove(textView);
        }
        if (e12.f394333b) {
            hashSet.add(textView2);
        } else {
            hashSet.remove(textView2);
        }
        if (e12.f394335d) {
            hashSet.add(c39922y0);
        } else {
            hashSet.remove(c39922y0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        C39922y0 c39922y0 = this.f364788b;
        c39922y0.measure(i12, i13);
        TextView textView = this.f364789c;
        if (textView.getVisibility() == 0) {
            textView.measure(i12, i13);
        }
        TextView textView2 = this.f364790d;
        if (textView2.getVisibility() == 0) {
            textView2.measure(i12, i13);
        }
        Button button = this.f364791e;
        if (button.getVisibility() == 0) {
            C39924z.f(c39922y0.getMeasuredWidth() - (this.f364792f.f394842a.get(C39906t.f394807O) * 2), this.f364794h, 1073741824, button);
        }
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0 && getMeasuredWidth() == size) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int measuredWidth = c39922y0.getMeasuredWidth();
        int measuredHeight = c39922y0.getMeasuredHeight();
        if (size <= size2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                int paddingBottom = childAt.getPaddingBottom() + childAt.getPaddingTop() + childAt.getMeasuredHeight() + paddingTop;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                paddingTop = layoutParams.bottomMargin + paddingBottom + layoutParams.topMargin;
            }
            measuredHeight = paddingTop;
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        HashSet hashSet = this.f364793g;
        Button button = this.f364791e;
        if (action != 0) {
            if (action == 1) {
                setBackgroundColor(0);
                button.setPressed(false);
                InterfaceC37775a0.a aVar = this.f364795i;
                if (aVar != null) {
                    aVar.a(this.f364797k || hashSet.contains(view));
                }
            } else if (action == 3) {
                setBackgroundColor(0);
                button.setPressed(false);
            }
        } else if (this.f364797k || hashSet.contains(view)) {
            if (view == button) {
                button.setPressed(true);
            } else {
                setBackgroundColor(-13421773);
            }
        }
        return true;
    }

    @Override // com.my.target.InterfaceC37775a0
    public void setBanner(@j.P C39883l c39883l) {
        C39922y0 c39922y0 = this.f364788b;
        Button button = this.f364791e;
        TextView textView = this.f364790d;
        TextView textView2 = this.f364789c;
        if (c39883l == null) {
            this.f364793g.clear();
            com.my.target.common.models.b bVar = this.f364796j;
            if (bVar != null) {
                C37802o.b(bVar, c39922y0);
            }
            c39922y0.f394908e = 0;
            c39922y0.f394907d = 0;
            textView2.setVisibility(8);
            textView.setVisibility(8);
            button.setVisibility(8);
            return;
        }
        com.my.target.common.models.b bVar2 = c39883l.f394716o;
        this.f364796j = bVar2;
        if (bVar2 != null) {
            int i12 = bVar2.f394305b;
            int i13 = bVar2.f394306c;
            c39922y0.f394908e = i12;
            c39922y0.f394907d = i13;
            C37802o.c(bVar2, c39922y0, null);
        }
        if (c39883l.f394670H) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            button.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView.setVisibility(0);
            button.setVisibility(0);
            textView2.setText(c39883l.f394706e);
            textView.setText(c39883l.f394704c);
            button.setText(c39883l.a());
        }
        setClickArea(c39883l.f394718q);
    }

    @Override // com.my.target.InterfaceC37775a0
    public void setListener(@j.P InterfaceC37775a0.a aVar) {
        this.f364795i = aVar;
    }
}
