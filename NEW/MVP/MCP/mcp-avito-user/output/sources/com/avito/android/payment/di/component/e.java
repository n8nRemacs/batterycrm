package com.avito.android.payment.di.component;

import Y61.k;
import com.avito.android.C36163x1;
import com.avito.android.H0;
import com.avito.android.Q1;
import com.avito.android.T2;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.deep_linking.x;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.P;
import com.avito.android.remote.interceptor.InterfaceC34281f0;
import com.avito.android.remote.interceptor.Q0;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import java.util.Locale;
import kotlin.Metadata;
import om0.C44821a;
import t3.l0;
import u3.l;
import u60.InterfaceC48808a;

/* compiled from: PaymentDependencies.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/di/component/e;", "Lcom/avito/android/di/h;", "Lcom/avito/android/remote/interceptor/f0;", "Lcom/avito/android/di/P;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e extends InterfaceC29971h, InterfaceC34281f0, P {
    @k
    C36163x1 G1();

    @k
    H0 M();

    @l0
    @k
    l<SimpleTestGroupWithNone> O0();

    @k
    hJ.e S();

    @k
    hJ.i Y();

    @k
    T2 Y9();

    @k
    InterfaceC28373a a();

    @k
    com.avito.android.deeplink_events.registry.d a6();

    @k
    InterfaceC28481c b();

    @k
    InterfaceC35745a5 d();

    @k
    Q0 d1();

    @k
    com.avito.android.util.text.a e();

    @k
    InterfaceC48808a f5();

    @k
    Locale hl();

    @k
    E i();

    @k
    R0 i0();

    @k
    C j();

    @k
    com.avito.android.server_time.f l();

    @k
    com.avito.android.wallet.page.d l3();

    @k
    C44821a n0();

    @k
    hJ.g p0();

    @k
    x q();

    @k
    Gson s();

    @k
    com.avito.android.server_time.h y();

    @k
    Q1 z0();
}
