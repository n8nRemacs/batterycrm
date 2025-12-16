package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class a40 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final dq f383402a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private ug f383403b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private TextView f383404c;

    /* renamed from: d, reason: collision with root package name */
    private final View.OnClickListener f383405d;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean zIsSelected = a40.this.f383403b.isSelected();
            a40.this.f383403b.setSelected(!zIsSelected);
            a40.this.f383404c.setVisibility(!zIsSelected ? 0 : 8);
        }
    }

    public a40(@j.N Context context) {
        super(context);
        this.f383405d = new a();
        this.f383402a = new dq();
        a(context);
    }

    public void setDescription(@j.N String str) {
        this.f383404c.setText(str);
    }

    private void a(@j.N Context context) {
        setOrientation(0);
        this.f383402a.getClass();
        int iRound = Math.round(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
        setPadding(iRound, iRound, iRound, iRound);
        ug ugVar = new ug(context, this.f383402a);
        this.f383403b = ugVar;
        ugVar.setOnClickListener(this.f383405d);
        addView(this.f383403b);
        this.f383404c = new TextView(context);
        this.f383402a.getClass();
        int iRound2 = Math.round(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f383404c.setPadding(iRound2, iRound2, iRound2, iRound2);
        this.f383402a.getClass();
        int iRound3 = Math.round(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(iRound3, -65536);
        this.f383404c.setBackgroundDrawable(gradientDrawable);
        addView(this.f383404c);
        this.f383402a.getClass();
        int iRound4 = Math.round(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f383404c.getLayoutParams();
        layoutParams.setMargins(iRound4, 0, iRound4, iRound4);
        this.f383404c.setLayoutParams(layoutParams);
        this.f383404c.setVisibility(8);
    }
}
