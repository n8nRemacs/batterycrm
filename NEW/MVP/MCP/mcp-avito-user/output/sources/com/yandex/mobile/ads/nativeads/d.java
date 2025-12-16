package com.yandex.mobile.ads.nativeads;

import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.dj;
import com.yandex.mobile.ads.impl.j81;
import com.yandex.mobile.ads.impl.oy0;
import j.N;

/* loaded from: classes8.dex */
public final class d implements j81 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Handler f392612a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @N
    private final CustomClickHandler f392613b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final ResultReceiver f392614c;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f392615b;

        public a(String str) {
            this.f392615b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            dVar.f392613b.handleCustomClick(this.f392615b, new b(dVar, 0));
        }
    }

    public class b implements CustomClickHandlerEventListener {
        private b() {
        }

        @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
        public final void onLeftApplication() {
            d.this.f392614c.send(19, null);
        }

        @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
        public final void onReturnedToApplication() {
            d.this.f392614c.send(20, null);
        }

        public /* synthetic */ b(d dVar, int i12) {
            this();
        }
    }

    public d(@N CustomClickHandler customClickHandler, @N AdResultReceiver adResultReceiver) {
        this.f392613b = customClickHandler;
        this.f392614c = adResultReceiver;
    }

    @Override // com.yandex.mobile.ads.impl.j81
    public final void a(@N oy0 oy0Var, @N String str) {
        ((dj) oy0Var).a(org.webrtc.h.g("click_type", "custom"));
        this.f392612a.post(new a(str));
    }
}
