package com.avito.android.beduin.common.component.map;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.U0;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinMapComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/map/b;", "Lej/b;", "Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel;", "Lcom/avito/android/beduin/common/component/map/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC40113b<BeduinMapComponentModel, a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final U0 f101750a;

    @Inject
    public b(@k U0 u02) {
        this.f101750a = u02;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new a(interfaceC15523b, (BeduinMapComponentModel) beduinModel, this.f101750a.v().invoke().booleanValue());
    }
}
