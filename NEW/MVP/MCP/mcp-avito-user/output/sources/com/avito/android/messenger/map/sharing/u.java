package com.avito.android.messenger.map.sharing;

import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.messenger.message.MessageBody;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: SharingMapInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/u;", "Lcom/avito/android/messenger/map/sharing/s;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f196751a;

    @Inject
    public u(@Y61.k InterfaceC47842z interfaceC47842z) {
        this.f196751a = interfaceC47842z;
    }

    @Override // com.avito.android.messenger.map.sharing.s
    @Y61.k
    public final B0 b() {
        return this.f196751a.A().d0(t.f196750b);
    }

    @Override // com.avito.android.messenger.map.sharing.s
    @Y61.k
    public final io.reactivex.rxjava3.core.I<MessageBody.Location> c(@Y61.k AvitoMapPoint avitoMapPoint) {
        return this.f196751a.e(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude());
    }
}
