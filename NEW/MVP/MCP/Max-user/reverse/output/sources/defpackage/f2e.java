package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f2e {
    public static final f2e a;
    public static final f2e b;
    public static final f2e c;
    public static final f2e d;
    public static final /* synthetic */ f2e[] o;

    static {
        f2e f2eVar = new f2e("STARTED", 0);
        a = f2eVar;
        f2e f2eVar2 = new f2e("ERROR", 1);
        b = f2eVar2;
        f2e f2eVar3 = new f2e("FINISHED", 2);
        c = f2eVar3;
        f2e f2eVar4 = new f2e("INIT", 3);
        d = f2eVar4;
        o = new f2e[]{f2eVar, f2eVar2, f2eVar3, f2eVar4};
    }

    public static f2e valueOf(String str) {
        return (f2e) Enum.valueOf(f2e.class, str);
    }

    public static f2e[] values() {
        return (f2e[]) o.clone();
    }
}
