package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class epb {
    public static final epb X;
    public static final epb Y;
    public static final epb Z;
    public static final epb a;
    public static final epb b;
    public static final epb c;
    public static final epb d;
    public static final epb o;
    public static final /* synthetic */ epb[] s0;

    static {
        epb epbVar = new epb("NO_VALUE", 0);
        a = epbVar;
        epb epbVar2 = new epb("ENCODING_INVALID", 1);
        b = epbVar2;
        epb epbVar3 = new epb("ENCODING_PCM_8BIT", 2);
        c = epbVar3;
        epb epbVar4 = new epb("ENCODING_PCM_16BIT", 3);
        d = epbVar4;
        epb epbVar5 = new epb("ENCODING_PCM_16BIT_BIG_ENDIAN", 4);
        o = epbVar5;
        epb epbVar6 = new epb("ENCODING_PCM_24BIT", 5);
        X = epbVar6;
        epb epbVar7 = new epb("ENCODING_PCM_32BIT", 6);
        Y = epbVar7;
        epb epbVar8 = new epb("ENCODING_PCM_FLOAT", 7);
        Z = epbVar8;
        s0 = new epb[]{epbVar, epbVar2, epbVar3, epbVar4, epbVar5, epbVar6, epbVar7, epbVar8};
    }

    public static epb valueOf(String str) {
        return (epb) Enum.valueOf(epb.class, str);
    }

    public static epb[] values() {
        return (epb[]) s0.clone();
    }
}
