package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f422302c;

    public /* synthetic */ k(ByteBuffer byteBuffer, int i12) {
        this.f422301b = i12;
        this.f422302c = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f422301b) {
            case 0:
                JniCommon.nativeFreeByteBuffer(this.f422302c);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(this.f422302c);
                break;
        }
    }
}
