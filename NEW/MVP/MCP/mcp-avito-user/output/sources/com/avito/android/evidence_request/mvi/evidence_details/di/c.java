package com.avito.android.evidence_request.mvi.evidence_details.di;

import android.app.Application;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.remote.K;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import java.util.Locale;
import kotlin.Metadata;
import t3.k0;
import t3.l0;

/* compiled from: EvidenceDetailsDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/di/c;", "Lcom/avito/android/di/h;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface c extends InterfaceC29971h {
    @Y61.k
    K E1();

    @Y61.k
    com.avito.android.photo_cache.b F();

    @Y61.k
    AppealId G4();

    @l0
    @Y61.k
    u3.l<SimpleTestGroupWithNone> O0();

    @Y61.k
    hJ.e S();

    @Y61.k
    PhotoPickerIntentFactory X();

    @Y61.k
    hJ.i Y();

    @Y61.k
    LlmDescriptionPresenter Y0();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    R0 c();

    @Y61.k
    @k0
    u3.l<SimpleTestGroupWithNone> c1();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    C j();

    @Y61.k
    Application k();

    @Y61.k
    Locale locale();

    @Y61.k
    InterfaceC35741a1 n();

    @Y61.k
    hJ.g p0();

    @Y61.k
    G w();

    @Y61.k
    com.avito.android.server_time.h y();

    @Y61.k
    Q1 z0();
}
