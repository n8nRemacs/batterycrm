package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.analytics.statsd.y;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import java.util.Arrays;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.ChannelsResponse;

/* compiled from: ChannelSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "Lru/avito/messenger/api/entity/ChannelsResponse;", "", "it", "apply", "(Lkotlin/Q;)Lru/avito/messenger/api/entity/ChannelsResponse;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31853p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31829d f188525b;

    public C31853p(C31829d c31829d) {
        this.f188525b = c31829d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        long jLongValue = ((Number) q12.f406620c).longValue();
        C31829d c31829d = this.f188525b;
        MessengerStatsdEventFactory messengerStatsdEventFactory = c31829d.f188437i;
        messengerStatsdEventFactory.getClass();
        c31829d.f188438j.c(new y.c(messengerStatsdEventFactory.e((String[]) Arrays.copyOf(new String[]{"performance", "channels", "request", "get_chats_v5", "app_version_placeholder", "network_type_placeholder"}, 6), false), Long.valueOf(jLongValue), null));
        return (ChannelsResponse) q12.f406619b;
    }
}
