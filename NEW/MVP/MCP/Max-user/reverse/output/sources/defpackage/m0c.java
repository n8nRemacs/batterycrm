package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m0c {
    public static final m0c a;
    public static final m0c b;
    public static final /* synthetic */ m0c[] c;

    static {
        m0c m0cVar = new m0c("COVER", 0);
        a = m0cVar;
        m0c m0cVar2 = new m0c("FIT", 1);
        b = m0cVar2;
        c = new m0c[]{m0cVar, m0cVar2};
    }

    public static m0c valueOf(String str) {
        return (m0c) Enum.valueOf(m0c.class, str);
    }

    public static m0c[] values() {
        return (m0c[]) c.clone();
    }
}
