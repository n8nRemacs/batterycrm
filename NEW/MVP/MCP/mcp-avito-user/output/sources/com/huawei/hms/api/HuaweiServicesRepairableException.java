package com.huawei.hms.api;

import android.content.Intent;

/* loaded from: classes7.dex */
public class HuaweiServicesRepairableException extends UserRecoverableException {

    /* renamed from: b, reason: collision with root package name */
    private final int f363316b;

    public HuaweiServicesRepairableException(int i12, String str, Intent intent) {
        super(str, intent);
        this.f363316b = i12;
    }

    public int getConnectionStatusCode() {
        return this.f363316b;
    }
}
