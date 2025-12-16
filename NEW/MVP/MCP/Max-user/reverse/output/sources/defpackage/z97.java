package defpackage;

/* loaded from: classes2.dex */
public final class z97 {
    public final aa7 a;
    public final String b;

    public z97(String str, String str2, String str3, aa7 aa7Var) {
        this.a = aa7Var;
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=");
        x97.a(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            x97.a(sb, str2);
        }
        sb.append("\r\n");
        if (str3 != null) {
            sb.append("Content-Type: ");
            sb.append(str3);
            sb.append("\r\n");
        }
        this.b = sb.toString();
    }
}
