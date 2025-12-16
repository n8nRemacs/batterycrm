package com.huawei.hms.activity.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes7.dex */
public interface BusResponseCallback {
    BusResponseResult innerError(Activity activity, int i12, String str);

    BusResponseResult succeedReturn(Activity activity, int i12, Intent intent);
}
