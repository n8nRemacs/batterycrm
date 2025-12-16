package com.avito.android.extended_profile_selection_create.select.di;

import Aw0.InterfaceC13094a;
import Hr.InterfaceC14024a;
import android.app.Application;
import android.content.Context;
import cE.C27025b;
import com.avito.android.B2;
import com.avito.android.C0;
import com.avito.android.C36135w2;
import com.avito.android.I1;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.extended_profile_image_edit.u;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.remote.D0;
import com.avito.android.remote.N;
import com.avito.android.remote.V0;
import com.avito.android.search.filter.C34600v;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import java.util.Locale;
import kotlin.Metadata;
import lE.C43624b;

/* compiled from: ExtendedProfileSelectionCreateDependencies.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/di/c;", "Lcom/avito/android/guests_selector/c;", "Lcom/avito/android/di/h;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.c
/* loaded from: classes13.dex */
public interface c extends com.avito.android.guests_selector.c, InterfaceC29971h {
    @Y61.k
    com.avito.android.photo_cache.b F();

    @Y61.k
    I1 H();

    @Y61.k
    NN.a H0();

    @Y61.k
    C43624b J();

    @Y61.k
    InterfaceC14024a L();

    @Y61.k
    B2 S0();

    @Y61.k
    D0 S2();

    @Y61.k
    C0 T0();

    @Y61.k
    com.avito.android.inline_filters.link.f U0();

    @Y61.k
    InterfaceC13094a V0();

    @Y61.k
    N W1();

    @Y61.k
    PhotoPickerIntentFactory X();

    @Y61.k
    V0 Z();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    R0 c();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    C36135w2 e0();

    @Y61.k
    Context g();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    E i();

    @Y61.k
    com.avito.android.lib.beduin_v2.feature.item.c j0();

    @Y61.k
    Application k();

    @Y61.k
    com.avito.android.onboarding_manager.f l0();

    @Y61.k
    Locale locale();

    @Y61.k
    InterfaceC35863o4 m();

    @Y61.k
    C34600v n2();

    @Y61.k
    Gson s();

    @Y61.k
    u u2();

    @Y61.k
    C27025b v0();

    @Y61.k
    com.avito.android.server_time.h y();
}
