package com.avito.android.messenger.di;

import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.messenger.conversation.mvi.data.C32020i;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: IncompleteMessageLoaderDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/di/C0;", "Lcom/avito/android/di/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface C0 extends InterfaceC29971h {
    @Y61.k
    C30277e1 C();

    @Y61.k
    com.avito.android.messenger.B L1();

    @Y61.k
    MessengerDatabase W0();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    InterfaceC47842z d0();

    @Y61.k
    Context g();

    @Y61.k
    C32020i p1();
}
