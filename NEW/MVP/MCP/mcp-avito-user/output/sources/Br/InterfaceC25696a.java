package br;

import J81.f;
import J81.k;
import J81.t;
import Y61.l;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.State;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import cr.C39401b;
import dr.C39787b;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CompetitorAnalyticsApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbr/a;", "", "", "itemId", "Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/State;", VoiceInfo.STATE, "Lcom/avito/android/remote/model/TypedResult;", "Lcr/b;", "a", "(JLcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/State;", "Ldr/b;", "b", "(JLcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: br.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC25696a {
    @f("1/competitor-analytics/general")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Employeemode-required: true"})
    @l
    Object a(@t("itemId") long j12, @t(VoiceInfo.STATE) @Y61.k State state, @Y61.k Continuation<? super TypedResult<C39401b>> continuation);

    @f("2/competitor-analytics/general")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Employeemode-required: true"})
    @l
    Object b(@t("itemId") long j12, @t(VoiceInfo.STATE) @Y61.k com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.State state, @Y61.k Continuation<? super TypedResult<C39787b>> continuation);
}
