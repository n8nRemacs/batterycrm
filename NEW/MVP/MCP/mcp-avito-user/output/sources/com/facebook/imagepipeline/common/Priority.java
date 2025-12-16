package com.facebook.imagepipeline.common;

import com.facebook.infer.annotation.Nullsafe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Nullsafe
/* loaded from: classes12.dex */
public final class Priority {

    /* renamed from: b, reason: collision with root package name */
    public static final Priority f340259b;

    /* renamed from: c, reason: collision with root package name */
    public static final Priority f340260c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Priority[] f340261d;

    static {
        Priority priority = new Priority("LOW", 0);
        f340259b = priority;
        Priority priority2 = new Priority("MEDIUM", 1);
        Priority priority3 = new Priority("HIGH", 2);
        f340260c = priority3;
        f340261d = new Priority[]{priority, priority2, priority3};
    }

    public Priority() {
        throw null;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) f340261d.clone();
    }
}
