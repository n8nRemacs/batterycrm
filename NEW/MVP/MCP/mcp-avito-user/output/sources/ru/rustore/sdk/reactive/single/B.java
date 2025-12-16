package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;

/* compiled from: SingleObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/single/B;", "T", "", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface B<T> {
    void a(@Y61.k ru.rustore.sdk.reactive.core.g gVar);

    void onError(@Y61.k Throwable th2);

    void onSuccess(T t12);
}
