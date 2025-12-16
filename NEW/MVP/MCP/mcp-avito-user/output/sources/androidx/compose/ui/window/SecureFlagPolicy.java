package androidx.compose.ui.window;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SecureFlagPolicy.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SecureFlagPolicy {

    /* renamed from: b, reason: collision with root package name */
    public static final SecureFlagPolicy f43062b;

    /* renamed from: c, reason: collision with root package name */
    public static final SecureFlagPolicy f43063c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SecureFlagPolicy[] f43064d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f43065e;

    static {
        SecureFlagPolicy secureFlagPolicy = new SecureFlagPolicy("Inherit", 0);
        f43062b = secureFlagPolicy;
        SecureFlagPolicy secureFlagPolicy2 = new SecureFlagPolicy("SecureOn", 1);
        f43063c = secureFlagPolicy2;
        SecureFlagPolicy[] secureFlagPolicyArr = {secureFlagPolicy, secureFlagPolicy2, new SecureFlagPolicy("SecureOff", 2)};
        f43064d = secureFlagPolicyArr;
        f43065e = kotlin.enums.c.a(secureFlagPolicyArr);
    }

    public SecureFlagPolicy() {
        throw null;
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) f43064d.clone();
    }
}
