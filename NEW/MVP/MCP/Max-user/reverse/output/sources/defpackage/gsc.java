package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gsc {
    public static final gsc X;
    public static final gsc Y;
    public static final gsc Z;
    public static final gsc s0;
    public static final gsc t0;
    public static final gsc u0;
    public static final /* synthetic */ gsc[] v0;
    public static final /* synthetic */ zg5 w0;
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int o;

    static {
        gsc gscVar = new gsc("P_2160", 0, "4K", 0, 3840, 2160, 20736000);
        X = gscVar;
        gsc gscVar2 = new gsc("P_1440", 1, "2K", 1, 2560, 1440, 9216000);
        gsc gscVar3 = new gsc("P_1080", 2, "1080p", 2, 1920, 1080, 5222400);
        Y = gscVar3;
        gsc gscVar4 = new gsc("P_720", 3, "720p", 3, 1280, 720, 2304000);
        Z = gscVar4;
        gsc gscVar5 = new gsc("P_480", 4, "480p", 4, 853, 480, 1024000);
        s0 = gscVar5;
        gsc gscVar6 = new gsc("P_360", 5, "360p", 5, 640, 360, 576000);
        t0 = gscVar6;
        gsc gscVar7 = new gsc("P_240", 6, "240p", 6, 426, 240, 255720);
        gsc gscVar8 = new gsc("P_144", 7, "144p", 7, 256, 144, 92160);
        u0 = gscVar8;
        gsc[] gscVarArr = {gscVar, gscVar2, gscVar3, gscVar4, gscVar5, gscVar6, gscVar7, gscVar8};
        v0 = gscVarArr;
        w0 = new zg5(gscVarArr);
    }

    public gsc(String str, int i, String str2, int i2, int i3, int i4, int i5) {
        this.a = str2;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.o = i5;
    }

    public static gsc valueOf(String str) {
        return (gsc) Enum.valueOf(gsc.class, str);
    }

    public static gsc[] values() {
        return (gsc[]) v0.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityValue(");
        sb.append(this.b);
        sb.append("|");
        sb.append(this.a);
        sb.append("|");
        hf3.g(sb, this.c, "x", this.d, "|");
        return ho7.j(sb, this.o, ")");
    }
}
