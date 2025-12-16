package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vfh {
    public static final vfh a;
    public static final vfh b;
    public static final vfh c;
    public static final /* synthetic */ vfh[] d;

    static {
        vfh vfhVar = new vfh("SPEAKER", 0);
        a = vfhVar;
        vfh vfhVar2 = new vfh("SHARING", 1);
        b = vfhVar2;
        vfh vfhVar3 = new vfh("GRID", 2);
        c = vfhVar3;
        d = new vfh[]{vfhVar, vfhVar2, vfhVar3};
    }

    public static vfh valueOf(String str) {
        return (vfh) Enum.valueOf(vfh.class, str);
    }

    public static vfh[] values() {
        return (vfh[]) d.clone();
    }
}
