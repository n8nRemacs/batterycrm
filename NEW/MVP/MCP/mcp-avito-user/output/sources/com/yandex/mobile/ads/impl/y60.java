package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;

/* loaded from: classes8.dex */
public final class y60 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final InstreamAdBinder f391944a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final x60 f391945b = x60.f391563c.a();

    public y60(@Y61.k InstreamAdBinder instreamAdBinder) {
        this.f391944a = instreamAdBinder;
    }

    public final void a(@Y61.k VideoPlayer videoPlayer) {
        InstreamAdBinder instreamAdBinderA = this.f391945b.a(videoPlayer);
        if (kotlin.jvm.internal.L.f(this.f391944a, instreamAdBinderA)) {
            return;
        }
        if (instreamAdBinderA != null) {
            instreamAdBinderA.invalidateVideoPlayer();
        }
        this.f391945b.a(videoPlayer, this.f391944a);
    }

    public final void b(@Y61.k VideoPlayer videoPlayer) {
        this.f391945b.b(videoPlayer);
    }
}
