package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o0c {
    public static final o0c a;
    public static final o0c b;
    public static final /* synthetic */ o0c[] c;

    static {
        o0c o0cVar = new o0c("COVER", 0);
        a = o0cVar;
        o0c o0cVar2 = new o0c("FIT", 1);
        b = o0cVar2;
        c = new o0c[]{o0cVar, o0cVar2};
    }

    public static o0c valueOf(String str) {
        return (o0c) Enum.valueOf(o0c.class, str);
    }

    public static o0c[] values() {
        return (o0c[]) c.clone();
    }
}
