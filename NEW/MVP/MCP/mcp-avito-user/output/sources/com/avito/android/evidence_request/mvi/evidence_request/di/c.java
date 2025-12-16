package com.avito.android.evidence_request.mvi.evidence_request.di;

import Y61.k;
import android.app.Application;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.remote.K;
import com.avito.android.server_time.h;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import hJ.g;
import hJ.i;
import java.util.Locale;
import kotlin.Metadata;
import t3.k0;
import t3.l0;
import u3.l;

/* compiled from: EvidenceRequestDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/di/c;", "Lcom/avito/android/di/h;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface c extends InterfaceC29971h {
    @k
    K E1();

    @k
    com.avito.android.photo_cache.b F();

    @l0
    @k
    l<SimpleTestGroupWithNone> O0();

    @k
    hJ.e S();

    @k
    PhotoPickerIntentFactory X();

    @k
    i Y();

    @k
    LlmDescriptionPresenter Y0();

    @k
    InterfaceC28373a a();

    @k
    R0 c();

    @k
    @k0
    l<SimpleTestGroupWithNone> c1();

    @k
    InterfaceC35745a5 d();

    @k
    com.avito.android.util.text.a e();

    @k
    InterfaceC35845m2 h();

    @k
    C j();

    @k
    Application k();

    @k
    Locale locale();

    @k
    InterfaceC35741a1 n();

    @k
    g p0();

    @k
    G w();

    @k
    h y();

    @k
    Q1 z0();
}
