package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gpd {
    public static final /* synthetic */ gpd[] a;
    public static final /* synthetic */ zg5 b;

    static {
        gpd[] gpdVarArr = {new gpd("LIMITED_TO_REVERSE_CONTACTS", 0)};
        a = gpdVarArr;
        b = new zg5(gpdVarArr);
    }

    public static gpd valueOf(String str) {
        return (gpd) Enum.valueOf(gpd.class, str);
    }

    public static gpd[] values() {
        return (gpd[]) a.clone();
    }
}
