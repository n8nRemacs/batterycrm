package com.avito.android.comfortable_deal.select_agent.di;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.comfortable_deal.select_agent.SelectAgentDialog;
import com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments;
import com.avito.android.di.B;
import dq.InterfaceC39778a;
import h31.d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectAgentComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/di/f;", "", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface f {

    /* compiled from: SelectAgentComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/di/f$a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        f a(@k com.avito.android.comfortable_deal.di.a aVar, @h31.b @k C28478k c28478k, @h31.b @k SelectAgentArguments selectAgentArguments, @h31.b @k l<? super InterfaceC39778a, G0> lVar);
    }

    void a(@k SelectAgentDialog selectAgentDialog);
}
