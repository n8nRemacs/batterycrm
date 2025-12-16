package bi;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import lj.e;

/* compiled from: CompositeBeduinComponentFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0001¨\u0006\u0006"}, d2 = {"Lbi/b;", "Lej/b;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/a;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bi.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C25653b implements InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f57394a;

    public C25653b(@k Map<Class<? extends BeduinModel>, ? extends InterfaceC40113b<? extends BeduinModel, ? extends AbstractC40112a<? extends BeduinModel, ? extends InterfaceC40116e>>> map, @k Map<Class<? extends BeduinModel>, ? extends InterfaceC40113b<? extends BeduinModel, ? extends AbstractC40112a<? extends BeduinModel, ? extends InterfaceC40116e>>> map2) {
        this.f57394a = P0.k(map, map2);
    }

    @Override // ej.InterfaceC40113b
    @k
    public final AbstractC40112a<BeduinModel, InterfaceC40116e> a(@k BeduinModel beduinModel, @k e eVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112aA;
        Object obj = this.f57394a.get(beduinModel.getClass());
        InterfaceC40113b interfaceC40113b = obj instanceof InterfaceC40113b ? (InterfaceC40113b) obj : null;
        if (interfaceC40113b != null && (abstractC40112aA = interfaceC40113b.a(beduinModel, eVar, interfaceC15523b)) != null) {
            return abstractC40112aA;
        }
        throw new IllegalStateException("Unsupported beduin model with class: " + beduinModel.getClass());
    }
}
