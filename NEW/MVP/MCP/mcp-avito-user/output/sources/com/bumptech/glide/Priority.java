package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Priority {

    /* renamed from: b, reason: collision with root package name */
    public static final Priority f338667b;

    /* renamed from: c, reason: collision with root package name */
    public static final Priority f338668c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Priority[] f338669d;

    /* JADX INFO: Fake field, exist only in values array */
    Priority EF0;

    static {
        Priority priority = new Priority("IMMEDIATE", 0);
        Priority priority2 = new Priority("HIGH", 1);
        Priority priority3 = new Priority("NORMAL", 2);
        f338667b = priority3;
        Priority priority4 = new Priority("LOW", 3);
        f338668c = priority4;
        f338669d = new Priority[]{priority, priority2, priority3, priority4};
    }

    public Priority() {
        throw null;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) f338669d.clone();
    }
}
