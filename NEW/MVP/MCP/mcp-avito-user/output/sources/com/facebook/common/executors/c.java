package com.facebook.common.executors;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: DefaultSerialExecutorService.java */
@Nullsafe
/* loaded from: classes5.dex */
public class c extends b implements g {
    @Override // com.facebook.common.executors.b, java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        super.execute(runnable);
        throw null;
    }
}
