package O91;

import kotlin.jvm.internal.N;
import z91.s;

/* loaded from: classes9.dex */
public final class i extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j f12046l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j jVar) {
        super(0);
        this.f12046l = jVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j jVar = this.f12046l;
        jVar.requireContext();
        s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        ru.mts.biometry.api.dataSource.j jVar2 = sVar.a().f436312a;
        jVar.requireContext();
        s sVar2 = z91.e.f443908b;
        if (sVar2 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        ru.mts.biometry.api.dataSource.o oVar = sVar2.a().f436313b;
        jVar.requireContext();
        s sVar3 = z91.e.f443908b;
        if (sVar3 != null) {
            return new m(jVar2, oVar, sVar3.b());
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
