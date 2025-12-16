package com.avito.android.mortgage_invite.client_form.mvi;

import U10.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ApplicationClientFormReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "LU10/c;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements u<ApplicationClientFormInternalAction, U10.c> {
    @Inject
    public n() {
    }

    public static Y10.a b(Y10.a aVar, ContactInfoFieldId contactInfoFieldId, String str) {
        List<Y10.b> list = aVar.f19259b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Y10.b bVarA : list) {
            if (bVarA.f19261a == contactInfoFieldId) {
                bVarA = Y10.b.a(bVarA, false, str, null, false, 1279);
            }
            arrayList.add(bVarA);
        }
        return Y10.a.a(aVar, arrayList, 1);
    }

    public static Y10.a c(Y10.a aVar, Map map) {
        List<Y10.b> list = aVar.f19259b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Y10.b bVar : list) {
            arrayList.add(Y10.b.a(bVar, false, null, (PrintableText) map.get(bVar.f19261a), false, 1535));
        }
        return Y10.a.a(aVar, arrayList, 5);
    }

    public static U10.d d(U10.d dVar, boolean z12) {
        if (!(dVar instanceof d.c)) {
            return dVar instanceof d.a ? d.a.e((d.a) dVar, null, z12, 31) : dVar;
        }
        d.c cVar = (d.c) dVar;
        return new d.c(cVar.f16125a, cVar.f16126b, cVar.f16127c, cVar.f16128d, cVar.f16129e, z12);
    }

    @Override // com.avito.android.arch.mvi.u
    public final U10.c a(ApplicationClientFormInternalAction applicationClientFormInternalAction, U10.c cVar) {
        ApplicationClientFormInternalAction applicationClientFormInternalAction2 = applicationClientFormInternalAction;
        U10.c cVar2 = cVar;
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.FormLoadingStarted) {
            return U10.c.a(cVar2, null, d.f.f16132a, null, 4);
        }
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.FormLoadingFailed) {
            return U10.c.a(cVar2, null, d.e.f16131a, null, 4);
        }
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.FormLoadingSuccess) {
            T10.c cVar3 = ((ApplicationClientFormInternalAction.FormLoadingSuccess) applicationClientFormInternalAction2).f205242b;
            return U10.c.a(cVar2, cVar3, new d.b(cVar3.f15282a, null, null, null, null, false, false, WebSocketProtocol.PAYLOAD_SHORT, null), null, 4);
        }
        boolean zEquals = applicationClientFormInternalAction2.equals(ApplicationClientFormInternalAction.SetClientSearchError.f205249b);
        U10.d dVarE = cVar2.f16110c;
        if (zEquals) {
            d.b bVar = (d.b) (!(dVarE instanceof d.b) ? null : dVarE);
            if (bVar != null) {
                dVarE = new d.b(bVar.f16118a, com.avito.android.printable_text.b.f(bVar.f16118a.f15296g), bVar.f16120c, bVar.f16121d, bVar.f16122e, bVar.f16123f, bVar.f16124g);
            }
            return U10.c.a(cVar2, null, dVarE, null, 5);
        }
        boolean zEquals2 = applicationClientFormInternalAction2.equals(ApplicationClientFormInternalAction.CreateNewClient.f205239b);
        T10.c cVar4 = cVar2.f16109b;
        if (zEquals2) {
            return cVar4 != null ? U10.c.a(cVar2, null, new d.a(cVar4.f15283b, null, null, null, false, false, 62, null), null, 5) : cVar2;
        }
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.ClientSelected) {
            ApplicationClientFormInternalAction.ClientSelected clientSelected = (ApplicationClientFormInternalAction.ClientSelected) applicationClientFormInternalAction2;
            if (cVar4 == null) {
                return cVar2;
            }
            MortgageClient mortgageClient = clientSelected.f205238b;
            String str = mortgageClient.f205394b;
            T10.f fVar = cVar4.f15284c;
            return U10.c.a(cVar2, null, new d.c(new T10.f(fVar.f15297a, fVar.f15298b, fVar.f15299c, fVar.f15300d, fVar.f15301e, T10.b.a(fVar.f15302f, mortgageClient.f205395c.f205403e), T10.b.a(fVar.f15303g, mortgageClient.f205396d.f205399c), T10.b.a(fVar.f15304h, mortgageClient.f205397e.f205399c), str), null, null, null, false, false, 62, null), null, 5);
        }
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.ClientInfoUpdated) {
            d.a aVar = (d.a) (!(dVarE instanceof d.a) ? null : dVarE);
            if (aVar != null) {
                T10.d dVar = aVar.f16112a;
                ApplicationClientFormInternalAction.ClientInfoUpdated clientInfoUpdated = (ApplicationClientFormInternalAction.ClientInfoUpdated) applicationClientFormInternalAction2;
                dVarE = d.a.e(aVar, T10.d.a(dVar, b(dVar.f15288d, clientInfoUpdated.f205235b, clientInfoUpdated.f205236c), null, 23), false, 62);
            }
            return U10.c.a(cVar2, null, dVarE, null, 5);
        }
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.AgentInfoUpdated) {
            d.a aVar2 = (d.a) (!(dVarE instanceof d.a) ? null : dVarE);
            if (aVar2 != null) {
                T10.d dVar2 = aVar2.f16112a;
                ApplicationClientFormInternalAction.AgentInfoUpdated agentInfoUpdated = (ApplicationClientFormInternalAction.AgentInfoUpdated) applicationClientFormInternalAction2;
                dVarE = d.a.e(aVar2, T10.d.a(dVar2, null, b(dVar2.f15289e, agentInfoUpdated.f205232b, agentInfoUpdated.f205233c), 15), false, 62);
            }
            return U10.c.a(cVar2, null, dVarE, null, 5);
        }
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.ClientInfoValidationError) {
            d.a aVar3 = (d.a) (!(dVarE instanceof d.a) ? null : dVarE);
            if (aVar3 != null) {
                T10.d dVar3 = aVar3.f16112a;
                dVarE = d.a.e(aVar3, T10.d.a(dVar3, c(dVar3.f15288d, ((ApplicationClientFormInternalAction.ClientInfoValidationError) applicationClientFormInternalAction2).f205237b), null, 23), false, 30);
            }
            return U10.c.a(cVar2, null, dVarE, null, 5);
        }
        if (!(applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.AgentInfoValidationError)) {
            return applicationClientFormInternalAction2.equals(ApplicationClientFormInternalAction.ActionLoadingStarted.f205231b) ? U10.c.a(cVar2, null, d(dVarE, true), null, 1) : applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.ActionLoadingError ? U10.c.a(cVar2, null, d(dVarE, false), null, 1) : applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.PhoneConfirmationRequired ? U10.c.a(cVar2, null, d(dVarE, false), ((ApplicationClientFormInternalAction.PhoneConfirmationRequired) applicationClientFormInternalAction2).f205247c, 1) : cVar2;
        }
        d.a aVar4 = (d.a) (!(dVarE instanceof d.a) ? null : dVarE);
        if (aVar4 != null) {
            T10.d dVar4 = aVar4.f16112a;
            dVarE = d.a.e(aVar4, T10.d.a(dVar4, null, c(dVar4.f15289e, ((ApplicationClientFormInternalAction.AgentInfoValidationError) applicationClientFormInternalAction2).f205234b), 15), false, 30);
        }
        return U10.c.a(cVar2, null, dVarE, null, 5);
    }
}
