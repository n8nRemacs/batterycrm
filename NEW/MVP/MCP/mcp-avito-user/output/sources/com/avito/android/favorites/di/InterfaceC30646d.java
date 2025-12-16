package com.avito.android.favorites.di;

import Gd.InterfaceC13866a;
import Id.InterfaceC14060a;
import ac.C19864a;
import bj0.InterfaceC25663c;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.C30828i;
import com.avito.android.M;
import com.avito.android.P;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.advertising.di.InterfaceC28344d;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.bxcontent.S1;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.O;
import com.avito.android.favorites.InterfaceC30605b1;
import com.avito.android.favorites.V;
import com.avito.android.favorites.X;
import com.avito.android.remote.interceptor.V0;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L0;
import iE.C41273b;
import java.util.Locale;
import kotlin.Metadata;
import nU.InterfaceC44331a;
import sN0.InterfaceC48080b;
import t3.InterfaceC48488t;
import ur.C49102c;
import vN.C49237a;
import vd0.C49311a;

/* compiled from: FavoriteAdvertsDependencies.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/favorites/di/d;", "Lcom/avito/android/di/h;", "Lkj/c;", "Lcom/avito/android/di/O;", "Lcom/avito/android/advertising/di/d;", "Lcom/avito/android/advertising/di/C;", "LnU/a;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorites.di.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30646d extends InterfaceC29971h, kj.c, O, InterfaceC28344d, com.avito.android.advertising.di.C, InterfaceC44331a {
    @Y61.k
    com.avito.android.permissions.z A();

    @Y61.k
    C30828i B1();

    @Y61.k
    B2 D();

    @Y61.k
    AD.a Da();

    @Y61.k
    P E();

    @Y61.k
    com.avito.android.cart_snippet_actions.a F3();

    @Y61.k
    S1 F5();

    @Y61.k
    C49102c G();

    @Y61.k
    ZC.c H5();

    @Y61.k
    V0 I0();

    @Y61.k
    Yo.q La();

    @Y61.k
    com.avito.android.permissions.G N();

    @Y61.k
    com.avito.android.analytics.statsd.F N0();

    @Y61.k
    M O();

    @Y61.k
    InterfaceC13866a O1();

    @Y61.k
    C29640d Q();

    @Y61.k
    X Q6();

    @Y61.k
    C19864a R3();

    @Y61.k
    com.avito.android.server_time.a T();

    @Y61.k
    com.avito.android.connection_quality.connectivity.a U();

    @InterfaceC48488t
    @Y61.k
    u3.h<SimpleTestGroup> U3();

    @Y61.k
    C41273b U5();

    @Y61.k
    InterfaceC25663c Ui();

    @Y61.k
    com.avito.android.permissions.u V();

    @Y61.k
    com.avito.android.cart_snippet_actions.i V5();

    @Y61.k
    PreloadingPromiseTestGroup Y1();

    @Y61.k
    WL.a a1();

    @Y61.k
    V a3();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    com.avito.android.video_snippets.g b1();

    @Y61.k
    com.avito.android.geo.j c0();

    @Y61.k
    InterfaceC48080b f1();

    @Y61.k
    com.avito.android.favorite.D gl();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    C49237a h1();

    @Y61.k
    com.avito.android.serp.analytics.widgets_tracker.g h2();

    @Y61.k
    com.avito.android.util.C j();

    @Y61.k
    com.avito.android.progress_info_toast_bar.a j3();

    @Y61.k
    InterfaceC14060a k1();

    @Y61.k
    com.avito.android.server_time.f l();

    @Y61.k
    com.avito.android.onboarding_manager.f l0();

    @Y61.k
    Locale locale();

    @Y61.k
    InterfaceC35741a1 n();

    @Y61.k
    com.avito.android.remote.error.f o();

    @Y61.k
    C49311a o4();

    @Y61.k
    SK0.b p();

    @Y61.k
    com.avito.android.advert.viewed.persistance.j q0();

    @Y61.k
    com.avito.android.sales_items.a qh();

    @Y61.k
    com.avito.android.player_holder.a r0();

    @com.avito.android.di.B
    @Y61.k
    com.avito.android.progress_info_toast_bar.presenter.b s1();

    @Y61.k
    com.avito.android.sales_items.m t7();

    @Y61.k
    com.avito.android.account.G w();

    @Y61.k
    com.avito.android.lib.beduin_v2.repository.domain.cart_items.h w1();

    @Y61.k
    com.avito.android.progress_info_toast_bar.interactor.g w7();

    @Y61.k
    hE.b xj();

    @Y61.k
    com.avito.android.server_time.h y();

    @Y61.k
    com.avito.android.analytics.H y0();

    @Y61.k
    L0 z();

    @Y61.k
    InterfaceC30605b1 zj();
}
