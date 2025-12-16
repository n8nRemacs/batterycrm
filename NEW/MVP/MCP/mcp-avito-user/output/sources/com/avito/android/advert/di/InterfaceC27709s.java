package com.avito.android.advert.di;

import Gd.InterfaceC13866a;
import Gx.InterfaceC13925a;
import Hr.InterfaceC14024a;
import Id.InterfaceC14060a;
import Mg0.InterfaceC14487a;
import Mn0.InterfaceC14512b;
import Nl0.InterfaceC14587a;
import Pk0.InterfaceC14796a;
import Pv0.InterfaceC14844a;
import Rx.C15091a;
import Uq.InterfaceC15558a;
import Zd.InterfaceC19542a;
import Zf.InterfaceC19551a;
import an.C19914c;
import android.app.Application;
import android.content.Context;
import bO.InterfaceC25536a;
import co0.C27234c;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.C30828i;
import com.avito.android.C34161r;
import com.avito.android.C36135w2;
import com.avito.android.I1;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.U0;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.configs.CrossFadeOpenAbTestGroup;
import com.avito.android.ab_tests.configs.GridLayoutWithTwoColumnsAbTestGroup;
import com.avito.android.ab_tests.configs.MultiItemOutlinedChipsTestGroup;
import com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup;
import com.avito.android.ab_tests.configs.SparePartsGarageItemCompatV2RenaissanceTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ab_tests.groups.StandardizeButtonWidthTestGroup;
import com.avito.android.advert.C27794f;
import com.avito.android.advert.item.C28124e0;
import com.avito.android.advertising.di.InterfaceC28344d;
import com.avito.android.bxcontent.N1;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.features.auto.ab_tests.configs.AutoAdvertDetailsI2IDealerBlockTestGroup;
import com.avito.android.features.auto.ab_tests.configs.AutoMediaMotoWaterTestGroup;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.remote.InterfaceC34398y;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.interceptor.V0;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.L0;
import com.google.gson.Gson;
import dd0.C39710c;
import fa.InterfaceC40383a;
import fn0.C40450a;
import g30.C40525a;
import java.util.Locale;
import kf.InterfaceC42678a;
import kotlin.Metadata;
import lD.C43617a;
import lE.C43624b;
import mR.InterfaceC44004a;
import nU.InterfaceC44331a;
import nd.InterfaceC44378a;
import oW.InterfaceC44697a;
import okhttp3.OkHttpClient;
import ow.InterfaceC44946a;
import ru.avito.messenger.MessengerApi;
import sN0.InterfaceC48080b;
import t3.InterfaceC48483n;
import t3.InterfaceC48489u;
import t3.InterfaceC48490v;
import ur.C49102c;
import vN.C49237a;
import vx0.InterfaceC49391a;
import wi0.InterfaceC49632c;

/* compiled from: AdvertFragmentDependencies.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/advert/di/s;", "Lcom/avito/android/di/h;", "LnU/a;", "Lcom/avito/android/advertising/di/C;", "Lkj/c;", "Lcom/avito/android/advertising/di/d;", "LoW/a;", "LPv0/a;", "LbO/a;", "Lcom/avito/android/interior_photos_block/di/c;", "Lcom/avito/android/mortgage_calculator/internal/di/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.di.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC27709s extends InterfaceC29971h, InterfaceC44331a, com.avito.android.advertising.di.C, kj.c, InterfaceC28344d, InterfaceC44697a, InterfaceC14844a, InterfaceC25536a, com.avito.android.interior_photos_block.di.c, com.avito.android.mortgage_calculator.internal.di.c {
    @Y61.k
    com.avito.android.deal_confirmation.sheet.k A3();

    @Y61.k
    InterfaceC42678a A4();

    @Y61.k
    com.avito.android.recall_me.domain.q A9();

    @Y61.k
    InterfaceC34401z0 B();

    @Y61.k
    C30828i B1();

    @Y61.k
    com.avito.android.newcars.sendlead.impl.a B9();

    @Y61.k
    C43617a C0();

    @Y61.k
    C19914c Cc();

    @Y61.k
    B2 D();

    @Y61.k
    com.avito.android.advert.viewed.a D0();

    @Y61.k
    com.avito.android.P E();

    @Y61.k
    InterfaceC44378a E5();

    @Y61.k
    C15091a E7();

    @Y61.k
    C39710c Ej();

    @Y61.k
    com.avito.android.photo_gallery.F F0();

    @Y61.k
    E6.a F9();

    @Y61.k
    C49102c G();

    @oD.k
    @Y61.k
    u3.l<AutoMediaMotoWaterTestGroup> G5();

    @Y61.k
    com.avito.android.autoteka.data.b G9();

    @Y61.k
    u3.l<StandardizeButtonWidthTestGroup> Gb();

    @Y61.k
    I1 H();

    @Y61.k
    IH.a H1();

    @Y61.k
    V0 I0();

    @Y61.k
    InterfaceC14487a I1();

    @Y61.k
    InterfaceC13925a Ik();

    @Y61.k
    C43624b J();

    @Y61.k
    InterfaceC30570d J0();

    @Y61.k
    u3.l<GridLayoutWithTwoColumnsAbTestGroup> J2();

    @Y61.k
    com.avito.android.services_portfolio.uxFeedback.c Jc();

    @Y61.k
    com.avito.android.rating_persistence.llm_summary.i Jg();

    @Y61.k
    InterfaceC44004a Jl();

    @Y61.k
    com.avito.android.remote.Q K1();

    @Y61.k
    AD.a K2();

    @Y61.k
    MessengerApi K3();

    @Y61.k
    InterfaceC14024a L();

    @Y61.k
    com.avito.android.favorite.r L0();

    @Y61.k
    com.avito.android.advert_multi_items.param_chips.b L7();

    @Y61.k
    InterfaceC49391a Lc();

    @Y61.k
    InterfaceC49632c Le();

    @oD.l
    @Y61.k
    u3.l<SimpleTestGroupWithNone> Lf();

    @Y61.k
    com.avito.android.webview.m M0();

    @Y61.k
    OL.a M1();

    @Y61.k
    com.avito.android.analytics.statsd.F N0();

    @Y61.k
    ZL.a N7();

    @Y61.k
    C28124e0 N8();

    @Y61.k
    C40525a Nf();

    @Y61.k
    u3.f<CrossFadeOpenAbTestGroup> Nk();

    @Y61.k
    com.avito.android.M O();

    @Y61.k
    InterfaceC13866a O1();

    @Y61.k
    com.avito.android.progress_info_toast_bar.interactor.g O3();

    @Y61.k
    @InterfaceC48483n
    u3.g<SimpleTestGroupWithNone> O7();

    @Y61.k
    C27794f P7();

    @Y61.k
    C29640d Q();

    @Y61.k
    com.avito.android.imv_services_dialog.factory.a Q4();

    @Y61.k
    hJ.e S();

    @oD.h
    @Y61.k
    u3.l<SimpleTestGroupWithNone> S5();

    @Y61.k
    com.avito.android.server_time.a T();

    @Y61.k
    com.avito.android.autoteka.data.a T1();

    @Y61.k
    com.avito.android.connection_quality.connectivity.a U();

    @Y61.k
    InterfaceC15558a U1();

    @Y61.k
    com.avito.android.early_access_advert.e U7();

    @Y61.k
    com.avito.android.permissions.u V();

    @Y61.k
    com.avito.android.advert.item.realty_usp.d V7();

    @Y61.k
    UN.a W6();

    @Y61.k
    U0 X0();

    @Y61.k
    Z9.a Xb();

    @Y61.k
    hJ.i Y();

    @Y61.k
    VD.b Y3();

    @Y61.k
    com.avito.android.analytics.provider.e Z0();

    @Y61.k
    com.avito.android.advert_core.price_with_delivery.c Z2();

    @Y61.k
    WL.a a1();

    @Y61.k
    com.avito.android.favorites.V a3();

    @Y61.k
    com.avito.android.spare_parts.bottom_sheet.j ae();

    @Y61.k
    com.avito.android.ui.status_bar.e b0();

    @Y61.k
    com.avito.android.video_snippets.g b1();

    @Y61.k
    C40450a be();

    @Y61.k
    N1 c3();

    @Y61.k
    C34161r c6();

    @Y61.k
    fa.d cf();

    @Y61.k
    InterfaceC40383a d2();

    @Y61.k
    InterfaceC14512b d3();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    C36135w2 e0();

    @Y61.k
    l90.n e1();

    @Y61.k
    f90.n e2();

    @Y61.k
    com.avito.android.analytics.screens.tracker.degrade.a e6();

    @Y61.k
    com.avito.android.advert.item.recall_me.k eg();

    @Y61.k
    InterfaceC48080b f1();

    @Y61.k
    u3.l<RiseIcebreakersItemTestGroup> ff();

    @Override // com.avito.android.mortgage_calculator.internal.di.c
    @Y61.k
    Context g();

    @Y61.k
    InterfaceC30751h g0();

    @Y61.k
    InterfaceC19551a gg();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    C49237a h1();

    @InterfaceC48489u
    @Y61.k
    u3.l<SimpleTestGroupWithNone> hh();

    @Y61.k
    com.avito.android.developments_advice.m hi();

    @Y61.k
    InterfaceC44946a i6();

    @Y61.k
    com.avito.android.util.C j();

    @Y61.k
    com.avito.android.messenger.G j1();

    @Y61.k
    InterfaceC34162r0 j2();

    @Y61.k
    com.avito.android.progress_info_toast_bar.a j3();

    @Y61.k
    com.avito.android.photo_gallery.grid_gallery.g jd();

    @Y61.k
    Application k();

    @Y61.k
    InterfaceC14060a k1();

    @Y61.k
    u3.f<MultiItemOutlinedChipsTestGroup> k6();

    @Y61.k
    com.avito.android.onboarding_manager.f l0();

    @Y61.k
    InterfaceC34398y l2();

    @FI.c
    @Y61.k
    u3.f<SimpleTestGroup> lb();

    @Y61.k
    Locale locale();

    @Y61.k
    InterfaceC35863o4 m();

    @Y61.k
    com.avito.android.favorite.x m0();

    @Y61.k
    DI.c m6();

    @Y61.k
    G6.a m9();

    @Y61.k
    InterfaceC35741a1 n();

    @Y61.k
    OkHttpClient n4();

    @Y61.k
    com.avito.android.analytics.screens.H ne();

    @Y61.k
    com.avito.android.remote.error.f o();

    @Y61.k
    I30.e o1();

    @Y61.k
    InterfaceC27642e om();

    @Y61.k
    SK0.b p();

    @Y61.k
    ZI.a q4();

    @Y61.k
    com.avito.android.item_map.a q5();

    @Y61.k
    C27234c q6();

    @Y61.k
    com.avito.android.player_holder.a r0();

    @Y61.k
    @InterfaceC48490v
    u3.l<SimpleTestGroupWithNone> r6();

    @Y61.k
    Gson s();

    @Y61.k
    com.avito.android.progress_info_toast_bar.presenter.b s1();

    @Y61.k
    com.avito.android.credits.g sa();

    @Y61.k
    com.avito.android.deep_linking.x t();

    @Y61.k
    com.avito.android.pinch_to_zoom.b t1();

    @Y61.k
    DP.a u1();

    @Y61.k
    com.avito.android.mortgage_calculator.data.h ug();

    @Y61.k
    InterfaceC14587a um();

    @Y61.k
    com.avito.android.credits.installments.d v3();

    @Y61.k
    u3.f<SparePartsGarageItemCompatV2RenaissanceTestGroup> v5();

    @Y61.k
    @oD.j
    u3.g<AutoAdvertDetailsI2IDealerBlockTestGroup> vk();

    @Y61.k
    com.avito.android.lib.beduin_v2.repository.domain.cart_items.h w1();

    @Y61.k
    com.avito.android.advert_multi_items.param_images.b w6();

    @Y61.k
    com.avito.android.photo_gallery_carousel.gallery_view.b wl();

    @Y61.k
    com.avito.android.ab_tests.d0 wm();

    @Y61.k
    InterfaceC19542a x();

    @Y61.k
    InterfaceC14796a xc();

    @Y61.k
    DF0.g xl();

    @Y61.k
    com.avito.android.server_time.h y();

    @Y61.k
    com.avito.android.analytics.H y0();

    @Y61.k
    Yo.q ye();

    @Y61.k
    com.avito.android.advert.viewed.persistance.j ym();

    @Y61.k
    L0 z();

    @Y61.k
    com.avito.android.mortgage_calculator.data.b zf();
}
