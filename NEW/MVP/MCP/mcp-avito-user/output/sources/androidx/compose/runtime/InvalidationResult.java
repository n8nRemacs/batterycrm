package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/InvalidationResult;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InvalidationResult {

    /* renamed from: b, reason: collision with root package name */
    public static final InvalidationResult f37981b;

    /* renamed from: c, reason: collision with root package name */
    public static final InvalidationResult f37982c;

    /* renamed from: d, reason: collision with root package name */
    public static final InvalidationResult f37983d;

    /* renamed from: e, reason: collision with root package name */
    public static final InvalidationResult f37984e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ InvalidationResult[] f37985f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f37986g;

    static {
        InvalidationResult invalidationResult = new InvalidationResult("IGNORED", 0);
        f37981b = invalidationResult;
        InvalidationResult invalidationResult2 = new InvalidationResult("SCHEDULED", 1);
        f37982c = invalidationResult2;
        InvalidationResult invalidationResult3 = new InvalidationResult("DEFERRED", 2);
        f37983d = invalidationResult3;
        InvalidationResult invalidationResult4 = new InvalidationResult("IMMINENT", 3);
        f37984e = invalidationResult4;
        InvalidationResult[] invalidationResultArr = {invalidationResult, invalidationResult2, invalidationResult3, invalidationResult4};
        f37985f = invalidationResultArr;
        f37986g = kotlin.enums.c.a(invalidationResultArr);
    }

    public InvalidationResult() {
        throw null;
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) f37985f.clone();
    }
}
