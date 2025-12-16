package ru.rustore.sdk.reactive.single;

import kotlin.C42833p;
import kotlin.Metadata;
import ru.rustore.sdk.reactive.core.CompositeException;

/* compiled from: SingleMapError.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/single/w;", "T", "Lru/rustore/sdk/reactive/single/a;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class w<T> extends AbstractC47905a<T> {

    /* compiled from: SingleMapError.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"ru/rustore/sdk/reactive/single/w$a", "Lru/rustore/sdk/reactive/single/B;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements B<T> {
        public a() {
            throw null;
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            throw null;
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                new CompositeException(C42833p.b(th3), th2);
                throw null;
            }
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void onSuccess(T t12) {
            throw null;
        }
    }

    @Override // ru.rustore.sdk.reactive.single.AbstractC47905a
    public final void a(@Y61.k B<T> b12) {
        throw null;
    }
}
