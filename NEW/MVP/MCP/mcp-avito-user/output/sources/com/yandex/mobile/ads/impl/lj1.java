package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.ky0;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class lj1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final o5 f387547a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ny0 f387548b;

    public lj1(@Y61.k Context context, @Y61.k o5 o5Var, @Y61.k ny0 ny0Var) {
        this.f387547a = o5Var;
        this.f387548b = ny0Var;
    }

    public final void a(@Y61.k jj1 jj1Var, @Y61.k n2 n2Var) {
        int iD2;
        ly0 ly0Var = new ly0(new LinkedHashMap());
        g5 g5VarA = n2Var.a();
        if (g5VarA != null) {
            ly0Var.a(this.f387547a.a(g5VarA));
        }
        ly0Var.b(n2Var.c(), "ad_unit_id");
        ly0Var.b(n2Var.c(), "block_id");
        int iL2 = n2Var.l();
        ly0Var.b(iL2 != 1 ? iL2 != 2 ? "undefined" : "landscape" : "portrait", "orientation");
        SizeInfo sizeInfoN = n2Var.n();
        ly0Var.a((sizeInfoN == null || (iD2 = sizeInfoN.d()) == 0) ? null : m41.a(iD2), "size_type");
        SizeInfo sizeInfoN2 = n2Var.n();
        ly0Var.a(sizeInfoN2 != null ? Integer.valueOf(sizeInfoN2.e()) : null, "size_info_width");
        SizeInfo sizeInfoN3 = n2Var.n();
        ly0Var.a(sizeInfoN3 != null ? Integer.valueOf(sizeInfoN3.c()) : null, "size_info_height");
        ly0Var.b(Integer.valueOf(jj1Var.d().b()), "view_width");
        ly0Var.b(Integer.valueOf(jj1Var.d().a()), "view_height");
        ly0Var.a(jj1Var.b().b(), "layout_width");
        ly0Var.a(jj1Var.b().a(), "layout_height");
        ly0Var.b(Integer.valueOf(jj1Var.c().b().b()), "measured_width");
        String strName = jj1Var.c().b().a().name();
        Locale locale = Locale.ROOT;
        ly0Var.b(strName.toLowerCase(locale), "measured_width_mode");
        ly0Var.b(Integer.valueOf(jj1Var.c().a().b()), "measured_height");
        ly0Var.b(jj1Var.c().a().a().name().toLowerCase(locale), "measured_height_mode");
        this.f387548b.a(new ky0(ky0.b.f387294O, ly0Var.a()));
    }

    public /* synthetic */ lj1(Context context) {
        this(context, new o5(), m9.a(context));
    }
}
