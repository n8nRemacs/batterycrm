package ru.avito.messenger.internal.socket_events;

import Y61.k;
import com.avito.android.remote.model.RawJson;
import io.reactivex.rxjava3.internal.operators.single.O;
import javax.inject.Inject;
import kotlin.Metadata;
import nx0.InterfaceC44488b;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: SocketEventApiImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/socket_events/b;", "Lnx0/b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b implements InterfaceC44488b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC47842z f431767a;

    @Inject
    public b(@k InterfaceC47842z interfaceC47842z) {
        this.f431767a = interfaceC47842z;
    }

    @Override // nx0.InterfaceC44488b
    @k
    public final O a(@k String str) {
        return this.f431767a.callMethod("subscribeV2", new RawJson(str)).r(a.f431766b);
    }
}
