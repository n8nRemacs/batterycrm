package com.akita.compose.component.modal;

import com.akita.compose.foundation.modifier.e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Modal.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class s extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            e.a aVar = com.akita.compose.foundation.modifier.e.f63615e;
            B.g(null, null, null, a13, 72);
        }
        return G0.f406611a;
    }
}
