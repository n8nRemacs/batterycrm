package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class aea {
    public static final SparseArray a;
    public static final /* synthetic */ aea[] b;

    /* JADX INFO: Fake field, exist only in values array */
    aea EF1;

    static {
        aea aeaVar = new aea("UNKNOWN_MOBILE_SUBTYPE", 0);
        aea aeaVar2 = new aea("GPRS", 1);
        aea aeaVar3 = new aea("EDGE", 2);
        aea aeaVar4 = new aea("UMTS", 3);
        aea aeaVar5 = new aea("CDMA", 4);
        aea aeaVar6 = new aea("EVDO_0", 5);
        aea aeaVar7 = new aea("EVDO_A", 6);
        aea aeaVar8 = new aea("RTT", 7);
        aea aeaVar9 = new aea("HSDPA", 8);
        aea aeaVar10 = new aea("HSUPA", 9);
        aea aeaVar11 = new aea("HSPA", 10);
        aea aeaVar12 = new aea("IDEN", 11);
        aea aeaVar13 = new aea("EVDO_B", 12);
        aea aeaVar14 = new aea("LTE", 13);
        aea aeaVar15 = new aea("EHRPD", 14);
        aea aeaVar16 = new aea("HSPAP", 15);
        aea aeaVar17 = new aea("GSM", 16);
        aea aeaVar18 = new aea("TD_SCDMA", 17);
        aea aeaVar19 = new aea("IWLAN", 18);
        aea aeaVar20 = new aea("LTE_CA", 19);
        b = new aea[]{aeaVar, aeaVar2, aeaVar3, aeaVar4, aeaVar5, aeaVar6, aeaVar7, aeaVar8, aeaVar9, aeaVar10, aeaVar11, aeaVar12, aeaVar13, aeaVar14, aeaVar15, aeaVar16, aeaVar17, aeaVar18, aeaVar19, aeaVar20, new aea("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, aeaVar);
        sparseArray.put(1, aeaVar2);
        sparseArray.put(2, aeaVar3);
        sparseArray.put(3, aeaVar4);
        sparseArray.put(4, aeaVar5);
        sparseArray.put(5, aeaVar6);
        sparseArray.put(6, aeaVar7);
        sparseArray.put(7, aeaVar8);
        sparseArray.put(8, aeaVar9);
        sparseArray.put(9, aeaVar10);
        sparseArray.put(10, aeaVar11);
        sparseArray.put(11, aeaVar12);
        sparseArray.put(12, aeaVar13);
        sparseArray.put(13, aeaVar14);
        sparseArray.put(14, aeaVar15);
        sparseArray.put(15, aeaVar16);
        sparseArray.put(16, aeaVar17);
        sparseArray.put(17, aeaVar18);
        sparseArray.put(18, aeaVar19);
        sparseArray.put(19, aeaVar20);
    }

    public static aea valueOf(String str) {
        return (aea) Enum.valueOf(aea.class, str);
    }

    public static aea[] values() {
        return (aea[]) b.clone();
    }
}
