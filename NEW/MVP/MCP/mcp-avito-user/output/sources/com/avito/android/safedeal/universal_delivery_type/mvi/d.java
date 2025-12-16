package com.avito.android.safedeal.universal_delivery_type.mvi;

import Un0.C15542c;
import Un0.InterfaceC15540a;
import com.avito.android.arch.mvi.a;
import com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UniversalDeliveryTypeActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LUn0/a;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "LUn0/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC15540a, UniversalDeliveryTypeInternalAction, C15542c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal.universal_delivery_type.domain.a f256663a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f256664b;

    @Inject
    public d(@Y61.k com.avito.android.safedeal.universal_delivery_type.domain.a aVar, @Y61.k InterfaceC40691b interfaceC40691b) {
        this.f256663a = aVar;
        this.f256664b = interfaceC40691b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UniversalDeliveryTypeInternalAction> b(InterfaceC15540a interfaceC15540a, C15542c c15542c) {
        InterfaceC15540a interfaceC15540a2 = interfaceC15540a;
        if (interfaceC15540a2 instanceof InterfaceC15540a.c) {
            com.avito.android.safedeal.universal_delivery_type.domain.a aVar = this.f256663a;
            return aVar.a(aVar.f256618a);
        }
        if (interfaceC15540a2 instanceof InterfaceC15540a.d) {
            return C43175k.G(new C34432a(this, interfaceC15540a2, null));
        }
        if (interfaceC15540a2 instanceof InterfaceC15540a.b) {
            return C43175k.G(new b(this, interfaceC15540a2, null));
        }
        if (interfaceC15540a2 instanceof InterfaceC15540a.C1143a) {
            return C43175k.G(new c(interfaceC15540a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
