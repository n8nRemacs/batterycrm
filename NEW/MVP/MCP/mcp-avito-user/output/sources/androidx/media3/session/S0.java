package androidx.media3.session;

import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.InterfaceC37564s0;

/* compiled from: MediaSessionImpl.java */
/* loaded from: classes.dex */
class S0 implements InterfaceC37564s0<O0.i> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.H f52281a;

    public S0(androidx.media3.common.H h12) {
        this.f52281a = h12;
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void a(Throwable th2) {
        if (th2 instanceof UnsupportedOperationException) {
            androidx.media3.common.util.s.h("UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
        } else {
            androidx.media3.common.util.s.d("Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
        }
        androidx.media3.common.util.M.z(this.f52281a);
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void onSuccess(O0.i iVar) {
        O0.i iVar2 = iVar;
        AbstractC37401r1<androidx.media3.common.z> abstractC37401r1 = iVar2.f52223a;
        int i12 = iVar2.f52224b;
        int iMin = i12 != -1 ? Math.min(abstractC37401r1.size() - 1, i12) : 0;
        androidx.media3.common.H h12 = this.f52281a;
        h12.M(abstractC37401r1, iMin, iVar2.f52225c);
        if (h12.getPlaybackState() == 1) {
            h12.prepare();
        }
        h12.play();
    }
}
