package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jnh implements psh {
    public static final jnh X;
    public static final jnh Y;
    public static final jnh Z;
    public static final jnh d;
    public static final jnh o;
    public static final /* synthetic */ jnh[] s0;
    public static final /* synthetic */ zg5 t0;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        jnh jnhVar = new jnh("GET_INFO", 0, "WebAppBiometryGetInfo", "biometry_get_info", 18);
        d = jnhVar;
        jnh jnhVar2 = new jnh("REQUEST_ACCESS", 1, "WebAppBiometryRequestAccess", "biometry_request_access", 9);
        o = jnhVar2;
        jnh jnhVar3 = new jnh("UPDATE_TOKEN", 2, "WebAppBiometryUpdateToken", "biometry_update_token", 10);
        X = jnhVar3;
        jnh jnhVar4 = new jnh("REQUEST_AUTH", 3, "WebAppBiometryRequestAuth", "biometry_request_auth", 11);
        Y = jnhVar4;
        jnh jnhVar5 = new jnh("OPEN_SETTINGS", 4, "WebAppBiometryOpenSettings", "biometry_open_settings", 13);
        Z = jnhVar5;
        jnh[] jnhVarArr = {jnhVar, jnhVar2, jnhVar3, jnhVar4, jnhVar5};
        s0 = jnhVarArr;
        t0 = new zg5(jnhVarArr);
    }

    public jnh(String str, int i, String str2, String str3, Integer num) {
        this.a = str2;
        this.b = str3;
        this.c = num;
    }

    public static jnh valueOf(String str) {
        return (jnh) Enum.valueOf(jnh.class, str);
    }

    public static jnh[] values() {
        return (jnh[]) s0.clone();
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
