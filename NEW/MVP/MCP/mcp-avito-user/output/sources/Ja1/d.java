package ja1;

import fa1.C40389c;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import z91.s;

/* loaded from: classes9.dex */
public final class d extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.intro.e f405653l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru.mts.biometry.sdk.feature.recognition.ui.intro.e eVar) {
        super(0);
        this.f405653l = eVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.recognition.ui.intro.e eVar = this.f405653l;
        eVar.requireContext();
        s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        C40389c c40389c = new C40389c(sVar.a().f436313b);
        n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.intro.e.f436502i0;
        eVar.requireContext();
        s sVar2 = z91.e.f443908b;
        if (sVar2 != null) {
            return new f(c40389c, sVar2.b());
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
