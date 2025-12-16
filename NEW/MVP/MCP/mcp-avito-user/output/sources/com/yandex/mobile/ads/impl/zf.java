package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.ag;

/* loaded from: classes8.dex */
final class zf implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bitmap f392236b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ag.a f392237c;

    public zf(ag.a aVar, Bitmap bitmap) {
        this.f392237c = aVar;
        this.f392236b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f392237c.f383550e.a(this.f392236b);
    }
}
