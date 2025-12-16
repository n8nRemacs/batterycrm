package com.avito.android.messenger.map.sharing;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.messenger.message.MessageBody;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.Metadata;

/* compiled from: SharingMapInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/s;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface s {
    @Y61.k
    B0 b();

    @Y61.k
    io.reactivex.rxjava3.core.I<MessageBody.Location> c(@Y61.k AvitoMapPoint avitoMapPoint);
}
