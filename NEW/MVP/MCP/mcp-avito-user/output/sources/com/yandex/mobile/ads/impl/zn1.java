package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes8.dex */
public final class zn1 extends vd0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final cj1<ViewPager2, List<b30>> f392303c;

    public zn1(@Y61.k CustomizableMediaView customizableMediaView, @Y61.k dj0 dj0Var, @Y61.k n2 n2Var) {
        super(customizableMediaView, n2Var);
        this.f392303c = new cj1<>(dj0Var);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(View view) {
        this.f392303c.a();
        super.a((zn1) view);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(@Y61.k CustomizableMediaView customizableMediaView, @Y61.k rd0 rd0Var) {
        List<b30> listA = rd0Var.a();
        if (listA == null || !(!listA.isEmpty())) {
            return false;
        }
        return this.f392303c.a(listA);
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    @Y61.k
    public final int c() {
        return 3;
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(eb ebVar, ej1 ej1Var, rd0 rd0Var) {
        rd0 rd0Var2 = rd0Var;
        this.f392303c.a(ebVar, ej1Var, rd0Var2 != null ? rd0Var2.a() : null);
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    /* renamed from: a */
    public final void b(@Y61.k CustomizableMediaView customizableMediaView, @Y61.k rd0 rd0Var) {
        super.b(customizableMediaView, rd0Var);
        List<b30> listA = rd0Var.a();
        if (listA == null || !(!listA.isEmpty())) {
            return;
        }
        this.f392303c.b(listA);
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    public final void a(@Y61.k rd0 rd0Var) {
        List<b30> listA = rd0Var.a();
        if (listA == null || !(!listA.isEmpty())) {
            return;
        }
        this.f392303c.b(listA);
    }
}
