package L91;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class n extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public static final n f9838l = new n();

    public n() {
        super(0);
    }

    @Override // Y41.a
    public final Object invoke() {
        z91.s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        Y91.b bVar = (Y91.b) sVar.f443926f.getValue();
        z91.s sVar2 = z91.e.f443908b;
        if (sVar2 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        W91.h hVarB = sVar2.b();
        z91.s sVar3 = z91.e.f443908b;
        if (sVar3 != null) {
            return new z(bVar, hVarB, sVar3.c(), null);
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
