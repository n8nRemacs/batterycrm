package com.avito.android.credits.broker_link.default_link;

import Y61.k;
import Y61.l;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.credit_broker.IconName;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CreditBrokerDefaultLinkView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/broker_link/default_link/h;", "LTV0/e;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface h extends TV0.e {

    /* compiled from: CreditBrokerDefaultLinkView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void O0(@k String str, @k String str2);

    void VE(@k String str);

    void a(@k Y41.a<G0> aVar);

    void eU(@l String str, boolean z12, @l UniversalColor universalColor);

    void jA(@k CreditCalculator.Type type, @l IconName iconName);

    void setTitle(@k String str);
}
