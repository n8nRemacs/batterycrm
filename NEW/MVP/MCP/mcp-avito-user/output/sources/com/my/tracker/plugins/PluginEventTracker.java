package com.my.tracker.plugins;

import com.my.tracker.obfuscated.C37848w;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public final class PluginEventTracker {

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f365899b = Executors.newSingleThreadExecutor();

    /* renamed from: a, reason: collision with root package name */
    private final C37848w f365900a;

    private PluginEventTracker(C37848w c37848w) {
        this.f365900a = c37848w;
    }

    public static PluginEventTracker newTracker(C37848w c37848w) {
        return new PluginEventTracker(c37848w);
    }

    public static void onBackground(Runnable runnable) {
        f365899b.execute(runnable);
    }

    public void trackPluginEvent(int i12, byte[] bArr, boolean z12, boolean z13, Runnable runnable) {
        this.f365900a.a(i12, bArr, z12, z13, runnable);
    }
}
