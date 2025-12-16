package com.yandex.mobile.ads.core.identifiers.ad.gms.service;

import android.content.Intent;
import j.N;

/* loaded from: classes8.dex */
final class f {
    @N
    public static Intent a() {
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        return intent;
    }
}
