package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a0f {
    public static final /* synthetic */ a0f[] b;
    public static final /* synthetic */ zg5 c;
    public final String a;

    static {
        a0f[] a0fVarArr = {new a0f("CANCELED", 0, "CANCELED"), new a0f("REJECTED", 1, "REJECTED"), new a0f("HUNGUP", 2, "HUNGUP"), new a0f("MISSED", 3, "MISSED"), new a0f("TIMEOUT", 4, "TIMEOUT"), new a0f("BUSY", 5, "BUSY"), new a0f("FAILED", 6, "FAILED"), new a0f("REMOVED", 7, "REMOVED"), new a0f("BANNED", 8, "BANNED"), new a0f("ANOTHER_DEVICE", 9, "ANOTHER_DEVICE"), new a0f("KILLED", 10, "KILLED"), new a0f("CALL_TIMEOUT", 11, "CALL_TIMEOUT")};
        b = a0fVarArr;
        c = new zg5(a0fVarArr);
    }

    public a0f(String str, int i, String str2) {
        this.a = str2;
    }

    public static final a0f a(String str) {
        Object next;
        f2 f2Var = new f2(0, c);
        while (true) {
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((a0f) next).a.equals(str)) {
                break;
            }
        }
        return (a0f) next;
    }

    public static a0f valueOf(String str) {
        return (a0f) Enum.valueOf(a0f.class, str);
    }

    public static a0f[] values() {
        return (a0f[]) b.clone();
    }
}
