package da1;

import B91.F;
import L91.r;
import L91.s;
import L91.z;
import aa1.n;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.view.InterfaceC22983P;
import java.util.concurrent.ExecutionException;
import kotlin.collections.C42784z0;

/* loaded from: classes9.dex */
public final class k implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f393931c;

    public k(ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar, F f12) {
        this.f393930b = mVar;
        this.f393931c = f12;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws ExecutionException, InterruptedException {
        view.removeOnLayoutChangeListener(this);
        ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar = this.f393930b;
        aa1.e eVarG5 = mVar.g5();
        InterfaceC22983P viewLifecycleOwner = mVar.getViewLifecycleOwner();
        PreviewView previewView = this.f393931c.f1031d;
        n nVarF5 = mVar.f5();
        eVarG5.getClass();
        eVarG5.f20928b.c(viewLifecycleOwner, previewView, nVarF5);
        kotlin.reflect.n nVar = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436487n0[0];
        z zVar = (z) mVar.f436488h0.a(mVar);
        r rVar = zVar.f9862L;
        zVar.f9862L = new r(rVar.f9845a, C42784z0.f406748b);
        zVar.f9865O.setValue(s.f9847a);
    }
}
