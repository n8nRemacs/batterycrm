package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class uqc {
    public static final /* synthetic */ yy7[] e = {new toc(uqc.class, "connectionController", "getConnectionController()Lru/ok/tamtam/controllers/ConnectionController;", 0), ho7.d(vid.a, uqc.class, "device", "getDevice()Lru/ok/tamtam/Device;", 0)};
    public static final String f = uqc.class.getName();
    public final age a;
    public final AtomicLong b = new AtomicLong();
    public final kz4 c;
    public final kz4 d;

    public uqc(age ageVar, kz4 kz4Var, kz4 kz4Var2) {
        this.a = ageVar;
        this.c = kz4Var;
        this.d = kz4Var2;
    }

    public final lv4 a() {
        yy7 yy7Var = e[1];
        return (lv4) this.d.get();
    }
}
