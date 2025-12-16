package com.google.android.gms.internal.location;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzdw implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzdw[] f350532b;
    public static final zzdw zza;

    static {
        zzdw zzdwVar = new zzdw("INSTANCE", 0);
        zza = zzdwVar;
        f350532b = new zzdw[]{zzdwVar};
    }

    public static zzdw[] values() {
        return (zzdw[]) f350532b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
