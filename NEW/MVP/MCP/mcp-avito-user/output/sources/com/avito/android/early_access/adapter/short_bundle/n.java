package com.avito.android.early_access.adapter.short_bundle;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: EarlyAccessShortBundle.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_early-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n {
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.early_access.adapter.short_bundle.EarlyAccessShortBundleItem r35, @Y61.k Y41.a r36, @Y61.l androidx.compose.ui.v r37, @Y61.l androidx.compose.runtime.A r38, int r39) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.early_access.adapter.short_bundle.n.a(com.avito.android.early_access.adapter.short_bundle.EarlyAccessShortBundleItem, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @SuppressLint({"ConfigurationScreenWidthHeight"})
    @InterfaceC22181t
    public static final void b(int i12, @Y61.k Y41.l lVar, @Y61.l A a12, @Y61.l v vVar, @Y61.k List list) {
        float fH2;
        B bE2 = a12.E(-372016264);
        bE2.C(-1498388404);
        if (list.size() == 2) {
            fH2 = s.h(new kotlin.ranges.l(125, 250, 1), (((Configuration) bE2.o(AndroidCompositionLocals_androidKt.f41068a)).screenWidthDp - 40) / 2);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
        } else {
            fH2 = 168;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        }
        bE2.X(false);
        C20585k.f28659a.getClass();
        C20650b.c(vVar, null, null, false, C20585k.f28664f, null, null, false, null, new j(list, fH2, lVar), bE2, ((i12 >> 6) & 14) | 24576, 494);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(i12, lVar, vVar, list);
        }
    }
}
