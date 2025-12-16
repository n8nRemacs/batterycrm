package com.avito.android.beduin.ui.screen.fragment.tabs;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.R;
import com.avito.android.beduin.common.shared.tabs.BeduinTabStyle;
import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wi.C49628d;

/* compiled from: TabsScreenFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TabsScreenFragment f104341l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TabsScreenModel f104342m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TabsScreenFragment tabsScreenFragment, TabsScreenModel tabsScreenModel) {
        super(0);
        this.f104341l = tabsScreenFragment;
        this.f104342m = tabsScreenModel;
    }

    @Override // Y41.a
    public final G0 invoke() {
        TabsScreenModel tabsScreenModel = this.f104342m;
        TabsScreenModel.d tabsSettings = tabsScreenModel.getTabsSettings();
        TabsScreenFragment.a aVar = TabsScreenFragment.f104306N0;
        TabsScreenFragment tabsScreenFragment = this.f104341l;
        tabsScreenFragment.getClass();
        C49628d c49628d = tabsSettings instanceof C49628d ? (C49628d) tabsSettings : null;
        BeduinTabStyle beduinTabStyleA = c49628d != null ? c49628d.a() : null;
        BeduinTabStyle beduinTabStyle = BeduinTabStyle.AVITO_BLACK;
        if (beduinTabStyleA == beduinTabStyle) {
            MaterialToolbar materialToolbarY5 = tabsScreenFragment.y5();
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(materialToolbarY5.getContext(), R.style.Theme_DesignSystem_Re23);
            int iJ2 = C35835l0.j(R.attr.textXl10, dVar);
            materialToolbarY5.f22400m = iJ2;
            AppCompatTextView appCompatTextView = materialToolbarY5.f22390c;
            if (appCompatTextView != null) {
                appCompatTextView.setTextAppearance(dVar, iJ2);
            }
        } else {
            MaterialToolbar materialToolbarY52 = tabsScreenFragment.y5();
            Context context = materialToolbarY52.getContext();
            int iJ3 = C35835l0.j(R.attr.textH5, context);
            materialToolbarY52.f22400m = iJ3;
            AppCompatTextView appCompatTextView2 = materialToolbarY52.f22390c;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(context, iJ3);
            }
        }
        TabsScreenModel.d tabsSettings2 = tabsScreenModel.getTabsSettings();
        C49628d c49628d2 = tabsSettings2 instanceof C49628d ? (C49628d) tabsSettings2 : null;
        boolean z12 = (c49628d2 != null ? c49628d2.a() : null) == beduinTabStyle;
        tabsScreenFragment.x5().setBackgroundColor(C35835l0.d(z12 ? R.attr.constantBlack : R.attr.transparentWhite, tabsScreenFragment.requireContext()));
        int iB2 = z12 ? y6.b(16) : 0;
        FrameLayout frameLayoutX5 = tabsScreenFragment.x5();
        frameLayoutX5.setPadding(iB2, frameLayoutX5.getPaddingTop(), iB2, frameLayoutX5.getPaddingBottom());
        return G0.f406611a;
    }
}
