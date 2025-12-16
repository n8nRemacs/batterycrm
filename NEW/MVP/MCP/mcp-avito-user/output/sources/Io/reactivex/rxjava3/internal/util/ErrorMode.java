package io.reactivex.rxjava3.internal.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ErrorMode {

    /* renamed from: b, reason: collision with root package name */
    public static final ErrorMode f404819b;

    /* renamed from: c, reason: collision with root package name */
    public static final ErrorMode f404820c;

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorMode f404821d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ErrorMode[] f404822e;

    static {
        ErrorMode errorMode = new ErrorMode("IMMEDIATE", 0);
        f404819b = errorMode;
        ErrorMode errorMode2 = new ErrorMode("BOUNDARY", 1);
        f404820c = errorMode2;
        ErrorMode errorMode3 = new ErrorMode("END", 2);
        f404821d = errorMode3;
        f404822e = new ErrorMode[]{errorMode, errorMode2, errorMode3};
    }

    public ErrorMode() {
        throw null;
    }

    public static ErrorMode valueOf(String str) {
        return (ErrorMode) Enum.valueOf(ErrorMode.class, str);
    }

    public static ErrorMode[] values() {
        return (ErrorMode[]) f404822e.clone();
    }
}
