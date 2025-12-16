package com.avito.android.messenger;

import kotlin.Metadata;

/* compiled from: NetworkMonitorImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/k0;", "Lru/avito/messenger/r0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k0 implements ru.avito.messenger.r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f196424a;

    public k0(@Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f196424a = aVar;
    }

    @Override // ru.avito.messenger.r0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> a() {
        return this.f196424a.d();
    }
}
