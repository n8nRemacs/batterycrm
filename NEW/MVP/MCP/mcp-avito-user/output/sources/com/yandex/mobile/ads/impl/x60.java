package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class x60 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f391563c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private static volatile x60 f391564d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Object f391565a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final WeakHashMap<VideoPlayer, InstreamAdBinder> f391566b;

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        @Y61.k
        public final x60 a() {
            x60 x60Var = x60.f391564d;
            if (x60Var == null) {
                synchronized (this) {
                    x60Var = x60.f391564d;
                    if (x60Var == null) {
                        x60Var = new x60(0);
                        x60.f391564d = x60Var;
                    }
                }
            }
            return x60Var;
        }

        private a() {
        }
    }

    public /* synthetic */ x60(int i12) {
        this();
    }

    public final void b(@Y61.k VideoPlayer videoPlayer) {
        synchronized (this.f391565a) {
            this.f391566b.remove(videoPlayer);
        }
    }

    private x60() {
        this.f391565a = new Object();
        this.f391566b = new WeakHashMap<>();
    }

    @Y61.l
    public final InstreamAdBinder a(@Y61.k VideoPlayer videoPlayer) {
        InstreamAdBinder instreamAdBinder;
        synchronized (this.f391565a) {
            instreamAdBinder = this.f391566b.get(videoPlayer);
        }
        return instreamAdBinder;
    }

    public final void a(@Y61.k VideoPlayer videoPlayer, @Y61.k InstreamAdBinder instreamAdBinder) {
        synchronized (this.f391565a) {
            this.f391566b.put(videoPlayer, instreamAdBinder);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }
}
