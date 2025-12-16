package com.yandex.mobile.ads.core.identifiers.ad.huawei;

import android.content.Intent;
import j.N;

/* loaded from: classes8.dex */
final class d {
    @N
    public static Intent a() {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        return intent;
    }
}
