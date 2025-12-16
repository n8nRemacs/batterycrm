package ta1;

import B91.C13108a;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* loaded from: classes9.dex */
public final class i implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.camera.i f439292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C13108a f439293c;

    public i(ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar, C13108a c13108a) {
        this.f439292b = iVar;
        this.f439293c = c13108a;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws ExecutionException, InterruptedException {
        view.removeOnLayoutChangeListener(this);
        ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar = this.f439292b;
        iVar.f436522i0.c(iVar.getViewLifecycleOwner(), this.f439293c.f1088b, (C48629c) iVar.f436523j0.getValue());
    }
}
