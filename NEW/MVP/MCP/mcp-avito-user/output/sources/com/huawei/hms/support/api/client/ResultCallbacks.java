package com.huawei.hms.support.api.client;

import com.huawei.hms.common.api.Releasable;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;

@Deprecated
/* loaded from: classes7.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    public abstract void onSuccess(R r12);

    @Override // com.huawei.hms.support.api.client.ResultCallback
    public final void onResult(R r12) {
        try {
            Status status = r12.getStatus();
            if (status.isSuccess()) {
                onSuccess(r12);
            } else {
                onFailure(status);
                if (r12 instanceof Releasable) {
                    ((Releasable) r12).release();
                }
            }
        } catch (Exception e12) {
            HMSLog.w("ResultCallbacks", "Failed to release " + r12 + ", reason: " + e12);
        }
    }
}
