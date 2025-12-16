package com.avito.android.messenger.search.di;

import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.messenger.B;
import com.avito.android.messenger.G;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31857r0;
import com.avito.android.messenger.di.X0;
import com.avito.android.messenger.w0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import java.util.Locale;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelsSearchFragmentComponentDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/di/b;", "Lcom/avito/android/di/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b extends InterfaceC29971h {
    @Y61.k
    X0 B0();

    @Y61.k
    C30277e1 C();

    @Y61.k
    B L1();

    @Y61.k
    InterfaceC32572u U8();

    @Y61.k
    MessengerDatabase W0();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    InterfaceC47842z d0();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    Context g();

    @Y61.k
    C j();

    @Y61.k
    G j1();

    @Y61.k
    w0 k0();

    @Y61.k
    com.avito.android.server_time.f l();

    @Y61.k
    Locale locale();

    @Y61.k
    InterfaceC35741a1 n();

    @Y61.k
    InterfaceC31857r0 q7();
}
