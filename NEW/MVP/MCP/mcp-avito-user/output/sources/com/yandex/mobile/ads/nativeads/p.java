package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.az0;
import com.yandex.mobile.ads.impl.bn0;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.ma0;
import com.yandex.mobile.ads.impl.oa0;
import com.yandex.mobile.ads.impl.wk0;
import com.yandex.mobile.ads.impl.zk0;
import com.yandex.mobile.ads.impl.zm0;
import j.K;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@K
/* loaded from: classes8.dex */
final class p implements wk0 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Context f392708a;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final oa0 f392710c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final ko1 f392711d;

    /* renamed from: f, reason: collision with root package name */
    @P
    private NativeAdLoadListener f392713f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private NativeBulkAdLoadListener f392714g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private SliderAdLoadListener f392715h;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final CopyOnWriteArrayList f392709b = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    @N
    private final ma0 f392712e = new ma0();

    public p(@N Context context, @N ko1 ko1Var) {
        this.f392708a = context;
        this.f392711d = ko1Var;
        oa0 oa0Var = new oa0(context);
        this.f392710c = oa0Var;
        oa0Var.a();
    }

    @K
    public final void a(@N NativeAdRequestConfiguration nativeAdRequestConfiguration, @N zk0 zk0Var) {
        zm0 zm0Var = zm0.f392297b;
        bn0 bn0Var = bn0.f383999b;
        this.f392710c.a();
        this.f392712e.a(new A(this, nativeAdRequestConfiguration, zm0Var, bn0Var, zk0Var, 1));
    }

    @K
    public final void b(@N NativeAdRequestConfiguration nativeAdRequestConfiguration, @N zk0 zk0Var) {
        zm0 zm0Var = zm0.f392299d;
        bn0 bn0Var = bn0.f383999b;
        this.f392710c.a();
        this.f392712e.a(new A(this, nativeAdRequestConfiguration, zm0Var, bn0Var, zk0Var, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(NativeAdRequestConfiguration nativeAdRequestConfiguration, zm0 zm0Var, bn0 bn0Var, az0 az0Var) {
        q qVar = new q(this.f392708a, this.f392711d, this);
        this.f392709b.add(qVar);
        qVar.a(this.f392715h);
        qVar.a(nativeAdRequestConfiguration, zm0Var, bn0Var, az0Var);
    }

    @K
    public final void a(@N final NativeAdRequestConfiguration nativeAdRequestConfiguration, @N final zk0 zk0Var, final int i12) {
        final zm0 zm0Var = zm0.f392298c;
        final bn0 bn0Var = bn0.f383999b;
        this.f392710c.a();
        this.f392712e.a(new Runnable() { // from class: com.yandex.mobile.ads.nativeads.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f392522b.a(nativeAdRequestConfiguration, zm0Var, bn0Var, zk0Var, i12);
            }
        });
    }

    @K
    public final void a(@N q qVar) {
        this.f392710c.a();
        this.f392709b.remove(qVar);
    }

    @K
    public final void a(@P NativeAdLoadListener nativeAdLoadListener) {
        this.f392710c.a();
        this.f392713f = nativeAdLoadListener;
        Iterator it = this.f392709b.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(nativeAdLoadListener);
        }
    }

    @K
    public final void a(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f392710c.a();
        this.f392714g = nativeBulkAdLoadListener;
        Iterator it = this.f392709b.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(nativeBulkAdLoadListener);
        }
    }

    @K
    public final void a(@P SliderAdLoadListener sliderAdLoadListener) {
        this.f392710c.a();
        this.f392715h = sliderAdLoadListener;
        Iterator it = this.f392709b.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(sliderAdLoadListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(NativeAdRequestConfiguration nativeAdRequestConfiguration, zm0 zm0Var, bn0 bn0Var, az0 az0Var) {
        q qVar = new q(this.f392708a, this.f392711d, this);
        this.f392709b.add(qVar);
        qVar.a(this.f392713f);
        qVar.a(nativeAdRequestConfiguration, zm0Var, bn0Var, az0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(NativeAdRequestConfiguration nativeAdRequestConfiguration, zm0 zm0Var, bn0 bn0Var, az0 az0Var, int i12) {
        q qVar = new q(this.f392708a, this.f392711d, this);
        this.f392709b.add(qVar);
        qVar.a(this.f392714g);
        qVar.a(nativeAdRequestConfiguration, zm0Var, bn0Var, az0Var, i12);
    }

    @K
    public final void a() {
        this.f392710c.a();
        this.f392712e.a();
        Iterator it = this.f392709b.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a();
        }
        this.f392709b.clear();
    }
}
