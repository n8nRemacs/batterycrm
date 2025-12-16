package defpackage;

/* loaded from: classes.dex */
public final class xf3 extends u08 implements sm6 {
    public static final xf3 X;
    public static final xf3 Y;
    public static final xf3 Z;
    public static final xf3 b;
    public static final xf3 c;
    public static final xf3 d;
    public static final xf3 o;
    public final /* synthetic */ int a;

    static {
        int i = 2;
        b = new xf3(i, 0);
        c = new xf3(i, 1);
        d = new xf3(i, 2);
        o = new xf3(i, 3);
        X = new xf3(i, 4);
        Y = new xf3(i, 5);
        Z = new xf3(i, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xf3(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yf3 yf3Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                v74 v74Var = (v74) obj2;
                if (str.length() != 0) {
                    break;
                } else {
                    break;
                }
            case 1:
                v74 v74Var2 = (v74) obj2;
                x74 x74VarMinusKey = ((x74) obj).minusKey(v74Var2.getKey());
                bd5 bd5Var = bd5.a;
                if (x74VarMinusKey != bd5Var) {
                    jbe jbeVar = jbe.t0;
                    r44 r44Var = (r44) x74VarMinusKey.get(jbeVar);
                    if (r44Var == null) {
                        yf3Var = new yf3(x74VarMinusKey, v74Var2);
                    } else {
                        x74 x74VarMinusKey2 = x74VarMinusKey.minusKey(jbeVar);
                        if (x74VarMinusKey2 == bd5Var) {
                            break;
                        } else {
                            yf3Var = new yf3(new yf3(x74VarMinusKey2, v74Var2), r44Var);
                        }
                    }
                    break;
                }
                break;
            case 2:
                break;
        }
        return Boolean.valueOf(fni.a(obj, obj2));
    }
}
