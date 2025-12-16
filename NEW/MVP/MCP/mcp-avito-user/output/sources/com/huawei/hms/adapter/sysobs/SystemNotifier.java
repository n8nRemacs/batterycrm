package com.huawei.hms.adapter.sysobs;

import android.content.Intent;

/* loaded from: classes7.dex */
public interface SystemNotifier {
    void notifyNoticeObservers(int i12);

    void notifyObservers(int i12);

    void notifyObservers(Intent intent, String str);

    void registerObserver(SystemObserver systemObserver);

    void unRegisterObserver(SystemObserver systemObserver);
}
