package com.avito.android.beduin.common.component.docking_badge;

import Y61.k;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.deprecated_design.f;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinDockingBadgeComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/docking_badge/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/docking_badge/BeduinDockingBadgeModel;", "Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinDockingBadgeModel, DockingBadge> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinDockingBadgeModel f101109e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f101110f = true;

    public a(@k BeduinDockingBadgeModel beduinDockingBadgeModel) {
        this.f101109e = beduinDockingBadgeModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101109e;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF100735h() {
        return this.f101110f;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        DockingBadge dockingBadge = new DockingBadge(new ContextThemeWrapper(viewGroup.getContext(), f.b(R.style.Theme_DesignSystem_Re23, this.f101109e.getTheme())), (AttributeSet) null, 0, 0, 14, (C42822w) null);
        dockingBadge.setLayoutParams(layoutParams);
        return dockingBadge;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        DockingBadge dockingBadge = (DockingBadge) view;
        BeduinDockingBadgeModel beduinDockingBadgeModel = this.f101109e;
        dockingBadge.setText(beduinDockingBadgeModel.getText());
        DockingBadgeType dockingBadgeTypeA = e.a(dockingBadge.getContext(), beduinDockingBadgeModel.getCustomBadgeType(), beduinDockingBadgeModel.getBadgeType(), beduinDockingBadgeModel.getSize());
        DockingBadgeEdgeType startEdgeType = beduinDockingBadgeModel.getStartEdgeType();
        DockingBadgeEdgeType endEdgeType = beduinDockingBadgeModel.getEndEdgeType();
        DockingBadgeSize size = beduinDockingBadgeModel.getSize();
        if (size == null) {
            size = DockingBadgeSize.MEDIUM;
        }
        dockingBadge.d(dockingBadgeTypeA, size, startEdgeType, endEdgeType);
    }
}
