package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.bn0;
import com.yandex.mobile.ads.impl.zk0;
import com.yandex.mobile.ads.impl.zm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f392516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f392517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NativeAdRequestConfiguration f392518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zm0 f392519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bn0 f392520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zk0 f392521g;

    public /* synthetic */ A(p pVar, NativeAdRequestConfiguration nativeAdRequestConfiguration, zm0 zm0Var, bn0 bn0Var, zk0 zk0Var, int i12) {
        this.f392516b = i12;
        this.f392517c = pVar;
        this.f392518d = nativeAdRequestConfiguration;
        this.f392519e = zm0Var;
        this.f392520f = bn0Var;
        this.f392521g = zk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f392516b) {
            case 0:
                this.f392517c.b(this.f392518d, this.f392519e, this.f392520f, this.f392521g);
                break;
            default:
                this.f392517c.a(this.f392518d, this.f392519e, this.f392520f, this.f392521g);
                break;
        }
    }
}
