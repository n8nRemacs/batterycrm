package com.avito.android.messenger.channels.mvi.di;

import Zd.InterfaceC19542a;
import android.content.Context;
import android.content.SharedPreferences;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.InterfaceC28580o;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.analytics.InterfaceC31662s;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import com.avito.android.messenger.channels.mvi.data.C31694b;
import com.avito.android.messenger.channels.mvi.data.C31707o;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.channels.mvi.sync.G0;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31857r0;
import com.avito.android.messenger.channels.mvi.sync.z0;
import com.avito.android.messenger.conversation.mvi.data.C32020i;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.messenger.w0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import iP.InterfaceC41329a;
import java.util.Locale;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.internal.connection.InterfaceC47748a;
import ur.C49102c;
import y30.C50051e;

/* compiled from: ChannelsDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/di/j;", "Lcom/avito/android/di/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.di.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC31742j extends InterfaceC29971h {
    @Y61.k
    com.avito.android.service.short_task.j A2();

    @Y61.k
    C30277e1 C();

    @Y61.k
    z0 C2();

    @Y61.k
    com.avito.android.messenger.channels.action_banner.g Ci();

    @Y61.k
    G0 Dm();

    @Y61.k
    InterfaceC41196a E0();

    @Y61.k
    com.avito.android.messenger.blacklist_reasons.y F2();

    @Y61.k
    C49102c G();

    @Y61.k
    InterfaceC28580o Gf();

    @Y61.k
    InterfaceC32208e I7();

    @Y61.k
    com.avito.android.analytics.statsd.F N0();

    @Y61.k
    com.avito.android.messenger.channels.filter.j Nl();

    @Y61.k
    C31707o P3();

    @Y61.k
    u3.g<MessengerFolderTabsTestGroup> P6();

    @Y61.k
    SharedPreferences R1();

    @Y61.k
    com.avito.android.messenger.service.user_last_activity.a R6();

    @Y61.k
    com.avito.android.server_time.a T();

    @Y61.k
    InterfaceC31662s Uj();

    @Y61.k
    MessengerDatabase W0();

    @Y61.k
    WY.a Wh();

    @Y61.k
    JY.a Z6();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    R0 c();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    InterfaceC47842z d0();

    @Y61.k
    com.avito.android.messenger.channels.analytics.b dl();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    Context g();

    @Y61.k
    ChannelSyncAgent gj();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    com.avito.android.messenger.G j1();

    @Y61.k
    w0 k0();

    @Y61.k
    com.avito.android.server_time.f l();

    @Y61.k
    Locale locale();

    @Y61.k
    InterfaceC35741a1 n();

    @Y61.k
    C50051e o2();

    @Y61.k
    C32020i p1();

    @Y61.k
    InterfaceC31857r0 q7();

    @Y61.k
    InterfaceC47748a qa();

    @Y61.k
    InterfaceC41329a r2();

    @Y61.k
    GY.c rc();

    @Y61.k
    com.avito.android.messenger.channels.action_banner.a tl();

    @Y61.k
    InterfaceC19542a x();

    @Y61.k
    InterfaceC32572u x0();

    @Y61.k
    C31694b x3();

    @Y61.k
    MessengerStatsdEventFactory yj();
}
