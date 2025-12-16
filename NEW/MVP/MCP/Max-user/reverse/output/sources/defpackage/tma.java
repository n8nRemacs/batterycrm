package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tma {
    public static final tma a;
    public static final /* synthetic */ tma[] b;

    static {
        tma tmaVar = new tma("COMPLETE", 0);
        a = tmaVar;
        b = new tma[]{tmaVar};
    }

    public static boolean a(vta vtaVar, Object obj) {
        if (obj == a) {
            vtaVar.b();
            return true;
        }
        if (obj instanceof rma) {
            vtaVar.onError(((rma) obj).a);
            return true;
        }
        vtaVar.f(obj);
        return false;
    }

    public static boolean c(vta vtaVar, Object obj) {
        if (obj == a) {
            vtaVar.b();
            return true;
        }
        if (obj instanceof rma) {
            vtaVar.onError(((rma) obj).a);
            return true;
        }
        if (obj instanceof qma) {
            vtaVar.c(((qma) obj).a);
            return false;
        }
        vtaVar.f(obj);
        return false;
    }

    public static tma valueOf(String str) {
        return (tma) Enum.valueOf(tma.class, str);
    }

    public static tma[] values() {
        return (tma[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
