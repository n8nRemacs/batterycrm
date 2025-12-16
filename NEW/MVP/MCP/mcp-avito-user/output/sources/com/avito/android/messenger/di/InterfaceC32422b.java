package com.avito.android.messenger.di;

import android.app.Application;
import android.content.Context;
import com.avito.android.B2;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyer2TestGroup;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup;
import com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup;
import com.avito.android.ab_tests.configs.MessengerQuickRepliesWithTitleTestGroup;
import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.InterfaceC32575x;
import com.avito.android.messenger.channels.mvi.data.C31694b;
import com.avito.android.messenger.channels.mvi.data.C31707o;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker;
import com.avito.android.messenger.conversation.adapter.C31915a;
import com.avito.android.messenger.conversation.mvi.data.C32020i;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.messenger.conversation.mvi.sync.InterfaceC32291u0;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35863o4;
import java.util.Locale;
import kotlin.Metadata;
import lD.C43617a;
import ru.avito.messenger.InterfaceC47842z;
import t3.InterfaceC48483n;
import ur.C49102c;
import vN.C49237a;
import y30.C50051e;
import zn0.C50595b;

/* compiled from: ChannelActivityDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/di/b;", "Lcom/avito/android/di/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.di.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32422b extends InterfaceC29971h {
    @Y61.k
    com.avito.android.notification.m A0();

    @Y61.k
    com.avito.android.service.short_task.j A2();

    @Y61.k
    X0 B0();

    @Y61.k
    InterfaceC32200a B5();

    @Y61.k
    C30277e1 C();

    @Y61.k
    C43617a C0();

    @Y61.k
    com.avito.android.messenger.channels.mvi.sync.z0 C2();

    @Y61.k
    com.avito.android.messenger.notification.e Cg();

    @Y61.k
    C31915a Cl();

    @Y61.k
    B2 D();

    @Y61.k
    C50595b Dk();

    @Y61.k
    com.avito.android.photo_cache.b F();

    @Y61.k
    com.avito.android.photo_gallery.F F0();

    @Y61.k
    com.avito.android.messenger.blacklist_reasons.y F2();

    @Y61.k
    C49102c G();

    @Y61.k
    com.avito.android.messenger.conversation.mvi.sync.K Gj();

    @Y61.k
    com.avito.android.I1 H();

    @Y61.k
    com.avito.android.multi_message_send.domain.h Hf();

    @Y61.k
    InterfaceC32208e I7();

    @Y61.k
    u3.g<AssistantUxImprovementsSellerTestGroup> Ii();

    @Y61.k
    com.avito.android.messenger.conversation.mvi.multi_message.a Jj();

    @Y61.k
    com.avito.android.messenger.B L1();

    @Y61.k
    ChannelSyncAgent L6();

    @Y61.k
    com.avito.android.multi_message_send.domain.o Ld();

    @Y61.k
    com.avito.android.webview.m M0();

    @Y61.k
    com.avito.android.permissions.G N();

    @Y61.k
    com.avito.android.analytics.statsd.F N0();

    @Y61.k
    @InterfaceC48483n
    u3.g<SimpleTestGroupWithNone> O7();

    @Y61.k
    C31707o P3();

    @Y61.k
    u3.g<MessengerFolderTabsTestGroup> P6();

    @Y61.k
    com.avito.android.feedback_adverts.d Pd();

    @Y61.k
    MessengerSuccessRateTracker Q7();

    @Y61.k
    com.avito.android.messenger.service.user_last_activity.a R6();

    @Y61.k
    com.avito.android.server_time.a T();

    @Y61.k
    com.avito.android.connection_quality.connectivity.a U();

    @Y61.k
    com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f Uk();

    @Y61.k
    com.avito.android.permissions.u V();

    @Y61.k
    MessengerDatabase W0();

    @Y61.k
    com.avito.android.U0 X0();

    @Y61.k
    com.avito.android.messenger.conversation.mvi.multi_message.u Yi();

    @Y61.k
    JY.a Z6();

    @Y61.k
    u3.g<AssistantUxImprovementsBuyer2TestGroup> Zk();

    @Y61.k
    XL.a Zl();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    com.avito.android.messenger.conversation.mvi.file_attachment.n a2();

    @Y61.k
    com.avito.android.util.R0 c();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    InterfaceC47842z d0();

    @Y61.k
    LL.b df();

    @Y61.k
    com.avito.android.messenger.conversation.mvi.common.a ee();

    @Y61.k
    Context g();

    @x20.d
    @Y61.k
    u3.l<MultiMessageSendTestGroup> gi();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    C49237a h1();

    @Y61.k
    com.avito.android.account.E i();

    @Y61.k
    com.avito.android.messenger.channels.mvi.sync.E0 im();

    @Y61.k
    com.avito.android.util.C j();

    @Y61.k
    com.avito.android.messenger.G j1();

    @Y61.k
    com.avito.android.messenger.q0 jm();

    @Y61.k
    Application k();

    @Y61.k
    com.avito.android.messenger.w0 k0();

    @Y61.k
    Y81.c kb();

    @Y61.k
    com.avito.android.server_time.f l();

    @Y61.k
    Locale locale();

    @Y61.k
    InterfaceC35863o4 m();

    @Y61.k
    com.avito.android.messenger.blacklist_reasons.m m7();

    @Y61.k
    com.avito.android.multi_message_send.domain.b me();

    @Y61.k
    InterfaceC35741a1 n();

    @Y61.k
    C50051e o2();

    @Y61.k
    SK0.b p();

    @Y61.k
    C32020i p1();

    @Y61.k
    u3.g<MessengerQuickRepliesWithTitleTestGroup> pb();

    @Y61.k
    u3.g<AssistantUxImprovementsBuyerTestGroup> pi();

    @Y61.k
    u3.l<MessengerEmptyBuyerChatKeyboardTestGroup> qi();

    @Y61.k
    com.avito.android.messenger.conversation.adapter.C sg();

    @Y61.k
    com.avito.android.deep_linking.x t();

    @Y61.k
    WY.a th();

    @Y61.k
    InterfaceC32291u0 tk();

    @Y61.k
    InterfaceC32572u x0();

    @Y61.k
    C31694b x3();

    @Y61.k
    InterfaceC32575x xm();
}
