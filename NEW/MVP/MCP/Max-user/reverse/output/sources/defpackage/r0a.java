package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r0a {
    public static final r0a a;
    public static final r0a b;
    public static final r0a c;
    public static final /* synthetic */ r0a[] d;

    static {
        r0a r0aVar = new r0a("X1", 0);
        a = r0aVar;
        r0a r0aVar2 = new r0a("X1_5", 1);
        b = r0aVar2;
        r0a r0aVar3 = new r0a("X2", 2);
        c = r0aVar3;
        d = new r0a[]{r0aVar, r0aVar2, r0aVar3};
    }

    public static r0a valueOf(String str) {
        return (r0a) Enum.valueOf(r0a.class, str);
    }

    public static r0a[] values() {
        return (r0a[]) d.clone();
    }
}
