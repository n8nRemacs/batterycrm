package defpackage;

/* loaded from: classes2.dex */
public final class kp8 {
    public final cf8 a;
    public final long b;
    public final long c;
    public final np8 d;
    public final String e;
    public final String f;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final boolean k;
    public final String l;

    public kp8(jp8 jp8Var) {
        this.a = jp8Var.a;
        this.b = jp8Var.b;
        this.c = jp8Var.c;
        this.d = jp8Var.d;
        this.e = jp8Var.e;
        this.f = jp8Var.f;
        this.g = jp8Var.g;
        this.h = jp8Var.h;
        this.i = jp8Var.i;
        this.j = jp8Var.j;
        this.k = jp8Var.k;
        this.l = jp8Var.l;
    }

    public final jp8 a() {
        jp8 jp8Var = new jp8(this.a);
        jp8Var.b = this.b;
        jp8Var.c = this.c;
        jp8Var.d = this.d;
        jp8Var.e = this.e;
        jp8Var.f = this.f;
        jp8Var.g = this.g;
        jp8Var.h = this.h;
        jp8Var.i = this.i;
        jp8Var.j = this.j;
        jp8Var.k = this.k;
        jp8Var.l = this.l;
        return jp8Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkerData{location=");
        sb.append(this.a);
        sb.append(", contactId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", markerWeight=");
        sb.append(this.d);
        sb.append(", title='");
        sb.append(this.e);
        sb.append("', address='");
        sb.append(this.f);
        sb.append("', distance=");
        sb.append(this.g);
        sb.append(", live=");
        sb.append(this.h);
        sb.append(", decoding=");
        sb.append(this.i);
        sb.append(", date=");
        sb.append(this.j);
        sb.append(", active=");
        sb.append(this.k);
        sb.append(", deviceId='");
        return ho7.l(sb, this.l, "'}");
    }
}
