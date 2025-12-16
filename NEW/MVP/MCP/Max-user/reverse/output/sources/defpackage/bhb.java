package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bhb {
    public static final bhb X;
    public static final bhb Y;
    public static final bhb Z;
    public static final bhb a;
    public static final bhb b;
    public static final bhb c;
    public static final bhb d;
    public static final bhb o;
    public static final bhb s0;
    public static final /* synthetic */ bhb[] t0;

    static {
        bhb bhbVar = new bhb("UNKNOWN", 0);
        a = bhbVar;
        bhb bhbVar2 = new bhb("MEDIA", 1);
        b = bhbVar2;
        bhb bhbVar3 = new bhb("MEDIA_INITIALIZATION", 2);
        c = bhbVar3;
        bhb bhbVar4 = new bhb("DRM", 3);
        d = bhbVar4;
        bhb bhbVar5 = new bhb("MANIFEST", 4);
        o = bhbVar5;
        bhb bhbVar6 = new bhb("TIME_SYNCHRONIZATION", 5);
        X = bhbVar6;
        bhb bhbVar7 = new bhb("AD", 6);
        Y = bhbVar7;
        bhb bhbVar8 = new bhb("MEDIA_PROGRESSIVE_LIVE", 7);
        Z = bhbVar8;
        bhb bhbVar9 = new bhb("CUSTOM_BASE", 8);
        s0 = bhbVar9;
        t0 = new bhb[]{bhbVar, bhbVar2, bhbVar3, bhbVar4, bhbVar5, bhbVar6, bhbVar7, bhbVar8, bhbVar9};
    }

    public static bhb valueOf(String str) {
        return (bhb) Enum.valueOf(bhb.class, str);
    }

    public static bhb[] values() {
        return (bhb[]) t0.clone();
    }
}
