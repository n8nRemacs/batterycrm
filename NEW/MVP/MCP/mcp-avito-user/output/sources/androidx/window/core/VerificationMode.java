package androidx.window.core;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/core/VerificationMode;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VerificationMode {

    /* renamed from: b, reason: collision with root package name */
    public static final VerificationMode f55174b;

    /* renamed from: c, reason: collision with root package name */
    public static final VerificationMode f55175c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ VerificationMode[] f55176d;

    static {
        VerificationMode verificationMode = new VerificationMode("STRICT", 0);
        f55174b = verificationMode;
        VerificationMode verificationMode2 = new VerificationMode("LOG", 1);
        VerificationMode verificationMode3 = new VerificationMode("QUIET", 2);
        f55175c = verificationMode3;
        f55176d = new VerificationMode[]{verificationMode, verificationMode2, verificationMode3};
    }

    public VerificationMode() {
        throw null;
    }

    public static VerificationMode valueOf(String str) {
        return (VerificationMode) Enum.valueOf(VerificationMode.class, str);
    }

    public static VerificationMode[] values() {
        return (VerificationMode[]) f55176d.clone();
    }
}
