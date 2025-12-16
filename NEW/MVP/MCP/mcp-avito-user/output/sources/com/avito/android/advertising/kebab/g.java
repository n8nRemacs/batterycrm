package com.avito.android.advertising.kebab;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.util.InterfaceC35745a5;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdItemActionsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/kebab/g;", "Lcom/avito/android/advertising/kebab/f;", "Lcom/avito/android/advertising/kebab/b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements f, b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f87828a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f87829b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final BannerPageSource f87830c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public UV0.a<? extends TV0.a> f87831d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public e f87832e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f87833f = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AdItemActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.advertising.i iVar;
            Integer hideId;
            int iIntValue = ((Number) obj).intValue();
            g gVar = g.this;
            UV0.a<? extends TV0.a> aVar = gVar.f87831d;
            if (aVar != null) {
                int i12 = 0;
                for (T t12 : com.avito.konveyor.util.g.b(aVar)) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    TV0.a aVar2 = (TV0.a) t12;
                    if ((aVar2 instanceof com.avito.android.advertising.i) && (hideId = (iVar = (com.avito.android.advertising.i) aVar2).getHideId()) != null && hideId.intValue() == iIntValue) {
                        iVar.setHidden(true);
                        e eVar = gVar.f87832e;
                        if (eVar != null) {
                            eVar.sK(i12);
                        }
                    }
                    i12 = i13;
                }
            }
        }
    }

    @Inject
    public g(@Y61.k n nVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k BannerPageSource bannerPageSource) {
        this.f87828a = nVar;
        this.f87829b = interfaceC35745a5;
        this.f87830c = bannerPageSource;
    }

    @Override // com.avito.android.advertising.kebab.f
    public final void a(@Y61.l AvitoNetworkBanner.MarkInfo markInfo, @Y61.k List<? extends q> list, @Y61.k BannerInfo bannerInfo) {
        e eVar = this.f87832e;
        if (eVar == null) {
            return;
        }
        eVar.vm(markInfo, list, this, bannerInfo);
    }

    @Override // com.avito.android.advertising.kebab.f
    public final void b(@Y61.l e eVar) {
        if (L.f(eVar, this.f87832e) || eVar == null) {
            this.f87833f.e();
            this.f87832e = null;
        }
    }

    @Override // com.avito.android.advertising.kebab.f
    public final void c(@Y61.k UV0.a<? extends TV0.a> aVar) {
        this.f87831d = aVar;
    }

    @Override // com.avito.android.advertising.kebab.f
    public final void d(@Y61.k e eVar) {
        e eVar2 = this.f87832e;
        if (eVar2 != null) {
            b(eVar2);
        }
        this.f87832e = eVar;
        this.f87833f.b(this.f87828a.b().j0(this.f87829b.e()).K(new a()).s0());
    }
}
