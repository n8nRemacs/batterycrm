package kotlin.reflect.jvm.internal.impl.types.error;

import Y61.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorScopeKind.kt */
/* loaded from: classes8.dex */
public final class ErrorScopeKind {

    /* renamed from: c, reason: collision with root package name */
    public static final ErrorScopeKind f410136c;

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorScopeKind f410137d;

    /* renamed from: e, reason: collision with root package name */
    public static final ErrorScopeKind f410138e;

    /* renamed from: f, reason: collision with root package name */
    public static final ErrorScopeKind f410139f;

    /* renamed from: g, reason: collision with root package name */
    public static final ErrorScopeKind f410140g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ErrorScopeKind[] f410141h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410142i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f410143b;

    static {
        ErrorScopeKind errorScopeKind = new ErrorScopeKind("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
        f410136c = errorScopeKind;
        ErrorScopeKind errorScopeKind2 = new ErrorScopeKind("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
        f410137d = errorScopeKind2;
        ErrorScopeKind errorScopeKind3 = new ErrorScopeKind("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
        ErrorScopeKind errorScopeKind4 = new ErrorScopeKind("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
        f410138e = errorScopeKind4;
        ErrorScopeKind errorScopeKind5 = new ErrorScopeKind("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
        ErrorScopeKind errorScopeKind6 = new ErrorScopeKind("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
        ErrorScopeKind errorScopeKind7 = new ErrorScopeKind("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
        f410139f = errorScopeKind7;
        ErrorScopeKind errorScopeKind8 = new ErrorScopeKind("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
        ErrorScopeKind errorScopeKind9 = new ErrorScopeKind("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
        f410140g = errorScopeKind9;
        ErrorScopeKind[] errorScopeKindArr = {errorScopeKind, errorScopeKind2, errorScopeKind3, errorScopeKind4, errorScopeKind5, errorScopeKind6, errorScopeKind7, errorScopeKind8, errorScopeKind9, new ErrorScopeKind("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s")};
        f410141h = errorScopeKindArr;
        f410142i = kotlin.enums.c.a(errorScopeKindArr);
    }

    public ErrorScopeKind(String str, int i12, String str2) {
        this.f410143b = str2;
    }

    public static ErrorScopeKind valueOf(String str) {
        return (ErrorScopeKind) Enum.valueOf(ErrorScopeKind.class, str);
    }

    public static ErrorScopeKind[] values() {
        return (ErrorScopeKind[]) f410141h.clone();
    }
}
