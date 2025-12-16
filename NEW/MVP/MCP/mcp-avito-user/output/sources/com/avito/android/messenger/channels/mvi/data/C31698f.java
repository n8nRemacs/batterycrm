package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32021j;
import com.avito.android.persistence.messenger.C33091m0;
import com.avito.android.persistence.messenger.ChannelIsReadStatus;
import com.avito.android.persistence.messenger.O1;
import com.avito.android.persistence.messenger.c3;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.ChannelDisplayInfo;
import com.avito.android.remote.model.messenger.InputState;
import com.avito.android.remote.model.messenger.ReadOnlyState;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: ChannelEntityConverter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/f;", "Lcom/avito/android/messenger/channels/mvi/data/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.data.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31698f implements InterfaceC31697e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32021j f187216a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f187217b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31693a f187218c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31706n f187219d;

    @Inject
    public C31698f(@Y61.k InterfaceC32021j interfaceC32021j, @Y61.k c0 c0Var, @Y61.k InterfaceC31693a interfaceC31693a, @Y61.k InterfaceC31706n interfaceC31706n) {
        this.f187216a = interfaceC32021j;
        this.f187217b = c0Var;
        this.f187218c = interfaceC31693a;
        this.f187219d = interfaceC31706n;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31697e
    @Y61.k
    public final Channel a(@Y61.k com.avito.android.persistence.messenger.Y y12, @Y61.k List<c3> list, @Y61.k Collection<C33091m0> collection, @Y61.l O1 o12) {
        TreeSet treeSetM = b1.m(new String[0]);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            treeSetM.add(((C33091m0) it.next()).f215516c);
        }
        LocalMessage localMessageB = o12 != null ? this.f187216a.b(o12) : null;
        List<c3> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.f187217b.b((c3) it2.next()));
        }
        ChannelContext channelContextA = this.f187218c.a(y12.f215356f, y12.f215357g);
        InterfaceC31706n interfaceC31706n = this.f187219d;
        String str = y12.f215358h;
        ReadOnlyState readOnlyState = str != null ? (ReadOnlyState) interfaceC31706n.a(ReadOnlyState.class, str) : null;
        String str2 = y12.f215364n;
        W81.a aVar = str2 != null ? (W81.a) interfaceC31706n.a(W81.a.class, str2) : null;
        PlatformActions platformActions = aVar instanceof PlatformActions ? (PlatformActions) aVar : null;
        ChannelDisplayInfo channelDisplayInfo = (ChannelDisplayInfo) interfaceC31706n.a(ChannelDisplayInfo.class, y12.f215369s);
        String str3 = y12.f215370t;
        return new Channel(y12.f215352b, y12.f215353c, localMessageB, arrayList, y12.f215354d, y12.f215355e, channelContextA, readOnlyState, y12.f215359i, y12.f215360j, y12.f215362l, y12.f215363m, treeSetM, platformActions, y12.f215365o, y12.f215366p, channelDisplayInfo, str3 != null ? (InputState) interfaceC31706n.a(InputState.class, str3) : null, y12.f215371u);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31697e
    @Y61.k
    public final C31696d b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Channel channel) {
        String str;
        Object next;
        List<User> users = channel.getUsers();
        ArrayList arrayList = new ArrayList(C42745f0.q(users, 10));
        Iterator<T> it = users.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f187217b.a(messengerUserHashInfo, channel.getChannelId(), (User) it.next()));
        }
        LocalMessage lastMessage = channel.getLastMessage();
        O1 o1A = lastMessage != null ? this.f187216a.a(lastMessage) : null;
        String channelId = channel.getChannelId();
        String type = channel.getType();
        long created = channel.getCreated();
        long updated = channel.getUpdated();
        ChannelContext context = channel.getContext();
        InterfaceC31693a interfaceC31693a = this.f187218c;
        String strC = interfaceC31693a.c(context);
        String strB = interfaceC31693a.b(channel.getContext());
        ReadOnlyState readOnlyState = channel.getReadOnlyState();
        InterfaceC31706n interfaceC31706n = this.f187219d;
        String strB2 = readOnlyState != null ? interfaceC31706n.b(ReadOnlyState.class, readOnlyState) : null;
        boolean zIsDeleted = channel.isDeleted();
        boolean zIsRead = channel.isRead();
        ChannelIsReadStatus channelIsReadStatus = channel.isRead() ? ChannelIsReadStatus.IS_READ : ChannelIsReadStatus.IS_NOT_READ;
        boolean zIsSpam = channel.isSpam();
        boolean zIsAnswered = channel.isAnswered();
        PlatformActions contextActions = channel.getContextActions();
        String strB3 = contextActions != null ? interfaceC31706n.b(W81.a.class, contextActions) : null;
        String flow = channel.getFlow();
        String suspectMessageId = channel.getSuspectMessageId();
        ChannelContext context2 = channel.getContext();
        ChannelContext.Item item = context2 instanceof ChannelContext.Item ? (ChannelContext.Item) context2 : null;
        String id2 = item != null ? item.getId() : null;
        Iterator it2 = channel.getUsers().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            str = messengerUserHashInfo.f430682d;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it2.next();
            Iterator it3 = it2;
            if (!kotlin.jvm.internal.L.f(((User) next).getId(), str)) {
                break;
            }
            it2 = it3;
        }
        User user = (User) next;
        String id3 = user != null ? user.getId() : null;
        String strB4 = interfaceC31706n.b(ChannelDisplayInfo.class, channel.getDisplayInfo());
        InputState inputState = channel.getInputState();
        String strB5 = inputState != null ? interfaceC31706n.b(InputState.class, inputState) : null;
        Long pinOrder = channel.getPinOrder();
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        com.avito.android.persistence.messenger.Y y12 = new com.avito.android.persistence.messenger.Y(messengerUserHashInfo.f430682d, channelId, type, created, updated, strC, strB, strB2, zIsDeleted, zIsRead, channelIsReadStatus, zIsSpam, zIsAnswered, strB3, flow, suspectMessageId, id2, id3, strB4, strB5, pinOrder, com.avito.android.messenger.util.i.g(messengerUserType));
        SortedSet<String> tags = channel.getTags();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(tags, 10));
        Iterator<T> it4 = tags.iterator();
        while (it4.hasNext()) {
            arrayList2.add(new C33091m0(com.avito.android.messenger.util.i.g(messengerUserType), str, channel.getChannelId(), (String) it4.next()));
        }
        return new C31696d(y12, arrayList, arrayList2, o1A);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31697e
    @Y61.k
    public final O c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Collection<Channel> collection) {
        LinkedHashSet linkedHashSet;
        String str;
        Object next;
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Channel channel = (Channel) it.next();
            String channelId = channel.getChannelId();
            String type = channel.getType();
            long created = channel.getCreated();
            long updated = channel.getUpdated();
            ChannelContext context = channel.getContext();
            InterfaceC31693a interfaceC31693a = this.f187218c;
            String strC = interfaceC31693a.c(context);
            String strB = interfaceC31693a.b(channel.getContext());
            ReadOnlyState readOnlyState = channel.getReadOnlyState();
            InterfaceC31706n interfaceC31706n = this.f187219d;
            Iterator it2 = it;
            String strB2 = readOnlyState != null ? interfaceC31706n.b(ReadOnlyState.class, readOnlyState) : null;
            boolean zIsDeleted = channel.isDeleted();
            boolean zIsRead = channel.isRead();
            ChannelIsReadStatus channelIsReadStatus = channel.isRead() ? ChannelIsReadStatus.IS_READ : ChannelIsReadStatus.IS_NOT_READ;
            boolean zIsSpam = channel.isSpam();
            boolean zIsAnswered = channel.isAnswered();
            PlatformActions contextActions = channel.getContextActions();
            ArrayList arrayList3 = arrayList2;
            String strB3 = contextActions != null ? interfaceC31706n.b(W81.a.class, contextActions) : null;
            String flow = channel.getFlow();
            String suspectMessageId = channel.getSuspectMessageId();
            ChannelContext context2 = channel.getContext();
            ChannelContext.Item item = context2 instanceof ChannelContext.Item ? (ChannelContext.Item) context2 : null;
            String id2 = item != null ? item.getId() : null;
            Iterator it3 = channel.getUsers().iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                linkedHashSet = linkedHashSet3;
                str = messengerUserHashInfo.f430682d;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it3.next();
                Iterator it4 = it3;
                if (!kotlin.jvm.internal.L.f(((User) next).getId(), str)) {
                    break;
                }
                it3 = it4;
                linkedHashSet3 = linkedHashSet;
            }
            User user = (User) next;
            String id3 = user != null ? user.getId() : null;
            String strB4 = interfaceC31706n.b(ChannelDisplayInfo.class, channel.getDisplayInfo());
            InputState inputState = channel.getInputState();
            String strB5 = inputState != null ? interfaceC31706n.b(InputState.class, inputState) : null;
            Long pinOrder = channel.getPinOrder();
            MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
            arrayList.add(new com.avito.android.persistence.messenger.Y(messengerUserHashInfo.f430682d, channelId, type, created, updated, strC, strB, strB2, zIsDeleted, zIsRead, channelIsReadStatus, zIsSpam, zIsAnswered, strB3, flow, suspectMessageId, id2, id3, strB4, strB5, pinOrder, com.avito.android.messenger.util.i.g(messengerUserType)));
            Iterator<T> it5 = channel.getUsers().iterator();
            while (it5.hasNext()) {
                linkedHashSet2.add(this.f187217b.a(messengerUserHashInfo, channel.getChannelId(), (User) it5.next()));
            }
            Iterator<T> it6 = channel.getTags().iterator();
            while (it6.hasNext()) {
                linkedHashSet.add(new C33091m0(com.avito.android.messenger.util.i.g(messengerUserType), str, channel.getChannelId(), (String) it6.next()));
            }
            LocalMessage lastMessage = channel.getLastMessage();
            if (lastMessage != null) {
                arrayList2 = arrayList3;
                arrayList2.add(this.f187216a.a(lastMessage));
            } else {
                arrayList2 = arrayList3;
            }
            linkedHashSet3 = linkedHashSet;
            it = it2;
        }
        return new O(arrayList, linkedHashSet2, linkedHashSet3, arrayList2);
    }
}
