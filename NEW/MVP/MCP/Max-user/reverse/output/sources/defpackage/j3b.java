package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j3b {
    public static final j3b a;
    public static final j3b b;
    public static final j3b c;
    public static final /* synthetic */ j3b[] d;

    static {
        j3b j3bVar = new j3b("Themed", 0);
        a = j3bVar;
        j3b j3bVar2 = new j3b("ContrastPinned", 1);
        j3b j3bVar3 = new j3b("NeutralFade", 2);
        b = j3bVar3;
        j3b j3bVar4 = new j3b("AccentRed", 3);
        c = j3bVar4;
        d = new j3b[]{j3bVar, j3bVar2, j3bVar3, j3bVar4};
    }

    public static j3b valueOf(String str) {
        return (j3b) Enum.valueOf(j3b.class, str);
    }

    public static j3b[] values() {
        return (j3b[]) d.clone();
    }
}
