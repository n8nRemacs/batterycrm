package com.avito.android.free_delivery.mvi;

import UE.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FreeDeliveryActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/free_delivery/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LUE/a;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "LUE/c;", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements com.avito.android.arch.mvi.a<UE.a, FreeDeliveryInternalAction, UE.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.free_delivery.domain.a f158783a;

    @Inject
    public e(@Y61.k com.avito.android.free_delivery.domain.a aVar) {
        this.f158783a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FreeDeliveryInternalAction> b(UE.a aVar, UE.c cVar) {
        UE.a aVar2 = aVar;
        UE.c cVar2 = cVar;
        if (aVar2 instanceof a.C1112a) {
            return this.f158783a.a(((a.C1112a) aVar2).f16303a);
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new a(aVar2, null));
        }
        if (aVar2 instanceof a.d) {
            return C43175k.G(new b(aVar2, cVar2, null));
        }
        if (aVar2 instanceof a.e) {
            return C43175k.G(new c(aVar2, null));
        }
        if (aVar2.equals(a.b.f16304a)) {
            return C43175k.G(new d(2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
