package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.bl0;
import com.yandex.mobile.ads.impl.ll0;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.vi;
import com.yandex.mobile.ads.impl.vq;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes8.dex */
public interface u extends NativeAd, OpenLinksInAppProvider, CustomClickable, com.yandex.mobile.ads.nativeads.video.b {
    @P
    bl0 a();

    void a(@N ll0 ll0Var);

    void a(@N NativeBannerView nativeBannerView);

    @N
    om0 b();

    void b(@N ll0 ll0Var, @N vi viVar);

    @P
    List<vq> c();

    void destroy();
}
