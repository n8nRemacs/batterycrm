package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ErrorView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/errors/b;", "Landroid/widget/LinearLayout;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
final class b extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f369060b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f369061c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AppCompatTextView f369062d;

    public b(@Y61.k Context context, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        super(context);
        this.f369060b = aVar;
        this.f369061c = aVar2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setGravity(3);
        this.f369062d = appCompatTextView;
        int iA2 = com.yandex.div.internal.util.p.a(8);
        setPadding(iA2, iA2, iA2, iA2);
        setOrientation(0);
        setBackgroundColor(Color.argb(186, 0, 0, 0));
        setElevation(getResources().getDimension(R.dimen.div_shadow_elevation));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(0, 0, iA2, 0);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(android.R.drawable.ic_menu_close_clear_cancel);
        imageView.setOnClickListener(new a(this, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(android.R.drawable.ic_menu_save);
        imageView2.setOnClickListener(new a(this, 1));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(com.yandex.div.internal.util.p.a(32), -2));
        addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
    }
}
