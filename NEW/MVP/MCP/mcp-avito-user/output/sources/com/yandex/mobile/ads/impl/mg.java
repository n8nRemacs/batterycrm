package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes8.dex */
public final class mg {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final o31 f387996a;

    public mg(@Y61.k lo1 lo1Var) {
        this.f387996a = lo1Var;
    }

    @Y61.k
    public final Intent a(@Y61.k Context context, @Y61.k ResultReceiver resultReceiver, @Y61.k String str) {
        this.f387996a.a();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        ResultReceiver resultReceiverA = g7.a(resultReceiver);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_receiver", resultReceiverA);
        intent.putExtra("extra_browser_url", str);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
