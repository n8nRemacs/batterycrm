package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;

/* loaded from: classes8.dex */
public final class sj0 implements qj0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h11 f389971a = new h11();

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView a(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("body");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final CustomizableMediaView b(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("media");
        h11Var.getClass();
        return (CustomizableMediaView) h11.a(CustomizableMediaView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView c(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("price");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView d(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("call_to_action");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView e(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag(ConstraintKt.WARNING);
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final ImageView f(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("favicon");
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView g(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("age");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final View h(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("rating");
        h11Var.getClass();
        return (View) h11.a(View.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView i(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("title");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final ImageView j(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("feedback");
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView k(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("sponsored");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView l(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("domain");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final ImageView m(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("icon");
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView n(@j.N View view) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag("review_count");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final View a(@j.N View view, @j.N String str) {
        h11 h11Var = this.f389971a;
        View viewFindViewWithTag = view.findViewWithTag(str);
        h11Var.getClass();
        return (View) h11.a(View.class, viewFindViewWithTag);
    }
}
