package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.div.core.h0;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.C38584w0;

/* loaded from: classes8.dex */
public final class iq implements com.yandex.div.core.U {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.div.core.U[] f386668a;

    public iq(@j.N com.yandex.div.core.U... uArr) {
        this.f386668a = uArr;
    }

    @Override // com.yandex.div.core.U
    @j.N
    public View createView(@j.N C38584w0 c38584w0, @j.N C38029k c38029k) {
        String str = c38584w0.f376856i;
        for (com.yandex.div.core.U u12 : this.f386668a) {
            if (u12.isCustomTypeSupported(str)) {
                return u12.createView(c38584w0, c38029k);
            }
        }
        return new View(c38029k.getContext());
    }

    @Override // com.yandex.div.core.U
    public boolean isCustomTypeSupported(@j.N String str) {
        for (com.yandex.div.core.U u12 : this.f386668a) {
            if (u12.isCustomTypeSupported(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.core.U
    @Y61.k
    public /* bridge */ /* synthetic */ h0.d preload(@Y61.k C38584w0 c38584w0, @Y61.k h0.a aVar) {
        return super.preload(c38584w0, aVar);
    }

    @Override // com.yandex.div.core.U
    public final void release(@j.N View view, @j.N C38584w0 c38584w0) {
    }

    @Override // com.yandex.div.core.U
    public final void bindView(@j.N View view, @j.N C38584w0 c38584w0, @j.N C38029k c38029k) {
    }
}
