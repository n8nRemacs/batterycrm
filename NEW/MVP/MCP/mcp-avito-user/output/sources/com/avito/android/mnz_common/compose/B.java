package com.avito.android.mnz_common.compose;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MnzSegmentedControl.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k List list, @Y61.k Y41.l lVar, @Y61.l Integer num, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1984570789);
        if (list.isEmpty()) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new v(list, lVar, num, vVar, i12);
                return;
            }
            return;
        }
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.p pVar = com.akita.compose.theme.re23.b.f63984b.f63973w1;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.n.a(C22501m2.a(androidx.compose.ui.draw.k.a(vVar, androidx.compose.foundation.shape.o.a(16)), "MNZ_SEGMENTED_CONTROL_CONTAINER_TEST_TAG"), null, 0.0f, pVar, null, androidx.compose.runtime.internal.r.c(282311831, new z(list, lVar, num), bE2), bE2, 1572864, 54);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new A(list, lVar, num, vVar, i12);
        }
    }
}
