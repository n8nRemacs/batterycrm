package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class fbc {
    public static final fbc X;
    public static final fbc Y;
    public static final /* synthetic */ fbc[] Z;
    public static final fbc d;
    public static final fbc o;
    public static final /* synthetic */ zg5 s0;
    public final n5g a;
    public final s5g b;
    public final s5g c;

    static {
        fbc fbcVar = new fbc("SAVE", 0, new n5g(mvd.A1), new n5g(mvd.D1), new n5g(mvd.C1));
        d = fbcVar;
        fbc fbcVar2 = new fbc("SHARE", 1, new n5g(mvd.S1), null, new n5g(mvd.U1));
        o = fbcVar2;
        fbc fbcVar3 = new fbc("SET_MAIN", 2, new n5g(mvd.D0), new n5g(mvd.m1), null);
        X = fbcVar3;
        fbc fbcVar4 = new fbc(HttpDelete.METHOD_NAME, 3, new n5g(mvd.E0), new n5g(mvd.t1), null);
        Y = fbcVar4;
        fbc[] fbcVarArr = {fbcVar, fbcVar2, fbcVar3, fbcVar4};
        Z = fbcVarArr;
        s0 = new zg5(fbcVarArr);
    }

    public fbc(String str, int i, n5g n5gVar, n5g n5gVar2, n5g n5gVar3) {
        this.a = n5gVar;
        this.b = n5gVar2;
        this.c = n5gVar3;
    }

    public static fbc valueOf(String str) {
        return (fbc) Enum.valueOf(fbc.class, str);
    }

    public static fbc[] values() {
        return (fbc[]) Z.clone();
    }
}
