package io.ktor.http.content;

import io.ktor.http.C41535n0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Versions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/VersionCheckResult;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VersionCheckResult {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ VersionCheckResult[] f399954b;

    /* JADX INFO: Fake field, exist only in values array */
    VersionCheckResult EF10;

    static {
        C41535n0.f400082d.getClass();
        f399954b = new VersionCheckResult[]{new VersionCheckResult("OK", 0), new VersionCheckResult("NOT_MODIFIED", 1), new VersionCheckResult("PRECONDITION_FAILED", 2)};
    }

    public VersionCheckResult() {
        throw null;
    }

    public static VersionCheckResult valueOf(String str) {
        return (VersionCheckResult) Enum.valueOf(VersionCheckResult.class, str);
    }

    public static VersionCheckResult[] values() {
        return (VersionCheckResult[]) f399954b.clone();
    }
}
