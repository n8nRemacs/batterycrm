package com.avito.android.advertising.adapter.items.yandex;

import Db.InterfaceC13381a;
import com.avito.android.C30828i;
import com.avito.android.util.V2;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44739c;

/* compiled from: YandexPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/yandex/j;", "Lcom/avito/android/advertising/adapter/items/yandex/i;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44739c> f87740b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30828i f87741c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f87742d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87743e;

    /* compiled from: YandexPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ WeakReference<h31.e<InterfaceC44739c>> f87744l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ YandexBannerItem f87745m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f87746n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeakReference<h31.e<InterfaceC44739c>> weakReference, YandexBannerItem yandexBannerItem, int i12) {
            super(0);
            this.f87744l = weakReference;
            this.f87745m = yandexBannerItem;
            this.f87746n = i12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC44739c interfaceC44739c;
            h31.e<InterfaceC44739c> eVar = this.f87744l.get();
            if (eVar != null && (interfaceC44739c = eVar.get()) != null) {
                interfaceC44739c.C1(this.f87745m.getBannerInfo(), this.f87746n);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: YandexPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ YandexBannerItem f87748m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ WeakReference<Hb.d> f87749n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ WeakReference<h31.e<InterfaceC44739c>> f87750o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(YandexBannerItem yandexBannerItem, WeakReference<Hb.d> weakReference, WeakReference<h31.e<InterfaceC44739c>> weakReference2) {
            super(0);
            this.f87748m = yandexBannerItem;
            this.f87749n = weakReference;
            this.f87750o = weakReference2;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC44739c interfaceC44739c;
            boolean zB2 = j.this.f87743e.b();
            YandexBannerItem yandexBannerItem = this.f87748m;
            if (zB2) {
                yandexBannerItem.setHidden(true);
                Hb.d dVar = this.f87749n.get();
                if (dVar != null) {
                    dVar.N6();
                }
            }
            h31.e<InterfaceC44739c> eVar = this.f87750o.get();
            if (eVar != null && (interfaceC44739c = eVar.get()) != null) {
                interfaceC44739c.A(yandexBannerItem.getF72937b());
            }
            return G0.f406611a;
        }
    }

    @Inject
    public j(@Y61.k h31.e<InterfaceC44739c> eVar, @Y61.k C30828i c30828i, @Y61.k InterfaceC13381a interfaceC13381a, @Y61.k com.avito.android.advertising.a aVar) {
        this.f87740b = eVar;
        this.f87741c = c30828i;
        this.f87742d = interfaceC13381a;
        this.f87743e = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        try {
            k((Hb.d) eVar, (YandexBannerItem) aVar, i12);
        } catch (Exception e12) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to bind yandex banner", e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(Hb.d r8, com.avito.android.advertising.adapter.items.yandex.YandexBannerItem r9, int r10) {
        /*
            r7 = this;
            com.avito.android.advertising.loaders.yandex.a r0 = r9.getBanner()
            com.yandex.mobile.ads.nativeads.NativeAd r0 = r0.f88499b
            com.yandex.mobile.ads.nativeads.NativeAdType r1 = r0.getAdType()
            com.yandex.mobile.ads.nativeads.NativeAdType r2 = com.yandex.mobile.ads.nativeads.NativeAdType.APP_INSTALL
            if (r1 == r2) goto L2d
            com.avito.android.i r1 = r7.f87741c
            r1.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.C30828i.f164256k
            r3 = 2
            r2 = r2[r3]
            com.avito.android.A0$a r1 = r1.f164259d
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2b
            goto L2d
        L2b:
            r1 = 0
            goto L2e
        L2d:
            r1 = 1
        L2e:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            h31.e<ob.c> r3 = r7.f87740b
            r2.<init>(r3)
            Db.a r4 = r7.f87742d
            boolean r5 = r4.f()
            if (r5 == 0) goto L49
            com.avito.android.advertising.ui.h r5 = com.avito.android.advertising.ui.h.f88704a
            android.view.View r6 = r8.getF88600b()
            r5.getClass()
            com.avito.android.advertising.ui.h.b(r6, r9)
        L49:
            java.lang.Object r3 = r3.get()
            ob.c r3 = (ob.InterfaceC44739c) r3
            if (r3 == 0) goto L58
            com.avito.android.advertising.loaders.BannerInfo r5 = r9.getBannerInfo()
            r3.J4(r5, r10)
        L58:
            r8.fu(r1)
            r3 = 2131165318(0x7f070086, float:1.794485E38)
            r8.H60(r3)
            com.avito.android.advertising.ui.AdStyle r3 = r8.getF88633c()
            boolean r3 = r3.a()
            r8.Ex(r1, r3)
            com.yandex.mobile.ads.nativeads.NativeAdAssets r1 = r0.getAdAssets()
            java.lang.String r1 = r1.getPrice()
            r8.p(r1)
            com.yandex.mobile.ads.nativeads.NativeAdAssets r1 = r0.getAdAssets()
            java.lang.Float r1 = r1.getRating()
            com.avito.android.advertising.ui.AdStyle r3 = r8.getF88633c()
            r8.BN(r1, r3)
            com.avito.android.advertising.ui.AdStyle r1 = r8.getF88633c()
            r8.OB(r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r8)
            boolean r3 = r9.getIsHidden()
            com.avito.android.advertising.adapter.items.yandex.j$a r5 = new com.avito.android.advertising.adapter.items.yandex.j$a
            r5.<init>(r2, r9, r10)
            com.avito.android.advertising.adapter.items.yandex.j$b r10 = new com.avito.android.advertising.adapter.items.yandex.j$b
            r10.<init>(r9, r1, r2)
            r8.pV(r0, r3, r5, r10)
            com.avito.android.advertising.splitter.YandexBadgeStyle r9 = r4.a()
            com.avito.android.advertising.a r10 = r7.f87743e
            boolean r10 = r10.a()
            r8.uM(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advertising.adapter.items.yandex.j.k(Hb.d, com.avito.android.advertising.adapter.items.yandex.YandexBannerItem, int):void");
    }
}
