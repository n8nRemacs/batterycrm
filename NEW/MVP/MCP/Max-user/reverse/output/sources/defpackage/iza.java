package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class iza {
    public static final iza a;
    public static final iza b;
    public static final iza c;
    public static final iza d;
    public static final /* synthetic */ iza[] o;

    static {
        iza izaVar = new iza("PRIMARY", 0);
        a = izaVar;
        iza izaVar2 = new iza("SECONDARY", 1);
        b = izaVar2;
        iza izaVar3 = new iza("TERTIARY", 2);
        c = izaVar3;
        iza izaVar4 = new iza("LINK", 3);
        d = izaVar4;
        o = new iza[]{izaVar, izaVar2, izaVar3, izaVar4};
    }

    public static iza valueOf(String str) {
        return (iza) Enum.valueOf(iza.class, str);
    }

    public static iza[] values() {
        return (iza[]) o.clone();
    }
}
