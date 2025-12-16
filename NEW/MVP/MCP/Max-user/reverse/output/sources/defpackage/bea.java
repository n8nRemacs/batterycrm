package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bea {
    public static final SparseArray a;
    public static final /* synthetic */ bea[] b;

    /* JADX INFO: Fake field, exist only in values array */
    bea EF1;

    static {
        bea beaVar = new bea("MOBILE", 0);
        bea beaVar2 = new bea("WIFI", 1);
        bea beaVar3 = new bea("MOBILE_MMS", 2);
        bea beaVar4 = new bea("MOBILE_SUPL", 3);
        bea beaVar5 = new bea("MOBILE_DUN", 4);
        bea beaVar6 = new bea("MOBILE_HIPRI", 5);
        bea beaVar7 = new bea("WIMAX", 6);
        bea beaVar8 = new bea("BLUETOOTH", 7);
        bea beaVar9 = new bea("DUMMY", 8);
        bea beaVar10 = new bea("ETHERNET", 9);
        bea beaVar11 = new bea("MOBILE_FOTA", 10);
        bea beaVar12 = new bea("MOBILE_IMS", 11);
        bea beaVar13 = new bea("MOBILE_CBS", 12);
        bea beaVar14 = new bea("WIFI_P2P", 13);
        bea beaVar15 = new bea("MOBILE_IA", 14);
        bea beaVar16 = new bea("MOBILE_EMERGENCY", 15);
        bea beaVar17 = new bea("PROXY", 16);
        bea beaVar18 = new bea("VPN", 17);
        bea beaVar19 = new bea("NONE", 18);
        b = new bea[]{beaVar, beaVar2, beaVar3, beaVar4, beaVar5, beaVar6, beaVar7, beaVar8, beaVar9, beaVar10, beaVar11, beaVar12, beaVar13, beaVar14, beaVar15, beaVar16, beaVar17, beaVar18, beaVar19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, beaVar);
        sparseArray.put(1, beaVar2);
        sparseArray.put(2, beaVar3);
        sparseArray.put(3, beaVar4);
        sparseArray.put(4, beaVar5);
        sparseArray.put(5, beaVar6);
        sparseArray.put(6, beaVar7);
        sparseArray.put(7, beaVar8);
        sparseArray.put(8, beaVar9);
        sparseArray.put(9, beaVar10);
        sparseArray.put(10, beaVar11);
        sparseArray.put(11, beaVar12);
        sparseArray.put(12, beaVar13);
        sparseArray.put(13, beaVar14);
        sparseArray.put(14, beaVar15);
        sparseArray.put(15, beaVar16);
        sparseArray.put(16, beaVar17);
        sparseArray.put(17, beaVar18);
        sparseArray.put(-1, beaVar19);
    }

    public static bea valueOf(String str) {
        return (bea) Enum.valueOf(bea.class, str);
    }

    public static bea[] values() {
        return (bea[]) b.clone();
    }
}
