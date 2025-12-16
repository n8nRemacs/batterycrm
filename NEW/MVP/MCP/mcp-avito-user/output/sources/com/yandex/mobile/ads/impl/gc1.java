package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes8.dex */
public final class gc1 {
    @Y61.k
    public static Intent a(@Y61.k Context context, @Y61.k String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }
}
