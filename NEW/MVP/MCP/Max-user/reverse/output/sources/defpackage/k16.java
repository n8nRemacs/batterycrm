package defpackage;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class k16 implements lde {
    public final atc a;
    public final Consumer b;

    public k16(atc atcVar, Consumer consumer) {
        this.a = atcVar;
        this.b = consumer;
    }

    @Override // defpackage.lde
    public final int a() {
        return this.a.c();
    }

    @Override // defpackage.lde
    public final Consumer b() {
        return this.b;
    }

    @Override // defpackage.lde
    public final atc c(int i) {
        return this.a;
    }
}
