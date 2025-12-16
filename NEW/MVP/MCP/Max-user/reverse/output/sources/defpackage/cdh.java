package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class cdh {
    public static final /* synthetic */ cdh[] X;
    public static final cdh a;
    public static final cdh b;
    public static final cdh c;
    public static final cdh d;
    public static final cdh o;

    static {
        cdh cdhVar = new cdh("VIDEO", 0);
        a = cdhVar;
        cdh cdhVar2 = new cdh("SCREEN_CAPTURE", 1);
        b = cdhVar2;
        cdh cdhVar3 = new cdh("ANIMOJI", 2);
        c = cdhVar3;
        cdh cdhVar4 = new cdh("MOVIE", 3);
        d = cdhVar4;
        cdh cdhVar5 = new cdh("STREAM", 4);
        o = cdhVar5;
        X = new cdh[]{cdhVar, cdhVar2, cdhVar3, cdhVar4, cdhVar5};
    }

    public static cdh valueOf(String str) {
        return (cdh) Enum.valueOf(cdh.class, str);
    }

    public static cdh[] values() {
        return (cdh[]) X.clone();
    }
}
