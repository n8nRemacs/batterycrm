package com.avito.android.seller_room.mvi;

import Vq0.InterfaceC15708a;
import com.avito.android.arch.mvi.a;
import com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SellerRoomActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/seller_room/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LVq0/a;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "LVq0/c;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC15708a, SellerRoomInternalAction, Vq0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.seller_room.d f268137a;

    @Inject
    public b(@Y61.k com.avito.android.seller_room.d dVar) {
        this.f268137a = dVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SellerRoomInternalAction> b(InterfaceC15708a interfaceC15708a, Vq0.c cVar) {
        InterfaceC15708a interfaceC15708a2 = interfaceC15708a;
        if (interfaceC15708a2 instanceof InterfaceC15708a.d) {
            if (((InterfaceC15708a.d) interfaceC15708a2) instanceof InterfaceC15708a.b) {
                return C43175k.G(new a(this, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(interfaceC15708a2 instanceof InterfaceC15708a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC15708a.c cVar2 = (InterfaceC15708a.c) interfaceC15708a2;
        if (cVar2 instanceof InterfaceC15708a.C1201a) {
            return new C43210w(new SellerRoomInternalAction.HandleBeduinEvent(((InterfaceC15708a.C1201a) cVar2).f17413a));
        }
        if (cVar2 instanceof InterfaceC15708a.e) {
            return new C43210w(new SellerRoomInternalAction.HandleBeduinState(((InterfaceC15708a.e) cVar2).f17414a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
