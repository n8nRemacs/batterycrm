package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u2i {
    public static final u2i b;
    public static final /* synthetic */ u2i[] c;
    public static final /* synthetic */ zg5 d;
    public final short a;

    static {
        u2i u2iVar = new u2i("UNKNOWN", 0, (short) 0);
        b = u2iVar;
        u2i[] u2iVarArr = {u2iVar, new u2i("ADAPTIVE_ICON", 1, (short) 1), new u2i("PICTURE", 2, (short) 2), new u2i("TITLE_BIG", 3, (short) 3), new u2i("TITLE_STANDARD", 4, (short) 4), new u2i("DESCRIPTION", 5, (short) 5), new u2i("FILE", 6, (short) 6), new u2i("KEYBOARD", 7, (short) 7)};
        c = u2iVarArr;
        d = new zg5(u2iVarArr);
    }

    public u2i(String str, int i, short s) {
        this.a = s;
    }

    public static u2i valueOf(String str) {
        return (u2i) Enum.valueOf(u2i.class, str);
    }

    public static u2i[] values() {
        return (u2i[]) c.clone();
    }
}
