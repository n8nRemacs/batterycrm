package com.avito.android.mall.webview;

import LX.b;
import Y61.k;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import l41.g;
import ur.InterfaceC49101b;

/* compiled from: MallWebInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mall/webview/a;", "Lcom/yatatsu/powerwebview/d;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.yatatsu.powerwebview.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g<LX.b> f184390a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC49101b f184391b;

    public a(@k g<LX.b> gVar, @k InterfaceC49101b interfaceC49101b) {
        this.f184390a = gVar;
        this.f184391b = interfaceC49101b;
    }

    @Override // com.yatatsu.powerwebview.d
    public final boolean b(boolean z12, @k Uri uri) {
        if (!C42745f0.r(this.f184391b.b(), uri.getScheme())) {
            return false;
        }
        this.f184390a.accept(new b.C0616b(uri.toString()));
        return true;
    }
}
