package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ky0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class uh1 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ff1<?> f390563a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final yi1 f390564b;

    public uh1(@Y61.k ff1<?> ff1Var, @Y61.k yi1 yi1Var) {
        this.f390563a = ff1Var;
        this.f390564b = yi1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @Y61.k
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(new LinkedHashMap());
        View view = this.f390564b.getView();
        Integer numValueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
        Integer numValueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
        rc0 rc0VarB = this.f390563a.b();
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        ly0Var.b(numValueOf, "view_container_height");
        if (numValueOf2 == null || numValueOf2.intValue() <= 0) {
            numValueOf2 = null;
        }
        ly0Var.b(numValueOf2, "view_container_width");
        ly0Var.b(rc0VarB.b() > 0 ? Integer.valueOf(rc0VarB.b()) : null, "video_height");
        ly0Var.b(rc0VarB.f() > 0 ? Integer.valueOf(rc0VarB.f()) : null, "video_width");
        ly0Var.b(rc0VarB.a(), "video_codec");
        ly0Var.b(rc0VarB.c(), "video_mime_type");
        ly0Var.b(rc0VarB.e(), "video_vmaf");
        return Collections.singletonMap("video_playback_info", ly0Var.a());
    }
}
