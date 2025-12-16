package defpackage;

import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class rr3 {
    public final int a;
    public final wha b;
    public final rde c;
    public final ov3 d;
    public final z6f e;
    public final lu4 f;
    public final byte[] g;
    public final byte[] h;
    public volatile int i = 2;
    public volatile byte[] j;

    public rr3(rde rdeVar, ov3 ov3Var, bh8 bh8Var) {
        this.c = rdeVar;
        z6f z6fVar = new z6f(null, bh8Var);
        this.e = z6fVar;
        this.a = z6fVar.e;
        this.g = z6fVar.b;
        this.d = ov3Var;
        byte[] bArr = new byte[8];
        this.h = bArr;
        new SecureRandom().nextBytes(bArr);
        lu4 lu4Var = new lu4(8, bh8Var);
        lu4Var.b = bArr;
        lu4Var.a.put(0, new or3(0, bArr, 2));
        this.f = lu4Var;
        this.b = new wha(16);
    }

    public final void a() {
        z6f z6fVar = this.e;
        ConcurrentHashMap concurrentHashMap = z6fVar.a;
        int iIntValue = ((Integer) concurrentHashMap.keySet().stream().max(new ov5(28)).get()).intValue() + 1;
        byte[] bArr = new byte[z6fVar.e];
        z6fVar.d.nextBytes(bArr);
        concurrentHashMap.put(Integer.valueOf(iIntValue), new or3(iIntValue, bArr, 1));
        z6fVar.a();
        this.b.getClass();
        qga qgaVar = new qga();
        qgaVar.a = iIntValue;
        qgaVar.b = 0;
        qgaVar.c = bArr;
        byte[] bArr2 = new byte[16];
        qgaVar.d = bArr2;
        qga.o.nextBytes(bArr2);
        this.c.f(qgaVar, hf5.d, new qr3(this, 0));
    }
}
