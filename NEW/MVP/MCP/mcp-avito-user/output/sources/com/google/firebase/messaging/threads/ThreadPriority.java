package com.google.firebase.messaging.threads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ThreadPriority {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ThreadPriority[] f361932b = {new ThreadPriority("LOW_POWER", 0), new ThreadPriority("HIGH_SPEED", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ThreadPriority EF5;

    public ThreadPriority() {
        throw null;
    }

    public static ThreadPriority valueOf(String str) {
        return (ThreadPriority) Enum.valueOf(ThreadPriority.class, str);
    }

    public static ThreadPriority[] values() {
        return (ThreadPriority[]) f361932b.clone();
    }
}
