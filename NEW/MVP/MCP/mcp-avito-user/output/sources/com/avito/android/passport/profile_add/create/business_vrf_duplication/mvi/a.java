package com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi;

import Z50.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.VerificationStartLink;
import com.avito.android.passport.event.SCENARIO_NAME;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BusinessVrfDuplicationProfileCreationActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create/business_vrf_duplication/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LZ50/a;", "Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/entity/BusinessVrfDuplicationInternalAction;", "LZ50/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<Z50.a, BusinessVrfDuplicationInternalAction, Z50.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f211237a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.a f211238b;

    @Inject
    public a(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.a aVar) {
        this.f211237a = interfaceC28373a;
        this.f211238b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BusinessVrfDuplicationInternalAction> b(Z50.a aVar, Z50.c cVar) {
        Z50.a aVar2 = aVar;
        boolean zEquals = aVar2.equals(a.b.f19875a);
        InterfaceC28373a interfaceC28373a = this.f211237a;
        if (zEquals) {
            interfaceC28373a.c(new H50.i(new NoMatchLink(), "close", null, SCENARIO_NAME.f211136c));
            return new C43210w(BusinessVrfDuplicationInternalAction.Close.f212542b);
        }
        if (aVar2 instanceof a.c) {
            a.c cVar2 = (a.c) aVar2;
            SCENARIO_NAME scenario_name = SCENARIO_NAME.f211136c;
            DeepLink deepLink = cVar2.f19876a;
            interfaceC28373a.c(new H50.i(deepLink, cVar2.f19877b, null, scenario_name));
            return deepLink instanceof VerificationStartLink ? new C43210w(new BusinessVrfDuplicationInternalAction.HandleDeepLink(deepLink, "passport.profile_add.create.business_vrf_duplication.start_verification")) : new C43210w(new BusinessVrfDuplicationInternalAction.HandleDeepLink(deepLink, null, 2, null));
        }
        if (aVar2 instanceof a.d) {
            throw null;
        }
        if (aVar2 instanceof a.e) {
            return new C43210w(new BusinessVrfDuplicationInternalAction.HandleDeepLink(null, null, 2, null));
        }
        if (aVar2.equals(a.C1418a.f19874a)) {
            return C43175k.w();
        }
        throw new NoWhenBranchMatchedException();
    }
}
