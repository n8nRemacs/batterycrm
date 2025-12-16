package com.avito.android.beduin.common.container.checkbox_group;

import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import bi.C25654c;
import com.avito.android.beduin.common.utils.C28805a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxGroupContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/a;", "LWh/a;", "Lcom/avito/android/beduin/common/container/checkbox_group/BeduinCheckboxGroupModel;", "Lcom/avito/android/beduin/common/container/checkbox_group/i;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC15764a<BeduinCheckboxGroupModel, i> {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final C3089a f102965j = new C3089a(null);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final List<String> f102966k = Collections.singletonList("checkboxGroup");

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinCheckboxGroupModel> f102967l = BeduinCheckboxGroupModel.class;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final BeduinCheckboxGroupModel f102968f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C25654c f102969g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final lj.e f102970h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102971i;

    /* compiled from: BeduinCheckboxGroupContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.container.checkbox_group.a$a, reason: collision with other inner class name */
    public static final class C3089a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3089a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinCheckboxGroupModel> S() {
            return a.f102967l;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return a.f102966k;
        }

        public C3089a() {
        }
    }

    public a(@Y61.k BeduinCheckboxGroupModel beduinCheckboxGroupModel, @Y61.k C25654c c25654c, @Y61.k lj.e eVar, @Y61.k InterfaceC15523b interfaceC15523b) {
        this.f102968f = beduinCheckboxGroupModel;
        this.f102969g = c25654c;
        this.f102970h = eVar;
        this.f102971i = interfaceC15523b;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102968f;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinCheckboxGroupModel beduinCheckboxGroupModel = (BeduinCheckboxGroupModel) beduinModel;
        h.f102983d.getClass();
        List<String> selectedIds = beduinCheckboxGroupModel.getSelectedIds();
        if (selectedIds == null) {
            selectedIds = C42784z0.f406748b;
        }
        BeduinCheckboxGroupModel beduinCheckboxGroupModel2 = this.f102968f;
        List<String> selectedIds2 = beduinCheckboxGroupModel2.getSelectedIds();
        if (selectedIds2 == null) {
            selectedIds2 = C42784z0.f406748b;
        }
        List list = (List) C28805a.a(selectedIds, selectedIds2);
        List<BeduinAction> onSelectedActions = beduinCheckboxGroupModel.getOnSelectedActions();
        if (onSelectedActions == null) {
            onSelectedActions = C42784z0.f406748b;
        }
        List<BeduinAction> onSelectedActions2 = beduinCheckboxGroupModel2.getOnSelectedActions();
        if (onSelectedActions2 == null) {
            onSelectedActions2 = C42784z0.f406748b;
        }
        h hVar = new h(list, (List) C28805a.a(onSelectedActions, onSelectedActions2));
        if (hVar.f102986c) {
            return null;
        }
        return hVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        i iVar = new i(new ContextThemeWrapper(viewGroup.getContext(), com.avito.android.beduin.common.component.a.a(this.f102968f.getTheme())), null, 0, 6, null);
        iVar.setId(View.generateViewId());
        iVar.setLayoutParams(layoutParams);
        return iVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        i iVar = (i) view;
        b bVar = new b(this);
        iVar.setCheckedListener(null);
        bVar.invoke(iVar);
        iVar.setCheckedListener(new d(this));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        List<BeduinAction> onSelectedActions;
        i iVar = (i) view;
        if (list.isEmpty()) {
            b bVar = new b(this);
            iVar.setCheckedListener(null);
            bVar.invoke(iVar);
            iVar.setCheckedListener(new d(this));
            return;
        }
        List list2 = list;
        Object obj = null;
        for (Object obj2 : list2) {
            if (obj2 instanceof h) {
                obj = obj2;
            }
        }
        if (!(obj instanceof h)) {
            obj = null;
        }
        h hVar = (h) obj;
        List<String> list3 = hVar != null ? hVar.f102984a : null;
        Object obj3 = null;
        for (Object obj4 : list2) {
            if (obj4 instanceof h) {
                obj3 = obj4;
            }
        }
        if (!(obj3 instanceof h)) {
            obj3 = null;
        }
        h hVar2 = (h) obj3;
        if (hVar2 == null || (onSelectedActions = hVar2.f102985b) == null) {
            onSelectedActions = this.f102968f.getOnSelectedActions();
        }
        c cVar = new c(list3, this, onSelectedActions);
        iVar.setCheckedListener(null);
        cVar.invoke(iVar);
        iVar.setCheckedListener(new d(this));
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f102971i;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f102969g;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final lj.e getF103099f() {
        return this.f102970h;
    }
}
