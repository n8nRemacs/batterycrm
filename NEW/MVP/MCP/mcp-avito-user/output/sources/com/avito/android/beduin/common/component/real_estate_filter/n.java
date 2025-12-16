package com.avito.android.beduin.common.component.real_estate_filter;

import Ph.InterfaceC14784a;
import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinRealEstateFilterComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/n;", "Lej/b;", "Lcom/avito/android/beduin/common/component/real_estate_filter/BeduinRealEstateFilterModel;", "Lcom/avito/android/beduin/common/component/real_estate_filter/d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements InterfaceC40113b<BeduinRealEstateFilterModel, C28803d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14784a f102329a;

    @Inject
    public n(@Y61.k InterfaceC14784a interfaceC14784a) {
        this.f102329a = interfaceC14784a;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new C28803d(interfaceC15523b, (BeduinRealEstateFilterModel) beduinModel, eVar, this.f102329a);
    }
}
