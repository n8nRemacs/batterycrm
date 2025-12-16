package K91;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class h extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.g f9313l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ru.mts.biometry.sdk.feature.address.ui.g gVar) {
        super(0);
        this.f9313l = gVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.address.ui.g gVar = this.f9313l;
        gVar.requireContext();
        z91.s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        C91.h hVarC = sVar.c();
        gVar.requireContext();
        z91.s sVar2 = z91.e.f443908b;
        if (sVar2 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        I91.c cVar = (I91.c) sVar2.f443930j.getValue();
        gVar.requireContext();
        z91.s sVar3 = z91.e.f443908b;
        if (sVar3 != null) {
            return new b(hVarC, cVar, sVar3.b());
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
