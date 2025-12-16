package defpackage;

import java.security.SecureRandom;
import java.util.List;

/* loaded from: classes.dex */
public final class lfe extends h07 {
    public static final byte[] e = {-49, 33, -83, 116, -27, -102, 97, 17, -66, 29, -116, 2, 30, 101, -72, -111, -62, -94, 17, 22, 122, -69, -116, 94, 7, -98, 9, -30, -56, -88, 51, -100};
    public byte[] a;
    public byte[] b;
    public jbg c;
    public List d;

    static {
        new SecureRandom();
    }

    @Override // defpackage.h07
    public final byte[] a() {
        return this.a;
    }

    @Override // defpackage.h07
    public final lbg b() {
        return lbg.server_hello;
    }
}
