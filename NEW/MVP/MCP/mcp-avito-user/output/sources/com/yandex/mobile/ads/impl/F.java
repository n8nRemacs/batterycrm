package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import com.yandex.mobile.ads.impl.ac0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class F implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f383200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ac0.c f383201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ac0 f383202c;

    public /* synthetic */ F(ac0 ac0Var, ac0.c cVar, int i12) {
        this.f383200a = i12;
        this.f383202c = ac0Var;
        this.f383201b = cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j12, long j13) {
        switch (this.f383200a) {
            case 0:
                ((dc) this.f383202c).a(this.f383201b, mediaCodec, j12, j13);
                break;
            default:
                ((b81) this.f383202c).a(this.f383201b, mediaCodec, j12, j13);
                break;
        }
    }
}
