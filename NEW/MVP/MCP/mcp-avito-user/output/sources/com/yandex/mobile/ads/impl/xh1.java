package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
public final class xh1 implements VideoPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Object f391723a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ma0 f391724b = new ma0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final HashSet f391725c = new HashSet();

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        HashSet hashSet;
        synchronized (this.f391723a) {
            hashSet = new HashSet(this.f391725c);
        }
        this.f391724b.a(new C2(hashSet, 1));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        HashSet hashSet;
        synchronized (this.f391723a) {
            hashSet = new HashSet(this.f391725c);
        }
        this.f391724b.a(new C2(hashSet, 2));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        HashSet hashSet;
        synchronized (this.f391723a) {
            hashSet = new HashSet(this.f391725c);
        }
        this.f391724b.a(new C2(hashSet, 3));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        HashSet hashSet;
        synchronized (this.f391723a) {
            hashSet = new HashSet(this.f391725c);
        }
        this.f391724b.a(new C2(hashSet, 4));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        HashSet hashSet;
        synchronized (this.f391723a) {
            hashSet = new HashSet(this.f391725c);
        }
        this.f391724b.a(new C2(hashSet, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoResumed();
        }
    }

    public final void a(@j.N com.yandex.mobile.ads.instream.d dVar) {
        synchronized (this.f391723a) {
            this.f391725c.add(dVar);
        }
    }

    public final void a() {
        this.f391725c.clear();
        this.f391724b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoCompleted();
        }
    }
}
