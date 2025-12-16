package com.avito.android.advertising.kebab;

import android.annotation.SuppressLint;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HideableAdItemInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/kebab/o;", "Lcom/avito/android/advertising/kebab/n;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f87842a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f87843b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.a f87844c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.advertising.loaders.avito_targeting.g> f87845d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final m f87846e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f87847f = new com.jakewharton.rxrelay3.c<>();

    /* compiled from: HideableAdItemInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f87848b = new a<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* compiled from: HideableAdItemInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f87849b = new b<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Inject
    public o(@Y61.k i iVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.server_time.a aVar, @Y61.k h31.e<com.avito.android.advertising.loaders.avito_targeting.g> eVar, @Y61.k m mVar) {
        this.f87842a = iVar;
        this.f87843b = interfaceC28373a;
        this.f87844c = aVar;
        this.f87845d = eVar;
        this.f87846e = mVar;
    }

    @Override // com.avito.android.advertising.kebab.n
    @SuppressLint({"CheckResult"})
    public final void a(@Y61.k com.avito.android.advertising.i iVar, int i12, @Y61.k String str, @Y61.k BannerInfo bannerInfo, @Y61.k BannerPageSource bannerPageSource) {
        d(iVar.getF80343f());
        Integer hideId = iVar.getHideId();
        if (hideId != null) {
            int iIntValue = hideId.intValue();
            this.f87842a.d(iIntValue);
            this.f87847f.accept(Integer.valueOf(iIntValue));
            Integer numValueOf = Integer.valueOf(i12);
            BannerEvent.Type type = BannerEvent.Type.f87773b;
            this.f87844c.getClass();
            this.f87843b.c(new com.avito.android.advertising.analytics.events.i(bannerInfo, bannerPageSource, System.currentTimeMillis(), numValueOf, str));
            this.f87845d.get().a(iIntValue, i12).x(a.f87848b, b.f87849b);
        }
    }

    @Override // com.avito.android.advertising.kebab.n
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF87847f() {
        return this.f87847f;
    }

    @Override // com.avito.android.advertising.kebab.n
    public final void c(@Y61.k com.avito.android.advertising.i iVar, @Y61.k BannerInfo bannerInfo, @Y61.k BannerPageSource bannerPageSource) {
        Integer hideId = iVar.getHideId();
        if (hideId != null) {
            int iIntValue = hideId.intValue();
            this.f87842a.a(iIntValue);
            this.f87847f.accept(Integer.valueOf(iIntValue));
        }
        d(iVar.getF80343f());
        BannerEvent.Type type = BannerEvent.Type.f87773b;
        this.f87844c.getClass();
        this.f87843b.c(new com.avito.android.advertising.analytics.events.i(bannerInfo, bannerPageSource, System.currentTimeMillis(), null, null));
    }

    @Override // com.avito.android.advertising.kebab.n
    public final void d(@Y61.k String str) {
        this.f87842a.c(str);
        this.f87846e.a(str);
    }

    @Override // com.avito.android.advertising.kebab.n
    public final boolean e(@Y61.k com.avito.android.advertising.i iVar) {
        String f80343f = iVar.getF80343f();
        i iVar2 = this.f87842a;
        if (iVar2.b(f80343f)) {
            return true;
        }
        Integer hideId = iVar.getHideId();
        if (hideId != null) {
            return iVar2.e(hideId.intValue());
        }
        return false;
    }
}
