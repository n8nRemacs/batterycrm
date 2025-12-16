package com.avito.android.iac_dialer_finished.impl_module.messenger_link;

import Ju.AbstractC14250d;
import Y41.l;
import com.avito.android.deep_linking.links.ChannelDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer_finished.public_module.messenger_link.OpenChannelIfExistLink;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelUser;
import ru.avito.messenger.api.entity.ChannelsResponse;

/* compiled from: OpenChannelIfExistLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lru/avito/messenger/api/entity/ChannelsResponse;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements l<Q<? extends ChannelsResponse, ? extends Long>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f166513l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OpenChannelIfExistLink f166514m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, OpenChannelIfExistLink openChannelIfExistLink) {
        super(1);
        this.f166513l = bVar;
        this.f166514m = openChannelIfExistLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Q<? extends ChannelsResponse, ? extends Long> q12) {
        OpenChannelIfExistLink openChannelIfExistLink;
        Object next;
        Iterator<T> it = ((ChannelsResponse) q12.f406619b).getChannels().iterator();
        loop0: while (true) {
            boolean zHasNext = it.hasNext();
            openChannelIfExistLink = this.f166514m;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            List<ChannelUser> users = ((Channel) next).getUsers();
            if (!(users instanceof Collection) || !users.isEmpty()) {
                Iterator<T> it2 = users.iterator();
                while (it2.hasNext()) {
                    if (L.f(((ChannelUser) it2.next()).getId(), openChannelIfExistLink.getUserId())) {
                        break loop0;
                    }
                }
            }
        }
        Channel channel = (Channel) next;
        b bVar = this.f166513l;
        com.avito.android.deeplink_handler.handler.composite.a aVar = bVar.f166516g;
        if (channel == null || channel.getReadOnlyState() != null) {
            DeepLink onChannelNotFoundLink = openChannelIfExistLink.getOnChannelNotFoundLink();
            if (onChannelNotFoundLink != null) {
                bVar.i(OpenChannelIfExistLink.b.f166822b, aVar, onChannelNotFoundLink);
            } else {
                bVar.j(AbstractC14250d.b.f9170c);
            }
        } else {
            bVar.i(OpenChannelIfExistLink.b.f166822b, aVar, new ChannelDetailsLink(channel.getChannelId(), null, 2, null));
        }
        return G0.f406611a;
    }
}
