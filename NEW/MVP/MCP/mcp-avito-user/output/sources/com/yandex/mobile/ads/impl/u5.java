package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes8.dex */
final class u5 {
    @j.N
    public static TextView a(@j.N Context context) {
        TextView textView = new TextView(context, null, R.style.Widget.TextView);
        float fA2 = v5.f390797c.a(context);
        int i12 = rj1.f389556b;
        textView.setTextSize(0, l41.a(context, 1, fA2));
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(Typeface.SANS_SERIF);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setHorizontallyScrolling(false);
        textView.setHorizontalFadingEdgeEnabled(false);
        textView.setVerticalScrollBarEnabled(false);
        textView.setVerticalFadingEdgeEnabled(false);
        textView.setTextColor(context.getResources().getColor(R.color.primary_text_light));
        int iRound = Math.round(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        textView.setPadding(iRound, 0, iRound, 0);
        return textView;
    }

    @j.N
    public static ProgressBar b(@j.N Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        progressBar.setProgressDrawable(s5.f389789b);
        progressBar.setProgress(0);
        progressBar.setMax(10000);
        return progressBar;
    }
}
