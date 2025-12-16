package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class pzf extends pj0 implements Serializable {
    public final String b;
    public final String c;
    public final String d;

    public pzf(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.pj0
    public String toString() {
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("{error='");
        sb.append(this.b);
        sb.append("', message='");
        sb.append(this.c);
        return ctd.j(sb, "', localizedMessage='", this.d, "'}");
    }
}
