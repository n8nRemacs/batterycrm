package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectExecutor.java */
@InterfaceC37531b0
@XY0.b
/* renamed from: com.google.common.util.concurrent.a0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class EnumC37529a0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC37529a0 f360553b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC37529a0[] f360554c;

    static {
        EnumC37529a0 enumC37529a0 = new EnumC37529a0("INSTANCE", 0);
        f360553b = enumC37529a0;
        f360554c = new EnumC37529a0[]{enumC37529a0};
    }

    public EnumC37529a0() {
        throw null;
    }

    public static EnumC37529a0 valueOf(String str) {
        return (EnumC37529a0) Enum.valueOf(EnumC37529a0.class, str);
    }

    public static EnumC37529a0[] values() {
        return (EnumC37529a0[]) f360554c.clone();
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
