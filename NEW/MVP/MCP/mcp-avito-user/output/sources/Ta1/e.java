package ta1;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class e extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.camera.i f439286l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar) {
        super(0);
        this.f439286l = iVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar = this.f439286l;
        return new C48629c(iVar.requireContext(), new d(iVar));
    }
}
