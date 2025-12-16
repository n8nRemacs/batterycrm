package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m2i {
    public static final m2i[] a;
    public static final m2i b;
    public static final m2i c;
    public static final m2i d;
    public static final /* synthetic */ m2i[] o;

    static {
        m2i m2iVar = new m2i("PARENT", 0);
        b = m2iVar;
        m2i m2iVar2 = new m2i("PARENT_OR_TARGET", 1);
        c = m2iVar2;
        m2i m2iVar3 = new m2i("EVERYWHERE", 2);
        d = m2iVar3;
        o = new m2i[]{m2iVar, m2iVar2, m2iVar3};
        a = new m2i[]{m2iVar, m2iVar2, m2iVar3};
    }

    public static m2i valueOf(String str) {
        return (m2i) Enum.valueOf(m2i.class, str);
    }

    public static m2i[] values() {
        return (m2i[]) o.clone();
    }
}
