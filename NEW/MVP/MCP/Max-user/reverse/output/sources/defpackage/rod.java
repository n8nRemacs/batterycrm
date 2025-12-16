package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rod {
    public static final /* synthetic */ rod[] b;
    public static final /* synthetic */ zg5 c;
    public final int a;

    static {
        rod[] rodVarArr = {new rod("BODY_0", 0, 0), new rod("BODY_1", 1, 1), new rod("BODY_2", 2, 2), new rod("BODY_3", 3, 3), new rod("BODY_4", 4, 4), new rod("BODY_5", 5, 5), new rod("BODY_6", 6, 6), new rod("BODY_7", 7, 7), new rod("BODY_8", 8, 8), new rod("BODY_9", 9, 9), new rod("BODY_10", 10, 10), new rod("BODY_11", 11, 11), new rod("BODY_12", 12, 12), new rod("BODY_13", 13, 13), new rod("BODY_14", 14, 14), new rod("BODY_15", 15, 15), new rod("BODY_16", 16, 16), new rod("BODY_17", 17, 17), new rod("BODY_18", 18, 18), new rod("BODY_19", 19, 19), new rod("BODY_20", 20, 20), new rod("BODY_21", 21, 21)};
        b = rodVarArr;
        c = new zg5(rodVarArr);
    }

    public rod(String str, int i, int i2) {
        this.a = i2;
    }

    public static rod valueOf(String str) {
        return (rod) Enum.valueOf(rod.class, str);
    }

    public static rod[] values() {
        return (rod[]) b.clone();
    }
}
