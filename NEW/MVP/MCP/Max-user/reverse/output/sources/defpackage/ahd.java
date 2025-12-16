package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ahd {
    public static final ahd X;
    public static final ahd Y;
    public static final ahd Z;
    public static final ahd a;
    public static final ahd b;
    public static final ahd c;
    public static final ahd d;
    public static final ahd o;
    public static final ahd s0;
    public static final /* synthetic */ ahd[] t0;

    static {
        ahd ahdVar = new ahd("CONFIGURING", 0);
        a = ahdVar;
        ahd ahdVar2 = new ahd("PENDING_RECORDING", 1);
        b = ahdVar2;
        ahd ahdVar3 = new ahd("PENDING_PAUSED", 2);
        c = ahdVar3;
        ahd ahdVar4 = new ahd("IDLING", 3);
        d = ahdVar4;
        ahd ahdVar5 = new ahd("RECORDING", 4);
        o = ahdVar5;
        ahd ahdVar6 = new ahd("PAUSED", 5);
        X = ahdVar6;
        ahd ahdVar7 = new ahd("STOPPING", 6);
        Y = ahdVar7;
        ahd ahdVar8 = new ahd("RESETTING", 7);
        Z = ahdVar8;
        ahd ahdVar9 = new ahd("ERROR", 8);
        s0 = ahdVar9;
        t0 = new ahd[]{ahdVar, ahdVar2, ahdVar3, ahdVar4, ahdVar5, ahdVar6, ahdVar7, ahdVar8, ahdVar9};
    }

    public static ahd valueOf(String str) {
        return (ahd) Enum.valueOf(ahd.class, str);
    }

    public static ahd[] values() {
        return (ahd[]) t0.clone();
    }
}
