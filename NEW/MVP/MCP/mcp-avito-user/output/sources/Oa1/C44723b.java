package oa1;

import kotlin.jvm.internal.N;

/* renamed from: oa1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44723b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.camera.h f419912l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44723b(ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar) {
        super(0);
        this.f419912l = hVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar = this.f419912l;
        return new ma1.e(hVar.requireActivity(), new C44722a(hVar));
    }
}
