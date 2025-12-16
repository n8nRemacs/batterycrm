package com.avito.android.publish.screen.step.params.view;

import android.view.ViewTreeObserver;
import androidx.camera.video.internal.audio.q;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PublishDetailsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/l;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.f f241644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f241645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f241646d;

    public l(l0.f fVar, j jVar, int i12) {
        this.f241644b = fVar;
        this.f241645c = jVar;
        this.f241646d = i12;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        l0.f fVar = this.f241644b;
        fVar.f406840b++;
        j jVar = this.f241645c;
        int iO02 = jVar.f241619q.o0();
        RecyclerView recyclerView = jVar.f241618p;
        int i12 = this.f241646d;
        if (i12 >= 0 && i12 < iO02) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            recyclerView.post(new q(i12, 14, jVar));
        } else if (fVar.f406840b >= 5) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
