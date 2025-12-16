package com.avito.android.publish.di;

import Bx0.InterfaceC13200a;
import Fk.InterfaceC13812d;
import Jf0.InterfaceC14192a;
import Pd.InterfaceC14769a;
import Zd.InterfaceC19542a;
import Zd0.InterfaceC19545c;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.avito.android.Q1;
import com.avito.android.Z0;
import com.avito.android.ab_tests.groups.ServicesNotificationAboutAnomalyLowPricesGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.image.enhancement.InterfaceC30973d;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.publish.analytics.InterfaceC33515a;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.remote.H0;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.u1;
import com.avito.android.remote.x1;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dl0.InterfaceC39749a;
import hx.InterfaceC41184a;
import hz.InterfaceC41196a;
import java.util.Locale;
import kotlin.Metadata;
import lD.C43617a;
import nF.C44245a;
import nI0.InterfaceC44261b;
import sj0.InterfaceC48373a;
import t3.k0;
import t3.l0;
import t3.x0;
import u70.InterfaceC48811a;
import yc.C50213a;

/* compiled from: PublishDependencies.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/di/g;", "Lcom/avito/android/di/h;", "Lkj/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.di.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33816g extends InterfaceC29971h, kj.c {
    @Y61.k
    InterfaceC34401z0 B();

    @Y61.k
    C43617a C0();

    @Y61.k
    PublishIntentFactory C1();

    @Y61.k
    C50213a D1();

    @Y61.k
    InterfaceC41196a E0();

    @Y61.k
    InterfaceC30973d E4();

    @Y61.k
    u1 Eh();

    @t3.e0
    @Y61.k
    u3.l<SimpleTestGroupWithNone> H4();

    @Y61.k
    H0 I3();

    @Y61.k
    com.avito.android.remote.H K();

    @Y61.k
    com.avito.android.remote.X L2();

    @Y61.k
    OL.a M1();

    @Y61.k
    PublishDraftRepository Ma();

    @Y61.k
    com.avito.android.analytics.screens.D N5();

    @l0
    @Y61.k
    u3.l<SimpleTestGroupWithNone> O0();

    @Y61.k
    AK0.i Qc();

    @Y61.k
    x1 Qj();

    @Y61.k
    C44245a R0();

    @Y61.k
    SharedPreferences R1();

    @Y61.k
    com.avito.android.publish.draft_onboarding.i Rk();

    @Y61.k
    hJ.e S();

    @Y61.k
    com.avito.android.select.new_metro.j S4();

    @Y61.k
    com.avito.android.connection_quality.connectivity.a U();

    @Y61.k
    AttributesTreeConverter Ue();

    @Y61.k
    com.avito.android.publish.restriction.b Ul();

    @Y61.k
    com.avito.android.permissions.u V();

    @Y61.k
    com.avito.android.video_picker.e V9();

    @Y61.k
    Z0 W();

    @Y61.k
    PhotoPickerIntentFactory X();

    @Y61.k
    com.avito.android.select_districts.g Xd();

    @Y61.k
    hJ.i Y();

    @Y61.k
    LlmDescriptionPresenter Y0();

    @Y61.k
    InterfaceC13812d Yl();

    @Y61.k
    com.avito.android.photo_cache.a Zd();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    InterfaceC39749a ah();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    R0 c();

    @Y61.k
    @k0
    u3.l<SimpleTestGroupWithNone> c1();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    InterfaceC19545c d5();

    @Y61.k
    HM.a d7();

    @Y61.k
    InterfaceC13200a d8();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    Context g();

    @Y61.k
    InterfaceC30751h g0();

    @Y61.k
    com.avito.android.computer_vision.a g6();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    com.avito.android.account.E i();

    @Y61.k
    InterfaceC44261b i1();

    @Y61.k
    com.avito.android.util.C j();

    @Y61.k
    com.avito.android.publish.drafts.K j4();

    @Y61.k
    com.avito.android.publish.drafts.E jg();

    @Y61.k
    Application k();

    @Y61.k
    com.avito.android.server_time.f l();

    @Y61.k
    InterfaceC14192a l7();

    @x0
    @Y61.k
    u3.h<ServicesNotificationAboutAnomalyLowPricesGroup> lh();

    @Y61.k
    Locale locale();

    @Y61.k
    eH0.c m2();

    @Y61.k
    com.avito.android.remote.error.f o();

    @Y61.k
    InterfaceC41184a o7();

    @Y61.k
    SK0.b p();

    @Y61.k
    hJ.g p0();

    @Y61.k
    com.avito.android.phone_reverification_info.d p3();

    @Y61.k
    AK0.l r();

    @Y61.k
    com.avito.android.player_holder.a r0();

    @Y61.k
    InterfaceC35139d r1();

    @Y61.k
    InterfaceC14769a r7();

    @Y61.k
    com.avito.android.historical_suggests.provider.a re();

    @Y61.k
    Gson s();

    @Y61.k
    InterfaceC33515a sc();

    @Y61.k
    com.avito.android.llm.data.a sk();

    @Y61.k
    com.avito.android.deep_linking.x t();

    @Y61.k
    com.avito.android.suggest_institutes_bottom_sheet.a u8();

    @Y61.k
    com.avito.android.analytics.provider.a v();

    @Y61.k
    InterfaceC48373a v7();

    @Y61.k
    com.avito.android.account.G w();

    @Y61.k
    InterfaceC19542a x();

    @Y61.k
    InterfaceC48811a xf();

    @Y61.k
    com.avito.android.server_time.h y();

    @Y61.k
    com.avito.android.phone_confirmation.P y3();

    @Y61.k
    L0 z();

    @Y61.k
    Q1 z0();
}
