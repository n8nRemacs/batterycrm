package com.avito.android.section.item.redesign;

import androidx.compose.runtime.internal.P;
import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28417h;
import com.avito.android.image_loader.From;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComplementaryAdvertRedesignItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/item/redesign/h;", "Lcom/avito/android/section/item/redesign/g;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<? extends InterfaceC34863v> f264778b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f264779c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f264780d;

    /* compiled from: ComplementaryAdvertRedesignItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/section/item/redesign/h$a;", "", "<init>", "()V", "", "EMPTY_PAYLOADS", "Ljava/util/List;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        C42784z0 c42784z0 = C42784z0.f406748b;
    }

    public h(@Y61.k h31.e<? extends InterfaceC34863v> eVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C36135w2 c36135w2) {
        this.f264778b = eVar;
        this.f264779c = interfaceC28373a;
        this.f264780d = c36135w2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        AdvertItem advertItem = (AdvertItem) aVar;
        Map<String, String> map = advertItem.f268398P;
        if (map != null && !map.isEmpty()) {
            this.f264779c.c(new C28417h(map));
        }
        DimmedImage dimmedImage = advertItem.f268368A;
        From from = !(dimmedImage != null ? L.f(dimmedImage.getDimming(), Boolean.FALSE) : false) ? From.f169444d : From.f169443c;
        lVar.a(new i(this, advertItem, i12, lVar, advertItem));
        lVar.F0(new j(this, advertItem));
        lVar.qJ(advertItem.f268456q);
        lVar.setTitle(advertItem.f268428d);
        lVar.p(advertItem.f268440i);
        lVar.Q0(advertItem.f268458r);
        lVar.o5(advertItem.f268416Y);
        lVar.B3(com.avito.android.image_loader.b.c(dimmedImage), advertItem.f268425c, from);
        if (this.f264780d.v().invoke().booleanValue()) {
            lVar.Z70(new k(this));
        }
        lVar.V(advertItem.f268462t);
        lVar.B1(advertItem.f268474z);
        lVar.setActive(advertItem.f268376E);
        lVar.setViewed(advertItem.f268394N);
        lVar.setFavorite(advertItem.f268380G);
    }
}
