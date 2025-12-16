package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi;

import S50.a;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.entity.ReAgentShortFlowCreationInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReAgentShortFlowCreationActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LS50/a;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "LS50/c;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.arch.mvi.a<S50.a, ReAgentShortFlowCreationInternalAction, S50.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f211588a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.d f211589b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G f211590c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f211591d;

    @Inject
    public c(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.d dVar, @Y61.k G g12, @Y61.k R0 r02) {
        this.f211588a = interfaceC28373a;
        this.f211589b = dVar;
        this.f211590c = g12;
        this.f211591d = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ReAgentShortFlowCreationInternalAction> b(S50.a aVar, S50.c cVar) {
        C43210w c43210w;
        S50.a aVar2 = aVar;
        S50.c cVar2 = cVar;
        if (aVar2 instanceof a.d) {
            return C43175k.I(this.f211591d.a(), C43175k.G(new b(cVar2, this, null)));
        }
        if (aVar2 instanceof a.c) {
            a.c cVar3 = (a.c) aVar2;
            return C43175k.G(new a(cVar3.f14807a, cVar3.f14808b, this, null));
        }
        if (aVar2 instanceof a.C0999a) {
            c43210w = new C43210w(new ReAgentShortFlowCreationInternalAction.OnBack(cVar2.f14818b));
        } else {
            if (!(aVar2 instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(ReAgentShortFlowCreationInternalAction.OnClose.f211600b);
        }
        return c43210w;
    }
}
