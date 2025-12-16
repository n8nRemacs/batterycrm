package com.huawei.hms.support.api.client;

import android.app.Activity;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;

@Deprecated
/* loaded from: classes7.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f363628a;

    /* renamed from: b, reason: collision with root package name */
    private final int f363629b;

    public ResolvingResultCallbacks(Activity activity, int i12) {
        this.f363628a = (Activity) Preconditions.checkNotNull(activity, "Activity must not be null");
        this.f363629b = i12;
    }

    @Override // com.huawei.hms.support.api.client.ResultCallbacks
    public final void onFailure(Status status) {
        try {
            if (status.hasResolution()) {
                status.startResolutionForResult(this.f363628a, this.f363629b);
            } else {
                onUnresolvableFailure(status);
            }
        } catch (Exception e12) {
            HMSLog.e("ResolvingResultCallbacks", "Failed to start resolution: " + e12);
            onUnresolvableFailure(Status.RESULT_INTERNAL_ERROR);
        }
    }

    @Override // com.huawei.hms.support.api.client.ResultCallbacks
    public abstract void onSuccess(R r12);

    public abstract void onUnresolvableFailure(Status status);
}
