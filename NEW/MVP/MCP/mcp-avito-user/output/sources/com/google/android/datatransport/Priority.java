package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Priority {

    /* renamed from: b, reason: collision with root package name */
    public static final Priority f342916b;

    /* renamed from: c, reason: collision with root package name */
    public static final Priority f342917c;

    /* renamed from: d, reason: collision with root package name */
    public static final Priority f342918d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Priority[] f342919e;

    static {
        Priority priority = new Priority("DEFAULT", 0);
        f342916b = priority;
        Priority priority2 = new Priority("VERY_LOW", 1);
        f342917c = priority2;
        Priority priority3 = new Priority("HIGHEST", 2);
        f342918d = priority3;
        f342919e = new Priority[]{priority, priority2, priority3};
    }

    public Priority() {
        throw null;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) f342919e.clone();
    }
}
