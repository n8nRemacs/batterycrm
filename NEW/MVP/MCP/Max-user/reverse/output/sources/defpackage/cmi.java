package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cmi {
    public static final cmi a;
    public static final /* synthetic */ cmi[] b;

    static {
        cmi cmiVar = new cmi("DEFAULT", 0);
        a = cmiVar;
        b = new cmi[]{cmiVar, new cmi("SIGNED", 1), new cmi("FIXED", 2)};
    }

    public static cmi[] values() {
        return (cmi[]) b.clone();
    }
}
