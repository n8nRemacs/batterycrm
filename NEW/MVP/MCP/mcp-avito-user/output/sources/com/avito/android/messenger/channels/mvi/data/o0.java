package com.avito.android.messenger.channels.mvi.data;

import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: UserRepo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/o0;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface o0 {
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k ArrayList arrayList);

    @Y61.k
    AbstractC41768a c(@Y61.l Long l12, @Y61.l Long l13, @Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r f(@Y61.k Collection collection);
}
