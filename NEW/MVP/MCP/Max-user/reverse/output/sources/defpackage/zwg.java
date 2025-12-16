package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zwg {
    public static final zwg X;
    public static final /* synthetic */ zwg[] Y;
    public static final zwg a;
    public static final zwg b;
    public static final zwg c;
    public static final zwg d;
    public static final zwg o;

    static {
        zwg zwgVar = new zwg("IMAGE_CAPTURE", 0);
        a = zwgVar;
        zwg zwgVar2 = new zwg("PREVIEW", 1);
        b = zwgVar2;
        zwg zwgVar3 = new zwg("IMAGE_ANALYSIS", 2);
        c = zwgVar3;
        zwg zwgVar4 = new zwg("VIDEO_CAPTURE", 3);
        d = zwgVar4;
        zwg zwgVar5 = new zwg("STREAM_SHARING", 4);
        o = zwgVar5;
        zwg zwgVar6 = new zwg("METERING_REPEATING", 5);
        X = zwgVar6;
        Y = new zwg[]{zwgVar, zwgVar2, zwgVar3, zwgVar4, zwgVar5, zwgVar6};
    }

    public static zwg valueOf(String str) {
        return (zwg) Enum.valueOf(zwg.class, str);
    }

    public static zwg[] values() {
        return (zwg[]) Y.clone();
    }
}
