package com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi;

import Z50.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BusinessVrfDuplicationProfileCreationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create/business_vrf_duplication/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/entity/BusinessVrfDuplicationInternalAction;", "LZ50/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements t<BusinessVrfDuplicationInternalAction, Z50.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f211267b;

    @Inject
    public k(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f211267b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Z50.b b(BusinessVrfDuplicationInternalAction businessVrfDuplicationInternalAction) {
        BusinessVrfDuplicationInternalAction businessVrfDuplicationInternalAction2 = businessVrfDuplicationInternalAction;
        if (businessVrfDuplicationInternalAction2.equals(BusinessVrfDuplicationInternalAction.Close.f212542b)) {
            return b.a.f19878a;
        }
        if (businessVrfDuplicationInternalAction2.equals(BusinessVrfDuplicationInternalAction.OnFinal.f212549b)) {
            return b.C1419b.f19879a;
        }
        if (businessVrfDuplicationInternalAction2 instanceof BusinessVrfDuplicationInternalAction.HandleDeepLink) {
            BusinessVrfDuplicationInternalAction.HandleDeepLink handleDeepLink = (BusinessVrfDuplicationInternalAction.HandleDeepLink) businessVrfDuplicationInternalAction2;
            b.a.a(this.f211267b, handleDeepLink.f212546b, handleDeepLink.f212547c, null, 4);
        }
        return null;
    }
}
