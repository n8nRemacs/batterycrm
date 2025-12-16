package defpackage;

import java.util.LinkedHashSet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 zo8, still in use, count: 1, list:
  (r0v0 zo8) from 0x0089: FILLED_NEW_ARRAY (r0v0 zo8), (r1v1 zo8), (r2v2 zo8), (r8v4 zo8) A[WRAPPED] elemType: zo8
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zo8 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(s0d.markdown_original, mvd.w0),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(s0d.markdown_heading, mvd.t0),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(s0d.markdown_bold, mvd.s0),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(s0d.markdown_italic, mvd.u0),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(s0d.markdown_underline, mvd.A0),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(s0d.markdown_mono, mvd.v0),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(s0d.markdown_strikethrough, mvd.z0),
    /* JADX INFO: Fake field, exist only in values array */
    EF7(s0d.markdown_link, mvd.r0),
    X(s0d.markdown_quote, mvd.x0),
    /* JADX INFO: Fake field, exist only in values array */
    EF9(s0d.markdown_regular, mvd.y0);

    public static final mni c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet o;
    public final int a;
    public final int b;

    static {
        zo8 zo8Var = EF1;
        zo8 zo8Var2 = EF2;
        zo8 zo8Var3 = X;
        c = new mni();
        d = gke.d(zo8Var, zo8Var, zo8Var2, zo8Var3);
        o = gke.d(zo8Var, zo8Var2, zo8Var, zo8Var, zo8Var, zo8Var, zo8Var, zo8Var3, zo8Var);
    }

    public zo8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static zo8 valueOf(String str) {
        return (zo8) Enum.valueOf(zo8.class, str);
    }

    public static zo8[] values() {
        return (zo8[]) Y.clone();
    }
}
