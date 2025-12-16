package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.util.InterfaceC35741a1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListReducer.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/m1;", "Lcom/avito/android/arch/mvi/u;", "LHY/d;", "LHY/h;", "Lcom/avito/android/messenger/channels/mvi/list_feature/b1;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m1 implements com.avito.android.arch.mvi.u<HY.d, HY.h>, b1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f188131b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.analytics.d f188132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f188133d;

    @Inject
    public m1(@Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.avito.android.messenger.channels.analytics.d dVar, @Y61.k b1 b1Var) {
        this.f188131b = interfaceC35741a1;
        this.f188132c = dVar;
        this.f188133d = b1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e(java.util.List r3) {
        /*
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            com.avito.android.messenger.channels.adapter.ChannelsListItem r1 = (com.avito.android.messenger.channels.adapter.ChannelsListItem) r1
            boolean r2 = r1 instanceof com.avito.android.messenger.channels.adapter.ChannelsListItem.b
            if (r2 == 0) goto L24
            com.avito.android.messenger.channels.adapter.ChannelsListItem$b r1 = (com.avito.android.messenger.channels.adapter.ChannelsListItem.b) r1
            boolean r2 = r1.f186788A
            if (r2 == 0) goto L24
            java.lang.String r1 = r1.f186789d
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto Lb
            r0.add(r1)
            goto Lb
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.m1.e(java.util.List):java.util.ArrayList");
    }

    public static boolean f(ChannelsListItem channelsListItem) {
        if (channelsListItem instanceof ChannelsListItem.d ? true : channelsListItem instanceof ChannelsListItem.a ? true : channelsListItem instanceof ChannelsListItem.e ? true : channelsListItem instanceof ChannelsListItem.NotificationsSettingsBanner) {
            return true;
        }
        if (channelsListItem instanceof ChannelsListItem.b ? true : kotlin.jvm.internal.L.f(channelsListItem, ChannelsListItem.f.f186824d) ? true : channelsListItem instanceof ChannelsListItem.g) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final HY.h a(HY.d r22, HY.h r23) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.m1.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // com.avito.android.messenger.channels.mvi.list_feature.b1
    @Y61.k
    public final List<ChannelsListItem.b> b(@Y61.k List<kotlin.Q<Channel, com.avito.android.persistence.messenger.P0>> list, @Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Set<String> set, @Y61.k Map<String, ? extends List<HY.b>> map) {
        return this.f188133d.b(list, messengerUserHashInfo, set, map);
    }

    @Override // com.avito.android.messenger.channels.mvi.list_feature.b1
    @Y61.k
    public final List c(@Y61.k String str, @Y61.k List list) {
        return this.f188133d.c(str, list);
    }

    @Override // com.avito.android.messenger.channels.mvi.list_feature.b1
    @Y61.k
    public final List<ChannelsListItem.b> d(@Y61.k List<kotlin.Q<Channel, com.avito.android.persistence.messenger.P0>> list, @Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Set<String> set, @Y61.k Map<String, ? extends List<HY.b>> map) {
        return this.f188133d.d(list, messengerUserHashInfo, set, map);
    }
}
