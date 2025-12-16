package N91;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class t extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u f11289l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u uVar) {
        super(0);
        this.f11289l = uVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u uVar = this.f11289l;
        uVar.requireContext();
        z91.s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        ru.mts.biometry.api.dataSource.j jVar = sVar.a().f436312a;
        uVar.requireContext();
        z91.s sVar2 = z91.e.f443908b;
        if (sVar2 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        ru.mts.biometry.api.dataSource.o oVar = sVar2.a().f436313b;
        uVar.requireContext();
        z91.s sVar3 = z91.e.f443908b;
        if (sVar3 != null) {
            return new O91.m(jVar, oVar, sVar3.b());
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
