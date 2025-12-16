package com.avito.android.beduin.common.component.selector_card_group;

import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import bi.C25654c;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectorCardGroupComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/a;", "LWh/a;", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel;", "Lcom/avito/android/beduin/common/component/selector_card_group/n;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC15764a<BeduinSelectorCardGroupModel, n> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final C3071a f102530k = new C3071a(null);

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final List<String> f102531l = Collections.singletonList("selectorCardGroup");

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinSelectorCardGroupModel> f102532m = BeduinSelectorCardGroupModel.class;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final BeduinSelectorCardGroupModel f102533f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final lj.e f102534g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102535h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25654c f102536i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final HashSet<String> f102537j;

    /* compiled from: BeduinSelectorCardGroupComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.selector_card_group.a$a, reason: collision with other inner class name */
    public static final class C3071a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3071a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinSelectorCardGroupModel> S() {
            return a.f102532m;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return a.f102531l;
        }

        public C3071a() {
        }
    }

    public a(@Y61.k BeduinSelectorCardGroupModel beduinSelectorCardGroupModel, @Y61.k lj.e eVar, @Y61.k InterfaceC15523b interfaceC15523b, @Y61.k C25654c c25654c) {
        this.f102533f = beduinSelectorCardGroupModel;
        this.f102534g = eVar;
        this.f102535h = interfaceC15523b;
        this.f102536i = c25654c;
        this.f102537j = C42745f0.K0(beduinSelectorCardGroupModel.h());
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102533f;
    }

    @Override // Wh.AbstractC15764a, ej.AbstractC40112a
    /* renamed from: k */
    public final boolean getF102739h() {
        return false;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinSelectorCardGroupModel beduinSelectorCardGroupModel = (BeduinSelectorCardGroupModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        BeduinSelectorCardGroupChange[] beduinSelectorCardGroupChangeArrValues = BeduinSelectorCardGroupChange.values();
        if (beduinSelectorCardGroupChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, BeduinSelectorCardGroupChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(beduinSelectorCardGroupChangeArrValues));
        BeduinSelectorCardGroupModel beduinSelectorCardGroupModel2 = this.f102533f;
        if (!L.f(fVar.invoke(beduinSelectorCardGroupModel2), fVar.invoke(beduinSelectorCardGroupModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BeduinSelectorCardGroupChange beduinSelectorCardGroupChange : beduinSelectorCardGroupChangeArrValues) {
            if (!L.f(beduinSelectorCardGroupChange.b().invoke(beduinSelectorCardGroupModel2), beduinSelectorCardGroupChange.b().invoke(beduinSelectorCardGroupModel))) {
                arrayList.add(beduinSelectorCardGroupChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        BeduinComponentTheme theme = this.f102533f.getTheme();
        n nVar = new n(new ContextThemeWrapper(viewGroup.getContext(), theme != null ? theme.f100608b : BeduinComponentTheme.AVITO_LOOK_AND_FEEL.f100608b), null, 0, 6, null);
        nVar.setId(R.id.beduin_selector_card_group);
        nVar.setOrientation(1);
        nVar.setLayoutParams(layoutParams);
        return nVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        n nVar = (n) view;
        c cVar = new c(this, nVar);
        nVar.setOnSelectChangeListener(null);
        cVar.invoke(nVar);
        nVar.setOnSelectChangeListener(new g(this));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        f fVar = new f(this, (n) view);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(fVar, list);
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f102535h;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f102536i;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final lj.e getF102970h() {
        return this.f102534g;
    }
}
