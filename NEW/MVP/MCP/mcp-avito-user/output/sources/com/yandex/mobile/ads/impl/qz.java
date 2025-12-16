package com.yandex.mobile.ads.impl;

import java.util.concurrent.FutureTask;

/* loaded from: classes8.dex */
public final class qz {
    @Y61.k
    public static FutureTask a(@Y61.k String str) {
        FutureTask futureTask = new FutureTask(new tz(str));
        new Thread(futureTask).start();
        return futureTask;
    }
}
