package com.avito.android.messenger.conversation.mvi.menu;

import com.avito.android.deep_linking.links.ChannelCallLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PinChannelLink;
import com.avito.android.deep_linking.links.UnpinChannelLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.messenger.conversation.mvi.send.Onboarding;
import com.avito.android.messenger.deeplink.ChannelIacCallLink;
import com.avito.android.remote.model.messenger.context.ChannelMenuAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelMenuPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class q extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChannelMenuAction f191493l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f191494m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, ChannelMenuAction channelMenuAction) {
        super(0);
        this.f191493l = channelMenuAction;
        this.f191494m = mVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ChannelMenuAction channelMenuAction = this.f191493l;
        boolean z12 = channelMenuAction.getDeepLink() instanceof ChannelCallLink;
        m mVar = this.f191494m;
        if (z12) {
            mVar.f191459V.Q8();
        }
        DeepLink deepLink = channelMenuAction.getDeepLink();
        if (deepLink instanceof PinChannelLink ? true : deepLink instanceof UnpinChannelLink) {
            mVar.f191461X.D4(Onboarding.f194326e);
            b.a.a(mVar.f191465b0, deepLink, null, null, 6);
        } else if (deepLink instanceof ChannelIacCallLink) {
            mVar.f191460W.z3((ChannelIacCallLink) deepLink);
        } else {
            b.a.a(mVar.f191465b0, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
