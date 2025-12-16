package Nh;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.component.header_button.BeduinHeaderButtonModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;
import lj.e;

/* compiled from: BeduinHeaderButtonComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LNh/b;", "Lej/b;", "Lcom/avito/android/beduin/common/component/header_button/BeduinHeaderButtonModel;", "LNh/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC40113b<BeduinHeaderButtonModel, C14576a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f11710a;

    @Inject
    public b(@k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f11710a = interfaceC15523b;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, e eVar, InterfaceC15523b interfaceC15523b) {
        return new C14576a((BeduinHeaderButtonModel) beduinModel, interfaceC15523b);
    }
}
