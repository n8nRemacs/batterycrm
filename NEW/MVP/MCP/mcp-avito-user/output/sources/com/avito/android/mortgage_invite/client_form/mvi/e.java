package com.avito.android.mortgage_invite.client_form.mvi;

import U10.a;
import U10.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments;
import com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ApplicationClientFormActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LU10/a;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "LU10/c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.arch.mvi.a<U10.a, ApplicationClientFormInternalAction, U10.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ApplicationClientFormArguments f205227a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.client_form.domain.k f205228b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.client_form.domain.a f205229c;

    @Inject
    public e(@Y61.k ApplicationClientFormArguments applicationClientFormArguments, @Y61.k com.avito.android.mortgage_invite.client_form.domain.k kVar, @Y61.k com.avito.android.mortgage_invite.client_form.domain.a aVar) {
        this.f205227a = applicationClientFormArguments;
        this.f205228b = kVar;
        this.f205229c = aVar;
    }

    public static final MortgageClientSearchArguments c(e eVar, U10.c cVar) {
        T10.e eVar2;
        T10.b bVar;
        T10.e eVar3;
        T10.b bVar2;
        T10.f fVar;
        T10.b bVar3;
        eVar.getClass();
        U10.d dVar = cVar.f16110c;
        String str = null;
        d.c cVar2 = dVar instanceof d.c ? (d.c) dVar : null;
        String str2 = (cVar2 == null || (fVar = cVar2.f16125a) == null || (bVar3 = fVar.f15302f) == null) ? null : bVar3.f15281e;
        if (str2 == null) {
            str2 = "";
        }
        T10.c cVar3 = cVar.f16109b;
        String str3 = (cVar3 == null || (eVar3 = cVar3.f15282a) == null || (bVar2 = eVar3.f15295f) == null) ? null : bVar2.f15279c;
        if (str3 == null) {
            str3 = "";
        }
        if (cVar3 != null && (eVar2 = cVar3.f15282a) != null && (bVar = eVar2.f15295f) != null) {
            str = bVar.f15278b;
        }
        return new MortgageClientSearchArguments(str2, str3, str != null ? str : "");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ApplicationClientFormInternalAction> b(U10.a aVar, U10.c cVar) {
        U10.a aVar2 = aVar;
        U10.c cVar2 = cVar;
        boolean z12 = aVar2 instanceof a.i;
        ApplicationClientFormArguments applicationClientFormArguments = this.f205227a;
        if (z12) {
            return this.f205228b.a(applicationClientFormArguments.f205210b);
        }
        if (aVar2 instanceof a.C1091a) {
            return this.f205229c.a(applicationClientFormArguments, cVar2.f16110c);
        }
        if (aVar2.equals(a.c.f16091a)) {
            return C43175k.G(new a(cVar2, null));
        }
        if (aVar2.equals(a.e.f16094a)) {
            return C43175k.G(new b(this, cVar2, null));
        }
        if (aVar2 instanceof a.f) {
            return new C43210w(new ApplicationClientFormInternalAction.ClientSelected(((a.f) aVar2).f16095a));
        }
        if (aVar2.equals(a.j.f16099a)) {
            return C43175k.G(new c(this, cVar2, null));
        }
        if (aVar2.equals(a.g.f16096a)) {
            return new C43210w(ApplicationClientFormInternalAction.CreateNewClient.f205239b);
        }
        if (aVar2 instanceof a.d) {
            a.d dVar = (a.d) aVar2;
            return new C43210w(new ApplicationClientFormInternalAction.ClientInfoUpdated(dVar.f16092a, dVar.f16093b));
        }
        if (aVar2 instanceof a.b) {
            a.b bVar = (a.b) aVar2;
            return new C43210w(new ApplicationClientFormInternalAction.AgentInfoUpdated(bVar.f16089a, bVar.f16090b));
        }
        if (aVar2.equals(a.h.f16097a)) {
            return C43175k.G(new d(cVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
