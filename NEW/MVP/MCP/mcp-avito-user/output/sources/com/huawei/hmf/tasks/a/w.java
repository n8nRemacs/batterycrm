package com.huawei.hmf.tasks.a;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
public final class w {

    public static class a<TResult> implements com.huawei.hmf.tasks.f, com.huawei.hmf.tasks.h, com.huawei.hmf.tasks.i<TResult> {

        /* renamed from: b, reason: collision with root package name */
        public final CountDownLatch f363207b = new CountDownLatch(1);

        @Override // com.huawei.hmf.tasks.h
        public final void onFailure(Exception exc) {
            this.f363207b.countDown();
        }

        @Override // com.huawei.hmf.tasks.i
        public final void onSuccess(TResult tresult) {
            this.f363207b.countDown();
        }
    }
}
