package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d3c {
    public static final /* synthetic */ zg5 X;
    public static final d3c b;
    public static final d3c c;
    public static final d3c d;
    public static final /* synthetic */ d3c[] o;
    public final float a;

    static {
        d3c d3cVar = new d3c(1.0f, 0, "X1");
        b = d3cVar;
        d3c d3cVar2 = new d3c(1.5f, 1, "X1_5");
        c = d3cVar2;
        d3c d3cVar3 = new d3c(2.0f, 2, "X2");
        d = d3cVar3;
        d3c[] d3cVarArr = {d3cVar, d3cVar2, d3cVar3};
        o = d3cVarArr;
        X = new zg5(d3cVarArr);
    }

    public d3c(float f, int i, String str) {
        this.a = f;
    }

    public static d3c valueOf(String str) {
        return (d3c) Enum.valueOf(d3c.class, str);
    }

    public static d3c[] values() {
        return (d3c[]) o.clone();
    }
}
