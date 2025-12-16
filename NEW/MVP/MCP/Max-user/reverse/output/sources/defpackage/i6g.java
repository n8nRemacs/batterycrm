package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i6g {
    public static final i6g a;
    public static final i6g b;
    public static final i6g c;
    public static final i6g d;
    public static final /* synthetic */ i6g[] o;

    static {
        i6g i6gVar = new i6g("PHOTO", 0);
        a = i6gVar;
        i6g i6gVar2 = new i6g("GIF", 1);
        b = i6gVar2;
        i6g i6gVar3 = new i6g("VIDEO", 2);
        c = i6gVar3;
        i6g i6gVar4 = new i6g("AUDIO", 3);
        d = i6gVar4;
        o = new i6g[]{i6gVar, i6gVar2, i6gVar3, i6gVar4};
    }

    public static i6g valueOf(String str) {
        return (i6g) Enum.valueOf(i6g.class, str);
    }

    public static i6g[] values() {
        return (i6g[]) o.clone();
    }
}
