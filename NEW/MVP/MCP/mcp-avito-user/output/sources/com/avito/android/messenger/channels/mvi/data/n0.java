package com.avito.android.messenger.channels.mvi.data;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: UserRepo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/n0;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface n0 {
    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.O b(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.core.z<List<String>> d(long j12, @Y61.k Collection<String> collection);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.O e(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k Set set);
}
