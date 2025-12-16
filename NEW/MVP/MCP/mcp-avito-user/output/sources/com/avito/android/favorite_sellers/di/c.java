package com.avito.android.favorite_sellers.di;

import Pz.C14860a;
import android.content.Context;
import com.avito.android.C36135w2;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.InterfaceC29975l;
import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.favorite.r;
import com.avito.android.favorite.x;
import com.avito.android.remote.Q;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.core.z;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: FavoriteSellersDependencies.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/di/c;", "LoC/b;", "Lcom/avito/android/di/h;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface c extends oC.b, InterfaceC29971h {
    @Y61.k
    com.avito.android.notification.m A0();

    @Y61.k
    com.avito.android.advert.viewed.a D0();

    @InterfaceC29975l
    @Y61.k
    com.avito.android.common.a D4();

    @Y61.k
    z<C14860a> Ge();

    @Y61.k
    InterfaceC30570d J0();

    @Y61.k
    Q K1();

    @Y61.k
    r L0();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    R0 c();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    C36135w2 e0();

    @Y61.k
    Context g();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    E i();

    @Y61.k
    InterfaceC34162r0 j2();

    @Y61.k
    Locale locale();

    @Y61.k
    x m0();

    @Y61.k
    InterfaceC35741a1 n();

    @Y61.k
    com.avito.android.advert.viewed.persistance.j q0();

    @Y61.k
    com.avito.android.server_time.h y();

    @Y61.k
    L0 z();
}
