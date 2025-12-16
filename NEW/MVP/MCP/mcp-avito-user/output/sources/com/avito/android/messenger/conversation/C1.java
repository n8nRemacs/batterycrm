package com.avito.android.messenger.conversation;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.MarkChannelUnreadLink;
import com.avito.android.messenger.analytics.MessengerMarkChatAsUnreadEvent;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class C1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f188881b;

    public C1(ChannelFragment channelFragment) {
        this.f188881b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        if (((C43501a) obj).f413261b instanceof MarkChannelUnreadLink.b.c) {
            ChannelFragment channelFragment = this.f188881b;
            InterfaceC28373a interfaceC28373a = channelFragment.f189006t0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            String str = channelFragment.f188965W2;
            interfaceC28373a.c(new MessengerMarkChatAsUnreadEvent(str != null ? str : null, MessengerMarkChatAsUnreadEvent.Screen.f186230c));
            Y1 y12 = channelFragment.f188978c3;
            if (y12 != null) {
                y12.p(5);
            }
        }
    }
}
