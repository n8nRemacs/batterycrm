package ru.uxfeedback.pub.sdk;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/uxfeedback/pub/sdk/UxFbTargetPlatform;", "", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UxFbTargetPlatform {

    /* renamed from: b, reason: collision with root package name */
    public static final UxFbTargetPlatform f437151b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ UxFbTargetPlatform[] f437152c;

    static {
        UxFbTargetPlatform uxFbTargetPlatform = new UxFbTargetPlatform("NATIVE", 0);
        f437151b = uxFbTargetPlatform;
        f437152c = new UxFbTargetPlatform[]{uxFbTargetPlatform, new UxFbTargetPlatform("RN", 1), new UxFbTargetPlatform("FLUTTER", 2)};
    }

    public UxFbTargetPlatform() {
        throw null;
    }

    public static UxFbTargetPlatform valueOf(String str) {
        return (UxFbTargetPlatform) Enum.valueOf(UxFbTargetPlatform.class, str);
    }

    public static UxFbTargetPlatform[] values() {
        return (UxFbTargetPlatform[]) f437152c.clone();
    }
}
