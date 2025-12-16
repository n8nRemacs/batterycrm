package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* loaded from: classes7.dex */
public class BundleResult {

    /* renamed from: a, reason: collision with root package name */
    private int f363625a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f363626b;

    public BundleResult(int i12, Bundle bundle) {
        this.f363625a = i12;
        this.f363626b = bundle;
    }

    public int getResultCode() {
        return this.f363625a;
    }

    public Bundle getRspBody() {
        return this.f363626b;
    }

    public void setResultCode(int i12) {
        this.f363625a = i12;
    }

    public void setRspBody(Bundle bundle) {
        this.f363626b = bundle;
    }
}
