package com.avito.android.ab_tests;

import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyer2TestGroup;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoCreateItemChannelTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoGetChannelByIdTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoGetUsersTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoHistoryTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoReadChatsTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoSendTextMessageTestGroup;
import com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup;
import com.avito.android.ab_tests.configs.MessengerQuickRepliesWithTitleTestGroup;
import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import kotlin.Metadata;

/* compiled from: MessengerAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/H;", "", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface H {
    @Y61.k
    u3.g<AssistantUxImprovementsSellerTestGroup> a();

    @Y61.k
    u3.g<MessengerApicoCreateItemChannelTestGroup> b();

    @Y61.k
    u3.g<MessengerApicoGetChannelsTestGroup> c();

    @Y61.k
    u3.g<MessengerFolderTabsTestGroup> d();

    @Y61.k
    u3.l<MessengerEmptyBuyerChatKeyboardTestGroup> e();

    @Y61.k
    u3.g<AssistantUxImprovementsBuyer2TestGroup> f();

    @Y61.k
    u3.g<MessengerApicoSendTextMessageTestGroup> g();

    @Y61.k
    u3.g<MessengerApicoGetChannelByIdTestGroup> h();

    @Y61.k
    u3.g<MessengerApicoHistoryTestGroup> i();

    @Y61.k
    u3.g<MessengerApicoGetUsersTestGroup> j();

    @Y61.k
    u3.g<MessengerApicoReadChatsTestGroup> k();

    @Y61.k
    u3.g<AssistantUxImprovementsBuyerTestGroup> l();

    @Y61.k
    u3.g<MessengerQuickRepliesWithTitleTestGroup> m();
}
