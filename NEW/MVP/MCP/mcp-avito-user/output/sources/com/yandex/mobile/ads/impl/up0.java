package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;

/* loaded from: classes8.dex */
public final class up0 implements qj0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f390611a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final h11 f390612b = new h11();

    public up0(int i12) {
        this.f390611a = i12;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView a(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("body_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final CustomizableMediaView b(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("media_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (CustomizableMediaView) h11.a(CustomizableMediaView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView c(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("price_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView d(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("call_to_action_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView e(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("warning_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final ImageView f(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("favicon_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView g(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("age_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final View h(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("rating_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (View) h11.a(View.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView i(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("title_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final ImageView j(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("feedback_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView k(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("sponsored_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView l(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("domain_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final ImageView m(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("icon_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView n(@j.N View view) {
        h11 h11Var = this.f390612b;
        StringBuilder sbA = Cif.a("review_count_");
        sbA.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final View a(@j.N View view, @j.N String str) {
        h11 h11Var = this.f390612b;
        StringBuilder sbZ = androidx.appcompat.app.r.z(str, "_");
        sbZ.append(this.f390611a);
        View viewFindViewWithTag = view.findViewWithTag(sbZ.toString());
        h11Var.getClass();
        return (View) h11.a(View.class, viewFindViewWithTag);
    }
}
