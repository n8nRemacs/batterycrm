package com.avito.android.bxcontent.di;

import Aw0.InterfaceC13094a;
import Bv0.C13190b;
import Cl.InterfaceC13318a;
import Cu0.C13359g;
import Gd.InterfaceC13866a;
import Go0.InterfaceC13902a;
import Hr.InterfaceC14024a;
import Id.InterfaceC14060a;
import Ma.C14462a;
import Rj.C15047a;
import Y61.k;
import Zd.InterfaceC19542a;
import ac.C19864a;
import android.app.Application;
import android.content.Context;
import cE.C27025b;
import com.avito.android.B2;
import com.avito.android.C0;
import com.avito.android.C29640d;
import com.avito.android.C30828i;
import com.avito.android.C34160q2;
import com.avito.android.I1;
import com.avito.android.J0;
import com.avito.android.M;
import com.avito.android.P;
import com.avito.android.U0;
import com.avito.android.ab_tests.configs.AutoFilterHintToastTestGroup;
import com.avito.android.ab_tests.configs.GridLayoutWithTwoColumnsAbTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.activeOrders.r;
import com.avito.android.advertising.di.C;
import com.avito.android.advertising.di.InterfaceC28344d;
import com.avito.android.analytics.statsd.F;
import com.avito.android.bxcontent.N1;
import com.avito.android.bxcontent.S1;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.O;
import com.avito.android.home.default_search_location.v;
import com.avito.android.home.o;
import com.avito.android.map.di.q;
import com.avito.android.messenger_unread_counter.impl_module.unread_popups.h;
import com.avito.android.notifications_settings.use_case.f;
import com.avito.android.permissions.u;
import com.avito.android.remote.H;
import com.avito.android.remote.InterfaceC34323k;
import com.avito.android.remote.InterfaceC34398y;
import com.avito.android.remote.N0;
import com.avito.android.remote.interceptor.V0;
import com.avito.android.replace_main.onboarding.view.s;
import com.avito.android.stories.view.j;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.user_viewed.feature.UserViewedTestGroup;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.L0;
import com.google.gson.Gson;
import java.util.Locale;
import js0.InterfaceC42421a;
import kotlin.Metadata;
import ks0.InterfaceC43493a;
import lD.C43617a;
import lE.C43624b;
import nM.InterfaceC44291a;
import nU.InterfaceC44331a;
import nd.InterfaceC44378a;
import pE0.InterfaceC46941a;
import ru.avito.messenger.MessengerApi;
import sN0.InterfaceC48080b;
import t3.InterfaceC48480k;
import t3.InterfaceC48481l;
import t3.InterfaceC48487s;
import t3.f0;
import u3.g;
import u3.l;
import ur.C49102c;
import vN.C49237a;
import w30.C49435a;
import wI.C49514a;
import wj.InterfaceC49636a;
import yu0.C50303a;

/* compiled from: BxContentDependencies.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/bxcontent/di/b;", "Lcom/avito/android/di/h;", "LnU/a;", "LpE0/a;", "LAX/a;", "Lcom/avito/android/di/O;", "Lcom/avito/android/advertising/di/C;", "Lcom/avito/android/advertising/di/d;", "Lcom/avito/android/guests_selector/c;", "Lcom/avito/android/map/di/q;", "LCl/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b extends InterfaceC29971h, InterfaceC44331a, InterfaceC46941a, AX.a, O, C, InterfaceC28344d, com.avito.android.guests_selector.c, q, InterfaceC13318a {
    @k
    com.avito.android.deal_confirmation.sheet.k A3();

    @InterfaceC48487s
    @k
    g<SimpleTestGroupWithNone> A6();

    @k
    N0 Am();

    @k
    C30828i B1();

    @k
    InterfaceC42421a Bm();

    @k
    C43617a C0();

    @k
    com.avito.android.bottom_navigation.space.a C6();

    @k
    InterfaceC43493a Cb();

    @HD.c
    @k
    l<SimpleTestGroupWithNone> Cf();

    @k
    com.avito.android.cv_actualization_suggest.domain.b Ch();

    @k
    B2 D();

    @k
    v De();

    @k
    j Dj();

    @k
    P E();

    @k
    S1 F5();

    @k
    InterfaceC44291a F7();

    @k
    com.avito.android.avito_blog.article_screen.ui.c Fl();

    @k
    C49514a Fm();

    @k
    C49102c G();

    @k
    TV.c G2();

    @k
    C34160q2 G3();

    @k
    f Gd();

    @k
    I1 H();

    @k
    NN.a H0();

    @k
    InterfaceC13902a H3();

    @k
    e70.k Hi();

    @k
    V0 I0();

    @k
    h Ie();

    @k
    C43624b J();

    @k
    l<GridLayoutWithTwoColumnsAbTestGroup> J2();

    @k
    Oj.b J3();

    @k
    BE0.a J4();

    @k
    com.avito.android.navigation_config.manager.a J6();

    @k
    H K();

    @k
    AD.a K2();

    @k
    MessengerApi K3();

    @k
    com.avito.android.replace_main.toast.c K5();

    @k
    InterfaceC14024a L();

    @k
    com.avito.android.replace_main.widget.a L3();

    @k
    C13190b M3();

    @k
    W20.f M4();

    @k
    g<UserViewedTestGroup> Mk();

    @k
    F N0();

    @k
    C50303a N3();

    @k
    ED.a N4();

    @k
    M O();

    @k
    InterfaceC13866a O1();

    @k
    com.avito.android.rubricator.list.category.f P9();

    @k
    Bu0.c Pj();

    @k
    C29640d Q();

    @k
    com.avito.android.services_transportation_widget.interactor.b Qb();

    @k
    C19864a R3();

    @InterfaceC48480k
    @k
    g<SimpleTestGroupWithNone> R5();

    @k
    com.avito.android.replace_main.widget.d Sc();

    @k
    InterfaceC34323k Sj();

    @k
    com.avito.android.server_time.a T();

    @k
    com.avito.android.connection_quality.connectivity.a U();

    @k
    com.avito.android.inline_filters.link.f U0();

    @k
    C13359g Ub();

    @k
    C49435a Ud();

    @k
    u V();

    @k
    InterfaceC13094a V0();

    @k
    C15047a V3();

    @k
    o Va();

    @k
    js0.b Vf();

    @k
    U0 X0();

    @k
    com.avito.android.timestamp_storage.domain.d X6();

    @k
    com.avito.android.remote.V0 Z();

    @k
    com.avito.android.analytics.provider.e Z0();

    @k
    WL.a a1();

    @k
    com.avito.android.ui.status_bar.e b0();

    @k
    com.avito.android.video_snippets.g b1();

    @k
    com.avito.android.hero_banner.widget.e bi();

    @k
    com.avito.android.geo.j c0();

    @k
    TV.f c2();

    @k
    N1 c3();

    @f0
    @k
    g<SimpleTestGroupWithNone> c5();

    @k
    com.avito.android.analytics.screens.tracker.degrade.a e6();

    @k
    J0 f0();

    @k
    InterfaceC48080b f1();

    @k
    Context g();

    @k
    com.avito.android.db.o g2();

    @k
    InterfaceC49636a g9();

    @k
    C0 gc();

    @k
    InterfaceC35845m2 h();

    @k
    C49237a h1();

    @k
    com.avito.android.serp.analytics.widgets_tracker.g h2();

    @k
    com.avito.android.advert.viewed.persistance.b i5();

    @k
    com.avito.android.util.C j();

    @k
    com.avito.android.lib.beduin_v2.feature.item.c j0();

    @k
    com.avito.android.progress_info_toast_bar.a j3();

    @k
    Application k();

    @k
    InterfaceC14060a k1();

    @k
    nI.b kd();

    @k
    com.avito.android.server_time.f l();

    @k
    com.avito.android.onboarding_manager.f l0();

    @k
    InterfaceC34398y l2();

    @k
    Locale locale();

    @k
    InterfaceC35863o4 m();

    @k
    com.avito.android.hero_banner.widget.h mb();

    @k
    InterfaceC35741a1 n();

    @k
    r n6();

    @k
    P30.b nj();

    @k
    com.avito.android.remote.error.f o();

    @k
    I30.e o1();

    @k
    SK0.b p();

    @InterfaceC48481l
    @k
    l<AutoFilterHintToastTestGroup> p9();

    @k
    com.avito.android.advert.viewed.persistance.j q0();

    @k
    com.avito.android.player_holder.a r0();

    @k
    InterfaceC35139d r1();

    @k
    wu0.e rf();

    @k
    Gson s();

    @B
    @k
    com.avito.android.progress_info_toast_bar.presenter.b s1();

    @k
    com.avito.android.services_realty_sheet.feedback.b sj();

    @k
    com.avito.android.bxcontent.serp.a t8();

    @k
    com.avito.android.analytics.provider.a v();

    @k
    C27025b v0();

    @k
    com.avito.android.services_transportation_widget.interactor.g v9();

    @k
    C14462a vc();

    @k
    com.avito.android.progress_info_toast_bar.interactor.g w7();

    @k
    InterfaceC19542a x();

    @k
    InterfaceC44378a x4();

    @k
    com.avito.android.replace_main.exit_onboarding.c xk();

    @k
    com.avito.android.server_time.h y();

    @k
    com.avito.android.analytics.H y0();

    @k
    com.avito.android.main_start_onboarding.a yi();

    @k
    L0 z();

    @k
    com.avito.android.navigation_config.manager.a z3();

    @k
    s zg();
}
