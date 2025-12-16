package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class LongSerializationPolicy {

    /* renamed from: b, reason: collision with root package name */
    public static final LongSerializationPolicy f361973b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ LongSerializationPolicy[] f361974c;

    public enum a extends LongSerializationPolicy {
    }

    public enum b extends LongSerializationPolicy {
    }

    static {
        a aVar = new a("DEFAULT", 0, null);
        f361973b = aVar;
        f361974c = new LongSerializationPolicy[]{aVar, new b("STRING", 1, null)};
    }

    public LongSerializationPolicy() {
        throw null;
    }

    public LongSerializationPolicy(String str, int i12, a aVar) {
    }

    public static LongSerializationPolicy valueOf(String str) {
        return (LongSerializationPolicy) Enum.valueOf(LongSerializationPolicy.class, str);
    }

    public static LongSerializationPolicy[] values() {
        return (LongSerializationPolicy[]) f361974c.clone();
    }
}
