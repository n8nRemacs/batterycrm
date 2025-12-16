package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m9c {
    public static final m9c a;
    public static final m9c b;
    public static final m9c c;
    public static final /* synthetic */ m9c[] d;

    static {
        m9c m9cVar = new m9c("LOW", 0);
        a = m9cVar;
        m9c m9cVar2 = new m9c("MEDIUM", 1);
        b = m9cVar2;
        m9c m9cVar3 = new m9c("HIGH", 2);
        c = m9cVar3;
        d = new m9c[]{m9cVar, m9cVar2, m9cVar3};
    }

    public static m9c valueOf(String str) {
        return (m9c) Enum.valueOf(m9c.class, str);
    }

    public static m9c[] values() {
        return (m9c[]) d.clone();
    }
}
