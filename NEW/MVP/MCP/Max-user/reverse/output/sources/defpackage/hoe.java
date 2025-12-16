package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hoe {
    public static final hoe X;
    public static final hoe Y;
    public static final /* synthetic */ hoe[] Z;
    public static final hoe a;
    public static final hoe b;
    public static final hoe c;
    public static final hoe d;
    public static final hoe o;

    static {
        hoe hoeVar = new hoe("ACTION", 0);
        a = hoeVar;
        hoe hoeVar2 = new hoe("SIMPLE", 1);
        b = hoeVar2;
        hoe hoeVar3 = new hoe("SIMPLE_WITH_THEMED_ICON", 2);
        c = hoeVar3;
        hoe hoeVar4 = new hoe("NEGATIVE", 3);
        d = hoeVar4;
        hoe hoeVar5 = new hoe("DISABLE", 4);
        o = hoeVar5;
        hoe hoeVar6 = new hoe("SIMPLE_TEXT_ONLY", 5);
        X = hoeVar6;
        hoe hoeVar7 = new hoe("PROMO", 6);
        Y = hoeVar7;
        Z = new hoe[]{hoeVar, hoeVar2, hoeVar3, hoeVar4, hoeVar5, hoeVar6, hoeVar7};
    }

    public static hoe valueOf(String str) {
        return (hoe) Enum.valueOf(hoe.class, str);
    }

    public static hoe[] values() {
        return (hoe[]) Z.clone();
    }
}
