package com.avito.android.beduin.common.component.top_toolbar;

import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import bi.C25654c;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.top_toolbar.BeduinTopToolbarModel;
import com.avito.android.beduin.common.component.top_toolbar.h;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
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

/* compiled from: BeduinTopToolbarComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/b;", "LWh/a;", "Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel;", "Lcom/avito/android/beduin/common/component/top_toolbar/h;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC15764a<BeduinTopToolbarModel, h> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinTopToolbarModel f102806f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final lj.e f102807g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102808h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25654c f102809i;

    /* compiled from: BeduinTopToolbarComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/b$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f102810a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f102811b = Collections.singletonList("topToolbar");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinTopToolbarModel> f102812c = BeduinTopToolbarModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinTopToolbarModel> S() {
            return f102812c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f102811b;
        }
    }

    public b(@k BeduinTopToolbarModel beduinTopToolbarModel, @k lj.e eVar, @k InterfaceC15523b interfaceC15523b, @k C25654c c25654c) {
        this.f102806f = beduinTopToolbarModel;
        this.f102807g = eVar;
        this.f102808h = interfaceC15523b;
        this.f102809i = c25654c;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102806f;
    }

    @Override // Wh.AbstractC15764a, ej.AbstractC40112a
    /* renamed from: k */
    public final boolean getF100735h() {
        return false;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinTopToolbarModel beduinTopToolbarModel = (BeduinTopToolbarModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        TopToolbarChange[] topToolbarChangeArrValues = TopToolbarChange.values();
        if (topToolbarChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, TopToolbarChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(topToolbarChangeArrValues));
        BeduinTopToolbarModel beduinTopToolbarModel2 = this.f102806f;
        if (!L.f(fVar.invoke(beduinTopToolbarModel2), fVar.invoke(beduinTopToolbarModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TopToolbarChange topToolbarChange : topToolbarChangeArrValues) {
            if (!L.f(topToolbarChange.b().invoke(beduinTopToolbarModel2), topToolbarChange.b().invoke(beduinTopToolbarModel))) {
                arrayList.add(topToolbarChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        h hVar = new h(viewGroup.getContext(), null, 0, 6, null);
        hVar.setId(R.id.beduin_top_toolbar);
        hVar.setLayoutParams(layoutParams);
        I.b(hVar);
        return hVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        h hVar = (h) view;
        BeduinTopToolbarModel beduinTopToolbarModel = this.f102806f;
        hVar.setTitle(beduinTopToolbarModel.getTitle());
        hVar.setMaxLines(beduinTopToolbarModel.getTitleNumberOfLines());
        hVar.g(beduinTopToolbarModel.getLocalStyle());
        final int i12 = 0;
        hVar.setRightIconClickedListener(new View.OnClickListener(this) { // from class: com.avito.android.beduin.common.component.top_toolbar.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f102805c;

            {
                this.f102805c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                List<BeduinAction> actions;
                List<BeduinAction> actions2;
                switch (i12) {
                    case 0:
                        b bVar = this.f102805c;
                        BeduinTopToolbarModel.CloseButton closeButton = bVar.f102806f.getCloseButton();
                        if (closeButton != null && (actions = closeButton.getActions()) != null) {
                            Iterator<T> it = actions.iterator();
                            while (it.hasNext()) {
                                bVar.f102808h.o((BeduinAction) it.next());
                            }
                            break;
                        }
                        break;
                    default:
                        b bVar2 = this.f102805c;
                        BeduinTopToolbarModel.CloseButton closeButton2 = bVar2.f102806f.getCloseButton();
                        if (closeButton2 != null && (actions2 = closeButton2.getActions()) != null) {
                            Iterator<T> it2 = actions2.iterator();
                            while (it2.hasNext()) {
                                bVar2.f102808h.o((BeduinAction) it2.next());
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        hVar.setLeftIconClickedListener(new View.OnClickListener(this) { // from class: com.avito.android.beduin.common.component.top_toolbar.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f102805c;

            {
                this.f102805c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                List<BeduinAction> actions;
                List<BeduinAction> actions2;
                switch (i13) {
                    case 0:
                        b bVar = this.f102805c;
                        BeduinTopToolbarModel.CloseButton closeButton = bVar.f102806f.getCloseButton();
                        if (closeButton != null && (actions = closeButton.getActions()) != null) {
                            Iterator<T> it = actions.iterator();
                            while (it.hasNext()) {
                                bVar.f102808h.o((BeduinAction) it.next());
                            }
                            break;
                        }
                        break;
                    default:
                        b bVar2 = this.f102805c;
                        BeduinTopToolbarModel.CloseButton closeButton2 = bVar2.f102806f.getCloseButton();
                        if (closeButton2 != null && (actions2 = closeButton2.getActions()) != null) {
                            Iterator<T> it2 = actions2.iterator();
                            while (it2.hasNext()) {
                                bVar2.f102808h.o((BeduinAction) it2.next());
                            }
                            break;
                        }
                        break;
                }
            }
        });
        y(hVar);
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        c cVar = new c((h) view, this);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(cVar, list);
    }

    @Override // Wh.AbstractC15764a
    @k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f102808h;
    }

    @Override // Wh.AbstractC15764a
    @k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f102809i;
    }

    @Override // Wh.AbstractC15764a
    @k
    /* renamed from: x, reason: from getter */
    public final lj.e getF102534g() {
        return this.f102807g;
    }

    public final void y(h hVar) {
        BeduinTopToolbarModel beduinTopToolbarModel = this.f102806f;
        ArrayList arrayList = null;
        if (!(beduinTopToolbarModel.getLocalStyle() instanceof h.a.c)) {
            hVar.setRightItems(null);
            return;
        }
        List<NavigationBarItem> rightItems = beduinTopToolbarModel.getRightItems();
        if (rightItems != null) {
            List<NavigationBarItem> list = rightItems;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(u(((NavigationBarItem) it.next()).toBeduinModel(null)));
            }
            arrayList = arrayList2;
        }
        hVar.setRightItems(arrayList);
    }
}
