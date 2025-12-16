package com.avito.android.remote.analytics.messenger;

import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import j.InterfaceC42148d;
import kotlin.Metadata;

/* compiled from: MessengerNetworkResponsesRelay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/messenger/j;", "", "a", "b", "_avito_messenger_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface j {

    /* compiled from: MessengerNetworkResponsesRelay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/messenger/j$a;", "", "_avito_messenger_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f253216a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Throwable f253217b;

        public a(@Y61.k String str, @Y61.k Throwable th2) {
            this.f253216a = str;
            this.f253217b = th2;
        }
    }

    @Y61.k
    z<a> a();

    @InterfaceC42148d
    void b(@Y61.k String str, @Y61.k Throwable th2);

    /* compiled from: MessengerNetworkResponsesRelay.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/messenger/j$b;", "Lcom/avito/android/remote/analytics/messenger/j;", "<init>", "()V", "_avito_messenger_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f253218a = new b();

        @Override // com.avito.android.remote.analytics.messenger.j
        @Y61.k
        public final z<a> a() {
            return U.f403867b;
        }

        @Override // com.avito.android.remote.analytics.messenger.j
        public final void b(@Y61.k String str, @Y61.k Throwable th2) {
        }
    }
}
