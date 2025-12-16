package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LookupTracker.kt */
/* loaded from: classes8.dex */
public final class ScopeKind {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ScopeKind[] f407894b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f407895c;

    static {
        ScopeKind[] scopeKindArr = {new ScopeKind("PACKAGE", 0), new ScopeKind("CLASSIFIER", 1)};
        f407894b = scopeKindArr;
        f407895c = c.a(scopeKindArr);
    }

    public ScopeKind() {
        throw null;
    }

    public static ScopeKind valueOf(String str) {
        return (ScopeKind) Enum.valueOf(ScopeKind.class, str);
    }

    public static ScopeKind[] values() {
        return (ScopeKind[]) f407894b.clone();
    }
}
