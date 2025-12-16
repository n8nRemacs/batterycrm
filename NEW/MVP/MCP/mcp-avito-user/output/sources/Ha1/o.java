package ha1;

import B91.z;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* loaded from: classes9.dex */
public final class o implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.p f397249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f397250c;

    public o(ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar, z zVar) {
        this.f397249b = pVar;
        this.f397250c = zVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws ExecutionException, InterruptedException {
        view.removeOnLayoutChangeListener(this);
        ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar = this.f397249b;
        pVar.e5().c(pVar.getViewLifecycleOwner(), this.f397250c.f1204g, pVar.j5());
        pVar.i5().b();
    }
}
