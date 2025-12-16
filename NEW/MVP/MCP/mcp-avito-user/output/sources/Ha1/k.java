package ha1;

import android.content.Context;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class k extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.p f397244l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar) {
        super(0);
        this.f397244l = pVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar = this.f397244l;
        Context contextRequireContext = pVar.requireContext();
        pVar.i5();
        return new R91.j(contextRequireContext, w.ke(), new j(pVar));
    }
}
