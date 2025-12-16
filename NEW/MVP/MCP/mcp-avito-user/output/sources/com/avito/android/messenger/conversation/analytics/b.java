package com.avito.android.messenger.conversation.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.memory.consumption.f;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import com.avito.android.messenger.conversation.ChannelFragment;
import kotlin.Metadata;

/* compiled from: ChannelTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/analytics/b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: ChannelTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void a(long j12);

    void b(@l Long l12, @k MessengerStatsdEventFactory.Companion.ChannelType channelType);

    void c();

    void d();

    void e();

    void f(int i12);

    void g(@l Throwable th2);

    void h();

    void i();

    void j();

    void k(@k Throwable th2);

    void l();

    void m();

    void n();

    void o();

    void p(@k com.avito.android.analytics.screens.tracker.fps.h hVar);

    void q();

    void r();

    void s();

    void t();

    void u();

    void v(@k f.a aVar, @k ChannelFragment channelFragment);

    void w();
}
