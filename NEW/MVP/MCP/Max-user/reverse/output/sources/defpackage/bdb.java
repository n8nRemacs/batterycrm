package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bdb {
    public static final bdb a;
    public static final bdb b;
    public static final /* synthetic */ bdb[] c;

    static {
        bdb bdbVar = new bdb("DEFAULT", 0);
        a = bdbVar;
        bdb bdbVar2 = new bdb("ANIMATED", 1);
        b = bdbVar2;
        c = new bdb[]{bdbVar, bdbVar2};
    }

    public static bdb valueOf(String str) {
        return (bdb) Enum.valueOf(bdb.class, str);
    }

    public static bdb[] values() {
        return (bdb[]) c.clone();
    }
}
