package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m6c {
    public static final m6c a;
    public static final m6c b;
    public static final m6c c;
    public static final /* synthetic */ m6c[] d;
    public static final /* synthetic */ zg5 o;

    static {
        m6c m6cVar = new m6c("INVISIBLE", 0);
        a = m6cVar;
        m6c m6cVar2 = new m6c("HALF_SCREEN", 1);
        b = m6cVar2;
        m6c m6cVar3 = new m6c("FULL_SCREEN", 2);
        c = m6cVar3;
        m6c[] m6cVarArr = {m6cVar, m6cVar2, m6cVar3};
        d = m6cVarArr;
        o = new zg5(m6cVarArr);
    }

    public static m6c valueOf(String str) {
        return (m6c) Enum.valueOf(m6c.class, str);
    }

    public static m6c[] values() {
        return (m6c[]) d.clone();
    }
}
