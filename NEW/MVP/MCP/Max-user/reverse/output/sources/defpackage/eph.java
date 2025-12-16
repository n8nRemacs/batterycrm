package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class eph implements psh {
    public static final eph a;
    public static final /* synthetic */ eph[] b;
    public static final /* synthetic */ zg5 c;

    static {
        eph ephVar = new eph("OPEN", 0);
        a = ephVar;
        eph[] ephVarArr = {ephVar};
        b = ephVarArr;
        c = new zg5(ephVarArr);
    }

    public static eph valueOf(String str) {
        return (eph) Enum.valueOf(eph.class, str);
    }

    public static eph[] values() {
        return (eph[]) b.clone();
    }

    @Override // defpackage.psh
    public final Integer a() {
        return 30;
    }

    @Override // defpackage.psh
    public final String c() {
        return "WebAppOpenCodeReader";
    }

    @Override // defpackage.psh
    public final String d() {
        return "open_code_reader";
    }
}
