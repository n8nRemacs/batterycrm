package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.exoplayer.mediacodec.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.c f49330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f49331c;

    public /* synthetic */ a(l lVar, l.c cVar, int i12) {
        this.f49329a = i12;
        this.f49331c = lVar;
        this.f49330b = cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j12, long j13) {
        switch (this.f49329a) {
            case 0:
                ((b) this.f49331c).getClass();
                this.f49330b.a(j12);
                break;
            default:
                ((t) this.f49331c).getClass();
                this.f49330b.a(j12);
                break;
        }
    }
}
