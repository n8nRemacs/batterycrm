package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.mediacodec.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f345551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.c f345552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f345553c;

    public /* synthetic */ a(l lVar, l.c cVar, int i12) {
        this.f345551a = i12;
        this.f345553c = lVar;
        this.f345552b = cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j12, long j13) {
        switch (this.f345551a) {
            case 0:
                ((b) this.f345553c).getClass();
                this.f345552b.a(j12);
                break;
            default:
                ((r) this.f345553c).getClass();
                this.f345552b.a(j12);
                break;
        }
    }
}
