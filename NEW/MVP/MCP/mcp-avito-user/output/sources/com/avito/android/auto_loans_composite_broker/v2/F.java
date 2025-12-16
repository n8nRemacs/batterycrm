package com.avito.android.auto_loans_composite_broker.v2;

import android.net.Uri;
import androidx.view.M0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculatorV2;
import com.avito.android.remote.parse.adapter.DeepLinkInfo;
import com.huawei.hms.framework.common.ContainerUtils;
import kotlin.Metadata;

/* compiled from: CompositeBrokerV2ViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/F;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/auto_loans_composite_broker/v2/C;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class F extends M0 implements C {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28712a f95623E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Me.q f95624J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f95625K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public CompositeBrokerCalculatorV2 f95626L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public String f95627M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public A f95628N;

    public F(@Y61.k InterfaceC28712a interfaceC28712a, @Y61.k Me.q qVar, @Y61.k com.avito.android.deep_linking.x xVar) {
        this.f95623E = interfaceC28712a;
        this.f95624J = qVar;
        this.f95625K = xVar;
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.C
    @Y61.l
    public final A L0() {
        String str;
        if (this.f95628N == null) {
            CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2 = this.f95626L;
            A a12 = null;
            if (compositeBrokerCalculatorV2 != null && (str = this.f95627M) != null) {
                a12 = new A(compositeBrokerCalculatorV2, str, this.f95623E);
            }
            this.f95628N = a12;
        }
        return this.f95628N;
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.C
    public final void N6() {
        DeepLinkInfo deepLinkInfo;
        A aL02;
        A aL03 = L0();
        if (aL03 == null || (deepLinkInfo = aL03.f95595k) == null || (aL02 = L0()) == null) {
            return;
        }
        Uri uri = Uri.parse(deepLinkInfo.getParams().getPagePath());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(deepLinkInfo.getParams().getPagePath());
        if (!uri.getQueryParameterNames().isEmpty()) {
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        sb2.append("calcMonthPayment=" + aL02.f95607w + '&');
        sb2.append("calcCreditAmount=" + aL02.f95605u + '&');
        sb2.append("calcTerm=" + aL02.f95591g + '&');
        Uri.Builder builderAppendQueryParameter = Uri.parse(deepLinkInfo.getUrl()).buildUpon().appendQueryParameter("pagePath", sb2.toString());
        String screenName = deepLinkInfo.getParams().getScreenName();
        if (screenName == null) {
            screenName = "AutoLoansV2Beduin";
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("screenName", screenName).appendQueryParameter("scrollOnKeyboardShown", "false");
        String heightMode = deepLinkInfo.getParams().getHeightMode();
        if (heightMode == null) {
            heightMode = "fit";
        }
        this.f95624J.N0(this.f95625K.e(builderAppendQueryParameter2.appendQueryParameter("heightMode", heightMode).build()));
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.C
    public final void aa(@Y61.k CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2, @Y61.l String str) {
        this.f95626L = compositeBrokerCalculatorV2;
        this.f95627M = str;
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.C
    public final void r(int i12) {
        this.f95624J.r(i12);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.C
    public final void v(@Y61.k DeepLink deepLink) {
        this.f95624J.v(deepLink);
    }
}
