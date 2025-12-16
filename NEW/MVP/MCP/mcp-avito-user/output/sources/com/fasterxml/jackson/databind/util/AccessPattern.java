package com.fasterxml.jackson.databind.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AccessPattern {

    /* renamed from: b, reason: collision with root package name */
    public static final AccessPattern f342524b;

    /* renamed from: c, reason: collision with root package name */
    public static final AccessPattern f342525c;

    /* renamed from: d, reason: collision with root package name */
    public static final AccessPattern f342526d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AccessPattern[] f342527e;

    static {
        AccessPattern accessPattern = new AccessPattern("ALWAYS_NULL", 0);
        f342524b = accessPattern;
        AccessPattern accessPattern2 = new AccessPattern("CONSTANT", 1);
        f342525c = accessPattern2;
        AccessPattern accessPattern3 = new AccessPattern("DYNAMIC", 2);
        f342526d = accessPattern3;
        f342527e = new AccessPattern[]{accessPattern, accessPattern2, accessPattern3};
    }

    public AccessPattern() {
        throw null;
    }

    public static AccessPattern valueOf(String str) {
        return (AccessPattern) Enum.valueOf(AccessPattern.class, str);
    }

    public static AccessPattern[] values() {
        return (AccessPattern[]) f342527e.clone();
    }
}
