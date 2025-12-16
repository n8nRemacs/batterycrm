package xyz.n.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class c4 {

    /* renamed from: b, reason: collision with root package name */
    public static final c4 f442724b;

    /* renamed from: c, reason: collision with root package name */
    public static final c4 f442725c;

    /* renamed from: d, reason: collision with root package name */
    public static final c4 f442726d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c4[] f442727e;

    static {
        c4 c4Var = new c4("CheckboxEnabled", 0);
        f442724b = c4Var;
        c4 c4Var2 = new c4("CheckboxDisabled", 1);
        f442725c = c4Var2;
        c4 c4Var3 = new c4("Text", 2);
        f442726d = c4Var3;
        f442727e = new c4[]{c4Var, c4Var2, c4Var3};
    }

    public c4() {
        throw null;
    }

    public static c4 valueOf(String str) {
        return (c4) Enum.valueOf(c4.class, str);
    }

    public static c4[] values() {
        return (c4[]) f442727e.clone();
    }
}
