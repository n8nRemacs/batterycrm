package xyz.n.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class v7 {

    /* renamed from: b, reason: collision with root package name */
    public static final v7 f442808b;

    /* renamed from: c, reason: collision with root package name */
    public static final v7 f442809c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v7[] f442810d;

    static {
        v7 v7Var = new v7("ATTACH", 0);
        f442808b = v7Var;
        v7 v7Var2 = new v7("TAKE", 1);
        f442809c = v7Var2;
        f442810d = new v7[]{v7Var, v7Var2};
    }

    public v7() {
        throw null;
    }

    public static v7 valueOf(String str) {
        return (v7) Enum.valueOf(v7.class, str);
    }

    public static v7[] values() {
        return (v7[]) f442810d.clone();
    }
}
