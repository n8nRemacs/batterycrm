package Uh;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.component.status_line.BeduinStatusLineModel;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import h31.e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinStatusLineContainerFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LUh/a;", "Lej/b;", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel;", "Lcom/avito/android/beduin/common/component/status_line/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Uh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15518a implements InterfaceC40113b<BeduinStatusLineModel, com.avito.android.beduin.common.component.status_line.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> f16552a;

    @Inject
    public C15518a(@k e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> eVar) {
        this.f16552a = eVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new com.avito.android.beduin.common.component.status_line.a((BeduinStatusLineModel) beduinModel, eVar, interfaceC15523b, this.f16552a.get());
    }
}
