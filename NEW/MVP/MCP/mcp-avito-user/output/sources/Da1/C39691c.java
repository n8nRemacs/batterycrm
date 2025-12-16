package da1;

import aa1.n;
import kotlin.jvm.internal.N;

/* renamed from: da1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C39691c extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393916l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39691c(ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar) {
        super(0);
        this.f393916l = mVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar = this.f393916l;
        return new n(mVar.requireContext(), new C39690b(mVar));
    }
}
