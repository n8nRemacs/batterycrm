package com.avito.android.messenger.channels.mvi.list_feature;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import sK0.C48063a;

/* compiled from: MessengerDockingBadgeConverter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/u1;", "Lcom/avito/android/messenger/channels/mvi/list_feature/t1;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u1 implements t1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f188225b;

    @Inject
    public u1(@Y61.k Context context) {
        this.f188225b = new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23);
    }

    @Override // com.avito.android.messenger.channels.mvi.list_feature.t1
    @Y61.k
    public final List<DockingBadgeItem> a(@Y61.k List<HY.b> list) {
        List<HY.b> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (HY.b bVar : list2) {
            androidx.appcompat.view.d dVar = this.f188225b;
            int iF2 = com.avito.android.lib.util.f.f(dVar, "greenSmall");
            String str = bVar.f7140d;
            Integer numValueOf = Integer.valueOf(R.color.black);
            C48063a c48063a = C48063a.f437606a;
            int iB2 = c48063a.b(dVar, str, numValueOf);
            DockingBadgeType.CustomColors customColors = new DockingBadgeType.CustomColors(iF2, Integer.valueOf(c48063a.b(dVar, bVar.f7141e, Integer.valueOf(R.color.gray8))), Integer.valueOf(iB2), null, null, 24, null);
            DockingBadgeEdgeType dockingBadgeEdgeType = DockingBadgeEdgeType.AntiPyramid;
            arrayList.add(new DockingBadgeItem(bVar.f7139c, customColors, DockingBadgeEdgeType.Square, dockingBadgeEdgeType, null, 16, null));
        }
        return arrayList;
    }
}
