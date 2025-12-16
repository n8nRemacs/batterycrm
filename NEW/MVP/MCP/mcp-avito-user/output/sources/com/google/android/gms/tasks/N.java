package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class N implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final zza f355658b = new zza(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@j.N Runnable runnable) {
        this.f355658b.post(runnable);
    }
}
