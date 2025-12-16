package L91;

import android.view.View;
import java.util.concurrent.ExecutionException;
import kotlin.collections.C42784z0;

/* loaded from: classes9.dex */
public final class m implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.camera.ui.n f9836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B91.z f9837c;

    public m(ru.mts.biometry.sdk.feature.document.camera.ui.n nVar, B91.z zVar) {
        this.f9836b = nVar;
        this.f9837c = zVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws ExecutionException, InterruptedException {
        view.removeOnLayoutChangeListener(this);
        kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
        ru.mts.biometry.sdk.feature.document.camera.ui.n nVar = this.f9836b;
        ((Ba1.o) nVar.f436427j0.getValue()).c(nVar.getViewLifecycleOwner(), this.f9837c.f1204g, nVar.e5());
        z zVarF5 = nVar.f5();
        r rVar = zVarF5.f9862L;
        zVarF5.f9862L = new r(rVar.f9845a, C42784z0.f406748b);
        zVarF5.f9865O.setValue(s.f9847a);
    }
}
