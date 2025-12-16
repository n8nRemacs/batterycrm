package com.avito.android.beduin.common.component.tabber;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.tabber.TabberChange;
import com.avito.android.beduin.common.component.tabber.g;
import com.avito.android.beduin.common.shared.tabs.BeduinTabCounter;
import com.avito.android.beduin.common.shared.tabs.BeduinTabStyle;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTabberComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/tabber/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/tabber/BeduinTabberModel;", "Lcom/avito/android/beduin/common/component/tabber/g;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinTabberModel, g> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102756e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinTabberModel f102757f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final lj.e f102758g;

    /* compiled from: BeduinTabberComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/tabber/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.tabber.a$a, reason: collision with other inner class name */
    public static final class C3080a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f102759a = Collections.singletonList("tabber");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f102760b = BeduinTabberModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f102760b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f102759a;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinTabberModel beduinTabberModel, @k lj.e eVar) {
        this.f102756e = interfaceC15523b;
        this.f102757f = beduinTabberModel;
        this.f102758g = eVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102757f;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinTabberModel beduinTabberModel = (BeduinTabberModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        TabberChange[] tabberChangeArrValues = TabberChange.values();
        if (tabberChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, TabberChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(tabberChangeArrValues));
        BeduinTabberModel beduinTabberModel2 = this.f102757f;
        if (!L.f(fVar.invoke(beduinTabberModel2), fVar.invoke(beduinTabberModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TabberChange tabberChange : tabberChangeArrValues) {
            ((TabberChange.a) tabberChange.f102754b).getClass();
            String selectedTabId = beduinTabberModel2.getSelectedTabId();
            ((TabberChange.a) tabberChange.f102754b).getClass();
            if (!L.f(selectedTabId, beduinTabberModel.getSelectedTabId())) {
                arrayList.add(tabberChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        g gVar = new g(viewGroup.getContext());
        gVar.setId(View.generateViewId());
        layoutParams.width = -1;
        layoutParams.height = -2;
        gVar.setLayoutParams(layoutParams);
        I.b(gVar);
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        ViewGroup view2;
        ViewGroup view3;
        Object[] objArr;
        Object[] objArr2;
        g gVar = (g) view;
        BeduinTabberModel beduinTabberModel = this.f102757f;
        gVar.setTag(beduinTabberModel.getF100853b());
        BeduinTabStyle style = beduinTabberModel.getStyle();
        if (style == null) {
            style = BeduinTabStyle.AVITO_TABS;
        }
        List<BeduinTabberChild> tabs = beduinTabberModel.getTabs();
        ArrayList arrayList = new ArrayList(C42745f0.q(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (true) {
            String text = null;
            objArr2 = 0;
            objArr = 0;
            if (!it.hasNext()) {
                break;
            }
            BeduinTabberChild beduinTabberChild = (BeduinTabberChild) it.next();
            String title = beduinTabberChild.getTitle();
            BeduinTabCounter counter = beduinTabberChild.getCounter();
            if (counter != null) {
                text = counter.getText();
            }
            arrayList.add(new CommonTab(title, text));
        }
        int selectedTabIndex = beduinTabberModel.getSelectedTabIndex();
        b bVar = new b(beduinTabberModel, this);
        com.avito.android.beduin.common.shared.tabs.c cVar = gVar.f102768c;
        if (cVar != null) {
            cVar.f103473b = null;
        }
        com.avito.android.beduin.common.shared.tabs.a aVar = gVar.f102769d;
        if (aVar != null) {
            aVar.f103467c = null;
        }
        if (gVar.f102767b != style) {
            gVar.f102767b = style;
            int i12 = g.a.f102770a[style.ordinal()];
            int i13 = 2;
            if (i12 == 1) {
                gVar.f102768c = new com.avito.android.beduin.common.shared.tabs.c(gVar.getContext(), objArr == true ? 1 : 0, i13, objArr2 == true ? 1 : 0);
            } else if (i12 != 2) {
                gVar.f102769d = new com.avito.android.beduin.common.shared.tabs.a(gVar.getContext(), style);
            } else {
                gVar.f102768c = new com.avito.android.beduin.common.shared.tabs.c(gVar.getContext(), Integer.valueOf(R.layout.tab_non_transparent));
            }
            gVar.removeAllViews();
            com.avito.android.beduin.common.shared.tabs.d resolvedTabs = gVar.getResolvedTabs();
            if (resolvedTabs != null && (view3 = resolvedTabs.getView()) != null) {
                gVar.addView(view3);
            }
        }
        com.avito.android.beduin.common.shared.tabs.d resolvedTabs2 = gVar.getResolvedTabs();
        if (resolvedTabs2 != null) {
            resolvedTabs2.mc(arrayList);
        }
        com.avito.android.beduin.common.shared.tabs.d resolvedTabs3 = gVar.getResolvedTabs();
        if (resolvedTabs3 != null) {
            resolvedTabs3.Qa(selectedTabIndex);
        }
        com.avito.android.beduin.common.shared.tabs.d resolvedTabs4 = gVar.getResolvedTabs();
        if (resolvedTabs4 != null) {
            resolvedTabs4.nc(bVar);
        }
        com.avito.android.beduin.common.shared.tabs.d resolvedTabs5 = gVar.getResolvedTabs();
        if (resolvedTabs5 == null || (view2 = resolvedTabs5.getView()) == null) {
            return;
        }
        J.b(view2, beduinTabberModel.getTabPaddings());
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        c cVar = new c((g) view, this);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(cVar, list);
    }
}
