package com.yandex.mobile.ads.exo.drm;

import com.yandex.mobile.ads.exo.drm.e;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.tm;
import com.yandex.mobile.ads.impl.xg;
import j.P;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f382918a;

    public l(e.a aVar) {
        this.f382918a = (e.a) db.a(aVar);
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final void a(@P f.a aVar) {
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final int c() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final boolean d() {
        return false;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    @P
    public final Map<String, String> e() {
        return null;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final UUID f() {
        return xg.f391717a;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    @P
    public final e.a g() {
        return this.f382918a;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    @P
    public final tm h() {
        return null;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final boolean a(String str) {
        return false;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final void b(@P f.a aVar) {
    }
}
