package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class UiExecutor implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final UiExecutor f360801b;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    public static final Handler f360802c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ UiExecutor[] f360803d;

    static {
        UiExecutor uiExecutor = new UiExecutor("INSTANCE", 0);
        f360801b = uiExecutor;
        f360803d = new UiExecutor[]{uiExecutor};
        f360802c = new Handler(Looper.getMainLooper());
    }

    public UiExecutor() {
        throw null;
    }

    public static UiExecutor valueOf(String str) {
        return (UiExecutor) Enum.valueOf(UiExecutor.class, str);
    }

    public static UiExecutor[] values() {
        return (UiExecutor[]) f360803d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f360802c.post(runnable);
    }
}
