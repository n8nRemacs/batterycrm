package com.avito.android.virtual_deal_room_client_creation.clients.mvi;

import NN0.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.util.O2;
import com.avito.android.virtual_deal_room_client_creation.clients.mvi.entity.ClientsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ClientsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LNN0/a;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "LNN0/c;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<NN0.a, ClientsInternalAction, NN0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.virtual_deal_room_client_creation.clients.interactor.a f326641a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ON0.a f326642b;

    @Inject
    public b(@Y61.k com.avito.android.virtual_deal_room_client_creation.clients.interactor.a aVar, @Y61.k ON0.a aVar2) {
        this.f326641a = aVar;
        this.f326642b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ClientsInternalAction> b(NN0.a aVar, NN0.c cVar) {
        NN0.a aVar2 = aVar;
        NN0.c cVar2 = cVar;
        boolean zEquals = aVar2.equals(a.C0732a.f11394a);
        ON0.a aVar3 = this.f326642b;
        if (zEquals) {
            if (O2.a(cVar2.f11404b)) {
                aVar3.c();
            } else {
                aVar3.e();
            }
            return new C43210w(ClientsInternalAction.ClientAddClicked.f326648b);
        }
        if (aVar2 instanceof a.c) {
            aVar3.b();
            return new C43210w(new ClientsInternalAction.ClientClicked(((a.c) aVar2).f11396a));
        }
        if (aVar2.equals(a.d.f11397a)) {
            String str = cVar2.f11408f;
            return this.f326641a.b(cVar2.f11410h, str);
        }
        if (aVar2 instanceof a.e) {
            return C43175k.G(new a(aVar2, this, null));
        }
        if (!aVar2.equals(a.b.f11395a)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar3.d();
        return new C43210w(ClientsInternalAction.CloseClicked.f326650b);
    }
}
