package defpackage;

import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class gk6 implements lde {
    public int a;
    public Function b;
    public Consumer c;

    @Override // defpackage.lde
    public final int a() {
        return this.a;
    }

    @Override // defpackage.lde
    public final Consumer b() {
        return this.c;
    }

    @Override // defpackage.lde
    public final atc c(int i) {
        return (atc) this.b.apply(Integer.valueOf(i));
    }
}
