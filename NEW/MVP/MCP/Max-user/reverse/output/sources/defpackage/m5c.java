package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m5c {
    public static final m5c a;
    public static final m5c b;
    public static final m5c c;
    public static final /* synthetic */ m5c[] d;

    static {
        m5c m5cVar = new m5c("Initial", 0);
        a = m5cVar;
        m5c m5cVar2 = new m5c("Handshake", 1);
        b = m5cVar2;
        m5c m5cVar3 = new m5c("App", 2);
        c = m5cVar3;
        d = new m5c[]{m5cVar, m5cVar2, m5cVar3};
    }

    public static m5c valueOf(String str) {
        return (m5c) Enum.valueOf(m5c.class, str);
    }

    public static m5c[] values() {
        return (m5c[]) d.clone();
    }

    public final hf5 a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return hf5.a;
        }
        if (iOrdinal == 1) {
            return hf5.c;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return hf5.d;
    }
}
