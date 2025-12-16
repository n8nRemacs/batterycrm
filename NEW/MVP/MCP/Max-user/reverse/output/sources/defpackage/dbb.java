package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class dbb {
    public static final dbb a;
    public static final dbb b;
    public static final dbb c;
    public static final dbb d;
    public static final /* synthetic */ dbb[] o;

    static {
        dbb dbbVar = new dbb("COLLAPSED", 0);
        a = dbbVar;
        dbb dbbVar2 = new dbb("ANIMATING_COLLAPSE", 1);
        b = dbbVar2;
        dbb dbbVar3 = new dbb("EXPANDED", 2);
        c = dbbVar3;
        dbb dbbVar4 = new dbb("ANIMATING_EXPAND", 3);
        d = dbbVar4;
        o = new dbb[]{dbbVar, dbbVar2, dbbVar3, dbbVar4};
    }

    public static dbb valueOf(String str) {
        return (dbb) Enum.valueOf(dbb.class, str);
    }

    public static dbb[] values() {
        return (dbb[]) o.clone();
    }
}
