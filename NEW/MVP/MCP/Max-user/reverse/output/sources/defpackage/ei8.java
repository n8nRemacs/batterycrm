package defpackage;

/* loaded from: classes2.dex */
public final class ei8 {
    public static final zb8 g = new zb8(4);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginResponse{uid='");
        sb.append(this.a);
        sb.append("', sessionKey='");
        sb.append(this.b);
        sb.append("', secretSessionKey='");
        sb.append(this.c);
        sb.append("', authenticationToken='");
        sb.append(this.d);
        sb.append("', apiServer='");
        sb.append(this.e);
        sb.append("', authenticationHash='");
        return ho7.l(sb, this.f, "'}");
    }
}
