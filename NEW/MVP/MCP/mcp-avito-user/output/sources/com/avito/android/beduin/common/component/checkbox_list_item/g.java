package com.avito.android.beduin.common.component.checkbox_list_item;

import Ui.InterfaceC15523b;
import bi.C25654c;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinCheckboxListItemComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/g;", "Lej/b;", "Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel;", "Lcom/avito/android/beduin/common/component/checkbox_list_item/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements InterfaceC40113b<BeduinCheckboxListItemModel, a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> f100989a;

    @Inject
    public g(@Y61.k h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> eVar) {
        this.f100989a = eVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        BeduinCheckboxListItemModel beduinCheckboxListItemModel = (BeduinCheckboxListItemModel) beduinModel;
        Wh.c cVar = new Wh.c(interfaceC15523b, eVar, new C25654c(this.f100989a));
        return new a(beduinCheckboxListItemModel, interfaceC15523b, eVar, cVar, new Yh.c(cVar));
    }
}
