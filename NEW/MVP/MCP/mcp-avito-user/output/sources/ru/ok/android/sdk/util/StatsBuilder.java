package ru.ok.android.sdk.util;

import org.json.JSONArray;

/* loaded from: classes9.dex */
public class StatsBuilder {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f436710b = {new Type("COUNTER", 0), new Type("SELECT", 1), new Type("INTERVAL", 2), new Type("STATUS", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f436710b.clone();
        }
    }

    public StatsBuilder() {
        System.currentTimeMillis();
        new JSONArray();
    }
}
