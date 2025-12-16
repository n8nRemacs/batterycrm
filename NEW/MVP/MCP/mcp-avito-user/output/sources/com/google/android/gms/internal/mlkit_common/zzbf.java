package com.google.android.gms.internal.mlkit_common;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzbf implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzbf[] f351214b;
    public static final zzbf zza;

    static {
        zzbf zzbfVar = new zzbf("INSTANCE", 0);
        zza = zzbfVar;
        f351214b = new zzbf[]{zzbfVar};
    }

    public static zzbf[] values() {
        return (zzbf[]) f351214b.clone();
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
