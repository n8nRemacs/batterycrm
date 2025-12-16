package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class vk9 {
    public static final /* synthetic */ vk9[] X;
    public static final vk9 a;
    public static final vk9 b;
    public static final vk9 c;
    public static final vk9 d;
    public static final vk9 o;

    static {
        vk9 vk9Var = new vk9("SIMPLE", 0);
        a = vk9Var;
        vk9 vk9Var2 = new vk9("CONTACT", 1);
        b = vk9Var2;
        vk9 vk9Var3 = new vk9("MEDIA", 2);
        c = vk9Var3;
        vk9 vk9Var4 = new vk9("STICKER", 3);
        d = vk9Var4;
        vk9 vk9Var5 = new vk9("FORWARD", 4);
        o = vk9Var5;
        X = new vk9[]{vk9Var, vk9Var2, vk9Var3, vk9Var4, vk9Var5};
    }

    public static vk9 valueOf(String str) {
        return (vk9) Enum.valueOf(vk9.class, str);
    }

    public static vk9[] values() {
        return (vk9[]) X.clone();
    }
}
