package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.div.core.h0;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.C38584w0;

/* loaded from: classes8.dex */
public final class lq implements com.yandex.div.core.U {
    @Override // com.yandex.div.core.U
    @j.N
    public final View createView(@j.N C38584w0 c38584w0, @j.N C38029k c38029k) {
        return new rw0(c38029k.getContext());
    }

    @Override // com.yandex.div.core.U
    public final boolean isCustomTypeSupported(@j.N String str) {
        return "rating".equals(str);
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
