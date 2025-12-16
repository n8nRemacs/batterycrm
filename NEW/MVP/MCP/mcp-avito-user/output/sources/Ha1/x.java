package ha1;

import android.view.View;
import java.util.concurrent.ExecutionException;
import ru.mts.biometry.sdk.feature.recognition.ui.camera.z;

/* loaded from: classes9.dex */
public final class x implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f397275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B91.z f397276c;

    public x(z zVar, B91.z zVar2) {
        this.f397275b = zVar;
        this.f397276c = zVar2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws ExecutionException, InterruptedException {
        view.removeOnLayoutChangeListener(this);
        z zVar = this.f397275b;
        zVar.e5().c(zVar.getViewLifecycleOwner(), this.f397276c.f1204g, null);
        zVar.i5().b();
    }
}
