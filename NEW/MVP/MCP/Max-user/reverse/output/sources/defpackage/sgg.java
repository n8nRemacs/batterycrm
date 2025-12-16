package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sgg {
    public static final sgg X;
    public static final sgg Y;
    public static final sgg Z;
    public static final sgg a;
    public static final sgg b;
    public static final sgg c;
    public static final sgg d;
    public static final sgg o;
    public static final sgg s0;
    public static final sgg t0;
    public static final /* synthetic */ sgg[] u0;

    static {
        sgg sggVar = new sgg("client_hello", 0);
        a = sggVar;
        sgg sggVar2 = new sgg("server_hello", 1);
        b = sggVar2;
        sgg sggVar3 = new sgg("new_session_ticket", 2);
        sgg sggVar4 = new sgg("end_of_early_data", 3);
        sgg sggVar5 = new sgg("encrypted_extensions", 4);
        c = sggVar5;
        sgg sggVar6 = new sgg("certificate", 5);
        sgg sggVar7 = new sgg("certificate_request", 6);
        d = sggVar7;
        sgg sggVar8 = new sgg("certificate_verify", 7);
        sgg sggVar9 = new sgg("finished", 8);
        sgg sggVar10 = new sgg("key_update", 9);
        sgg sggVar11 = new sgg("server_certificate", 10);
        o = sggVar11;
        sgg sggVar12 = new sgg("server_certificate_verify", 11);
        X = sggVar12;
        sgg sggVar13 = new sgg("server_finished", 12);
        Y = sggVar13;
        sgg sggVar14 = new sgg("client_certificate", 13);
        Z = sggVar14;
        sgg sggVar15 = new sgg("client_certificate_verify", 14);
        s0 = sggVar15;
        sgg sggVar16 = new sgg("client_finished", 15);
        t0 = sggVar16;
        u0 = new sgg[]{sggVar, sggVar2, sggVar3, sggVar4, sggVar5, sggVar6, sggVar7, sggVar8, sggVar9, sggVar10, sggVar11, sggVar12, sggVar13, sggVar14, sggVar15, sggVar16};
    }

    public static sgg valueOf(String str) {
        return (sgg) Enum.valueOf(sgg.class, str);
    }

    public static sgg[] values() {
        return (sgg[]) u0.clone();
    }
}
