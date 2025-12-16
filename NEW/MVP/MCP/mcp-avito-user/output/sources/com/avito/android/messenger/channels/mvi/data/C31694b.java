package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextSerializer.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/b;", "Lcom/avito/android/messenger/channels/mvi/data/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.data.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31694b implements InterfaceC31693a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f187204a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f187205b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f187206c;

    public C31694b(@Y61.k Gson gson) {
        this.f187204a = gson;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f187205b = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f187206c = linkedHashMap2;
        if (linkedHashMap.containsKey("item") || linkedHashMap2.containsKey(ChannelContext.Item.class)) {
            throw new IllegalStateException("Type is already registered: type = item, clazz = ".concat(ChannelContext.Item.class.getName()));
        }
        linkedHashMap.put("item", ChannelContext.Item.class);
        linkedHashMap2.put(ChannelContext.Item.class, "item");
        if (linkedHashMap.containsKey(ChannelContext.UserToUser.TYPE) || linkedHashMap2.containsKey(ChannelContext.UserToUser.class)) {
            throw new IllegalStateException("Type is already registered: type = user, clazz = ".concat(ChannelContext.UserToUser.class.getName()));
        }
        linkedHashMap.put(ChannelContext.UserToUser.TYPE, ChannelContext.UserToUser.class);
        linkedHashMap2.put(ChannelContext.UserToUser.class, ChannelContext.UserToUser.TYPE);
        if (linkedHashMap.containsKey(ChannelContext.System.TYPE) || linkedHashMap2.containsKey(ChannelContext.System.class)) {
            throw new IllegalStateException("Type is already registered: type = system, clazz = ".concat(ChannelContext.System.class.getName()));
        }
        linkedHashMap.put(ChannelContext.System.TYPE, ChannelContext.System.class);
        linkedHashMap2.put(ChannelContext.System.class, ChannelContext.System.TYPE);
        if (linkedHashMap.containsKey(ChannelContext.ReDeal.TYPE) || linkedHashMap2.containsKey(ChannelContext.ReDeal.class)) {
            throw new IllegalStateException("Type is already registered: type = reDeal, clazz = ".concat(ChannelContext.ReDeal.class.getName()));
        }
        linkedHashMap.put(ChannelContext.ReDeal.TYPE, ChannelContext.ReDeal.class);
        linkedHashMap2.put(ChannelContext.ReDeal.class, ChannelContext.ReDeal.TYPE);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31693a
    @Y61.k
    public final ChannelContext a(@Y61.k String str, @Y61.k String str2) {
        ChannelContext channelContext;
        Class cls = (Class) this.f187205b.get(str);
        if (cls != null) {
            try {
                channelContext = (ChannelContext) this.f187204a.d(cls, str2);
            } catch (Exception unused) {
                V2.f318762a.c("ChannelContextSerializer", "Couldn't parse context " + cls.getSimpleName() + " from json: " + str2, null);
                channelContext = null;
            }
            if (channelContext != null) {
                return channelContext;
            }
        }
        return new ChannelContext.Unknown(str);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31693a
    @Y61.k
    public final String b(@Y61.k ChannelContext channelContext) {
        return this.f187204a.l(channelContext);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31693a
    @Y61.k
    public final String c(@Y61.k ChannelContext channelContext) {
        String type = (String) this.f187206c.get(channelContext.getClass());
        if (type == null) {
            ChannelContext.Unknown unknown = channelContext instanceof ChannelContext.Unknown ? (ChannelContext.Unknown) channelContext : null;
            type = unknown != null ? unknown.getType() : null;
            if (type == null) {
                throw new IllegalArgumentException("Unregistered context type, class = " + channelContext.getClass() + ", " + channelContext);
            }
        }
        return type;
    }
}
