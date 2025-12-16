package com.huawei.hms.api;

import android.content.Intent;

/* loaded from: classes7.dex */
public class UserRecoverableException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final Intent f363326a;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f363326a = intent;
    }

    public Intent getIntent() {
        return new Intent(this.f363326a);
    }
}
