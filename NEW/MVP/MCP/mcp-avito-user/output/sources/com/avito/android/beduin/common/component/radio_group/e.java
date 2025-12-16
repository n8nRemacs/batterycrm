package com.avito.android.beduin.common.component.radio_group;

import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import android.view.View;
import android.view.ViewGroup;
import bi.C25654c;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.util.D6;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRadioGroupComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/e;", "LWh/a;", "Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupModel;", "Lcom/avito/android/lib/design/radio/RadioGroup;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends AbstractC15764a<BeduinRadioGroupModel, RadioGroup> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C25654c f102201f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final lj.e f102202g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102203h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final BeduinRadioGroupModel f102204i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f102205j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f102206k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f102207l = true;

    public e(@Y61.k C25654c c25654c, @Y61.k lj.e eVar, @Y61.k InterfaceC15523b interfaceC15523b, @Y61.k BeduinRadioGroupModel beduinRadioGroupModel, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f102201f = c25654c;
        this.f102202g = eVar;
        this.f102203h = interfaceC15523b;
        this.f102204i = beduinRadioGroupModel;
        this.f102205j = aVar;
        this.f102206k = aVar2;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102204i;
    }

    @Override // Wh.AbstractC15764a, ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102125j() {
        return this.f102207l;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinRadioGroupModel beduinRadioGroupModel = (BeduinRadioGroupModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        BeduinRadioGroupChange[] beduinRadioGroupChangeArrValues = BeduinRadioGroupChange.values();
        if (beduinRadioGroupChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, BeduinRadioGroupChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(beduinRadioGroupChangeArrValues));
        BeduinRadioGroupModel beduinRadioGroupModel2 = this.f102204i;
        if (!L.f(fVar.invoke(beduinRadioGroupModel2), fVar.invoke(beduinRadioGroupModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BeduinRadioGroupChange beduinRadioGroupChange : beduinRadioGroupChangeArrValues) {
            if (!L.f(beduinRadioGroupChange.b().invoke(beduinRadioGroupModel2), beduinRadioGroupChange.b().invoke(beduinRadioGroupModel))) {
                arrayList.add(beduinRadioGroupChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        RadioGroup radioGroup = new RadioGroup(viewGroup.getContext(), null, 2, 0 == true ? 1 : 0);
        radioGroup.setId(View.generateViewId());
        radioGroup.setLayoutParams(layoutParams);
        D6.f(radioGroup, this.f395324b, 0, this.f395325c, 0, 10);
        return radioGroup;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        RadioGroup radioGroup = (RadioGroup) view;
        a aVar = new a(this, radioGroup);
        radioGroup.setDeprecatedOnCheckedChangeListener(null);
        aVar.invoke(radioGroup);
        radioGroup.setDeprecatedOnCheckedChangeListener(new Ae0.c(this, 29));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        d dVar = new d(this, (RadioGroup) view);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(dVar, list);
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f102203h;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f102201f;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final lj.e getF103099f() {
        return this.f102202g;
    }
}
