package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l9c {
    public static final l9c a;
    public static final l9c b;
    public static final l9c c;
    public static final /* synthetic */ l9c[] d;

    static {
        l9c l9cVar = new l9c("DEFAULT", 0);
        a = l9cVar;
        l9c l9cVar2 = new l9c("VERY_LOW", 1);
        b = l9cVar2;
        l9c l9cVar3 = new l9c("HIGHEST", 2);
        c = l9cVar3;
        d = new l9c[]{l9cVar, l9cVar2, l9cVar3};
    }

    public static l9c valueOf(String str) {
        return (l9c) Enum.valueOf(l9c.class, str);
    }

    public static l9c[] values() {
        return (l9c[]) d.clone();
    }
}
