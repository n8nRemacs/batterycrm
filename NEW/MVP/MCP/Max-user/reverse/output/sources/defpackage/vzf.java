package defpackage;

/* loaded from: classes2.dex */
public final class vzf extends pzf {
    public final String X;
    public final String o;

    public vzf(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.o = str4;
        this.X = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzf) || !super.equals(obj)) {
            return false;
        }
        vzf vzfVar = (vzf) obj;
        return fni.a(this.o, vzfVar.o) && fni.a(this.X, vzfVar.X);
    }

    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.o;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.X;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.pzf, defpackage.pj0
    public final String toString() {
        String simpleName = vzf.class.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("{error='");
        sb.append(this.b);
        sb.append("', message='");
        sb.append(this.c);
        ho7.r(sb, "', title='", this.o, "', description='", this.X);
        return ctd.j(sb, "', localizedMessage='", this.d, "'}");
    }
}
