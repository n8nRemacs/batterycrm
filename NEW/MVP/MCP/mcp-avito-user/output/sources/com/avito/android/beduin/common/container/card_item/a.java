package com.avito.android.beduin.common.container.card_item;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.model.BeduinLayoutParams;
import com.avito.android.beduin.common.component.model.BeduinLayoutSize;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCardItemContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/a;", "Lej/a;", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel;", "Lcom/avito/android/beduin/common/container/card_item/j;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinCardItemContainerModel, j> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C3088a f102946h = new C3088a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final List<String> f102947i = Collections.singletonList("cardItem");

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final Class<BeduinCardItemContainerModel> f102948j = BeduinCardItemContainerModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Wh.c f102949e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102950f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BeduinCardItemContainerModel f102951g;

    /* compiled from: BeduinCardItemContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.container.card_item.a$a, reason: collision with other inner class name */
    public static final class C3088a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3088a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinCardItemContainerModel> S() {
            return a.f102948j;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f102947i;
        }

        public C3088a() {
        }
    }

    public a(@k Wh.c cVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinCardItemContainerModel beduinCardItemContainerModel) {
        this.f102949e = cVar;
        this.f102950f = interfaceC15523b;
        this.f102951g = beduinCardItemContainerModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102951g;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        h hVar = new h(viewGroup.getContext(), null, 0, 6, null);
        hVar.setId(R.id.beduin_card_item);
        hVar.setLayoutParams(layoutParams);
        I.b(hVar);
        return new j(hVar, this.f102949e);
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinCardItemContainerModel beduinCardItemContainerModel = (BeduinCardItemContainerModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        BeduinCardItemContainerChange[] beduinCardItemContainerChangeArrValues = BeduinCardItemContainerChange.values();
        if (beduinCardItemContainerChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, BeduinCardItemContainerChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(beduinCardItemContainerChangeArrValues));
        BeduinCardItemContainerModel beduinCardItemContainerModel2 = this.f102951g;
        if (!L.f(fVar.invoke(beduinCardItemContainerModel2), fVar.invoke(beduinCardItemContainerModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BeduinCardItemContainerChange beduinCardItemContainerChange : beduinCardItemContainerChangeArrValues) {
            if (!L.f(beduinCardItemContainerChange.b().invoke(beduinCardItemContainerModel2), beduinCardItemContainerChange.b().invoke(beduinCardItemContainerModel))) {
                arrayList.add(beduinCardItemContainerChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        j jVar = (j) interfaceC40116e;
        BeduinCardItemContainerModel beduinCardItemContainerModel = this.f102951g;
        String id2 = beduinCardItemContainerModel.getId();
        h hVar = jVar.f102961b;
        hVar.setTag(id2);
        BeduinLayoutParams layoutParams = beduinCardItemContainerModel.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new BeduinLayoutParams(BeduinLayoutSize.MatchParent.INSTANCE, BeduinLayoutSize.WrapContent.INSTANCE, null, null, null, null, 60, null);
        }
        I.d(hVar, layoutParams, hVar.getLayoutParams());
        BeduinLayoutParams layoutParams2 = beduinCardItemContainerModel.getLayoutParams();
        J.b(hVar, layoutParams2 != null ? layoutParams2.getMargin() : null);
        BeduinLayoutParams layoutParams3 = beduinCardItemContainerModel.getLayoutParams();
        I.e(hVar, layoutParams3 != null ? layoutParams3.getPadding() : null);
        hVar.setSelected(beduinCardItemContainerModel.f102942b);
        hVar.setCardItemBackground(beduinCardItemContainerModel);
        com.avito.android.beduin.common.container.componentsPool.e.c(jVar.f102962c, Collections.singletonList(beduinCardItemContainerModel.getChild()), new b(this), null, 12);
        jVar.f102961b.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(25, beduinCardItemContainerModel, this));
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        c cVar = new c(this, (j) interfaceC40116e);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(cVar, list);
    }
}
