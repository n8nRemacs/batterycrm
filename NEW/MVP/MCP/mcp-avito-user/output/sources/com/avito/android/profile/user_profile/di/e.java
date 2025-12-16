package com.avito.android.profile.user_profile.di;

import Ha0.InterfaceC13938a;
import Mg0.InterfaceC14487a;
import Zd.InterfaceC19542a;
import android.app.Application;
import android.content.Context;
import cK.InterfaceC27058a;
import com.avito.android.I1;
import com.avito.android.M;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.account.E;
import com.avito.android.account.G;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.remote.H;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.profile.generated.api.ProfileApi;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35863o4;
import com.google.gson.Gson;
import f90.F;
import hD.C40806a;
import java.util.Locale;
import k60.C42524a;
import kotlin.Metadata;
import nF.C44245a;
import nI0.InterfaceC44261b;
import vm.C49349d;
import vm.InterfaceC49346a;

/* compiled from: UserProfileDependencies.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/di/e;", "Lcom/avito/android/di/h;", "LK3/b;", "LHa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e extends InterfaceC29971h, K3.b, InterfaceC13938a {
    @Y61.k
    InterfaceC34401z0 B();

    @Y61.k
    NL.a Bb();

    @Y61.k
    C49349d C3();

    @Y61.k
    com.avito.android.bottom_navigation.space.a C6();

    @Y61.k
    I1 H();

    @Y61.k
    InterfaceC14487a I1();

    @Y61.k
    InterfaceC27058a I5();

    @Y61.k
    H K();

    @Y61.k
    PreloadingPromiseTestGroup M6();

    @Y61.k
    M O();

    @Y61.k
    C40806a R();

    @Y61.k
    C44245a R0();

    @Y61.k
    A30.c Rj();

    @Y61.k
    com.avito.android.settings.c T2();

    @Y61.k
    com.avito.android.service_booking_persistence.g V2();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    F bb();

    @Y61.k
    Bw0.i bm();

    @Y61.k
    ProfileApi c7();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    com.avito.android.passport_lib.h d4();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    com.avito.android.notification_center.counter.f e5();

    @Y61.k
    C42524a fi();

    @Y61.k
    Context g();

    @Y61.k
    InterfaceC30751h g0();

    @Y61.k
    com.avito.android.profile.user_profile.cards.active_orders.features.b gh();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    com.avito.android.clientEventBus.a h0();

    @Y61.k
    InterfaceC49346a hg();

    @Y61.k
    E i();

    @Y61.k
    InterfaceC44261b i1();

    @Y61.k
    C j();

    @Y61.k
    Application k();

    @Y61.k
    Locale locale();

    @Y61.k
    InterfaceC35863o4 m();

    @Y61.k
    N90.p mi();

    @Y61.k
    com.avito.android.activeOrders.r n6();

    @Y61.k
    SK0.b p();

    @Y61.k
    com.avito.android.deep_linking.x q();

    @Y61.k
    Gson s();

    @Y61.k
    l90.d s6();

    @Y61.k
    l90.p t0();

    @Y61.k
    com.avito.android.profile_settings.c u9();

    @Y61.k
    gD.f v1();

    @Y61.k
    F90.c v4();

    @Y61.k
    G w();

    @Y61.k
    InterfaceC27663a w0();

    @Y61.k
    InterfaceC19542a x();
}
