package com.yandex.metrica.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.N;

/* loaded from: classes7.dex */
final class b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HttpsURLConnection f382393l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f382393l = httpsURLConnection;
    }

    @Override // Y41.a
    public final Object invoke() {
        return this.f382393l.getErrorStream();
    }
}
