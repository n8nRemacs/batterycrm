package com.avito.android.advertising.adapter.items.buzzoola.video;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import tb.C48637h;

/* compiled from: CommercialVideoPerfInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/video/h;", "Lcom/avito/android/advertising/adapter/items/buzzoola/video/g;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f87560a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BannerPageSource f87561b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HashMap<Long, a> f87562c = new HashMap<>();

    @Inject
    public h(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k BannerPageSource bannerPageSource) {
        this.f87560a = interfaceC28373a;
        this.f87561b = bannerPageSource;
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.video.g
    public final void a(long j12, @Y61.k BannerInfo bannerInfo) {
        HashMap<Long, a> map = this.f87562c;
        if (map.containsKey(Long.valueOf(j12))) {
            return;
        }
        map.put(Long.valueOf(j12), new a(bannerInfo, Long.valueOf(System.currentTimeMillis()), null, null, null, 0, 0, 124, null));
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.video.g
    public final void b(long j12, boolean z12) {
        Long lValueOf;
        a aVar = this.f87562c.get(Long.valueOf(j12));
        if (aVar == null) {
            return;
        }
        if (!z12) {
            aVar.f87531g++;
            return;
        }
        Long l12 = aVar.f87527c;
        Long lValueOf2 = null;
        if (l12 != null) {
            long jLongValue = l12.longValue();
            Long l13 = aVar.f87526b;
            if (l13 == null) {
                l13 = aVar.f87527c;
            }
            lValueOf = Long.valueOf(jLongValue - l13.longValue());
        } else {
            lValueOf = null;
        }
        Long l14 = aVar.f87529e;
        if (l14 != null) {
            long jLongValue2 = l14.longValue();
            Long l15 = aVar.f87528d;
            if (l15 == null) {
                l15 = aVar.f87529e;
            }
            lValueOf2 = Long.valueOf(jLongValue2 - l15.longValue());
        }
        if (lValueOf == null || lValueOf2 == null) {
            return;
        }
        this.f87560a.c(new tb.k(this.f87561b, aVar.f87525a, Integer.valueOf((int) lValueOf.longValue()), Integer.valueOf((int) lValueOf2.longValue())));
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.video.g
    public final void c(int i12, long j12) {
        a aVar = this.f87562c.get(Long.valueOf(j12));
        if (aVar == null) {
            return;
        }
        aVar.f87530f += i12;
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.video.g
    public final void d(long j12) {
        HashMap<Long, a> map = this.f87562c;
        a aVar = map.get(Long.valueOf(j12));
        if (aVar == null) {
            return;
        }
        this.f87560a.c(new C48637h(this.f87561b, aVar.f87525a, Integer.valueOf(aVar.f87530f), Integer.valueOf(aVar.f87531g)));
        map.remove(Long.valueOf(j12));
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.video.g
    public final void e(long j12) {
        a aVar;
        HashMap<Long, a> map = this.f87562c;
        if (!map.containsKey(Long.valueOf(j12)) || (aVar = map.get(Long.valueOf(j12))) == null) {
            return;
        }
        aVar.f87528d = Long.valueOf(System.currentTimeMillis());
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.video.g
    public final void f(long j12) {
        a aVar;
        HashMap<Long, a> map = this.f87562c;
        if (map.containsKey(Long.valueOf(j12))) {
            a aVar2 = map.get(Long.valueOf(j12));
            if ((aVar2 != null ? aVar2.f87527c : null) != null || (aVar = map.get(Long.valueOf(j12))) == null) {
                return;
            }
            aVar.f87527c = Long.valueOf(System.currentTimeMillis());
        }
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.video.g
    public final void g(long j12) {
        a aVar;
        HashMap<Long, a> map = this.f87562c;
        if (!map.containsKey(Long.valueOf(j12)) || (aVar = map.get(Long.valueOf(j12))) == null) {
            return;
        }
        aVar.f87529e = Long.valueOf(System.currentTimeMillis());
    }
}
