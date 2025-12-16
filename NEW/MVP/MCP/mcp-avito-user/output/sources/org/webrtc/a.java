package org.webrtc;

import org.webrtc.Camera2Session;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class a implements VideoSink {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f422271c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f422270b = i12;
        this.f422271c = obj;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f422270b) {
            case 0:
                ((Camera1Session) this.f422271c).lambda$listenForTextureFrames$0(videoFrame);
                break;
            case 1:
                ((Camera2Session.CaptureSessionCallback) this.f422271c).lambda$onConfigured$0(videoFrame);
                break;
            default:
                ((VideoSource) this.f422271c).lambda$setVideoProcessor$1(videoFrame);
                break;
        }
    }
}
