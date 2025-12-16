package com.yandex.metrica.networktasks.impl;

import android.net.Uri;
import com.adjust.sdk.Constants;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f382459a;

    public b(String str) {
        if (str != null && str.length() != 0) {
            Uri uri = Uri.parse(str);
            if ("http".equals(uri.getScheme())) {
                str = uri.buildUpon().scheme(Constants.SCHEME).build().toString();
            }
        }
        this.f382459a = str;
    }
}
