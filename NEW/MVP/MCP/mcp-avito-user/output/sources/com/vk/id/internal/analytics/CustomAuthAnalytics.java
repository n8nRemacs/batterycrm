package com.vk.id.internal.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.vk.id.StatParams;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.auth.VKIDAuthParams;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: CustomAuthAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/vk/id/internal/analytics/CustomAuthAnalytics;", "", "<init>", "()V", "Lcom/vk/id/auth/VKIDAuthParams;", "params", "Lcom/vk/id/StatParams;", "customAuthStart$vkid_release", "(Lcom/vk/id/auth/VKIDAuthParams;)Lcom/vk/id/StatParams;", "customAuthStart", "statParams", "Lkotlin/G0;", "customAuthError$vkid_release", "(Lcom/vk/id/StatParams;)V", "customAuthError", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomAuthAnalytics {

    @k
    public static final CustomAuthAnalytics INSTANCE = new CustomAuthAnalytics();

    private CustomAuthAnalytics() {
    }

    public final void customAuthError$vkid_release(@k StatParams statParams) {
        VKIDAnalytics.INSTANCE.trackEvent("sdk_auth_error", new VKIDAnalytics.EventParam("error", "sdk_auth_error", null, 4, null), new VKIDAnalytics.EventParam(HianalyticsBaseData.SDK_TYPE, "vkid", null, 4, null), new VKIDAnalytics.EventParam("unique_session_id", statParams.getSessionId(), null, 4, null), new VKIDAnalytics.EventParam("from_custom_auth", "true", null, 4, null));
    }

    @k
    public final StatParams customAuthStart$vkid_release(@k VKIDAuthParams params) {
        String string = UUID.randomUUID().toString();
        VKIDAnalytics.INSTANCE.trackEvent("custom_auth_start", new VKIDAnalytics.EventParam(HianalyticsBaseData.SDK_TYPE, "vkid", null, 4, null), new VKIDAnalytics.EventParam("unique_session_id", string, null, 4, null), new VKIDAnalytics.EventParam("oauth_service", CustomAuthAnalyticsKt.toAnalyticsParam(params.getOAuth()), null, 4, null));
        return new StatParams("from_custom_auth", string);
    }
}
