package kotlinx.coroutines.android;

import android.view.Choreographer;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class h implements Choreographer.FrameCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f410766b;

    public /* synthetic */ h(r rVar) {
        this.f410766b = rVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j12) {
        int i12 = j.f410768a;
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f410766b.B(K.f411877a, Long.valueOf(j12));
    }
}
