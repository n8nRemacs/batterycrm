package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wvg {
    public static final wvg X;
    public static final wvg Y;
    public static final wvg Z;
    public static final wvg b;
    public static final wvg c;
    public static final wvg d;
    public static final wvg o;
    public static final wvg s0;
    public static final wvg t0;
    public static final /* synthetic */ wvg[] u0;
    public static final /* synthetic */ zg5 v0;
    public final int a;

    static {
        wvg wvgVar = new wvg("UNKNOWN", 0, 0);
        b = wvgVar;
        wvg wvgVar2 = new wvg("VIDEO", 1, 1);
        c = wvgVar2;
        wvg wvgVar3 = new wvg("PHOTO", 2, 2);
        d = wvgVar3;
        wvg wvgVar4 = new wvg("PROFILE_PHOTO", 3, 3);
        o = wvgVar4;
        wvg wvgVar5 = new wvg("FILE", 4, 4);
        X = wvgVar5;
        wvg wvgVar6 = new wvg("AUDIO", 5, 5);
        Y = wvgVar6;
        wvg wvgVar7 = new wvg("EXTERNAL_GIF", 6, 6);
        Z = wvgVar7;
        wvg wvgVar8 = new wvg("STICKER", 7, 7);
        s0 = wvgVar8;
        wvg wvgVar9 = new wvg("VIDEO_MESSAGE", 8, 8);
        t0 = wvgVar9;
        wvg[] wvgVarArr = {wvgVar, wvgVar2, wvgVar3, wvgVar4, wvgVar5, wvgVar6, wvgVar7, wvgVar8, wvgVar9};
        u0 = wvgVarArr;
        v0 = new zg5(wvgVarArr);
    }

    public wvg(String str, int i, int i2) {
        this.a = i2;
    }

    public static wvg valueOf(String str) {
        return (wvg) Enum.valueOf(wvg.class, str);
    }

    public static wvg[] values() {
        return (wvg[]) u0.clone();
    }

    public final boolean a() {
        return this == o;
    }

    public final boolean c() {
        return this == s0;
    }
}
