package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import java.util.Queue;

/* loaded from: classes8.dex */
public final class va0<T> implements InstreamAdBreakQueue<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Queue<T> f390836a;

    public va0(@j.N Queue<T> queue) {
        this.f390836a = queue;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final int getCount() {
        return this.f390836a.size();
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    @j.P
    public final T poll() {
        return this.f390836a.poll();
    }
}
