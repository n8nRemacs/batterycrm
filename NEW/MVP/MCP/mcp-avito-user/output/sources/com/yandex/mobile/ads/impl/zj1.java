package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.xc1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class zj1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Map<xc1.a, String> f392274a = new a();

    public class a extends HashMap<xc1.a, String> {
        public a() {
            put(xc1.a.f391686c, "Screen is locked");
            put(xc1.a.f391687d, "Asset value %s doesn't match view value");
            put(xc1.a.f391688e, "No ad view");
            put(xc1.a.f391689f, "No valid ads in ad unit");
            put(xc1.a.f391690g, "No visible required assets");
            put(xc1.a.f391691h, "Ad view is not added to hierarchy");
            put(xc1.a.f391692i, "Ad is not visible for percent");
            put(xc1.a.f391693j, "Required asset %s is not visible in ad view");
            put(xc1.a.f391694k, "Required asset %s is not subview of ad view");
            put(xc1.a.f391685b, "Unknown error, that shouldn't happen");
            put(xc1.a.f391695l, "Ad view is hidden");
            put(xc1.a.f391696m, "View is too small");
            put(xc1.a.f391697n, "Visible area of an ad view is too small");
        }
    }

    @j.N
    public final String a(@j.N xc1 xc1Var) {
        String strA = xc1Var.a();
        String str = (String) ((HashMap) this.f392274a).get(xc1Var.e());
        return str != null ? String.format(str, strA) : "Visibility error";
    }
}
