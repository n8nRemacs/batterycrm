package com.avito.android.user_advert.advert.service;

import Y61.l;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertService.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-advert_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {
    @Y61.k
    public static final Intent a(@Y61.k Context context, @Y61.k UserAdvertServiceAction userAdvertServiceAction, @Y61.k String str, @l String str2, int i12, @l String str3, @Y61.k String str4, @Y61.k Map<String, String> map) {
        return new Intent(context, (Class<?>) UserAdvertService.class).putExtra("action", userAdvertServiceAction).putExtra("skipCpt", str2).putExtra("advert_id", str).putExtra("notification_id", i12).putExtra("notification_tag", str3).putExtra("notification_analytics", new NotificationAnalyticParams(map, str4));
    }
}
