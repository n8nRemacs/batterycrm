package org.webrtc;

import org.webrtc.Camera1Session;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Camera1Session.AnonymousClass2 f422276c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f422277d;

    public /* synthetic */ b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i12) {
        this.f422275b = i12;
        this.f422276c = anonymousClass2;
        this.f422277d = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f422275b) {
            case 0:
                this.f422276c.lambda$onPreviewFrame$1(this.f422277d);
                break;
            default:
                this.f422276c.lambda$onPreviewFrame$0(this.f422277d);
                break;
        }
    }
}
