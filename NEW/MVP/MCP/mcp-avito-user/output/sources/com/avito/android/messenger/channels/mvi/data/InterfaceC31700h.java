package com.avito.android.messenger.channels.mvi.data;

import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelMetaInfoRepo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/h;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.data.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC31700h {
    @Y61.k
    B0 a(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r b(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.core.z<List<String>> c(@Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    B0 d(@Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    C41826q e(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r f(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);
}
