package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessengerActionTimestampTracker.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/B0;", "Lcom/avito/android/messenger/channels/mvi/sync/z0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.V f188312a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MessengerStatsdEventFactory f188313b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f188314c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f188315d;

    @Inject
    public B0(@Y61.k ru.avito.messenger.V v12, @Y61.k MessengerStatsdEventFactory messengerStatsdEventFactory, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.server_time.f fVar) {
        this.f188312a = v12;
        this.f188313b = messengerStatsdEventFactory;
        this.f188314c = interfaceC28373a;
        this.f188315d = fVar;
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.T a(List list) {
        C42022u c42022uK = this.f188312a.state().S().k(new A0(list, this));
        l41.r<Object> rVar = io.reactivex.rxjava3.internal.functions.a.f401998h;
        Objects.requireNonNull(rVar, "predicate is null");
        return new io.reactivex.rxjava3.internal.operators.maybe.T(new io.reactivex.rxjava3.internal.operators.single.T(c42022uK, rVar));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.z0
    public final void b(@Y61.l Long l12, @Y61.k MessengerStatsdEventFactory.Companion.ChannelType channelType) {
        Iterator<T> it = this.f188313b.c(MessengerStatsdEventFactory.Companion.Scenario.f187066h, channelType, l12.longValue()).iterator();
        while (it.hasNext()) {
            this.f188314c.c((com.avito.android.analytics.statsd.y) it.next());
        }
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.z0
    @Y61.k
    public final AbstractC41768a c(@Y61.l Long l12, boolean z12) {
        if (l12 != null) {
            return a(this.f188313b.d(MessengerStatsdEventFactory.Companion.Screen.f187072d, z12 ? MessengerStatsdEventFactory.Companion.Scenario.f187063e : MessengerStatsdEventFactory.Companion.Scenario.f187061c, this.f188315d.now() - l12.longValue()));
        }
        return C41823n.f402260b;
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.z0
    @Y61.k
    public final AbstractC41768a d(@Y61.l Long l12) {
        if (l12 == null) {
            return C41823n.f402260b;
        }
        return a(this.f188313b.d(MessengerStatsdEventFactory.Companion.Screen.f187072d, MessengerStatsdEventFactory.Companion.Scenario.f187062d, this.f188315d.now() - l12.longValue()));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.z0
    public final void e(@Y61.l Long l12) {
        if (l12 != null) {
            Iterator<T> it = this.f188313b.d(MessengerStatsdEventFactory.Companion.Screen.f187071c, MessengerStatsdEventFactory.Companion.Scenario.f187065g, l12.longValue()).iterator();
            while (it.hasNext()) {
                this.f188314c.c((com.avito.android.analytics.statsd.y) it.next());
            }
        }
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.z0
    @Y61.k
    public final AbstractC41768a f(@Y61.l Long l12) {
        if (l12 == null) {
            return C41823n.f402260b;
        }
        return a(this.f188313b.d(MessengerStatsdEventFactory.Companion.Screen.f187072d, MessengerStatsdEventFactory.Companion.Scenario.f187064f, this.f188315d.now() - l12.longValue()));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.z0
    public final void g(@Y61.l Long l12) {
        if (l12 != null) {
            Iterator<T> it = this.f188313b.d(MessengerStatsdEventFactory.Companion.Screen.f187072d, MessengerStatsdEventFactory.Companion.Scenario.f187065g, l12.longValue()).iterator();
            while (it.hasNext()) {
                this.f188314c.c((com.avito.android.analytics.statsd.y) it.next());
            }
        }
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.z0
    public final void h(@Y61.l Long l12, @Y61.l MessengerStatsdEventFactory.Companion.ChannelType channelType) {
        if (l12 == null || channelType == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l12.longValue();
        Iterator<T> it = this.f188313b.c(MessengerStatsdEventFactory.Companion.Scenario.f187067i, channelType, jCurrentTimeMillis).iterator();
        while (it.hasNext()) {
            this.f188314c.c((com.avito.android.analytics.statsd.y) it.next());
        }
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.z0
    public final void i(@Y61.l Long l12) {
        if (l12 != null) {
            MessengerStatsdEventFactory.Companion.Screen screen = MessengerStatsdEventFactory.Companion.Screen.f187071c;
            MessengerStatsdEventFactory.Companion.Scenario scenario = MessengerStatsdEventFactory.Companion.Scenario.f187061c;
            MessengerStatsdEventFactory.Companion.Step[] stepArr = MessengerStatsdEventFactory.Companion.Step.f187076b;
            long jNow = this.f188315d.now() - l12.longValue();
            MessengerStatsdEventFactory messengerStatsdEventFactory = this.f188313b;
            messengerStatsdEventFactory.getClass();
            this.f188314c.c(new y.c(messengerStatsdEventFactory.e(new String[]{"performance", "channel", "scenario", "message_send", "step", "init_to_request", "app_version_placeholder", "network_type_placeholder"}, false), Long.valueOf(jNow), null));
        }
    }
}
