package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class etd {
    public static final etd X;
    public static final etd Y;
    public static final etd Z;
    public static final etd a;
    public static final etd b;
    public static final etd c;
    public static final etd d;
    public static final etd o;
    public static final /* synthetic */ etd[] s0;

    static {
        etd etdVar = new etd("NEUTRAL", 0);
        a = etdVar;
        etd etdVar2 = new etd("POSITIVE", 1);
        b = etdVar2;
        etd etdVar3 = new etd("NEGATIVE", 2);
        c = etdVar3;
        etd etdVar4 = new etd("SELECTED", 3);
        d = etdVar4;
        etd etdVar5 = new etd("CONTRAST", 4);
        o = etdVar5;
        etd etdVar6 = new etd("INACTIVE", 5);
        X = etdVar6;
        etd etdVar7 = new etd("SELECTED_THEMED", 6);
        Y = etdVar7;
        etd etdVar8 = new etd("NONE", 7);
        Z = etdVar8;
        s0 = new etd[]{etdVar, etdVar2, etdVar3, etdVar4, etdVar5, etdVar6, etdVar7, etdVar8};
    }

    public static etd valueOf(String str) {
        return (etd) Enum.valueOf(etd.class, str);
    }

    public static etd[] values() {
        return (etd[]) s0.clone();
    }
}
