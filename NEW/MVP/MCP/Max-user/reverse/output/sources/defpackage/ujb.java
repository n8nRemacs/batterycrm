package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ujb {
    public static final ujb a;
    public static final ujb b;
    public static final /* synthetic */ ujb[] c;

    static {
        ujb ujbVar = new ujb("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = ujbVar;
        ujb ujbVar2 = new ujb("DROP_WORK_REQUEST", 1);
        b = ujbVar2;
        c = new ujb[]{ujbVar, ujbVar2};
    }

    public static ujb valueOf(String str) {
        return (ujb) Enum.valueOf(ujb.class, str);
    }

    public static ujb[] values() {
        return (ujb[]) c.clone();
    }
}
