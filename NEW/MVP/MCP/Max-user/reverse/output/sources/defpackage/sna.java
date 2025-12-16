package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class sna {

    /* JADX INFO: Fake field, exist only in values array */
    sna EF5;
    public static final /* synthetic */ sna[] b = {new sna("ERROR", 0), new sna("SUCCESS", 1), new sna("WARNING", 2)};
    public static final rna Companion = new rna();
    public static final Object a = ipi.b(2, new yq9(6));

    public static sna valueOf(String str) {
        return (sna) Enum.valueOf(sna.class, str);
    }

    public static sna[] values() {
        return (sna[]) b.clone();
    }
}
