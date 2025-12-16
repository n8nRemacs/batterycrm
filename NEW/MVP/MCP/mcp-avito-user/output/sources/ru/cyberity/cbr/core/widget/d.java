package ru.cyberity.cbr.core.widget;

import android.view.View;
import androidx.dynamicanimation.animation.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class d implements c.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f434246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f434247b;

    public /* synthetic */ d(View view, int i12) {
        this.f434246a = i12;
        this.f434247b = view;
    }

    @Override // androidx.dynamicanimation.animation.c.q
    public final void a(androidx.dynamicanimation.animation.c cVar, boolean z12, float f12, float f13) {
        switch (this.f434246a) {
            case 0:
                CBRLivenessFaceView.m297radiusAnimation$lambda1$lambda0((CBRLivenessFaceView) this.f434247b, cVar, z12, f12, f13);
                break;
            case 1:
                CBRRotationZoomableImageView.m300rotationAnimation$lambda3$lambda2((CBRRotationZoomableImageView) this.f434247b, cVar, z12, f12, f13);
                break;
            default:
                CBRSegmentedToggleView.m301animator$lambda2$lambda1((CBRSegmentedToggleView) this.f434247b, cVar, z12, f12, f13);
                break;
        }
    }
}
