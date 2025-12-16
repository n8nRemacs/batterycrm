package defpackage;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zf5 {
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public Long g;
    public String h;
    public int i;
    public String j;
    public Integer k;
    public String l;
    public String m;
    public String n;
    public Locale o;
    public String p;

    public final ag5 a() {
        Objects.requireNonNull(this.a, "conversation id must not be null");
        Objects.requireNonNull(this.e, "endpointBaseUrl must not be null");
        Objects.requireNonNull(this.f, "appVersion must not be null");
        Objects.requireNonNull(this.h, "clientType must not be null");
        Objects.requireNonNull(this.j, "capabilities must not be null");
        return new ag5(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
    }
}
