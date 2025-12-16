package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ixh implements psh {
    public static final /* synthetic */ ixh[] X;
    public static final /* synthetic */ zg5 Y;
    public static final ixh d;
    public static final ixh o;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        ixh ixhVar = new ixh("SHARE", 0, "WebAppShare", "web_app_share", 14);
        d = ixhVar;
        ixh ixhVar2 = new ixh("MAX_SHARE", 1, "WebAppMaxShare", "web_app_max_share", 15);
        o = ixhVar2;
        ixh[] ixhVarArr = {ixhVar, ixhVar2};
        X = ixhVarArr;
        Y = new zg5(ixhVarArr);
    }

    public ixh(String str, int i, String str2, String str3, Integer num) {
        this.a = str2;
        this.b = str3;
        this.c = num;
    }

    public static ixh valueOf(String str) {
        return (ixh) Enum.valueOf(ixh.class, str);
    }

    public static ixh[] values() {
        return (ixh[]) X.clone();
    }

    @Override // defpackage.psh
    public final Integer a() {
        return this.c;
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
