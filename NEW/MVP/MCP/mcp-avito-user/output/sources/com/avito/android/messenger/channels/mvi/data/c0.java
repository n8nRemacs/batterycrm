package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.c3;
import com.avito.android.remote.model.User;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: UserEntityConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/c0;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c0 {
    @Y61.k
    c3 a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k User user);

    @Y61.k
    User b(@Y61.k c3 c3Var);
}
