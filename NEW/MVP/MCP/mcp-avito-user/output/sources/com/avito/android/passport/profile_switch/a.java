package com.avito.android.passport.profile_switch;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.ChainedDeepLink;
import com.avito.android.deep_linking.links.ConditionChainLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeepLinkContainer;
import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportSwitchEmployeeModeLinkExtractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_switch/a;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {
    @Inject
    public a() {
    }

    public static EmployeeModeSwitchLink a(DeepLink deepLink) {
        EmployeeModeSwitchLink employeeModeSwitchLinkA;
        if (deepLink instanceof EmployeeModeSwitchLink) {
            return (EmployeeModeSwitchLink) deepLink;
        }
        if (deepLink instanceof ScreenFlowLink) {
            ScreenFlowLink screenFlowLink = (ScreenFlowLink) deepLink;
            employeeModeSwitchLinkA = a(screenFlowLink.f260204b);
            if (employeeModeSwitchLinkA == null) {
                return a(screenFlowLink.f260205c);
            }
        } else {
            if (!(deepLink instanceof ConditionChainLink)) {
                if (deepLink instanceof ChainedDeepLink) {
                    return a(((ChainedDeepLink) deepLink).getF133300c());
                }
                EmployeeModeSwitchLink employeeModeSwitchLinkA2 = null;
                if (deepLink instanceof DeepLinkContainer) {
                    Iterator it = ((DeepLinkContainer) deepLink).f133174b.iterator();
                    while (it.hasNext() && (employeeModeSwitchLinkA2 = a((DeepLink) it.next())) == null) {
                    }
                }
                return employeeModeSwitchLinkA2;
            }
            ConditionChainLink conditionChainLink = (ConditionChainLink) deepLink;
            employeeModeSwitchLinkA = a(conditionChainLink.f133112b);
            if (employeeModeSwitchLinkA == null && (employeeModeSwitchLinkA = a(conditionChainLink.f133114d)) == null) {
                return a(conditionChainLink.f133113c);
            }
        }
        return employeeModeSwitchLinkA;
    }
}
