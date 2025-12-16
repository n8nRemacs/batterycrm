package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes8.dex */
public final class yx {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final o31 f392084a;

    public yx(@Y61.k lo1 lo1Var) {
        this.f392084a = lo1Var;
    }

    @Y61.k
    public final Intent a(@Y61.k Context context, long j12, @Y61.k ResultReceiver resultReceiver) {
        this.f392084a.a();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        ResultReceiver resultReceiverA = g7.a(resultReceiver);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("extra_receiver", resultReceiverA);
        intent.putExtra("data_identifier", j12);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
