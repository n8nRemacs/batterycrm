package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j8c {
    public static final j8c a;
    public static final j8c b;
    public static final j8c c;
    public static final /* synthetic */ j8c[] d;
    public static final /* synthetic */ zg5 o;

    static {
        j8c j8cVar = new j8c("UNKNOWN", 0);
        a = j8cVar;
        j8c j8cVar2 = new j8c("INVISIBLE", 1);
        b = j8cVar2;
        j8c j8cVar3 = new j8c("ON", 2);
        c = j8cVar3;
        j8c[] j8cVarArr = {j8cVar, j8cVar2, j8cVar3};
        d = j8cVarArr;
        o = new zg5(j8cVarArr);
    }

    public static j8c valueOf(String str) {
        return (j8c) Enum.valueOf(j8c.class, str);
    }

    public static j8c[] values() {
        return (j8c[]) d.clone();
    }
}
