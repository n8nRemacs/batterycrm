package defpackage;

/* loaded from: classes2.dex */
public enum sg4 {
    DISABLED(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOGS(1),
    /* JADX INFO: Fake field, exist only in values array */
    FILE_LOGS(2),
    DEV_OPTIONS_MENU(3);

    public static final sg4[] d = values();
    public final int a;

    sg4(int i) {
        this.a = i;
    }

    public static sg4 a(int i) {
        for (sg4 sg4Var : d) {
            if (sg4Var.a == i) {
                return sg4Var;
            }
        }
        return DISABLED;
    }
}
