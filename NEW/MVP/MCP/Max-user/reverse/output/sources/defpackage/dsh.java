package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class dsh implements psh {
    public static final /* synthetic */ zg5 X;
    public static final dsh c;
    public static final dsh d;
    public static final /* synthetic */ dsh[] o;
    public final String a;
    public final String b;

    static {
        dsh dshVar = new dsh("OPEN_LINK", 0, "WebAppOpenLink", "open_link");
        c = dshVar;
        dsh dshVar2 = new dsh("OPEN_MAX_LINK", 1, "WebAppOpenMaxLink", "open_max_link");
        d = dshVar2;
        dsh[] dshVarArr = {dshVar, dshVar2};
        o = dshVarArr;
        X = new zg5(dshVarArr);
    }

    public dsh(String str, int i, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static dsh valueOf(String str) {
        return (dsh) Enum.valueOf(dsh.class, str);
    }

    public static dsh[] values() {
        return (dsh[]) o.clone();
    }

    @Override // defpackage.psh
    public final Integer a() {
        return null;
    }

    @Override // defpackage.psh
    public final String c() {
        return this.a;
    }

    @Override // defpackage.psh
    public final String d() {
        return this.b;
    }
}
