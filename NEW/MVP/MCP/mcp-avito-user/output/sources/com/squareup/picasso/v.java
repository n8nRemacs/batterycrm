package com.squareup.picasso;

import j.k0;
import okhttp3.OkHttpClient;

/* compiled from: OkHttp3Downloader.java */
/* loaded from: classes7.dex */
public final class v implements l {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final OkHttpClient f366470a;

    public v(OkHttpClient okHttpClient) {
        this.f366470a = okHttpClient;
        okHttpClient.cache();
    }
}
