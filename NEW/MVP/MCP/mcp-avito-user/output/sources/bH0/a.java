package BH0;

import Y61.k;
import com.avito.android.analytics.a0;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.installments.InstallmentsSwitcherActionData;
import com.avito.android.remote.model.installments.InstallmentsSwitcherData;
import com.avito.android.remote.model.installments.LogEventActionData;
import com.avito.android.remote.model.installments.OpenLinkSwitcherActionData;
import com.avito.android.remote.model.installments.ToggleSwitcherActionData;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.items.installments_promoblock.a;
import com.avito.android.user_advert.advert.items.installments_promoblock.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-advert_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final a.C9491a a(@k InstallmentsSwitcherData installmentsSwitcherData) {
        C42784z0 c42784z0;
        l aVar;
        String title = installmentsSwitcherData.getTitle();
        AttributedText subtitle = installmentsSwitcherData.getSubtitle();
        com.avito.android.user_advert.advert.items.safe_deal_services.a aVarA = PH0.a.a(installmentsSwitcherData.getIconType());
        Boolean isSwitchOn = installmentsSwitcherData.getIsSwitchOn();
        boolean zBooleanValue = isSwitchOn != null ? isSwitchOn.booleanValue() : false;
        String refreshUrl = installmentsSwitcherData.getRefreshUrl();
        ParametrizedEvent subtitleClickEvent = installmentsSwitcherData.getSubtitleClickEvent();
        ParametrizedClickStreamEvent parametrizedClickStreamEventA = subtitleClickEvent != null ? a0.a(subtitleClickEvent) : null;
        List<InstallmentsSwitcherActionData> actions = installmentsSwitcherData.getActions();
        if (actions != null) {
            List<InstallmentsSwitcherActionData> list = actions;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (InstallmentsSwitcherActionData installmentsSwitcherActionData : list) {
                if (installmentsSwitcherActionData instanceof OpenLinkSwitcherActionData) {
                    aVar = new l.b(((OpenLinkSwitcherActionData) installmentsSwitcherActionData).getDeeplink());
                } else if (installmentsSwitcherActionData instanceof ToggleSwitcherActionData) {
                    ToggleSwitcherActionData toggleSwitcherActionData = (ToggleSwitcherActionData) installmentsSwitcherActionData;
                    aVar = new l.c(toggleSwitcherActionData.getRequestUrl(), toggleSwitcherActionData.getParamsMap());
                } else {
                    if (!(installmentsSwitcherActionData instanceof LogEventActionData)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ParametrizedEvent event = ((LogEventActionData) installmentsSwitcherActionData).getEvent();
                    aVar = new l.a(event != null ? a0.a(event) : null);
                }
                arrayList.add(aVar);
            }
            c42784z0 = arrayList;
        } else {
            c42784z0 = C42784z0.f406748b;
        }
        return new a.C9491a(title, subtitle, aVarA, zBooleanValue, refreshUrl, false, parametrizedClickStreamEventA, c42784z0);
    }
}
