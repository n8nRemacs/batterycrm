package com.avito.android.ab_tests;

import com.avito.android.C30277e1;
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
import javax.inject.Inject;
import kotlin.Metadata;
import s3.C47965A;
import s3.C47968c;
import s3.C47969d;
import s3.C47970e;
import s3.C47988x;
import s3.C47989y;

/* compiled from: MessengerAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/I;", "Lcom/avito/android/ab_tests/H;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f67713a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f67714b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f67715c;

    @Inject
    public I(@Y61.k C30277e1 c30277e1, @Y61.k c0 c0Var, @Y61.k InterfaceC27642e interfaceC27642e) {
        this.f67713a = c30277e1;
        this.f67714b = c0Var;
        this.f67715c = interfaceC27642e;
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<AssistantUxImprovementsSellerTestGroup> a() {
        return new u3.g<>(this.f67715c.c(new C47970e(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<MessengerApicoCreateItemChannelTestGroup> b() {
        return new u3.g<>(this.f67715c.c(new C47988x(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<MessengerApicoGetChannelsTestGroup> c() {
        return new u3.g<>(this.f67715c.c(new s3.z(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<MessengerFolderTabsTestGroup> d() {
        return new u3.g<>(this.f67715c.c(new s3.F(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.l<MessengerEmptyBuyerChatKeyboardTestGroup> e() {
        return new u3.l<>(this.f67715c.c(new s3.E(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<AssistantUxImprovementsBuyer2TestGroup> f() {
        return new u3.g<>(this.f67715c.c(new C47968c(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<MessengerApicoSendTextMessageTestGroup> g() {
        return new u3.g<>(this.f67715c.c(new s3.D(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<MessengerApicoGetChannelByIdTestGroup> h() {
        return new u3.g<>(this.f67715c.c(new C47989y(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<MessengerApicoHistoryTestGroup> i() {
        return new u3.g<>(this.f67715c.c(new s3.B(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<MessengerApicoGetUsersTestGroup> j() {
        return new u3.g<>(this.f67715c.c(new C47965A(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<MessengerApicoReadChatsTestGroup> k() {
        return new u3.g<>(this.f67715c.c(new s3.C(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<AssistantUxImprovementsBuyerTestGroup> l() {
        return new u3.g<>(this.f67715c.c(new C47969d(this.f67713a)), this.f67714b);
    }

    @Override // com.avito.android.ab_tests.H
    @Y61.k
    public final u3.g<MessengerQuickRepliesWithTitleTestGroup> m() {
        return new u3.g<>(this.f67715c.c(new s3.G(this.f67713a)), this.f67714b);
    }
}
