package T91;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class i extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.h f15456l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ru.mts.biometry.sdk.feature.documentResult.ui.h hVar) {
        super(0);
        this.f15456l = hVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.documentResult.ui.h hVar = this.f15456l;
        hVar.requireContext();
        z91.s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        Z91.b bVar = (Z91.b) sVar.f443927g.getValue();
        hVar.requireContext();
        z91.s sVar2 = z91.e.f443908b;
        if (sVar2 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        C91.h hVarC = sVar2.c();
        hVar.requireContext();
        z91.s sVar3 = z91.e.f443908b;
        if (sVar3 != null) {
            return new z(bVar, hVarC, sVar3.b(), ((Boolean) hVar.f436455j0.getValue()).booleanValue());
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
