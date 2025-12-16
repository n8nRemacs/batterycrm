package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wqc {
    public static final wqc a;
    public static final /* synthetic */ wqc[] b;

    static {
        wqc wqcVar = new wqc("DEFAULT", 0);
        a = wqcVar;
        wqc wqcVar2 = new wqc("UNMETERED_ONLY", 1);
        wqc wqcVar3 = new wqc("UNMETERED_OR_DAILY", 2);
        wqc wqcVar4 = new wqc("FAST_IF_RADIO_AWAKE", 3);
        wqc wqcVar5 = new wqc("NEVER", 4);
        wqc wqcVar6 = new wqc("UNRECOGNIZED", 5);
        b = new wqc[]{wqcVar, wqcVar2, wqcVar3, wqcVar4, wqcVar5, wqcVar6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, wqcVar);
        sparseArray.put(1, wqcVar2);
        sparseArray.put(2, wqcVar3);
        sparseArray.put(3, wqcVar4);
        sparseArray.put(4, wqcVar5);
        sparseArray.put(-1, wqcVar6);
    }

    public static wqc valueOf(String str) {
        return (wqc) Enum.valueOf(wqc.class, str);
    }

    public static wqc[] values() {
        return (wqc[]) b.clone();
    }
}
