package K91;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class o extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.o f9322l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ru.mts.biometry.sdk.feature.address.ui.o oVar) {
        super(0);
        this.f9322l = oVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.address.ui.o oVar = this.f9322l;
        oVar.requireContext();
        z91.s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        C91.h hVarC = sVar.c();
        oVar.requireContext();
        z91.s sVar2 = z91.e.f443908b;
        if (sVar2 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        I91.c cVar = (I91.c) sVar2.f443930j.getValue();
        oVar.requireContext();
        z91.s sVar3 = z91.e.f443908b;
        if (sVar3 != null) {
            return new b(hVarC, cVar, sVar3.b());
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
