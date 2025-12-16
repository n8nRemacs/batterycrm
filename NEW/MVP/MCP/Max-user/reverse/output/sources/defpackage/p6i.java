package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p6i {
    public static final p6i X;
    public static final /* synthetic */ p6i[] Y;
    public static final /* synthetic */ zg5 Z;
    public static final p6i c;
    public static final p6i d;
    public static final p6i o;
    public final char a;
    public final char b;

    static {
        p6i p6iVar = new p6i("OBJ", 0, '{', '}');
        c = p6iVar;
        p6i p6iVar2 = new p6i("LIST", 1, '[', ']');
        d = p6iVar2;
        p6i p6iVar3 = new p6i("MAP", 2, '{', '}');
        o = p6iVar3;
        p6i p6iVar4 = new p6i("POLY_OBJ", 3, '[', ']');
        X = p6iVar4;
        p6i[] p6iVarArr = {p6iVar, p6iVar2, p6iVar3, p6iVar4};
        Y = p6iVarArr;
        Z = new zg5(p6iVarArr);
    }

    public p6i(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static p6i valueOf(String str) {
        return (p6i) Enum.valueOf(p6i.class, str);
    }

    public static p6i[] values() {
        return (p6i[]) Y.clone();
    }
}
