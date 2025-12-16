package androidx.media3.session;

import android.support.v4.media.MediaBrowserCompat;
import androidx.media3.session.MediaControllerImplLegacy;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23250p0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaControllerImplLegacy f52607c;

    public /* synthetic */ RunnableC23250p0(MediaControllerImplLegacy mediaControllerImplLegacy, int i12) {
        this.f52606b = i12;
        this.f52607c = mediaControllerImplLegacy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52606b) {
            case 0:
                MediaControllerImplLegacy mediaControllerImplLegacy = this.f52607c;
                mediaControllerImplLegacy.getClass();
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(mediaControllerImplLegacy.f52146a, mediaControllerImplLegacy.f52148c.f52238b.d(), new MediaControllerImplLegacy.a(mediaControllerImplLegacy, null), null);
                mediaControllerImplLegacy.f52153h = mediaBrowserCompat;
                mediaBrowserCompat.connect();
                break;
            default:
                MediaControllerImplLegacy mediaControllerImplLegacy2 = this.f52607c;
                if (!mediaControllerImplLegacy2.f52152g.isSessionReady()) {
                    mediaControllerImplLegacy2.e0();
                    break;
                }
                break;
        }
    }
}
