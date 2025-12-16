package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.td;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
final class ze0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f392234a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final WeakReference<ViewGroup> f392235b;

    public interface a {
    }

    public ze0(@j.P com.yandex.mobile.ads.banner.h hVar) {
        this.f392235b = new WeakReference<>(hVar);
    }

    public final void a(@j.N View view, @j.N td.a aVar) {
        this.f392234a.post(new xe0(this, view, aVar));
    }
}
