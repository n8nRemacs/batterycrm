package defpackage;

/* loaded from: classes.dex */
public final class k27 {
    public static final k27 a;

    static {
        k27 k27Var = new k27();
        if (!cei.a("")) {
            cei.a("");
        }
        a = k27Var;
    }

    public final void a(StringBuilder sb, String str) {
        ho7.r(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
