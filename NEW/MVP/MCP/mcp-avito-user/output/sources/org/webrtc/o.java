package org.webrtc;

import android.view.Choreographer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class o implements Choreographer.FrameCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RenderSynchronizer f422307b;

    public /* synthetic */ o(RenderSynchronizer renderSynchronizer) {
        this.f422307b = renderSynchronizer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j12) {
        this.f422307b.onDisplayRefreshCycleBegin(j12);
    }
}
