package com.squareup.picasso;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MemoryPolicy {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MemoryPolicy[] f366363b = {new MemoryPolicy("NO_CACHE", 0), new MemoryPolicy("NO_STORE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    MemoryPolicy EF5;

    public static MemoryPolicy valueOf(String str) {
        return (MemoryPolicy) Enum.valueOf(MemoryPolicy.class, str);
    }

    public static MemoryPolicy[] values() {
        return (MemoryPolicy[]) f366363b.clone();
    }
}
