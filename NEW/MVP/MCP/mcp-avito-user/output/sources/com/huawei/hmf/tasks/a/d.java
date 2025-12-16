package com.huawei.hmf.tasks.a;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class d extends com.huawei.hmf.tasks.b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f363188a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f363189b = new Object();

    @Override // com.huawei.hmf.tasks.b
    public final d a(Runnable runnable) {
        synchronized (this.f363189b) {
            this.f363188a.add(runnable);
        }
        return this;
    }
}
