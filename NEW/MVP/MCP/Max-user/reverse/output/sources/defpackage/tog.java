package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class tog {
    public static final tog X;
    public static final tog Y;
    public static final tog Z;
    public static final LinkedHashMap b;
    public static final tog c;
    public static final tog d;
    public static final tog o;
    public static final tog s0;
    public static final tog t0;
    public static final /* synthetic */ tog[] u0;
    public final int a;

    static {
        tog togVar = new tog("INTEGER", 0, 0);
        c = togVar;
        tog togVar2 = new tog("FLOAT", 1, 1);
        d = togVar2;
        tog togVar3 = new tog("LONG", 2, 2);
        o = togVar3;
        tog togVar4 = new tog("STRING", 3, 3);
        X = togVar4;
        tog togVar5 = new tog("STRINGS_SET", 4, 4);
        Y = togVar5;
        tog togVar6 = new tog("BOOLEAN", 5, 5);
        Z = togVar6;
        tog togVar7 = new tog("BIG_STRING", 6, 16);
        s0 = togVar7;
        tog togVar8 = new tog("BIG_STRINGS_SET", 7, 17);
        t0 = togVar8;
        tog[] togVarArr = {togVar, togVar2, togVar3, togVar4, togVar5, togVar6, togVar7, togVar8};
        u0 = togVarArr;
        zg5 zg5Var = new zg5(togVarArr);
        int i = to8.i(we3.q(zg5Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(i >= 16 ? i : 16);
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            Object next = f2Var.next();
            linkedHashMap.put(Integer.valueOf(((tog) next).a), next);
        }
        b = linkedHashMap;
    }

    public tog(String str, int i, int i2) {
        this.a = i2;
    }

    public static tog valueOf(String str) {
        return (tog) Enum.valueOf(tog.class, str);
    }

    public static tog[] values() {
        return (tog[]) u0.clone();
    }

    public final int a() {
        return this == t0 ? s0.a() : this.a;
    }
}
