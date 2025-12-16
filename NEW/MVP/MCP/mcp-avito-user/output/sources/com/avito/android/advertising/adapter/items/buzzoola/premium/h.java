package com.avito.android.advertising.adapter.items.buzzoola.premium;

import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44739c;

/* compiled from: BuzzoolaPremiumPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference<h31.e<InterfaceC44739c>> f87398l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaPremiumBannerItem f87399m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f87400n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f87401o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaBanner.BuzzoolaPremium f87402p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ WeakReference<com.avito.android.deeplink_handler.handler.composite.a> f87403q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WeakReference<h31.e<InterfaceC44739c>> weakReference, BuzzoolaPremiumBannerItem buzzoolaPremiumBannerItem, int i12, j jVar, BuzzoolaBanner.BuzzoolaPremium buzzoolaPremium, WeakReference<com.avito.android.deeplink_handler.handler.composite.a> weakReference2) {
        super(0);
        this.f87398l = weakReference;
        this.f87399m = buzzoolaPremiumBannerItem;
        this.f87400n = i12;
        this.f87401o = jVar;
        this.f87402p = buzzoolaPremium;
        this.f87403q = weakReference2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC44739c interfaceC44739c;
        h31.e<InterfaceC44739c> eVar = this.f87398l.get();
        if (eVar != null && (interfaceC44739c = eVar.get()) != null) {
            interfaceC44739c.C1(this.f87399m.getF86895d(), this.f87400n);
        }
        j jVar = this.f87401o;
        BuzzoolaBanner.BuzzoolaPremium buzzoolaPremium = this.f87402p;
        jVar.f87406c.d(buzzoolaPremium.f88246k);
        jVar.f87407d.a(this.f87403q.get(), buzzoolaPremium.f88245j.f88304b);
        return G0.f406611a;
    }
}
