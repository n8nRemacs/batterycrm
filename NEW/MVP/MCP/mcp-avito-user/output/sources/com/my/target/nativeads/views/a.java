package com.my.target.nativeads.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import e11.C39922y0;
import e11.C39924z;
import i11.C41211a;
import j.N;
import j.P;
import k11.C42474a;

/* loaded from: classes7.dex */
public class a extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final C39922y0 f365021b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final C39922y0 f365022c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final C39922y0 f365023d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final TextView f365024e;

    /* renamed from: f, reason: collision with root package name */
    @N
    public final TextView f365025f;

    /* renamed from: g, reason: collision with root package name */
    @N
    public final C41211a f365026g;

    /* renamed from: h, reason: collision with root package name */
    @N
    public final TextView f365027h;

    /* renamed from: i, reason: collision with root package name */
    @N
    public final C39922y0 f365028i;

    /* renamed from: j, reason: collision with root package name */
    @N
    public final TextView f365029j;

    /* renamed from: k, reason: collision with root package name */
    @N
    public final C39922y0 f365030k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public C42474a f365031l;

    public a(Context context) {
        super(context);
        int iRgb = Color.rgb(36, 36, 36);
        C39922y0 c39922y0 = new C39922y0(context);
        this.f365023d = c39922y0;
        LinearLayout linearLayout = new LinearLayout(context);
        TextView textView = new TextView(context);
        this.f365024e = textView;
        C39922y0 c39922y02 = new C39922y0(context);
        this.f365030k = c39922y02;
        C39922y0 c39922y03 = new C39922y0(context);
        this.f365022c = c39922y03;
        C39922y0 c39922y04 = new C39922y0(context);
        this.f365028i = c39922y04;
        TextView textView2 = new TextView(context);
        this.f365029j = textView2;
        TextView textView3 = new TextView(context);
        this.f365025f = textView3;
        C41211a c41211a = new C41211a(context);
        this.f365026g = c41211a;
        TextView textView4 = new TextView(context);
        this.f365027h = textView4;
        C39922y0 c39922y05 = new C39922y0(context);
        this.f365021b = c39922y05;
        C39924z c39924z = new C39924z(context);
        float fA2 = c39924z.a(6);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fA2, fA2, fA2, fA2, fA2, fA2, fA2, fA2}, null, null));
        int iA2 = c39924z.a(18);
        int iA3 = c39924z.a(14);
        int iA4 = c39924z.a(53);
        int iGenerateViewId = View.generateViewId();
        int iGenerateViewId2 = View.generateViewId();
        int iGenerateViewId3 = View.generateViewId();
        setBackgroundColor(-1);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA4 + iA3 + iA3, iA4 + iA2 + iA2);
        c39922y0.setPadding(iA3, iA2, iA3, iA2);
        addView(c39922y0, layoutParams);
        float f12 = 20;
        int iA5 = c39924z.a(f12);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA5, iA5);
        layoutParams2.leftMargin = c39924z.a(57);
        float f13 = 10;
        layoutParams2.topMargin = c39924z.a(f13);
        c39922y05.setLayoutParams(layoutParams2);
        addView(c39922y05);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iA4, iA4);
        layoutParams3.addRule(11);
        layoutParams3.rightMargin = iA3;
        layoutParams3.topMargin = iA2;
        linearLayout.setBackgroundDrawable(shapeDrawable);
        linearLayout.setOrientation(1);
        addView(linearLayout, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        Typeface typeface = Typeface.SANS_SERIF;
        textView.setTypeface(typeface);
        int iA6 = c39924z.a(f13);
        float f14 = 2;
        textView.setPadding(0, iA6, 0, c39924z.a(f14));
        textView.setTextSize(2, 13.0f);
        textView.setGravity(49);
        linearLayout.addView(textView, layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(c39924z.a(f12), c39924z.a(f12));
        layoutParams5.gravity = 1;
        linearLayout.addView(c39922y02, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(c39924z.a(19), -2);
        layoutParams6.addRule(15);
        layoutParams6.addRule(11);
        layoutParams6.rightMargin = c39924z.a(30);
        addView(c39922y03, layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(iA4, iA4);
        layoutParams7.addRule(10);
        layoutParams7.addRule(11);
        addView(c39922y04, layoutParams7);
        textView2.setTypeface(typeface);
        textView2.setTextSize(2, 18.0f);
        textView2.setTextColor(iRgb);
        textView2.setPadding(0, 0, c39924z.a(67), 0);
        textView2.setId(iGenerateViewId3);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
        float f15 = 91;
        layoutParams8.leftMargin = c39924z.a(f15);
        layoutParams8.rightMargin = c39924z.a(15);
        layoutParams8.topMargin = c39924z.a(13);
        textView2.setLayoutParams(layoutParams8);
        addView(textView2);
        textView3.setTypeface(typeface);
        textView3.setTextSize(2, 13.0f);
        textView3.setTextColor(iRgb);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.leftMargin = c39924z.a(f15);
        layoutParams9.addRule(3, iGenerateViewId3);
        textView3.setId(iGenerateViewId);
        textView3.setLayoutParams(layoutParams9);
        addView(textView3);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(3, iGenerateViewId);
        layoutParams10.leftMargin = c39924z.a(f15);
        layoutParams10.topMargin = c39924z.a(5);
        c41211a.setPadding(0, 0, 0, c39924z.a(f12));
        c41211a.setStarsPadding(c39924z.a(f14));
        c41211a.setStarSize(c39924z.a(12));
        c41211a.setId(iGenerateViewId2);
        addView(c41211a, layoutParams10);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams11.addRule(1, iGenerateViewId2);
        layoutParams11.addRule(3, iGenerateViewId);
        layoutParams11.leftMargin = c39924z.a(9);
        textView4.setTypeface(typeface);
        textView4.setPadding(0, c39924z.a(f14), 0, 0);
        textView4.setTextSize(2, 13.0f);
        textView4.setTextColor(iRgb);
        textView4.setGravity(16);
        addView(textView4, layoutParams11);
    }

    @P
    public C42474a getBanner() {
        return this.f365031l;
    }

    @N
    public ImageView getBannerIconImageView() {
        return this.f365023d;
    }

    @N
    public TextView getCoinsCountTextView() {
        return this.f365024e;
    }

    @N
    public ImageView getCoinsIconImageView() {
        return this.f365030k;
    }

    @N
    public TextView getDescriptionTextView() {
        return this.f365025f;
    }

    @N
    public ImageView getNotificationImageView() {
        return this.f365021b;
    }

    @N
    public ImageView getOpenImageView() {
        return this.f365022c;
    }

    @N
    public C41211a getStarsRatingView() {
        return this.f365026g;
    }

    @N
    public ImageView getStatusIconImageView() {
        return this.f365028i;
    }

    @N
    public TextView getTitleTextView() {
        return this.f365029j;
    }

    @N
    public TextView getVotesCountTextView() {
        return this.f365027h;
    }

    public void setNativeAppwallBanner(C42474a c42474a) {
        this.f365031l = c42474a;
        C39922y0 c39922y0 = this.f365023d;
        c42474a.getClass();
        c39922y0.setImageData(null);
        this.f365021b.setImageData(null);
        this.f365029j.setText((CharSequence) null);
        this.f365025f.setText((CharSequence) null);
        throw null;
    }

    public void setViewed(boolean z12) {
    }
}
