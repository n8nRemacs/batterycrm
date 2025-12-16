package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.z50;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a60 implements k30 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z50 f383420a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<eb<?>> f383421b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w20 f383422c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ z50.a f383423d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ff1<VideoAd> f383424e;

    public a60(z50 z50Var, List list, w20 w20Var, m60 m60Var, ff1 ff1Var) {
        this.f383420a = z50Var;
        this.f383421b = list;
        this.f383422c = w20Var;
        this.f383423d = m60Var;
        this.f383424e = ff1Var;
    }

    @Override // com.yandex.mobile.ads.impl.k30
    public final void a(@Y61.k Map<String, Bitmap> map) {
        this.f383420a.f392185b.a(z3.f392168h);
        this.f383420a.f392187d.a(this.f383420a.f392186c.a(this.f383421b, map), map);
        this.f383422c.a(map);
        ((m60) this.f383423d).m(this.f383424e);
    }
}
