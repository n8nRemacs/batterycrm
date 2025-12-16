package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class gb1 {
    public static final gb1 X;
    public static final gb1 Y;
    public static final gb1 Z;
    public static final gb1 d;
    public static final gb1 o;
    public static final gb1 s0;
    public static final /* synthetic */ gb1[] t0;
    public final int a;
    public final int b;
    public final s5g c;

    static {
        int i = ivd.Z0;
        gb1 gb1Var = new gb1("VIDEO_ACCEPT", 0, d3d.call_incoming_accept_with_video_accessibility, i, null);
        d = gb1Var;
        int i2 = ivd.D;
        gb1 gb1Var2 = new gb1("AUDIO_ACCEPT", 1, d3d.call_incoming_accept_with_audio_accessibility, i2, null);
        o = gb1Var2;
        gb1 gb1Var3 = new gb1("VIDEO_ACCEPT_WITH_TITLE", 2, m0b.b0, i, new n5g(m0b.d0));
        X = gb1Var3;
        gb1 gb1Var4 = new gb1("AUDIO_ACCEPT_WITH_TITLE", 3, m0b.a0, i2, new n5g(m0b.c0));
        Y = gb1Var4;
        int i3 = ivd.u0;
        int i4 = m0b.h0;
        gb1 gb1Var5 = new gb1("DECLINE", 4, i4, i3, null);
        Z = gb1Var5;
        gb1 gb1Var6 = new gb1("DECLINE_WITH_TITLE", 5, i4, i3, new n5g(m0b.g0));
        s0 = gb1Var6;
        t0 = new gb1[]{gb1Var, gb1Var2, gb1Var3, gb1Var4, gb1Var5, gb1Var6};
    }

    public gb1(String str, int i, int i2, int i3, n5g n5gVar) {
        this.a = i2;
        this.b = i3;
        this.c = n5gVar;
    }

    public static gb1 valueOf(String str) {
        return (gb1) Enum.valueOf(gb1.class, str);
    }

    public static gb1[] values() {
        return (gb1[]) t0.clone();
    }
}
