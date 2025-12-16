package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class eth implements psh {
    public static final eth a;
    public static final /* synthetic */ eth[] b;
    public static final /* synthetic */ zg5 c;

    static {
        eth ethVar = new eth("REQUEST_PHONE", 0);
        a = ethVar;
        eth[] ethVarArr = {ethVar};
        b = ethVarArr;
        c = new zg5(ethVarArr);
    }

    public static eth valueOf(String str) {
        return (eth) Enum.valueOf(eth.class, str);
    }

    public static eth[] values() {
        return (eth[]) b.clone();
    }

    @Override // defpackage.psh
    public final Integer a() {
        return null;
    }

    @Override // defpackage.psh
    public final String c() {
        return "WebAppRequestPhone";
    }

    @Override // defpackage.psh
    public final String d() {
        return "request_phone";
    }
}
