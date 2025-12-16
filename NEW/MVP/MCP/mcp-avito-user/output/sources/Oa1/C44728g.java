package oa1;

import kotlin.jvm.internal.N;
import z91.s;

/* renamed from: oa1.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44728g extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.camera.h f419919l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44728g(ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar) {
        super(0);
        this.f419919l = hVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar = this.f419919l;
        hVar.requireContext();
        s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        la1.c cVar = (la1.c) sVar.f443929i.getValue();
        hVar.requireContext();
        s sVar2 = z91.e.f443908b;
        if (sVar2 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        C91.h hVarC = sVar2.c();
        hVar.requireContext();
        s sVar3 = z91.e.f443908b;
        if (sVar3 != null) {
            return new C44736o(cVar, hVarC, sVar3.b());
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
