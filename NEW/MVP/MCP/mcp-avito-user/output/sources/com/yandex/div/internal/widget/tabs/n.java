package com.yandex.div.internal.widget.tabs;

import android.util.SparseArray;
import j.K;
import j.N;

/* compiled from: MaxCardHeightCalculator.java */
@K
/* loaded from: classes7.dex */
public class n extends b {
    @Override // com.yandex.div.internal.widget.tabs.A.a
    public final boolean c(float f12, int i12) {
        SparseArray<r> sparseArray = this.f370455c;
        if (sparseArray.size() == 0) {
            return true;
        }
        if (i12 == 0 || (i12 == 1 && f12 <= 0.0f)) {
            sparseArray.size();
            r rVarValueAt = sparseArray.valueAt(sparseArray.size() - 1);
            if (rVarValueAt.a() != rVarValueAt.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.internal.widget.tabs.b
    public final int e(@N r rVar, int i12, float f12) {
        if (i12 > 0) {
            return rVar.b();
        }
        if (f12 < 0.01f) {
            return rVar.a();
        }
        return Math.round(((rVar.b() - r3) * f12) + rVar.a());
    }
}
