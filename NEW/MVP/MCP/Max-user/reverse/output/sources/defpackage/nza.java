package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nza {
    public static final nza a;
    public static final nza b;
    public static final /* synthetic */ nza[] c;

    static {
        nza nzaVar = new nza("PRIMARY", 0);
        a = nzaVar;
        nza nzaVar2 = new nza("SECONDARY", 1);
        b = nzaVar2;
        c = new nza[]{nzaVar, nzaVar2};
    }

    public static nza valueOf(String str) {
        return (nza) Enum.valueOf(nza.class, str);
    }

    public static nza[] values() {
        return (nza[]) c.clone();
    }
}
