package com.avito.android.webview.di;

import Lq.C14429a;
import Mu.InterfaceC14529b;
import Y61.k;
import android.app.Application;
import com.avito.android.H0;
import com.avito.android.Y2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.P;
import com.avito.android.remote.interceptor.InterfaceC34281f0;
import com.avito.android.remote.interceptor.Q0;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import om0.C44821a;

/* compiled from: WebViewDependencies.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/webview/di/c;", "Lcom/avito/android/di/h;", "Lcom/avito/android/remote/interceptor/f0;", "Lcom/avito/android/di/P;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c extends InterfaceC29971h, InterfaceC34281f0, P {
    @k
    Y2 Di();

    @k
    com.avito.android.P E();

    @k
    H0 M();

    @k
    InterfaceC14529b T8();

    @k
    com.avito.android.connection_quality.connectivity.a U();

    @k
    C14429a Yk();

    @k
    InterfaceC28373a a();

    @k
    InterfaceC35745a5 d();

    @k
    Q0 d1();

    @k
    C j();

    @k
    com.avito.android.deeplink_handler.mapping.checker.c j6();

    @k
    Application k();

    @k
    com.avito.android.server_time.f l();

    @k
    C44821a n0();

    @k
    x t();
}
