package defpackage;

/* loaded from: classes.dex */
public final class l27 {
    public static final l27 c = new l27(j27.c, k27.a);
    public final j27 a;
    public final k27 b;

    public l27(j27 j27Var, k27 k27Var) {
        this.a = j27Var;
        this.b = k27Var;
    }

    public final String toString() {
        StringBuilder sbM = az1.m("HexFormat(\n    upperCase = false,\n    bytes = BytesHexFormat(\n");
        this.a.a(sbM, "        ");
        sbM.append('\n');
        sbM.append("    ),");
        sbM.append('\n');
        sbM.append("    number = NumberHexFormat(");
        sbM.append('\n');
        this.b.a(sbM, "        ");
        sbM.append('\n');
        sbM.append("    )");
        sbM.append('\n');
        sbM.append(")");
        return sbM.toString();
    }
}
