package com.avito.android.safedeal.universal_delivery_type.courier.mvi;

import Qn0.InterfaceC14913a;
import Qn0.c;
import Zi.InterfaceC19564a;
import com.avito.android.arch.mvi.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.safedeal.universal_delivery_type.courier.mvi.entity.UniversalDeliveryTypeCourierInternalAction;
import gj.InterfaceC40691b;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UniversalDeliveryTypeCourierActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LQn0/a;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "LQn0/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14913a, UniversalDeliveryTypeCourierInternalAction, Qn0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f256505a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final InterfaceC19564a f256506b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f256507c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<BeduinAction> f256508d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public a(@Y61.l String str, @Y61.l InterfaceC19564a interfaceC19564a, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.l List<? extends BeduinAction> list) {
        this.f256505a = str;
        this.f256506b = interfaceC19564a;
        this.f256507c = interfaceC40691b;
        this.f256508d = list;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UniversalDeliveryTypeCourierInternalAction> b(InterfaceC14913a interfaceC14913a, Qn0.c cVar) {
        InterfaceC14913a interfaceC14913a2 = interfaceC14913a;
        Qn0.c cVar2 = cVar;
        boolean z12 = interfaceC14913a2 instanceof InterfaceC14913a.b;
        InterfaceC40691b interfaceC40691b = this.f256507c;
        if (z12) {
            String str = this.f256505a;
            if (str == null) {
                return C43175k.w();
            }
            InterfaceC19564a interfaceC19564a = this.f256506b;
            com.avito.android.beduin_shared.model.utils.a.a(interfaceC40691b, interfaceC19564a != null ? interfaceC19564a.b(str) : null);
            return new C43210w(UniversalDeliveryTypeCourierInternalAction.StoredActionsHandled.f256536b);
        }
        if (!(interfaceC14913a2 instanceof InterfaceC14913a.C0926a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(cVar2 instanceof c.a) || ((c.a) cVar2).f14006h) {
            return C43175k.w();
        }
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC40691b, this.f256508d);
        return new C43210w(UniversalDeliveryTypeCourierInternalAction.HandledOnInitActions.f256535b);
    }
}
