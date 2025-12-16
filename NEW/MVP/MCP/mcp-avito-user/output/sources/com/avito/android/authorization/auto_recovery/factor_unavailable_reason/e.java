package com.avito.android.authorization.auto_recovery.factor_unavailable_reason;

import SM.a;
import Y41.p;
import android.view.View;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonFragment;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonAction;
import com.avito.android.authorization.gorelkin.ParsingAllowance;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.beduin.common.component.radio_group.BeduinRadioGroupModel;
import com.avito.android.beduin.common.component.radio_group.Option;
import com.avito.android.beduin.common.form.transforms.SelectedIdTransform;
import com.avito.android.beduin.common.form.transforms.ShowErrorMessageTransform;
import com.avito.android.beduin.common.utils.C28806b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.blueprints.publish.delivery_toggles.DeliveryToggleType;
import com.avito.android.important_addresses_selection.presentation.items.address.ImportantAddressesSelectionAddressItem;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.lib.design.toggle.Toggle;
import com.avito.android.publish.iac_devices.IacDevice;
import com.avito.android.sx_address.list.domain.Filter;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class e implements ListItemCompoundButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f93113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f93114c;

    public /* synthetic */ e(int i12, Object obj, Object obj2) {
        this.f93112a = i12;
        this.f93113b = obj;
        this.f93114c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
    public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
        List<BeduinAction> onSelectActions;
        Object obj = this.f93114c;
        Object obj2 = this.f93113b;
        switch (this.f93112a) {
            case 0:
                FactorUnavailableReasonFragment.a aVar = FactorUnavailableReasonFragment.f93079y0;
                if (z12) {
                    ((FactorUnavailableReasonFragment) obj2).q5((FactorUnavailableReasonAction.Select) obj);
                    break;
                }
                break;
            case 1:
                if (z12) {
                    com.avito.android.authorization.gorelkin.m mVar = ((ParsingPermissionFragment) obj2).f93872n0;
                    (mVar != null ? mVar : null).I3((ParsingAllowance) obj);
                    break;
                } else {
                    ParsingPermissionFragment.a aVar2 = ParsingPermissionFragment.f93867D0;
                    break;
                }
            case 2:
                int i12 = com.avito.android.beduin.common.component.radio_group.j.f102217n;
                String string = ((ListItemRadio) obj2).getTag().toString();
                com.avito.android.beduin.common.component.radio_group.j jVar = (com.avito.android.beduin.common.component.radio_group.j) obj;
                BeduinRadioGroupModel beduinRadioGroupModel = jVar.f102221i;
                Option optionFindOptionById = beduinRadioGroupModel.findOptionById(string);
                if (optionFindOptionById != null && (onSelectActions = optionFindOptionById.getOnSelectActions()) != null) {
                    C28806b.a(jVar.f102220h, onSelectActions);
                }
                com.avito.android.beduin_shared.model.utils.j.a(jVar.f102219g, beduinRadioGroupModel.getF100853b(), new SelectedIdTransform(string), new ShowErrorMessageTransform(false));
                break;
            case 3:
                int i13 = com.avito.android.blueprints.publish.delivery_toggles.d.f106184o;
                ((p) obj2).invoke((DeliveryToggleType) obj, Boolean.valueOf(z12));
                break;
            case 4:
                int i14 = com.avito.android.important_addresses_selection.presentation.items.address.f.f169852d;
                ((com.avito.android.important_addresses_selection.presentation.items.address.f) obj2).f169853b.invoke(new a.b(((ImportantAddressesSelectionAddressItem) obj).f169840c, z12));
                break;
            case 5:
                com.avito.android.publish.iac_devices.h hVar = (com.avito.android.publish.iac_devices.h) obj2;
                ArrayList arrayList = hVar.f236041F;
                boolean zV2 = com.avito.android.publish.iac_devices.h.V(arrayList);
                ((IacDevice) obj).f236032e = z12;
                int iW2 = com.avito.android.publish.iac_devices.h.W(arrayList);
                hVar.Y(iW2);
                Object[] objArr = iW2 > 0;
                if (hVar.f236042G) {
                    if (objArr == true) {
                        if (!zV2) {
                            Toggle.f181152k.getClass();
                            hVar.X(Toggle.f181153l);
                            hVar.Z(false);
                            break;
                        }
                    } else {
                        Toggle.f181152k.getClass();
                        hVar.X(Toggle.f181154m);
                        hVar.Z(true);
                        break;
                    }
                }
                break;
            case 6:
                com.avito.android.publish.iac_devices.j jVar2 = (com.avito.android.publish.iac_devices.j) obj2;
                ArrayList arrayList2 = jVar2.f236050F;
                boolean zV3 = com.avito.android.publish.iac_devices.j.V(arrayList2);
                ((IacDevice) obj).f236032e = z12;
                int iW3 = com.avito.android.publish.iac_devices.j.W(arrayList2);
                jVar2.Y(iW3);
                Object[] objArr2 = iW3 > 0;
                if (jVar2.f236051G) {
                    if (objArr2 == true) {
                        if (!zV3) {
                            Toggle.f181152k.getClass();
                            jVar2.X(Toggle.f181153l);
                            View view = jVar2.f236053I;
                            D6.G(view != null ? view : null, false);
                            break;
                        }
                    } else {
                        Toggle.f181152k.getClass();
                        jVar2.X(Toggle.f181154m);
                        View view2 = jVar2.f236053I;
                        D6.G(view2 != null ? view2 : null, true);
                        break;
                    }
                }
                break;
            case 7:
                if (z12) {
                    com.avito.android.sx_address.list.view.a aVar3 = (com.avito.android.sx_address.list.view.a) obj2;
                    aVar3.f293409H = (Filter) obj;
                    for (Map.Entry entry : aVar3.f293410I.entrySet()) {
                        String str = (String) entry.getKey();
                        ListItemRadio listItemRadio = (ListItemRadio) entry.getValue();
                        listItemRadio.setChecked(L.f(str, aVar3.f293409H.name()));
                        listItemRadio.invalidate();
                    }
                    break;
                } else {
                    int i15 = com.avito.android.sx_address.list.view.a.f293405L;
                    break;
                }
            default:
                ListItemSwitcher listItemSwitcher = ((com.avito.android.user_advert.advert.items.installments_promoblock.k) obj2).f309534g;
                if (listItemSwitcher != null) {
                    listItemSwitcher.setChecked(!z12);
                }
                ((N) obj).invoke(Boolean.valueOf(z12));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e(com.avito.android.user_advert.advert.items.installments_promoblock.k kVar, Y41.l lVar) {
        this.f93112a = 8;
        this.f93113b = kVar;
        this.f93114c = (N) lVar;
    }
}
