package com.yandex.div.internal.widget.tabs;

import j.K;
import j.N;

/* compiled from: DynamicCardHeightCalculator.java */
@K
/* loaded from: classes7.dex */
public class k extends b {
    @Override // com.yandex.div.internal.widget.tabs.b, com.yandex.div.internal.widget.tabs.A.a
    public final int a(int i12, int i13) {
        b();
        return super.a(i12, i13);
    }

    @Override // com.yandex.div.internal.widget.tabs.A.a
    public final boolean c(float f12, int i12) {
        return true;
    }

    @Override // com.yandex.div.internal.widget.tabs.b
    public final int e(@N r rVar, int i12, float f12) {
        if (f12 < 0.01f) {
            return rVar.c(i12);
        }
        return Math.round(((rVar.c(i12 + 1) - r0) * f12) + rVar.c(i12));
    }
}
