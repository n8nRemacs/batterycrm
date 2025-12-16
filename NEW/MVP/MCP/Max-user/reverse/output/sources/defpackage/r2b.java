package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r2b {
    public static final /* synthetic */ r2b[] X;
    public static final r2b a;
    public static final r2b b;
    public static final r2b c;
    public static final r2b d;
    public static final r2b o;

    static {
        r2b r2bVar = new r2b("Themed", 0);
        a = r2bVar;
        r2b r2bVar2 = new r2b("ContrastPinned", 1);
        b = r2bVar2;
        r2b r2bVar3 = new r2b("NeutralStack", 2);
        c = r2bVar3;
        r2b r2bVar4 = new r2b("AccentRed", 3);
        d = r2bVar4;
        r2b r2bVar5 = new r2b("Contrast", 4);
        o = r2bVar5;
        X = new r2b[]{r2bVar, r2bVar2, r2bVar3, r2bVar4, r2bVar5};
    }

    public static r2b valueOf(String str) {
        return (r2b) Enum.valueOf(r2b.class, str);
    }

    public static r2b[] values() {
        return (r2b[]) X.clone();
    }
}
