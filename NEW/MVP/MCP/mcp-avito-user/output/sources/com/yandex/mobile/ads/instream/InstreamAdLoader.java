package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.r40;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public class InstreamAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final r40 f392472a;

    public InstreamAdLoader(@N Context context) {
        this.f392472a = new r40(context);
    }

    public void loadInstreamAd(@N Context context, @N InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f392472a.a(instreamAdRequestConfiguration);
    }

    public void setInstreamAdLoadListener(@P InstreamAdLoadListener instreamAdLoadListener) {
        this.f392472a.a(instreamAdLoadListener);
    }
}
