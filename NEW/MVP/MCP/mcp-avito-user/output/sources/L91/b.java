package L91;

import android.content.Context;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.camera.ui.n f9817l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ru.mts.biometry.sdk.feature.document.camera.ui.n nVar) {
        super(0);
        this.f9817l = nVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.document.camera.ui.n nVar = this.f9817l;
        Context contextRequireContext = nVar.requireContext();
        nVar.f5();
        return new R91.j(contextRequireContext, z.ke(), new a(nVar));
    }
}
