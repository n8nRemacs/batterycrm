package com.avito.android.virtual_deal_room.client_room.mvi;

import EN0.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.virtual_deal_room.client_room.mvi.entity.ClientRoomInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ClientRoomActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LEN0/a;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "LEN0/c;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements com.avito.android.arch.mvi.a<EN0.a, ClientRoomInternalAction, EN0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.virtual_deal_room.client_room.interactor.e f326360a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.virtual_deal_room.client_room.interactor.a f326361b;

    @Inject
    public e(@Y61.k com.avito.android.virtual_deal_room.client_room.interactor.e eVar, @Y61.k com.avito.android.virtual_deal_room.client_room.interactor.a aVar) {
        this.f326360a = eVar;
        this.f326361b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ClientRoomInternalAction> b(EN0.a aVar, EN0.c cVar) {
        C43210w c43210w;
        EN0.a aVar2 = aVar;
        EN0.c cVar2 = cVar;
        boolean zEquals = aVar2.equals(a.g.f3951a);
        List<DN0.b> list = cVar2.f3966b;
        com.avito.android.virtual_deal_room.client_room.interactor.e eVar = this.f326360a;
        DN0.b bVar = cVar2.f3968d;
        if (zEquals) {
            return eVar.a(false, bVar);
        }
        if (aVar2.equals(a.h.f3952a)) {
            return eVar.a(true, bVar);
        }
        if (aVar2.equals(a.c.f3947a)) {
            c43210w = new C43210w(new ClientRoomInternalAction.Close(cVar2.f3981q));
        } else {
            if (aVar2.equals(a.C0229a.f3945a)) {
                return C43175k.G(new a(cVar2, null));
            }
            if (aVar2.equals(a.d.f3948a)) {
                return C43175k.G(new b(cVar2, this, null));
            }
            if (aVar2.equals(a.f.f3950a)) {
                return C43175k.G(new c(cVar2, this, null));
            }
            if (aVar2 instanceof a.i) {
                return C43175k.G(new d(cVar2, aVar2, this, null));
            }
            if (aVar2 instanceof a.e) {
                return eVar.b(((a.e) aVar2).f3949a, cVar2.f3973i);
            }
            if (!aVar2.equals(a.b.f3946a)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(ClientRoomInternalAction.CategoryUpdated.f326364b);
        }
        return c43210w;
    }
}
