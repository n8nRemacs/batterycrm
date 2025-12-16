package com.avito.android.beduin.common.container.tabs;

import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.C25654c;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin.common.shared.tabs.BeduinTabCounter;
import com.avito.android.beduin.common.shared.tabs.BeduinTabStyle;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import com.avito.android.util.O2;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ki.C42696b;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTabContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/container/tabs/a;", "LWh/a;", "Lcom/avito/android/beduin/common/container/tabs/BeduinTabContainerModel;", "Lki/b;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC15764a<BeduinTabContainerModel, C42696b> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final lj.e f103218f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f103219g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final BeduinTabContainerModel f103220h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25654c f103221i;

    /* compiled from: BeduinTabContainer.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/tabs/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.container.tabs.a$a, reason: collision with other inner class name */
    public static final class C3097a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f103222a = Collections.singletonList("tabContainer");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f103223b = BeduinTabContainerModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f103223b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f103222a;
        }
    }

    public a(@k lj.e eVar, @k InterfaceC15523b interfaceC15523b, @k BeduinTabContainerModel beduinTabContainerModel, @k C25654c c25654c) {
        this.f103218f = eVar;
        this.f103219g = interfaceC15523b;
        this.f103220h = beduinTabContainerModel;
        this.f103221i = c25654c;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f103220h;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        C42696b c42696b = new C42696b(viewGroup.getContext());
        c42696b.setId(View.generateViewId());
        layoutParams.width = -1;
        layoutParams.height = -2;
        c42696b.setLayoutParams(layoutParams);
        I.b(c42696b);
        return c42696b;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        ViewGroup view2;
        C42696b c42696b = (C42696b) view;
        BeduinTabContainerModel beduinTabContainerModel = this.f103220h;
        c42696b.setTag(beduinTabContainerModel.getF100853b());
        I.c(c42696b, beduinTabContainerModel.getBackground(), O2.a(beduinTabContainerModel.getActions()));
        I.e(c42696b, beduinTabContainerModel.getPadding());
        J.b(c42696b, beduinTabContainerModel.getMargin());
        I.b(c42696b);
        Iterator<BeduinTabContainerChild> it = beduinTabContainerModel.getTabs().iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (L.f(it.next().getId(), beduinTabContainerModel.getSelectedTabId())) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = i12 < 0 ? 0 : i12;
        AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112aU = u(beduinTabContainerModel.getTabs().get(i13).getChild());
        InterfaceC40116e interfaceC40116eI = abstractC40112aU.i(c42696b, new FrameLayout.LayoutParams(c42696b.getLayoutParams().width, -2));
        abstractC40112aU.m(interfaceC40116eI);
        c42696b.setBoundTabContentType(abstractC40112aU.getClass());
        BeduinTabStyle style = beduinTabContainerModel.getStyle();
        if (style == null) {
            style = BeduinTabStyle.AVITO_TABS;
        }
        BeduinTabStyle beduinTabStyle = style;
        List<BeduinTabContainerChild> tabs = beduinTabContainerModel.getTabs();
        ArrayList arrayList = new ArrayList(C42745f0.q(tabs, 10));
        for (BeduinTabContainerChild beduinTabContainerChild : tabs) {
            String title = beduinTabContainerChild.getTitle();
            BeduinTabCounter counter = beduinTabContainerChild.getCounter();
            arrayList.add(new CommonTab(title, counter != null ? counter.getText() : null));
        }
        c42696b.a(beduinTabStyle, arrayList, i13, interfaceC40116eI.getF103243b(), new b(beduinTabContainerModel, this));
        com.avito.android.beduin.common.shared.tabs.d resolvedTabs = c42696b.getResolvedTabs();
        if (resolvedTabs != null && (view2 = resolvedTabs.getView()) != null) {
            J.b(view2, beduinTabContainerModel.getTabPaddings());
        }
        j.a(c42696b, beduinTabContainerModel.getActions(), this.f103219g);
    }

    @Override // Wh.AbstractC15764a
    @k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f103219g;
    }

    @Override // Wh.AbstractC15764a
    @k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f103221i;
    }

    @Override // Wh.AbstractC15764a
    @k
    /* renamed from: x, reason: from getter */
    public final lj.e getF102807g() {
        return this.f103218f;
    }
}
