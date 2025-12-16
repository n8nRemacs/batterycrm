package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;

/* loaded from: classes8.dex */
public final class xc1 {

    /* renamed from: a, reason: collision with root package name */
    private final a f391682a;

    /* renamed from: b, reason: collision with root package name */
    private final my0 f391683b;

    /* renamed from: c, reason: collision with root package name */
    private String f391684c;

    public enum a {
        f391685b("success"),
        f391686c("application_inactive"),
        f391687d("inconsistent_asset_value"),
        f391688e("no_ad_view"),
        f391689f("no_visible_ads"),
        f391690g("no_visible_required_assets"),
        f391691h("not_added_to_hierarchy"),
        f391692i("not_visible_for_percent"),
        f391693j("required_asset_can_not_be_visible"),
        f391694k("required_asset_is_not_subview"),
        f391695l("superview_hidden"),
        f391696m("too_small"),
        f391697n("visible_area_too_small");


        /* renamed from: a, reason: collision with root package name */
        private final String f391699a;

        a(String str) {
            this.f391699a = str;
        }

        public final String a() {
            return this.f391699a;
        }
    }

    public xc1(@j.N a aVar, @j.N my0 my0Var) {
        this.f391682a = aVar;
        this.f391683b = my0Var;
    }

    public final String a() {
        return this.f391684c;
    }

    @j.N
    public final ky0.b b() {
        return this.f391683b.a();
    }

    @j.N
    public final ky0.b c() {
        return this.f391683b.a(this.f391682a);
    }

    @j.N
    public final ky0.b d() {
        return this.f391683b.b();
    }

    public final a e() {
        return this.f391682a;
    }

    public final void a(String str) {
        this.f391684c = str;
    }
}
