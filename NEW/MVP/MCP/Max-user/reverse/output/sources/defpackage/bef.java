package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bef {
    public static final bef a;
    public static final bef b;
    public static final bef c;
    public static final /* synthetic */ bef[] d;

    static {
        bef befVar = new bef("DEFAULT", 0);
        a = befVar;
        bef befVar2 = new bef("WITH_CALL_PIP", 1);
        b = befVar2;
        bef befVar3 = new bef("WITH_VIDEO_PIP", 2);
        c = befVar3;
        d = new bef[]{befVar, befVar2, befVar3};
    }

    public static bef valueOf(String str) {
        return (bef) Enum.valueOf(bef.class, str);
    }

    public static bef[] values() {
        return (bef[]) d.clone();
    }
}
