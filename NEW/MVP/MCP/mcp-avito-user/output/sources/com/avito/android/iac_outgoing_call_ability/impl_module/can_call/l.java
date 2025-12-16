package com.avito.android.iac_outgoing_call_ability.impl_module.can_call;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacCallInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallData;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import vN.C49237a;

/* compiled from: IacMockCanCallResultFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/can_call/l;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/can_call/k;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C49237a f168556a;

    @Inject
    public l(@Y61.k C49237a c49237a) {
        this.f168556a = c49237a;
    }

    @Override // com.avito.android.iac_outgoing_call_ability.impl_module.can_call.k
    @Y61.k
    public final IacCanCallResult.Can a(@Y61.k String str, @Y61.k IacCallContext iacCallContext, @Y61.l DeepLink deepLink, @Y61.k String str2) {
        DeepLink deepLink2 = (deepLink == null || !L.f(iacCallContext.f166824b, "item")) ? null : deepLink;
        IacCallDirection iacCallDirection = IacCallDirection.OUTGOING;
        C49237a c49237a = this.f168556a;
        c49237a.getClass();
        kotlin.reflect.n<Object> nVar = C49237a.f440707l[2];
        return new IacCanCallResult.Can(new IacCallInfo(str, iacCallContext.f166825c, iacCallContext.f166826d, str2, iacCallContext.f166824b, true, iacCallDirection, deepLink2, iacCallContext.f166827e, null, new IacCanCallData(null, ((Boolean) c49237a.f440710c.a().invoke()).booleanValue(), null, 4, null), null, null), null, 2, null);
    }

    @Override // com.avito.android.iac_outgoing_call_ability.impl_module.can_call.k
    @Y61.l
    public final IacCanCallResult b(@Y61.k String str, @Y61.k IacCallContext iacCallContext, @Y61.l DeepLink deepLink, @Y61.k String str2) {
        String str3 = this.f168556a.w().invoke().f318873b;
        switch (str3.hashCode()) {
            case -1786928445:
                if (str3.equals("mock_iac_true_force")) {
                    return a(str, iacCallContext, deepLink, str2);
                }
                return null;
            case -1138934342:
                if (str3.equals("mock_iac_false")) {
                    return new IacCanCallResult.CanNot(null, null, 3, null);
                }
                return null;
            case -313400809:
                if (str3.equals("mock_iac_true")) {
                    return a(str, iacCallContext, deepLink, str2);
                }
                return null;
            case 2022188202:
                str3.equals("do_not_mock");
                return null;
            default:
                return null;
        }
    }
}
