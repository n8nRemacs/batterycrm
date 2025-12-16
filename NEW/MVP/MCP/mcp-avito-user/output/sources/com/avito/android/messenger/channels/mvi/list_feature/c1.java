package com.avito.android.messenger.channels.mvi.list_feature;

import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.deep_linking.links.MarkChannelUnreadLink;
import com.avito.android.deep_linking.links.PinChannelLink;
import com.avito.android.deep_linking.links.UnpinChannelLink;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.messenger.widget.chat_list_element.ChatListElement;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context.ChannelMenuAction;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.StatusCode;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelsListDataConverter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/c1;", "Lcom/avito/android/messenger/channels/mvi/list_feature/b1;", "Lcom/avito/android/messenger/channels/mvi/list_feature/t1;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c1 implements b1, t1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q1 f188007b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f188008c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.o f188009d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final t1 f188010e;

    /* renamed from: f, reason: collision with root package name */
    public final int f188011f;

    /* compiled from: ChannelsListDataConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188012a;

        static {
            int[] iArr = new int[StatusCode.values().length];
            try {
                iArr[StatusCode.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusCode.SENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusCode.READ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f188012a = iArr;
        }
    }

    @Inject
    public c1(@Y61.k Fragment fragment, @Y61.k q1 q1Var, @Y61.k com.avito.android.server_time.f fVar, @Y61.k com.avito.android.date_time_formatter.o oVar, @Y61.k t1 t1Var) {
        this.f188007b = q1Var;
        this.f188008c = fVar;
        this.f188009d = oVar;
        this.f188010e = t1Var;
        this.f188011f = C35835l0.d(R.attr.red600, fragment.requireContext());
    }

    public static final String e(c1 c1Var, Channel channel) {
        c1Var.getClass();
        return c1Var.f188009d.a(Long.valueOf(MessengerTimestamp.INSTANCE.toMillis(i(channel))));
    }

    public static final ChatListElement.LastMessageType f(c1 c1Var, boolean z12, Channel channel, LocalMessage localMessage) {
        c1Var.getClass();
        if (localMessage == null) {
            return ChatListElement.LastMessageType.f197473i;
        }
        StatusCode deliveryStatus = localMessage != null ? localMessage.getDeliveryStatus() : null;
        boolean zIsRead = localMessage != null ? localMessage.isRead() : channel.isRead();
        if (!z12) {
            return !zIsRead ? ChatListElement.LastMessageType.f197466b : ChatListElement.LastMessageType.f197467c;
        }
        int i12 = deliveryStatus == null ? -1 : a.f188012a[deliveryStatus.ordinal()];
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? ChatListElement.LastMessageType.f197470f : ChatListElement.LastMessageType.f197469e : ChatListElement.LastMessageType.f197468d : ChatListElement.LastMessageType.f197471g;
    }

    public static final boolean g(c1 c1Var, ChannelContext channelContext) {
        c1Var.getClass();
        List<ChannelMenuAction> menu = channelContext.getMenu();
        if ((menu instanceof Collection) && menu.isEmpty()) {
            return false;
        }
        Iterator<T> it = menu.iterator();
        while (it.hasNext()) {
            if (((ChannelMenuAction) it.next()).getDeepLink() instanceof MarkChannelUnreadLink) {
                return true;
            }
        }
        return false;
    }

    public static final boolean h(c1 c1Var, ChannelContext channelContext) {
        c1Var.getClass();
        List<ChannelMenuAction> menu = channelContext.getMenu();
        if ((menu instanceof Collection) && menu.isEmpty()) {
            return false;
        }
        for (ChannelMenuAction channelMenuAction : menu) {
            if ((channelMenuAction.getDeepLink() instanceof PinChannelLink) || (channelMenuAction.getDeepLink() instanceof UnpinChannelLink)) {
                return true;
            }
        }
        return false;
    }

    public static long i(Channel channel) {
        LocalMessage lastMessage = channel.getLastMessage();
        return lastMessage != null ? lastMessage.getCreated() : channel.getUpdated();
    }

    @Override // com.avito.android.messenger.channels.mvi.list_feature.t1
    @Y61.k
    public final List<DockingBadgeItem> a(@Y61.k List<HY.b> list) {
        return this.f188010e.a(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    @Override // com.avito.android.messenger.channels.mvi.list_feature.b1
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.messenger.channels.adapter.ChannelsListItem.b> b(@Y61.k java.util.List<kotlin.Q<com.avito.android.remote.model.messenger.Channel, com.avito.android.persistence.messenger.P0>> r41, @Y61.k ru.avito.messenger.MessengerUserHashInfo r42, @Y61.k java.util.Set<java.lang.String> r43, @Y61.k java.util.Map<java.lang.String, ? extends java.util.List<HY.b>> r44) {
        /*
            Method dump skipped, instructions count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.c1.b(java.util.List, ru.avito.messenger.MessengerUserHashInfo, java.util.Set, java.util.Map):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.messenger.channels.mvi.list_feature.b1
    @Y61.k
    public final List c(@Y61.k String str, @Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Channel channel = (Channel) ((kotlin.Q) it.next()).f406619b;
            ChannelContext context = channel.getContext();
            ChannelsListItem.g gVar = null;
            ChannelContext.System system = context instanceof ChannelContext.System ? (ChannelContext.System) context : null;
            if (system != null && channel.getTags().contains("s")) {
                gVar = new ChannelsListItem.g(channel.getChannelId(), channel.isRead(), channel.getDisplayInfo().getName(), system.getImage());
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    @Override // com.avito.android.messenger.channels.mvi.list_feature.b1
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.messenger.channels.adapter.ChannelsListItem.b> d(@Y61.k java.util.List<kotlin.Q<com.avito.android.remote.model.messenger.Channel, com.avito.android.persistence.messenger.P0>> r41, @Y61.k ru.avito.messenger.MessengerUserHashInfo r42, @Y61.k java.util.Set<java.lang.String> r43, @Y61.k java.util.Map<java.lang.String, ? extends java.util.List<HY.b>> r44) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.c1.d(java.util.List, ru.avito.messenger.MessengerUserHashInfo, java.util.Set, java.util.Map):java.util.List");
    }
}
