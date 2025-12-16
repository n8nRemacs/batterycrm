package ha1;

import fa1.C40388b;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class h extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.i f397240l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar) {
        super(0);
        this.f397240l = iVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar = this.f397240l;
        iVar.requireContext();
        z91.e eVar = z91.e.f443907a;
        E91.h hVar = C91.a.f2018e.f3817c;
        iVar.requireContext();
        C40388b c40388b = new C40388b(hVar, z91.e.a().a().f436313b);
        iVar.requireContext();
        W91.h hVarB = z91.e.a().b();
        iVar.requireContext();
        return new w(c40388b, hVarB, z91.e.a().c());
    }
}
