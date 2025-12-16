package com.yandex.mobile.ads.impl;

import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;

/* loaded from: classes8.dex */
public abstract class vd0 extends bj1<CustomizableMediaView, rd0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ce0 f390847b;

    public vd0(@Y61.k CustomizableMediaView customizableMediaView, @Y61.k n2 n2Var) {
        super(customizableMediaView);
        this.f390847b = new ce0(customizableMediaView.getContext().getApplicationContext(), n2Var);
    }

    public abstract void a(@Y61.k rd0 rd0Var);

    @Override // com.yandex.mobile.ads.impl.bj1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(@Y61.k final CustomizableMediaView customizableMediaView, @Y61.k rd0 rd0Var) {
        rj1.a(customizableMediaView, new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.mobile.ads.impl.V1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return vd0.a(this.f383329b, customizableMediaView);
            }
        });
    }

    @Y61.k
    public abstract int c();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(vd0 vd0Var, CustomizableMediaView customizableMediaView) {
        vd0Var.f390847b.a(customizableMediaView, ud0.a(vd0Var.c()));
        return false;
    }
}
