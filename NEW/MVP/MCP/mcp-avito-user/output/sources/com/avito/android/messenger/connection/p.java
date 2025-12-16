package com.avito.android.messenger.connection;

import androidx.compose.runtime.internal.P;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.core.I;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.rx3.y;
import ru.avito.messenger.InterfaceC47734d0;

/* compiled from: MessengerUserParamsNetworkErrorRefresher.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/connection/p;", "Lru/avito/messenger/d0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements InterfaceC47734d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f188871a;

    public p(@Y61.k InterfaceC41196a interfaceC41196a) {
        this.f188871a = interfaceC41196a;
    }

    @Override // ru.avito.messenger.InterfaceC47734d0
    @Y61.k
    public final I<Boolean> a() {
        InterfaceC41196a interfaceC41196a = this.f188871a;
        return L.f(interfaceC41196a.a(), InterfaceC42451b.C11596b.f405967a) ? y.b(interfaceC41196a.o()).S().u(new com.avito.android.analytics.clickstream.I(5)) : I.q(Boolean.FALSE);
    }
}
