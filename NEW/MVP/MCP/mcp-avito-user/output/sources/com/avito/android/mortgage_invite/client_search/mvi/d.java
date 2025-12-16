package com.avito.android.mortgage_invite.client_search.mvi;

import W10.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ClientSearchActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LW10/a;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "LW10/c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.arch.mvi.a<W10.a, ClientSearchInternalAction, W10.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.client_search.domain.b f205426a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public N0 f205427b;

    @Inject
    public d(@Y61.k com.avito.android.mortgage_invite.client_search.domain.b bVar) {
        this.f205426a = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ClientSearchInternalAction> b(W10.a aVar, W10.c cVar) {
        C43210w c43210w;
        W10.a aVar2 = aVar;
        W10.c cVar2 = cVar;
        if (aVar2 instanceof a.d) {
            return C43175k.G(new a(cVar2, this, null));
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new b(cVar2, this, null));
        }
        if (aVar2 instanceof a.C1221a) {
            c43210w = new C43210w(ClientSearchInternalAction.Back.f205429b);
        } else {
            if (!(aVar2 instanceof a.b)) {
                if (aVar2 instanceof a.e) {
                    return new C43210w(new ClientSearchInternalAction.SelectClient(((a.e) aVar2).f17552a));
                }
                if (aVar2 instanceof a.f) {
                    return C43175k.h(new c(aVar2, this, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(ClientSearchInternalAction.CreateNewClient.f205430b);
        }
        return c43210w;
    }
}
