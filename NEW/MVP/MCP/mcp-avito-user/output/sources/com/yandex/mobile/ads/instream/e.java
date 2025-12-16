package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.li1;
import com.yandex.mobile.ads.impl.rt0;
import com.yandex.mobile.ads.impl.xh1;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import j.N;

/* loaded from: classes8.dex */
public final class e implements rt0 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final VideoPlayer f392502a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final li1 f392503b = new li1();

    /* renamed from: c, reason: collision with root package name */
    @N
    private final xh1 f392504c = new xh1();

    public e(@N VideoPlayer videoPlayer) {
        this.f392502a = videoPlayer;
    }

    public final li1 a() {
        return this.f392503b;
    }

    public final long b() {
        return this.f392502a.getVideoDuration();
    }

    public final long c() {
        return this.f392502a.getVideoPosition();
    }

    public final void d() {
        this.f392502a.pauseVideo();
    }

    public final void e() {
        this.f392502a.prepareVideo();
    }

    public final void f() {
        this.f392502a.resumeVideo();
    }

    public final void g() {
        this.f392502a.setVideoPlayerListener(this.f392504c);
    }

    @Override // com.yandex.mobile.ads.impl.rt0
    public final float getVolume() {
        return this.f392502a.getVolume();
    }

    public final void h() {
        this.f392502a.setVideoPlayerListener(null);
        this.f392504c.a();
    }

    public final void a(@N d dVar) {
        this.f392504c.a(dVar);
    }
}
