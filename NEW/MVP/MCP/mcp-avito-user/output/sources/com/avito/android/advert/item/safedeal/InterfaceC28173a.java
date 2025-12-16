package com.avito.android.advert.item.safedeal;

import Ev.InterfaceC13531b;
import android.os.Bundle;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.safedeal.info.f;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.h;
import com.avito.android.advert_core.safedeal.h;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetails;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/safedeal/a;", "Lcom/avito/android/advert/item/safedeal/info/f$b;", "Lcom/avito/android/advert/item/safedeal/trust_factors/d;", "Lcom/avito/android/advert_core/safedeal/h$a;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/h$b;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.safedeal.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC28173a extends f.b, com.avito.android.advert.item.safedeal.trust_factors.d, h.a, h.b {

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/a$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.safedeal.a$a, reason: collision with other inner class name */
    public interface InterfaceC2325a {

        /* compiled from: AdvertSafeDealPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.item.safedeal.a$a$a, reason: collision with other inner class name */
        public static final class C2326a {
            public static /* synthetic */ void a(Z0 z02, DeepLink deepLink, Bundle bundle, int i12) {
                if ((i12 & 2) != 0) {
                    bundle = null;
                }
                z02.w(bundle, deepLink, null);
            }
        }
    }

    @Y61.k
    C41981q0 D();

    @Y61.k
    Bundle H();

    void a(@Y61.l String str);

    void b(@Y61.l Bundle bundle);

    void c0();

    void e0();

    @Y61.l
    Bundle f();

    void h();

    void j0(@Y61.k Z0 z02);

    void k(@Y61.l I1 i12);

    void l(@Y61.k AdvertDetails advertDetails);

    void m();

    void n(@Y61.l AdvertDetailsStyle advertDetailsStyle);

    void o(@Y61.l AdvertDetails advertDetails);

    void p(@Y61.l AdvertDetails advertDetails);

    void q();

    void s(@Y61.k InterfaceC13531b interfaceC13531b);

    void w(@Y61.k io.reactivex.rxjava3.core.z<C43501a> zVar);
}
