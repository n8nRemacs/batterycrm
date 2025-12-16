package com.avito.android.advertising.adapter.items.avito;

import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44739c;

/* compiled from: AvitoNetworkImagePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference<h31.e<InterfaceC44739c>> f87136l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BannerInfo f87137m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f87138n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f87139o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AvitoNetworkBanner.Image f87140p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ WeakReference<com.avito.android.deeplink_handler.handler.composite.a> f87141q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WeakReference<h31.e<InterfaceC44739c>> weakReference, BannerInfo bannerInfo, int i12, f fVar, AvitoNetworkBanner.Image image, WeakReference<com.avito.android.deeplink_handler.handler.composite.a> weakReference2) {
        super(0);
        this.f87136l = weakReference;
        this.f87137m = bannerInfo;
        this.f87138n = i12;
        this.f87139o = fVar;
        this.f87140p = image;
        this.f87141q = weakReference2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC44739c interfaceC44739c;
        h31.e<InterfaceC44739c> eVar = this.f87136l.get();
        if (eVar != null && (interfaceC44739c = eVar.get()) != null) {
            interfaceC44739c.C1(this.f87137m, this.f87138n);
        }
        f fVar = this.f87139o;
        AvitoNetworkBanner.Image image = this.f87140p;
        fVar.f87146e.d(image.f87979e);
        fVar.f87145d.a(this.f87141q.get(), image.f87977c);
        return G0.f406611a;
    }
}
