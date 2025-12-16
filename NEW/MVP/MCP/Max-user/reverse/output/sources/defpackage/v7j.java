package defpackage;

/* loaded from: classes.dex */
public abstract class v7j {
    public static final kz4 a(cm6 cm6Var) {
        zkb zkbVar = new zkb(2, new usd(13, cm6Var));
        kz4 kz4Var = new kz4();
        kz4Var.b = kz4.c;
        kz4Var.a = zkbVar;
        return kz4Var;
    }

    public static hdd b(Integer num) {
        if (num != null) {
            for (hdd hddVar : hdd.values()) {
                if (hddVar.a == num.intValue()) {
                    return hddVar;
                }
            }
        }
        return hdd.UNKNOWN;
    }
}
