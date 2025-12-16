package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c3g {
    public static final /* synthetic */ zg5 X;
    public static final c3g b;
    public static final c3g c;
    public static final c3g d;
    public static final /* synthetic */ c3g[] o;
    public final int a;

    static {
        c3g c3gVar = new c3g("WAITING", 0, 0);
        b = c3gVar;
        c3g c3gVar2 = new c3g("PROCESSING", 1, 10);
        c = c3gVar2;
        c3g c3gVar3 = new c3g("FAILED", 2, 20);
        d = c3gVar3;
        c3g[] c3gVarArr = {c3gVar, c3gVar2, c3gVar3};
        o = c3gVarArr;
        X = new zg5(c3gVarArr);
    }

    public c3g(String str, int i, int i2) {
        this.a = i2;
    }

    public static c3g valueOf(String str) {
        return (c3g) Enum.valueOf(c3g.class, str);
    }

    public static c3g[] values() {
        return (c3g[]) o.clone();
    }
}
