package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
public final class w40 implements InstreamAdPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Object f391283a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ma0 f391284b = new ma0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final HashMap f391285c = new HashMap();

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingFinished(@j.N VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new X1(hashSetA, videoAd, 1));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingStarted(@j.N VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new X1(hashSetA, videoAd, 6));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdCompleted(@j.N VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new X1(hashSetA, videoAd, 5));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPaused(@j.N VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new X1(hashSetA, videoAd, 7));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPrepared(@j.N VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new X1(hashSetA, videoAd, 8));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdResumed(@j.N VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new X1(hashSetA, videoAd, 2));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdSkipped(@j.N VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new X1(hashSetA, videoAd, 4));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStarted(@j.N VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new X1(hashSetA, videoAd, 0));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStopped(@j.N VideoAd videoAd) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new X1(hashSetA, videoAd, 3));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onError(@j.N VideoAd videoAd, @j.N InstreamAdPlayerError instreamAdPlayerError) {
        HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new H0(hashSetA, videoAd, instreamAdPlayerError, 9));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onVolumeChanged(@j.N final VideoAd videoAd, final float f12) {
        final HashSet hashSetA = a(videoAd);
        if (hashSetA != null) {
            this.f391284b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Y1
                @Override // java.lang.Runnable
                public final void run() {
                    w40.a(hashSetA, videoAd, f12);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdCompleted(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdPaused(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdPrepared(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdResumed(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdSkipped(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdStarted(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdStopped(videoAd);
        }
    }

    public final void a(@j.N VideoAd videoAd, @j.N InstreamAdPlayerListener instreamAdPlayerListener) {
        synchronized (this.f391283a) {
            try {
                Set hashSet = (Set) this.f391285c.get(videoAd);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    this.f391285c.put(videoAd, hashSet);
                }
                hashSet.add(instreamAdPlayerListener);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@j.N VideoAd videoAd, @j.N InstreamAdPlayerListener instreamAdPlayerListener) {
        synchronized (this.f391283a) {
            try {
                Set set = (Set) this.f391285c.get(videoAd);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (instreamAdPlayerListener.equals((InstreamAdPlayerListener) it.next())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        this.f391284b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdBufferingFinished(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdBufferingStarted(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Set set, VideoAd videoAd, float f12) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onVolumeChanged(videoAd, f12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Set set, VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onError(videoAd, instreamAdPlayerError);
        }
    }

    @j.P
    private HashSet a(@j.N VideoAd videoAd) {
        HashSet hashSet;
        synchronized (this.f391283a) {
            try {
                Set set = (Set) this.f391285c.get(videoAd);
                hashSet = set != null ? new HashSet(set) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet;
    }
}
