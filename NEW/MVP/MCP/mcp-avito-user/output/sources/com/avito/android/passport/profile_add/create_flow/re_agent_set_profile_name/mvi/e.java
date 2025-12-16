package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi;

import Q50.a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.ReAgentSetProfileNameArgs;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameInternalAction;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameState;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReAgentSetProfileNameActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LQ50/a;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameState;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.arch.mvi.a<Q50.a, ReAgentSetProfileNameInternalAction, ReAgentSetProfileNameState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ReAgentSetProfileNameArgs f211466a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f211467b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.domain.interactor.a f211468c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f211469d;

    @Inject
    public e(@Y61.k ReAgentSetProfileNameArgs reAgentSetProfileNameArgs, @Y61.k R0 r02, @Y61.k com.avito.android.passport.profile_add.domain.interactor.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f211466a = reAgentSetProfileNameArgs;
        this.f211467b = r02;
        this.f211468c = aVar;
        this.f211469d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ReAgentSetProfileNameInternalAction> b(Q50.a aVar, ReAgentSetProfileNameState reAgentSetProfileNameState) {
        InterfaceC43160i<ReAgentSetProfileNameInternalAction> interfaceC43160iI;
        Q50.a aVar2 = aVar;
        ReAgentSetProfileNameState reAgentSetProfileNameState2 = reAgentSetProfileNameState;
        if (aVar2 instanceof a.C0886a) {
            return new C43210w(ReAgentSetProfileNameInternalAction.Close.f211470b);
        }
        if (aVar2 instanceof a.c) {
            interfaceC43160iI = new C43210w(new ReAgentSetProfileNameInternalAction.FirstNameTextChanged(((a.c) aVar2).f13469a));
        } else if (aVar2 instanceof a.e) {
            interfaceC43160iI = new C43210w(new ReAgentSetProfileNameInternalAction.SecondNameTextChanged(((a.e) aVar2).f13472a));
        } else {
            if (!(aVar2 instanceof a.b)) {
                if (!(aVar2 instanceof a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.d dVar = (a.d) aVar2;
                return C43175k.G(new c(dVar.f13470a, dVar.f13471b, this, reAgentSetProfileNameState2, null));
            }
            if (C43066x.K(reAgentSetProfileNameState2.f211486b) || C43066x.K(reAgentSetProfileNameState2.f211487c)) {
                c(false);
                return new C43210w(ReAgentSetProfileNameInternalAction.EmptyNameError.f211473b);
            }
            interfaceC43160iI = C43175k.I(this.f211467b.a(), new C43152f0(C43175k.G(new a(this, reAgentSetProfileNameState2, null)), new b(this, null)));
        }
        return interfaceC43160iI;
    }

    public final void c(boolean z12) {
        ProfileCreateExtendedFlow profileCreateExtendedFlow = this.f211466a.f211378e;
        boolean zF2 = L.f(profileCreateExtendedFlow, ProfileCreateExtendedFlow.Profile.Upgrade.f211175d);
        InterfaceC28373a interfaceC28373a = this.f211469d;
        if (zF2) {
            interfaceC28373a.c(new M50.m("upgrade", z12));
        } else if (L.f(profileCreateExtendedFlow, ProfileCreateExtendedFlow.Passport.Create.f211172d)) {
            interfaceC28373a.c(new M50.m("new_profile", z12));
        }
    }
}
