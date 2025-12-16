package com.avito.android.screens.bbip_private_v2.ui.compose.items;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateV2Tabs.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k BbipPrivateV2State.SegmentsBlock segmentsBlock, @Y61.l androidx.compose.ui.v vVar, @Y61.l Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(953161123);
        int i13 = (bE2.B(segmentsBlock) ? 4 : 2) | i12 | (bE2.u(lVar) ? 256 : 128);
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            List<BbipPrivateV2State.SegmentsBlock.Segment> list = segmentsBlock.f261032a;
            if (list.isEmpty()) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new x(segmentsBlock, vVar, lVar, i12);
                    return;
                }
                return;
            }
            List<BbipPrivateV2State.SegmentsBlock.Segment> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BbipPrivateV2State.SegmentsBlock.Segment) it.next()).f261034a);
            }
            com.avito.android.mnz_common.compose.B.a(arrayList, lVar, Integer.valueOf(segmentsBlock.f261033b), vVar, bE2, ((i13 >> 3) & 112) | 3080);
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new y(segmentsBlock, vVar, lVar, i12);
        }
    }
}
