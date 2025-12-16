package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bbb {
    public static final bbb a;
    public static final bbb b;
    public static final /* synthetic */ bbb[] c;

    static {
        bbb bbbVar = new bbb("BUTTON", 0);
        a = bbbVar;
        bbb bbbVar2 = new bbb("ICON", 1);
        b = bbbVar2;
        c = new bbb[]{bbbVar, bbbVar2};
    }

    public static bbb valueOf(String str) {
        return (bbb) Enum.valueOf(bbb.class, str);
    }

    public static bbb[] values() {
        return (bbb[]) c.clone();
    }
}
