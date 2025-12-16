package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class atf {
    public static final atf a;
    public static final atf b;
    public static final atf c;
    public static final /* synthetic */ atf[] d;

    static {
        atf atfVar = new atf("ALREADY_DOWNLOADING_BY_OTHER", 0);
        a = atfVar;
        atf atfVar2 = new atf("FINISH", 1);
        b = atfVar2;
        atf atfVar3 = new atf("ERROR", 2);
        c = atfVar3;
        d = new atf[]{atfVar, atfVar2, atfVar3};
    }

    public static atf valueOf(String str) {
        return (atf) Enum.valueOf(atf.class, str);
    }

    public static atf[] values() {
        return (atf[]) d.clone();
    }
}
