package com.avito.android.advertising.adapter.items.yandex.avl;

import Db.InterfaceC13381a;
import Y61.k;
import com.avito.android.C30828i;
import com.avito.android.advertising.adapter.items.yandex.YandexBannerItem;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;
import ob.InterfaceC44738b;

/* compiled from: YandexAvlPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/yandex/avl/c;", "Lcom/avito/android/advertising/adapter/items/yandex/avl/e;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44738b> f87713b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C30828i f87714c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC13381a f87715d;

    @Inject
    public c(@k h31.e<InterfaceC44738b> eVar, @k C30828i c30828i, @k InterfaceC13381a interfaceC13381a) {
        this.f87713b = eVar;
        this.f87714c = c30828i;
        this.f87715d = interfaceC13381a;
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
            com.avito.android.i r1 = r7.f87714c
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
            h31.e<ob.b> r3 = r7.f87713b
            r2.<init>(r3)
            Db.a r4 = r7.f87715d
            boolean r5 = r4.f()
            if (r5 == 0) goto L49
            com.avito.android.advertising.ui.h r5 = com.avito.android.advertising.ui.h.f88704a
            android.view.View r6 = r8.getF88600b()
            r5.getClass()
            com.avito.android.advertising.ui.h.b(r6, r9)
        L49:
            java.lang.Object r3 = r3.get()
            ob.b r3 = (ob.InterfaceC44738b) r3
            if (r3 == 0) goto L58
            com.avito.android.advertising.loaders.BannerInfo r5 = r9.getF74925c()
            r3.J4(r5, r10)
        L58:
            android.widget.ImageView r3 = r8.pi()
            if (r3 == 0) goto L67
            com.avito.android.advertising.adapter.items.adstub.avl.b r5 = new com.avito.android.advertising.adapter.items.adstub.avl.b
            r6 = 4
            r5.<init>(r2, r6)
            r3.setOnClickListener(r5)
        L67:
            com.avito.android.advertising.ui.g.b(r8, r1)
            r3 = 2131165281(0x7f070061, float:1.7944775E38)
            r8.H60(r3)
            com.avito.android.advertising.ui.g.a(r8, r1)
            r8.J60(r0)
            boolean r1 = r9.getIsHidden()
            com.avito.android.advertising.adapter.items.yandex.avl.a r3 = new com.avito.android.advertising.adapter.items.yandex.avl.a
            r3.<init>(r2, r9, r10)
            com.avito.android.advertising.adapter.items.yandex.avl.b r10 = new com.avito.android.advertising.adapter.items.yandex.avl.b
            r10.<init>(r2, r9)
            r8.pV(r0, r1, r3, r10)
            com.avito.android.advertising.splitter.YandexBadgeStyle r9 = r4.a()
            r8.Hn(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advertising.adapter.items.yandex.avl.c.k(Hb.d, com.avito.android.advertising.adapter.items.yandex.YandexBannerItem, int):void");
    }
}
