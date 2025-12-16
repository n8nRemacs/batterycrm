package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ObservableObserveOn.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/observable/I;", "T", "Lru/rustore/sdk/reactive/observable/c;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class I<T> extends AbstractC47883c<T> {

    /* compiled from: ObservableObserveOn.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/observable/I$a", "Lru/rustore/sdk/reactive/observable/K;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements K<T>, ru.rustore.sdk.reactive.core.g {
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            throw null;
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            throw null;
        }

        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onComplete() {
            throw null;
        }

        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onNext(T t12) {
            throw null;
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.AbstractC47883c
    public final void a(@Y61.k K<T> k12) {
        throw new NoWhenBranchMatchedException();
    }
}
