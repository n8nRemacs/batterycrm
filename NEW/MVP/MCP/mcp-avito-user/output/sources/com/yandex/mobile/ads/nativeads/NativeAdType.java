package com.yandex.mobile.ads.nativeads;

import j.N;

/* loaded from: classes8.dex */
public enum NativeAdType {
    CONTENT("content"),
    APP_INSTALL("app"),
    MEDIA("media");


    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f392576a;

    NativeAdType(String str) {
        this.f392576a = str;
    }

    @N
    public String getValue() {
        return this.f392576a;
    }
}
