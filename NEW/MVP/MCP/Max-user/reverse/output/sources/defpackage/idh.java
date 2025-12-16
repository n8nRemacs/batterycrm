package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class idh {
    public static final idh a;
    public static final idh b;
    public static final /* synthetic */ idh[] c;

    static {
        idh idhVar = new idh("ASPECT_RATIO", 0);
        a = idhVar;
        idh idhVar2 = new idh("FILL", 1);
        b = idhVar2;
        c = new idh[]{idhVar, idhVar2};
    }

    public static idh valueOf(String str) {
        return (idh) Enum.valueOf(idh.class, str);
    }

    public static idh[] values() {
        return (idh[]) c.clone();
    }
}
