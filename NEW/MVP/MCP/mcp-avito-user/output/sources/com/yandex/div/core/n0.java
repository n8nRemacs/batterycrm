package com.yandex.div.core;

import android.view.View;
import t21.InterfaceC48467b;

/* compiled from: DivViewFacade.java */
@InterfaceC48467b
/* loaded from: classes7.dex */
public interface n0 {
    void a(@j.F long j12, boolean z12);

    default void d(@j.N com.yandex.div.core.state.f fVar, boolean z12) {
        a(fVar.f367662a, z12);
    }

    @j.N
    default com.yandex.div.json.expressions.e getExpressionResolver() {
        return com.yandex.div.json.expressions.e.f370568a;
    }

    @j.N
    View getView();

    default void Cc(@j.N String str) {
    }

    default void b(@j.N String str) {
    }
}
