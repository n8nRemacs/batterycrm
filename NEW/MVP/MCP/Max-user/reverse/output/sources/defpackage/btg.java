package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class btg {
    public static final btg a;
    public static final btg b;
    public static final /* synthetic */ btg[] c;

    static {
        btg btgVar = new btg("UNKNOWN", 0);
        a = btgVar;
        btg btgVar2 = new btg("NOT_ENOUGH_VIDEO_TRACKS", 1);
        b = btgVar2;
        c = new btg[]{btgVar, btgVar2};
    }

    public static btg valueOf(String str) {
        return (btg) Enum.valueOf(btg.class, str);
    }

    public static btg[] values() {
        return (btg[]) c.clone();
    }
}
