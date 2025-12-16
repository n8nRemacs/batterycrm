package com.avito.android.beduin.common.preparer;

import com.avito.android.beduin_models.BeduinModel;
import java.util.Map;
import kotlin.Metadata;
import qj.InterfaceC47406a;

/* compiled from: CompositeBeduinModelPreparer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/preparer/f;", "Lqj/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements InterfaceC47406a<BeduinModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<Class<? extends BeduinModel>, InterfaceC47406a<? extends BeduinModel>> f103455a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Y61.k Map<Class<? extends BeduinModel>, ? extends InterfaceC47406a<? extends BeduinModel>> map) {
        this.f103455a = map;
    }

    @Override // qj.InterfaceC47406a
    @Y61.k
    public final BeduinModel a(@Y61.k BeduinModel beduinModel) {
        BeduinModel beduinModelA;
        InterfaceC47406a<? extends BeduinModel> interfaceC47406a = this.f103455a.get(beduinModel.getClass());
        InterfaceC47406a<? extends BeduinModel> interfaceC47406a2 = interfaceC47406a instanceof InterfaceC47406a ? interfaceC47406a : null;
        return (interfaceC47406a2 == null || (beduinModelA = interfaceC47406a2.a(beduinModel)) == null) ? beduinModel : beduinModelA;
    }
}
