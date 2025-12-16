package oa1;

import B91.K;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* renamed from: oa1.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLayoutChangeListenerC44727f implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.camera.h f419917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f419918c;

    public ViewOnLayoutChangeListenerC44727f(ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar, K k12) {
        this.f419917b = hVar;
        this.f419918c = k12;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws ExecutionException, InterruptedException {
        view.removeOnLayoutChangeListener(this);
        ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar = this.f419917b;
        hVar.f436512l0.c(hVar.getViewLifecycleOwner(), this.f419918c.f1076e, (ma1.e) hVar.f436511k0.getValue());
    }
}
