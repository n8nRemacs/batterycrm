package ru.uxfeedback.pub.sdk;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/uxfeedback/pub/sdk/UxFbLifecycleRule;", "", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UxFbLifecycleRule {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ UxFbLifecycleRule[] f437150b = {new UxFbLifecycleRule("ON_START", 0), new UxFbLifecycleRule("ON_RESUME", 1), new UxFbLifecycleRule("SKIP", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    UxFbLifecycleRule EF5;

    public UxFbLifecycleRule() {
        throw null;
    }

    public static UxFbLifecycleRule valueOf(String str) {
        return (UxFbLifecycleRule) Enum.valueOf(UxFbLifecycleRule.class, str);
    }

    public static UxFbLifecycleRule[] values() {
        return (UxFbLifecycleRule[]) f437150b.clone();
    }
}
