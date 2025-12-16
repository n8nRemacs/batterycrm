package com.avito.android.notification_center.list.di;

import Ek0.InterfaceC13498a;
import Y61.k;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.deep_linking.x;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.remote.notification.InterfaceC34350q;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.webview.m;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: NotificationCenterListDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/di/c;", "Lcom/avito/android/di/h;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c extends InterfaceC29971h {
    @k
    InterfaceC34350q E3();

    @k
    com.avito.android.notification_center.counter.h G7();

    @k
    com.avito.android.notification_center.counter.b Kb();

    @k
    m M0();

    @k
    PreloadingPromiseTestGroup Y1();

    @k
    InterfaceC28373a a();

    @k
    com.avito.android.notification_center.push.b db();

    @k
    InterfaceC28481c f();

    @k
    InterfaceC13498a f6();

    @k
    C j();

    @k
    Locale locale();

    @k
    InterfaceC35741a1 n();

    @k
    x t();
}
