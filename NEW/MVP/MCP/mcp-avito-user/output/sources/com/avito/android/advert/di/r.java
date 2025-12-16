package com.avito.android.advert.di;

import Bx.InterfaceC13199b;
import Dh0.InterfaceC13400a;
import Tp0.InterfaceC15390A;
import U4.a;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.S0;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.C28170s;
import com.avito.android.advert.item.PreloadCacheKey;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.AdvertScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.InterfaceC30098l;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.di.module.X2;
import com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30575a;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.rec.ScreenSource;
import com.avito.android.util.C35838l3;
import com.avito.android.util.Kundle;
import h31.d;
import iT.C41343c;
import kotlin.G0;
import kotlin.Metadata;
import l9.InterfaceC43602b;
import ob.C44742f;
import u6.InterfaceC48807a;
import xh0.InterfaceC49945a;
import xh0.InterfaceC49946b;
import z6.InterfaceC50378a;

/* compiled from: AdvertFragmentComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/di/r;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
@com.avito.android.di.B
@com.avito.android.di.C
/* loaded from: classes10.dex */
public interface r {

    /* compiled from: AdvertFragmentComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/di/r$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @Y61.k
        a A(@Y61.l @M5.a Kundle kundle);

        @h31.b
        @Y61.k
        a B(@Y61.k C28170s c28170s);

        @h31.b
        @Y61.k
        a C(@Y61.l @c8.g TreeClickStreamParent treeClickStreamParent);

        @h31.b
        @Y61.k
        a D(long j12);

        @h31.b
        @Y61.k
        a E(@Y61.l PreloadCacheKey preloadCacheKey);

        @h31.b
        @Y61.k
        a F(@Y61.l @a.d Kundle kundle);

        @h31.b
        @Y61.k
        a G(@InterfaceC15390A.a @Y61.l Bundle bundle);

        @h31.b
        @Y61.k
        a H(@Y61.k ScreenSource screenSource);

        @h31.b
        @Y61.k
        a I(@Y61.l @InterfaceC43602b.a Kundle kundle);

        @h31.b
        @Y61.k
        a J(@Y61.l @C27710t.v String str);

        @h31.b
        @Y61.k
        a K(@Y61.l Integer num);

        @h31.b
        @Y61.k
        a L(@Y61.k com.avito.android.advert.item.r rVar);

        @h31.b
        @Y61.k
        a M(@Y61.k Y41.l<? super InterfaceC13400a, G0> lVar);

        @h31.b
        @Y61.k
        a N(@C27710t.u @Y61.k Y41.l<? super DeepLink, G0> lVar);

        @h31.b
        @Y61.k
        a O(@Y61.l @InterfaceC30098l Integer num);

        @h31.b
        @Y61.k
        a P(@Y61.k AdvertDetailsFragment advertDetailsFragment);

        @h31.b
        @Y61.k
        a Q(@P6.b @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a R(@Y61.l @O6.b Kundle kundle);

        @h31.b
        @Y61.k
        a S(@O3.b @Y61.k Y41.a<G0> aVar);

        @h31.b
        @Y61.k
        a T(@K9.b @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a U(@Y61.k Y41.p<? super GalleryItem, ? super Integer, G0> pVar);

        @h31.b
        @Y61.k
        a V(@C27710t.h @Y61.l String str);

        @h31.b
        @Y61.k
        a W(@a.e @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a X(@C27710t.c @Y61.l Bundle bundle);

        @h31.b
        @Y61.k
        a Y(@Y61.l @com.avito.android.B Kundle kundle);

        @h31.b
        @Y61.k
        a Z(@Y61.l AdvertDetailsMultiItemState advertDetailsMultiItemState);

        @h31.b
        @Y61.k
        a a0(@sr0.f @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @h31.b
        @Y61.k
        a b0(@Q6.b @Y61.l Kundle kundle);

        @Y61.k
        r build();

        @h31.b
        @Y61.k
        a c0(@Y61.k @InterfaceC49946b Y41.l<? super DeepLink, G0> lVar);

        @h31.b
        @Y61.k
        a d(@Y61.k ActivityC22955m activityC22955m);

        @h31.b
        @Y61.k
        a d0(@Y61.l @com.avito.android.advert.item.domoteka.g Kundle kundle);

        @h31.b
        @Y61.k
        a e(@Y61.k com.avito.android.analytics.screens.r rVar);

        @h31.b
        @Y61.k
        a e0();

        @h31.b
        @Y61.k
        a f0(@InterfaceC49945a @Y61.k Y41.l<? super DeepLink, G0> lVar);

        @h31.b
        @Y61.k
        a g(@Y61.k S0 s02);

        @Y61.k
        a g0(@Y61.k InterfaceC27709s interfaceC27709s);

        @h31.b
        @Y61.k
        a h(@Y61.k ScreenPerformanceTracker screenPerformanceTracker);

        @h31.b
        @Y61.k
        a h0(@InterfaceC50378a @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a i(@com.avito.android.deal_confirmation.di.b @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a i0(@Y61.l @InterfaceC48807a Kundle kundle);

        @h31.b
        @Y61.k
        a j(@Y61.k C44742f c44742f);

        @h31.b
        @Y61.k
        a j0(@a.c @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a k(@Y61.l @C27710t.e Bundle bundle);

        @h31.b
        @Y61.k
        a k0(@Y61.k AdvertDetailsFragment advertDetailsFragment);

        @Y61.k
        a l(@Y61.k InterfaceC30106l7 interfaceC30106l7);

        @h31.b
        @Y61.k
        a l0(@Y61.l @InterfaceC30575a Kundle kundle);

        @h31.b
        @Y61.k
        a m(@Y61.l @X2 Kundle kundle);

        @h31.b
        @Y61.k
        a m0(@Y61.l @L5.b Kundle kundle);

        @h31.b
        @Y61.k
        a n(@C27710t.InterfaceC2166t @Y61.l String str);

        @h31.b
        @Y61.k
        a n0(@C27710t.w @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a o0(@Y61.k AdvertDetailsFastOpenParams advertDetailsFastOpenParams);

        @h31.b
        @Y61.k
        a p(@com.avito.android.advertising.di.v @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a q(@o6.c @Y61.l Bundle bundle);

        @h31.b
        @Y61.k
        a r(@Y61.k @InterfaceC30174s String str);

        @h31.b
        @Y61.k
        a s();

        @Y61.k
        a t(@Y61.k C31138n0 c31138n0);

        @h31.b
        @Y61.k
        a u(@Y61.k C41343c c41343c);

        @Y61.k
        a v(@Y61.k cv.d dVar);

        @h31.b
        @Y61.k
        a w(@C27710t.a @Y61.k Y41.l<Object, G0> lVar);

        @h31.b
        @Y61.k
        a x(@Y61.l @InterfaceC13199b Kundle kundle);

        @h31.b
        @Y61.k
        a y(@Y61.k C35838l3 c35838l3);

        @h31.b
        @Y61.k
        a z(@Y61.k AdvertScreen advertScreen);
    }

    void a(@Y61.k AdvertDetailsFragment advertDetailsFragment);
}
