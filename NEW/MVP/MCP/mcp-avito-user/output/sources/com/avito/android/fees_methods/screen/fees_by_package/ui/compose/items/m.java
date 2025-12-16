package com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import com.avito.android.mnz_common.compose.D;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FeesByPackageFooter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_fees-methods_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l FeesByPackageState.Button button, @Y61.l AttributedText attributedText, @Y61.k Y41.l lVar, boolean z12, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1097301546);
        v.a aVar = v.f42878y1;
        if (button == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new g(button, attributedText, lVar, z12, aVar, i12);
                return;
            }
            return;
        }
        float f12 = 10;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        D.a(R1.d(f12, f12, f12, 16), aVar, 0, androidx.compose.runtime.internal.r.c(-1310350068, new k(button, attributedText, lVar, z12), bE2), bE2, 3072, 4);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new l(button, attributedText, lVar, z12, aVar, i12);
        }
    }
}
