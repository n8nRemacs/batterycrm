package com.google.android.exoplayer2.mediacodec;

import android.os.HandlerThread;
import com.google.common.base.e0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f345562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f345563c;

    public /* synthetic */ c(int i12, int i13) {
        this.f345562b = i13;
        this.f345563c = i12;
    }

    @Override // com.google.common.base.e0
    public final Object get() {
        switch (this.f345562b) {
            case 0:
                return new HandlerThread(b.j(this.f345563c, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(b.j(this.f345563c, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
