package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class y implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final y f362395b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ y[] f362396c;

    static {
        y yVar = new y("INSTANCE", 0);
        f362395b = yVar;
        f362396c = new y[]{yVar};
    }

    public static y[] values() {
        return (y[]) f362396c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@j.N Runnable runnable) {
        C37640i.a().f362337a.post(runnable);
    }
}
