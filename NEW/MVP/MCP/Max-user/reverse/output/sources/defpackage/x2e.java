package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class x2e {
    public static final x2e a;
    public static final x2e b;
    public static final x2e c;
    public static final /* synthetic */ x2e[] d;

    static {
        x2e x2eVar = new x2e("UNREAD", 0);
        a = x2eVar;
        x2e x2eVar2 = new x2e("MENTION", 1);
        b = x2eVar2;
        x2e x2eVar3 = new x2e("REACTION", 2);
        c = x2eVar3;
        d = new x2e[]{x2eVar, x2eVar2, x2eVar3};
    }

    public static x2e valueOf(String str) {
        return (x2e) Enum.valueOf(x2e.class, str);
    }

    public static x2e[] values() {
        return (x2e[]) d.clone();
    }
}
