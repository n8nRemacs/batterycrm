package com.avito.android.beduin.common.component.load_more;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinLoadMoreComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/load_more/b;", "Lej/b;", "Lcom/avito/android/beduin/common/component/load_more/BeduinLoadMoreModel;", "Lcom/avito/android/beduin/common/component/load_more/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC40113b<BeduinLoadMoreModel, a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f101721a;

    @Inject
    public b(@k e eVar) {
        this.f101721a = eVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new a((BeduinLoadMoreModel) beduinModel, this.f101721a, eVar);
    }
}
