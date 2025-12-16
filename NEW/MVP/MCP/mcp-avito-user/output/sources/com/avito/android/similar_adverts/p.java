package com.avito.android.similar_adverts;

import Nw0.C14619a;
import Ow0.InterfaceC14743a;
import android.os.Bundle;
import android.os.SystemClock;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.section.z;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.S;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SimilarAdvertsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/similar_adverts/p;", "Lcom/avito/android/arch/mvi/android/j;", "LOw0/a;", "LOw0/c;", "", "Lcom/avito/android/serp/adapter/v;", "Lcom/avito/android/section/z;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p extends com.avito.android.arch.mvi.android.j<InterfaceC14743a, Ow0.c, Object> implements InterfaceC34863v, z {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f283985N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f283986O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f283987P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final String f283988Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final ScreenSource f283989R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f283990S;

    @Inject
    public p(@Y61.k com.avito.android.favorite.n nVar, @Y61.k com.avito.android.advert_collection_toast.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k String str, @Y61.k ScreenSource screenSource, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.similar_adverts.mvi.j jVar) {
        super(jVar, null, 2, null);
        this.f283985N = nVar;
        this.f283986O = bVar;
        this.f283987P = aVar;
        this.f283988Q = str;
        this.f283989R = screenSource;
        this.f283990S = interfaceC28373a;
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@Y61.k S s5, @Y61.l AbstractC30567a abstractC30567a) {
        this.f283985N.Ld(s5, abstractC30567a);
        this.f283986O.c(s5);
    }

    @Override // com.avito.android.section.z
    public final void Pa(@Y61.k DeepLink deepLink) {
        b.a.a(this.f283987P, deepLink, null, null, 6);
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34863v
    public final void k5(@Y61.k AdvertItem advertItem, @Y61.l Image image) {
        String str = advertItem.f268425c;
        String str2 = this.f283988Q;
        String str3 = advertItem.f268420a0;
        this.f283990S.c(new C14619a(str, str2, str3));
        Bundle bundle = new Bundle();
        bundle.putString("title", advertItem.f268428d);
        bundle.putParcelable("tree_parent", new TreeClickStreamParent(0L, "FAVORITE_ITEMS", null, null));
        bundle.putString("key_category_id", str3);
        bundle.putLong("click_time", SystemClock.elapsedRealtime());
        bundle.putParcelable("screen_source", this.f283989R);
        String str4 = advertItem.f268440i;
        if (str4 != null) {
            bundle.putString("price", str4);
        }
        String str5 = advertItem.f268446l;
        if (str5 != null) {
            bundle.putString("old_price", str5);
        }
        if (image != null) {
            bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
        }
        b.a.a(this.f283987P, advertItem.f268396O, null, bundle, 2);
    }

    @Override // La.g
    public final void ic(@Y61.k String str) {
    }

    @Override // com.avito.android.serp.adapter.K
    public final void p9(@Y61.k DeepLink deepLink) {
    }
}
