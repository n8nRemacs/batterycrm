package io.reactivex.rxjava3.internal.util;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class HashMapSupplier implements l41.s<Map<Object, Object>> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ HashMapSupplier[] f404823b = {new HashMapSupplier("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    HashMapSupplier EF5;

    public HashMapSupplier() {
        throw null;
    }

    public static HashMapSupplier valueOf(String str) {
        return (HashMapSupplier) Enum.valueOf(HashMapSupplier.class, str);
    }

    public static HashMapSupplier[] values() {
        return (HashMapSupplier[]) f404823b.clone();
    }

    @Override // l41.s
    public final Map<Object, Object> get() {
        return new HashMap();
    }
}
