package com.avito.android.comfortable_deal.deal.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.AgentRoomDealResponse;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ResponseBuilder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/F;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AgentRoomDealResponse f121574a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public List<dp.f> f121575b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f121576c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public DeepLink f121577d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public ApiError f121578e;

    public F(@Y61.k AgentRoomDealResponse agentRoomDealResponse) {
        this.f121574a = agentRoomDealResponse;
    }
}
