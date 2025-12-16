package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.impl.gn;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class nn1 implements gn.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f388339a;

    /* renamed from: b, reason: collision with root package name */
    private final int f388340b = JosStatusCodes.RTN_CODE_COMMON_ERROR;

    /* renamed from: c, reason: collision with root package name */
    private final int f388341c = JosStatusCodes.RTN_CODE_COMMON_ERROR;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f388342d = false;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private final SSLSocketFactory f388343e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f388344f;

    public nn1(@Y61.k String str, @Y61.l SSLSocketFactory sSLSocketFactory, boolean z12) {
        this.f388339a = str;
        this.f388343e = sSLSocketFactory;
        this.f388344f = z12;
    }

    @Override // com.yandex.mobile.ads.impl.gn.a
    @Y61.k
    public final gn a() {
        if (!this.f388344f) {
            return new ln1(this.f388339a, this.f388340b, this.f388341c, this.f388342d, new h10(), this.f388343e);
        }
        int i12 = cq0.f384387c;
        return new fq0(cq0.a(this.f388340b, this.f388341c, this.f388343e), this.f388339a, new h10());
    }
}
