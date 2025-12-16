package com.akita.compose.component.slider;

import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements Y41.q<q, A, Integer, G0> {
    @Override // Y41.q
    public final G0 invoke(q qVar, A a12, Integer num) {
        q qVar2 = qVar;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(qVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) != 18 || !a13.c()) {
            throw null;
        }
        a13.f();
        return G0.f406611a;
    }
}
