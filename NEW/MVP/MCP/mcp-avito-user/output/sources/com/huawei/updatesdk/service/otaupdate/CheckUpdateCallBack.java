package com.huawei.updatesdk.service.otaupdate;

import android.content.Intent;

/* loaded from: classes7.dex */
public interface CheckUpdateCallBack {
    void onMarketInstallInfo(Intent intent);

    void onMarketStoreError(int i12);

    void onUpdateInfo(Intent intent);

    void onUpdateStoreError(int i12);
}
