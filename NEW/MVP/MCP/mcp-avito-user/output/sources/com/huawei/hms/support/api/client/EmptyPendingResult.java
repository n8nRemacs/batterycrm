package com.huawei.hms.support.api.client;

import android.os.Looper;
import com.huawei.hms.support.api.client.Result;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class EmptyPendingResult<R extends Result> extends PendingResult<R> {

    /* renamed from: a, reason: collision with root package name */
    private R f363627a;

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await() {
        return this.f363627a;
    }

    public R getResult() {
        return this.f363627a;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public boolean isCanceled() {
        return false;
    }

    public void setResult(R r12) {
        this.f363627a = r12;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j12, TimeUnit timeUnit) {
        return this.f363627a;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback, long j12, TimeUnit timeUnit) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void cancel() {
    }
}
