package com.avito.android.beduin.common.component.docking_badge_bar;

import Y61.k;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.docking_badge.e;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.deprecated_design.f;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinDockingBadgeBarComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/docking_badge_bar/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/docking_badge_bar/BeduinDockingBadgeBarModel;", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeContainer;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinDockingBadgeBarModel, DockingBadgeContainer> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinDockingBadgeBarModel f101114e;

    public a(@k BeduinDockingBadgeBarModel beduinDockingBadgeBarModel) {
        this.f101114e = beduinDockingBadgeBarModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101114e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        DockingBadgeContainer dockingBadgeContainer = new DockingBadgeContainer(new ContextThemeWrapper(viewGroup.getContext(), f.b(R.style.Theme_DesignSystem_Re23, this.f101114e.getTheme())), null, 0, 0, 14, null);
        dockingBadgeContainer.setLayoutParams(layoutParams);
        return dockingBadgeContainer;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        DockingBadgeContainer dockingBadgeContainer = (DockingBadgeContainer) view;
        BeduinDockingBadgeBarModel beduinDockingBadgeBarModel = this.f101114e;
        DockingBadgeSize size = beduinDockingBadgeBarModel.getSize();
        if (size == null) {
            size = DockingBadgeSize.MEDIUM;
        }
        dockingBadgeContainer.setSize(size);
        List<DockingBadge> badges = beduinDockingBadgeBarModel.getBadges();
        ArrayList arrayList = new ArrayList(C42745f0.q(badges, 10));
        for (DockingBadge dockingBadge : badges) {
            arrayList.add(new DockingBadgeItem(dockingBadge.getText(), e.a(dockingBadgeContainer.getContext(), dockingBadge.getCustomBadgeType(), dockingBadge.getBadgeType(), size), dockingBadge.getStartEdgeType(), dockingBadge.getEndEdgeType(), null, 16, null));
        }
        dockingBadgeContainer.setBadgeItems(arrayList);
    }
}
