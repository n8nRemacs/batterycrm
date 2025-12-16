package androidx.media3.exoplayer.mediacodec;

import android.os.HandlerThread;
import com.google.common.base.e0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f49341c;

    public /* synthetic */ c(int i12, int i13) {
        this.f49340b = i13;
        this.f49341c = i12;
    }

    @Override // com.google.common.base.e0
    public final Object get() {
        switch (this.f49340b) {
            case 0:
                return new HandlerThread(b.j(this.f49341c, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(b.j(this.f49341c, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
