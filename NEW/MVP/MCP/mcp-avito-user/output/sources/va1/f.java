package va1;

import kotlin.jvm.internal.N;
import ra1.C47626b;
import z91.s;

/* loaded from: classes9.dex */
public final class f extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g f440851l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g gVar) {
        super(0);
        this.f440851l = gVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g gVar = this.f440851l;
        gVar.requireContext();
        s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        C47626b c47626b = (C47626b) sVar.f443925e.getValue();
        gVar.requireContext();
        s sVar2 = z91.e.f443908b;
        if (sVar2 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        W91.h hVarB = sVar2.b();
        gVar.requireContext();
        s sVar3 = z91.e.f443908b;
        if (sVar3 != null) {
            return new m(c47626b, hVarB, sVar3.c());
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
