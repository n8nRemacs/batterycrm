package bi;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import h31.e;
import kotlin.Metadata;

/* compiled from: LazyBeduinComponentFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u0002`\u0005¨\u0006\u0006"}, d2 = {"Lbi/c;", "Lej/b;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/a;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItemFactory;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bi.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C25654c implements InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> f57395a;

    public C25654c(@k e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> eVar) {
        this.f57395a = eVar;
    }

    @Override // ej.InterfaceC40113b
    @k
    public final AbstractC40112a<BeduinModel, InterfaceC40116e> a(@k BeduinModel beduinModel, @k lj.e eVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        return this.f57395a.get().a(beduinModel, eVar, interfaceC15523b);
    }
}
