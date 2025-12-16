package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdLoader;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class u90 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f390476a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InstreamAdLoader f390477b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InstreamAdRequestConfiguration f390478c;

    public static class a implements InstreamAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final WeakReference<ViewGroup> f390479a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final WeakReference<List<df1>> f390480b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final b f390481c;

        public a(@j.N ViewGroup viewGroup, @j.N List<df1> list, @j.N b bVar) {
            this.f390481c = bVar;
            this.f390479a = new WeakReference<>(viewGroup);
            this.f390480b = new WeakReference<>(list);
        }

        @Override // com.yandex.mobile.ads.instream.InstreamAdLoadListener
        public final void onInstreamAdFailedToLoad(@j.N String str) {
            this.f390481c.a();
        }

        @Override // com.yandex.mobile.ads.instream.InstreamAdLoadListener
        public final void onInstreamAdLoaded(@j.N InstreamAd instreamAd) {
            ViewGroup viewGroup = this.f390479a.get();
            List<df1> listEmptyList = this.f390480b.get();
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            if (viewGroup != null) {
                this.f390481c.a(viewGroup, listEmptyList, instreamAd);
            } else {
                this.f390481c.a();
            }
        }
    }

    public interface b {
        void a();

        void a(@j.N ViewGroup viewGroup, @j.N List<df1> list, @j.N InstreamAd instreamAd);
    }

    public u90(@j.N Context context, @j.N InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f390476a = context.getApplicationContext();
        this.f390478c = instreamAdRequestConfiguration;
        this.f390477b = new InstreamAdLoader(context);
    }

    public final void a(@j.N ViewGroup viewGroup, @j.N List<df1> list, @j.N b bVar) {
        this.f390477b.setInstreamAdLoadListener(new a(viewGroup, list, bVar));
        this.f390477b.loadInstreamAd(this.f390476a, this.f390478c);
    }

    public final void a() {
        this.f390477b.setInstreamAdLoadListener(null);
    }
}
