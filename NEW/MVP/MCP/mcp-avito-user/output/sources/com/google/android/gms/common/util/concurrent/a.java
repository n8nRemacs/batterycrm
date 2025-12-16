package com.google.android.gms.common.util.concurrent;

import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import j.N;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class a implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final zzi f349604b;

    @RX0.a
    public a(@N Looper looper) {
        this.f349604b = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@N Runnable runnable) {
        this.f349604b.post(runnable);
    }
}
