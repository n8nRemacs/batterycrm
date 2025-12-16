package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class la5 {
    public static final la5 X;
    public static final la5 Y;
    public static final /* synthetic */ la5[] Z;
    public static final tha d;
    public static final la5 o;
    public static final /* synthetic */ zg5 s0;
    public final int a;
    public final s5g b;
    public final int c;

    static {
        la5 la5Var = new la5("RECENT", 0, -1, new n5g(x5b.l), yud.X1);
        o = la5Var;
        la5 la5Var2 = new la5("CLASSIC", 1, 0, new n5g(x5b.b), yud.T0);
        X = la5Var2;
        la5 la5Var3 = new la5("GESTURES_AND_PEOPLE", 2, 1, new n5g(x5b.e), yud.T);
        la5 la5Var4 = new la5("ANIMALS_AND_PLANTS", 3, 2, new n5g(x5b.a), v5b.h);
        la5 la5Var5 = new la5("FOOD_AND_DRINK", 4, 3, new n5g(x5b.d), v5b.b);
        la5 la5Var6 = new la5("SPORT_AND_ACTIVITY", 5, 4, new n5g(x5b.g), v5b.c);
        la5 la5Var7 = new la5("TRAVELS_AND_TRANSPORT", 6, 5, new n5g(x5b.i), v5b.d);
        la5 la5Var8 = new la5("OBJECTS", 7, 6, new n5g(x5b.f), v5b.g);
        la5 la5Var9 = new la5("SYMBOLS", 8, 7, new n5g(x5b.h), v5b.j);
        la5 la5Var10 = new la5("FLAGS", 9, 8, new n5g(x5b.c), v5b.f);
        la5 la5Var11 = new la5("ANIMOJI", 10, 9, s5g.b, 0);
        Y = la5Var11;
        la5[] la5VarArr = {la5Var, la5Var2, la5Var3, la5Var4, la5Var5, la5Var6, la5Var7, la5Var8, la5Var9, la5Var10, la5Var11};
        Z = la5VarArr;
        s0 = new zg5(la5VarArr);
        d = new tha(19);
    }

    public la5(String str, int i, int i2, s5g s5gVar, int i3) {
        this.a = i2;
        this.b = s5gVar;
        this.c = i3;
    }

    public static la5 valueOf(String str) {
        return (la5) Enum.valueOf(la5.class, str);
    }

    public static la5[] values() {
        return (la5[]) Z.clone();
    }
}
