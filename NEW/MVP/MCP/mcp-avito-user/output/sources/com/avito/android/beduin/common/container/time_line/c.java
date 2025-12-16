package com.avito.android.beduin.common.container.time_line;

import Ui.InterfaceC15523b;
import Y61.k;
import bi.C25654c;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinTimeLineContainerFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/time_line/c;", "Lej/b;", "Lcom/avito/android/beduin/common/container/time_line/BeduinTimeLineContainerModel;", "Lcom/avito/android/beduin/common/container/time_line/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC40113b<BeduinTimeLineContainerModel, b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> f103241a;

    @Inject
    public c(@k h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> eVar) {
        this.f103241a = eVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new b((BeduinTimeLineContainerModel) beduinModel, new Wh.c(interfaceC15523b, eVar, new C25654c(this.f103241a)));
    }
}
