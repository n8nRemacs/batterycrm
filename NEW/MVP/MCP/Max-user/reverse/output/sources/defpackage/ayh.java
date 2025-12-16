package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ayh {
    public static final zxh Companion;
    public static final Object a;
    public static final ayh b;
    public static final ayh c;
    public static final /* synthetic */ ayh[] d;

    static {
        ayh ayhVar = new ayh("SHARED", 0);
        b = ayhVar;
        ayh ayhVar2 = new ayh("CANCELLED", 1);
        c = ayhVar2;
        d = new ayh[]{ayhVar, ayhVar2};
        Companion = new zxh();
        a = ipi.b(2, new dwh(1));
    }

    public static ayh valueOf(String str) {
        return (ayh) Enum.valueOf(ayh.class, str);
    }

    public static ayh[] values() {
        return (ayh[]) d.clone();
    }
}
