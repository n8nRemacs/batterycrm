package com.avito.android.messenger.conversation.create.di;

import Y61.k;
import Zd.InterfaceC19542a;
import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.mvi.data.C31694b;
import com.avito.android.messenger.channels.mvi.data.C31707o;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker;
import com.avito.android.messenger.conversation.mvi.data.C32020i;
import com.avito.android.messenger.w0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;

/* compiled from: CreateChannelFragmentDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/create/di/b;", "Lcom/avito/android/di/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b extends InterfaceC29971h {
    @k
    C30277e1 C();

    @k
    ChannelSyncAgent L6();

    @k
    C31707o P3();

    @k
    MessengerSuccessRateTracker Q7();

    @k
    MessengerDatabase W0();

    @k
    InterfaceC28373a a();

    @k
    InterfaceC35745a5 d();

    @k
    Context g();

    @k
    w0 k0();

    @k
    C32020i p1();

    @k
    InterfaceC19542a x();

    @k
    InterfaceC32572u x0();

    @k
    C31694b x3();
}
