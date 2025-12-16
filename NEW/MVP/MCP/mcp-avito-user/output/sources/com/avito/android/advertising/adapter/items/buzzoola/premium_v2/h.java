package com.avito.android.advertising.adapter.items.buzzoola.premium_v2;

import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44739c;

/* compiled from: BuzzoolaPremiumV2Presenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference<h31.e<InterfaceC44739c>> f87463l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaPremiumV2BannerItem f87464m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f87465n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f87466o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaBanner.BuzzoolaPremiumV2 f87467p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ WeakReference<com.avito.android.deeplink_handler.handler.composite.a> f87468q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WeakReference<h31.e<InterfaceC44739c>> weakReference, BuzzoolaPremiumV2BannerItem buzzoolaPremiumV2BannerItem, int i12, j jVar, BuzzoolaBanner.BuzzoolaPremiumV2 buzzoolaPremiumV2, WeakReference<com.avito.android.deeplink_handler.handler.composite.a> weakReference2) {
        super(0);
        this.f87463l = weakReference;
        this.f87464m = buzzoolaPremiumV2BannerItem;
        this.f87465n = i12;
        this.f87466o = jVar;
        this.f87467p = buzzoolaPremiumV2;
        this.f87468q = weakReference2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC44739c interfaceC44739c;
        h31.e<InterfaceC44739c> eVar = this.f87463l.get();
        if (eVar != null && (interfaceC44739c = eVar.get()) != null) {
            interfaceC44739c.C1(this.f87464m.getF86895d(), this.f87465n);
        }
        j jVar = this.f87466o;
        BuzzoolaBanner.BuzzoolaPremiumV2 buzzoolaPremiumV2 = this.f87467p;
        jVar.f87471c.d(buzzoolaPremiumV2.f88256k);
        jVar.f87472d.a(this.f87468q.get(), buzzoolaPremiumV2.f88255j.f88304b);
        return G0.f406611a;
    }
}
