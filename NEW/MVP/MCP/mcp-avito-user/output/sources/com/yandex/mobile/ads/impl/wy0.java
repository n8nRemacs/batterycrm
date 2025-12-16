package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes8.dex */
public final class wy0 {
    public static void a(@j.N Uri.Builder builder, @j.P Integer num) {
        if (num != null) {
            a(builder, "cmp_present", Integer.toString(num.intValue()));
        }
    }

    public static void a(@j.N Uri.Builder builder, @j.N String str, @j.P String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
